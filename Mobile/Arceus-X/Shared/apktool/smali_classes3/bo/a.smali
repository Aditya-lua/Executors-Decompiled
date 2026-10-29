.class public final Lbo/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lym/o;
.implements Lvr/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbo/a$a;,
        Lbo/a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lym/o<",
        "Lbo/a$b;",
        ">;",
        "Lvr/h<",
        "Lbo/a$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\r\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u000f\u001fB)\u0008\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\u0008\u00030\u0001H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\u0008\u00030\u0003H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0017R\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0016\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Lbo/a;",
        "Lym/o;",
        "Lbo/a$b;",
        "Lvr/h;",
        "",
        "sessionToken",
        "Lbo/c;",
        "service",
        "documentId",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;",
        "remoteDocument",
        "<init>",
        "(Ljava/lang/String;Lbo/c;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)V",
        "otherWorker",
        "",
        "b",
        "(Lym/o;)Z",
        "c",
        "(Lvr/h;)Z",
        "Lnu/h;",
        "run",
        "()Lnu/h;",
        "Ljava/lang/String;",
        "Lbo/c;",
        "d",
        "getDocumentId",
        "()Ljava/lang/String;",
        "e",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;",
        "f",
        "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;",
        "a",
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

.field public final c:Lbo/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lbo/c;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lbo/a;->b:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lbo/a;->c:Lbo/c;

    .line 5
    iput-object p3, p0, Lbo/a;->d:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lbo/a;->e:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lbo/c;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lbo/a;-><init>(Ljava/lang/String;Lbo/c;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)V

    return-void
.end method

.method public static final synthetic d(Lbo/a;)Lbo/c;
    .locals 0

    iget-object p0, p0, Lbo/a;->c:Lbo/c;

    return-object p0
.end method

.method public static final synthetic e(Lbo/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lbo/a;->b:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public a(Lvr/h;)Z
    .locals 0
    .param p1    # Lvr/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvr/h<",
            "*>;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Lvr/h;->a(Lvr/h;)Z

    move-result p1

    return p1
.end method

.method public b(Lym/o;)Z
    .locals 2
    .param p1    # Lym/o;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lym/o<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "otherWorker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lbo/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbo/a;->b:Ljava/lang/String;

    check-cast p1, Lbo/a;

    iget-object v1, p1, Lbo/a;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbo/a;->e:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    iget-object p1, p1, Lbo/a;->e:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public c(Lvr/h;)Z
    .locals 2
    .param p1    # Lvr/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvr/h<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "otherWorker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lbo/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbo/a;->b:Ljava/lang/String;

    check-cast p1, Lbo/a;

    iget-object v1, p1, Lbo/a;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbo/a;->e:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    iget-object p1, p1, Lbo/a;->e:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final f()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lbo/a;->e:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    return-object v0
.end method

.method public run()Lnu/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnu/h<",
            "Lbo/a$b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lbo/a$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lbo/a$c;-><init>(Lbo/a;Lnt/b;)V

    invoke-static {v0}, Lnu/j;->w(Lkotlin/jvm/functions/Function2;)Lnu/h;

    move-result-object v0

    return-object v0
.end method
