package tk;

import android.content.Context;
import av.g1;
import av.i;
import av.l0;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import gu.l;
import gu.m;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import ok.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.Charsets;
import zt.n;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u000e\u0010\rJ \u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0010\u0010\nJ!\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ltk/c;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "newData", BuildConfig.FLAVOR, "b", "(Landroid/content/Context;Ljava/lang/String;Leu/b;)Ljava/lang/Object;", "Lzt/n;", "d", "(Landroid/content/Context;Leu/b;)Ljava/lang/Object;", "a", "data", "e", "fileName", "c", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)Z"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetFileProvider$isCacheStale$2", f = "RecentlyPlayedWidgetFileProvider.kt", l = {13}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, eu.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32504t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Context f32506v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f32507w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, String str, eu.b<? super b> bVar) {
            super(2, bVar);
            this.f32506v = context;
            this.f32507w = str;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return c.this.new b(this.f32506v, this.f32507w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Boolean> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objD;
            Object objE = fu.c.e();
            int i10 = this.f32504t;
            if (i10 == 0) {
                o.b(obj);
                c cVar = c.this;
                Context context = this.f32506v;
                this.f32504t = 1;
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
            String str = this.f32507w;
            if (n.h(objD)) {
                objD = gu.b.a(!Intrinsics.c((String) objD, str));
            }
            Object objB = n.b(objD);
            Throwable thE = n.e(objB);
            if (thE == null) {
                return objB;
            }
            q.f("RecentlyPlayedWidgetFileProvider", "Encountered error while checking if recently played cache is stale", thE);
            return gu.b.a(true);
        }
    }

    /* JADX INFO: renamed from: tk.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetFileProvider", f = "RecentlyPlayedWidgetFileProvider.kt", l = {21}, m = "readCache-gIAlu-s", v = 1)
    public static final class C0651c extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f32508t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f32509u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f32511w;

        public C0651c(eu.b<? super C0651c> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32509u = obj;
            this.f32511w |= Integer.MIN_VALUE;
            Object objD = c.this.d(null, this);
            return objD == fu.c.e() ? objD : n.a(objD);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", "Lzt/n;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)Lzt/n;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetFileProvider$readCache$2", f = "RecentlyPlayedWidgetFileProvider.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<p0, eu.b<? super n<? extends String>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32512t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Context f32514v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, eu.b<? super d> bVar) {
            super(2, bVar);
            this.f32514v = context;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return c.this.new d(this.f32514v, bVar);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, eu.b<? super n<String>> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f32512t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return n.a(c.this.c(this.f32514v, "recently_played_widget_data.json"));
        }

        @Override // p001kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, eu.b<? super n<? extends String>> bVar) {
            return invoke2(p0Var, (eu.b<? super n<String>>) bVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)Z"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetFileProvider$writeCache$2", f = "RecentlyPlayedWidgetFileProvider.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class e extends m implements Function2<p0, eu.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32515t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f32516u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f32517v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, String str, eu.b<? super e> bVar) {
            super(2, bVar);
            this.f32516u = context;
            this.f32517v = str;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new e(this.f32516u, this.f32517v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Boolean> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f32515t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            boolean z10 = false;
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = this.f32516u.openFileOutput("recently_played_widget_data.json", 0);
                try {
                    byte[] bytes = this.f32517v.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    fileOutputStreamOpenFileOutput.write(bytes);
                    Unit unit = Unit.f21506a;
                    lu.c.a(fileOutputStreamOpenFileOutput, null);
                    z10 = true;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        lu.c.a(fileOutputStreamOpenFileOutput, th2);
                        throw th3;
                    }
                }
            } catch (IOException e10) {
                q.f("RecentlyPlayedWidgetFileProvider", "Error writing recently played cache", e10);
            }
            return gu.b.a(z10);
        }
    }

    @Nullable
    public final Object a(@NotNull Context context, @NotNull eu.b<? super Boolean> bVar) {
        File file = new File(context.getFilesDir(), "recently_played_widget_data.json");
        return gu.b.a(file.exists() ? file.delete() : true);
    }

    @Nullable
    public final Object b(@NotNull Context context, @NotNull String str, @NotNull eu.b<? super Boolean> bVar) {
        return i.g(g1.b(), new b(context, str, null), bVar);
    }

    @NotNull
    public final Object c(@NotNull Context readBlocking, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(readBlocking, "$this$readBlocking");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        try {
            n.Companion companion = n.INSTANCE;
            File file = new File(readBlocking.getFilesDir(), fileName);
            return n.b(file.exists() ? lu.i.i(file, null, 1, null) : null);
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            return n.b(o.a(th2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object d(@NotNull Context context, @NotNull eu.b<? super n<String>> bVar) {
        C0651c c0651c;
        if (bVar instanceof C0651c) {
            c0651c = (C0651c) bVar;
            int i10 = c0651c.f32511w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0651c.f32511w = i10 - Integer.MIN_VALUE;
            } else {
                c0651c = new C0651c(bVar);
            }
        } else {
            c0651c = new C0651c(bVar);
        }
        Object objG = c0651c.f32509u;
        Object objE = fu.c.e();
        int i11 = c0651c.f32511w;
        if (i11 == 0) {
            o.b(objG);
            l0 l0VarB = g1.b();
            d dVar = new d(context, null);
            c0651c.f32508t = l.a(context);
            c0651c.f32511w = 1;
            objG = i.g(l0VarB, dVar, c0651c);
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
    public final Object e(@NotNull Context context, @NotNull String str, @NotNull eu.b<? super Boolean> bVar) {
        return i.g(g1.b(), new e(context, str, null), bVar);
    }
}
