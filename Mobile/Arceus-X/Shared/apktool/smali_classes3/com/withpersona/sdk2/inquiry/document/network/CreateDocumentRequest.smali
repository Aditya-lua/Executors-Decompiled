.class public final Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Attributes;,
        Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$a;,
        Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;,
        Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0004\u000f\u0010\u0011\u0008B\u0019\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0008\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\u000b\u0010\r\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;",
        "",
        "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;",
        "data",
        "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;",
        "meta",
        "<init>",
        "(Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;)V",
        "a",
        "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;",
        "()Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;",
        "b",
        "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;",
        "()Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;",
        "c",
        "Data",
        "Attributes",
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
.field public static final c:Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;->c:Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$a;

    return-void
.end method

.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;)V
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "meta"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;->a:Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;->b:Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;

    return-void
.end method


# virtual methods
.method public final a()Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;->a:Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;

    return-object v0
.end method

.method public final b()Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;->b:Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;

    return-object v0
.end method
