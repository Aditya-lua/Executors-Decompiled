package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.C1602o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p100eb.AbstractC4970m3;
import p305n9.C8947k;
import p305n9.C8953m;
import p325o9.C9718b;
import p462u9.C11812c;

/* JADX INFO: loaded from: classes.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new C1602o();

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AbstractC4970m3 f7705f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final String f7706g;

    /* JADX INFO: renamed from: h */
    public final String f7707h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final String f7708i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PublicKeyCredentialUserEntity(AbstractC4970m3 abstractC4970m3, String str, String str2, String str3) {
        this.f7705f = (AbstractC4970m3) C8953m.m36047l(abstractC4970m3);
        this.f7706g = (String) C8953m.m36047l(str);
        this.f7707h = str2;
        this.f7708i = (String) C8953m.m36047l(str3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return C8947k.m36026b(this.f7705f, publicKeyCredentialUserEntity.f7705f) && C8947k.m36026b(this.f7706g, publicKeyCredentialUserEntity.f7706g) && C8947k.m36026b(this.f7707h, publicKeyCredentialUserEntity.f7707h) && C8947k.m36026b(this.f7708i, publicKeyCredentialUserEntity.f7708i);
    }

    @NonNull
    public String getName() {
        return this.f7706g;
    }

    public int hashCode() {
        return C8947k.m36027c(this.f7705f, this.f7706g, this.f7707h, this.f7708i);
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public String m9342l() {
        return this.f7708i;
    }

    @NonNull
    public final String toString() {
        return "PublicKeyCredentialUserEntity{\n id=" + C11812c.m44172b(this.f7705f.m23675p()) + ", \n name='" + this.f7706g + "', \n icon='" + this.f7707h + "', \n displayName='" + this.f7708i + "'}";
    }

    /* JADX INFO: renamed from: v3 */
    public String m9343v3() {
        return this.f7707h;
    }

    @NonNull
    /* JADX INFO: renamed from: w3 */
    public byte[] m9344w3() {
        return this.f7705f.m23675p();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38463g(parcel, 2, m9344w3(), false);
        C9718b.m38478v(parcel, 3, getName(), false);
        C9718b.m38478v(parcel, 4, m9343v3(), false);
        C9718b.m38478v(parcel, 5, m9342l(), false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PublicKeyCredentialUserEntity(@NonNull byte[] bArr, @NonNull String str, String str2, @NonNull String str3) {
        byte[] bArr2 = (byte[]) C8953m.m36047l(bArr);
        AbstractC4970m3 abstractC4970m3 = AbstractC4970m3.f19698b;
        this(AbstractC4970m3.m23673m(bArr2, 0, bArr2.length), str, str2, str3);
    }
}
