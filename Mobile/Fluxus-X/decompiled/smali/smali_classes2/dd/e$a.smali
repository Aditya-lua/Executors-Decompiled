.class public Ldd/e$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldd/e;->h(Le/b;Landroid/animation/Animator$AnimatorListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ldd/e;


# direct methods
.method public constructor <init>(Ldd/e;)V
    .locals 0

    iput-object p1, p0, Ldd/e$a;->a:Ldd/e;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Ldd/e$a;->a:Ldd/e;

    iget-object p1, p1, Ldd/a;->b:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    iget-object p1, p0, Ldd/e$a;->a:Ldd/e;

    invoke-virtual {p1, v0}, Ldd/e;->k(F)V

    return-void
.end method
