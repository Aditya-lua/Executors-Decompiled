.class public Lcom/roblox/universalapp/cookie/CookieProtocol;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/universalapp/cookie/CookieProtocol$a;,
        Lcom/roblox/universalapp/cookie/CookieProtocol$OnSetCookieHandlerImpl;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lcom/roblox/universalapp/cookie/CookieProtocol$OnSetCookieHandlerImpl;

    invoke-direct {v0}, Lcom/roblox/universalapp/cookie/CookieProtocol$OnSetCookieHandlerImpl;-><init>()V

    invoke-static {v0}, Lnm/b;->a(Lcom/roblox/universalapp/cookie/JNICookieProtocol$OnSetCookieHandler;)V

    return-void
.end method

.method public synthetic constructor <init>(Lam/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/roblox/universalapp/cookie/CookieProtocol;-><init>()V

    return-void
.end method

.method public static a()Lcom/roblox/universalapp/cookie/CookieProtocol;
    .locals 1

    invoke-static {}, Lcom/roblox/universalapp/cookie/CookieProtocol$a;->a()Lcom/roblox/universalapp/cookie/CookieProtocol;

    move-result-object v0

    return-object v0
.end method

.method public static setCookie(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setCookie() url = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " cookie = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CookieProtocol"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lwk/j;->c()Lwk/j;

    move-result-object v0

    sget-object v1, Lwk/e$b;->d:Lwk/e$b;

    invoke-virtual {v0, p0, p1, v1}, Lwk/j;->i(Ljava/lang/String;Ljava/lang/String;Lwk/e$b;)V

    return-void
.end method
