package p333oi;

import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031bl.C1445a;
import p031bl.C1446b;
import p031bl.C1447c;
import p031bl.C1448d;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.AbstractC7888l0;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p493vk.C12225g;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;
import th.C11659h;

/* JADX INFO: renamed from: oi.d */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"", "conversationId", "", "conversationGuid", "message", "Ljt/n;", "b", "(JLjava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "", "a", "(JLjava/lang/String;Lnt/b;)Ljava/lang/Object;", "NativeShell_googleProdRelease"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C9738d {

    /* JADX INFO: renamed from: oi.d$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)Z"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.job.ChatJobsKt$markConversationAsRead$2", m39664f = "ChatJobs.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t */
        public int f35438t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ String f35439u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ long f35440v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, long j10, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f35439u = str;
            this.f35440v = j10;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new a(this.f35439u, this.f35440v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            boolean zM31980c;
            C10047c.m38805e();
            if (this.f35438t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            if (C11659h.m43403a().mo43718s2()) {
                ResponseBody responseBodyM30653a = C12225g.m45326d().mo45318d().m50321c(new C1445a(new String[]{this.f35439u})).execute().m30653a();
                Intrinsics.checkNotNull(responseBodyM30653a);
                zM31980c = Intrinsics.m31980c("success", new JSONObject(responseBodyM30653a.string()).optString(NotificationCompat.CATEGORY_STATUS));
            } else {
                ResponseBody responseBodyM30653a2 = C12225g.m45326d().mo45318d().m50320b(new C1446b(new long[]{this.f35440v})).execute().m30653a();
                Intrinsics.checkNotNull(responseBodyM30653a2);
                zM31980c = Intrinsics.m31980c("success", new JSONObject(responseBodyM30653a2.string()).optString(NotificationCompat.CATEGORY_STATUS));
            }
            return C10340b.m39658a(zM31980c);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Boolean> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: oi.d$b */
    @InterfaceC10344f(m39663c = "com.roblox.client.job.ChatJobsKt", m39664f = "ChatJobs.kt", m39665l = {23}, m39666m = "sendChatMessage", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public long f35441t;

        /* JADX INFO: renamed from: u */
        public Object f35442u;

        /* JADX INFO: renamed from: v */
        public Object f35443v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f35444w;

        /* JADX INFO: renamed from: x */
        public int f35445x;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35444w = obj;
            this.f35445x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objM38533b = C9738d.m38533b(0L, null, null, this);
            return objM38533b == C10047c.m38805e() ? objM38533b : C7347n.m30459a(objM38533b);
        }
    }

    /* JADX INFO: renamed from: oi.d$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Ljt/n;", "", "<anonymous>", "(Lku/p0;)Ljt/n;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.job.ChatJobsKt$sendChatMessage$2", m39664f = "ChatJobs.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super C7347n<? extends String>>, Object> {

        /* JADX INFO: renamed from: t */
        public int f35446t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ String f35447u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f35448v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ long f35449w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, long j10, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f35447u = str;
            this.f35448v = str2;
            this.f35449w = j10;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new c(this.f35447u, this.f35448v, this.f35449w, interfaceC9557b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C7347n<? extends String>> interfaceC9557b) {
            return invoke2(interfaceC7906p0, (InterfaceC9557b<? super C7347n<String>>) interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) throws JSONException {
            Object objM30460b;
            C10047c.m38805e();
            if (this.f35446t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            String[] strArr = {this.f35447u};
            ResponseBody responseBodyM30653a = (C11659h.m43403a().mo43718s2() ? C12225g.m45326d().mo45318d().m50322d(new C1447c(this.f35448v, strArr)).execute() : C12225g.m45326d().mo45318d().m50319a(new C1448d(this.f35449w, strArr)).execute()).m30653a();
            Intrinsics.checkNotNull(responseBodyM30653a);
            JSONArray jSONArray = new JSONObject(responseBodyM30653a.string()).getJSONArray("messages");
            if (jSONArray.length() > 0) {
                JSONObject jSONObject = jSONArray.getJSONObject(0);
                String string = jSONObject.getString(NotificationCompat.CATEGORY_STATUS);
                if (Intrinsics.m31980c("success", string)) {
                    C7347n.Companion companion = C7347n.INSTANCE;
                    objM30460b = C7347n.m30460b(jSONObject.getString("id"));
                } else {
                    C7347n.Companion companion2 = C7347n.INSTANCE;
                    Intrinsics.checkNotNull(string);
                    objM30460b = C7347n.m30460b(C7348o.m30469a(new C9739e(string, "Send Failed")));
                }
            } else {
                C7347n.Companion companion3 = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(new C9739e("failed", "No messages in the response")));
            }
            return C7347n.m30459a(objM30460b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C7347n<String>> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m38532a(long j10, @Nullable String str, @NotNull InterfaceC9557b<? super Boolean> interfaceC9557b) {
        return C7872i.m32684g(C7864g1.m32644b(), new a(str, j10, null), interfaceC9557b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Object m38533b(long j10, @Nullable String str, @NotNull String str2, @NotNull InterfaceC9557b<? super C7347n<String>> interfaceC9557b) {
        b bVar;
        if (interfaceC9557b instanceof b) {
            bVar = (b) interfaceC9557b;
            int i10 = bVar.f35445x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                bVar.f35445x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                bVar = new b(interfaceC9557b);
            }
        } else {
            bVar = new b(interfaceC9557b);
        }
        Object objM32684g = bVar.f35444w;
        Object objM38805e = C10047c.m38805e();
        int i11 = bVar.f35445x;
        if (i11 == 0) {
            C7348o.m30470b(objM32684g);
            AbstractC7888l0 abstractC7888l0M32644b = C7864g1.m32644b();
            c cVar = new c(str2, str, j10, null);
            bVar.f35442u = C10350l.m39676a(str);
            bVar.f35443v = C10350l.m39676a(str2);
            bVar.f35441t = j10;
            bVar.f35445x = 1;
            objM32684g = C7872i.m32684g(abstractC7888l0M32644b, cVar, bVar);
            if (objM32684g == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objM32684g);
        }
        return ((C7347n) objM32684g).getValue();
    }
}
