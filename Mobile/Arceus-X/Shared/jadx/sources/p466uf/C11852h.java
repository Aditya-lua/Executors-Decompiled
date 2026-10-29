package p466uf;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import p410rf.C10867c;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;
import p410rf.InterfaceC10871g;
import p433sf.InterfaceC11291a;
import p433sf.InterfaceC11292b;

/* JADX INFO: renamed from: uf.h */
/* JADX INFO: loaded from: classes2.dex */
public class C11852h {

    /* JADX INFO: renamed from: a */
    public final Map<Class<?>, InterfaceC10869e<?>> f41623a;

    /* JADX INFO: renamed from: b */
    public final Map<Class<?>, InterfaceC10871g<?>> f41624b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC10869e<Object> f41625c;

    /* JADX INFO: renamed from: uf.h$a */
    public static final class a implements InterfaceC11292b<a> {

        /* JADX INFO: renamed from: d */
        public static final InterfaceC10869e<Object> f41626d = new InterfaceC10869e() { // from class: uf.g
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p410rf.InterfaceC10866b
            public final void encode(Object obj, InterfaceC10870f interfaceC10870f) {
                C11852h.a.m44269a(obj, interfaceC10870f);
            }
        };

        /* JADX INFO: renamed from: a */
        public final Map<Class<?>, InterfaceC10869e<?>> f41627a = new HashMap();

        /* JADX INFO: renamed from: b */
        public final Map<Class<?>, InterfaceC10871g<?>> f41628b = new HashMap();

        /* JADX INFO: renamed from: c */
        public InterfaceC10869e<Object> f41629c = f41626d;

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
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m44269a(Object obj, InterfaceC10870f interfaceC10870f) {
            throw new C10867c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        /* JADX INFO: renamed from: b */
        public C11852h m44270b() {
            return new C11852h(new HashMap(this.f41627a), new HashMap(this.f41628b), this.f41629c);
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public a m44271c(@NonNull InterfaceC11291a interfaceC11291a) {
            interfaceC11291a.configure(this);
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: registerEncoder(Ljava/lang/Class;Lrf/e;)Lsf/b; */
        @Override // p433sf.InterfaceC11292b
        @NonNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public <U> a registerEncoder(@NonNull Class<U> cls, @NonNull InterfaceC10869e<? super U> interfaceC10869e) {
            this.f41627a.put(cls, interfaceC10869e);
            this.f41628b.remove(cls);
            return this;
        }
    }

    public C11852h(Map<Class<?>, InterfaceC10869e<?>> map, Map<Class<?>, InterfaceC10871g<?>> map2, InterfaceC10869e<Object> interfaceC10869e) {
        this.f41623a = map;
        this.f41624b = map2;
        this.f41625c = interfaceC10869e;
    }

    /* JADX INFO: renamed from: a */
    public static a m44266a() {
        return new a();
    }

    /* JADX INFO: renamed from: b */
    public void m44267b(@NonNull Object obj, @NonNull OutputStream outputStream) {
        new C11850f(outputStream, this.f41623a, this.f41624b, this.f41625c).m44263n(obj);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public byte[] m44268c(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m44267b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
