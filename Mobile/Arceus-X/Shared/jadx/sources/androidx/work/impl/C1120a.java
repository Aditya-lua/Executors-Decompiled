package androidx.work.impl;

import android.content.Context;
import androidx.work.C1115a;
import com.appsflyer.C1759R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p069d6.C4463n;
import p161h6.C6293c;
import p161h6.InterfaceC6292b;
import p161h6.InterfaceExecutorC6291a;
import p256ku.AbstractC7888l0;
import p256ku.C7910q0;
import p256ku.InterfaceC7906p0;
import p536x5.C12705i0;
import p567y5.C13042d1;
import p567y5.C13048f1;
import p567y5.C13085s;
import p567y5.C13096x;
import p567y5.InterfaceC13090u;
import p595z5.C13720b;
import p615zt.InterfaceC14060q;

/* JADX INFO: renamed from: androidx.work.impl.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0085\u0001\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2<\b\u0002\u0010\u0010\u001a6\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fj\u0002`\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aE\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0018\u0010\u0019*j\u0010\u001a\"2\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f22\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f¨\u0006\u001b"}, m31665d2 = {"Landroid/content/Context;", "context", "Landroidx/work/a;", "configuration", "Lh6/b;", "workTaskExecutor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Ld6/n;", "trackers", "Ly5/s;", "processor", "Lkotlin/Function6;", "", "Ly5/u;", "Landroidx/work/impl/SchedulersCreator;", "schedulersCreator", "Ly5/f1;", "d", "(Landroid/content/Context;Landroidx/work/a;Lh6/b;Landroidx/work/impl/WorkDatabase;Ld6/n;Ly5/s;Lzt/q;)Ly5/f1;", "b", "(Landroid/content/Context;Landroidx/work/a;Lh6/b;Landroidx/work/impl/WorkDatabase;Ld6/n;Ly5/s;)Ljava/util/List;", "taskExecutor", "Lku/p0;", "f", "(Lh6/b;)Lku/p0;", "SchedulersCreator", "work-runtime_release"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C1120a {

    /* JADX INFO: renamed from: androidx.work.impl.a$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final /* synthetic */ class a extends C7744k implements InterfaceC14060q<Context, C1115a, InterfaceC6292b, WorkDatabase, C4463n, C13085s, List<? extends InterfaceC13090u>> {

        /* JADX INFO: renamed from: a */
        public static final a f4596a = new a();

        public a() {
            super(6, C1120a.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: h(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p615zt.InterfaceC14060q
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final List<InterfaceC13090u> mo6392h(Context p8, C1115a p10, InterfaceC6292b p11, WorkDatabase p12, C4463n p13, C13085s p14) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            Intrinsics.checkNotNullParameter(p11, "p2");
            Intrinsics.checkNotNullParameter(p12, "p3");
            Intrinsics.checkNotNullParameter(p13, "p4");
            Intrinsics.checkNotNullParameter(p14, "p5");
            return C1120a.m6386b(p8, p10, p11, p12, p13, p14);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final List<InterfaceC13090u> m6386b(Context context, C1115a c1115a, InterfaceC6292b interfaceC6292b, WorkDatabase workDatabase, C4463n c4463n, C13085s c13085s) {
        InterfaceC13090u interfaceC13090uM48686c = C13096x.m48686c(context, workDatabase, c1115a);
        Intrinsics.checkNotNullExpressionValue(interfaceC13090uM48686c, "createBestAvailableBackgroundScheduler(...)");
        return C7699p.m31895n(interfaceC13090uM48686c, new C13720b(context, c1115a, c4463n, c13085s, new C13042d1(c13085s, interfaceC6292b), interfaceC6292b));
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final C13048f1 m6387c(@NotNull Context context, @NotNull C1115a configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return m6389e(context, configuration, null, null, null, null, null, C1759R.styleable.AppCompatTheme_windowMinWidthMajor, null);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final C13048f1 m6388d(@NotNull Context context, @NotNull C1115a configuration, @NotNull InterfaceC6292b workTaskExecutor, @NotNull WorkDatabase workDatabase, @NotNull C4463n trackers, @NotNull C13085s processor, @NotNull InterfaceC14060q<? super Context, ? super C1115a, ? super InterfaceC6292b, ? super WorkDatabase, ? super C4463n, ? super C13085s, ? extends List<? extends InterfaceC13090u>> schedulersCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(schedulersCreator, "schedulersCreator");
        return new C13048f1(context.getApplicationContext(), configuration, workTaskExecutor, workDatabase, schedulersCreator.mo6392h(context, configuration, workTaskExecutor, workDatabase, trackers, processor), processor, trackers);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C13048f1 m6389e(Context context, C1115a c1115a, InterfaceC6292b interfaceC6292b, WorkDatabase workDatabase, C4463n c4463n, C13085s c13085s, InterfaceC14060q interfaceC14060q, int i10, Object obj) {
        C4463n c4463n2;
        if ((i10 & 4) != 0) {
            interfaceC6292b = new C6293c(c1115a.getTaskExecutor());
        }
        InterfaceC6292b interfaceC6292b2 = interfaceC6292b;
        if ((i10 & 8) != 0) {
            WorkDatabase.Companion companion = WorkDatabase.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            InterfaceExecutorC6291a interfaceExecutorC6291aMo27572c = interfaceC6292b2.mo27572c();
            Intrinsics.checkNotNullExpressionValue(interfaceExecutorC6291aMo27572c, "getSerialTaskExecutor(...)");
            workDatabase = companion.m6354b(applicationContext, interfaceExecutorC6291aMo27572c, c1115a.getClock(), context.getResources().getBoolean(C12705i0.f45266a));
        }
        if ((i10 & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
            c4463n2 = new C4463n(applicationContext2, interfaceC6292b2, null, null, null, null, 60, null);
        } else {
            c4463n2 = c4463n;
        }
        return m6388d(context, c1115a, interfaceC6292b2, workDatabase, c4463n2, (i10 & 32) != 0 ? new C13085s(context.getApplicationContext(), c1115a, interfaceC6292b2, workDatabase) : c13085s, (i10 & 64) != 0 ? a.f4596a : interfaceC14060q);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final InterfaceC7906p0 m6390f(@NotNull InterfaceC6292b taskExecutor) {
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        AbstractC7888l0 abstractC7888l0Mo27571b = taskExecutor.mo27571b();
        Intrinsics.checkNotNullExpressionValue(abstractC7888l0Mo27571b, "getTaskCoroutineDispatcher(...)");
        return C7910q0.m32885a(abstractC7888l0Mo27571b);
    }
}
