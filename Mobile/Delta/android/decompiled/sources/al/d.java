package al;

import com.roblox.platform.NoObfuscate;

/* JADX INFO: loaded from: classes2.dex */
public class d implements NoObfuscate {
    public boolean authorizeForUser;
    public String deviceName;
    public String notificationToken;
    public String oldNotificationToken;

    public d(String str, boolean z10, String str2, String str3) {
        this.notificationToken = str;
        this.authorizeForUser = z10;
        this.oldNotificationToken = str2;
        this.deviceName = str3;
    }
}
