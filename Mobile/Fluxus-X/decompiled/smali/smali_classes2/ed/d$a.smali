.class public Led/d$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Led/d;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Led/d;


# direct methods
.method public constructor <init>(Led/d;)V
    .locals 0

    iput-object p1, p0, Led/d$a;->a:Led/d;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationRepeat(Landroid/animation/Animator;)V

    iget-object p1, p0, Led/d$a;->a:Led/d;

    invoke-static {p1}, Led/d;->i(Led/d;)I

    move-result v0

    add-int/lit8 v0, v0, 0x4

    iget-object v1, p0, Led/d$a;->a:Led/d;

    invoke-static {v1}, Led/d;->k(Led/d;)Led/b;

    move-result-object v1

    iget-object v1, v1, Led/b;->c:[I

    array-length v1, v1

    rem-int/2addr v0, v1

    invoke-static {p1, v0}, Led/d;->j(Led/d;I)I

    return-void
.end method
