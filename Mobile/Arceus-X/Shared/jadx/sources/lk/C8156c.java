package lk;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6124q;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.AbstractC7888l0;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p477ut.C11958c;
import p477ut.C11964i;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: lk.c */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u000e\u0010\rJ \u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0010\u0010\nJ!\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Llk/c;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "newData", "", "b", "(Landroid/content/Context;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "Ljt/n;", "d", "(Landroid/content/Context;Lnt/b;)Ljava/lang/Object;", "a", "data", "e", "fileName", "c", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8156c {

    /* JADX INFO: renamed from: lk.c$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)Z"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.widgets.RecentlyPlayedWidgetFileProvider$isCacheStale$2", m39664f = "RecentlyPlayedWidgetFileProvider.kt", m39665l = {13}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t */
        public int f30307t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Context f30309v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ String f30310w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, String str, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f30309v = context;
            this.f30310w = str;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C8156c.this.new b(this.f30309v, this.f30310w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM33436d;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f30307t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C8156c c8156c = C8156c.this;
                Context context = this.f30309v;
                this.f30307t = 1;
                objM33436d = c8156c.m33436d(context, this);
                if (objM33436d == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                objM33436d = ((C7347n) obj).getValue();
            }
            String str = this.f30310w;
            if (C7347n.m30466h(objM33436d)) {
                objM33436d = C10340b.m39658a(!Intrinsics.m31980c((String) objM33436d, str));
            }
            Object objM30460b = C7347n.m30460b(objM33436d);
            Throwable thM30463e = C7347n.m30463e(objM30460b);
            if (thM30463e == null) {
                return objM30460b;
            }
            C6124q.m27061f("RecentlyPlayedWidgetFileProvider", "Encountered error while checking if recently played cache is stale", thM30463e);
            return C10340b.m39658a(true);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Boolean> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: lk.c$c */
    @InterfaceC10344f(m39663c = "com.roblox.client.widgets.RecentlyPlayedWidgetFileProvider", m39664f = "RecentlyPlayedWidgetFileProvider.kt", m39665l = {21}, m39666m = "readCache-gIAlu-s", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f30311t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f30312u;

        /* JADX INFO: renamed from: w */
        public int f30314w;

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30312u = obj;
            this.f30314w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objM33436d = C8156c.this.m33436d(null, this);
            return objM33436d == C10047c.m38805e() ? objM33436d : C7347n.m30459a(objM33436d);
        }
    }

    /* JADX INFO: renamed from: lk.c$d */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Ljt/n;", "", "<anonymous>", "(Lku/p0;)Ljt/n;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.widgets.RecentlyPlayedWidgetFileProvider$readCache$2", m39664f = "RecentlyPlayedWidgetFileProvider.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super C7347n<? extends String>>, Object> {

        /* JADX INFO: renamed from: t */
        public int f30315t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Context f30317v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f30317v = context;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C8156c.this.new d(this.f30317v, interfaceC9557b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C7347n<? extends String>> interfaceC9557b) {
            return invoke2(interfaceC7906p0, (InterfaceC9557b<? super C7347n<String>>) interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f30315t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            return C7347n.m30459a(C8156c.this.m33435c(this.f30317v, "recently_played_widget_data.json"));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C7347n<String>> interfaceC9557b) {
            return ((d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: lk.c$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)Z"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.widgets.RecentlyPlayedWidgetFileProvider$writeCache$2", m39664f = "RecentlyPlayedWidgetFileProvider.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t */
        public int f30318t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Context f30319u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f30320v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, String str, InterfaceC9557b<? super e> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f30319u = context;
            this.f30320v = str;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new e(this.f30319u, this.f30320v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f30318t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            boolean z10 = false;
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = this.f30319u.openFileOutput("recently_played_widget_data.json", 0);
                try {
                    byte[] bytes = this.f30320v.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    fileOutputStreamOpenFileOutput.write(bytes);
                    Unit unit = Unit.f29331a;
                    C11958c.m44629a(fileOutputStreamOpenFileOutput, null);
                    z10 = true;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        C11958c.m44629a(fileOutputStreamOpenFileOutput, th2);
                        throw th3;
                    }
                }
            } catch (IOException e10) {
                C6124q.m27061f("RecentlyPlayedWidgetFileProvider", "Error writing recently played cache", e10);
            }
            return C10340b.m39658a(z10);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Boolean> interfaceC9557b) {
            return ((e) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m33433a(@NotNull Context context, @NotNull InterfaceC9557b<? super Boolean> interfaceC9557b) {
        File file = new File(context.getFilesDir(), "recently_played_widget_data.json");
        return C10340b.m39658a(file.exists() ? file.delete() : true);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m33434b(@NotNull Context context, @NotNull String str, @NotNull InterfaceC9557b<? super Boolean> interfaceC9557b) {
        return C7872i.m32684g(C7864g1.m32644b(), new b(context, str, null), interfaceC9557b);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Object m33435c(@NotNull Context readBlocking, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(readBlocking, "$this$readBlocking");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            File file = new File(readBlocking.getFilesDir(), fileName);
            return C7347n.m30460b(file.exists() ? C11964i.m44651i(file, null, 1, null) : null);
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            return C7347n.m30460b(C7348o.m30469a(th2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m33436d(@NotNull Context context, @NotNull InterfaceC9557b<? super C7347n<String>> interfaceC9557b) {
        c cVar;
        if (interfaceC9557b instanceof c) {
            cVar = (c) interfaceC9557b;
            int i10 = cVar.f30314w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                cVar.f30314w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                cVar = new c(interfaceC9557b);
            }
        } else {
            cVar = new c(interfaceC9557b);
        }
        Object objM32684g = cVar.f30312u;
        Object objM38805e = C10047c.m38805e();
        int i11 = cVar.f30314w;
        if (i11 == 0) {
            C7348o.m30470b(objM32684g);
            AbstractC7888l0 abstractC7888l0M32644b = C7864g1.m32644b();
            d dVar = new d(context, null);
            cVar.f30311t = C10350l.m39676a(context);
            cVar.f30314w = 1;
            objM32684g = C7872i.m32684g(abstractC7888l0M32644b, dVar, cVar);
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

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m33437e(@NotNull Context context, @NotNull String str, @NotNull InterfaceC9557b<? super Boolean> interfaceC9557b) {
        return C7872i.m32684g(C7864g1.m32644b(), new e(context, str, null), interfaceC9557b);
    }
}
