package jk;

import android.content.Context;
import ek.q;
import gt.n;
import gt.o;
import iu.g1;
import iu.i;
import iu.l0;
import iu.p0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import nt.l;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u000e\u0010\rJ \u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0010\u0010\nJ!\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ljk/c;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "newData", "", "b", "(Landroid/content/Context;Ljava/lang/String;Llt/b;)Ljava/lang/Object;", "Lgt/n;", "d", "(Landroid/content/Context;Llt/b;)Ljava/lang/Object;", "a", "data", "e", "fileName", "c", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    @nt.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetFileProvider$isCacheStale$2", f = "RecentlyPlayedWidgetFileProvider.kt", l = {13}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)Z"}, k = 3, mv = {2, 2, 0})
    public static final class b extends m implements Function2<p0, lt.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f21992t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Context f21994v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f21995w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, String str, lt.b<? super b> bVar) {
            super(2, bVar);
            this.f21994v = context;
            this.f21995w = str;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return c.this.new b(this.f21994v, this.f21995w, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Boolean> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objD;
            Object objE = mt.c.e();
            int i10 = this.f21992t;
            if (i10 == 0) {
                o.b(obj);
                c cVar = c.this;
                Context context = this.f21994v;
                this.f21992t = 1;
                objD = cVar.d(context, this);
                if (objD == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                objD = ((n) obj).getValue();
            }
            String str = this.f21995w;
            if (n.h(objD)) {
                objD = nt.b.a(!Intrinsics.c((String) objD, str));
            }
            Object objB = n.b(objD);
            Throwable thE = n.e(objB);
            if (thE == null) {
                return objB;
            }
            q.f("RecentlyPlayedWidgetFileProvider", "Encountered error while checking if recently played cache is stale", thE);
            return nt.b.a(true);
        }
    }

    /* JADX INFO: renamed from: jk.c$c, reason: collision with other inner class name */
    @nt.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetFileProvider", f = "RecentlyPlayedWidgetFileProvider.kt", l = {21}, m = "readCache-gIAlu-s", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C0383c extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f21996t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f21997u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f21999w;

        public C0383c(lt.b<? super C0383c> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21997u = obj;
            this.f21999w |= Integer.MIN_VALUE;
            Object objD = c.this.d(null, this);
            return objD == mt.c.e() ? objD : n.a(objD);
        }
    }

    @nt.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetFileProvider$readCache$2", f = "RecentlyPlayedWidgetFileProvider.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liu/p0;", "Lgt/n;", "", "<anonymous>", "(Liu/p0;)Lgt/n;"}, k = 3, mv = {2, 2, 0})
    public static final class d extends m implements Function2<p0, lt.b<? super n<? extends String>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22000t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Context f22002v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, lt.b<? super d> bVar) {
            super(2, bVar);
            this.f22002v = context;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return c.this.new d(this.f22002v, bVar);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, lt.b<? super n<String>> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f22000t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return n.a(c.this.c(this.f22002v, "recently_played_widget_data.json"));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, lt.b<? super n<? extends String>> bVar) {
            return invoke2(p0Var, (lt.b<? super n<String>>) bVar);
        }
    }

    @nt.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetFileProvider$writeCache$2", f = "RecentlyPlayedWidgetFileProvider.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)Z"}, k = 3, mv = {2, 2, 0})
    public static final class e extends m implements Function2<p0, lt.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22003t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f22004u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f22005v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, String str, lt.b<? super e> bVar) {
            super(2, bVar);
            this.f22004u = context;
            this.f22005v = str;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new e(this.f22004u, this.f22005v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Boolean> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f22003t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            boolean z10 = false;
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = this.f22004u.openFileOutput("recently_played_widget_data.json", 0);
                try {
                    byte[] bytes = this.f22005v.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    fileOutputStreamOpenFileOutput.write(bytes);
                    Unit unit = Unit.f22938a;
                    st.c.a(fileOutputStreamOpenFileOutput, null);
                    z10 = true;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        st.c.a(fileOutputStreamOpenFileOutput, th2);
                        throw th3;
                    }
                }
            } catch (IOException e10) {
                q.f("RecentlyPlayedWidgetFileProvider", "Error writing recently played cache", e10);
            }
            return nt.b.a(z10);
        }
    }

    @Nullable
    public final Object a(@NotNull Context context, @NotNull lt.b<? super Boolean> bVar) {
        File file = new File(context.getFilesDir(), "recently_played_widget_data.json");
        return nt.b.a(file.exists() ? file.delete() : true);
    }

    @Nullable
    public final Object b(@NotNull Context context, @NotNull String str, @NotNull lt.b<? super Boolean> bVar) {
        return i.g(g1.b(), new b(context, str, null), bVar);
    }

    @NotNull
    public final Object c(@NotNull Context readBlocking, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(readBlocking, "$this$readBlocking");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        try {
            n.Companion companion = n.INSTANCE;
            File file = new File(readBlocking.getFilesDir(), fileName);
            return n.b(file.exists() ? st.i.i(file, null, 1, null) : null);
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            return n.b(o.a(th2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object d(@NotNull Context context, @NotNull lt.b<? super n<String>> bVar) {
        C0383c c0383c;
        if (bVar instanceof C0383c) {
            c0383c = (C0383c) bVar;
            int i10 = c0383c.f21999w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0383c.f21999w = i10 - Integer.MIN_VALUE;
            } else {
                c0383c = new C0383c(bVar);
            }
        } else {
            c0383c = new C0383c(bVar);
        }
        Object objG = c0383c.f21997u;
        Object objE = mt.c.e();
        int i11 = c0383c.f21999w;
        if (i11 == 0) {
            o.b(objG);
            l0 l0VarB = g1.b();
            d dVar = new d(context, null);
            c0383c.f21996t = l.a(context);
            c0383c.f21999w = 1;
            objG = i.g(l0VarB, dVar, c0383c);
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

    @Nullable
    public final Object e(@NotNull Context context, @NotNull String str, @NotNull lt.b<? super Boolean> bVar) {
        return i.g(g1.b(), new e(context, str, null), bVar);
    }
}
