.class public Lcom/roblox/client/flags/a$a;
.super Lcom/roblox/client/flags/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/flags/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roblox/client/flags/a<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Boolean;Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/roblox/client/flags/a;-><init>(Ljava/lang/String;Ljava/lang/Object;ZLth/a;)V

    return-void
.end method


# virtual methods
.method public k()Ljava/lang/Boolean;
    .locals 2

    invoke-virtual {p0}, Lcom/roblox/client/flags/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lth/f;->a:Lth/f;

    invoke-virtual {p0}, Lcom/roblox/client/flags/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lth/f;->l(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-super {p0}, Lcom/roblox/client/flags/a;->i()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    return-object v0
.end method
