.class public Lkd/f$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkd/f;->D()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lkd/f;


# direct methods
.method public constructor <init>(Lkd/f;)V
    .locals 0

    iput-object p1, p0, Lkd/f$b;->a:Lkd/f;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lkd/f$b;->a:Lkd/f;

    iget-object p1, p1, Lkd/r;->b:Lcom/google/android/material/textfield/a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/material/textfield/a;->a0(Z)V

    return-void
.end method
