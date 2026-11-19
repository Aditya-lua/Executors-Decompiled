package eq;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Leq/g;", "Lh/a;", "Leq/f;", "Leq/l;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Leq/f;)Landroid/content/Intent;", BuildConfig.FLAVOR, "resultCode", "intent", "b", "(ILandroid/content/Intent;)Leq/l;", "nfc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g extends h.a<PassportNfcReaderConfig, l> {
    @Override // h.a
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(@NotNull Context context, @NotNull PassportNfcReaderConfig input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intent = new Intent(context, e.f14059a.a());
        intent.putExtra("EXTRA_NFC_READER_CONFIG", input);
        return intent;
    }

    @Override // h.a
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l parseResult(int resultCode, @Nullable Intent intent) {
        Bundle extras;
        l lVar;
        return (intent == null || (extras = intent.getExtras()) == null || (lVar = (l) u2.c.a(extras, "EXTRA_RESULT", l.class)) == null) ? new l.b("Unable to extract output from result intent.", l.c.Unknown) : lVar;
    }
}
