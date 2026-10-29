.class public Lcom/roblox/universalapp/cookie/CookieProtocol$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/universalapp/cookie/CookieProtocol;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lcom/roblox/universalapp/cookie/CookieProtocol;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/roblox/universalapp/cookie/CookieProtocol;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/roblox/universalapp/cookie/CookieProtocol;-><init>(Lam/c;)V

    sput-object v0, Lcom/roblox/universalapp/cookie/CookieProtocol$a;->a:Lcom/roblox/universalapp/cookie/CookieProtocol;

    return-void
.end method

.method public static bridge synthetic a()Lcom/roblox/universalapp/cookie/CookieProtocol;
    .locals 1

    sget-object v0, Lcom/roblox/universalapp/cookie/CookieProtocol$a;->a:Lcom/roblox/universalapp/cookie/CookieProtocol;

    return-object v0
.end method
