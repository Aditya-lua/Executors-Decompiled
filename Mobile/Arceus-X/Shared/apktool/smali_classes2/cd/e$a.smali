.class public Lcd/e$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcd/e;->h(Le/b;Landroid/animation/Animator$AnimatorListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcd/e;


# direct methods
.method public constructor <init>(Lcd/e;)V
    .locals 0

    iput-object p1, p0, Lcd/e$a;->a:Lcd/e;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lcd/e$a;->a:Lcd/e;

    iget-object p1, p1, Lcd/a;->b:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    iget-object p1, p0, Lcd/e$a;->a:Lcd/e;

    invoke-virtual {p1, v0}, Lcd/e;->k(F)V

    return-void
.end method
