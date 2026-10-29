.class public Lcom/roblox/client/d$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public a:Lcom/roblox/client/d$f;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/roblox/client/d$f;->a:Lcom/roblox/client/d$f;

    iput-object v0, p0, Lcom/roblox/client/d$e;->a:Lcom/roblox/client/d$f;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/d$e;->a:Lcom/roblox/client/d$f;

    sget-object v1, Lcom/roblox/client/d$f;->e:Lcom/roblox/client/d$f;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public b()Z
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/d$e;->a:Lcom/roblox/client/d$f;

    sget-object v1, Lcom/roblox/client/d$f;->b:Lcom/roblox/client/d$f;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c()Z
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/d$e;->a:Lcom/roblox/client/d$f;

    sget-object v1, Lcom/roblox/client/d$f;->c:Lcom/roblox/client/d$f;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public d()V
    .locals 1

    sget-object v0, Lcom/roblox/client/d$f;->b:Lcom/roblox/client/d$f;

    iput-object v0, p0, Lcom/roblox/client/d$e;->a:Lcom/roblox/client/d$f;

    return-void
.end method

.method public e()V
    .locals 1

    sget-object v0, Lcom/roblox/client/d$f;->c:Lcom/roblox/client/d$f;

    iput-object v0, p0, Lcom/roblox/client/d$e;->a:Lcom/roblox/client/d$f;

    return-void
.end method

.method public f()V
    .locals 1

    sget-object v0, Lcom/roblox/client/d$f;->d:Lcom/roblox/client/d$f;

    iput-object v0, p0, Lcom/roblox/client/d$e;->a:Lcom/roblox/client/d$f;

    return-void
.end method
