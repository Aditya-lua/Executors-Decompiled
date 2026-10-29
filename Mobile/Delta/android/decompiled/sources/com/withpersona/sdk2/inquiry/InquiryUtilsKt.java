package com.withpersona.sdk2.inquiry;

import androidx.fragment.app.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0007¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;", "Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;", "toInlineInquiryBuilder", "(Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;)Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;", "Lcom/withpersona/sdk2/inquiry/InquiryBuilder;", "(Lcom/withpersona/sdk2/inquiry/InquiryBuilder;)Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;", "Landroidx/fragment/app/c;", "createFragment", "(Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;)Landroidx/fragment/app/c;", "inquiry-dynamic-feature_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class InquiryUtilsKt {
    @ExperimentalInlineApi
    @Nullable
    public static final c createFragment(@NotNull InlineInquiryBuilder inlineInquiryBuilder) {
        Intrinsics.checkNotNullParameter(inlineInquiryBuilder, "<this>");
        return inlineInquiryBuilder.build().createFragment();
    }

    @ExperimentalInlineApi
    @NotNull
    public static final InlineInquiryBuilder toInlineInquiryBuilder(@NotNull InquiryTemplateBuilder inquiryTemplateBuilder) {
        Intrinsics.checkNotNullParameter(inquiryTemplateBuilder, "<this>");
        return inquiryTemplateBuilder.build().buildInlineInquiry();
    }

    @ExperimentalInlineApi
    @NotNull
    public static final InlineInquiryBuilder toInlineInquiryBuilder(@NotNull InquiryBuilder inquiryBuilder) {
        Intrinsics.checkNotNullParameter(inquiryBuilder, "<this>");
        return inquiryBuilder.build().buildInlineInquiry();
    }
}
