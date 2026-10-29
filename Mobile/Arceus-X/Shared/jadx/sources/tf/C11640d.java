package tf;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p410rf.C10867c;
import p410rf.InterfaceC10865a;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;
import p410rf.InterfaceC10871g;
import p410rf.InterfaceC10872h;
import p433sf.InterfaceC11291a;
import p433sf.InterfaceC11292b;

/* JADX INFO: renamed from: tf.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C11640d implements InterfaceC11292b<C11640d> {

    /* JADX INFO: renamed from: e */
    public static final InterfaceC10869e<Object> f41039e = new InterfaceC10869e() { // from class: tf.a
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p410rf.InterfaceC10866b
        public final void encode(Object obj, InterfaceC10870f interfaceC10870f) {
            C11640d.m43291b(obj, interfaceC10870f);
        }
    };

    /* JADX INFO: renamed from: f */
    public static final InterfaceC10871g<String> f41040f = new InterfaceC10871g() { // from class: tf.b
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p410rf.InterfaceC10866b
        public final void encode(Object obj, InterfaceC10872h interfaceC10872h) {
            interfaceC10872h.add((String) obj);
        }
    };

    /* JADX INFO: renamed from: g */
    public static final InterfaceC10871g<Boolean> f41041g = new InterfaceC10871g() { // from class: tf.c
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p410rf.InterfaceC10866b
        public final void encode(Object obj, InterfaceC10872h interfaceC10872h) {
            interfaceC10872h.add(((Boolean) obj).booleanValue());
        }
    };

    /* JADX INFO: renamed from: h */
    public static final b f41042h = new b(null);

    /* JADX INFO: renamed from: a */
    public final Map<Class<?>, InterfaceC10869e<?>> f41043a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Map<Class<?>, InterfaceC10871g<?>> f41044b = new HashMap();

    /* JADX INFO: renamed from: c */
    public InterfaceC10869e<Object> f41045c = f41039e;

    /* JADX INFO: renamed from: d */
    public boolean f41046d = false;

    /* JADX INFO: renamed from: tf.d$a */
    public class a implements InterfaceC10865a {
        public a() {
        }

        @Override // p410rf.InterfaceC10865a
        /* JADX INFO: renamed from: a */
        public void mo41318a(@NonNull Object obj, @NonNull Writer writer) {
            C11641e c11641e = new C11641e(writer, C11640d.this.f41043a, C11640d.this.f41044b, C11640d.this.f41045c, C11640d.this.f41046d);
            c11641e.m43305c(obj, false);
            c11641e.m43313k();
        }

        @Override // p410rf.InterfaceC10865a
        /* JADX INFO: renamed from: b */
        public String mo41319b(@NonNull Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                mo41318a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* JADX INFO: renamed from: tf.d$b */
    public static final class b implements InterfaceC10871g<Date> {

        /* JADX INFO: renamed from: a */
        public static final DateFormat f41048a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f41048a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b() {
        }

        /* JADX DEBUG: Method merged with bridge method: encode(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // p410rf.InterfaceC10866b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(@NonNull Date date, @NonNull InterfaceC10872h interfaceC10872h) {
            interfaceC10872h.add(f41048a.format(date));
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:2) call: tf.d.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public C11640d() {
        m43301l(String.class, f41040f);
        m43301l(Boolean.class, f41041g);
        m43301l(Date.class, f41042h);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: THROW 
      (wrap rf.c:0x001b: CONSTRUCTOR 
      (wrap java.lang.String:STR_CONCAT 
      ("Couldn't find encoder for type ")
      (wrap java.lang.String:0x0010: INVOKE 
      (wrap java.lang.Class<?>:0x000c: INVOKE (r2v0 java.lang.Object) VIRTUAL call: java.lang.Object.getClass():java.lang.Class A[MD:():java.lang.Class<?> (c), WRAPPED])
     VIRTUAL call: java.lang.Class.getCanonicalName():java.lang.String A[MD:():java.lang.String (c), WRAPPED])
     A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED])
     A[MD:(java.lang.String):void (m), WRAPPED] call: rf.c.<init>(java.lang.String):void type: CONSTRUCTOR)
     */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m43291b(Object obj, InterfaceC10870f interfaceC10870f) {
        throw new C10867c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public InterfaceC10865a m43297h() {
        return new a();
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public C11640d m43298i(@NonNull InterfaceC11291a interfaceC11291a) {
        interfaceC11291a.configure(this);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public C11640d m43299j(boolean z10) {
        this.f41046d = z10;
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b; */
    @Override // p433sf.InterfaceC11292b
    @NonNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public <T> C11640d registerEncoder(@NonNull Class<T> cls, @NonNull InterfaceC10869e<? super T> interfaceC10869e) {
        this.f41043a.put(cls, interfaceC10869e);
        this.f41044b.remove(cls);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public <T> C11640d m43301l(@NonNull Class<T> cls, @NonNull InterfaceC10871g<? super T> interfaceC10871g) {
        this.f41044b.put(cls, interfaceC10871g);
        this.f41043a.remove(cls);
        return this;
    }
}
