.class public Lcom/roblox/client/startup/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/startup/c;->k2(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/startup/c;


# direct methods
.method public constructor <init>(Lcom/roblox/client/startup/c;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/startup/c$a;->a:Lcom/roblox/client/startup/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    const-string p1, "FragmentRetry"

    const-string p2, "... Dialog::onClick:"

    invoke-static {p1, p2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/startup/c$a;->a:Lcom/roblox/client/startup/c;

    invoke-static {p1}, Lcom/roblox/client/startup/c;->u2(Lcom/roblox/client/startup/c;)Lcom/roblox/client/startup/c$b;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/roblox/client/startup/c$a;->a:Lcom/roblox/client/startup/c;

    invoke-static {p1}, Lcom/roblox/client/startup/c;->u2(Lcom/roblox/client/startup/c;)Lcom/roblox/client/startup/c$b;

    move-result-object p1

    invoke-interface {p1}, Lcom/roblox/client/startup/c$b;->N()V

    :cond_0
    return-void
.end method
