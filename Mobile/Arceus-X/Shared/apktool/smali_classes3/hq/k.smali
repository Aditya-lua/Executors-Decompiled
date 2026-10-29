.class public final Lhq/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lhq/j;",
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
            "Lcom/withpersona/sdk2/camera/e$a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lhn/c$a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Luq/a;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lgo/e;",
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
            "Lcom/withpersona/sdk2/camera/e$a;",
            ">;",
            "Lft/i<",
            "Lhn/c$a;",
            ">;",
            "Lft/i<",
            "Luq/a;",
            ">;",
            "Lft/i<",
            "Lgo/e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhq/k;->a:Lft/i;

    iput-object p2, p0, Lhq/k;->b:Lft/i;

    iput-object p3, p0, Lhq/k;->c:Lft/i;

    iput-object p4, p0, Lhq/k;->d:Lft/i;

    iput-object p5, p0, Lhq/k;->e:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)Lhq/k;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/camera/e$a;",
            ">;",
            "Lft/i<",
            "Lhn/c$a;",
            ">;",
            "Lft/i<",
            "Luq/a;",
            ">;",
            "Lft/i<",
            "Lgo/e;",
            ">;)",
            "Lhq/k;"
        }
    .end annotation

    new-instance v0, Lhq/k;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lhq/k;-><init>(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Luq/a;Lgo/e;)Lhq/j;
    .locals 6

    new-instance v0, Lhq/j;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lhq/j;-><init>(Landroid/content/Context;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Luq/a;Lgo/e;)V

    return-object v0
.end method


# virtual methods
.method public b()Lhq/j;
    .locals 5

    iget-object v0, p0, Lhq/k;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lhq/k;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/camera/e$a;

    iget-object v2, p0, Lhq/k;->c:Lft/i;

    invoke-interface {v2}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhn/c$a;

    iget-object v3, p0, Lhq/k;->d:Lft/i;

    invoke-interface {v3}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Luq/a;

    iget-object v4, p0, Lhq/k;->e:Lft/i;

    invoke-interface {v4}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lgo/e;

    invoke-static {v0, v1, v2, v3, v4}, Lhq/k;->c(Landroid/content/Context;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Luq/a;Lgo/e;)Lhq/j;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lhq/k;->b()Lhq/j;

    move-result-object v0

    return-object v0
.end method
