.class public final Lj8/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le8/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le8/b<",
        "Lj8/r;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Landroid/content/Context;",
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
            "Lk8/d;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Lj8/x;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Ll8/b;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Lm8/a;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Lm8/a;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Lk8/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lyt/a;Lyt/a;Lyt/a;Lyt/a;Lyt/a;Lyt/a;Lyt/a;Lyt/a;Lyt/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyt/a<",
            "Landroid/content/Context;",
            ">;",
            "Lyt/a<",
            "Ld8/e;",
            ">;",
            "Lyt/a<",
            "Lk8/d;",
            ">;",
            "Lyt/a<",
            "Lj8/x;",
            ">;",
            "Lyt/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lyt/a<",
            "Ll8/b;",
            ">;",
            "Lyt/a<",
            "Lm8/a;",
            ">;",
            "Lyt/a<",
            "Lm8/a;",
            ">;",
            "Lyt/a<",
            "Lk8/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/s;->a:Lyt/a;

    iput-object p2, p0, Lj8/s;->b:Lyt/a;

    iput-object p3, p0, Lj8/s;->c:Lyt/a;

    iput-object p4, p0, Lj8/s;->d:Lyt/a;

    iput-object p5, p0, Lj8/s;->e:Lyt/a;

    iput-object p6, p0, Lj8/s;->f:Lyt/a;

    iput-object p7, p0, Lj8/s;->g:Lyt/a;

    iput-object p8, p0, Lj8/s;->h:Lyt/a;

    iput-object p9, p0, Lj8/s;->i:Lyt/a;

    return-void
.end method

.method public static a(Lyt/a;Lyt/a;Lyt/a;Lyt/a;Lyt/a;Lyt/a;Lyt/a;Lyt/a;Lyt/a;)Lj8/s;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyt/a<",
            "Landroid/content/Context;",
            ">;",
            "Lyt/a<",
            "Ld8/e;",
            ">;",
            "Lyt/a<",
            "Lk8/d;",
            ">;",
            "Lyt/a<",
            "Lj8/x;",
            ">;",
            "Lyt/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lyt/a<",
            "Ll8/b;",
            ">;",
            "Lyt/a<",
            "Lm8/a;",
            ">;",
            "Lyt/a<",
            "Lm8/a;",
            ">;",
            "Lyt/a<",
            "Lk8/c;",
            ">;)",
            "Lj8/s;"
        }
    .end annotation

    new-instance v0, Lj8/s;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lj8/s;-><init>(Lyt/a;Lyt/a;Lyt/a;Lyt/a;Lyt/a;Lyt/a;Lyt/a;Lyt/a;Lyt/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ld8/e;Lk8/d;Lj8/x;Ljava/util/concurrent/Executor;Ll8/b;Lm8/a;Lm8/a;Lk8/c;)Lj8/r;
    .locals 10

    new-instance v0, Lj8/r;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lj8/r;-><init>(Landroid/content/Context;Ld8/e;Lk8/d;Lj8/x;Ljava/util/concurrent/Executor;Ll8/b;Lm8/a;Lm8/a;Lk8/c;)V

    return-object v0
.end method


# virtual methods
.method public b()Lj8/r;
    .locals 10

    iget-object v0, p0, Lj8/s;->a:Lyt/a;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, Lj8/s;->b:Lyt/a;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ld8/e;

    iget-object v0, p0, Lj8/s;->c:Lyt/a;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lk8/d;

    iget-object v0, p0, Lj8/s;->d:Lyt/a;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lj8/x;

    iget-object v0, p0, Lj8/s;->e:Lyt/a;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/concurrent/Executor;

    iget-object v0, p0, Lj8/s;->f:Lyt/a;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ll8/b;

    iget-object v0, p0, Lj8/s;->g:Lyt/a;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lm8/a;

    iget-object v0, p0, Lj8/s;->h:Lyt/a;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lm8/a;

    iget-object v0, p0, Lj8/s;->i:Lyt/a;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lk8/c;

    invoke-static/range {v1 .. v9}, Lj8/s;->c(Landroid/content/Context;Ld8/e;Lk8/d;Lj8/x;Ljava/util/concurrent/Executor;Ll8/b;Lm8/a;Lm8/a;Lk8/c;)Lj8/r;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lj8/s;->b()Lj8/r;

    move-result-object v0

    return-object v0
.end method
