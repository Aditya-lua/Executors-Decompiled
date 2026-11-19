package ob;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class bf extends p9.a {
    public static final Parcelable.Creator<bf> CREATOR = new cf();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f27127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f27128h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f27129i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f27130j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f27131k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Double f27132l;

    public bf(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f27126f = i10;
        this.f27127g = str;
        this.f27128h = j10;
        this.f27129i = l10;
        this.f27132l = i10 == 1 ? f10 != null ? Double.valueOf(f10.doubleValue()) : null : d10;
        this.f27130j = str2;
        this.f27131k = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        cf.a(this, parcel, i10);
    }

    public final Object zza() {
        Long l10 = this.f27129i;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f27132l;
        if (d10 != null) {
            return d10;
        }
        String str = this.f27130j;
        if (str != null) {
            return str;
        }
        return null;
    }

    public bf(df dfVar) {
        this(dfVar.f27202c, dfVar.f27203d, dfVar.f27204e, dfVar.b);
    }

    public bf(String str, long j10, Object obj, String str2) {
        o9.s.f(str);
        this.f27126f = 2;
        this.f27127g = str;
        this.f27128h = j10;
        this.f27131k = str2;
        if (obj == null) {
            this.f27129i = null;
            this.f27132l = null;
            this.f27130j = null;
            return;
        }
        if (obj instanceof Long) {
            this.f27129i = (Long) obj;
            this.f27132l = null;
            this.f27130j = null;
        } else if (obj instanceof String) {
            this.f27129i = null;
            this.f27132l = null;
            this.f27130j = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f27129i = null;
                this.f27132l = (Double) obj;
                this.f27130j = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
