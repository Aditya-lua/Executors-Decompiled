package p257kv;

import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kg.C7590f;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p231jv.C7397y;
import p231jv.InterfaceC7380h;

/* JADX INFO: renamed from: kv.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C7949a extends InterfaceC7380h.a {

    /* JADX INFO: renamed from: a */
    public final C7590f f29819a;

    /* JADX INFO: renamed from: b */
    public final boolean f29820b;

    public C7949a(C7590f c7590f, boolean z10) {
        this.f29819a = c7590f;
        this.f29820b = z10;
    }

    /* JADX INFO: renamed from: f */
    public static C7949a m32945f() {
        return m32946g(new C7590f());
    }

    /* JADX INFO: renamed from: g */
    public static C7949a m32946g(C7590f c7590f) {
        if (c7590f != null) {
            return new C7949a(c7590f, false);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // p231jv.InterfaceC7380h.a
    /* JADX INFO: renamed from: c */
    public InterfaceC7380h<?, RequestBody> mo30538c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C7397y c7397y) {
        return new C7950b(this.f29819a, this.f29819a.m31414n(TypeToken.get(type)), this.f29820b);
    }

    @Override // p231jv.InterfaceC7380h.a
    /* JADX INFO: renamed from: d */
    public InterfaceC7380h<ResponseBody, ?> mo30539d(Type type, Annotation[] annotationArr, C7397y c7397y) {
        return new C7951c(this.f29819a, this.f29819a.m31414n(TypeToken.get(type)));
    }
}
