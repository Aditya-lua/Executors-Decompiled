package p097e8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p466uf.InterfaceC11848d;

/* JADX INFO: renamed from: e8.d */
/* JADX INFO: loaded from: classes.dex */
public final class C4884d {

    /* JADX INFO: renamed from: c */
    public static final C4884d f19608c = new a().m23528a();

    /* JADX INFO: renamed from: a */
    public final String f19609a;

    /* JADX INFO: renamed from: b */
    public final List<C4883c> f19610b;

    /* JADX INFO: renamed from: e8.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public String f19611a = "";

        /* JADX INFO: renamed from: b */
        public List<C4883c> f19612b = new ArrayList();

        /* JADX INFO: renamed from: a */
        public C4884d m23528a() {
            return new C4884d(this.f19611a, Collections.unmodifiableList(this.f19612b));
        }

        /* JADX INFO: renamed from: b */
        public a m23529b(List<C4883c> list) {
            this.f19612b = list;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m23530c(String str) {
            this.f19611a = str;
            return this;
        }
    }

    public C4884d(String str, List<C4883c> list) {
        this.f19609a = str;
        this.f19610b = list;
    }

    /* JADX INFO: renamed from: c */
    public static a m23525c() {
        return new a();
    }

    @InterfaceC11848d(tag = 2)
    /* JADX INFO: renamed from: a */
    public List<C4883c> m23526a() {
        return this.f19610b;
    }

    @InterfaceC11848d(tag = 1)
    /* JADX INFO: renamed from: b */
    public String m23527b() {
        return this.f19609a;
    }
}
