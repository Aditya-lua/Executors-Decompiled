.class public final synthetic Lsg/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/roblox/client/IncomingCallActivity;

.field public final synthetic b:Landroid/content/Intent;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/IncomingCallActivity;Landroid/content/Intent;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsg/c0;->a:Lcom/roblox/client/IncomingCallActivity;

    iput-object p2, p0, Lsg/c0;->b:Landroid/content/Intent;

    iput-boolean p3, p0, Lsg/c0;->c:Z

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lsg/c0;->a:Lcom/roblox/client/IncomingCallActivity;

    iget-object v1, p0, Lsg/c0;->b:Landroid/content/Intent;

    iget-boolean v2, p0, Lsg/c0;->c:Z

    invoke-static {v0, v1, v2, p1}, Lcom/roblox/client/IncomingCallActivity;->E1(Lcom/roblox/client/IncomingCallActivity;Landroid/content/Intent;ZLandroid/view/View;)V

    return-void
.end method
