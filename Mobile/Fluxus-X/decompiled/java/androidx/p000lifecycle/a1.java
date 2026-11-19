package androidx.p000lifecycle;

import android.app.Application;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import java.lang.reflect.InvocationTargetException;
import l4.CreationExtras;
import m4.h;
import m4.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0005\u0011\u001b\u001c\u0014\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0011\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0087\u0002¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J0\u0010\u0018\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0087\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/a1;", BuildConfig.FLAVOR, "Lm4/h;", "impl", "<init>", "(Lm4/h;)V", "Landroidx/lifecycle/b1;", Payload.TYPE_STORE, "Landroidx/lifecycle/a1$c;", "factory", "Ll4/a;", "defaultCreationExtras", "(Landroidx/lifecycle/b1;Landroidx/lifecycle/a1$c;Ll4/a;)V", "Landroidx/lifecycle/x0;", "T", "Lxu/c;", "modelClass", "c", "(Lxu/c;)Landroidx/lifecycle/x0;", "Ljava/lang/Class;", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/x0;", BuildConfig.FLAVOR, "key", "b", "(Ljava/lang/String;Lxu/c;)Landroidx/lifecycle/x0;", "Lm4/h;", "e", "d", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class a1 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final CreationExtras.c<String> f2295c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h impl;

    /* JADX INFO: renamed from: androidx.lifecycle.a1$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/a1$b;", BuildConfig.FLAVOR, "<init>", "()V", "Landroidx/lifecycle/c1;", "owner", "Landroidx/lifecycle/a1$c;", "factory", "Ll4/a;", "extras", "Landroidx/lifecycle/a1;", "b", "(Landroidx/lifecycle/c1;Landroidx/lifecycle/a1$c;Ll4/a;)Landroidx/lifecycle/a1;", "Landroidx/lifecycle/b1;", Payload.TYPE_STORE, "a", "(Landroidx/lifecycle/b1;Landroidx/lifecycle/a1$c;Ll4/a;)Landroidx/lifecycle/a1;", "Ll4/a$c;", BuildConfig.FLAVOR, "VIEW_MODEL_KEY", "Ll4/a$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ a1 c(Companion companion, c1 c1Var, c cVar, CreationExtras creationExtras, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = j.f22933a.b(c1Var);
            }
            if ((i10 & 4) != 0) {
                creationExtras = j.f22933a.a(c1Var);
            }
            return companion.b(c1Var, cVar, creationExtras);
        }

        @NotNull
        public final a1 a(@NotNull b1 store, @NotNull c factory, @NotNull CreationExtras extras) {
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new a1(store, factory, extras);
        }

        @NotNull
        public final a1 b(@NotNull c1 owner, @NotNull c factory, @NotNull CreationExtras extras) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new a1(owner.w(), factory, extras);
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Landroidx/lifecycle/a1$c;", BuildConfig.FLAVOR, "Landroidx/lifecycle/x0;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/x0;", "Ll4/a;", "extras", "b", "(Ljava/lang/Class;Ll4/a;)Landroidx/lifecycle/x0;", "Lxu/c;", "c", "(Lxu/c;Ll4/a;)Landroidx/lifecycle/x0;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.f2302a;

        /* JADX INFO: renamed from: androidx.lifecycle.a1$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/a1$c$a;", BuildConfig.FLAVOR, "<init>", "()V", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ Companion f2302a = new Companion();
        }

        @NotNull
        default <T extends x0> T a(@NotNull Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return (T) j.f22933a.d();
        }

        @NotNull
        default <T extends x0> T b(@NotNull Class<T> modelClass, @NotNull CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) a(modelClass);
        }

        @NotNull
        default <T extends x0> T c(@NotNull xu.c<T> modelClass, @NotNull CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) b(ou.a.a(modelClass), extras);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ/\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/a1$d;", "Landroidx/lifecycle/a1$c;", "<init>", "()V", "Landroidx/lifecycle/x0;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/x0;", "Ll4/a;", "extras", "b", "(Ljava/lang/Class;Ll4/a;)Landroidx/lifecycle/x0;", "Lxu/c;", "c", "(Lxu/c;Ll4/a;)Landroidx/lifecycle/x0;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class d implements c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public static d f2303c;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final CreationExtras.c<String> f2304d = a1.f2295c;

        /* JADX INFO: renamed from: androidx.lifecycle.a1$d$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/a1$d$a;", BuildConfig.FLAVOR, "<init>", "()V", "Landroidx/lifecycle/a1$d;", "a", "()Landroidx/lifecycle/a1$d;", "getInstance$annotations", "instance", "_instance", "Landroidx/lifecycle/a1$d;", "Ll4/a$c;", BuildConfig.FLAVOR, "VIEW_MODEL_KEY", "Ll4/a$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final d a() {
                if (d.f2303c == null) {
                    d.f2303c = new d();
                }
                d dVar = d.f2303c;
                Intrinsics.checkNotNull(dVar);
                return dVar;
            }

            public Companion() {
            }
        }

        @Override // androidx.lifecycle.a1.c
        @NotNull
        public <T extends x0> T a(@NotNull Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return (T) m4.e.f22926a.a(modelClass);
        }

        @Override // androidx.lifecycle.a1.c
        @NotNull
        public <T extends x0> T b(@NotNull Class<T> modelClass, @NotNull CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) a(modelClass);
        }

        @Override // androidx.lifecycle.a1.c
        @NotNull
        public <T extends x0> T c(@NotNull xu.c<T> modelClass, @NotNull CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) b(ou.a.a(modelClass), extras);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/a1$e;", BuildConfig.FLAVOR, "<init>", "()V", "Landroidx/lifecycle/x0;", "viewModel", BuildConfig.FLAVOR, "d", "(Landroidx/lifecycle/x0;)V", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class e {
        public void d(@NotNull x0 viewModel) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/a1$f", "Ll4/a$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f implements CreationExtras.c<String> {
    }

    static {
        CreationExtras.Companion companion = CreationExtras.INSTANCE;
        f2295c = new f();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a1(@NotNull b1 store, @NotNull c factory) {
        this(store, factory, null, 4, null);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }

    @NotNull
    public <T extends x0> T a(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) c(ou.a.c(modelClass));
    }

    @NotNull
    public final <T extends x0> T b(@NotNull String key, @NotNull xu.c<T> modelClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) this.impl.d(modelClass, key);
    }

    @NotNull
    public final <T extends x0> T c(@NotNull xu.c<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) h.e(this.impl, modelClass, null, 2, null);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u0012B\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ/\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/lifecycle/a1$a;", "Landroidx/lifecycle/a1$d;", "Landroid/app/Application;", "application", BuildConfig.FLAVOR, "unused", "<init>", "(Landroid/app/Application;I)V", "()V", "(Landroid/app/Application;)V", "Landroidx/lifecycle/x0;", "T", "Ljava/lang/Class;", "modelClass", "Ll4/a;", "extras", "b", "(Ljava/lang/Class;Ll4/a;)Landroidx/lifecycle/x0;", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/x0;", Payload.TYPE_APP, "h", "(Ljava/lang/Class;Landroid/app/Application;)Landroidx/lifecycle/x0;", "e", "Landroid/app/Application;", "f", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class a extends d {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public static a f2298g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final CreationExtras.c<Application> f2299h;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Application application;

        /* JADX INFO: renamed from: androidx.lifecycle.a1$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/a1$a$a;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/app/Application;", "application", "Landroidx/lifecycle/a1$a;", "a", "(Landroid/app/Application;)Landroidx/lifecycle/a1$a;", "_instance", "Landroidx/lifecycle/a1$a;", "Ll4/a$c;", "APPLICATION_KEY", "Ll4/a$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final a a(@NotNull Application application) {
                Intrinsics.checkNotNullParameter(application, "application");
                if (a.f2298g == null) {
                    a.f2298g = new a(application);
                }
                a aVar = a.f2298g;
                Intrinsics.checkNotNull(aVar);
                return aVar;
            }

            public Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/a1$a$b", "Ll4/a$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b implements CreationExtras.c<Application> {
        }

        static {
            CreationExtras.Companion companion = CreationExtras.INSTANCE;
            f2299h = new b();
        }

        public a(Application application, int i10) {
            this.application = application;
        }

        @Override // androidx.lifecycle.a1.d, androidx.lifecycle.a1.c
        @NotNull
        public <T extends x0> T a(@NotNull Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Application application = this.application;
            if (application != null) {
                return (T) h(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.a1.d, androidx.lifecycle.a1.c
        @NotNull
        public <T extends x0> T b(@NotNull Class<T> modelClass, @NotNull CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            if (this.application != null) {
                return (T) a(modelClass);
            }
            Application application = (Application) extras.a(f2299h);
            if (application != null) {
                return (T) h(modelClass, application);
            }
            if (androidx.p000lifecycle.b.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.a(modelClass);
        }

        public final <T extends x0> T h(Class<T> modelClass, Application app) {
            if (!androidx.p000lifecycle.b.class.isAssignableFrom(modelClass)) {
                return (T) super.a(modelClass);
            }
            try {
                T tNewInstance = modelClass.getConstructor(Application.class).newInstance(app);
                Intrinsics.checkNotNull(tNewInstance);
                return tNewInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e13);
            }
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Application application) {
            this(application, 0);
            Intrinsics.checkNotNullParameter(application, "application");
        }
    }

    public a1(h hVar) {
        this.impl = hVar;
    }

    public /* synthetic */ a1(b1 b1Var, c cVar, CreationExtras creationExtras, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(b1Var, cVar, (i10 & 4) != 0 ? CreationExtras.b.f21886c : creationExtras);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a1(@NotNull b1 store, @NotNull c factory, @NotNull CreationExtras defaultCreationExtras) {
        this(new h(store, factory, defaultCreationExtras));
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
    }
}
