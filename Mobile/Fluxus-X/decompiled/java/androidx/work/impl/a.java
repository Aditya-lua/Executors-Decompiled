package androidx.work.impl;

import android.content.Context;
import av.l0;
import av.p0;
import av.q0;
import com.github.luben.zstd.BuildConfig;
import e6.n;
import i6.b;
import i6.c;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.collections.p;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.k;
import pu.q;
import y5.i0;
import z5.d1;
import z5.f1;
import z5.s;
import z5.u;
import z5.x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0085\u0001\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2<\b\u0002\u0010\u0010\u001a6\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fj\u0002`\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aE\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0018\u0010\u0019*j\u0010\u001a\"2\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f22\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f¨\u0006\u001b"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/work/a;", "configuration", "Li6/b;", "workTaskExecutor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Le6/n;", "trackers", "Lz5/s;", "processor", "Lkotlin/Function6;", BuildConfig.FLAVOR, "Lz5/u;", "Landroidx/work/impl/SchedulersCreator;", "schedulersCreator", "Lz5/f1;", "d", "(Landroid/content/Context;Landroidx/work/a;Li6/b;Landroidx/work/impl/WorkDatabase;Le6/n;Lz5/s;Lpu/q;)Lz5/f1;", "b", "(Landroid/content/Context;Landroidx/work/a;Li6/b;Landroidx/work/impl/WorkDatabase;Le6/n;Lz5/s;)Ljava/util/List;", "taskExecutor", "Lav/p0;", "f", "(Li6/b;)Lav/p0;", "SchedulersCreator", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: androidx.work.impl.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class C0071a extends k implements q<Context, androidx.work.a, b, WorkDatabase, n, s, List<? extends u>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0071a f3027a = new C0071a();

        public C0071a() {
            super(6, a.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
        }

        @Override // pu.q
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final List<u> g(Context p8, androidx.work.a p10, b p11, WorkDatabase p12, n p13, s p14) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            Intrinsics.checkNotNullParameter(p11, "p2");
            Intrinsics.checkNotNullParameter(p12, "p3");
            Intrinsics.checkNotNullParameter(p13, "p4");
            Intrinsics.checkNotNullParameter(p14, "p5");
            return a.b(p8, p10, p11, p12, p13, p14);
        }
    }

    public static final List<u> b(Context context, androidx.work.a aVar, b bVar, WorkDatabase workDatabase, n nVar, s sVar) {
        u uVarC = x.c(context, workDatabase, aVar);
        Intrinsics.checkNotNullExpressionValue(uVarC, "createBestAvailableBackgroundScheduler(...)");
        return p.n(uVarC, new a6.b(context, aVar, nVar, sVar, new d1(sVar, bVar), bVar));
    }

    @NotNull
    public static final f1 c(@NotNull Context context, @NotNull androidx.work.a configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return e(context, configuration, null, null, null, null, null, 124, null);
    }

    @NotNull
    public static final f1 d(@NotNull Context context, @NotNull androidx.work.a configuration, @NotNull b workTaskExecutor, @NotNull WorkDatabase workDatabase, @NotNull n trackers, @NotNull s processor, @NotNull q<? super Context, ? super androidx.work.a, ? super b, ? super WorkDatabase, ? super n, ? super s, ? extends List<? extends u>> schedulersCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(schedulersCreator, "schedulersCreator");
        return new f1(context.getApplicationContext(), configuration, workTaskExecutor, workDatabase, schedulersCreator.g(context, configuration, workTaskExecutor, workDatabase, trackers, processor), processor, trackers);
    }

    public static /* synthetic */ f1 e(Context context, androidx.work.a aVar, b bVar, WorkDatabase workDatabase, n nVar, s sVar, q qVar, int i10, Object obj) {
        n nVar2;
        if ((i10 & 4) != 0) {
            bVar = new c(aVar.getTaskExecutor());
        }
        b bVar2 = bVar;
        if ((i10 & 8) != 0) {
            WorkDatabase.Companion companion = WorkDatabase.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            i6.a aVarC = bVar2.c();
            Intrinsics.checkNotNullExpressionValue(aVarC, "getSerialTaskExecutor(...)");
            workDatabase = companion.b(applicationContext, aVarC, aVar.getClock(), context.getResources().getBoolean(i0.f37495a));
        }
        if ((i10 & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
            nVar2 = new n(applicationContext2, bVar2, null, null, null, null, 60, null);
        } else {
            nVar2 = nVar;
        }
        return d(context, aVar, bVar2, workDatabase, nVar2, (i10 & 32) != 0 ? new s(context.getApplicationContext(), aVar, bVar2, workDatabase) : sVar, (i10 & 64) != 0 ? C0071a.f3027a : qVar);
    }

    @NotNull
    public static final p0 f(@NotNull b taskExecutor) {
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        l0 l0VarB = taskExecutor.b();
        Intrinsics.checkNotNullExpressionValue(l0VarB, "getTaskCoroutineDispatcher(...)");
        return q0.a(l0VarB);
    }
}
