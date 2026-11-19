.class public final synthetic Lbh/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic a:Lcom/roblox/client/c;

.field public final synthetic b:Lf4/v;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/c;Lf4/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbh/j1;->a:Lcom/roblox/client/c;

    iput-object p2, p0, Lbh/j1;->b:Lf4/v;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    iget-object v0, p0, Lbh/j1;->a:Lcom/roblox/client/c;

    iget-object v1, p0, Lbh/j1;->b:Lf4/v;

    invoke-static {v0, v1, p1}, Lcom/roblox/client/c;->E2(Lcom/roblox/client/c;Lf4/v;Landroid/content/DialogInterface;)V

    return-void
.end method
