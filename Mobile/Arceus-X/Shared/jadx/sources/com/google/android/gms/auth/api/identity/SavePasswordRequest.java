package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8947k;
import p305n9.C8953m;
import p325o9.C9718b;
import p598z8.C13745i;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SavePasswordRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new C13745i();

    /* JADX INFO: renamed from: f */
    public final SignInPassword f7270f;

    /* JADX INFO: renamed from: g */
    public final String f7271g;

    /* JADX INFO: renamed from: h */
    public final int f7272h;

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.identity.SavePasswordRequest$a */
    @Deprecated
    public static final class C1879a {

        /* JADX INFO: renamed from: a */
        public SignInPassword f7273a;

        /* JADX INFO: renamed from: b */
        public String f7274b;

        /* JADX INFO: renamed from: c */
        public int f7275c;

        @NonNull
        /* JADX INFO: renamed from: a */
        public SavePasswordRequest m9047a() {
            return new SavePasswordRequest(this.f7273a, this.f7274b, this.f7275c);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C1879a m9048b(@NonNull SignInPassword signInPassword) {
            this.f7273a = signInPassword;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public final C1879a m9049c(@NonNull String str) {
            this.f7274b = str;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public final C1879a m9050d(int i10) {
            this.f7275c = i10;
            return this;
        }
    }

    public SavePasswordRequest(SignInPassword signInPassword, String str, int i10) {
        this.f7270f = (SignInPassword) C8953m.m36047l(signInPassword);
        this.f7271g = str;
        this.f7272h = i10;
    }

    @NonNull
    /* JADX INFO: renamed from: v3 */
    public static C1879a m9044v3() {
        return new C1879a();
    }

    @NonNull
    /* JADX INFO: renamed from: x3 */
    public static C1879a m9045x3(@NonNull SavePasswordRequest savePasswordRequest) {
        C8953m.m36047l(savePasswordRequest);
        C1879a c1879aM9044v3 = m9044v3();
        c1879aM9044v3.m9048b(savePasswordRequest.m9046w3());
        c1879aM9044v3.m9050d(savePasswordRequest.f7272h);
        String str = savePasswordRequest.f7271g;
        if (str != null) {
            c1879aM9044v3.m9049c(str);
        }
        return c1879aM9044v3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        return C8947k.m36026b(this.f7270f, savePasswordRequest.f7270f) && C8947k.m36026b(this.f7271g, savePasswordRequest.f7271g) && this.f7272h == savePasswordRequest.f7272h;
    }

    public int hashCode() {
        return C8947k.m36027c(this.f7270f, this.f7271g);
    }

    @NonNull
    /* JADX INFO: renamed from: w3 */
    public SignInPassword m9046w3() {
        return this.f7270f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38476t(parcel, 1, m9046w3(), i10, false);
        C9718b.m38478v(parcel, 2, this.f7271g, false);
        C9718b.m38470n(parcel, 3, this.f7272h);
        C9718b.m38458b(parcel, iM38457a);
    }
}
