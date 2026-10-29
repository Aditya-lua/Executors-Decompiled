.class public final Lcom/roblox/client/d$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lcom/roblox/client/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/roblox/client/d;

    new-instance v1, Lgk/d0;

    invoke-direct {v1}, Lgk/d0;-><init>()V

    invoke-direct {v0, v1}, Lcom/roblox/client/d;-><init>(Lgk/c0;)V

    sput-object v0, Lcom/roblox/client/d$b;->a:Lcom/roblox/client/d;

    return-void
.end method

.method public static bridge synthetic a()Lcom/roblox/client/d;
    .locals 1

    sget-object v0, Lcom/roblox/client/d$b;->a:Lcom/roblox/client/d;

    return-object v0
.end method
