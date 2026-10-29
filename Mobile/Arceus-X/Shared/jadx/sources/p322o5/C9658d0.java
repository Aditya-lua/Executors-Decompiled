package p322o5;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: o5.d0 */
/* JADX INFO: loaded from: classes.dex */
public class C9658d0 {

    /* JADX INFO: renamed from: b */
    @SuppressLint({"UnknownNullness"})
    public View f35045b;

    /* JADX INFO: renamed from: a */
    public final Map<String, Object> f35044a = new HashMap();

    /* JADX INFO: renamed from: c */
    public final ArrayList<AbstractC9683q> f35046c = new ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public C9658d0() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9658d0)) {
            return false;
        }
        C9658d0 c9658d0 = (C9658d0) obj;
        return this.f35045b == c9658d0.f35045b && this.f35044a.equals(c9658d0.f35044a);
    }

    public int hashCode() {
        return (this.f35045b.hashCode() * 31) + this.f35044a.hashCode();
    }

    @NonNull
    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f35045b + "\n") + "    values:";
        for (String str2 : this.f35044a.keySet()) {
            str = str + "    " + str2 + ": " + this.f35044a.get(str2) + "\n";
        }
        return str;
    }

    public C9658d0(@NonNull View view) {
        this.f35045b = view;
    }
}
