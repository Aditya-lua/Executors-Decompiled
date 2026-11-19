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
public class c extends p9.a {

    @NonNull
    public static final Parcelable.Creator<c> CREATOR = new h();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f15702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f15703g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f15704a = new ArrayList();
        public boolean b = false;

        @NonNull
        public c a() {
            return new c(this.f15704a, this.b);
        }

        @NonNull
        public a b(@NonNull List<String> list) {
            s.m(list, "Keys cannot be set to null");
            this.f15704a = list;
            return this;
        }
    }

    public c(List list, boolean z10) {
        if (z10) {
            boolean z11 = true;
            if (list != null && !list.isEmpty()) {
                z11 = false;
            }
            s.q(z11, "deleteAll was set to true but other constraint(s) was also provided: keys");
        }
        this.f15703g = z10;
        this.f15702f = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                s.g(str, "Element in keys cannot be null or empty");
                this.f15702f.add(str);
            }
        }
    }

    public boolean A3() {
        return this.f15703g;
    }

    @NonNull
    public List<String> B3() {
        return Collections.unmodifiableList(this.f15702f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.x(parcel, 1, B3(), false);
        p9.c.c(parcel, 2, A3());
        p9.c.b(parcel, iA);
    }
}
