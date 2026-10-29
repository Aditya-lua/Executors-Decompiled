package p333oi;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p078dh.C4607a;
import p078dh.C4608b;
import p080dl.C4640a;
import p080dl.C4641b;
import p104ei.C5125c;
import p104ei.C5132j;
import p138fv.C5840c;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p493vk.C12225g;
import p607zk.InterfaceC13833m;
import ph.C10253b;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;
import sg.C11295a1;

/* JADX INFO: renamed from: oi.g */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001e\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006H\u0086@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"", "userId", "", "c", "(JLnt/b;)Ljava/lang/Object;", "a", "", "userIds", "b", "(Ljava/util/List;Lnt/b;)Ljava/lang/Object;", "NativeShell_googleProdRelease"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C9741g {

    /* JADX INFO: renamed from: oi.g$a */
    @InterfaceC10344f(m39663c = "com.roblox.client.job.UserJobsKt", m39664f = "UserJobs.kt", m39665l = {36}, m39666m = "fetchAvatarHeadshots", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f35464t;

        /* JADX INFO: renamed from: u */
        public Object f35465u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f35466v;

        /* JADX INFO: renamed from: w */
        public int f35467w;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35466v = obj;
            this.f35467w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C9741g.m38542b(null, this);
        }
    }

    /* JADX INFO: renamed from: oi.g$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.job.UserJobsKt$fetchUserAndHeadshot$2", m39664f = "UserJobs.kt", m39665l = {24}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f35468t;

        /* JADX INFO: renamed from: u */
        public Object f35469u;

        /* JADX INFO: renamed from: v */
        public Object f35470v;

        /* JADX INFO: renamed from: w */
        public Object f35471w;

        /* JADX INFO: renamed from: x */
        public Object f35472x;

        /* JADX INFO: renamed from: y */
        public int f35473y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ long f35474z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f35474z = j10;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new b(this.f35474z, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f35473y;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                String strM42432Z = C11295a1.m42432Z(this.f35474z);
                C5132j c5132jM23925i = C5125c.m23925i(strM42432Z, null, null);
                String strM23932a = c5132jM23925i.m23932a();
                JSONObject jSONObject = new JSONObject(strM23932a);
                C4607a c4607a = new C4607a(jSONObject.optLong("id", -1L), jSONObject.optString("displayName"));
                C4608b.m22756b().m22760e(c4607a);
                long j10 = this.f35474z;
                this.f35468t = C10350l.m39676a(strM42432Z);
                this.f35469u = C10350l.m39676a(c5132jM23925i);
                this.f35470v = C10350l.m39676a(strM23932a);
                this.f35471w = C10350l.m39676a(jSONObject);
                this.f35472x = C10350l.m39676a(c4607a);
                this.f35473y = 1;
                if (C9741g.m38541a(j10, this) == objM38805e) {
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
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m38541a(long j10, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM38542b = m38542b(C7697o.m31878d(C10340b.m39662e(j10)), interfaceC9557b);
        return objM38542b == C10047c.m38805e() ? objM38542b : Unit.f29331a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Object m38542b(@NotNull List<Long> list, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        a aVar;
        C4607a c4607aM22759d;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f35467w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f35467w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(interfaceC9557b);
            }
        } else {
            aVar = new a(interfaceC9557b);
        }
        a aVar2 = aVar;
        Object objM50329a = aVar2.f35466v;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar2.f35467w;
        if (i11 == 0) {
            C7348o.m30470b(objM50329a);
            if (list.isEmpty()) {
                return Unit.f29331a;
            }
            String strM0 = CollectionsKt.m31715m0(list, ",", null, null, 0, null, null, 62, null);
            InterfaceC13833m interfaceC13833mMo45319e = C12225g.m45326d().mo45319e();
            aVar2.f35464t = C10350l.m39676a(list);
            aVar2.f35465u = C10350l.m39676a(strM0);
            aVar2.f35467w = 1;
            objM50329a = interfaceC13833mMo45319e.m50329a(strM0, "150x150", "Png", false, aVar2);
            if (objM50329a == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objM50329a);
        }
        List listM31877c = C7697o.m31877c();
        for (C4640a c4640a : ((C4641b) objM50329a).data) {
            String str = c4640a.imageUrl;
            if (str != null && str.length() != 0 && (c4607aM22759d = C4608b.m22756b().m22759d(c4640a.targetId)) != null) {
                c4607aM22759d.m22751e(c4640a.imageUrl);
            }
            listM31877c.add(C10340b.m39662e(c4640a.targetId));
        }
        C5840c.m26204d().m26211j(new C10253b(new ArrayList(C7697o.m31875a(listM31877c))));
        return Unit.f29331a;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final Object m38543c(long j10, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM32684g = C7872i.m32684g(C7864g1.m32644b(), new b(j10, null), interfaceC9557b);
        return objM32684g == C10047c.m38805e() ? objM32684g : Unit.f29331a;
    }
}
