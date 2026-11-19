package r5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.github.luben.zstd.BuildConfig;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f30550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f30551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f30552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f30553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f30554h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f30555i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f30556j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30557k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), BuildConfig.FLAVOR, new w1.a(), new w1.a(), new w1.a());
    }

    @Override // r5.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f30551e.writeInt(-1);
        } else {
            this.f30551e.writeInt(bArr.length);
            this.f30551e.writeByteArray(bArr);
        }
    }

    @Override // r5.a
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f30551e, 0);
    }

    @Override // r5.a
    public void E(int i10) {
        this.f30551e.writeInt(i10);
    }

    @Override // r5.a
    public void G(Parcelable parcelable) {
        this.f30551e.writeParcelable(parcelable, 0);
    }

    @Override // r5.a
    public void I(String str) {
        this.f30551e.writeString(str);
    }

    @Override // r5.a
    public void a() {
        int i10 = this.f30555i;
        if (i10 >= 0) {
            int i11 = this.f30550d.get(i10);
            int iDataPosition = this.f30551e.dataPosition();
            this.f30551e.setDataPosition(i11);
            this.f30551e.writeInt(iDataPosition - i11);
            this.f30551e.setDataPosition(iDataPosition);
        }
    }

    @Override // r5.a
    public a b() {
        Parcel parcel = this.f30551e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f30556j;
        if (i10 == this.f30552f) {
            i10 = this.f30553g;
        }
        return new b(parcel, iDataPosition, i10, this.f30554h + "  ", this.f30548a, this.b, this.f30549c);
    }

    @Override // r5.a
    public boolean g() {
        return this.f30551e.readInt() != 0;
    }

    @Override // r5.a
    public byte[] i() {
        int i10 = this.f30551e.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        this.f30551e.readByteArray(bArr);
        return bArr;
    }

    @Override // r5.a
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f30551e);
    }

    @Override // r5.a
    public boolean m(int i10) {
        while (this.f30556j < this.f30553g) {
            int i11 = this.f30557k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f30551e.setDataPosition(this.f30556j);
            int i12 = this.f30551e.readInt();
            this.f30557k = this.f30551e.readInt();
            this.f30556j += i12;
        }
        return this.f30557k == i10;
    }

    @Override // r5.a
    public int o() {
        return this.f30551e.readInt();
    }

    @Override // r5.a
    public <T extends Parcelable> T q() {
        return (T) this.f30551e.readParcelable(getClass().getClassLoader());
    }

    @Override // r5.a
    public String s() {
        return this.f30551e.readString();
    }

    @Override // r5.a
    public void w(int i10) {
        a();
        this.f30555i = i10;
        this.f30550d.put(i10, this.f30551e.dataPosition());
        E(0);
        E(i10);
    }

    @Override // r5.a
    public void y(boolean z10) {
        this.f30551e.writeInt(z10 ? 1 : 0);
    }

    public b(Parcel parcel, int i10, int i11, String str, w1.a<String, Method> aVar, w1.a<String, Method> aVar2, w1.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f30550d = new SparseIntArray();
        this.f30555i = -1;
        this.f30557k = -1;
        this.f30551e = parcel;
        this.f30552f = i10;
        this.f30553g = i11;
        this.f30556j = i10;
        this.f30554h = str;
    }
}
