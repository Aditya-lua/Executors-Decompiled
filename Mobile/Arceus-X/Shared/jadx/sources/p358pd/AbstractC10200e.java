package p358pd;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.Date;

/* JADX INFO: renamed from: pd.e */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10200e {

    /* JADX INFO: renamed from: pd.e$a */
    public static abstract class a {
        @NonNull
        /* JADX INFO: renamed from: a */
        public abstract AbstractC10200e mo39284a();

        @NonNull
        /* JADX INFO: renamed from: b */
        public abstract a mo39285b(Integer num);

        @NonNull
        /* JADX INFO: renamed from: c */
        public abstract a mo39286c(Integer num);

        @NonNull
        /* JADX INFO: renamed from: d */
        public abstract a mo39287d(String str);

        @NonNull
        /* JADX INFO: renamed from: e */
        public abstract a mo39288e(Date date);

        @NonNull
        /* JADX INFO: renamed from: f */
        public abstract a mo39289f(Integer num);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static a m39276c() {
        return new C10208m();
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static AbstractC10200e m39277g(@NonNull Bundle bundle) {
        if (!bundle.containsKey("user.status")) {
            return m39276c().mo39284a();
        }
        a aVarM39276c = m39276c();
        aVarM39276c.mo39289f(m39278h(bundle, "user.status"));
        aVarM39276c.mo39285b(m39278h(bundle, "age.range.lower"));
        aVarM39276c.mo39286c(m39278h(bundle, "age.range.upper"));
        aVarM39276c.mo39288e(bundle.containsKey("most.recent.approval.date") ? new Date(bundle.getLong("most.recent.approval.date")) : null);
        aVarM39276c.mo39287d(bundle.containsKey("install.id") ? bundle.getString("install.id") : null);
        return aVarM39276c.mo39284a();
    }

    /* JADX INFO: renamed from: h */
    public static Integer m39278h(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return Integer.valueOf(bundle.getInt(str));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public abstract Integer mo39279a();

    /* JADX INFO: renamed from: b */
    public abstract Integer mo39280b();

    /* JADX INFO: renamed from: d */
    public abstract String mo39281d();

    /* JADX INFO: renamed from: e */
    public abstract Date mo39282e();

    /* JADX INFO: renamed from: f */
    public abstract Integer mo39283f();
}
