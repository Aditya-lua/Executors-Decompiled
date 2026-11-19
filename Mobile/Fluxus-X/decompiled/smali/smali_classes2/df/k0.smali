.class public final Ldf/k0;
.super Ldf/b1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldf/k0$b;
    }
.end annotation


# instance fields
.field public final a:Ldf/l0;

.field public final b:Lgf/b;

.field public final c:Lgf/b;

.field public final d:Lgf/b;

.field public final e:Lgf/b;

.field public final f:Lgf/b;

.field public final g:Lgf/b;


# direct methods
.method public constructor <init>(Ldf/l0;Lgf/b;Lgf/b;Lgf/b;Lgf/b;Lgf/b;Lgf/b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ldf/b1;-><init>()V

    .line 3
    iput-object p1, p0, Ldf/k0;->a:Ldf/l0;

    .line 4
    iput-object p2, p0, Ldf/k0;->c:Lgf/b;

    .line 5
    iput-object p3, p0, Ldf/k0;->d:Lgf/b;

    .line 6
    iput-object p4, p0, Ldf/k0;->b:Lgf/b;

    .line 7
    iput-object p5, p0, Ldf/k0;->e:Lgf/b;

    .line 8
    iput-object p6, p0, Ldf/k0;->f:Lgf/b;

    .line 9
    iput-object p7, p0, Ldf/k0;->g:Lgf/b;

    return-void
.end method

.method public synthetic constructor <init>(Ldf/l0;Lgf/b;Lgf/b;Lgf/b;Lgf/b;Lgf/b;Lgf/b;Ldf/k0$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Ldf/k0;-><init>(Ldf/l0;Lgf/b;Lgf/b;Lgf/b;Lgf/b;Lgf/b;Lgf/b;)V

    return-void
.end method

.method public static d()Ldf/k0$b;
    .locals 2

    new-instance v0, Ldf/k0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldf/k0$b;-><init>(Ldf/k0$a;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic c()Ldf/c1;
    .locals 1

    invoke-virtual {p0}, Ldf/k0;->l()Ldf/l0;

    move-result-object v0

    return-object v0
.end method

.method public e()Lgf/b;
    .locals 1

    iget-object v0, p0, Ldf/k0;->g:Lgf/b;

    return-object v0
.end method

.method public f()Ldf/j0;
    .locals 1

    iget-object v0, p0, Ldf/k0;->a:Ldf/l0;

    invoke-virtual {v0}, Ldf/l0;->e()Ldf/j0;

    move-result-object v0

    return-object v0
.end method

.method public g()Lgf/b;
    .locals 1

    iget-object v0, p0, Ldf/k0;->e:Lgf/b;

    return-object v0
.end method

.method public h()Lgf/b;
    .locals 1

    iget-object v0, p0, Ldf/k0;->f:Lgf/b;

    return-object v0
.end method

.method public i()Lgf/b;
    .locals 1

    iget-object v0, p0, Ldf/k0;->c:Lgf/b;

    return-object v0
.end method

.method public j()Lgf/b;
    .locals 1

    iget-object v0, p0, Ldf/k0;->d:Lgf/b;

    return-object v0
.end method

.method public k()Lgf/b;
    .locals 1

    iget-object v0, p0, Ldf/k0;->b:Lgf/b;

    return-object v0
.end method

.method public l()Ldf/l0;
    .locals 1

    iget-object v0, p0, Ldf/k0;->a:Ldf/l0;

    return-object v0
.end method
