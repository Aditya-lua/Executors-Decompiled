.class public final synthetic Lqr/l5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Lqr/k5;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Lqr/k5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqr/l5;->a:Landroid/view/View;

    iput-object p2, p0, Lqr/l5;->b:Lqr/k5;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lqr/l5;->a:Landroid/view/View;

    iget-object v1, p0, Lqr/l5;->b:Lqr/k5;

    invoke-static {v0, v1}, Lqr/m5;->a(Landroid/view/View;Lqr/k5;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
