.class public final synthetic Lak/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/roblox/client/startup/d$a;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/startup/d$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lak/p0;->a:Lcom/roblox/client/startup/d$a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object v0, p0, Lak/p0;->a:Lcom/roblox/client/startup/d$a;

    invoke-static {v0, p1, p2}, Lcom/roblox/client/startup/d;->b(Lcom/roblox/client/startup/d$a;Landroid/content/DialogInterface;I)V

    return-void
.end method
