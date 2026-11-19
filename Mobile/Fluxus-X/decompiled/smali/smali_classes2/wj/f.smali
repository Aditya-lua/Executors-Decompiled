.class public final synthetic Lwj/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;

.field public final synthetic b:Lk2/k$c;

.field public final synthetic c:Lk2/k$f;

.field public final synthetic d:Lxj/f;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;Lk2/k$c;Lk2/k$f;Lxj/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwj/f;->a:Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;

    iput-object p2, p0, Lwj/f;->b:Lk2/k$c;

    iput-object p3, p0, Lwj/f;->c:Lk2/k$f;

    iput-object p4, p0, Lwj/f;->d:Lxj/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lwj/f;->a:Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;

    iget-object v1, p0, Lwj/f;->b:Lk2/k$c;

    iget-object v2, p0, Lwj/f;->c:Lk2/k$f;

    iget-object v3, p0, Lwj/f;->d:Lxj/f;

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-static {v0, v1, v2, v3, p1}, Lwj/j;->f(Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;Lk2/k$c;Lk2/k$f;Lxj/f;Landroid/graphics/Bitmap;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
