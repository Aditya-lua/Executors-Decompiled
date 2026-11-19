package l9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p9.a {

    @NonNull
    public static final Parcelable.Creator<c> CREATOR = v.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f21987i = B3().a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public static final c f21988j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f21989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f21990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f21991h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f21992a;
        public boolean b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f21993c;

        @NonNull
        public c a() {
            c cVar = new c(this.f21992a, this.b);
            cVar.C3(this.f21993c);
            return cVar;
        }

        @NonNull
        public a b(f fVar) {
            this.f21992a = fVar;
            return this;
        }

        public final /* synthetic */ a c(boolean z10) {
            this.f21993c = z10;
            return this;
        }
    }

    static {
        a aVarB3 = B3();
        aVarB3.c(true);
        f21988j = aVarB3.a();
    }

    public c(f fVar, boolean z10) {
        this.f21989f = fVar;
        this.f21990g = z10;
    }

    @NonNull
    public static final c A3() {
        return f21987i;
    }

    @NonNull
    public static a B3() {
        return new a();
    }

    @NonNull
    public static final c a(@NonNull f fVar) {
        a aVarB3 = B3();
        aVarB3.b(fVar);
        return aVarB3.a();
    }

    public final /* synthetic */ void C3(boolean z10) {
        this.f21991h = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return o9.q.b(this.f21989f, cVar.f21989f) && this.f21991h == cVar.f21991h && this.f21990g == cVar.f21990g;
    }

    public final int hashCode() {
        return o9.q.c(this.f21989f, Boolean.valueOf(this.f21991h), Boolean.valueOf(this.f21990g));
    }

    @NonNull
    public final String toString() {
        String strValueOf = String.valueOf(this.f21989f);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 31);
        sb2.append("ApiMetadata(complianceOptions=");
        sb2.append(strValueOf);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        if (this.f21991h) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iA = p9.c.a(parcel);
        p9.c.t(parcel, 1, this.f21989f, i10, false);
        p9.c.c(parcel, 2, this.f21990g);
        p9.c.b(parcel, iA);
    }
}
