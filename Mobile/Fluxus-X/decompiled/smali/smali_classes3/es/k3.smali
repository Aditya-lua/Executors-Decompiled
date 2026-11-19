.class public final synthetic Les/k3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Les/s6$d$a;

.field public final synthetic c:Les/h4;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Les/s6$d$a;Les/h4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/k3;->a:Landroid/view/View;

    iput-object p2, p0, Les/k3;->b:Les/s6$d$a;

    iput-object p3, p0, Les/k3;->c:Les/h4;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Les/k3;->a:Landroid/view/View;

    iget-object v1, p0, Les/k3;->b:Les/s6$d$a;

    iget-object v2, p0, Les/k3;->c:Les/h4;

    invoke-static {v0, v1, v2}, Les/h4;->A(Landroid/view/View;Les/s6$d$a;Les/h4;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
