.class public Lql/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lql/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lql/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lql/c;

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->f()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lql/c;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;Lql/d;)V

    sput-object v0, Lql/c$a;->a:Lql/c;

    return-void
.end method

.method public static bridge synthetic a()Lql/c;
    .locals 1

    sget-object v0, Lql/c$a;->a:Lql/c;

    return-object v0
.end method
