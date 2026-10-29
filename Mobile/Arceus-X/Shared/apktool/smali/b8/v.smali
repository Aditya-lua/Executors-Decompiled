.class public final Lb8/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld8/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld8/b<",
        "Lb8/t;",
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
            "Lh8/e;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lht/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lht/a<",
            "Li8/r;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lht/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lht/a<",
            "Li8/v;",
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
            "Lh8/e;",
            ">;",
            "Lht/a<",
            "Li8/r;",
            ">;",
            "Lht/a<",
            "Li8/v;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb8/v;->a:Lht/a;

    iput-object p2, p0, Lb8/v;->b:Lht/a;

    iput-object p3, p0, Lb8/v;->c:Lht/a;

    iput-object p4, p0, Lb8/v;->d:Lht/a;

    iput-object p5, p0, Lb8/v;->e:Lht/a;

    return-void
.end method

.method public static a(Lht/a;Lht/a;Lht/a;Lht/a;Lht/a;)Lb8/v;
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
            "Lh8/e;",
            ">;",
            "Lht/a<",
            "Li8/r;",
            ">;",
            "Lht/a<",
            "Li8/v;",
            ">;)",
            "Lb8/v;"
        }
    .end annotation

    new-instance v0, Lb8/v;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lb8/v;-><init>(Lht/a;Lht/a;Lht/a;Lht/a;Lht/a;)V

    return-object v0
.end method

.method public static c(Ll8/a;Ll8/a;Lh8/e;Li8/r;Li8/v;)Lb8/t;
    .locals 6

    new-instance v0, Lb8/t;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lb8/t;-><init>(Ll8/a;Ll8/a;Lh8/e;Li8/r;Li8/v;)V

    return-object v0
.end method


# virtual methods
.method public b()Lb8/t;
    .locals 5

    iget-object v0, p0, Lb8/v;->a:Lht/a;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll8/a;

    iget-object v1, p0, Lb8/v;->b:Lht/a;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll8/a;

    iget-object v2, p0, Lb8/v;->c:Lht/a;

    invoke-interface {v2}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh8/e;

    iget-object v3, p0, Lb8/v;->d:Lht/a;

    invoke-interface {v3}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li8/r;

    iget-object v4, p0, Lb8/v;->e:Lht/a;

    invoke-interface {v4}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li8/v;

    invoke-static {v0, v1, v2, v3, v4}, Lb8/v;->c(Ll8/a;Ll8/a;Lh8/e;Li8/r;Li8/v;)Lb8/t;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lb8/v;->b()Lb8/t;

    move-result-object v0

    return-object v0
.end method
