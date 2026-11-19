.class public final Lk8/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le8/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le8/b<",
        "Lk8/m0;",
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
            "Lk8/e;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Lk8/t0;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lyt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyt/a<",
            "Ljava/lang/String;",
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
            "Lk8/e;",
            ">;",
            "Lyt/a<",
            "Lk8/t0;",
            ">;",
            "Lyt/a<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk8/n0;->a:Lyt/a;

    iput-object p2, p0, Lk8/n0;->b:Lyt/a;

    iput-object p3, p0, Lk8/n0;->c:Lyt/a;

    iput-object p4, p0, Lk8/n0;->d:Lyt/a;

    iput-object p5, p0, Lk8/n0;->e:Lyt/a;

    return-void
.end method

.method public static a(Lyt/a;Lyt/a;Lyt/a;Lyt/a;Lyt/a;)Lk8/n0;
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
            "Lk8/e;",
            ">;",
            "Lyt/a<",
            "Lk8/t0;",
            ">;",
            "Lyt/a<",
            "Ljava/lang/String;",
            ">;)",
            "Lk8/n0;"
        }
    .end annotation

    new-instance v0, Lk8/n0;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lk8/n0;-><init>(Lyt/a;Lyt/a;Lyt/a;Lyt/a;Lyt/a;)V

    return-object v0
.end method

.method public static c(Lm8/a;Lm8/a;Ljava/lang/Object;Ljava/lang/Object;Lyt/a;)Lk8/m0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm8/a;",
            "Lm8/a;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Lyt/a<",
            "Ljava/lang/String;",
            ">;)",
            "Lk8/m0;"
        }
    .end annotation

    new-instance v0, Lk8/m0;

    move-object v3, p2

    check-cast v3, Lk8/e;

    move-object v4, p3

    check-cast v4, Lk8/t0;

    move-object v1, p0

    move-object v2, p1

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lk8/m0;-><init>(Lm8/a;Lm8/a;Lk8/e;Lk8/t0;Lyt/a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lk8/m0;
    .locals 5

    iget-object v0, p0, Lk8/n0;->a:Lyt/a;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm8/a;

    iget-object v1, p0, Lk8/n0;->b:Lyt/a;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm8/a;

    iget-object v2, p0, Lk8/n0;->c:Lyt/a;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lk8/n0;->d:Lyt/a;

    invoke-interface {v3}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lk8/n0;->e:Lyt/a;

    invoke-static {v0, v1, v2, v3, v4}, Lk8/n0;->c(Lm8/a;Lm8/a;Ljava/lang/Object;Ljava/lang/Object;Lyt/a;)Lk8/m0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lk8/n0;->b()Lk8/m0;

    move-result-object v0

    return-object v0
.end method
