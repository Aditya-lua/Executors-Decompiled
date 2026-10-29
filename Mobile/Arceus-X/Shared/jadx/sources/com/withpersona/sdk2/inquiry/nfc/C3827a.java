package com.withpersona.sdk2.inquiry.nfc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p154h.AbstractC6248a;
import p390qp.C10690d;
import p456u2.C11774c;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.nfc.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/a;", "Lh/a;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;)Landroid/content/Intent;", "", "resultCode", "intent", "b", "(ILandroid/content/Intent;)Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "nfc_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3827a extends AbstractC6248a<PassportNfcReaderConfig, PassportNfcReaderOutput> {
    /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
    @Override // p154h.AbstractC6248a
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(@NotNull Context context, @NotNull PassportNfcReaderConfig input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intent = new Intent(context, C10690d.f38215a.m40762a());
        intent.putExtra("EXTRA_NFC_READER_CONFIG", input);
        return intent;
    }

    /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
    @Override // p154h.AbstractC6248a
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PassportNfcReaderOutput parseResult(int resultCode, @Nullable Intent intent) {
        Bundle extras;
        PassportNfcReaderOutput passportNfcReaderOutput;
        return (intent == null || (extras = intent.getExtras()) == null || (passportNfcReaderOutput = (PassportNfcReaderOutput) C11774c.m44055a(extras, "EXTRA_RESULT", PassportNfcReaderOutput.class)) == null) ? new PassportNfcReaderOutput.Error("Unable to extract output from result intent.", PassportNfcReaderOutput.EnumC3825a.Unknown) : passportNfcReaderOutput;
    }
}
