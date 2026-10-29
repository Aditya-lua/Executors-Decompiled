.class public final synthetic Lwq/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwq/p;->a:Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;

    iput p2, p0, Lwq/p;->b:I

    iput p3, p0, Lwq/p;->c:I

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    iget-object v0, p0, Lwq/p;->a:Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;

    iget v1, p0, Lwq/p;->b:I

    iget v2, p0, Lwq/p;->c:I

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->c(Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;IILandroid/animation/ValueAnimator;)V

    return-void
.end method
