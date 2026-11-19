.class public Lnm/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnm/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lnm/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lnm/e;

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->getInstance()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnm/e;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;Lnm/f;)V

    sput-object v0, Lnm/e$a;->a:Lnm/e;

    return-void
.end method

.method public static bridge synthetic a()Lnm/e;
    .locals 1

    sget-object v0, Lnm/e$a;->a:Lnm/e;

    return-object v0
.end method
