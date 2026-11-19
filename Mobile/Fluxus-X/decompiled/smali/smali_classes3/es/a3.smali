.class public final synthetic Les/a3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Les/h4;

.field public final synthetic b:Lqr/x5;


# direct methods
.method public synthetic constructor <init>(Les/h4;Lqr/x5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/a3;->a:Les/h4;

    iput-object p2, p0, Les/a3;->b:Lqr/x5;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Les/a3;->a:Les/h4;

    iget-object v1, p0, Les/a3;->b:Lqr/x5;

    invoke-static {v0, v1, p1}, Les/h4;->K(Les/h4;Lqr/x5;Landroid/view/View;)V

    return-void
.end method
