.class public Lbm/r$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbm/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# static fields
.field public static final a:Lbm/r;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lbm/r;

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->f()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lbm/r;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;Lbm/s;)V

    sput-object v0, Lbm/r$d;->a:Lbm/r;

    return-void
.end method

.method public static bridge synthetic a()Lbm/r;
    .locals 1

    sget-object v0, Lbm/r$d;->a:Lbm/r;

    return-object v0
.end method
