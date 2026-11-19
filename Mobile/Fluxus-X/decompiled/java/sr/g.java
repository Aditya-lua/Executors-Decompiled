package sr;

import com.github.luben.zstd.BuildConfig;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import nn.s;
import nn.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\f\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001f\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0011\u0010\"\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010%\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010$¨\u0006&"}, d2 = {"Lsr/g;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "initialValue", "monthPlaceholder", BuildConfig.FLAVOR, "monthList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "year", "month", "day", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/List;", "getMonthList", "()Ljava/util/List;", "Lnn/s;", "b", "Lnn/s;", "g", "()Lnn/s;", "yearController", "c", "d", "monthController", "dayController", "Ldv/h;", "e", "Ldv/h;", "()Ldv/h;", "onChanged", "f", "()Ljava/lang/String;", "value", "Ljava/util/Date;", "()Ljava/util/Date;", "dateValue", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> monthList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final s yearController;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s monthController;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s dayController;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dv.h<String> onChanged;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.steps.ui.components.utils.DateController$1", f = "DateController.kt", l = {60}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function2<dv.i<? super String>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31889t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f31890u;

        /* JADX INFO: renamed from: sr.g$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0638a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ dv.i<String> f31892a;
            public final /* synthetic */ g b;

            /* JADX WARN: Multi-variable type inference failed */
            public C0638a(dv.i<? super String> iVar, g gVar) {
                this.f31892a = iVar;
                this.b = gVar;
            }

            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, eu.b<? super Unit> bVar) {
                Object objEmit = this.f31892a.emit(this.b.f(), bVar);
                return objEmit == fu.c.e() ? objEmit : Unit.f21506a;
            }
        }

        public a(eu.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            a aVar = g.this.new a(bVar);
            aVar.f31890u = obj;
            return aVar;
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            dv.i iVar = (dv.i) this.f31890u;
            Object objE = fu.c.e();
            int i10 = this.f31889t;
            if (i10 == 0) {
                zt.o.b(obj);
                dv.h hVarC = dv.j.C(g.this.getYearController().a(), g.this.getMonthController().a(), g.this.getDayController().a());
                C0638a c0638a = new C0638a(iVar, g.this);
                this.f31890u = gu.l.a(iVar);
                this.f31889t = 1;
                if (hVarC.collect(c0638a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dv.i<? super String> iVar, eu.b<? super Unit> bVar) {
            return ((a) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public g(@Nullable String str, @Nullable String str2, @NotNull List<String> monthList) {
        String str3;
        Intrinsics.checkNotNullParameter(monthList, "monthList");
        this.monthList = monthList;
        List listN0 = str != null ? StringsKt.N0(str, new char[]{'-'}, false, 0, 6, null) : null;
        listN0 = (listN0 == null || listN0.size() != 3) ? p001kotlin.collections.p.n(BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR) : listN0;
        this.yearController = v.a((String) listN0.get(0));
        try {
            str3 = monthList.get(Integer.parseInt((String) listN0.get(1)) - 1);
        } catch (NumberFormatException unused) {
            str3 = str2 == null ? BuildConfig.FLAVOR : str2;
        }
        this.monthController = v.a(str3);
        this.dayController = v.a((String) listN0.get(2));
        this.onChanged = dv.j.w(new a(null));
    }

    public final String a(String year, String month, String day) {
        int iH0 = CollectionsKt.h0(this.monthList, month);
        String strY0 = iH0 > -1 ? StringsKt.y0(String.valueOf(iH0 + 1), 2, '0') : null;
        if (year == null || year.length() == 0 || strY0 == null || strY0.length() == 0 || day == null || day.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        return year + "-" + strY0 + "-" + day;
    }

    @Nullable
    public final Date b() {
        try {
            List listN0 = StringsKt.N0(f(), new char[]{'-'}, false, 0, 6, null);
            Calendar calendar = Calendar.getInstance();
            calendar.set(1, Integer.parseInt((String) listN0.get(0)));
            calendar.set(2, Integer.parseInt((String) listN0.get(1)) - 1);
            calendar.set(5, Integer.parseInt((String) listN0.get(2)));
            return calendar.getTime();
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final s getDayController() {
        return this.dayController;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final s getMonthController() {
        return this.monthController;
    }

    @NotNull
    public final dv.h<String> e() {
        return this.onChanged;
    }

    @NotNull
    public final String f() {
        return a(this.yearController.b(), this.monthController.b(), this.dayController.b());
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final s getYearController() {
        return this.yearController;
    }
}
