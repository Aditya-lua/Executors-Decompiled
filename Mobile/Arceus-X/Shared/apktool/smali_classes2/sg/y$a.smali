.class public Lsg/y$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsg/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lcom/roblox/client/game/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/roblox/client/game/c;

    invoke-direct {v0}, Lcom/roblox/client/game/c;-><init>()V

    sput-object v0, Lsg/y$a;->a:Lcom/roblox/client/game/c;

    return-void
.end method

.method public static bridge synthetic a()Lcom/roblox/client/game/c;
    .locals 1

    sget-object v0, Lsg/y$a;->a:Lcom/roblox/client/game/c;

    return-object v0
.end method
