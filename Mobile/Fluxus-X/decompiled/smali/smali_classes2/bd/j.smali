.class public final Lbd/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbd/j$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lbd/j$b;",
            ">;"
        }
    .end annotation
.end field

.field public b:Lbd/j$b;

.field public c:Landroid/animation/ValueAnimator;

.field public final d:Landroid/animation/Animator$AnimatorListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lbd/j;->a:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-object v0, p0, Lbd/j;->b:Lbd/j$b;

    iput-object v0, p0, Lbd/j;->c:Landroid/animation/ValueAnimator;

    new-instance v0, Lbd/j$a;

    invoke-direct {v0, p0}, Lbd/j$a;-><init>(Lbd/j;)V

    iput-object v0, p0, Lbd/j;->d:Landroid/animation/Animator$AnimatorListener;

    return-void
.end method


# virtual methods
.method public a([ILandroid/animation/ValueAnimator;)V
    .locals 1

    new-instance v0, Lbd/j$b;

    invoke-direct {v0, p1, p2}, Lbd/j$b;-><init>([ILandroid/animation/ValueAnimator;)V

    iget-object p1, p0, Lbd/j;->d:Landroid/animation/Animator$AnimatorListener;

    invoke-virtual {p2, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iget-object p1, p0, Lbd/j;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
