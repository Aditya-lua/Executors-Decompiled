.class public final Landroidx/fragment/app/b$a;
.super Landroidx/fragment/app/i$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Landroidx/fragment/app/b$a;",
        "Landroidx/fragment/app/i$b;",
        "Landroidx/fragment/app/b$b;",
        "animationInfo",
        "<init>",
        "(Landroidx/fragment/app/b$b;)V",
        "Landroid/view/ViewGroup;",
        "container",
        "",
        "d",
        "(Landroid/view/ViewGroup;)V",
        "c",
        "Landroidx/fragment/app/b$b;",
        "h",
        "()Landroidx/fragment/app/b$b;",
        "fragment_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final d:Landroidx/fragment/app/b$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/fragment/app/b$b;)V
    .locals 1
    .param p1    # Landroidx/fragment/app/b$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "animationInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/fragment/app/i$b;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/b$a;->d:Landroidx/fragment/app/b$b;

    return-void
.end method


# virtual methods
.method public c(Landroid/view/ViewGroup;)V
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/b$a;->d:Landroidx/fragment/app/b$b;

    invoke-virtual {v0}, Landroidx/fragment/app/b$f;->a()Landroidx/fragment/app/i$d;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/i$d;->h()Landroidx/fragment/app/c;

    move-result-object v1

    iget-object v1, v1, Landroidx/fragment/app/c;->K:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->clearAnimation()V

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-object p1, p0, Landroidx/fragment/app/b$a;->d:Landroidx/fragment/app/b$b;

    invoke-virtual {p1}, Landroidx/fragment/app/b$f;->a()Landroidx/fragment/app/i$d;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/fragment/app/i$d;->e(Landroidx/fragment/app/i$b;)V

    const/4 p1, 0x2

    invoke-static {p1}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Animation from operation "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " has been cancelled."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FragmentManager"

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public d(Landroid/view/ViewGroup;)V
    .locals 5
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/b$a;->d:Landroidx/fragment/app/b$b;

    invoke-virtual {v0}, Landroidx/fragment/app/b$f;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/b$a;->d:Landroidx/fragment/app/b$b;

    invoke-virtual {p1}, Landroidx/fragment/app/b$f;->a()Landroidx/fragment/app/i$d;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/fragment/app/i$d;->e(Landroidx/fragment/app/i$b;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/b$a;->d:Landroidx/fragment/app/b$b;

    invoke-virtual {v1}, Landroidx/fragment/app/b$f;->a()Landroidx/fragment/app/i$d;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/i$d;->h()Landroidx/fragment/app/c;

    move-result-object v2

    iget-object v2, v2, Landroidx/fragment/app/c;->K:Landroid/view/View;

    iget-object v3, p0, Landroidx/fragment/app/b$a;->d:Landroidx/fragment/app/b$b;

    const-string v4, "context"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Landroidx/fragment/app/b$b;->c(Landroid/content/Context;)Landroidx/fragment/app/d$a;

    move-result-object v0

    const-string v3, "Required value was null."

    if-eqz v0, :cond_4

    iget-object v0, v0, Landroidx/fragment/app/d$a;->a:Landroid/view/animation/Animation;

    if-eqz v0, :cond_3

    invoke-virtual {v1}, Landroidx/fragment/app/i$d;->g()Landroidx/fragment/app/i$d$b;

    move-result-object v3

    sget-object v4, Landroidx/fragment/app/i$d$b;->b:Landroidx/fragment/app/i$d$b;

    if-eq v3, v4, :cond_1

    invoke-virtual {v2, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    iget-object p1, p0, Landroidx/fragment/app/b$a;->d:Landroidx/fragment/app/b$b;

    invoke-virtual {p1}, Landroidx/fragment/app/b$f;->a()Landroidx/fragment/app/i$d;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/fragment/app/i$d;->e(Landroidx/fragment/app/i$b;)V

    return-void

    :cond_1
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    new-instance v3, Landroidx/fragment/app/d$b;

    invoke-direct {v3, v0, p1, v2}, Landroidx/fragment/app/d$b;-><init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V

    new-instance v0, Landroidx/fragment/app/b$a$a;

    invoke-direct {v0, v1, p1, v2, p0}, Landroidx/fragment/app/b$a$a;-><init>(Landroidx/fragment/app/i$d;Landroid/view/ViewGroup;Landroid/view/View;Landroidx/fragment/app/b$a;)V

    invoke-virtual {v3, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    const/4 p1, 0x2

    invoke-static {p1}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Animation from operation "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " has started."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FragmentManager"

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final h()Landroidx/fragment/app/b$b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/b$a;->d:Landroidx/fragment/app/b$b;

    return-object v0
.end method
