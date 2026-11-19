.class public Lpm/r$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpm/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# static fields
.field public static final a:Lpm/r;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lpm/r;

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->getInstance()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpm/r;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;Lpm/s;)V

    sput-object v0, Lpm/r$d;->a:Lpm/r;

    return-void
.end method

.method public static bridge synthetic a()Lpm/r;
    .locals 1

    sget-object v0, Lpm/r$d;->a:Lpm/r;

    return-object v0
.end method
