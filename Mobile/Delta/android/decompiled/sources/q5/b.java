package q5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f29220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f29221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f29222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f29223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f29224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f29225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f29226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f29227k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new w1.a(), new w1.a(), new w1.a());
    }

    @Override // q5.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f29221e.writeInt(-1);
        } else {
            this.f29221e.writeInt(bArr.length);
            this.f29221e.writeByteArray(bArr);
        }
    }

    @Override // q5.a
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f29221e, 0);
    }

    @Override // q5.a
    public void E(int i10) {
        this.f29221e.writeInt(i10);
    }

    @Override // q5.a
    public void G(Parcelable parcelable) {
        this.f29221e.writeParcelable(parcelable, 0);
    }

    @Override // q5.a
    public void I(String str) {
        this.f29221e.writeString(str);
    }

    @Override // q5.a
    public void a() {
        int i10 = this.f29225i;
        if (i10 >= 0) {
            int i11 = this.f29220d.get(i10);
            int iDataPosition = this.f29221e.dataPosition();
            this.f29221e.setDataPosition(i11);
            this.f29221e.writeInt(iDataPosition - i11);
            this.f29221e.setDataPosition(iDataPosition);
        }
    }

    @Override // q5.a
    public a b() {
        Parcel parcel = this.f29221e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f29226j;
        if (i10 == this.f29222f) {
            i10 = this.f29223g;
        }
        return new b(parcel, iDataPosition, i10, this.f29224h + "  ", this.f29218a, this.b, this.f29219c);
    }

    @Override // q5.a
    public boolean g() {
        return this.f29221e.readInt() != 0;
    }

    @Override // q5.a
    public byte[] i() {
        int i10 = this.f29221e.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        this.f29221e.readByteArray(bArr);
        return bArr;
    }

    @Override // q5.a
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f29221e);
    }

    @Override // q5.a
    public boolean m(int i10) {
        while (this.f29226j < this.f29223g) {
            int i11 = this.f29227k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f29221e.setDataPosition(this.f29226j);
            int i12 = this.f29221e.readInt();
            this.f29227k = this.f29221e.readInt();
            this.f29226j += i12;
        }
        return this.f29227k == i10;
    }

    @Override // q5.a
    public int o() {
        return this.f29221e.readInt();
    }

    @Override // q5.a
    public <T extends Parcelable> T q() {
        return (T) this.f29221e.readParcelable(getClass().getClassLoader());
    }

    @Override // q5.a
    public String s() {
        return this.f29221e.readString();
    }

    @Override // q5.a
    public void w(int i10) {
        a();
        this.f29225i = i10;
        this.f29220d.put(i10, this.f29221e.dataPosition());
        E(0);
        E(i10);
    }

    @Override // q5.a
    public void y(boolean z10) {
        this.f29221e.writeInt(z10 ? 1 : 0);
    }

    public b(Parcel parcel, int i10, int i11, String str, w1.a<String, Method> aVar, w1.a<String, Method> aVar2, w1.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f29220d = new SparseIntArray();
        this.f29225i = -1;
        this.f29227k = -1;
        this.f29221e = parcel;
        this.f29222f = i10;
        this.f29223g = i11;
        this.f29226j = i10;
        this.f29224h = str;
    }
}
