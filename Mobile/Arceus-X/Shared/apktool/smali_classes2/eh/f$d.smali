.class public Leh/f$d;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Leh/f;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Leh/f;


# direct methods
.method public constructor <init>(Leh/f;)V
    .locals 0

    iput-object p1, p0, Leh/f$d;->a:Leh/f;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    iget-object p1, p0, Leh/f$d;->a:Leh/f;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Leh/f;->d(Leh/f;Z)V

    iget-object p1, p0, Leh/f$d;->a:Leh/f;

    invoke-static {p1}, Leh/f;->e(Leh/f;)V

    return-void
.end method
