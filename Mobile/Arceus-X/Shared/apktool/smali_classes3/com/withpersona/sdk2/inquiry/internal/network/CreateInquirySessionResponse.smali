.class public final Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0008\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\u000b\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;",
        "",
        "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;",
        "data",
        "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;",
        "meta",
        "<init>",
        "(Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;)V",
        "a",
        "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;",
        "()Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;",
        "b",
        "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;",
        "()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;",
        "Meta",
        "inquiry-internal_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lum/i;
    generateAdapter = true
.end annotation


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;)V
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "meta"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;->a:Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;->b:Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;

    return-void
.end method


# virtual methods
.method public final a()Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;->a:Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;

    return-object v0
.end method

.method public final b()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;->b:Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;

    return-object v0
.end method
