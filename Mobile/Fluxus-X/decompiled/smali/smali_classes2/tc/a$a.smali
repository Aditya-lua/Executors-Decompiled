.class public Ltc/a$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltc/a;->b(Ltc/d;)Landroid/animation/Animator$AnimatorListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ltc/d;


# direct methods
.method public constructor <init>(Ltc/d;)V
    .locals 0

    iput-object p1, p0, Ltc/a$a;->a:Ltc/d;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Ltc/a$a;->a:Ltc/d;

    invoke-interface {p1}, Ltc/d;->b()V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Ltc/a$a;->a:Ltc/d;

    invoke-interface {p1}, Ltc/d;->a()V

    return-void
.end method
