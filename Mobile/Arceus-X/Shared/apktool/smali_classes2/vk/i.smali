.class public Lvk/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Landroid/graphics/Point;

.field public c:Landroid/graphics/Point;

.field public d:Landroid/graphics/Point;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lvk/i;
    .locals 0

    iput-object p1, p0, Lvk/i;->f:Ljava/lang/String;

    return-object p0
.end method

.method public b(Ljava/lang/String;)Lvk/i;
    .locals 0

    iput-object p1, p0, Lvk/i;->j:Ljava/lang/String;

    return-object p0
.end method

.method public c()Ljava/lang/String;
    .locals 14

    invoke-virtual {p0}, Lvk/i;->h()Ljava/lang/String;

    move-result-object v11

    sget-object v13, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    iget-object v0, p0, Lvk/i;->j:Ljava/lang/String;

    iget-object v1, p0, Lvk/i;->h:Ljava/lang/String;

    iget-object v2, p0, Lvk/i;->i:Ljava/lang/String;

    filled-new-array {v0, v1, v2, v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%s RobloxApp/%s (%s; %s)"

    invoke-static {v13, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    iget v0, p0, Lvk/i;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lvk/i;->b:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->x:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lvk/i;->b:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->y:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, Lvk/i;->c:Landroid/graphics/Point;

    iget v3, v3, Landroid/graphics/Point;->x:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, Lvk/i;->c:Landroid/graphics/Point;

    iget v4, v4, Landroid/graphics/Point;->y:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget-object v5, p0, Lvk/i;->d:Landroid/graphics/Point;

    iget v5, v5, Landroid/graphics/Point;->x:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget-object v6, p0, Lvk/i;->d:Landroid/graphics/Point;

    iget v6, v6, Landroid/graphics/Point;->y:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iget-object v7, p0, Lvk/i;->e:Ljava/lang/String;

    invoke-virtual {p0, v7}, Lvk/i;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lvk/i;->f:Ljava/lang/String;

    iget-object v9, p0, Lvk/i;->g:Ljava/lang/String;

    iget-object v10, p0, Lvk/i;->h:Ljava/lang/String;

    filled-new-array/range {v0 .. v12}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Mozilla/5.0 (%dMB; %dx%d; %dx%d; %dx%d; %s; %s) %s (KHTML, like Gecko)  ROBLOX Android App %s %s Hybrid()  %s"

    invoke-static {v13, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lvk/i;->l:Z

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ChromeOS"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public d(Ljava/lang/String;)Lvk/i;
    .locals 0

    iput-object p1, p0, Lvk/i;->e:Ljava/lang/String;

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lvk/i;
    .locals 0

    iput-object p1, p0, Lvk/i;->i:Ljava/lang/String;

    return-object p0
.end method

.method public f(Landroid/graphics/Point;)Lvk/i;
    .locals 0

    iput-object p1, p0, Lvk/i;->d:Landroid/graphics/Point;

    return-object p0
.end method

.method public g(Landroid/graphics/Point;)Lvk/i;
    .locals 0

    iput-object p1, p0, Lvk/i;->c:Landroid/graphics/Point;

    return-object p0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Lvk/i;->m:Z

    if-eqz v0, :cond_0

    const-string v0, "VR"

    return-object v0

    :cond_0
    iget-boolean v0, p0, Lvk/i;->k:Z

    if-eqz v0, :cond_1

    const-string v0, "Phone"

    return-object v0

    :cond_1
    iget-boolean v0, p0, Lvk/i;->n:Z

    if-eqz v0, :cond_2

    const-string v0, "TV"

    return-object v0

    :cond_2
    const-string v0, "Tablet"

    return-object v0
.end method

.method public i(Z)Lvk/i;
    .locals 0

    iput-boolean p1, p0, Lvk/i;->l:Z

    return-object p0
.end method

.method public j(Z)Lvk/i;
    .locals 0

    iput-boolean p1, p0, Lvk/i;->k:Z

    return-object p0
.end method

.method public k(Z)Lvk/i;
    .locals 0

    iput-boolean p1, p0, Lvk/i;->n:Z

    return-object p0
.end method

.method public l(Z)Lvk/i;
    .locals 0

    iput-boolean p1, p0, Lvk/i;->m:Z

    return-object p0
.end method

.method public m(I)Lvk/i;
    .locals 0

    iput p1, p0, Lvk/i;->a:I

    return-object p0
.end method

.method public n(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x1f

    if-le v3, v4, :cond_1

    const/16 v4, 0x7f

    if-lt v3, v4, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_1
    :goto_1
    const/16 v3, 0x5f

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public o(Landroid/graphics/Point;)Lvk/i;
    .locals 0

    iput-object p1, p0, Lvk/i;->b:Landroid/graphics/Point;

    return-object p0
.end method

.method public p(Ljava/lang/String;)Lvk/i;
    .locals 0

    iput-object p1, p0, Lvk/i;->h:Ljava/lang/String;

    return-object p0
.end method

.method public q(Ljava/lang/String;)Lvk/i;
    .locals 0

    iput-object p1, p0, Lvk/i;->g:Ljava/lang/String;

    return-object p0
.end method
