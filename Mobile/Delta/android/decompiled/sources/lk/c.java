package lk;

import android.content.Context;
import gk.p;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import jt.n;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import ku.g1;
import ku.i;
import ku.l0;
import ku.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.l;
import pt.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u000e\u0010\rJ \u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0010\u0010\nJ!\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Llk/c;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "newData", "", "b", "(Landroid/content/Context;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "Ljt/n;", "d", "(Landroid/content/Context;Lnt/b;)Ljava/lang/Object;", "a", "data", "e", "fileName", "c", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)Z"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetFileProvider$isCacheStale$2", f = "RecentlyPlayedWidgetFileProvider.kt", l = {13}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, nt.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23339t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Context f23341v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f23342w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, String str, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f23341v = context;
            this.f23342w = str;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return c.this.new b(this.f23341v, this.f23342w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objD;
            Object objE = ot.c.e();
            int i10 = this.f23339t;
            if (i10 == 0) {
                o.b(obj);
                c cVar = c.this;
                Context context = this.f23341v;
                this.f23339t = 1;
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
            String str = this.f23342w;
            if (n.h(objD)) {
                objD = pt.b.a(!Intrinsics.c((String) objD, str));
            }
            Object objB = n.b(objD);
            Throwable thE = n.e(objB);
            if (thE == null) {
                return objB;
            }
            p.f("RecentlyPlayedWidgetFileProvider", "Encountered error while checking if recently played cache is stale", thE);
            return pt.b.a(true);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Boolean> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX INFO: renamed from: lk.c$c, reason: collision with other inner class name */
    @pt.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetFileProvider", f = "RecentlyPlayedWidgetFileProvider.kt", l = {21}, m = "readCache-gIAlu-s", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C0415c extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f23343t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f23344u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f23346w;

        public C0415c(nt.b<? super C0415c> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f23344u = obj;
            this.f23346w |= Integer.MIN_VALUE;
            Object objD = c.this.d(null, this);
            return objD == ot.c.e() ? objD : n.a(objD);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "Ljt/n;", "", "<anonymous>", "(Lku/p0;)Ljt/n;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetFileProvider$readCache$2", f = "RecentlyPlayedWidgetFileProvider.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<p0, nt.b<? super n<? extends String>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23347t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Context f23349v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, nt.b<? super d> bVar) {
            super(2, bVar);
            this.f23349v = context;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return c.this.new d(this.f23349v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, nt.b<? super n<? extends String>> bVar) {
            return invoke2(p0Var, (nt.b<? super n<String>>) bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f23347t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return n.a(c.this.c(this.f23349v, "recently_played_widget_data.json"));
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, nt.b<? super n<String>> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)Z"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetFileProvider$writeCache$2", f = "RecentlyPlayedWidgetFileProvider.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class e extends m implements Function2<p0, nt.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23350t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f23351u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f23352v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, String str, nt.b<? super e> bVar) {
            super(2, bVar);
            this.f23351u = context;
            this.f23352v = str;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new e(this.f23351u, this.f23352v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f23350t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            boolean z10 = false;
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = this.f23351u.openFileOutput("recently_played_widget_data.json", 0);
                try {
                    byte[] bytes = this.f23352v.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    fileOutputStreamOpenFileOutput.write(bytes);
                    Unit unit = Unit.f22483a;
                    ut.c.a(fileOutputStreamOpenFileOutput, null);
                    z10 = true;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ut.c.a(fileOutputStreamOpenFileOutput, th2);
                        throw th3;
                    }
                }
            } catch (IOException e10) {
                p.f("RecentlyPlayedWidgetFileProvider", "Error writing recently played cache", e10);
            }
            return pt.b.a(z10);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Boolean> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Nullable
    public final Object a(@NotNull Context context, @NotNull nt.b<? super Boolean> bVar) {
        File file = new File(context.getFilesDir(), "recently_played_widget_data.json");
        return pt.b.a(file.exists() ? file.delete() : true);
    }

    @Nullable
    public final Object b(@NotNull Context context, @NotNull String str, @NotNull nt.b<? super Boolean> bVar) {
        return i.g(g1.b(), new b(context, str, null), bVar);
    }

    @NotNull
    public final Object c(@NotNull Context readBlocking, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(readBlocking, "$this$readBlocking");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        try {
            n.Companion companion = n.INSTANCE;
            File file = new File(readBlocking.getFilesDir(), fileName);
            return n.b(file.exists() ? ut.i.i(file, null, 1, null) : null);
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            return n.b(o.a(th2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object d(@NotNull Context context, @NotNull nt.b<? super n<String>> bVar) {
        C0415c c0415c;
        if (bVar instanceof C0415c) {
            c0415c = (C0415c) bVar;
            int i10 = c0415c.f23346w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0415c.f23346w = i10 - Integer.MIN_VALUE;
            } else {
                c0415c = new C0415c(bVar);
            }
        } else {
            c0415c = new C0415c(bVar);
        }
        Object objG = c0415c.f23344u;
        Object objE = ot.c.e();
        int i11 = c0415c.f23346w;
        if (i11 == 0) {
            o.b(objG);
            l0 l0VarB = g1.b();
            d dVar = new d(context, null);
            c0415c.f23343t = l.a(context);
            c0415c.f23346w = 1;
            objG = i.g(l0VarB, dVar, c0415c);
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
    public final Object e(@NotNull Context context, @NotNull String str, @NotNull nt.b<? super Boolean> bVar) {
        return i.g(g1.b(), new e(context, str, null), bVar);
    }
}
