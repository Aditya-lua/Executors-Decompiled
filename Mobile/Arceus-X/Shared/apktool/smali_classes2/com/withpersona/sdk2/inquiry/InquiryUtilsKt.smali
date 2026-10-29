.class public final Lcom/withpersona/sdk2/inquiry/InquiryUtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0005\u001a\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u0001H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;",
        "Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;",
        "toInlineInquiryBuilder",
        "(Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;)Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;",
        "Lcom/withpersona/sdk2/inquiry/InquiryBuilder;",
        "(Lcom/withpersona/sdk2/inquiry/InquiryBuilder;)Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;",
        "Landroidx/fragment/app/c;",
        "createFragment",
        "(Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;)Landroidx/fragment/app/c;",
        "inquiry-dynamic-feature_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final createFragment(Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;)Landroidx/fragment/app/c;
    .locals 1
    .param p0    # Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lcom/withpersona/sdk2/inquiry/ExperimentalInlineApi;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;->build()Lcom/withpersona/sdk2/inquiry/InlineInquiry;

    move-result-object p0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/InlineInquiry;->createFragment()Landroidx/fragment/app/c;

    move-result-object p0

    return-object p0
.end method

.method public static final toInlineInquiryBuilder(Lcom/withpersona/sdk2/inquiry/InquiryBuilder;)Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;
    .locals 1
    .param p0    # Lcom/withpersona/sdk2/inquiry/InquiryBuilder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lcom/withpersona/sdk2/inquiry/ExperimentalInlineApi;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/InquiryBuilder;->build()Lcom/withpersona/sdk2/inquiry/Inquiry;

    move-result-object p0

    .line 4
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/Inquiry;->buildInlineInquiry()Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static final toInlineInquiryBuilder(Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;)Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;
    .locals 1
    .param p0    # Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lcom/withpersona/sdk2/inquiry/ExperimentalInlineApi;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->build()Lcom/withpersona/sdk2/inquiry/Inquiry;

    move-result-object p0

    .line 2
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/Inquiry;->buildInlineInquiry()Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;

    move-result-object p0

    return-object p0
.end method
