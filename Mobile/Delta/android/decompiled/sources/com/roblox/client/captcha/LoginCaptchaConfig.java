package com.roblox.client.captcha;

import android.os.Parcel;
import android.os.Parcelable;
import sg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class LoginCaptchaConfig implements CaptchaConfig {
    public static final Parcelable.Creator<LoginCaptchaConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f8977a;
    public String b;

    public class a implements Parcelable.Creator<LoginCaptchaConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoginCaptchaConfig createFromParcel(Parcel parcel) {
            return new LoginCaptchaConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LoginCaptchaConfig[] newArray(int i10) {
            return new LoginCaptchaConfig[i10];
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8978a;

        static {
            int[] iArr = new int[c.values().length];
            f8978a = iArr;
            try {
                iArr[c.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8978a[c.PHONE_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8978a[c.USERNAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum c {
        USERNAME,
        EMAIL,
        PHONE_NUMBER
    }

    public static String a(c cVar) {
        int i10 = b.f8978a[cVar.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? "username" : "phonenumber";
        }
        return "email";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.roblox.client.captcha.CaptchaConfig
    public String getUrl() {
        return a1.p(this.f8977a, this.b);
    }

    public String toString() {
        return "CredentialType: " + this.f8977a + ". CredentialValue: " + this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8977a);
        parcel.writeString(this.b);
    }

    public LoginCaptchaConfig(c cVar, String str) {
        this.f8977a = a(cVar);
        this.b = str;
    }

    public LoginCaptchaConfig(Parcel parcel) {
        this.f8977a = parcel.readString();
        this.b = parcel.readString();
    }
}
