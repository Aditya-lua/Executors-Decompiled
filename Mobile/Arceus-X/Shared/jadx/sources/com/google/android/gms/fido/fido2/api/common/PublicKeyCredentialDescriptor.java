package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import ca.C1599l;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.List;
import org.json.JSONObject;
import p100eb.AbstractC4938h1;
import p100eb.AbstractC4970m3;
import p100eb.C4988p3;
import p305n9.C8947k;
import p305n9.C8953m;
import p325o9.C9718b;
import p462u9.C11812c;

/* JADX INFO: loaded from: classes.dex */
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: f */
    @NonNull
    public final PublicKeyCredentialType f7694f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AbstractC4970m3 f7695g;

    /* JADX INFO: renamed from: h */
    public final List f7696h;

    /* JADX INFO: renamed from: i */
    public static final AbstractC4938h1 f7693i = AbstractC4938h1.m23610p(C4988p3.f19733a, C4988p3.f19734b);

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR = new C1599l();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PublicKeyCredentialDescriptor(String str, AbstractC4970m3 abstractC4970m3, List<Transport> list) {
        C8953m.m36047l(str);
        try {
            this.f7694f = PublicKeyCredentialType.m9341a(str);
            this.f7695g = (AbstractC4970m3) C8953m.m36047l(abstractC4970m3);
            this.f7696h = list;
        } catch (PublicKeyCredentialType.C1927a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: y3 */
    public static PublicKeyCredentialDescriptor m9333y3(@NonNull JSONObject jSONObject) {
        return new PublicKeyCredentialDescriptor(jSONObject.getString(Payload.TYPE), Base64.decode(jSONObject.getString("id"), 11), jSONObject.has("transports") ? Transport.m9249j(jSONObject.getJSONArray("transports")) : null);
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        if (!this.f7694f.equals(publicKeyCredentialDescriptor.f7694f) || !C8947k.m36026b(this.f7695g, publicKeyCredentialDescriptor.f7695g)) {
            return false;
        }
        List list2 = this.f7696h;
        if (list2 == null && publicKeyCredentialDescriptor.f7696h == null) {
            return true;
        }
        return list2 != null && (list = publicKeyCredentialDescriptor.f7696h) != null && list2.containsAll(list) && publicKeyCredentialDescriptor.f7696h.containsAll(this.f7696h);
    }

    public int hashCode() {
        return C8947k.m36027c(this.f7694f, this.f7695g, this.f7696h);
    }

    @NonNull
    public final String toString() {
        return "PublicKeyCredentialDescriptor{\n type=" + String.valueOf(this.f7694f) + ", \n id=" + C11812c.m44172b(m9334v3()) + ", \n transports=" + String.valueOf(this.f7696h) + "}";
    }

    @NonNull
    /* JADX INFO: renamed from: v3 */
    public byte[] m9334v3() {
        return this.f7695g.m23675p();
    }

    /* JADX INFO: renamed from: w3 */
    public List<Transport> m9335w3() {
        return this.f7696h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 2, m9336x3(), false);
        C9718b.m38463g(parcel, 3, m9334v3(), false);
        C9718b.m38482z(parcel, 4, m9335w3(), false);
        C9718b.m38458b(parcel, iM38457a);
    }

    @NonNull
    /* JADX INFO: renamed from: x3 */
    public String m9336x3() {
        return this.f7694f.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PublicKeyCredentialDescriptor(@NonNull String str, @NonNull byte[] bArr, List<Transport> list) {
        this(str, AbstractC4970m3.m23673m(bArr, 0, bArr.length), list);
        AbstractC4970m3 abstractC4970m3 = AbstractC4970m3.f19698b;
    }
}
