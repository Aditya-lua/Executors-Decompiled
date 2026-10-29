package er;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0392u;
import p016an.InterfaceC0389r;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: er.g */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\f\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001f\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0011\u0010\"\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010%\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010$¨\u0006&"}, m31665d2 = {"Ler/g;", "", "", "initialValue", "monthPlaceholder", "", "monthList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "year", "month", "day", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/List;", "getMonthList", "()Ljava/util/List;", "Lan/r;", "b", "Lan/r;", "g", "()Lan/r;", "yearController", "c", "d", "monthController", "dayController", "Lnu/h;", "e", "Lnu/h;", "()Lnu/h;", "onChanged", "f", "()Ljava/lang/String;", "value", "Ljava/util/Date;", "()Ljava/util/Date;", "dateValue", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5198g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<String> monthList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC0389r yearController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC0389r monthController;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC0389r dayController;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9575h<String> onChanged;

    /* JADX INFO: renamed from: er.g$a */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.steps.ui.components.utils.DateController$1", m39664f = "DateController.kt", m39665l = {60}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC9577i<? super String>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f20229t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f20230u;

        /* JADX INFO: renamed from: er.g$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C14167a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9577i<String> f20232a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C5198g f20233b;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.i<? super java.lang.String> */
            /* JADX WARN: Multi-variable type inference failed */
            public C14167a(InterfaceC9577i<? super String> interfaceC9577i, C5198g c5198g) {
                this.f20232a = interfaceC9577i;
                this.f20233b = c5198g;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, InterfaceC9557b<? super Unit> interfaceC9557b) {
                Object objEmit = this.f20232a.emit(this.f20233b.m24121f(), interfaceC9557b);
                return objEmit == C10047c.m38805e() ? objEmit : Unit.f29331a;
            }
        }

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            a aVar = C5198g.this.new a(interfaceC9557b);
            aVar.f20230u = obj;
            return aVar;
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f20230u;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f20229t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9575h interfaceC9575hM37766C = C9579j.m37766C(C5198g.this.getYearController().mo1449a(), C5198g.this.getMonthController().mo1449a(), C5198g.this.getDayController().mo1449a());
                C14167a c14167a = new C14167a(interfaceC9577i, C5198g.this);
                this.f20230u = C10350l.m39676a(interfaceC9577i);
                this.f20229t = 1;
                if (interfaceC9575hM37766C.collect(c14167a, this) == objM38805e) {
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

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super String> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C5198g(@Nullable String str, @Nullable String str2, @NotNull List<String> monthList) {
        String str3;
        Intrinsics.checkNotNullParameter(monthList, "monthList");
        this.monthList = monthList;
        List listP0 = str != null ? StringsKt.m32135P0(str, new char[]{'-'}, false, 0, 6, null) : null;
        listP0 = (listP0 == null || listP0.size() != 3) ? C7699p.m31895n("", "", "") : listP0;
        this.yearController = C0392u.m1458a((String) listP0.get(0));
        try {
            str3 = monthList.get(Integer.parseInt((String) listP0.get(1)) - 1);
        } catch (NumberFormatException unused) {
            str3 = str2 == null ? "" : str2;
        }
        this.monthController = C0392u.m1458a(str3);
        this.dayController = C0392u.m1458a((String) listP0.get(2));
        this.onChanged = C9579j.m37806w(new a(null));
    }

    /* JADX INFO: renamed from: a */
    public final String m24116a(String year, String month, String day) {
        int iH0 = CollectionsKt.m31710h0(this.monthList, month);
        String strY0 = iH0 > -1 ? StringsKt.m32195y0(String.valueOf(iH0 + 1), 2, '0') : null;
        if (year == null || year.length() == 0 || strY0 == null || strY0.length() == 0 || day == null || day.length() == 0) {
            return "";
        }
        return year + "-" + strY0 + "-" + day;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Date m24117b() {
        try {
            List listP0 = StringsKt.m32135P0(m24121f(), new char[]{'-'}, false, 0, 6, null);
            Calendar calendar = Calendar.getInstance();
            calendar.set(1, Integer.parseInt((String) listP0.get(0)));
            calendar.set(2, Integer.parseInt((String) listP0.get(1)) - 1);
            calendar.set(5, Integer.parseInt((String) listP0.get(2)));
            return calendar.getTime();
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC0389r getDayController() {
        return this.dayController;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC0389r getMonthController() {
        return this.monthController;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final InterfaceC9575h<String> m24120e() {
        return this.onChanged;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m24121f() {
        return m24116a(this.yearController.mo1450b(), this.monthController.mo1450b(), this.dayController.mo1450b());
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final InterfaceC0389r getYearController() {
        return this.yearController;
    }
}
