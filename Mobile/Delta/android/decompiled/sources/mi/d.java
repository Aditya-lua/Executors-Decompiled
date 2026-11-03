package mi;

import gt.n;
import gt.o;
import iu.g1;
import iu.i;
import iu.l0;
import iu.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nt.l;
import nt.m;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rh.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "conversationId", "", "conversationGuid", "message", "Lgt/n;", "b", "(JLjava/lang/String;Ljava/lang/String;Llt/b;)Ljava/lang/Object;", "", "a", "(JLjava/lang/String;Llt/b;)Ljava/lang/Object;", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {

    @nt.f(c = "com.roblox.client.job.ChatJobsKt$markConversationAsRead$2", f = "ChatJobs.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)Z"}, k = 3, mv = {2, 2, 0})
    public static final class a extends m implements Function2<p0, lt.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f24809t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f24810u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ long f24811v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, long j10, lt.b<? super a> bVar) {
            super(2, bVar);
            this.f24810u = str;
            this.f24811v = j10;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new a(this.f24810u, this.f24811v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Boolean> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            boolean zC;
            mt.c.e();
            if (this.f24809t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            if (h.a().y2()) {
                ResponseBody responseBodyA = tk.g.d().c().a(new zk.a(new String[]{this.f24810u})).execute().a();
                Intrinsics.checkNotNull(responseBodyA);
                zC = Intrinsics.c("success", new JSONObject(responseBodyA.string()).optString("status"));
            } else {
                ResponseBody responseBodyA2 = tk.g.d().c().d(new zk.b(new long[]{this.f24811v})).execute().a();
                Intrinsics.checkNotNull(responseBodyA2);
                zC = Intrinsics.c("success", new JSONObject(responseBodyA2.string()).optString("status"));
            }
            return nt.b.a(zC);
        }
    }

    @nt.f(c = "com.roblox.client.job.ChatJobsKt", f = "ChatJobs.kt", l = {23}, m = "sendChatMessage", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f24812t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f24813u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f24814v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f24815w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f24816x;

        public b(lt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24815w = obj;
            this.f24816x |= Integer.MIN_VALUE;
            Object objB = d.b(0L, null, null, this);
            return objB == mt.c.e() ? objB : n.a(objB);
        }
    }

    @nt.f(c = "com.roblox.client.job.ChatJobsKt$sendChatMessage$2", f = "ChatJobs.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liu/p0;", "Lgt/n;", "", "<anonymous>", "(Liu/p0;)Lgt/n;"}, k = 3, mv = {2, 2, 0})
    public static final class c extends m implements Function2<p0, lt.b<? super n<? extends String>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f24817t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f24818u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f24819v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ long f24820w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, long j10, lt.b<? super c> bVar) {
            super(2, bVar);
            this.f24818u = str;
            this.f24819v = str2;
            this.f24820w = j10;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new c(this.f24818u, this.f24819v, this.f24820w, bVar);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, lt.b<? super n<String>> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            Object objB;
            mt.c.e();
            if (this.f24817t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            String[] strArr = {this.f24818u};
            ResponseBody responseBodyA = (h.a().y2() ? tk.g.d().c().b(new zk.c(this.f24819v, strArr)).execute() : tk.g.d().c().c(new zk.d(this.f24820w, strArr)).execute()).a();
            Intrinsics.checkNotNull(responseBodyA);
            JSONArray jSONArray = new JSONObject(responseBodyA.string()).getJSONArray("messages");
            if (jSONArray.length() > 0) {
                JSONObject jSONObject = jSONArray.getJSONObject(0);
                String string = jSONObject.getString("status");
                if (Intrinsics.c("success", string)) {
                    n.Companion companion = n.INSTANCE;
                    objB = n.b(jSONObject.getString("id"));
                } else {
                    n.Companion companion2 = n.INSTANCE;
                    Intrinsics.checkNotNull(string);
                    objB = n.b(o.a(new e(string, "Send Failed")));
                }
            } else {
                n.Companion companion3 = n.INSTANCE;
                objB = n.b(o.a(new e("failed", "No messages in the response")));
            }
            return n.a(objB);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, lt.b<? super n<? extends String>> bVar) {
            return invoke2(p0Var, (lt.b<? super n<String>>) bVar);
        }
    }

    @Nullable
    public static final Object a(long j10, @Nullable String str, @NotNull lt.b<? super Boolean> bVar) {
        return i.g(g1.b(), new a(str, j10, null), bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object b(long j10, @Nullable String str, @NotNull String str2, @NotNull lt.b<? super n<String>> bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f24816x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f24816x = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object objG = bVar2.f24815w;
        Object objE = mt.c.e();
        int i11 = bVar2.f24816x;
        if (i11 == 0) {
            o.b(objG);
            l0 l0VarB = g1.b();
            c cVar = new c(str2, str, j10, null);
            bVar2.f24813u = l.a(str);
            bVar2.f24814v = l.a(str2);
            bVar2.f24812t = j10;
            bVar2.f24816x = 1;
            objG = i.g(l0VarB, cVar, bVar2);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(objG);
        }
        return ((n) objG).getValue();
    }
}
