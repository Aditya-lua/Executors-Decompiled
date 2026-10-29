package com.roblox.client.captcha;

import android.os.Parcel;
import android.os.Parcelable;
import sg.C11295a1;

/* JADX INFO: loaded from: classes2.dex */
public class SignUpCaptchaConfig implements CaptchaConfig {
    public static final Parcelable.Creator<SignUpCaptchaConfig> CREATOR = new C3165a();

    /* JADX INFO: renamed from: com.roblox.client.captcha.SignUpCaptchaConfig$a */
    public class C3165a implements Parcelable.Creator<SignUpCaptchaConfig> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SignUpCaptchaConfig createFromParcel(Parcel parcel) {
            return new SignUpCaptchaConfig();
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SignUpCaptchaConfig[] newArray(int i10) {
            return new SignUpCaptchaConfig[i10];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.roblox.client.captcha.CaptchaConfig
    public String getUrl() {
        return C11295a1.m42470q();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
    }
}
