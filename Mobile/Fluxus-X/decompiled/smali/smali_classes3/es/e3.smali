.class public final synthetic Les/e3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Les/h4;

.field public final synthetic b:Lqr/x5;

.field public final synthetic c:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Les/h4;Lqr/x5;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/e3;->a:Les/h4;

    iput-object p2, p0, Les/e3;->b:Lqr/x5;

    iput-object p3, p0, Les/e3;->c:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Les/e3;->a:Les/h4;

    iget-object v1, p0, Les/e3;->b:Lqr/x5;

    iget-object v2, p0, Les/e3;->c:Landroid/view/View;

    invoke-static {v0, v1, v2, p1}, Les/h4;->v(Les/h4;Lqr/x5;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method
