.class public final Lcom/withpersona/sdk2/inquiry/document/network/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lln/o;
.implements Lls/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/document/network/e$a;,
        Lcom/withpersona/sdk2/inquiry/document/network/e$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lln/o<",
        "Lcom/withpersona/sdk2/inquiry/document/network/e$b;",
        ">;",
        "Lls/j<",
        "Lcom/withpersona/sdk2/inquiry/document/network/e$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0014\rB!\u0008\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u000c2\n\u0010\u000b\u001a\u0006\u0012\u0002\u0008\u00030\u0001H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u000c2\n\u0010\u000b\u001a\u0006\u0012\u0002\u0008\u00030\u0003H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0016R\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0015\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/document/network/e;",
        "Lln/o;",
        "Lcom/withpersona/sdk2/inquiry/document/network/e$b;",
        "Lls/j;",
        "",
        "sessionToken",
        "Lpo/c;",
        "service",
        "documentId",
        "<init>",
        "(Ljava/lang/String;Lpo/c;Ljava/lang/String;)V",
        "otherWorker",
        "",
        "a",
        "(Lln/o;)Z",
        "c",
        "(Lls/j;)Z",
        "Ldv/h;",
        "run",
        "()Ldv/h;",
        "b",
        "Ljava/lang/String;",
        "Lpo/c;",
        "d",
        "f",
        "()Ljava/lang/String;",
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
.field public final b:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lpo/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lpo/c;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/e;->b:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/network/e;->c:Lpo/c;

    .line 5
    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/document/network/e;->d:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lpo/c;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/document/network/e;-><init>(Ljava/lang/String;Lpo/c;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic d(Lcom/withpersona/sdk2/inquiry/document/network/e;)Lpo/c;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/document/network/e;->c:Lpo/c;

    return-object p0
.end method

.method public static final synthetic e(Lcom/withpersona/sdk2/inquiry/document/network/e;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/document/network/e;->b:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public a(Lln/o;)Z
    .locals 2
    .param p1    # Lln/o;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lln/o<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "otherWorker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/document/network/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/e;->b:Ljava/lang/String;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/network/e;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/document/network/e;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/e;->d:Ljava/lang/String;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/document/network/e;->d:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public b(Lls/j;)Z
    .locals 0
    .param p1    # Lls/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lls/j<",
            "*>;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Lls/j;->b(Lls/j;)Z

    move-result p1

    return p1
.end method

.method public c(Lls/j;)Z
    .locals 2
    .param p1    # Lls/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lls/j<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "otherWorker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/document/network/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/e;->b:Ljava/lang/String;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/network/e;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/document/network/e;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/e;->d:Ljava/lang/String;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/document/network/e;->d:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final f()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/e;->d:Ljava/lang/String;

    return-object v0
.end method

.method public run()Ldv/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldv/h<",
            "Lcom/withpersona/sdk2/inquiry/document/network/e$b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/withpersona/sdk2/inquiry/document/network/e$c;-><init>(Lcom/withpersona/sdk2/inquiry/document/network/e;Leu/b;)V

    invoke-static {v0}, Ldv/j;->w(Lkotlin/jvm/functions/Function2;)Ldv/h;

    move-result-object v0

    return-object v0
.end method
