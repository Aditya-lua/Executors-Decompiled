.class public Lcom/roblox/client/startup/b$a;
.super Lik/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/startup/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const-string v4, "secureConnectEnd"

    const-string v5, "connectEnd"

    const-string v0, "dnsStart"

    const-string v1, "dnsEnd"

    const-string v2, "connectStart"

    const-string v3, "secureConnectStart"

    invoke-static/range {v0 .. v5}, Lik/b0;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/startup/b$a;->c:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Lik/d0;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lik/c0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/startup/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public connectFailed(Lmv/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lmv/e0;Ljava/io/IOException;)V
    .locals 0
    .param p1    # Lmv/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/net/InetSocketAddress;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/net/Proxy;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Ljava/io/IOException;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {}, Lcom/roblox/client/startup/b;->a()Lpe/e0;

    move-result-object p1

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2}, Lpe/e0;->D(Ljava/lang/Object;)Z

    return-void
.end method

.method public connectionAcquired(Lmv/e;Lmv/k;)V
    .locals 0
    .param p1    # Lmv/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lmv/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p2}, Lmv/k;->a()Lmv/e0;

    move-result-object p1

    sget-object p2, Lmv/e0;->f:Lmv/e0;

    if-ne p1, p2, :cond_0

    invoke-static {}, Lcom/roblox/client/startup/b;->a()Lpe/e0;

    move-result-object p1

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2}, Lpe/e0;->D(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public connectionReleased(Lmv/e;Lmv/k;)V
    .locals 0
    .param p1    # Lmv/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lmv/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {}, Lcom/roblox/client/startup/b;->a()Lpe/e0;

    move-result-object p1

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2}, Lpe/e0;->D(Ljava/lang/Object;)Z

    return-void
.end method

.method public k(Landroid/util/Pair;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/roblox/client/startup/b$a;->c:Ljava/util/Set;

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Lik/d0;->k(Landroid/util/Pair;)V

    :cond_0
    return-void
.end method
