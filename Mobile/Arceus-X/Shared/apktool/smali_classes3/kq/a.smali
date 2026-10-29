.class public Lkq/a;
.super Landroidx/fragment/app/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lr5/a;",
        ">",
        "Landroidx/fragment/app/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0016\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0017\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0017\u00a2\u0006\u0004\u0008\u0016\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\nH\u0017\u00a2\u0006\u0004\u0008\u0017\u0010\u0005J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\rH\u0017\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0011\u0010\t\u001a\u00028\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Lkq/a;",
        "Lr5/a;",
        "T",
        "Landroidx/fragment/app/c;",
        "<init>",
        "()V",
        "",
        "d2",
        "()Z",
        "binding",
        "",
        "e2",
        "(Lr5/a;)V",
        "Landroid/content/Context;",
        "context",
        "C0",
        "(Landroid/content/Context;)V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/LayoutInflater;",
        "O0",
        "(Landroid/os/Bundle;)Landroid/view/LayoutInflater;",
        "M0",
        "N0",
        "x",
        "()Landroid/content/Context;",
        "Lkq/d;",
        "c2",
        "()Lkq/d;",
        "f0",
        "Lr5/a;",
        "_binding",
        "g0",
        "Landroid/content/Context;",
        "themedContext",
        "b2",
        "()Lr5/a;",
        "shared_release"
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
.field public f0:Lr5/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public g0:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/fragment/app/c;-><init>()V

    return-void
.end method


# virtual methods
.method public C0(Landroid/content/Context;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/fragment/app/c;->C0(Landroid/content/Context;)V

    invoke-virtual {p0}, Lkq/a;->c2()Lkq/d;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lkq/d;->isInline()Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    invoke-interface {v0}, Lkq/d;->getTheme()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Lvp/h;->c:I

    :goto_0
    new-instance v1, Lo/d;

    invoke-direct {v1, p1, v0}, Lo/d;-><init>(Landroid/content/Context;I)V

    iput-object v1, p0, Lkq/a;->g0:Landroid/content/Context;

    return-void

    :cond_1
    iput-object p1, p0, Lkq/a;->g0:Landroid/content/Context;

    return-void
.end method

.method public M0()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/c;->M0()V

    const/4 v0, 0x0

    iput-object v0, p0, Lkq/a;->f0:Lr5/a;

    return-void
.end method

.method public N0()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/c;->N0()V

    const/4 v0, 0x0

    iput-object v0, p0, Lkq/a;->g0:Landroid/content/Context;

    return-void
.end method

.method public O0(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-super {p0, p1}, Landroidx/fragment/app/c;->O0(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object p1

    const-string v0, "onGetLayoutInflater(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkq/a;->g0:Landroid/content/Context;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lkq/a;->x()Landroid/content/Context;

    move-result-object v0

    :cond_0
    invoke-virtual {p1, v0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const-string v0, "cloneInContext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final b2()Lr5/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lkq/a;->f0:Lr5/a;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final c2()Lkq/d;
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/c;->K()Landroidx/fragment/app/c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    instance-of v1, v0, Lkq/d;

    if-eqz v1, :cond_0

    check-cast v0, Lkq/d;

    return-object v0

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/c;->K()Landroidx/fragment/app/c;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final d2()Z
    .locals 1

    iget-object v0, p0, Lkq/a;->f0:Lr5/a;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final e2(Lr5/a;)V
    .locals 1
    .param p1    # Lr5/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lkq/a;->f0:Lr5/a;

    return-void
.end method

.method public x()Landroid/content/Context;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lkq/a;->g0:Landroid/content/Context;

    if-nez v0, :cond_0

    invoke-super {p0}, Landroidx/fragment/app/c;->x()Landroid/content/Context;

    move-result-object v0

    :cond_0
    return-object v0
.end method
