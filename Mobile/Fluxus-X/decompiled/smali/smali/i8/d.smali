.class public final Li8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le8/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le8/b<",
        "Li8/c;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Ld8/e;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Lj8/x;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Lk8/d;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Ll8/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lyt/a;Lyt/a;Lyt/a;Lyt/a;Lyt/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyt/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lyt/a<",
            "Ld8/e;",
            ">;",
            "Lyt/a<",
            "Lj8/x;",
            ">;",
            "Lyt/a<",
            "Lk8/d;",
            ">;",
            "Lyt/a<",
            "Ll8/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/d;->a:Lyt/a;

    iput-object p2, p0, Li8/d;->b:Lyt/a;

    iput-object p3, p0, Li8/d;->c:Lyt/a;

    iput-object p4, p0, Li8/d;->d:Lyt/a;

    iput-object p5, p0, Li8/d;->e:Lyt/a;

    return-void
.end method

.method public static a(Lyt/a;Lyt/a;Lyt/a;Lyt/a;Lyt/a;)Li8/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyt/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lyt/a<",
            "Ld8/e;",
            ">;",
            "Lyt/a<",
            "Lj8/x;",
            ">;",
            "Lyt/a<",
            "Lk8/d;",
            ">;",
            "Lyt/a<",
            "Ll8/b;",
            ">;)",
            "Li8/d;"
        }
    .end annotation

    new-instance v0, Li8/d;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Li8/d;-><init>(Lyt/a;Lyt/a;Lyt/a;Lyt/a;Lyt/a;)V

    return-object v0
.end method

.method public static c(Ljava/util/concurrent/Executor;Ld8/e;Lj8/x;Lk8/d;Ll8/b;)Li8/c;
    .locals 6

    new-instance v0, Li8/c;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Li8/c;-><init>(Ljava/util/concurrent/Executor;Ld8/e;Lj8/x;Lk8/d;Ll8/b;)V

    return-object v0
.end method


# virtual methods
.method public b()Li8/c;
    .locals 5

    iget-object v0, p0, Li8/d;->a:Lyt/a;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, Li8/d;->b:Lyt/a;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld8/e;

    iget-object v2, p0, Li8/d;->c:Lyt/a;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj8/x;

    iget-object v3, p0, Li8/d;->d:Lyt/a;

    invoke-interface {v3}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lk8/d;

    iget-object v4, p0, Li8/d;->e:Lyt/a;

    invoke-interface {v4}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll8/b;

    invoke-static {v0, v1, v2, v3, v4}, Li8/d;->c(Ljava/util/concurrent/Executor;Ld8/e;Lj8/x;Lk8/d;Ll8/b;)Li8/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li8/d;->b()Li8/c;

    move-result-object v0

    return-object v0
.end method
