.class public interface abstract Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/withpersona/sdk2/inquiry/ExperimentalInquiryApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008g\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;",
        "",
        "onEvent",
        "",
        "event",
        "Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;",
        "inquiry-dynamic-feature_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract onEvent(Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;)V
    .param p1    # Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
