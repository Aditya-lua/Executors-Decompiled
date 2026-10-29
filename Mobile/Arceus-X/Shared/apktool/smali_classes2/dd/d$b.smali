.class public Ldd/d$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldd/d;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ldd/d;


# direct methods
.method public constructor <init>(Ldd/d;)V
    .locals 0

    iput-object p1, p0, Ldd/d$b;->a:Ldd/d;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    iget-object p1, p0, Ldd/d$b;->a:Ldd/d;

    invoke-virtual {p1}, Ldd/d;->a()V

    iget-object p1, p0, Ldd/d$b;->a:Ldd/d;

    iget-object v0, p1, Ldd/d;->j:Lp5/b;

    if-eqz v0, :cond_0

    iget-object p1, p1, Ldd/i;->a:Ldd/j;

    invoke-virtual {v0, p1}, Lp5/b;->b(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method
