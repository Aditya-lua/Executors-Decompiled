package wf;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: wf.j */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC12411j {

    /* JADX INFO: renamed from: wf.j$a */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* JADX INFO: renamed from: a */
        public final int f44385a;

        a(int i10) {
            this.f44385a = i10;
        }

        /* JADX INFO: renamed from: b */
        public int m46492b() {
            return this.f44385a;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    a mo46488b(@NonNull String str);
}
