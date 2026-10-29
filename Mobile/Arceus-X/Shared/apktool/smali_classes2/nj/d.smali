.class public final synthetic Lnj/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroid/content/BroadcastReceiver$PendingResult;


# direct methods
.method public synthetic constructor <init>(Landroid/content/BroadcastReceiver$PendingResult;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnj/d;->a:Landroid/content/BroadcastReceiver$PendingResult;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lnj/d;->a:Landroid/content/BroadcastReceiver$PendingResult;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;->m(Landroid/content/BroadcastReceiver$PendingResult;Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
