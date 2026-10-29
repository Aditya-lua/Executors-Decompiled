.class public final synthetic Lnm/b$a;
.super Lkotlin/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnm/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/k;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/roblox/universalapp/cookie/JNICookieProtocol$OnSetCookieHandler;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v5, "updateOnSetCookieHandler(Lcom/roblox/universalapp/cookie/JNICookieProtocol$OnSetCookieHandler;)V"

    const/4 v6, 0x0

    const/4 v1, 0x1

    const-class v3, Lcom/roblox/universalapp/cookie/JNICookieProtocol;

    const-string v4, "updateOnSetCookieHandler"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/k;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final d(Lcom/roblox/universalapp/cookie/JNICookieProtocol$OnSetCookieHandler;)V
    .locals 1

    iget-object v0, p0, Lkotlin/jvm/internal/d;->receiver:Ljava/lang/Object;

    check-cast v0, Lcom/roblox/universalapp/cookie/JNICookieProtocol;

    invoke-virtual {v0, p1}, Lcom/roblox/universalapp/cookie/JNICookieProtocol;->updateOnSetCookieHandler(Lcom/roblox/universalapp/cookie/JNICookieProtocol$OnSetCookieHandler;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/roblox/universalapp/cookie/JNICookieProtocol$OnSetCookieHandler;

    invoke-virtual {p0, p1}, Lnm/b$a;->d(Lcom/roblox/universalapp/cookie/JNICookieProtocol$OnSetCookieHandler;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
