package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class jb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ob f27493a;

    public jb(ob obVar) {
        Objects.requireNonNull(obVar);
        this.f27493a = obVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ob obVar = this.f27493a;
        obVar.f27649e = obVar.D();
    }
}
