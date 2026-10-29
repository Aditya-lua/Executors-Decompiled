package od;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    public static abstract class a {
        @NonNull
        public abstract e a();

        @NonNull
        public abstract a b(Integer num);

        @NonNull
        public abstract a c(Integer num);

        @NonNull
        public abstract a d(String str);

        @NonNull
        public abstract a e(Date date);

        @NonNull
        public abstract a f(Integer num);
    }

    @NonNull
    public static a c() {
        return new m();
    }

    @NonNull
    public static e g(@NonNull Bundle bundle) {
        if (!bundle.containsKey("user.status")) {
            return c().a();
        }
        a aVarC = c();
        aVarC.f(h(bundle, "user.status"));
        aVarC.b(h(bundle, "age.range.lower"));
        aVarC.c(h(bundle, "age.range.upper"));
        aVarC.e(bundle.containsKey("most.recent.approval.date") ? new Date(bundle.getLong("most.recent.approval.date")) : null);
        aVarC.d(bundle.containsKey("install.id") ? bundle.getString("install.id") : null);
        return aVarC.a();
    }

    public static Integer h(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return Integer.valueOf(bundle.getInt(str));
        }
        return null;
    }

    public abstract Integer a();

    public abstract Integer b();

    public abstract String d();

    public abstract Date e();

    public abstract Integer f();
}
