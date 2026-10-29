.class public Ldd/d$a;
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

    iput-object p1, p0, Ldd/d$a;->a:Ldd/d;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationRepeat(Landroid/animation/Animator;)V

    iget-object p1, p0, Ldd/d$a;->a:Ldd/d;

    invoke-static {p1}, Ldd/d;->i(Ldd/d;)I

    move-result v0

    add-int/lit8 v0, v0, 0x4

    iget-object v1, p0, Ldd/d$a;->a:Ldd/d;

    invoke-static {v1}, Ldd/d;->k(Ldd/d;)Ldd/b;

    move-result-object v1

    iget-object v1, v1, Ldd/b;->c:[I

    array-length v1, v1

    rem-int/2addr v0, v1

    invoke-static {p1, v0}, Ldd/d;->j(Ldd/d;I)I

    return-void
.end method
