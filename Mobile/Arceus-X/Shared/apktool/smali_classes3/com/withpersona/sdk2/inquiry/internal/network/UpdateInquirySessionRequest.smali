.class public final Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$AppdomeThreatEvent;,
        Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Attributes;,
        Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$a;,
        Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Data;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0001\u0018\u0000 \t2\u00020\u0001:\u0004\n\u000b\u000c\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0006\u0010\u0008\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;",
        "",
        "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Data;",
        "data",
        "<init>",
        "(Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Data;)V",
        "a",
        "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Data;",
        "()Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Data;",
        "b",
        "Data",
        "Attributes",
        "AppdomeThreatEvent",
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


# static fields
.field public static final b:Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Data;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;->b:Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$a;

    return-void
.end method

.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Data;)V
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Data;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;->a:Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Data;

    return-void
.end method


# virtual methods
.method public final a()Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Data;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;->a:Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Data;

    return-object v0
.end method
