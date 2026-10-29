.class public Lcom/roblox/client/appsflyer/a$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/appsflyer/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# static fields
.field public static final a:Lcom/roblox/client/appsflyer/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/roblox/client/appsflyer/a;

    invoke-direct {v0}, Lcom/roblox/client/appsflyer/a;-><init>()V

    sput-object v0, Lcom/roblox/client/appsflyer/a$d;->a:Lcom/roblox/client/appsflyer/a;

    return-void
.end method

.method public static bridge synthetic a()Lcom/roblox/client/appsflyer/a;
    .locals 1

    sget-object v0, Lcom/roblox/client/appsflyer/a$d;->a:Lcom/roblox/client/appsflyer/a;

    return-object v0
.end method
