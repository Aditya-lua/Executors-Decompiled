.class public Lzl/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzl/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lzl/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lzl/e;

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->f()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lzl/e;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;Lzl/f;)V

    sput-object v0, Lzl/e$a;->a:Lzl/e;

    return-void
.end method

.method public static bridge synthetic a()Lzl/e;
    .locals 1

    sget-object v0, Lzl/e$a;->a:Lzl/e;

    return-object v0
.end method
