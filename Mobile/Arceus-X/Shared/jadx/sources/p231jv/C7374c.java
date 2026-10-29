package p231jv;

import android.annotation.TargetApi;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: jv.c */
/* JADX INFO: loaded from: classes2.dex */
public class C7374c {

    /* JADX INFO: renamed from: jv.c$a */
    @TargetApi(24)
    public static final class a extends C7374c {
        @Override // p231jv.C7374c
        /* JADX INFO: renamed from: a */
        public List<? extends InterfaceC7377e.a> mo30548a(Executor executor) {
            return Arrays.asList(new C7379g(), new C7381i(executor));
        }

        @Override // p231jv.C7374c
        /* JADX INFO: renamed from: b */
        public List<? extends InterfaceC7380h.a> mo30549b() {
            return Collections.singletonList(new C7390r());
        }
    }

    /* JADX INFO: renamed from: a */
    public List<? extends InterfaceC7377e.a> mo30548a(Executor executor) {
        return Collections.singletonList(new C7381i(executor));
    }

    /* JADX INFO: renamed from: b */
    public List<? extends InterfaceC7380h.a> mo30549b() {
        return Collections.EMPTY_LIST;
    }
}
