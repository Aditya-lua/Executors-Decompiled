.class public final Lhq/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lls/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhq/i$a;,
        Lhq/i$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lls/j<",
        "Lhq/i$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0010B\u001b\u0008\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\tH\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\u000c\u001a\u0006\u0012\u0002\u0008\u00030\u0001H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lhq/i;",
        "Lls/j;",
        "Lhq/i$b;",
        "Lhq/m;",
        "permissionsHelper",
        "Lfq/n1$c;",
        "props",
        "<init>",
        "(Lhq/m;Lfq/n1$c;)V",
        "Ldv/h;",
        "run",
        "()Ldv/h;",
        "otherWorker",
        "",
        "c",
        "(Lls/j;)Z",
        "b",
        "Lhq/m;",
        "Lfq/n1$c;",
        "a",
        "permissions_release"
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
.field public final b:Lhq/m;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lfq/n1$c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhq/m;Lfq/n1$c;)V
    .locals 1
    .param p1    # Lhq/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lfq/n1$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "permissionsHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "props"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhq/i;->b:Lhq/m;

    iput-object p2, p0, Lhq/i;->c:Lfq/n1$c;

    return-void
.end method

.method public static final synthetic a(Lhq/i;)Lhq/m;
    .locals 0

    iget-object p0, p0, Lhq/i;->b:Lhq/m;

    return-object p0
.end method

.method public static final synthetic d(Lhq/i;)Lfq/n1$c;
    .locals 0

    iget-object p0, p0, Lhq/i;->c:Lfq/n1$c;

    return-object p0
.end method


# virtual methods
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

    invoke-super {p0, p1}, Lls/j;->c(Lls/j;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lhq/i;

    iget-object v0, p0, Lhq/i;->c:Lfq/n1$c;

    invoke-virtual {v0}, Lfq/n1$c;->k()Lfq/n0;

    move-result-object v0

    iget-object p1, p1, Lhq/i;->c:Lfq/n1$c;

    invoke-virtual {p1}, Lfq/n1$c;->k()Lfq/n0;

    move-result-object p1

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public run()Ldv/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldv/h<",
            "Lhq/i$b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lhq/i$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lhq/i$c;-><init>(Lhq/i;Leu/b;)V

    invoke-static {v0}, Ldv/j;->w(Lkotlin/jvm/functions/Function2;)Ldv/h;

    move-result-object v0

    return-object v0
.end method
