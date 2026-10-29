.class public final Lh8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld8/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld8/b<",
        "Lh8/c;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lht/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lht/a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lht/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lht/a<",
            "Lc8/e;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lht/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lht/a<",
            "Li8/x;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lht/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lht/a<",
            "Lj8/d;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lht/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lht/a<",
            "Lk8/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lht/a;Lht/a;Lht/a;Lht/a;Lht/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lht/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lht/a<",
            "Lc8/e;",
            ">;",
            "Lht/a<",
            "Li8/x;",
            ">;",
            "Lht/a<",
            "Lj8/d;",
            ">;",
            "Lht/a<",
            "Lk8/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh8/d;->a:Lht/a;

    iput-object p2, p0, Lh8/d;->b:Lht/a;

    iput-object p3, p0, Lh8/d;->c:Lht/a;

    iput-object p4, p0, Lh8/d;->d:Lht/a;

    iput-object p5, p0, Lh8/d;->e:Lht/a;

    return-void
.end method

.method public static a(Lht/a;Lht/a;Lht/a;Lht/a;Lht/a;)Lh8/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lht/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lht/a<",
            "Lc8/e;",
            ">;",
            "Lht/a<",
            "Li8/x;",
            ">;",
            "Lht/a<",
            "Lj8/d;",
            ">;",
            "Lht/a<",
            "Lk8/b;",
            ">;)",
            "Lh8/d;"
        }
    .end annotation

    new-instance v0, Lh8/d;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lh8/d;-><init>(Lht/a;Lht/a;Lht/a;Lht/a;Lht/a;)V

    return-object v0
.end method

.method public static c(Ljava/util/concurrent/Executor;Lc8/e;Li8/x;Lj8/d;Lk8/b;)Lh8/c;
    .locals 6

    new-instance v0, Lh8/c;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lh8/c;-><init>(Ljava/util/concurrent/Executor;Lc8/e;Li8/x;Lj8/d;Lk8/b;)V

    return-object v0
.end method


# virtual methods
.method public b()Lh8/c;
    .locals 5

    iget-object v0, p0, Lh8/d;->a:Lht/a;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lh8/d;->b:Lht/a;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc8/e;

    iget-object v2, p0, Lh8/d;->c:Lht/a;

    invoke-interface {v2}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li8/x;

    iget-object v3, p0, Lh8/d;->d:Lht/a;

    invoke-interface {v3}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj8/d;

    iget-object v4, p0, Lh8/d;->e:Lht/a;

    invoke-interface {v4}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lk8/b;

    invoke-static {v0, v1, v2, v3, v4}, Lh8/d;->c(Ljava/util/concurrent/Executor;Lc8/e;Li8/x;Lj8/d;Lk8/b;)Lh8/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lh8/d;->b()Lh8/c;

    move-result-object v0

    return-object v0
.end method
