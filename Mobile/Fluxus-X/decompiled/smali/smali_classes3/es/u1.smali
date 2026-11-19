.class public final synthetic Les/u1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lqr/g5;

.field public final synthetic b:Les/v1;

.field public final synthetic c:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lqr/g5;Les/v1;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/u1;->a:Lqr/g5;

    iput-object p2, p0, Les/u1;->b:Les/v1;

    iput-object p3, p0, Les/u1;->c:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Les/u1;->a:Lqr/g5;

    iget-object v1, p0, Les/u1;->b:Les/v1;

    iget-object v2, p0, Les/u1;->c:Landroid/view/View;

    invoke-static {v0, v1, v2}, Les/v1;->c(Lqr/g5;Les/v1;Landroid/view/View;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
