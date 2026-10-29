package yn;

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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR#\u0010\u0013\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, d2 = {"Lyn/z;", "Lyn/k;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "b", "()Ljava/lang/String;", "", "a", "()V", "g", "Landroid/content/Context;", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "Ljt/h;", "i", "()Landroid/content/SharedPreferences;", "prefs", "c", "Ljava/lang/String;", "androidId", "d", "appSetId", "device_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final jt.h prefs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String androidId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String appSetId;

    public z(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.prefs = jt.i.b(new Function0() { // from class: yn.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z.j(this.f36016a);
            }
        });
        this.androidId = g();
        this.appSetId = "";
    }

    public static final CharSequence h(byte b) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final SharedPreferences j(z zVar) {
        return zVar.context.getSharedPreferences("com.withpersona.sdk2.prefs", 0);
    }

    public static final Unit k(z zVar, x8.c cVar) {
        String strA = cVar.a();
        Intrinsics.checkNotNullExpressionValue(strA, "getId(...)");
        zVar.appSetId = strA;
        return Unit.f22483a;
    }

    public static final void l(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // yn.k
    public void a() {
        if (StringsKt.p0(this.androidId)) {
            x8.b bVarA = x8.a.a(this.context);
            Intrinsics.checkNotNullExpressionValue(bVarA, "getClient(...)");
            Task<x8.c> taskJ = bVarA.j();
            Intrinsics.checkNotNullExpressionValue(taskJ, "getAppSetIdInfo(...)");
            final Function1 function1 = new Function1() { // from class: yn.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return z.k(this.f36017a, (x8.c) obj);
                }
            };
            taskJ.g(new sb.g() { // from class: yn.x
                @Override // sb.g
                public final void onSuccess(Object obj) {
                    z.l(function1, obj);
                }
            });
        }
    }

    @Override // yn.k
    @NotNull
    public String b() {
        if (!StringsKt.p0(this.androidId)) {
            return this.androidId;
        }
        if (this.appSetId.length() == 0) {
            a();
        }
        return this.appSetId;
    }

    public final String g() throws NoSuchAlgorithmException {
        String string = i().getString("ANDROID_ID", null);
        if (string != null && !StringsKt.p0(string)) {
            return string;
        }
        String string2 = Settings.Secure.getString(this.context.getContentResolver(), "android_id");
        if (string2 == null || StringsKt.p0(string2)) {
            return "";
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        byte[] bytes = MODEL.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNull(bArrDigest);
        String str = string2 + kotlin.collections.m.Z(bArrDigest, "", null, null, 0, null, new Function1() { // from class: yn.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.h(((Byte) obj).byteValue());
            }
        }, 30, null);
        i().edit().putString("ANDROID_ID", str).apply();
        return str;
    }

    public final SharedPreferences i() {
        return (SharedPreferences) this.prefs.getValue();
    }
}
