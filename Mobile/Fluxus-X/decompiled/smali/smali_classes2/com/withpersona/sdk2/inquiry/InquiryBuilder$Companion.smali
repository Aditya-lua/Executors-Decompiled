.class public final Lcom/withpersona/sdk2/inquiry/InquiryBuilder$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/InquiryBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u00a2\u0006\u0002\u0008\u0008J\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0000\u00a2\u0006\u0002\u0008\u000bJ\u0015\u0010\u000c\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H\u0000\u00a2\u0006\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/InquiryBuilder$Companion;",
        "",
        "<init>",
        "()V",
        "fromInquiryId",
        "Lcom/withpersona/sdk2/inquiry/InquiryBuilder;",
        "inquiryId",
        "",
        "fromInquiryId$inquiry_dynamic_feature_release",
        "fromOneTimeLinkCode",
        "code",
        "fromOneTimeLinkCode$inquiry_dynamic_feature_release",
        "fromRelaySessionToken",
        "relaySessionToken",
        "fromRelaySessionToken$inquiry_dynamic_feature_release",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/InquiryBuilder$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromInquiryId$inquiry_dynamic_feature_release(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryBuilder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "inquiryId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/InquiryBuilder;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/InquiryBuilder;-><init>()V

    invoke-static {v0, p1}, Lcom/withpersona/sdk2/inquiry/InquiryBuilder;->access$setInquiryId$p(Lcom/withpersona/sdk2/inquiry/InquiryBuilder;Ljava/lang/String;)V

    return-object v0
.end method

.method public final fromOneTimeLinkCode$inquiry_dynamic_feature_release(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryBuilder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/InquiryBuilder;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/InquiryBuilder;-><init>()V

    invoke-static {v0, p1}, Lcom/withpersona/sdk2/inquiry/InquiryBuilder;->access$setOneTimeLinkCode$p(Lcom/withpersona/sdk2/inquiry/InquiryBuilder;Ljava/lang/String;)V

    return-object v0
.end method

.method public final fromRelaySessionToken$inquiry_dynamic_feature_release(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryBuilder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "relaySessionToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/InquiryBuilder;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/InquiryBuilder;-><init>()V

    invoke-static {v0, p1}, Lcom/withpersona/sdk2/inquiry/InquiryBuilder;->access$setRelaySessionToken$p(Lcom/withpersona/sdk2/inquiry/InquiryBuilder;Ljava/lang/String;)V

    return-object v0
.end method
