.class public final Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest$a;",
        "",
        "<init>",
        "()V",
        "",
        "inquiryId",
        "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;",
        "a",
        "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "inquiryId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;

    new-instance v1, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest$Data;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v2}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest$Data;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest$Meta;

    invoke-direct {v2, p1}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest$Meta;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest$Data;Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest$Meta;)V

    return-object v0
.end method
