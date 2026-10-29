package mp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p139g.InterfaceC5852a;
import p154h.AbstractC6248a;
import p229jt.C7345l;

/* JADX INFO: renamed from: mp.f */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"Lmp/h0;", "Lmp/b;", "", "b", "()Lmp/h0;", "launchers_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8619f {

    /* JADX INFO: renamed from: mp.f$a */
    @Metadata(m31664d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"mp/f$a", "Lh/a;", "Lmp/b;", "", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lmp/b;)Landroid/content/Intent;", "resultCode", "intent", "b", "(ILandroid/content/Intent;)Ljava/lang/Integer;", "launchers_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC6248a<InterfaceC8611b, Integer> {
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // p154h.AbstractC6248a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(Context context, InterfaceC8611b input) {
            Intent intent;
            Intent intent2;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            if (input instanceof C8613c) {
                C8613c c8613c = (C8613c) input;
                intent = c8613c.getIntent().f43452a;
                intent.setData(Uri.parse(c8613c.getUrl()));
            } else {
                if (!(input instanceof C8609a)) {
                    throw new C7345l();
                }
                C8609a c8609a = (C8609a) input;
                intent = c8609a.getIntent().f42456a;
                intent.setData(Uri.parse(c8609a.getUrl()));
                intent.putExtra("androidx.browser.auth.extra.HTTPS_REDIRECT_HOST", c8609a.getHost());
                intent.putExtra("androidx.browser.auth.extra.HTTPS_REDIRECT_PATH", c8609a.getPath());
            }
            Intrinsics.checkNotNull(intent);
            String packageName = input.getPackageName();
            return (packageName == null || (intent2 = intent.setPackage(packageName)) == null) ? intent : intent2;
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // p154h.AbstractC6248a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer parseResult(int resultCode, Intent intent) {
            return Integer.valueOf(resultCode);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final C8624h0<InterfaceC8611b, Integer> m34669b() {
        return new C8624h0<>(new a(), new InterfaceC5852a() { // from class: mp.e
            @Override // p139g.InterfaceC5852a
            /* JADX INFO: renamed from: a */
            public final void mo4481a(Object obj) {
                C8619f.m34670c(((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static final void m34670c(int i10) {
        new C8623h().m34680b(i10);
    }
}
