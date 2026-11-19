.class public final Lnh/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lnh/i;",
        "",
        "Lwl/c;",
        "designFoundations",
        "Ljava/lang/Runnable;",
        "onTokensChanged",
        "<init>",
        "(Lwl/c;Ljava/lang/Runnable;)V",
        "",
        "b",
        "()V",
        "c",
        "a",
        "Lwl/c;",
        "Ljava/lang/Runnable;",
        "Lav/p0;",
        "Lav/p0;",
        "scope",
        "NativeShell_googleProdRelease"
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
.field public final a:Lwl/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Ljava/lang/Runnable;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:Lav/p0;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwl/c;Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Lwl/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "designFoundations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTokensChanged"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnh/i;->a:Lwl/c;

    iput-object p2, p0, Lnh/i;->b:Ljava/lang/Runnable;

    return-void
.end method

.method public static final synthetic a(Lnh/i;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lnh/i;->b:Ljava/lang/Runnable;

    return-object p0
.end method


# virtual methods
.method public final b()V
    .locals 3

    invoke-static {}, Lav/q0;->b()Lav/p0;

    move-result-object v0

    iput-object v0, p0, Lnh/i;->c:Lav/p0;

    iget-object v0, p0, Lnh/i;->a:Lwl/c;

    invoke-interface {v0}, Lwl/c;->a()Ldv/h;

    move-result-object v0

    new-instance v1, Lnh/i$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lnh/i$a;-><init>(Lnh/i;Leu/b;)V

    invoke-static {v0, v1}, Ldv/j;->E(Ldv/h;Lkotlin/jvm/functions/Function2;)Ldv/h;

    move-result-object v0

    iget-object v1, p0, Lnh/i;->c:Lav/p0;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v0, v1}, Ldv/j;->z(Ldv/h;Lav/p0;)Lav/d2;

    return-void
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Lnh/i;->c:Lav/p0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lav/q0;->f(Lav/p0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    iput-object v1, p0, Lnh/i;->c:Lav/p0;

    return-void
.end method
