.class public final Lbn/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbn/d;
.implements Landroidx/lifecycle/s;
.implements Landroid/view/View$OnAttachStateChangeListener;
.implements Landroidx/lifecycle/p;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B%\u0012\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\tH\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR \u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0016\u0010\'\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0016\u0010,\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008+\u0010&\u00a8\u0006-"
    }
    d2 = {
        "Lbn/b;",
        "Lbn/d;",
        "Landroidx/lifecycle/s;",
        "Landroid/view/View$OnAttachStateChangeListener;",
        "Landroidx/lifecycle/p;",
        "Lkotlin/Function1;",
        "Landroid/view/View;",
        "Landroidx/lifecycle/l;",
        "findParentLifecycle",
        "",
        "enforceMainThread",
        "<init>",
        "(Lkotlin/jvm/functions/Function1;Z)V",
        "v",
        "",
        "onViewAttachedToWindow",
        "(Landroid/view/View;)V",
        "onViewDetachedFromWindow",
        "source",
        "Landroidx/lifecycle/l$a;",
        "event",
        "g",
        "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V",
        "L",
        "()V",
        "a",
        "()Landroidx/lifecycle/l;",
        "isAttached",
        "b",
        "(Z)V",
        "Lkotlin/jvm/functions/Function1;",
        "Landroid/view/View;",
        "view",
        "Landroidx/lifecycle/u;",
        "c",
        "Landroidx/lifecycle/u;",
        "localLifecycle",
        "d",
        "Z",
        "hasBeenDestroyed",
        "e",
        "Landroidx/lifecycle/l;",
        "parentLifecycle",
        "f",
        "destroyOnDetach",
        "wf1-core-android"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroid/view/View;",
            "Landroidx/lifecycle/l;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Landroid/view/View;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final c:Landroidx/lifecycle/u;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public d:Z

.field public e:Landroidx/lifecycle/l;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public f:Z


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Z)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/View;",
            "+",
            "Landroidx/lifecycle/l;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "findParentLifecycle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lbn/b;->a:Lkotlin/jvm/functions/Function1;

    if-eqz p2, :cond_0

    .line 3
    new-instance p1, Landroidx/lifecycle/u;

    invoke-direct {p1, p0}, Landroidx/lifecycle/u;-><init>(Landroidx/lifecycle/s;)V

    goto :goto_0

    :cond_0
    invoke-static {p0}, Landroidx/lifecycle/u;->g(Landroidx/lifecycle/s;)Landroidx/lifecycle/u;

    move-result-object p1

    const-string p2, "createUnsafe(this)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    iput-object p1, p0, Lbn/b;->c:Landroidx/lifecycle/u;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, Lbn/b;-><init>(Lkotlin/jvm/functions/Function1;Z)V

    return-void
.end method

.method public static synthetic c(Lbn/b;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_1

    iget-object p1, p0, Lbn/b;->b:Landroid/view/View;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Lbn/b;->b(Z)V

    return-void
.end method


# virtual methods
.method public L()V
    .locals 3

    iget-boolean v0, p0, Lbn/b;->f:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lbn/b;->f:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v1, v0, v2}, Lbn/b;->c(Lbn/b;ZILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public a()Landroidx/lifecycle/l;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lbn/b;->c:Landroidx/lifecycle/u;

    return-object v0
.end method

.method public final b(Z)V
    .locals 6

    iget-object v0, p0, Lbn/b;->e:Landroidx/lifecycle/l;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/lifecycle/l;->b()Landroidx/lifecycle/l$b;

    move-result-object v0

    :goto_0
    iget-object v2, p0, Lbn/b;->c:Landroidx/lifecycle/u;

    invoke-virtual {v2}, Landroidx/lifecycle/u;->b()Landroidx/lifecycle/l$b;

    move-result-object v2

    const-string v3, "localLifecycle.currentState"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Landroidx/lifecycle/l$b;->a:Landroidx/lifecycle/l$b;

    if-eq v2, v3, :cond_9

    iget-boolean v4, p0, Lbn/b;->d:Z

    if-eqz v4, :cond_1

    goto :goto_5

    :cond_1
    iget-object v4, p0, Lbn/b;->c:Landroidx/lifecycle/u;

    iget-boolean v5, p0, Lbn/b;->f:Z

    if-eqz v5, :cond_2

    if-nez p1, :cond_2

    move-object v0, v3

    goto :goto_1

    :cond_2
    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    sget-object v0, Landroidx/lifecycle/l$b;->b:Landroidx/lifecycle/l$b;

    if-ne v2, v0, :cond_8

    :goto_1
    if-ne v0, v3, :cond_6

    const/4 p1, 0x1

    iput-boolean p1, p0, Lbn/b;->d:Z

    iget-object p1, p0, Lbn/b;->e:Landroidx/lifecycle/l;

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p1, p0}, Landroidx/lifecycle/l;->d(Landroidx/lifecycle/r;)V

    :goto_2
    iput-object v1, p0, Lbn/b;->e:Landroidx/lifecycle/l;

    iget-object p1, p0, Lbn/b;->b:Landroid/view/View;

    if-nez p1, :cond_5

    goto :goto_3

    :cond_5
    iput-object v1, p0, Lbn/b;->b:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :goto_3
    sget-object p1, Landroidx/lifecycle/l$b;->b:Landroidx/lifecycle/l$b;

    if-ne v2, p1, :cond_7

    move-object v3, p1

    goto :goto_4

    :cond_6
    move-object v3, v0

    :cond_7
    :goto_4
    invoke-virtual {v4, v3}, Landroidx/lifecycle/u;->o(Landroidx/lifecycle/l$b;)V

    return-void

    :cond_8
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Must have a parent lifecycle after attaching and until being destroyed."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_9
    :goto_5
    iput-object v1, p0, Lbn/b;->b:Landroid/view/View;

    return-void
.end method

.method public g(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/lifecycle/l$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    const/4 v0, 0x0

    invoke-static {p0, v0, p1, p2}, Lbn/b;->c(Lbn/b;ZILjava/lang/Object;)V

    return-void
.end method

.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbn/b;->c:Landroidx/lifecycle/u;

    invoke-virtual {v0}, Landroidx/lifecycle/u;->b()Landroidx/lifecycle/l$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/l$b;->a:Landroidx/lifecycle/l$b;

    if-eq v0, v1, :cond_4

    iget-boolean v0, p0, Lbn/b;->d:Z

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    iput-object p1, p0, Lbn/b;->b:Landroid/view/View;

    iget-object v0, p0, Lbn/b;->e:Landroidx/lifecycle/l;

    iget-object v1, p0, Lbn/b;->a:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/l;

    iput-object p1, p0, Lbn/b;->e:Landroidx/lifecycle/l;

    if-eq p1, v0, :cond_3

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p0}, Landroidx/lifecycle/l;->d(Landroidx/lifecycle/r;)V

    :goto_0
    iget-object p1, p0, Lbn/b;->e:Landroidx/lifecycle/l;

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1, p0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_3
    :goto_1
    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lbn/b;->b(Z)V

    :cond_4
    :goto_2
    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lbn/b;->b(Z)V

    return-void
.end method
