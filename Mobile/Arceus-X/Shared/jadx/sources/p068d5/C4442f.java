package p068d5;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p094e5.C4843b;

/* JADX INFO: renamed from: d5.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0011\nB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000e2\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001c¨\u0006\u001e"}, m31665d2 = {"Ld5/f;", "", "Le5/b;", "impl", "<init>", "(Le5/b;)V", "", "key", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "a", "(Ljava/lang/String;)Landroid/os/Bundle;", "Ld5/f$b;", "provider", "", "c", "(Ljava/lang/String;Ld5/f$b;)V", "b", "(Ljava/lang/String;)Ld5/f$b;", "e", "(Ljava/lang/String;)V", "Ljava/lang/Class;", "Ld5/f$a;", "clazz", "d", "(Ljava/lang/Class;)V", "Le5/b;", "Ld5/b$b;", "Ld5/b$b;", "recreatorProvider", "savedstate"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C4442f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C4843b impl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public C4438b.b recreatorProvider;

    /* JADX INFO: renamed from: d5.f$a */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m31665d2 = {"Ld5/f$a;", "", "Ld5/i;", "owner", "", "a", "(Ld5/i;)V", "savedstate"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo4925a(@NotNull InterfaceC4445i owner);
    }

    /* JADX INFO: renamed from: d5.f$b */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m31665d2 = {"Ld5/f$b;", "", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "a", "()Landroid/os/Bundle;", "savedstate"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public interface b {
        @NotNull
        /* JADX INFO: renamed from: a */
        Bundle mo4974a();
    }

    public C4442f(@NotNull C4843b impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Bundle m22352a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.impl.m23395c(key);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final b m22353b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.impl.m23396d(key);
    }

    /* JADX INFO: renamed from: c */
    public final void m22354c(@NotNull String key, @NotNull b provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.impl.m23401j(key, provider);
    }

    /* JADX INFO: renamed from: d */
    public final void m22355d(@NotNull Class<? extends a> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (!this.impl.getIsAllowingSavingState()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C4438b.b bVar = this.recreatorProvider;
        if (bVar == null) {
            bVar = new C4438b.b(this);
        }
        this.recreatorProvider = bVar;
        try {
            clazz.getDeclaredConstructor(null);
            C4438b.b bVar2 = this.recreatorProvider;
            if (bVar2 != null) {
                String name = clazz.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                bVar2.m22342b(name);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m22356e(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.impl.m23402k(key);
    }
}
