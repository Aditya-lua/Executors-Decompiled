.class public Lcom/roblox/client/RobloxWebActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/RobloxWebActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/RobloxWebActivity;


# direct methods
.method public constructor <init>(Lcom/roblox/client/RobloxWebActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/RobloxWebActivity$a;->a:Lcom/roblox/client/RobloxWebActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/roblox/client/RobloxWebActivity$a;->a:Lcom/roblox/client/RobloxWebActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    iget-object p1, p0, Lcom/roblox/client/RobloxWebActivity$a;->a:Lcom/roblox/client/RobloxWebActivity;

    iget v0, p1, Lcom/roblox/client/RobloxWebActivity;->S:I

    iget v1, p1, Lcom/roblox/client/RobloxWebActivity;->T:I

    invoke-virtual {p1, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method
