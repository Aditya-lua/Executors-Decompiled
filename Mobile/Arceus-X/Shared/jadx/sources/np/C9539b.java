package np;

import android.content.Context;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.AbstractC7888l0;
import p256ku.C7864g1;
import p256ku.C7870h2;
import p256ku.C7872i;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p477ut.C11958c;
import p477ut.C11964i;
import p477ut.C11966k;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: np.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0018B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\f*\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J2\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, m31665d2 = {"Lnp/b;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "subsystem", "Lnp/a;", "level", "category", "message", "", "i", "(Ljava/lang/String;Lnp/a;Ljava/lang/String;Ljava/lang/String;)V", "j", "(Ljava/lang/String;Lnp/a;Lnt/b;)Ljava/lang/Object;", "f", "(Lnt/b;)Ljava/lang/Object;", "Ljava/io/File;", "g", "(Ljava/io/File;)V", "h", "(Ljava/lang/String;)Ljava/io/File;", "a", "(Ljava/lang/String;Lnp/a;Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "Landroid/content/Context;", "Ljava/text/SimpleDateFormat;", "b", "Ljava/text/SimpleDateFormat;", "dateFormat", "Lku/p0;", "c", "Lku/p0;", "coroutineScope", "Lku/l0;", "d", "Lku/l0;", "loggerContext", "e", "Ljava/io/File;", "errorLogsDir", "logger_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C9539b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final SimpleDateFormat dateFormat;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 coroutineScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AbstractC7888l0 loggerContext;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final File errorLogsDir;

    /* JADX INFO: renamed from: np.b$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Lku/p0;)Ljava/lang/Object;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.logger.Logger$_log$2", m39664f = "Logger.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Object>, Object> {

        /* JADX INFO: renamed from: t */
        public int f34469t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f34471v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ String f34472w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ EnumC9538a f34473x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ String f34474y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, EnumC9538a enumC9538a, String str3, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f34471v = str;
            this.f34472w = str2;
            this.f34473x = enumC9538a;
            this.f34474y = str3;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C9539b.this.new b(this.f34471v, this.f34472w, this.f34473x, this.f34474y, interfaceC9557b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Object> interfaceC9557b) {
            return invoke2(interfaceC7906p0, (InterfaceC9557b<Object>) interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            String str;
            C10047c.m38805e();
            if (this.f34469t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            try {
                File fileM37658h = C9539b.this.m37658h(this.f34471v);
                File parentFile = fileM37658h.getParentFile();
                if (parentFile != null) {
                    C10340b.m39658a(parentFile.mkdirs());
                }
                if (this.f34472w != null) {
                    str = this.f34473x.name() + "," + C9539b.this.dateFormat.format(new Date()) + "," + this.f34472w + "," + this.f34474y + "\n";
                } else {
                    str = this.f34473x.name() + "," + C9539b.this.dateFormat.format(new Date()) + "," + this.f34474y + "\n";
                }
                FileWriter fileWriter = new FileWriter(fileM37658h, true);
                try {
                    Writer writerAppend = fileWriter.append((CharSequence) str);
                    C11958c.m44629a(fileWriter, null);
                    return writerAppend;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        C11958c.m44629a(fileWriter, th2);
                        throw th3;
                    }
                }
            } catch (Exception unused) {
                return Unit.f29331a;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<Object> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: np.b$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.logger.Logger$deleteLogFiles$2", m39664f = "Logger.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f34475t;

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C9539b.this.new c(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f34475t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            if (C9539b.this.errorLogsDir.exists()) {
                try {
                    C10340b.m39658a(C11966k.m44657o(C9539b.this.errorLogsDir));
                } catch (SecurityException unused) {
                }
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: np.b$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.logger.Logger$log$1", m39664f = "Logger.kt", m39665l = {88}, m39666m = "invokeSuspend")
    public static final class d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f34477t;

        /* JADX INFO: renamed from: u */
        public int f34478u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f34479v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ C9539b f34480w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ String f34481x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ EnumC9538a f34482y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ String f34483z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, C9539b c9539b, String str2, EnumC9538a enumC9538a, String str3, InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f34479v = str;
            this.f34480w = c9539b;
            this.f34481x = str2;
            this.f34482y = enumC9538a;
            this.f34483z = str3;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new d(this.f34479v, this.f34480w, this.f34481x, this.f34482y, this.f34483z, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f34478u;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                String strM32303N = C7797x.m32303N(this.f34479v, "\n", "\\n", false, 4, null);
                C9539b c9539b = this.f34480w;
                String str = this.f34481x;
                EnumC9538a enumC9538a = this.f34482y;
                String str2 = this.f34483z;
                this.f34477t = C10350l.m39676a(strM32303N);
                this.f34478u = 1;
                if (c9539b.m37655a(str, enumC9538a, str2, strM32303N, this) == objM38805e) {
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
            return ((d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: np.b$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)Ljava/lang/String;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.logger.Logger$readCsvLogsWith$2", m39664f = "Logger.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super String>, Object> {

        /* JADX INFO: renamed from: t */
        public int f34484t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f34486v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ EnumC9538a f34487w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, EnumC9538a enumC9538a, InterfaceC9557b<? super e> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f34486v = str;
            this.f34487w = enumC9538a;
        }

        /* JADX INFO: renamed from: r */
        public static final Unit m37662r(EnumC9538a enumC9538a, String str, StringBuilder sb2, String str2) {
            String str3;
            List listSplit$default = StringsKt.split$default(str2, new String[]{","}, false, 4, 2, null);
            String str4 = (String) listSplit$default.get(0);
            String str5 = (String) listSplit$default.get(1);
            if (Intrinsics.m31980c(str4, enumC9538a.name())) {
                if (listSplit$default.size() == 4) {
                    str3 = str4 + "," + str5 + "," + ((String) listSplit$default.get(2)) + "," + ((String) listSplit$default.get(3)) + "\n";
                } else if (listSplit$default.size() == 3) {
                    str3 = str4 + "," + str5 + "," + str + "," + ((String) listSplit$default.get(2)) + "\n";
                } else {
                    str3 = "";
                }
                sb2.append(str3);
            }
            return Unit.f29331a;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C9539b.this.new e(this.f34486v, this.f34487w, interfaceC9557b);
        }

        /* JADX DEBUG: Class process forced to load method for inline: ut.i.e(java.io.File, java.nio.charset.Charset, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f34484t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            try {
                File fileM37658h = C9539b.this.m37658h(this.f34486v);
                if (!fileM37658h.exists()) {
                    return null;
                }
                final StringBuilder sb2 = new StringBuilder();
                final EnumC9538a enumC9538a = this.f34487w;
                final String str = this.f34486v;
                C11964i.m44647e(fileM37658h, null, new Function1() { // from class: np.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return C9539b.e.m37662r(enumC9538a, str, sb2, (String) obj2);
                    }
                }, 1, null);
                return sb2.toString();
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super String> interfaceC9557b) {
            return ((e) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C9539b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        this.coroutineScope = C7910q0.m32885a(C7864g1.m32643a().plus(C7870h2.m32666b(null, 1, null)));
        this.loggerContext = AbstractC7888l0.m32791U(C7864g1.m32644b(), 1, null, 2, null);
        this.errorLogsDir = new File(context.getCacheDir(), "error_logs");
    }

    /* JADX INFO: renamed from: a */
    public final Object m37655a(String str, EnumC9538a enumC9538a, String str2, String str3, InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM32684g = C7872i.m32684g(this.loggerContext, new b(str, str2, enumC9538a, str3, null), interfaceC9557b);
        return objM32684g == C10047c.m38805e() ? objM32684g : Unit.f29331a;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Object m37656f(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM32684g = C7872i.m32684g(this.loggerContext, new c(null), interfaceC9557b);
        return objM32684g == C10047c.m38805e() ? objM32684g : Unit.f29331a;
    }

    /* JADX INFO: renamed from: g */
    public final void m37657g(File file) {
        if (file.exists()) {
            if (!file.isFile()) {
                return;
            } else {
                file.delete();
            }
        }
        file.mkdirs();
    }

    /* JADX INFO: renamed from: h */
    public final File m37658h(String subsystem) {
        String strF1 = StringsKt.m32163f1(subsystem, ".", null, 2, null);
        m37657g(this.errorLogsDir);
        return new File(this.errorLogsDir, "persona_log_" + strF1 + ".csv");
    }

    /* JADX INFO: renamed from: i */
    public final void m37659i(@NotNull String subsystem, @NotNull EnumC9538a level, @Nullable String category, @NotNull String message) {
        Intrinsics.checkNotNullParameter(subsystem, "subsystem");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        C7882k.m32780d(this.coroutineScope, null, null, new d(message, this, subsystem, level, category, null), 3, null);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final Object m37660j(@NotNull String str, @NotNull EnumC9538a enumC9538a, @NotNull InterfaceC9557b<? super String> interfaceC9557b) {
        return C7872i.m32684g(this.loggerContext, new e(str, enumC9538a, null), interfaceC9557b);
    }
}
