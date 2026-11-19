package n4;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.p000lifecycle.c1;
import androidx.p000lifecycle.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: n4.a$a, reason: collision with other inner class name */
    public interface InterfaceC0490a<D> {
        void a(@NonNull o4.b<D> bVar, D d10);

        @NonNull
        o4.b<D> b(int i10, Bundle bundle);

        void c(@NonNull o4.b<D> bVar);
    }

    @NonNull
    public static <T extends s & c1> a b(@NonNull T t8) {
        return new b(t8, t8.w());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @NonNull
    public abstract <D> o4.b<D> c(int i10, Bundle bundle, @NonNull InterfaceC0490a<D> interfaceC0490a);

    public abstract void d();
}
