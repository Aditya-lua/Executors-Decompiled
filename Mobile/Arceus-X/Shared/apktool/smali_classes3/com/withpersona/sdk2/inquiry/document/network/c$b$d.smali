.class public final Lcom/withpersona/sdk2/inquiry/document/network/c$b$d;
.super Lcom/withpersona/sdk2/inquiry/document/network/c$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/document/network/c$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000c\u001a\u0004\u0008\u0008\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/document/network/c$b$d;",
        "Lcom/withpersona/sdk2/inquiry/document/network/c$b;",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;",
        "oldLocalDocument",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;",
        "newRemoteDocument",
        "<init>",
        "(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)V",
        "a",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;",
        "b",
        "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;",
        "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;",
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


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)V
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "oldLocalDocument"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newRemoteDocument"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/withpersona/sdk2/inquiry/document/network/c$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$b$d;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$b$d;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    return-void
.end method


# virtual methods
.method public final a()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$b$d;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    return-object v0
.end method

.method public final b()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$b$d;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    return-object v0
.end method
