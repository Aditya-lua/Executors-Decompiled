package com.withpersona.sdk2.inquiry;

import androidx.core.app.NotificationCompat;
import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalInquiryApi
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;", "", "onEvent", "", NotificationCompat.CATEGORY_EVENT, "Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;", "inquiry-dynamic-feature_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface OnInquiryEventListener {
    void onEvent(@NotNull InquiryEvent event);
}
