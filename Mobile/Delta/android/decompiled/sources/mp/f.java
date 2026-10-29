package mp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmp/h0;", "Lmp/b;", "", "b", "()Lmp/h0;", "launchers_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"mp/f$a", "Lh/a;", "Lmp/b;", "", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lmp/b;)Landroid/content/Intent;", "resultCode", "intent", "b", "(ILandroid/content/Intent;)Ljava/lang/Integer;", "launchers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends h.a<b, Integer> {
        @Override // h.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(Context context, b input) {
            Intent intent;
            Intent intent2;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            if (input instanceof c) {
                c cVar = (c) input;
                intent = cVar.getIntent().f33560a;
                intent.setData(Uri.parse(cVar.getUrl()));
            } else {
                if (!(input instanceof mp.a)) {
                    throw new jt.l();
                }
                mp.a aVar = (mp.a) input;
                intent = aVar.getIntent().f32674a;
                intent.setData(Uri.parse(aVar.getUrl()));
                intent.putExtra("androidx.browser.auth.extra.HTTPS_REDIRECT_HOST", aVar.getHost());
                intent.putExtra("androidx.browser.auth.extra.HTTPS_REDIRECT_PATH", aVar.getPath());
            }
            Intrinsics.checkNotNull(intent);
            String packageName = input.getPackageName();
            return (packageName == null || (intent2 = intent.setPackage(packageName)) == null) ? intent : intent2;
        }

        @Override // h.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer parseResult(int resultCode, Intent intent) {
            return Integer.valueOf(resultCode);
        }
    }

    @NotNull
    public static final h0<b, Integer> b() {
        return new h0<>(new a(), new g.a() { // from class: mp.e
            @Override // g.a
            public final void a(Object obj) {
                f.c(((Integer) obj).intValue());
            }
        });
    }

    public static final void c(int i10) {
        new h().b(i10);
    }
}
