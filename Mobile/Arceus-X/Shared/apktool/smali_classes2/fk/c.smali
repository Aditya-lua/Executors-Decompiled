.class public Lfk/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfk/c$a;
    }
.end annotation


# static fields
.field public static final k:Lol/a;


# instance fields
.field public a:J

.field public b:I

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Z

.field public g:I

.field public h:I

.field public i:Z

.field public j:Landroidx/lifecycle/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/d0<",
            "Lol/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lol/a;->c:Lol/a;

    sput-object v0, Lfk/c;->k:Lol/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 3
    iput-wide v0, p0, Lfk/c;->a:J

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lfk/c;->f:Z

    .line 5
    new-instance v0, Landroidx/lifecycle/d0;

    invoke-direct {v0}, Landroidx/lifecycle/d0;-><init>()V

    iput-object v0, p0, Lfk/c;->j:Landroidx/lifecycle/d0;

    return-void
.end method

.method public synthetic constructor <init>(Lfk/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lfk/c;-><init>()V

    return-void
.end method

.method public static c()Lfk/c;
    .locals 1

    invoke-static {}, Lfk/c$a;->a()Lfk/c;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lfk/c;->b:I

    iput v0, p0, Lfk/c;->g:I

    const-string v0, ""

    iput-object v0, p0, Lfk/c;->e:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lfk/c;->c:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lfk/c;->f:Z

    const-wide/16 v0, -0x1

    invoke-virtual {p0, v0, v1}, Lfk/c;->v(J)V

    sget-object v0, Lfk/c;->k:Lol/a;

    invoke-virtual {p0, v0}, Lfk/c;->u(Lol/a;)V

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lfk/c;->e:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lfk/c;->e:Ljava/lang/String;

    return-object v0

    :cond_1
    :goto_0
    const-string v0, ""

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lfk/c;->h:I

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lfk/c;->b:I

    return v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lfk/c;->g:I

    return v0
.end method

.method public g()Lol/a;
    .locals 1

    iget-object v0, p0, Lfk/c;->j:Landroidx/lifecycle/d0;

    invoke-virtual {v0}, Landroidx/lifecycle/a0;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lol/a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lfk/c;->k:Lol/a;

    return-object v0
.end method

.method public h()Landroidx/lifecycle/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/a0<",
            "Lol/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lfk/c;->j:Landroidx/lifecycle/d0;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lfk/c;->g()Lol/a;

    move-result-object v0

    invoke-virtual {v0}, Lol/a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public j()J
    .locals 2

    iget-wide v0, p0, Lfk/c;->a:J

    return-wide v0
.end method

.method public k()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lfk/c;->d:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lfk/c;->d:Ljava/lang/String;

    return-object v0

    :cond_1
    :goto_0
    const-string v0, ""

    return-object v0
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, Lfk/c;->i:Z

    return v0
.end method

.method public m()V
    .locals 1

    iget-object v0, p0, Lfk/c;->j:Landroidx/lifecycle/d0;

    invoke-virtual {v0}, Landroidx/lifecycle/a0;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lfk/c;->k:Lol/a;

    invoke-virtual {p0, v0}, Lfk/c;->u(Lol/a;)V

    :cond_0
    return-void
.end method

.method public n()Z
    .locals 1

    iget-boolean v0, p0, Lfk/c;->f:Z

    return v0
.end method

.method public o(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lfk/c;->e:Ljava/lang/String;

    return-void
.end method

.method public p(Z)V
    .locals 0

    iput-boolean p1, p0, Lfk/c;->i:Z

    return-void
.end method

.method public q(Z)V
    .locals 0

    iput-boolean p1, p0, Lfk/c;->f:Z

    return-void
.end method

.method public r(I)V
    .locals 0

    iput p1, p0, Lfk/c;->h:I

    return-void
.end method

.method public s(I)V
    .locals 0

    iput p1, p0, Lfk/c;->b:I

    return-void
.end method

.method public t(I)V
    .locals 0

    iput p1, p0, Lfk/c;->g:I

    return-void
.end method

.method public u(Lol/a;)V
    .locals 1

    iget-object v0, p0, Lfk/c;->j:Landroidx/lifecycle/d0;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/d0;->o(Ljava/lang/Object;)V

    return-void
.end method

.method public v(J)V
    .locals 1

    iput-wide p1, p0, Lfk/c;->a:J

    sget-object v0, Lfk/e;->a:Lfk/e;

    invoke-virtual {v0, p1, p2}, Lfk/e;->c(J)V

    return-void
.end method

.method public w(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lfk/c;->d:Ljava/lang/String;

    return-void
.end method
