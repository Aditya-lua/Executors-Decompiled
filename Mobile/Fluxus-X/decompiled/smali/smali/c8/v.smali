.class public final Lc8/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le8/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le8/b<",
        "Lc8/t;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Lm8/a;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Lm8/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Li8/e;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Lj8/r;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Lj8/v;",
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
            "Lm8/a;",
            ">;",
            "Lyt/a<",
            "Lm8/a;",
            ">;",
            "Lyt/a<",
            "Li8/e;",
            ">;",
            "Lyt/a<",
            "Lj8/r;",
            ">;",
            "Lyt/a<",
            "Lj8/v;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc8/v;->a:Lyt/a;

    iput-object p2, p0, Lc8/v;->b:Lyt/a;

    iput-object p3, p0, Lc8/v;->c:Lyt/a;

    iput-object p4, p0, Lc8/v;->d:Lyt/a;

    iput-object p5, p0, Lc8/v;->e:Lyt/a;

    return-void
.end method

.method public static a(Lyt/a;Lyt/a;Lyt/a;Lyt/a;Lyt/a;)Lc8/v;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyt/a<",
            "Lm8/a;",
            ">;",
            "Lyt/a<",
            "Lm8/a;",
            ">;",
            "Lyt/a<",
            "Li8/e;",
            ">;",
            "Lyt/a<",
            "Lj8/r;",
            ">;",
            "Lyt/a<",
            "Lj8/v;",
            ">;)",
            "Lc8/v;"
        }
    .end annotation

    new-instance v0, Lc8/v;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lc8/v;-><init>(Lyt/a;Lyt/a;Lyt/a;Lyt/a;Lyt/a;)V

    return-object v0
.end method

.method public static c(Lm8/a;Lm8/a;Li8/e;Lj8/r;Lj8/v;)Lc8/t;
    .locals 6

    new-instance v0, Lc8/t;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lc8/t;-><init>(Lm8/a;Lm8/a;Li8/e;Lj8/r;Lj8/v;)V

    return-object v0
.end method


# virtual methods
.method public b()Lc8/t;
    .locals 5

    iget-object v0, p0, Lc8/v;->a:Lyt/a;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm8/a;

    iget-object v1, p0, Lc8/v;->b:Lyt/a;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm8/a;

    iget-object v2, p0, Lc8/v;->c:Lyt/a;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li8/e;

    iget-object v3, p0, Lc8/v;->d:Lyt/a;

    invoke-interface {v3}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj8/r;

    iget-object v4, p0, Lc8/v;->e:Lyt/a;

    invoke-interface {v4}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj8/v;

    invoke-static {v0, v1, v2, v3, v4}, Lc8/v;->c(Lm8/a;Lm8/a;Li8/e;Lj8/r;Lj8/v;)Lc8/t;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lc8/v;->b()Lc8/t;

    move-result-object v0

    return-object v0
.end method
