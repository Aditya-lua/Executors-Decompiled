.class public Lxi/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxi/f$e;


# instance fields
.field public a:Lcom/roblox/client/c;

.field public b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public g:Ldk/c;


# direct methods
.method public constructor <init>(Lcom/roblox/client/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxi/i;->a:Lcom/roblox/client/c;

    sget v0, Lsg/q0;->z1:I

    invoke-virtual {p1, v0}, Landroidx/fragment/app/c;->e0(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lxi/i;->c:Ljava/lang/String;

    iget-object p1, p0, Lxi/i;->a:Lcom/roblox/client/c;

    sget v0, Lsg/q0;->B1:I

    invoke-virtual {p1, v0}, Landroidx/fragment/app/c;->e0(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lxi/i;->d:Ljava/lang/String;

    iget-object p1, p0, Lxi/i;->a:Lcom/roblox/client/c;

    sget v0, Lsg/q0;->y1:I

    invoke-virtual {p1, v0}, Landroidx/fragment/app/c;->e0(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lxi/i;->e:Ljava/lang/String;

    iget-object p1, p0, Lxi/i;->a:Lcom/roblox/client/c;

    sget v0, Lsg/q0;->A1:I

    invoke-virtual {p1, v0}, Landroidx/fragment/app/c;->e0(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lxi/i;->f:Ljava/lang/String;

    new-instance p1, Ldk/f;

    invoke-direct {p1}, Ldk/f;-><init>()V

    iput-object p1, p0, Lxi/i;->g:Ldk/c;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public b(Landroidx/appcompat/widget/SearchView;Ljava/lang/String;)Z
    .locals 2

    new-instance v0, Lph/k;

    invoke-virtual {p0}, Lxi/i;->d()I

    move-result v1

    invoke-direct {v0, v1, p2}, Lph/k;-><init>(ILjava/lang/String;)V

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object p2

    invoke-virtual {p2, v0}, Lfv/c;->j(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroidx/appcompat/widget/SearchView;->onActionViewCollapsed()V

    const/4 p1, 0x1

    return p1
.end method

.method public c()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lxi/i;->d()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lxi/i;->c:Ljava/lang/String;

    return-object v0

    :cond_0
    iget-object v0, p0, Lxi/i;->f:Ljava/lang/String;

    return-object v0

    :cond_1
    iget-object v0, p0, Lxi/i;->e:Ljava/lang/String;

    return-object v0

    :cond_2
    iget-object v0, p0, Lxi/i;->d:Ljava/lang/String;

    return-object v0
.end method

.method public d()I
    .locals 3

    invoke-virtual {p0}, Lxi/i;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    const-string v2, "profile"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "friends"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "users"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "games"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    return v1

    :cond_1
    const-string v2, "catalog"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v0, 0x3

    return v0

    :cond_2
    const-string v2, "groups"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x5

    return v0

    :cond_3
    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_4
    return v1
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxi/i;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lxi/i;->a:Lcom/roblox/client/c;

    invoke-virtual {v0}, Lcom/roblox/client/c;->d3()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lxi/i;->b:Ljava/lang/String;

    return-void
.end method

.method public getTheme()Lol/a;
    .locals 1

    iget-object v0, p0, Lxi/i;->g:Ldk/c;

    invoke-interface {v0}, Ldk/c;->getTheme()Lol/a;

    move-result-object v0

    return-object v0
.end method
