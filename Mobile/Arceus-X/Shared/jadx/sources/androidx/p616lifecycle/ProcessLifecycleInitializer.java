package androidx.p616lifecycle;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p238k5.C7447a;
import p238k5.InterfaceC7448b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lk5/b;", "Landroidx/lifecycle/s;", "<init>", "()V", "Landroid/content/Context;", "context", "a", "(Landroid/content/Context;)Landroidx/lifecycle/s;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "lifecycle-process"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class ProcessLifecycleInitializer implements InterfaceC7448b<InterfaceC0980s> {
    /* JADX DEBUG: Method merged with bridge method: create(Landroid/content/Context;)Ljava/lang/Object; */
    @Override // p238k5.InterfaceC7448b
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC0980s create(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C7447a c7447aM30961e = C7447a.m30961e(context);
        Intrinsics.checkNotNullExpressionValue(c7447aM30961e, "getInstance(...)");
        if (!c7447aM30961e.m30967g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        C0972o.m4963a(context);
        C0959h0.Companion companion = C0959h0.INSTANCE;
        companion.m4918b(context);
        return companion.m4917a();
    }

    @Override // p238k5.InterfaceC7448b
    @NotNull
    public List<Class<? extends InterfaceC7448b<?>>> dependencies() {
        return C7699p.m31892k();
    }
}
