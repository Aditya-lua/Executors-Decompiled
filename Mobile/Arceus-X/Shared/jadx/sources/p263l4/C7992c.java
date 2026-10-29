package p263l4;

import kotlin.Metadata;
import kotlin.coroutines.C7721e;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import p229jt.C7346m;
import p256ku.C7864g1;
import p256ku.C7948z2;

/* JADX INFO: renamed from: l4.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m31665d2 = {"Ll4/b;", "a", "()Ll4/b;", "lifecycle-viewmodel"}, m31666k = 2, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C7992c {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final C7991b m33041a() {
        CoroutineContext coroutineContextMo32847X;
        try {
            coroutineContextMo32847X = C7864g1.m32645c().mo32847X();
        } catch (IllegalStateException unused) {
            coroutineContextMo32847X = C7721e.f29393a;
        } catch (C7346m unused2) {
            coroutineContextMo32847X = C7721e.f29393a;
        }
        return new C7991b(coroutineContextMo32847X.plus(C7948z2.m32943b(null, 1, null)));
    }
}
