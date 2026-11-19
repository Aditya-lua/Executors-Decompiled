package lh;

import android.os.Parcel;
import android.os.Parcelable;
import bh.a1;

/* JADX INFO: loaded from: classes2.dex */
public class b implements lh.a {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f22156a;
    public String b;

    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* JADX INFO: renamed from: lh.b$b, reason: collision with other inner class name */
    public static /* synthetic */ class C0428b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22157a;

        static {
            int[] iArr = new int[c.values().length];
            f22157a = iArr;
            try {
                iArr[c.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22157a[c.PHONE_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22157a[c.USERNAME.ordinal()] = 3;
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
        int i10 = C0428b.f22157a[cVar.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? "username" : "phonenumber";
        }
        return "email";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // lh.a
    public String getUrl() {
        return a1.p(this.f22156a, this.b);
    }

    public String toString() {
        return "CredentialType: " + this.f22156a + ". CredentialValue: " + this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22156a);
        parcel.writeString(this.b);
    }

    public b(c cVar, String str) {
        this.f22156a = a(cVar);
        this.b = str;
    }

    public b(Parcel parcel) {
        this.f22156a = parcel.readString();
        this.b = parcel.readString();
    }
}
