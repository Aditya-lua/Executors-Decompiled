package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import ca.l;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.common.Transport;
import eb.h1;
import eb.m3;
import eb.p3;
import java.util.List;
import n9.k;
import n9.m;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final PublicKeyCredentialType f5995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final m3 f5996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f5997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h1 f5994i = h1.p(p3.f15328a, p3.b);

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR = new l();

    public PublicKeyCredentialDescriptor(String str, m3 m3Var, List<Transport> list) {
        m.l(str);
        try {
            this.f5995f = PublicKeyCredentialType.a(str);
            this.f5996g = (m3) m.l(m3Var);
            this.f5997h = list;
        } catch (PublicKeyCredentialType.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @NonNull
    public static PublicKeyCredentialDescriptor y3(@NonNull JSONObject jSONObject) {
        return new PublicKeyCredentialDescriptor(jSONObject.getString(Payload.TYPE), Base64.decode(jSONObject.getString("id"), 11), jSONObject.has("transports") ? Transport.j(jSONObject.getJSONArray("transports")) : null);
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        if (!this.f5995f.equals(publicKeyCredentialDescriptor.f5995f) || !k.b(this.f5996g, publicKeyCredentialDescriptor.f5996g)) {
            return false;
        }
        List list2 = this.f5997h;
        if (list2 == null && publicKeyCredentialDescriptor.f5997h == null) {
            return true;
        }
        return list2 != null && (list = publicKeyCredentialDescriptor.f5997h) != null && list2.containsAll(list) && publicKeyCredentialDescriptor.f5997h.containsAll(this.f5997h);
    }

    public int hashCode() {
        return k.c(this.f5995f, this.f5996g, this.f5997h);
    }

    @NonNull
    public final String toString() {
        return "PublicKeyCredentialDescriptor{\n type=" + String.valueOf(this.f5995f) + ", \n id=" + u9.c.b(v3()) + ", \n transports=" + String.valueOf(this.f5997h) + "}";
    }

    @NonNull
    public byte[] v3() {
        return this.f5996g.p();
    }

    public List<Transport> w3() {
        return this.f5997h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.v(parcel, 2, x3(), false);
        o9.b.g(parcel, 3, v3(), false);
        o9.b.z(parcel, 4, w3(), false);
        o9.b.b(parcel, iA);
    }

    @NonNull
    public String x3() {
        return this.f5995f.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PublicKeyCredentialDescriptor(@NonNull String str, @NonNull byte[] bArr, List<Transport> list) {
        this(str, m3.m(bArr, 0, bArr.length), list);
        m3 m3Var = m3.b;
    }
}
