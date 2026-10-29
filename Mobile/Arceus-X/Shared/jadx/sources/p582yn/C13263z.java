package p582yn;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import com.google.android.gms.tasks.Task;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7693m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;
import p539x8.C12767a;
import p539x8.C12769c;
import p539x8.InterfaceC12768b;
import sb.InterfaceC11256g;

/* JADX INFO: renamed from: yn.z */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR#\u0010\u0013\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, m31665d2 = {"Lyn/z;", "Lyn/k;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "b", "()Ljava/lang/String;", "", "a", "()V", "g", "Landroid/content/Context;", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "Ljt/h;", "i", "()Landroid/content/SharedPreferences;", "prefs", "c", "Ljava/lang/String;", "androidId", "d", "appSetId", "device_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13263z implements InterfaceC13248k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h prefs;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String androidId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public String appSetId;

    public C13263z(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.prefs = C7342i.m30456b(new Function0() { // from class: yn.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C13263z.m49023j(this.f46615a);
            }
        });
        this.androidId = m49026g();
        this.appSetId = "";
    }

    /* JADX INFO: renamed from: h */
    public static final CharSequence m49022h(byte b) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: j */
    public static final SharedPreferences m49023j(C13263z c13263z) {
        return c13263z.context.getSharedPreferences("com.withpersona.sdk2.prefs", 0);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m49024k(C13263z c13263z, C12769c c12769c) {
        String strM47637a = c12769c.m47637a();
        Intrinsics.checkNotNullExpressionValue(strM47637a, "getId(...)");
        c13263z.appSetId = strM47637a;
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: l */
    public static final void m49025l(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // p582yn.InterfaceC13248k
    /* JADX INFO: renamed from: a */
    public void mo49000a() {
        if (StringsKt.m32182p0(this.androidId)) {
            InterfaceC12768b interfaceC12768bM47636a = C12767a.m47636a(this.context);
            Intrinsics.checkNotNullExpressionValue(interfaceC12768bM47636a, "getClient(...)");
            Task<C12769c> taskMo46198j = interfaceC12768bM47636a.mo46198j();
            Intrinsics.checkNotNullExpressionValue(taskMo46198j, "getAppSetIdInfo(...)");
            final Function1 function1 = new Function1() { // from class: yn.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C13263z.m49024k(this.f46616a, (C12769c) obj);
                }
            };
            taskMo46198j.mo11893g(new InterfaceC11256g() { // from class: yn.x
                @Override // sb.InterfaceC11256g
                public final void onSuccess(Object obj) {
                    C13263z.m49025l(function1, obj);
                }
            });
        }
    }

    @Override // p582yn.InterfaceC13248k
    @NotNull
    /* JADX INFO: renamed from: b */
    public String mo49001b() {
        if (!StringsKt.m32182p0(this.androidId)) {
            return this.androidId;
        }
        if (this.appSetId.length() == 0) {
            mo49000a();
        }
        return this.appSetId;
    }

    /* JADX INFO: renamed from: g */
    public final String m49026g() throws NoSuchAlgorithmException {
        String string = m49027i().getString("ANDROID_ID", null);
        if (string != null && !StringsKt.m32182p0(string)) {
            return string;
        }
        String string2 = Settings.Secure.getString(this.context.getContentResolver(), "android_id");
        if (string2 == null || StringsKt.m32182p0(string2)) {
            return "";
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        byte[] bytes = MODEL.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNull(bArrDigest);
        String str = string2 + C7693m.m31857Z(bArrDigest, "", null, null, 0, null, new Function1() { // from class: yn.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C13263z.m49022h(((Byte) obj).byteValue());
            }
        }, 30, null);
        m49027i().edit().putString("ANDROID_ID", str).apply();
        return str;
    }

    /* JADX INFO: renamed from: i */
    public final SharedPreferences m49027i() {
        return (SharedPreferences) this.prefs.getValue();
    }
}
