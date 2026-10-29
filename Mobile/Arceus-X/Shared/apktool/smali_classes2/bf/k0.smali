.class public final Lbf/k0;
.super Lbf/b1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbf/k0$b;
    }
.end annotation


# instance fields
.field public final a:Lbf/l0;

.field public final b:Lef/b;

.field public final c:Lef/b;

.field public final d:Lef/b;

.field public final e:Lef/b;

.field public final f:Lef/b;

.field public final g:Lef/b;


# direct methods
.method public constructor <init>(Lbf/l0;Lef/b;Lef/b;Lef/b;Lef/b;Lef/b;Lef/b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lbf/b1;-><init>()V

    .line 3
    iput-object p1, p0, Lbf/k0;->a:Lbf/l0;

    .line 4
    iput-object p2, p0, Lbf/k0;->c:Lef/b;

    .line 5
    iput-object p3, p0, Lbf/k0;->d:Lef/b;

    .line 6
    iput-object p4, p0, Lbf/k0;->b:Lef/b;

    .line 7
    iput-object p5, p0, Lbf/k0;->e:Lef/b;

    .line 8
    iput-object p6, p0, Lbf/k0;->f:Lef/b;

    .line 9
    iput-object p7, p0, Lbf/k0;->g:Lef/b;

    return-void
.end method

.method public synthetic constructor <init>(Lbf/l0;Lef/b;Lef/b;Lef/b;Lef/b;Lef/b;Lef/b;Lbf/k0$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lbf/k0;-><init>(Lbf/l0;Lef/b;Lef/b;Lef/b;Lef/b;Lef/b;Lef/b;)V

    return-void
.end method

.method public static d()Lbf/k0$b;
    .locals 2

    new-instance v0, Lbf/k0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbf/k0$b;-><init>(Lbf/k0$a;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic c()Lbf/c1;
    .locals 1

    invoke-virtual {p0}, Lbf/k0;->l()Lbf/l0;

    move-result-object v0

    return-object v0
.end method

.method public e()Lef/b;
    .locals 1

    iget-object v0, p0, Lbf/k0;->g:Lef/b;

    return-object v0
.end method

.method public f()Lbf/j0;
    .locals 1

    iget-object v0, p0, Lbf/k0;->a:Lbf/l0;

    invoke-virtual {v0}, Lbf/l0;->e()Lbf/j0;

    move-result-object v0

    return-object v0
.end method

.method public g()Lef/b;
    .locals 1

    iget-object v0, p0, Lbf/k0;->e:Lef/b;

    return-object v0
.end method

.method public h()Lef/b;
    .locals 1

    iget-object v0, p0, Lbf/k0;->f:Lef/b;

    return-object v0
.end method

.method public i()Lef/b;
    .locals 1

    iget-object v0, p0, Lbf/k0;->c:Lef/b;

    return-object v0
.end method

.method public j()Lef/b;
    .locals 1

    iget-object v0, p0, Lbf/k0;->d:Lef/b;

    return-object v0
.end method

.method public k()Lef/b;
    .locals 1

    iget-object v0, p0, Lbf/k0;->b:Lef/b;

    return-object v0
.end method

.method public l()Lbf/l0;
    .locals 1

    iget-object v0, p0, Lbf/k0;->a:Lbf/l0;

    return-object v0
.end method
