.class public final Landroidx/fragment/app/b$c$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/b$c;->f(Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "androidx/fragment/app/b$c$a",
        "Landroid/animation/AnimatorListenerAdapter;",
        "Landroid/animation/Animator;",
        "anim",
        "",
        "onAnimationEnd",
        "(Landroid/animation/Animator;)V",
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
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Z

.field public final synthetic d:Landroidx/fragment/app/i$d;

.field public final synthetic e:Landroidx/fragment/app/b$c;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Landroid/view/View;ZLandroidx/fragment/app/i$d;Landroidx/fragment/app/b$c;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/b$c$a;->a:Landroid/view/ViewGroup;

    iput-object p2, p0, Landroidx/fragment/app/b$c$a;->b:Landroid/view/View;

    iput-boolean p3, p0, Landroidx/fragment/app/b$c$a;->c:Z

    iput-object p4, p0, Landroidx/fragment/app/b$c$a;->d:Landroidx/fragment/app/i$d;

    iput-object p5, p0, Landroidx/fragment/app/b$c$a;->e:Landroidx/fragment/app/b$c;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2
    .param p1    # Landroid/animation/Animator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "anim"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/fragment/app/b$c$a;->a:Landroid/view/ViewGroup;

    iget-object v0, p0, Landroidx/fragment/app/b$c$a;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-boolean p1, p0, Landroidx/fragment/app/b$c$a;->c:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/b$c$a;->d:Landroidx/fragment/app/i$d;

    invoke-virtual {p1}, Landroidx/fragment/app/i$d;->g()Landroidx/fragment/app/i$d$b;

    move-result-object p1

    sget-object v0, Landroidx/fragment/app/i$d$b;->d:Landroidx/fragment/app/i$d$b;

    if-ne p1, v0, :cond_1

    :cond_0
    iget-object p1, p0, Landroidx/fragment/app/b$c$a;->d:Landroidx/fragment/app/i$d;

    invoke-virtual {p1}, Landroidx/fragment/app/i$d;->g()Landroidx/fragment/app/i$d$b;

    move-result-object p1

    iget-object v0, p0, Landroidx/fragment/app/b$c$a;->b:Landroid/view/View;

    const-string v1, "viewToAnimate"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/fragment/app/b$c$a;->a:Landroid/view/ViewGroup;

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/i$d$b;->b(Landroid/view/View;Landroid/view/ViewGroup;)V

    :cond_1
    iget-object p1, p0, Landroidx/fragment/app/b$c$a;->e:Landroidx/fragment/app/b$c;

    invoke-virtual {p1}, Landroidx/fragment/app/b$c;->h()Landroidx/fragment/app/b$b;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/b$f;->a()Landroidx/fragment/app/i$d;

    move-result-object p1

    iget-object v0, p0, Landroidx/fragment/app/b$c$a;->e:Landroidx/fragment/app/b$c;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/i$d;->e(Landroidx/fragment/app/i$b;)V

    const/4 p1, 0x2

    invoke-static {p1}, Landroidx/fragment/app/FragmentManager;->N0(I)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Animator from operation "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/fragment/app/b$c$a;->d:Landroidx/fragment/app/i$d;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " has ended."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FragmentManager"

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-void
.end method
