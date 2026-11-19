.class public Ldd/g$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldd/g;->h(Le/b;ILandroid/animation/Animator$AnimatorListener;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:I

.field public final synthetic c:Ldd/g;


# direct methods
.method public constructor <init>(Ldd/g;ZI)V
    .locals 0

    iput-object p1, p0, Ldd/g$a;->c:Ldd/g;

    iput-boolean p2, p0, Ldd/g$a;->a:Z

    iput p3, p0, Ldd/g$a;->b:I

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    iget-object p1, p0, Ldd/g$a;->c:Ldd/g;

    iget-object p1, p1, Ldd/a;->b:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    iget-object p1, p0, Ldd/g$a;->c:Ldd/g;

    iget-boolean v1, p0, Ldd/g$a;->a:Z

    iget v2, p0, Ldd/g$a;->b:I

    invoke-virtual {p1, v0, v1, v2}, Ldd/g;->k(FZI)V

    return-void
.end method
