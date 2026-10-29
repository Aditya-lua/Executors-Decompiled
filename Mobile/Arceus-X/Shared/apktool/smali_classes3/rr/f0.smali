.class public final Lrr/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lrr/e0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lqr/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lzq/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/ui/h$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;",
            ">;",
            "Lft/i<",
            "Lqr/a$a;",
            ">;",
            "Lft/i<",
            "Lzq/a$a;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/ui/h$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrr/f0;->a:Lft/i;

    iput-object p2, p0, Lrr/f0;->b:Lft/i;

    iput-object p3, p0, Lrr/f0;->c:Lft/i;

    iput-object p4, p0, Lrr/f0;->d:Lft/i;

    iput-object p5, p0, Lrr/f0;->e:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)Lrr/f0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;",
            ">;",
            "Lft/i<",
            "Lqr/a$a;",
            ">;",
            "Lft/i<",
            "Lzq/a$a;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/ui/h$a;",
            ">;)",
            "Lrr/f0;"
        }
    .end annotation

    new-instance v0, Lrr/f0;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lrr/f0;-><init>(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/ui/network/b$a;Lqr/a$a;Lzq/a$a;Lcom/withpersona/sdk2/inquiry/ui/h$a;)Lrr/e0;
    .locals 6

    new-instance v0, Lrr/e0;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lrr/e0;-><init>(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/ui/network/b$a;Lqr/a$a;Lzq/a$a;Lcom/withpersona/sdk2/inquiry/ui/h$a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lrr/e0;
    .locals 5

    iget-object v0, p0, Lrr/f0;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lrr/f0;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/ui/network/b$a;

    iget-object v2, p0, Lrr/f0;->c:Lft/i;

    invoke-interface {v2}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqr/a$a;

    iget-object v3, p0, Lrr/f0;->d:Lft/i;

    invoke-interface {v3}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lzq/a$a;

    iget-object v4, p0, Lrr/f0;->e:Lft/i;

    invoke-interface {v4}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/withpersona/sdk2/inquiry/ui/h$a;

    invoke-static {v0, v1, v2, v3, v4}, Lrr/f0;->c(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/ui/network/b$a;Lqr/a$a;Lzq/a$a;Lcom/withpersona/sdk2/inquiry/ui/h$a;)Lrr/e0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lrr/f0;->b()Lrr/e0;

    move-result-object v0

    return-object v0
.end method
