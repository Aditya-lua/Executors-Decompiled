.class public Lcom/roblox/universalapp/messagebus/RawSubscriptionContract;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lmm/h;

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lmm/h;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/universalapp/messagebus/RawSubscriptionContract;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/roblox/universalapp/messagebus/RawSubscriptionContract;->b:Lmm/h;

    iput-object p3, p0, Lcom/roblox/universalapp/messagebus/RawSubscriptionContract;->c:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/roblox/universalapp/messagebus/RawSubscriptionContract;->d:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/roblox/universalapp/messagebus/RawSubscriptionContract;->e:Z

    return-void
.end method
