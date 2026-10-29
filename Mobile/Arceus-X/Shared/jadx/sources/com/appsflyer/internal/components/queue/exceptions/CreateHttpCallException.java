package com.appsflyer.internal.components.queue.exceptions;

import androidx.core.app.NotificationCompat;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006"}, m31665d2 = {"Lcom/appsflyer/internal/components/queue/exceptions/CreateHttpCallException;", "Ljava/util/NoSuchElementException;", "Lkotlin/NoSuchElementException;", "", NotificationCompat.CATEGORY_MESSAGE, "<init>", "(Ljava/lang/String;)V"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class CreateHttpCallException extends NoSuchElementException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateHttpCallException(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
    }
}
