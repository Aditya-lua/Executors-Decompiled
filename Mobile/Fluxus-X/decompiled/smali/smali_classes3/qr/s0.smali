.class public final synthetic Lqr/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lur/i;


# direct methods
.method public synthetic constructor <init>(Lur/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqr/s0;->a:Lur/i;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lqr/s0;->a:Lur/i;

    invoke-static {v0, p1}, Lqr/u0;->b(Lur/i;Landroid/view/View;)V

    return-void
.end method
