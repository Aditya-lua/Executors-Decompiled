package f9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o9.s;

/* JADX INFO: loaded from: classes.dex */
public class d extends p9.a {

    @NonNull
    public static final Parcelable.Creator<d> CREATOR = new i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f15705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f15706g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f15707a = new ArrayList();
        public boolean b = false;

        @NonNull
        public d a() {
            return new d(this.f15707a, this.b);
        }

        @NonNull
        public a b(@NonNull List<String> list) {
            s.m(list, "Keys cannot be set to null");
            this.f15707a = list;
            return this;
        }
    }

    public d(List list, boolean z10) {
        if (z10) {
            boolean z11 = true;
            if (list != null && !list.isEmpty()) {
                z11 = false;
            }
            s.q(z11, "retrieveAll was set to true but other constraint(s) was also provided: keys");
        }
        this.f15706g = z10;
        this.f15705f = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                s.g(str, "Element in keys cannot be null or empty");
                this.f15705f.add(str);
            }
        }
    }

    @NonNull
    public List<String> A3() {
        return Collections.unmodifiableList(this.f15705f);
    }

    public boolean B3() {
        return this.f15706g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.x(parcel, 1, A3(), false);
        p9.c.c(parcel, 2, B3());
        p9.c.b(parcel, iA);
    }
}
