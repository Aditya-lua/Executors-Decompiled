package p401r4;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.InterfaceFutureC9440x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p370q4.C10432b;
import p428s4.AbstractC11165b;
import p428s4.C11164a;
import p428s4.C11171h;
import p428s4.C11172i;
import p428s4.C11173j;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: r4.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000bB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m31665d2 = {"Lr4/a;", "", "<init>", "()V", "Landroid/net/Uri;", "trigger", "Lne/x;", "", "c", "(Landroid/net/Uri;)Lne/x;", "", "b", "()Lne/x;", "a", "ads-adservices-java_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public abstract class AbstractC10783a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: r4.a$a */
    @Metadata(m31664d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0016\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\bH\u0017¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"¨\u0006#"}, m31665d2 = {"Lr4/a$a;", "Lr4/a;", "Ls4/b;", "mMeasurementManager", "<init>", "(Ls4/b;)V", "Ls4/a;", "deletionRequest", "Lne/x;", "", "e", "(Ls4/a;)Lne/x;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "f", "(Landroid/net/Uri;Landroid/view/InputEvent;)Lne/x;", "Ls4/h;", "request", "g", "(Ls4/h;)Lne/x;", "trigger", "c", "(Landroid/net/Uri;)Lne/x;", "Ls4/i;", "h", "(Ls4/i;)Lne/x;", "Ls4/j;", "i", "(Ls4/j;)Lne/x;", "", "b", "()Lne/x;", "Ls4/b;", "ads-adservices-java_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class a extends AbstractC10783a {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final AbstractC11165b mMeasurementManager;

        /* JADX INFO: renamed from: r4.a$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {1, 8, 0})
        @InterfaceC10344f(m39663c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1", m39664f = "MeasurementManagerFutures.kt", m39665l = {132}, m39666m = "invokeSuspend")
        public static final class C14236a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f38440t;

            public C14236a(C11164a c11164a, InterfaceC9557b<? super C14236a> interfaceC9557b) {
                super(2, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return a.this.new C14236a(null, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f38440t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    AbstractC11165b abstractC11165b = a.this.mMeasurementManager;
                    this.f38440t = 1;
                    if (abstractC11165b.mo42062a(null, this) == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((C14236a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: r4.a$a$b */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)I"}, m31666k = 3, m31667mv = {1, 8, 0})
        @InterfaceC10344f(m39663c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", m39664f = "MeasurementManagerFutures.kt", m39665l = {190}, m39666m = "invokeSuspend")
        public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Integer>, Object> {

            /* JADX INFO: renamed from: t */
            public int f38442t;

            public b(InterfaceC9557b<? super b> interfaceC9557b) {
                super(2, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return a.this.new b(interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f38442t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return obj;
                }
                C7348o.m30470b(obj);
                AbstractC11165b abstractC11165b = a.this.mMeasurementManager;
                this.f38442t = 1;
                Object objMo42063b = abstractC11165b.mo42063b(this);
                return objMo42063b == objM38805e ? objM38805e : objMo42063b;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Integer> interfaceC9557b) {
                return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: r4.a$a$c */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {1, 8, 0})
        @InterfaceC10344f(m39663c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", m39664f = "MeasurementManagerFutures.kt", m39665l = {143}, m39666m = "invokeSuspend")
        public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f38444t;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ Uri f38446v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ InputEvent f38447w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Uri uri, InputEvent inputEvent, InterfaceC9557b<? super c> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f38446v = uri;
                this.f38447w = inputEvent;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return a.this.new c(this.f38446v, this.f38447w, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f38444t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    AbstractC11165b abstractC11165b = a.this.mMeasurementManager;
                    Uri uri = this.f38446v;
                    InputEvent inputEvent = this.f38447w;
                    this.f38444t = 1;
                    if (abstractC11165b.mo42064c(uri, inputEvent, this) == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: r4.a$a$d */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {1, 8, 0})
        @InterfaceC10344f(m39663c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$2", m39664f = "MeasurementManagerFutures.kt", m39665l = {154}, m39666m = "invokeSuspend")
        public static final class d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f38448t;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ C11171h f38450v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(C11171h c11171h, InterfaceC9557b<? super d> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f38450v = c11171h;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return a.this.new d(this.f38450v, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f38448t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    AbstractC11165b abstractC11165b = a.this.mMeasurementManager;
                    C11171h c11171h = this.f38450v;
                    this.f38448t = 1;
                    if (abstractC11165b.mo42065d(c11171h, this) == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: r4.a$a$e */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {1, 8, 0})
        @InterfaceC10344f(m39663c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", m39664f = "MeasurementManagerFutures.kt", m39665l = {162}, m39666m = "invokeSuspend")
        public static final class e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f38451t;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ Uri f38453v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Uri uri, InterfaceC9557b<? super e> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f38453v = uri;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return a.this.new e(this.f38453v, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f38451t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    AbstractC11165b abstractC11165b = a.this.mMeasurementManager;
                    Uri uri = this.f38453v;
                    this.f38451t = 1;
                    if (abstractC11165b.mo42066e(uri, this) == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((e) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: r4.a$a$f */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {1, 8, 0})
        @InterfaceC10344f(m39663c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1", m39664f = "MeasurementManagerFutures.kt", m39665l = {172}, m39666m = "invokeSuspend")
        public static final class f extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f38454t;

            public f(C11172i c11172i, InterfaceC9557b<? super f> interfaceC9557b) {
                super(2, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return a.this.new f(null, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f38454t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    AbstractC11165b abstractC11165b = a.this.mMeasurementManager;
                    this.f38454t = 1;
                    if (abstractC11165b.mo42067f(null, this) == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((f) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: r4.a$a$g */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {1, 8, 0})
        @InterfaceC10344f(m39663c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1", m39664f = "MeasurementManagerFutures.kt", m39665l = {182}, m39666m = "invokeSuspend")
        public static final class g extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f38456t;

            public g(C11173j c11173j, InterfaceC9557b<? super g> interfaceC9557b) {
                super(2, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return a.this.new g(null, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f38456t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    AbstractC11165b abstractC11165b = a.this.mMeasurementManager;
                    this.f38456t = 1;
                    if (abstractC11165b.mo42068g(null, this) == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((g) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        public a(@NotNull AbstractC11165b mMeasurementManager) {
            Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
            this.mMeasurementManager = mMeasurementManager;
        }

        /* JADX DEBUG: Class process forced to load method for inline: q4.b.c(ku.w0, java.lang.Object, int, java.lang.Object):ne.x */
        @Override // p401r4.AbstractC10783a
        @NotNull
        /* JADX INFO: renamed from: b */
        public InterfaceFutureC9440x<Integer> mo41107b() {
            return C10432b.m40143c(C7882k.m32778b(C7910q0.m32885a(C7864g1.m32643a()), null, null, new b(null), 3, null), null, 1, null);
        }

        @Override // p401r4.AbstractC10783a
        @NotNull
        /* JADX INFO: renamed from: c */
        public InterfaceFutureC9440x<Unit> mo41108c(@NotNull Uri trigger) {
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            return C10432b.m40143c(C7882k.m32778b(C7910q0.m32885a(C7864g1.m32643a()), null, null, new e(trigger, null), 3, null), null, 1, null);
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public InterfaceFutureC9440x<Unit> m41110e(@NotNull C11164a deletionRequest) {
            Intrinsics.checkNotNullParameter(deletionRequest, "deletionRequest");
            return C10432b.m40143c(C7882k.m32778b(C7910q0.m32885a(C7864g1.m32643a()), null, null, new C14236a(deletionRequest, null), 3, null), null, 1, null);
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public InterfaceFutureC9440x<Unit> m41111f(@NotNull Uri attributionSource, @Nullable InputEvent inputEvent) {
            Intrinsics.checkNotNullParameter(attributionSource, "attributionSource");
            return C10432b.m40143c(C7882k.m32778b(C7910q0.m32885a(C7864g1.m32643a()), null, null, new c(attributionSource, inputEvent, null), 3, null), null, 1, null);
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public InterfaceFutureC9440x<Unit> m41112g(@NotNull C11171h request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return C10432b.m40143c(C7882k.m32778b(C7910q0.m32885a(C7864g1.m32643a()), null, null, new d(request, null), 3, null), null, 1, null);
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public InterfaceFutureC9440x<Unit> m41113h(@NotNull C11172i request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return C10432b.m40143c(C7882k.m32778b(C7910q0.m32885a(C7864g1.m32643a()), null, null, new f(request, null), 3, null), null, 1, null);
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public InterfaceFutureC9440x<Unit> m41114i(@NotNull C11173j request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return C10432b.m40143c(C7882k.m32778b(C7910q0.m32885a(C7864g1.m32643a()), null, null, new g(request, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: renamed from: r4.a$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lr4/a$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lr4/a;", "a", "(Landroid/content/Context;)Lr4/a;", "ads-adservices-java_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: r4.a.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final AbstractC10783a m41115a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            AbstractC11165b abstractC11165bM42069a = AbstractC11165b.INSTANCE.m42069a(context);
            if (abstractC11165bM42069a != null) {
                return new a(abstractC11165bM42069a);
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final AbstractC10783a m41106a(@NotNull Context context) {
        return INSTANCE.m41115a(context);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract InterfaceFutureC9440x<Integer> mo41107b();

    @NotNull
    /* JADX INFO: renamed from: c */
    public abstract InterfaceFutureC9440x<Unit> mo41108c(@NotNull Uri trigger);
}
