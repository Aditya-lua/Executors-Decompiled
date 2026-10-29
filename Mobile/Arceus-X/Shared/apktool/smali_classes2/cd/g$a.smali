.class public Lcd/g$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcd/g;->h(Le/b;ILandroid/animation/Animator$AnimatorListener;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:I

.field public final synthetic c:Lcd/g;


# direct methods
.method public constructor <init>(Lcd/g;ZI)V
    .locals 0

    iput-object p1, p0, Lcd/g$a;->c:Lcd/g;

    iput-boolean p2, p0, Lcd/g$a;->a:Z

    iput p3, p0, Lcd/g$a;->b:I

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    iget-object p1, p0, Lcd/g$a;->c:Lcd/g;

    iget-object p1, p1, Lcd/a;->b:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    iget-object p1, p0, Lcd/g$a;->c:Lcd/g;

    iget-boolean v1, p0, Lcd/g$a;->a:Z

    iget v2, p0, Lcd/g$a;->b:I

    invoke-virtual {p1, v0, v1, v2}, Lcd/g;->k(FZI)V

    return-void
.end method
