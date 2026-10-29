package o5;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class d0 {

    @SuppressLint({"UnknownNullness"})
    public View b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f27089a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<q> f27090c = new ArrayList<>();

    @Deprecated
    public d0() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.b == d0Var.b && this.f27089a.equals(d0Var.f27089a);
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.f27089a.hashCode();
    }

    @NonNull
    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n") + "    values:";
        for (String str2 : this.f27089a.keySet()) {
            str = str + "    " + str2 + ": " + this.f27089a.get(str2) + "\n";
        }
        return str;
    }

    public d0(@NonNull View view) {
        this.b = view;
    }
}
