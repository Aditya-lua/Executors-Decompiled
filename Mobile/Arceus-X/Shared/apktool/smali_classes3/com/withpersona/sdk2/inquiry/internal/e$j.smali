.class public final Lcom/withpersona/sdk2/inquiry/internal/e$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxo/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/internal/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "j"
.end annotation


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

.field public final b:Lcom/withpersona/sdk2/inquiry/internal/e$j;

.field public c:Lxo/c;

.field public d:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/integration/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public e:Lyo/h;

.field public f:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/integration/fragment/b$c;",
            ">;"
        }
    .end annotation
.end field

.field public g:Lcom/withpersona/sdk2/inquiry/integration/fragment/e;

.field public h:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/integration/fragment/d$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/e$f;Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$j;->b:Lcom/withpersona/sdk2/inquiry/internal/e$j;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$j;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/internal/e$j;->b(Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$j;->c(Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment;)V

    return-void
.end method

.method public final b(Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment;)V
    .locals 4

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$j;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Lft/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->r1:Lft/i;

    invoke-static {v0, p1}, Lxo/c;->a(Lft/i;Lft/i;)Lxo/c;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$j;->c:Lxo/c;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/integration/b;->b(Lxo/c;)Lft/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$j;->d:Lft/i;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$j;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Lft/i;

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->i1:Lft/i;

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->L:Lft/i;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->E1:Lft/i;

    invoke-static {v1, v2, p1, v3, v0}, Lyo/h;->a(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)Lyo/h;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$j;->e:Lyo/h;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/integration/fragment/c;->b(Lyo/h;)Lft/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$j;->f:Lft/i;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/integration/fragment/e;->a(Lft/i;)Lcom/withpersona/sdk2/inquiry/integration/fragment/e;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$j;->g:Lcom/withpersona/sdk2/inquiry/integration/fragment/e;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/integration/fragment/f;->b(Lcom/withpersona/sdk2/inquiry/integration/fragment/e;)Lft/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$j;->h:Lft/i;

    return-void
.end method

.method public c(Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$j;->d(Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment;)Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment;

    return-void
.end method

.method public final d(Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment;)Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$j;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/e$f;->a()Ldt/b;

    move-result-object v0

    invoke-static {p1, v0}, Loq/b;->a(Loq/a;Ldt/b;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$j;->h:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/integration/fragment/d$a;

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/integration/fragment/a;->b(Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment;Lcom/withpersona/sdk2/inquiry/integration/fragment/d$a;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$j;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->D0:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvq/a;

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/integration/fragment/a;->a(Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment;Lvq/a;)V

    return-object p1
.end method
