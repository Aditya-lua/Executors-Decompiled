.class public final Lg6/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lg6/z;",
        "Ljava/lang/Runnable;",
        "Ly5/s;",
        "processor",
        "Ly5/y;",
        "token",
        "",
        "stopInForeground",
        "",
        "reason",
        "<init>",
        "(Ly5/s;Ly5/y;ZI)V",
        "",
        "run",
        "()V",
        "a",
        "Ly5/s;",
        "b",
        "Ly5/y;",
        "c",
        "Z",
        "d",
        "I",
        "work-runtime_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Ly5/s;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Ly5/y;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Z

.field public final d:I


# direct methods
.method public constructor <init>(Ly5/s;Ly5/y;ZI)V
    .locals 1
    .param p1    # Ly5/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ly5/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "processor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "token"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/z;->a:Ly5/s;

    iput-object p2, p0, Lg6/z;->b:Ly5/y;

    iput-boolean p3, p0, Lg6/z;->c:Z

    iput p4, p0, Lg6/z;->d:I

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-boolean v0, p0, Lg6/z;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg6/z;->a:Ly5/s;

    iget-object v1, p0, Lg6/z;->b:Ly5/y;

    iget v2, p0, Lg6/z;->d:I

    invoke-virtual {v0, v1, v2}, Ly5/s;->r(Ly5/y;I)Z

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lg6/z;->a:Ly5/s;

    iget-object v1, p0, Lg6/z;->b:Ly5/y;

    iget v2, p0, Lg6/z;->d:I

    invoke-virtual {v0, v1, v2}, Ly5/s;->s(Ly5/y;I)Z

    move-result v0

    :goto_0
    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object v1

    const-string v2, "StopWorkRunnable"

    invoke-static {v2}, Lx5/w;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "StopWorkRunnable for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lg6/z;->b:Ly5/y;

    invoke-virtual {v4}, Ly5/y;->a()Lf6/w;

    move-result-object v4

    invoke-virtual {v4}, Lf6/w;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "; Processor.stopWork = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lx5/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
