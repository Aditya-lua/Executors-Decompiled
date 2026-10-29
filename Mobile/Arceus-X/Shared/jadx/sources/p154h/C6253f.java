package p154h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p139g.C5859h;
import p229jt.C7345l;

/* JADX INFO: renamed from: h.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0016\u0018\u0000 \n2\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\b\n\u0014\u0012\u0015\u0016\u0017\u0018\rB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m31665d2 = {"Lh/f;", "Lh/a;", "Lg/h;", "Landroid/net/Uri;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lg/h;)Landroid/content/Intent;", "Lh/a$a;", "b", "(Landroid/content/Context;Lg/h;)Lh/a$a;", "", "resultCode", "intent", "d", "(ILandroid/content/Intent;)Landroid/net/Uri;", "h", "g", "c", "f", "e", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public class C6253f extends AbstractC6248a<C5859h, Uri> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h.f$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, m31665d2 = {"Lh/f$a;", "", "<init>", "()V", "", "c", "()Z", "e", "Landroid/content/Context;", "context", "d", "(Landroid/content/Context;)Z", "Landroid/content/pm/ResolveInfo;", "a", "(Landroid/content/Context;)Landroid/content/pm/ResolveInfo;", "Lh/f$h;", "input", "", "b", "(Lh/f$h;)Ljava/lang/String;", "GMS_ACTION_PICK_IMAGES", "Ljava/lang/String;", "GMS_EXTRA_PICK_IMAGES_MAX", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: h.f.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final ResolveInfo m27466a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final String m27467b(@NotNull h input) {
            Intrinsics.checkNotNullParameter(input, "input");
            if (input instanceof d) {
                return "image/*";
            }
            if (input instanceof g) {
                return "video/*";
            }
            if (input instanceof f) {
                return ((f) input).m27472a();
            }
            if (input instanceof c) {
                return null;
            }
            throw new C7345l();
        }

        @SuppressLint({"NewApi"})
        /* JADX INFO: renamed from: c */
        public final boolean m27468c() {
            return m27470e();
        }

        /* JADX INFO: renamed from: d */
        public final boolean m27469d(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return m27466a(context) != null;
        }

        @SuppressLint({"NewApi"})
        /* JADX INFO: renamed from: e */
        public final boolean m27470e() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                return true;
            }
            return i10 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: h.f$b */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m31665d2 = {"Lh/f$b;", "", "<init>", "()V", "", "a", "()I", "value", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: h.f$b$a */
        @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m31665d2 = {"Lh/f$b$a;", "Lh/f$b;", "<init>", "()V", "", "b", "I", "a", "()I", "value", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final a f23770a = new a();

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public static final int value = 1;

            public a() {
                super(null);
            }

            @Override // p154h.C6253f.b
            /* JADX INFO: renamed from: a */
            public int mo27471a() {
                return value;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: h.f.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public abstract int mo27471a();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }
    }

    /* JADX INFO: renamed from: h.f$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lh/f$c;", "Lh/f$h;", "<init>", "()V", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class c implements h {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final c f23772a = new c();
    }

    /* JADX INFO: renamed from: h.f$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lh/f$d;", "Lh/f$h;", "<init>", "()V", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class d implements h {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final d f23773a = new d();
    }

    /* JADX INFO: renamed from: h.f$e */
    @Metadata(m31664d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31665d2 = {"Lh/f$e;", "", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class e {
    }

    /* JADX INFO: renamed from: h.f$f */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"Lh/f$f;", "Lh/f$h;", "", "mimeType", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class f implements h {
        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m27472a() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: h.f$g */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lh/f$g;", "Lh/f$h;", "<init>", "()V", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class g implements h {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final g f23774a = new g();
    }

    /* JADX INFO: renamed from: h.f$h */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m31665d2 = {"Lh/f$h;", "", "Lh/f$c;", "Lh/f$d;", "Lh/f$f;", "Lh/f$g;", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public interface h {
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: c */
    public static final boolean m27462c() {
        return INSTANCE.m27468c();
    }

    /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
    @Override // p154h.AbstractC6248a
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(@NotNull Context context, @NotNull C5859h input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Companion companion = INSTANCE;
        if (companion.m27470e()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(companion.m27467b(input.getMediaType()));
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", input.getDefaultTab().mo27471a());
            if (input.getIsCustomAccentColorApplied()) {
                intent.putExtra("android.provider.extra.PICK_IMAGES_ACCENT_COLOR", input.getAccentColor());
            }
            if (Build.VERSION.SDK_INT >= 33) {
                input.m26265d();
            }
            return intent;
        }
        if (!companion.m27469d(context)) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(companion.m27467b(input.getMediaType()));
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent2;
        }
        ResolveInfo resolveInfoM27466a = companion.m27466a(context);
        if (resolveInfoM27466a == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ActivityInfo activityInfo = resolveInfoM27466a.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(companion.m27467b(input.getMediaType()));
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", input.getDefaultTab().mo27471a());
        if (input.getIsCustomAccentColorApplied()) {
            intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_ACCENT_COLOR", input.getAccentColor());
        }
        return intent3;
    }

    /* JADX DEBUG: Method merged with bridge method: getSynchronousResult(Landroid/content/Context;Ljava/lang/Object;)Lh/a$a; */
    @Override // p154h.AbstractC6248a
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC6248a.a<Uri> getSynchronousResult(@NotNull Context context, @NotNull C5859h input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
    @Override // p154h.AbstractC6248a
    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Uri parseResult(int resultCode, @Nullable Intent intent) {
        if (resultCode != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        return data == null ? (Uri) CollectionsKt.firstOrNull(C6249b.INSTANCE.m27451a(intent)) : data;
    }
}
