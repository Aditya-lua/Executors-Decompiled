.class public final Log/n;
.super Log/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Log/n$b;,
        Log/n$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Log/m<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Llg/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llg/t<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Llg/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llg/k<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Llg/f;

.field public final d:Lsg/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsg/a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final e:Llg/b0;

.field public final f:Log/n$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Log/n<",
            "TT;>.b;"
        }
    .end annotation
.end field

.field public final g:Z

.field public volatile h:Llg/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llg/a0<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Llg/t;Llg/k;Llg/f;Lsg/a;Llg/b0;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llg/t<",
            "TT;>;",
            "Llg/k<",
            "TT;>;",
            "Llg/f;",
            "Lsg/a<",
            "TT;>;",
            "Llg/b0;",
            ")V"
        }
    .end annotation

    const/4 v6, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 9
    invoke-direct/range {v0 .. v6}, Log/n;-><init>(Llg/t;Llg/k;Llg/f;Lsg/a;Llg/b0;Z)V

    return-void
.end method

.method public constructor <init>(Llg/t;Llg/k;Llg/f;Lsg/a;Llg/b0;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llg/t<",
            "TT;>;",
            "Llg/k<",
            "TT;>;",
            "Llg/f;",
            "Lsg/a<",
            "TT;>;",
            "Llg/b0;",
            "Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Log/m;-><init>()V

    .line 2
    new-instance v0, Log/n$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Log/n$b;-><init>(Log/n;Log/n$a;)V

    iput-object v0, p0, Log/n;->f:Log/n$b;

    .line 3
    iput-object p1, p0, Log/n;->a:Llg/t;

    .line 4
    iput-object p2, p0, Log/n;->b:Llg/k;

    .line 5
    iput-object p3, p0, Log/n;->c:Llg/f;

    .line 6
    iput-object p4, p0, Log/n;->d:Lsg/a;

    .line 7
    iput-object p5, p0, Log/n;->e:Llg/b0;

    .line 8
    iput-boolean p6, p0, Log/n;->g:Z

    return-void
.end method

.method private b()Llg/a0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Llg/a0<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Log/n;->h:Llg/a0;

    if-nez v0, :cond_0

    iget-object v0, p0, Log/n;->c:Llg/f;

    iget-object v1, p0, Log/n;->e:Llg/b0;

    iget-object v2, p0, Log/n;->d:Lsg/a;

    invoke-virtual {v0, v1, v2}, Llg/f;->n(Llg/b0;Lsg/a;)Llg/a0;

    move-result-object v0

    iput-object v0, p0, Log/n;->h:Llg/a0;

    :cond_0
    return-object v0
.end method

.method public static c(Lsg/a;Ljava/lang/Object;)Llg/b0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsg/a<",
            "*>;",
            "Ljava/lang/Object;",
            ")",
            "Llg/b0;"
        }
    .end annotation

    invoke-virtual {p0}, Lsg/a;->d()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {p0}, Lsg/a;->c()Ljava/lang/Class;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Log/n$c;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v0, v2}, Log/n$c;-><init>(Ljava/lang/Object;Lsg/a;ZLjava/lang/Class;)V

    return-object v1
.end method


# virtual methods
.method public a()Llg/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Llg/a0<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Log/n;->a:Llg/t;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-direct {p0}, Log/n;->b()Llg/a0;

    move-result-object v0

    return-object v0
.end method

.method public read(Ltg/a;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltg/a;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Log/n;->b:Llg/k;

    if-nez v0, :cond_0

    invoke-direct {p0}, Log/n;->b()Llg/a0;

    move-result-object v0

    invoke-virtual {v0, p1}, Llg/a0;->read(Ltg/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Lng/h0;->a(Ltg/a;)Llg/l;

    move-result-object p1

    iget-boolean v0, p0, Log/n;->g:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Llg/l;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    iget-object v0, p0, Log/n;->b:Llg/k;

    iget-object v1, p0, Log/n;->d:Lsg/a;

    invoke-virtual {v1}, Lsg/a;->d()Ljava/lang/reflect/Type;

    move-result-object v1

    iget-object v2, p0, Log/n;->f:Log/n$b;

    invoke-interface {v0, p1, v1, v2}, Llg/k;->a(Llg/l;Ljava/lang/reflect/Type;Llg/j;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public write(Ltg/c;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltg/c;",
            "TT;)V"
        }
    .end annotation

    iget-object v0, p0, Log/n;->a:Llg/t;

    if-nez v0, :cond_0

    invoke-direct {p0}, Log/n;->b()Llg/a0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Llg/a0;->write(Ltg/c;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-boolean v1, p0, Log/n;->g:Z

    if-eqz v1, :cond_1

    if-nez p2, :cond_1

    invoke-virtual {p1}, Ltg/c;->s()Ltg/c;

    return-void

    :cond_1
    iget-object v1, p0, Log/n;->d:Lsg/a;

    invoke-virtual {v1}, Lsg/a;->d()Ljava/lang/reflect/Type;

    move-result-object v1

    iget-object v2, p0, Log/n;->f:Log/n$b;

    invoke-interface {v0, p2, v1, v2}, Llg/t;->a(Ljava/lang/Object;Ljava/lang/reflect/Type;Llg/s;)Llg/l;

    move-result-object p2

    invoke-static {p2, p1}, Lng/h0;->b(Llg/l;Ltg/c;)V

    return-void
.end method
