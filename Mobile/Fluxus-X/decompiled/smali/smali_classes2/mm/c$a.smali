.class public Lmm/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmm/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lmm/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmm/c;

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->getInstance()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v1

    invoke-direct {v0, v1}, Lmm/c;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V

    sput-object v0, Lmm/c$a;->a:Lmm/c;

    return-void
.end method

.method public static bridge synthetic a()Lmm/c;
    .locals 1

    sget-object v0, Lmm/c$a;->a:Lmm/c;

    return-object v0
.end method
