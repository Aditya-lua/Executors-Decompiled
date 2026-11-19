.class public final Lf4/f$c;
.super Lf4/c1$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf4/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lf4/f$c;",
        "Lf4/c1$b;",
        "Lf4/f$b;",
        "animatorInfo",
        "<init>",
        "(Lf4/f$b;)V",
        "Landroid/view/ViewGroup;",
        "container",
        "",
        "f",
        "(Landroid/view/ViewGroup;)V",
        "Le/b;",
        "backEvent",
        "e",
        "(Le/b;Landroid/view/ViewGroup;)V",
        "d",
        "c",
        "Lf4/f$b;",
        "h",
        "()Lf4/f$b;",
        "Landroid/animation/AnimatorSet;",
        "Landroid/animation/AnimatorSet;",
        "getAnimator",
        "()Landroid/animation/AnimatorSet;",
        "setAnimator",
        "(Landroid/animation/AnimatorSet;)V",
        "animator",
        "",
        "b",
        "()Z",
        "isSeekingSupported",
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
.field public final d:Lf4/f$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public e:Landroid/animation/AnimatorSet;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf4/f$b;)V
    .locals 1
    .param p1    # Lf4/f$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "animatorInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lf4/c1$b;-><init>()V

    iput-object p1, p0, Lf4/f$c;->d:Lf4/f$b;

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public c(Landroid/view/ViewGroup;)V
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lf4/f$c;->e:Landroid/animation/AnimatorSet;

    if-nez p1, :cond_0

    iget-object p1, p0, Lf4/f$c;->d:Lf4/f$b;

    invoke-virtual {p1}, Lf4/f$f;->a()Lf4/c1$d;

    move-result-object p1

    invoke-virtual {p1, p0}, Lf4/c1$d;->e(Lf4/c1$b;)V

    return-void

    :cond_0
    iget-object v0, p0, Lf4/f$c;->d:Lf4/f$b;

    invoke-virtual {v0}, Lf4/f$f;->a()Lf4/c1$d;

    move-result-object v0

    invoke-virtual {v0}, Lf4/c1$d;->m()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lf4/f$e;->a:Lf4/f$e;

    invoke-virtual {v1, p1}, Lf4/f$e;->a(Landroid/animation/AnimatorSet;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->end()V

    :goto_0
    const/4 p1, 0x2

    invoke-static {p1}, Lf4/k0;->N0(I)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Animator from operation "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " has been canceled"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lf4/c1$d;->m()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, " with seeking."

    goto :goto_1

    :cond_2
    const-string v0, "."

    :goto_1
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FragmentManager"

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    return-void
.end method

.method public d(Landroid/view/ViewGroup;)V
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lf4/f$c;->d:Lf4/f$b;

    invoke-virtual {p1}, Lf4/f$f;->a()Lf4/c1$d;

    move-result-object p1

    iget-object v0, p0, Lf4/f$c;->e:Landroid/animation/AnimatorSet;

    if-nez v0, :cond_0

    iget-object p1, p0, Lf4/f$c;->d:Lf4/f$b;

    invoke-virtual {p1}, Lf4/f$f;->a()Lf4/c1$d;

    move-result-object p1

    invoke-virtual {p1, p0}, Lf4/c1$d;->e(Lf4/c1$b;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    const/4 v0, 0x2

    invoke-static {v0}, Lf4/k0;->N0(I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Animator from operation "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " has started."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FragmentManager"

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return-void
.end method

.method public e(Le/b;Landroid/view/ViewGroup;)V
    .locals 10
    .param p1    # Le/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "backEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "container"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lf4/f$c;->d:Lf4/f$b;

    invoke-virtual {p2}, Lf4/f$f;->a()Lf4/c1$d;

    move-result-object p2

    iget-object v0, p0, Lf4/f$c;->e:Landroid/animation/AnimatorSet;

    if-nez v0, :cond_0

    iget-object p1, p0, Lf4/f$c;->d:Lf4/f$b;

    invoke-virtual {p1}, Lf4/f$f;->a()Lf4/c1$d;

    move-result-object p1

    invoke-virtual {p1, p0}, Lf4/c1$d;->e(Lf4/c1$b;)V

    return-void

    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x22

    if-lt v1, v2, :cond_5

    invoke-virtual {p2}, Lf4/c1$d;->h()Lf4/q;

    move-result-object v1

    iget-boolean v1, v1, Lf4/q;->n:Z

    if-eqz v1, :cond_5

    const/4 v1, 0x2

    invoke-static {v1}, Lf4/k0;->N0(I)Z

    move-result v2

    const-string v3, "FragmentManager"

    if-eqz v2, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Adding BackProgressCallbacks for Animators to operation "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    sget-object v2, Lf4/f$d;->a:Lf4/f$d;

    invoke-virtual {v2, v0}, Lf4/f$d;->a(Landroid/animation/AnimatorSet;)J

    move-result-wide v4

    invoke-virtual {p1}, Le/b;->a()F

    move-result p1

    long-to-float v2, v4

    mul-float/2addr p1, v2

    float-to-long v6, p1

    const-wide/16 v8, 0x0

    cmp-long p1, v6, v8

    const-wide/16 v8, 0x1

    if-nez p1, :cond_2

    move-wide v6, v8

    :cond_2
    cmp-long p1, v6, v4

    if-nez p1, :cond_3

    sub-long v6, v4, v8

    :cond_3
    invoke-static {v1}, Lf4/k0;->N0(I)Z

    move-result p1

    if-eqz p1, :cond_4

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Setting currentPlayTime to "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " for Animator "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " on operation "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    sget-object p1, Lf4/f$e;->a:Lf4/f$e;

    invoke-virtual {p1, v0, v6, v7}, Lf4/f$e;->b(Landroid/animation/AnimatorSet;J)V

    :cond_5
    return-void
.end method

.method public f(Landroid/view/ViewGroup;)V
    .locals 7
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf4/f$c;->d:Lf4/f$b;

    invoke-virtual {v0}, Lf4/f$f;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v6, p0

    goto :goto_4

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lf4/f$c;->d:Lf4/f$b;

    const-string v2, "context"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lf4/f$b;->c(Landroid/content/Context;)Lf4/w$a;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, v0, Lf4/w$a;->b:Landroid/animation/AnimatorSet;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lf4/f$c;->e:Landroid/animation/AnimatorSet;

    iget-object v0, p0, Lf4/f$c;->d:Lf4/f$b;

    invoke-virtual {v0}, Lf4/f$f;->a()Lf4/c1$d;

    move-result-object v5

    invoke-virtual {v5}, Lf4/c1$d;->h()Lf4/q;

    move-result-object v0

    invoke-virtual {v5}, Lf4/c1$d;->g()Lf4/c1$d$b;

    move-result-object v1

    sget-object v2, Lf4/c1$d$b;->d:Lf4/c1$d$b;

    if-ne v1, v2, :cond_2

    const/4 v1, 0x1

    :goto_1
    move v4, v1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    goto :goto_1

    :goto_2
    iget-object v3, v0, Lf4/q;->K:Landroid/view/View;

    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    iget-object v0, p0, Lf4/f$c;->e:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_3

    new-instance v1, Lf4/f$c$a;

    move-object v6, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lf4/f$c$a;-><init>(Landroid/view/ViewGroup;Landroid/view/View;ZLf4/c1$d;Lf4/f$c;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    goto :goto_3

    :cond_3
    move-object v6, p0

    :goto_3
    iget-object p1, v6, Lf4/f$c;->e:Landroid/animation/AnimatorSet;

    if-eqz p1, :cond_4

    invoke-virtual {p1, v3}, Landroid/animation/AnimatorSet;->setTarget(Ljava/lang/Object;)V

    :cond_4
    :goto_4
    return-void
.end method

.method public final h()Lf4/f$b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lf4/f$c;->d:Lf4/f$b;

    return-object v0
.end method
