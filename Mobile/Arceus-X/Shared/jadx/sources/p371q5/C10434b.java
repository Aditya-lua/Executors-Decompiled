package p371q5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p504w1.C12277a;

/* JADX INFO: renamed from: q5.b */
/* JADX INFO: loaded from: classes.dex */
public class C10434b extends AbstractC10433a {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f37608d;

    /* JADX INFO: renamed from: e */
    public final Parcel f37609e;

    /* JADX INFO: renamed from: f */
    public final int f37610f;

    /* JADX INFO: renamed from: g */
    public final int f37611g;

    /* JADX INFO: renamed from: h */
    public final String f37612h;

    /* JADX INFO: renamed from: i */
    public int f37613i;

    /* JADX INFO: renamed from: j */
    public int f37614j;

    /* JADX INFO: renamed from: k */
    public int f37615k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C10434b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C12277a(), new C12277a(), new C12277a());
    }

    @Override // p371q5.AbstractC10433a
    /* JADX INFO: renamed from: A */
    public void mo40146A(byte[] bArr) {
        if (bArr == null) {
            this.f37609e.writeInt(-1);
        } else {
            this.f37609e.writeInt(bArr.length);
            this.f37609e.writeByteArray(bArr);
        }
    }

    @Override // p371q5.AbstractC10433a
    /* JADX INFO: renamed from: C */
    public void mo40148C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f37609e, 0);
    }

    @Override // p371q5.AbstractC10433a
    /* JADX INFO: renamed from: E */
    public void mo40150E(int i10) {
        this.f37609e.writeInt(i10);
    }

    @Override // p371q5.AbstractC10433a
    /* JADX INFO: renamed from: G */
    public void mo40152G(Parcelable parcelable) {
        this.f37609e.writeParcelable(parcelable, 0);
    }

    @Override // p371q5.AbstractC10433a
    /* JADX INFO: renamed from: I */
    public void mo40154I(String str) {
        this.f37609e.writeString(str);
    }

    @Override // p371q5.AbstractC10433a
    /* JADX INFO: renamed from: a */
    public void mo40160a() {
        int i10 = this.f37613i;
        if (i10 >= 0) {
            int i11 = this.f37608d.get(i10);
            int iDataPosition = this.f37609e.dataPosition();
            this.f37609e.setDataPosition(i11);
            this.f37609e.writeInt(iDataPosition - i11);
            this.f37609e.setDataPosition(iDataPosition);
        }
    }

    @Override // p371q5.AbstractC10433a
    /* JADX INFO: renamed from: b */
    public AbstractC10433a mo40161b() {
        Parcel parcel = this.f37609e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f37614j;
        if (i10 == this.f37610f) {
            i10 = this.f37611g;
        }
        return new C10434b(parcel, iDataPosition, i10, this.f37612h + "  ", this.f37605a, this.f37606b, this.f37607c);
    }

    @Override // p371q5.AbstractC10433a
    /* JADX INFO: renamed from: g */
    public boolean mo40166g() {
        return this.f37609e.readInt() != 0;
    }

    @Override // p371q5.AbstractC10433a
    /* JADX INFO: renamed from: i */
    public byte[] mo40168i() {
        int i10 = this.f37609e.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        this.f37609e.readByteArray(bArr);
        return bArr;
    }

    @Override // p371q5.AbstractC10433a
    /* JADX INFO: renamed from: k */
    public CharSequence mo40170k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f37609e);
    }

    @Override // p371q5.AbstractC10433a
    /* JADX INFO: renamed from: m */
    public boolean mo40172m(int i10) {
        while (this.f37614j < this.f37611g) {
            int i11 = this.f37615k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f37609e.setDataPosition(this.f37614j);
            int i12 = this.f37609e.readInt();
            this.f37615k = this.f37609e.readInt();
            this.f37614j += i12;
        }
        return this.f37615k == i10;
    }

    @Override // p371q5.AbstractC10433a
    /* JADX INFO: renamed from: o */
    public int mo40174o() {
        return this.f37609e.readInt();
    }

    @Override // p371q5.AbstractC10433a
    /* JADX INFO: renamed from: q */
    public <T extends Parcelable> T mo40176q() {
        return (T) this.f37609e.readParcelable(getClass().getClassLoader());
    }

    @Override // p371q5.AbstractC10433a
    /* JADX INFO: renamed from: s */
    public String mo40178s() {
        return this.f37609e.readString();
    }

    @Override // p371q5.AbstractC10433a
    /* JADX INFO: renamed from: w */
    public void mo40182w(int i10) {
        mo40160a();
        this.f37613i = i10;
        this.f37608d.put(i10, this.f37609e.dataPosition());
        mo40150E(0);
        mo40150E(i10);
    }

    @Override // p371q5.AbstractC10433a
    /* JADX INFO: renamed from: y */
    public void mo40184y(boolean z10) {
        this.f37609e.writeInt(z10 ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10434b(Parcel parcel, int i10, int i11, String str, C12277a<String, Method> c12277a, C12277a<String, Method> c12277a2, C12277a<String, Class> c12277a3) {
        super(c12277a, c12277a2, c12277a3);
        this.f37608d = new SparseIntArray();
        this.f37613i = -1;
        this.f37615k = -1;
        this.f37609e = parcel;
        this.f37610f = i10;
        this.f37611g = i11;
        this.f37614j = i10;
        this.f37612h = str;
    }
}
