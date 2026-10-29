package androidx.p616lifecycle;

import android.app.Application;
import com.appsflyer.sdk_base.referrer.Payload;
import hu.InterfaceC6567c;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p237k4.CreationExtras;
import p263l4.C7994e;
import p263l4.C7997h;
import p263l4.C7999j;
import yt.C13450a;

/* JADX INFO: renamed from: androidx.lifecycle.a1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00142\u00020\u0001:\u0005\u0018\u001b\u001c\u0011\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0011\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0087\u0002¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J0\u0010\u0018\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0087\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001a¨\u0006\u001d"}, m31665d2 = {"Landroidx/lifecycle/a1;", "", "Ll4/h;", "impl", "<init>", "(Ll4/h;)V", "Landroidx/lifecycle/b1;", Payload.TYPE_STORE, "Landroidx/lifecycle/a1$c;", "factory", "Lk4/a;", "defaultCreationExtras", "(Landroidx/lifecycle/b1;Landroidx/lifecycle/a1$c;Lk4/a;)V", "Landroidx/lifecycle/x0;", "T", "Lhu/c;", "modelClass", "a", "(Lhu/c;)Landroidx/lifecycle/x0;", "Ljava/lang/Class;", "b", "(Ljava/lang/Class;)Landroidx/lifecycle/x0;", "", "key", "c", "(Ljava/lang/String;Lhu/c;)Landroidx/lifecycle/x0;", "Ll4/h;", "e", "d", "lifecycle-viewmodel"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public class C0941a1 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final CreationExtras.c<String> f3607c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C7997h impl;

    /* JADX INFO: renamed from: androidx.lifecycle.a1$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m31665d2 = {"Landroidx/lifecycle/a1$b;", "", "<init>", "()V", "Landroidx/lifecycle/c1;", "owner", "Landroidx/lifecycle/a1$c;", "factory", "Lk4/a;", "extras", "Landroidx/lifecycle/a1;", "b", "(Landroidx/lifecycle/c1;Landroidx/lifecycle/a1$c;Lk4/a;)Landroidx/lifecycle/a1;", "Landroidx/lifecycle/b1;", Payload.TYPE_STORE, "a", "(Landroidx/lifecycle/b1;Landroidx/lifecycle/a1$c;Lk4/a;)Landroidx/lifecycle/a1;", "Lk4/a$c;", "", "VIEW_MODEL_KEY", "Lk4/a$c;", "lifecycle-viewmodel"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.lifecycle.a1.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ C0941a1 m4875c(Companion companion, InterfaceC0947c1 interfaceC0947c1, c cVar, CreationExtras creationExtras, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = C7999j.f29922a.m33057b(interfaceC0947c1);
            }
            if ((i10 & 4) != 0) {
                creationExtras = C7999j.f29922a.m33056a(interfaceC0947c1);
            }
            return companion.m4877b(interfaceC0947c1, cVar, creationExtras);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C0941a1 m4876a(@NotNull C0944b1 store, @NotNull c factory, @NotNull CreationExtras extras) {
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new C0941a1(store, factory, extras);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C0941a1 m4877b(@NotNull InterfaceC0947c1 owner, @NotNull c factory, @NotNull CreationExtras extras) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new C0941a1(owner.mo4712w(), factory, extras);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.a1$c */
    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m31665d2 = {"Landroidx/lifecycle/a1$c;", "", "Landroidx/lifecycle/x0;", "T", "Ljava/lang/Class;", "modelClass", "b", "(Ljava/lang/Class;)Landroidx/lifecycle/x0;", "Lk4/a;", "extras", "a", "(Ljava/lang/Class;Lk4/a;)Landroidx/lifecycle/x0;", "Lhu/c;", "c", "(Lhu/c;Lk4/a;)Landroidx/lifecycle/x0;", "lifecycle-viewmodel"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public interface c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.f3614a;

        /* JADX INFO: renamed from: androidx.lifecycle.a1$c$a, reason: from kotlin metadata */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Landroidx/lifecycle/a1$c$a;", "", "<init>", "()V", "lifecycle-viewmodel"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ Companion f3614a = new Companion();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        default <T extends AbstractC0991x0> T mo4846a(@NotNull Class<T> modelClass, @NotNull CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) mo4847b(modelClass);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        default <T extends AbstractC0991x0> T mo4847b(@NotNull Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return (T) C7999j.f29922a.m33059d();
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        default <T extends AbstractC0991x0> T mo4878c(@NotNull InterfaceC6567c<T> modelClass, @NotNull CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) mo4846a(C13450a.m49048a(modelClass), extras);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.a1$d */
    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ/\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Landroidx/lifecycle/a1$d;", "Landroidx/lifecycle/a1$c;", "<init>", "()V", "Landroidx/lifecycle/x0;", "T", "Ljava/lang/Class;", "modelClass", "b", "(Ljava/lang/Class;)Landroidx/lifecycle/x0;", "Lk4/a;", "extras", "a", "(Ljava/lang/Class;Lk4/a;)Landroidx/lifecycle/x0;", "Lhu/c;", "c", "(Lhu/c;Lk4/a;)Landroidx/lifecycle/x0;", "lifecycle-viewmodel"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static class d implements c {

        /* JADX INFO: renamed from: c */
        @Nullable
        public static d f3616c;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: d */
        @NotNull
        public static final CreationExtras.c<String> f3617d = C0941a1.f3607c;

        /* JADX INFO: renamed from: androidx.lifecycle.a1$d$a, reason: from kotlin metadata */
        @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Landroidx/lifecycle/a1$d$a;", "", "<init>", "()V", "Landroidx/lifecycle/a1$d;", "a", "()Landroidx/lifecycle/a1$d;", "getInstance$annotations", "instance", "_instance", "Landroidx/lifecycle/a1$d;", "Lk4/a$c;", "", "VIEW_MODEL_KEY", "Lk4/a$c;", "lifecycle-viewmodel"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.lifecycle.a1.d.a.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final d m4881a() {
                if (d.f3616c == null) {
                    d.f3616c = new d();
                }
                d dVar = d.f3616c;
                Intrinsics.checkNotNull(dVar);
                return dVar;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Companion() {
            }
        }

        @Override // androidx.p616lifecycle.C0941a1.c
        @NotNull
        /* JADX INFO: renamed from: a */
        public <T extends AbstractC0991x0> T mo4846a(@NotNull Class<T> modelClass, @NotNull CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) mo4847b(modelClass);
        }

        @Override // androidx.p616lifecycle.C0941a1.c
        @NotNull
        /* JADX INFO: renamed from: b */
        public <T extends AbstractC0991x0> T mo4847b(@NotNull Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return (T) C7994e.f29913a.m33042a(modelClass);
        }

        @Override // androidx.p616lifecycle.C0941a1.c
        @NotNull
        /* JADX INFO: renamed from: c */
        public <T extends AbstractC0991x0> T mo4878c(@NotNull InterfaceC6567c<T> modelClass, @NotNull CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) mo4846a(C13450a.m49048a(modelClass), extras);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.a1$e */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Landroidx/lifecycle/a1$e;", "", "<init>", "()V", "Landroidx/lifecycle/x0;", "viewModel", "", "d", "(Landroidx/lifecycle/x0;)V", "lifecycle-viewmodel"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static class e {
        /* JADX INFO: renamed from: d */
        public void mo4848d(@NotNull AbstractC0991x0 viewModel) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.a1$f */
    @Metadata(m31664d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m31665d2 = {"androidx/lifecycle/a1$f", "Lk4/a$c;", "lifecycle-viewmodel"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class f implements CreationExtras.c<String> {
    }

    static {
        CreationExtras.Companion companion = CreationExtras.INSTANCE;
        f3607c = new f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0941a1(@NotNull C0944b1 store, @NotNull c factory) {
        this(store, factory, null, 4, null);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final <T extends AbstractC0991x0> T m4868a(@NotNull InterfaceC6567c<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) C7997h.m33053e(this.impl, modelClass, null, 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public <T extends AbstractC0991x0> T m4869b(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) m4868a(C13450a.m49050c(modelClass));
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final <T extends AbstractC0991x0> T m4870c(@NotNull String key, @NotNull InterfaceC6567c<T> modelClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) this.impl.m33054d(modelClass, key);
    }

    /* JADX INFO: renamed from: androidx.lifecycle.a1$a */
    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u0010B\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ/\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m31665d2 = {"Landroidx/lifecycle/a1$a;", "Landroidx/lifecycle/a1$d;", "Landroid/app/Application;", "application", "", "unused", "<init>", "(Landroid/app/Application;I)V", "()V", "(Landroid/app/Application;)V", "Landroidx/lifecycle/x0;", "T", "Ljava/lang/Class;", "modelClass", "Lk4/a;", "extras", "a", "(Ljava/lang/Class;Lk4/a;)Landroidx/lifecycle/x0;", "b", "(Ljava/lang/Class;)Landroidx/lifecycle/x0;", Payload.TYPE_APP, "h", "(Ljava/lang/Class;Landroid/app/Application;)Landroidx/lifecycle/x0;", "e", "Landroid/app/Application;", "f", "lifecycle-viewmodel"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static class a extends d {

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: g */
        @Nullable
        public static a f3610g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public static final CreationExtras.c<Application> f3611h;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public final Application application;

        /* JADX INFO: renamed from: androidx.lifecycle.a1$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Landroidx/lifecycle/a1$a$a;", "", "<init>", "()V", "Landroid/app/Application;", "application", "Landroidx/lifecycle/a1$a;", "a", "(Landroid/app/Application;)Landroidx/lifecycle/a1$a;", "_instance", "Landroidx/lifecycle/a1$a;", "Lk4/a$c;", "APPLICATION_KEY", "Lk4/a$c;", "lifecycle-viewmodel"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.lifecycle.a1.a.a.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final a m4874a(@NotNull Application application) {
                Intrinsics.checkNotNullParameter(application, "application");
                if (a.f3610g == null) {
                    a.f3610g = new a(application);
                }
                a aVar = a.f3610g;
                Intrinsics.checkNotNull(aVar);
                return aVar;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Companion() {
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.a1$a$b */
        @Metadata(m31664d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m31665d2 = {"androidx/lifecycle/a1$a$b", "Lk4/a$c;", "lifecycle-viewmodel"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
        public static final class b implements CreationExtras.c<Application> {
        }

        static {
            CreationExtras.Companion companion = CreationExtras.INSTANCE;
            f3611h = new b();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(Application application, int i10) {
            this.application = application;
        }

        @Override // androidx.p616lifecycle.C0941a1.d, androidx.p616lifecycle.C0941a1.c
        @NotNull
        /* JADX INFO: renamed from: a */
        public <T extends AbstractC0991x0> T mo4846a(@NotNull Class<T> modelClass, @NotNull CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            if (this.application != null) {
                return (T) mo4847b(modelClass);
            }
            Application application = (Application) extras.mo30958a(f3611h);
            if (application != null) {
                return (T) m4873h(modelClass, application);
            }
            if (C0942b.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.mo4847b(modelClass);
        }

        @Override // androidx.p616lifecycle.C0941a1.d, androidx.p616lifecycle.C0941a1.c
        @NotNull
        /* JADX INFO: renamed from: b */
        public <T extends AbstractC0991x0> T mo4847b(@NotNull Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Application application = this.application;
            if (application != null) {
                return (T) m4873h(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        /* JADX INFO: renamed from: h */
        public final <T extends AbstractC0991x0> T m4873h(Class<T> modelClass, Application app) {
            if (!C0942b.class.isAssignableFrom(modelClass)) {
                return (T) super.mo4847b(modelClass);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0941a1(C7997h c7997h) {
        this.impl = c7997h;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
      (r1v0 androidx.lifecycle.b1)
      (r2v0 androidx.lifecycle.a1$c)
      (wrap k4.a:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap k4.a:0x0004: SGET  A[WRAPPED] (LINE:4) k4.a.b.c k4.a$b) : (r3v0 k4.a))
     A[MD:(androidx.lifecycle.b1, androidx.lifecycle.a1$c, k4.a):void (m)] (LINE:5) call: androidx.lifecycle.a1.<init>(androidx.lifecycle.b1, androidx.lifecycle.a1$c, k4.a):void type: THIS */
    public /* synthetic */ C0941a1(C0944b1 c0944b1, c cVar, CreationExtras creationExtras, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0944b1, cVar, (i10 & 4) != 0 ? CreationExtras.b.f28722c : creationExtras);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0941a1(@NotNull C0944b1 store, @NotNull c factory, @NotNull CreationExtras defaultCreationExtras) {
        this(new C7997h(store, factory, defaultCreationExtras));
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
    }
}
