.class public Lrl/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrl/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static a:Lrl/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lrl/c;

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->f()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lrl/c;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;Lrl/d;)V

    sput-object v0, Lrl/c$a;->a:Lrl/c;

    return-void
.end method

.method public static bridge synthetic a()Lrl/c;
    .locals 1

    sget-object v0, Lrl/c$a;->a:Lrl/c;

    return-object v0
.end method
