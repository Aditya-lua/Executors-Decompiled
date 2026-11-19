package gb;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f17627a;

    public i(n nVar) {
        this.f17627a = nVar;
    }

    public static i a(Application application) {
        return new i(p.a(application));
    }

    public final Task b(final h hVar) {
        Objects.requireNonNull(hVar);
        return this.f17627a.a(new m() { // from class: gb.g
            @Override // gb.m
            public final /* synthetic */ Task a(l9.g gVar) {
                return hVar.a(gVar);
            }
        });
    }
}
