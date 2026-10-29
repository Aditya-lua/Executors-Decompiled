.class public Lcom/roblox/client/NotificationStreamActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/MenuItem$OnMenuItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/NotificationStreamActivity;->o2(Landroid/view/Menu;Landroid/view/MenuInflater;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/NotificationStreamActivity;


# direct methods
.method public constructor <init>(Lcom/roblox/client/NotificationStreamActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/NotificationStreamActivity$a;->a:Lcom/roblox/client/NotificationStreamActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 2

    iget-object p1, p0, Lcom/roblox/client/NotificationStreamActivity$a;->a:Lcom/roblox/client/NotificationStreamActivity;

    const-string v0, "SETTINGS_TAG"

    invoke-static {}, Lsg/a1;->X()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/roblox/client/NotificationStreamActivity;->n2(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method
