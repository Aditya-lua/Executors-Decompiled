.class public Lx7/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lx7/b$r;

.field public b:Lx7/e;

.field public c:Ljava/lang/String;

.field public d:Lx7/g$b;

.field public e:Ljava/lang/String;

.field public f:Lx7/g$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lx7/f;->a:Lx7/b$r;

    iput-object v0, p0, Lx7/f;->b:Lx7/e;

    iput-object v0, p0, Lx7/f;->c:Ljava/lang/String;

    iput-object v0, p0, Lx7/f;->d:Lx7/g$b;

    iput-object v0, p0, Lx7/f;->e:Ljava/lang/String;

    iput-object v0, p0, Lx7/f;->f:Lx7/g$b;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lx7/f;
    .locals 2

    new-instance v0, Lx7/b;

    sget-object v1, Lx7/b$u;->b:Lx7/b$u;

    invoke-direct {v0, v1}, Lx7/b;-><init>(Lx7/b$u;)V

    invoke-virtual {v0, p1}, Lx7/b;->d(Ljava/lang/String;)Lx7/b$r;

    move-result-object p1

    iput-object p1, p0, Lx7/f;->a:Lx7/b$r;

    return-object p0
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lx7/f;->a:Lx7/b$r;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx7/b$r;->f()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lx7/f;->b:Lx7/e;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lx7/f;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lx7/f;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lx7/f;->d:Lx7/g$b;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public g()Z
    .locals 1

    iget-object v0, p0, Lx7/f;->f:Lx7/g$b;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public h(FFFF)Lx7/f;
    .locals 1

    new-instance v0, Lx7/g$b;

    invoke-direct {v0, p1, p2, p3, p4}, Lx7/g$b;-><init>(FFFF)V

    iput-object v0, p0, Lx7/f;->f:Lx7/g$b;

    return-object p0
.end method
