.class public Lwm/f$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwm/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# static fields
.field public static a:Lwm/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lwm/f;

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->getInstance()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lwm/f;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;Lwm/g;)V

    sput-object v0, Lwm/f$d;->a:Lwm/f;

    return-void
.end method

.method public static bridge synthetic a()Lwm/f;
    .locals 1

    sget-object v0, Lwm/f$d;->a:Lwm/f;

    return-object v0
.end method
