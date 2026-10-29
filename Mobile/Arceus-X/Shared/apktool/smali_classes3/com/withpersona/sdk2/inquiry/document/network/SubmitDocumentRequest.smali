.class public final Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$a;,
        Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;,
        Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0003\u000f\u0010\u0008B\u001b\u0008\u0000\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0008\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\u000b\u0010\r\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;",
        "",
        "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;",
        "data",
        "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;",
        "meta",
        "<init>",
        "(Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;)V",
        "a",
        "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;",
        "()Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;",
        "b",
        "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;",
        "()Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;",
        "c",
        "Data",
        "Meta",
        "document_release"
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
.field public static final c:Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;->c:Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$a;

    return-void
.end method

.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;)V
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "meta"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;->a:Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;

    .line 3
    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;->b:Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p4, 0x1

    and-int/2addr p3, p4

    if-eqz p3, :cond_0

    .line 4
    new-instance p1, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;

    const/4 p3, 0x0

    invoke-direct {p1, p3, p4, p3}, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;-><init>(Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;->a:Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;

    return-object v0
.end method

.method public final b()Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;->b:Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;

    return-object v0
.end method
