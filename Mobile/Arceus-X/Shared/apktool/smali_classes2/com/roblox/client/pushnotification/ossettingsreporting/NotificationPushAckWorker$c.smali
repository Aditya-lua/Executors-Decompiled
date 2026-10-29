.class public final Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker;->doWork(Lnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lpt/f;
    c = "com.roblox.client.pushnotification.ossettingsreporting.NotificationPushAckWorker"
    f = "NotificationPushAckWorker.kt"
    l = {
        0x4a
    }
    m = "doWork"
    v = 0x1
.end annotation


# instance fields
.field public synthetic A:Ljava/lang/Object;

.field public final synthetic B:Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker;

.field public C:I

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;->B:Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker;

    invoke-direct {p0, p2}, Lpt/d;-><init>(Lnt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;->A:Ljava/lang/Object;

    iget p1, p0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;->C:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;->C:I

    iget-object p1, p0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$c;->B:Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker;

    invoke-virtual {p1, p0}, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker;->doWork(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
