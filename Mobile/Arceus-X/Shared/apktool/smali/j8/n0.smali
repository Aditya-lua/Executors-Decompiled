.class public final Lj8/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld8/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld8/b<",
        "Lj8/m0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lht/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lht/a<",
            "Ll8/a;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lht/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lht/a<",
            "Ll8/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lht/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lht/a<",
            "Lj8/e;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lht/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lht/a<",
            "Lj8/t0;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lht/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lht/a<",
            "Ljava/lang/String;",
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
            "Ll8/a;",
            ">;",
            "Lht/a<",
            "Ll8/a;",
            ">;",
            "Lht/a<",
            "Lj8/e;",
            ">;",
            "Lht/a<",
            "Lj8/t0;",
            ">;",
            "Lht/a<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/n0;->a:Lht/a;

    iput-object p2, p0, Lj8/n0;->b:Lht/a;

    iput-object p3, p0, Lj8/n0;->c:Lht/a;

    iput-object p4, p0, Lj8/n0;->d:Lht/a;

    iput-object p5, p0, Lj8/n0;->e:Lht/a;

    return-void
.end method

.method public static a(Lht/a;Lht/a;Lht/a;Lht/a;Lht/a;)Lj8/n0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lht/a<",
            "Ll8/a;",
            ">;",
            "Lht/a<",
            "Ll8/a;",
            ">;",
            "Lht/a<",
            "Lj8/e;",
            ">;",
            "Lht/a<",
            "Lj8/t0;",
            ">;",
            "Lht/a<",
            "Ljava/lang/String;",
            ">;)",
            "Lj8/n0;"
        }
    .end annotation

    new-instance v0, Lj8/n0;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lj8/n0;-><init>(Lht/a;Lht/a;Lht/a;Lht/a;Lht/a;)V

    return-object v0
.end method

.method public static c(Ll8/a;Ll8/a;Ljava/lang/Object;Ljava/lang/Object;Lht/a;)Lj8/m0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll8/a;",
            "Ll8/a;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Lht/a<",
            "Ljava/lang/String;",
            ">;)",
            "Lj8/m0;"
        }
    .end annotation

    new-instance v0, Lj8/m0;

    move-object v3, p2

    check-cast v3, Lj8/e;

    move-object v4, p3

    check-cast v4, Lj8/t0;

    move-object v1, p0

    move-object v2, p1

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lj8/m0;-><init>(Ll8/a;Ll8/a;Lj8/e;Lj8/t0;Lht/a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lj8/m0;
    .locals 5

    iget-object v0, p0, Lj8/n0;->a:Lht/a;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll8/a;

    iget-object v1, p0, Lj8/n0;->b:Lht/a;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll8/a;

    iget-object v2, p0, Lj8/n0;->c:Lht/a;

    invoke-interface {v2}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lj8/n0;->d:Lht/a;

    invoke-interface {v3}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lj8/n0;->e:Lht/a;

    invoke-static {v0, v1, v2, v3, v4}, Lj8/n0;->c(Ll8/a;Ll8/a;Ljava/lang/Object;Ljava/lang/Object;Lht/a;)Lj8/m0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lj8/n0;->b()Lj8/m0;

    move-result-object v0

    return-object v0
.end method
