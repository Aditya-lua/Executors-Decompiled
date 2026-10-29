package com.roblox.client.captcha;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import sg.C11295a1;

/* JADX INFO: loaded from: classes2.dex */
public class LoginCaptchaConfig implements CaptchaConfig {
    public static final Parcelable.Creator<LoginCaptchaConfig> CREATOR = new C3162a();

    /* JADX INFO: renamed from: a */
    public String f11721a;

    /* JADX INFO: renamed from: b */
    public String f11722b;

    /* JADX INFO: renamed from: com.roblox.client.captcha.LoginCaptchaConfig$a */
    public class C3162a implements Parcelable.Creator<LoginCaptchaConfig> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoginCaptchaConfig createFromParcel(Parcel parcel) {
            return new LoginCaptchaConfig(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LoginCaptchaConfig[] newArray(int i10) {
            return new LoginCaptchaConfig[i10];
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.captcha.LoginCaptchaConfig$b */
    public static /* synthetic */ class C3163b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11723a;

        static {
            int[] iArr = new int[EnumC3164c.values().length];
            f11723a = iArr;
            try {
                iArr[EnumC3164c.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11723a[EnumC3164c.PHONE_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11723a[EnumC3164c.USERNAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.captcha.LoginCaptchaConfig$c */
    public enum EnumC3164c {
        USERNAME,
        EMAIL,
        PHONE_NUMBER
    }

    /* JADX INFO: renamed from: a */
    public static String m15048a(EnumC3164c enumC3164c) {
        int i10 = C3163b.f11723a[enumC3164c.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? "username" : "phonenumber";
        }
        return NotificationCompat.CATEGORY_EMAIL;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.roblox.client.captcha.CaptchaConfig
    public String getUrl() {
        return C11295a1.m42468p(this.f11721a, this.f11722b);
    }

    public String toString() {
        return "CredentialType: " + this.f11721a + ". CredentialValue: " + this.f11722b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11721a);
        parcel.writeString(this.f11722b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public LoginCaptchaConfig(EnumC3164c enumC3164c, String str) {
        this.f11721a = m15048a(enumC3164c);
        this.f11722b = str;
    }

    public LoginCaptchaConfig(Parcel parcel) {
        this.f11721a = parcel.readString();
        this.f11722b = parcel.readString();
    }
}
