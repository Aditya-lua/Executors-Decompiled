package np;

import android.content.Context;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.x;
import ku.g1;
import ku.h2;
import ku.l0;
import ku.p0;
import ku.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.l;
import pt.m;
import ut.i;
import ut.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0018B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\f*\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J2\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lnp/b;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "subsystem", "Lnp/a;", "level", "category", "message", "", "i", "(Ljava/lang/String;Lnp/a;Ljava/lang/String;Ljava/lang/String;)V", "j", "(Ljava/lang/String;Lnp/a;Lnt/b;)Ljava/lang/Object;", "f", "(Lnt/b;)Ljava/lang/Object;", "Ljava/io/File;", "g", "(Ljava/io/File;)V", "h", "(Ljava/lang/String;)Ljava/io/File;", "a", "(Ljava/lang/String;Lnp/a;Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "Landroid/content/Context;", "Ljava/text/SimpleDateFormat;", "b", "Ljava/text/SimpleDateFormat;", "dateFormat", "Lku/p0;", "c", "Lku/p0;", "coroutineScope", "Lku/l0;", "d", "Lku/l0;", "loggerContext", "e", "Ljava/io/File;", "errorLogsDir", "logger_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final SimpleDateFormat dateFormat;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 coroutineScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 loggerContext;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final File errorLogsDir;

    /* JADX INFO: renamed from: np.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Lku/p0;)Ljava/lang/Object;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.logger.Logger$_log$2", f = "Logger.kt", l = {}, m = "invokeSuspend")
    public static final class C0447b extends m implements Function2<p0, nt.b<? super Object>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f26607t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f26609v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f26610w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ a f26611x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f26612y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0447b(String str, String str2, a aVar, String str3, nt.b<? super C0447b> bVar) {
            super(2, bVar);
            this.f26609v = str;
            this.f26610w = str2;
            this.f26611x = aVar;
            this.f26612y = str3;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return b.this.new C0447b(this.f26609v, this.f26610w, this.f26611x, this.f26612y, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, nt.b<? super Object> bVar) {
            return invoke2(p0Var, (nt.b<Object>) bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            String str;
            ot.c.e();
            if (this.f26607t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            try {
                File fileH = b.this.h(this.f26609v);
                File parentFile = fileH.getParentFile();
                if (parentFile != null) {
                    pt.b.a(parentFile.mkdirs());
                }
                if (this.f26610w != null) {
                    str = this.f26611x.name() + "," + b.this.dateFormat.format(new Date()) + "," + this.f26610w + "," + this.f26612y + "\n";
                } else {
                    str = this.f26611x.name() + "," + b.this.dateFormat.format(new Date()) + "," + this.f26612y + "\n";
                }
                FileWriter fileWriter = new FileWriter(fileH, true);
                try {
                    Writer writerAppend = fileWriter.append((CharSequence) str);
                    ut.c.a(fileWriter, null);
                    return writerAppend;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ut.c.a(fileWriter, th2);
                        throw th3;
                    }
                }
            } catch (Exception unused) {
                return Unit.f22483a;
            }
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, nt.b<Object> bVar) {
            return ((C0447b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.logger.Logger$deleteLogFiles$2", f = "Logger.kt", l = {}, m = "invokeSuspend")
    public static final class c extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f26613t;

        public c(nt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return b.this.new c(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f26613t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            if (b.this.errorLogsDir.exists()) {
                try {
                    pt.b.a(k.o(b.this.errorLogsDir));
                } catch (SecurityException unused) {
                }
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.logger.Logger$log$1", f = "Logger.kt", l = {88}, m = "invokeSuspend")
    public static final class d extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f26615t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f26616u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f26617v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ b f26618w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f26619x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ a f26620y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f26621z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, b bVar, String str2, a aVar, String str3, nt.b<? super d> bVar2) {
            super(2, bVar2);
            this.f26617v = str;
            this.f26618w = bVar;
            this.f26619x = str2;
            this.f26620y = aVar;
            this.f26621z = str3;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new d(this.f26617v, this.f26618w, this.f26619x, this.f26620y, this.f26621z, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f26616u;
            if (i10 == 0) {
                o.b(obj);
                String strN = x.N(this.f26617v, "\n", "\\n", false, 4, null);
                b bVar = this.f26618w;
                String str = this.f26619x;
                a aVar = this.f26620y;
                String str2 = this.f26621z;
                this.f26615t = l.a(strN);
                this.f26616u = 1;
                if (bVar.a(str, aVar, str2, strN, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.logger.Logger$readCsvLogsWith$2", f = "Logger.kt", l = {}, m = "invokeSuspend")
    public static final class e extends m implements Function2<p0, nt.b<? super String>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f26622t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f26624v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ a f26625w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, a aVar, nt.b<? super e> bVar) {
            super(2, bVar);
            this.f26624v = str;
            this.f26625w = aVar;
        }

        public static final Unit r(a aVar, String str, StringBuilder sb2, String str2) {
            String str3;
            List listSplit$default = StringsKt.split$default(str2, new String[]{","}, false, 4, 2, null);
            String str4 = (String) listSplit$default.get(0);
            String str5 = (String) listSplit$default.get(1);
            if (Intrinsics.c(str4, aVar.name())) {
                if (listSplit$default.size() == 4) {
                    str3 = str4 + "," + str5 + "," + ((String) listSplit$default.get(2)) + "," + ((String) listSplit$default.get(3)) + "\n";
                } else if (listSplit$default.size() == 3) {
                    str3 = str4 + "," + str5 + "," + str + "," + ((String) listSplit$default.get(2)) + "\n";
                } else {
                    str3 = "";
                }
                sb2.append(str3);
            }
            return Unit.f22483a;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return b.this.new e(this.f26624v, this.f26625w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f26622t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            try {
                File fileH = b.this.h(this.f26624v);
                if (!fileH.exists()) {
                    return null;
                }
                final StringBuilder sb2 = new StringBuilder();
                final a aVar = this.f26625w;
                final String str = this.f26624v;
                i.e(fileH, null, new Function1() { // from class: np.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return b.e.r(aVar, str, sb2, (String) obj2);
                    }
                }, 1, null);
                return sb2.toString();
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super String> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        this.coroutineScope = q0.a(g1.a().plus(h2.b(null, 1, null)));
        this.loggerContext = l0.U(g1.b(), 1, null, 2, null);
        this.errorLogsDir = new File(context.getCacheDir(), "error_logs");
    }

    public final Object a(String str, a aVar, String str2, String str3, nt.b<? super Unit> bVar) {
        Object objG = ku.i.g(this.loggerContext, new C0447b(str, str2, aVar, str3, null), bVar);
        return objG == ot.c.e() ? objG : Unit.f22483a;
    }

    @Nullable
    public final Object f(@NotNull nt.b<? super Unit> bVar) {
        Object objG = ku.i.g(this.loggerContext, new c(null), bVar);
        return objG == ot.c.e() ? objG : Unit.f22483a;
    }

    public final void g(File file) {
        if (file.exists()) {
            if (!file.isFile()) {
                return;
            } else {
                file.delete();
            }
        }
        file.mkdirs();
    }

    public final File h(String subsystem) {
        String strF1 = StringsKt.f1(subsystem, ".", null, 2, null);
        g(this.errorLogsDir);
        return new File(this.errorLogsDir, "persona_log_" + strF1 + ".csv");
    }

    public final void i(@NotNull String subsystem, @NotNull a level, @Nullable String category, @NotNull String message) {
        Intrinsics.checkNotNullParameter(subsystem, "subsystem");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        ku.k.d(this.coroutineScope, null, null, new d(message, this, subsystem, level, category, null), 3, null);
    }

    @Nullable
    public final Object j(@NotNull String str, @NotNull a aVar, @NotNull nt.b<? super String> bVar) {
        return ku.i.g(this.loggerContext, new e(str, aVar, null), bVar);
    }
}
