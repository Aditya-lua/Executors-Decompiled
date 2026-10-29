.class public Lyl/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyl/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lyl/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lyl/c;

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->f()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v1

    invoke-direct {v0, v1}, Lyl/c;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V

    sput-object v0, Lyl/c$a;->a:Lyl/c;

    return-void
.end method

.method public static bridge synthetic a()Lyl/c;
    .locals 1

    sget-object v0, Lyl/c$a;->a:Lyl/c;

    return-object v0
.end method
