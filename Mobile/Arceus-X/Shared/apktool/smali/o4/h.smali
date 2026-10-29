.class public abstract Lo4/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0015\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0015\u00a2\u0006\u0004\u0008\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0015\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0005\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0005\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0006H\u0005\u00a2\u0006\u0004\u0008\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0006H\u0005\u00a2\u0006\u0004\u0008\u001a\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u0008R\u0016\u0010 \u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lo4/h;",
        "",
        "<init>",
        "()V",
        "Lo4/c;",
        "dispatcher",
        "",
        "e",
        "(Lo4/c;)V",
        "i",
        "",
        "hasEnabledHandlers",
        "f",
        "(Z)V",
        "j",
        "Lo4/f;",
        "history",
        "g",
        "(Lo4/f;)V",
        "k",
        "Lo4/b;",
        "event",
        "d",
        "(Lo4/b;)V",
        "c",
        "a",
        "b",
        "Lo4/c;",
        "h",
        "()Lo4/c;",
        "l",
        "Z",
        "isPredictiveBackInProgress",
        "navigationevent"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public a:Lo4/c;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public b:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lo4/h;->a:Lo4/c;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lo4/h;->b:Z

    const/4 v2, -0x1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v2, v1}, Lo4/c;->i(Lo4/h;ILo4/b;)V

    :cond_0
    invoke-virtual {v0, p0, v2}, Lo4/c;->f(Lo4/h;I)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo4/h;->b:Z

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This input is not added to any dispatcher."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Lo4/h;->a:Lo4/c;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lo4/h;->b:Z

    const/4 v2, -0x1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v2, v1}, Lo4/c;->i(Lo4/h;ILo4/b;)V

    :cond_0
    invoke-virtual {v0, p0, v2}, Lo4/c;->g(Lo4/h;I)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo4/h;->b:Z

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This input is not added to any dispatcher."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c(Lo4/b;)V
    .locals 2
    .param p1    # Lo4/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo4/h;->a:Lo4/c;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lo4/h;->b:Z

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    invoke-virtual {v0, p0, v1, p1}, Lo4/c;->h(Lo4/h;ILo4/b;)V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This input is not added to any dispatcher."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d(Lo4/b;)V
    .locals 2
    .param p1    # Lo4/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo4/h;->a:Lo4/c;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lo4/h;->b:Z

    if-nez v1, :cond_0

    const/4 v1, -0x1

    invoke-virtual {v0, p0, v1, p1}, Lo4/c;->i(Lo4/h;ILo4/b;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lo4/h;->b:Z

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This input is not added to any dispatcher."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e(Lo4/c;)V
    .locals 1
    .param p1    # Lo4/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "dispatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lo4/h;->i(Lo4/c;)V

    return-void
.end method

.method public final f(Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lo4/h;->j(Z)V

    return-void
.end method

.method public final g(Lo4/f;)V
    .locals 1
    .param p1    # Lo4/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "history"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lo4/h;->k(Lo4/f;)V

    return-void
.end method

.method public final h()Lo4/c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lo4/h;->a:Lo4/c;

    return-object v0
.end method

.method public i(Lo4/c;)V
    .locals 1
    .param p1    # Lo4/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "dispatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public j(Z)V
    .locals 0

    return-void
.end method

.method public k(Lo4/f;)V
    .locals 1
    .param p1    # Lo4/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "history"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final l(Lo4/c;)V
    .locals 0
    .param p1    # Lo4/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lo4/h;->a:Lo4/c;

    return-void
.end method
