package m2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class d<T> {

    public static class a extends d<Void> {
        @Override // m2.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Void a(List<c> list) {
            return null;
        }

        @Override // m2.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Void c() {
            return null;
        }

        @Override // m2.d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Void d(List<String> list) {
            return null;
        }
    }

    public abstract T a(List<c> list);

    public List<c> b() {
        return new ArrayList();
    }

    public abstract T c();

    public abstract T d(List<String> list);
}
