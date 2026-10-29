package p154h;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: h.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m31665d2 = {"Lh/d;", "Lh/a;", "", "", "", "Landroid/net/Uri;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Lh/a$a;", "b", "(Landroid/content/Context;[Ljava/lang/String;)Lh/a$a;", "", "resultCode", "intent", "c", "(ILandroid/content/Intent;)Ljava/util/List;", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public class C6251d extends AbstractC6248a<String[], List<Uri>> {
    /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
    @Override // p154h.AbstractC6248a
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(@NotNull Context context, @NotNull String[] input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
        Intrinsics.checkNotNullExpressionValue(type, "setType(...)");
        return type;
    }

    /* JADX DEBUG: Method merged with bridge method: getSynchronousResult(Landroid/content/Context;Ljava/lang/Object;)Lh/a$a; */
    @Override // p154h.AbstractC6248a
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC6248a.a<List<Uri>> getSynchronousResult(@NotNull Context context, @NotNull String[] input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
    @Override // p154h.AbstractC6248a
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final List<Uri> parseResult(int resultCode, @Nullable Intent intent) {
        List<Uri> listM27451a;
        if (resultCode != -1) {
            intent = null;
        }
        return (intent == null || (listM27451a = C6249b.INSTANCE.m27451a(intent)) == null) ? C7699p.m31892k() : listM27451a;
    }
}
