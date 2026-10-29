package al;

import com.roblox.platform.NoObfuscate;

/* JADX INFO: renamed from: al.d */
/* JADX INFO: loaded from: classes2.dex */
public class C0359d implements NoObfuscate {
    public boolean authorizeForUser;
    public String deviceName;
    public String notificationToken;
    public String oldNotificationToken;

    public C0359d(String str, boolean z10, String str2, String str3) {
        this.notificationToken = str;
        this.authorizeForUser = z10;
        this.oldNotificationToken = str2;
        this.deviceName = str3;
    }
}
