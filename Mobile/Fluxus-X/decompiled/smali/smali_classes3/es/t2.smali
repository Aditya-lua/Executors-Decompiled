.class public final synthetic Les/t2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lqr/x5;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lqr/x5;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/t2;->a:Lqr/x5;

    iput-object p2, p0, Les/t2;->b:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Les/t2;->a:Lqr/x5;

    iget-object v1, p0, Les/t2;->b:Landroid/view/View;

    invoke-static {v0, v1, p1}, Les/h4;->L(Lqr/x5;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method
