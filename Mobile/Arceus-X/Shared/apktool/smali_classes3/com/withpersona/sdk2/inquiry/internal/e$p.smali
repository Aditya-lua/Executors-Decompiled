.class public final Lcom/withpersona/sdk2/inquiry/internal/e$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyp/c0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/internal/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "p"
.end annotation


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

.field public final b:Lcom/withpersona/sdk2/inquiry/internal/e$p;

.field public c:Lcq/c;

.field public d:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcq/b$a;",
            ">;"
        }
    .end annotation
.end field

.field public e:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Ltr/b$a;",
            ">;"
        }
    .end annotation
.end field

.field public f:Lyp/v;

.field public g:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/selfie/e$b;",
            ">;"
        }
    .end annotation
.end field

.field public h:Ltp/d;

.field public i:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;",
            ">;"
        }
    .end annotation
.end field

.field public j:Lfn/t;

.field public k:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/camera/e$a;",
            ">;"
        }
    .end annotation
.end field

.field public l:Lhn/c0;

.field public m:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lhn/b0$a;",
            ">;"
        }
    .end annotation
.end field

.field public n:Lhn/e;

.field public o:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lhn/c$a;",
            ">;"
        }
    .end annotation
.end field

.field public p:Ldq/b;

.field public q:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Ldq/a$b;",
            ">;"
        }
    .end annotation
.end field

.field public r:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/selfie/g;",
            ">;"
        }
    .end annotation
.end field

.field public s:Lfq/m2;

.field public t:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lfq/k2$d;",
            ">;"
        }
    .end annotation
.end field

.field public u:Leq/l;

.field public v:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/e$f;Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->b:Lcom/withpersona/sdk2/inquiry/internal/e$p;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/internal/e$p;->b(Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$p;->c(Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;)V

    return-void
.end method

.method public final b(Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;)V
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v2, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Lft/i;

    iget-object v3, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->m1:Lft/i;

    iget-object v4, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->d1:Lft/i;

    iget-object v5, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->C0:Lft/i;

    iget-object v6, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->e1:Lft/i;

    iget-object v7, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->g1:Lft/i;

    iget-object v8, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->L:Lft/i;

    iget-object v9, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->S0:Lft/i;

    invoke-static/range {v2 .. v9}, Lcq/c;->a(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)Lcq/c;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->c:Lcq/c;

    invoke-static {v1}, Lcq/d;->b(Lcq/c;)Lft/i;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->d:Lft/i;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v1, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->l1:Lft/i;

    invoke-static {v1}, Ltr/c;->a(Lft/i;)Ltr/c;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->e:Lft/i;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v2, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->Q:Lft/i;

    iget-object v1, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->g:Lft/i;

    invoke-static {v2, v1}, Lyp/v;->a(Lft/i;Lft/i;)Lyp/v;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->f:Lyp/v;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/selfie/f;->b(Lyp/v;)Lft/i;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->g:Lft/i;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v1, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->Q0:Lft/i;

    invoke-static {v1}, Ltp/d;->a(Lft/i;)Ltp/d;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->h:Ltp/d;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/f;->b(Ltp/d;)Lft/i;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->i:Lft/i;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v2, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Lft/i;

    iget-object v3, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->g1:Lft/i;

    iget-object v1, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->g:Lft/i;

    invoke-static {v2, v3, v1}, Lfn/t;->a(Lft/i;Lft/i;Lft/i;)Lfn/t;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->j:Lfn/t;

    invoke-static {v1}, Lcom/withpersona/sdk2/camera/f;->b(Lfn/t;)Lft/i;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->k:Lft/i;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v2, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Lft/i;

    iget-object v3, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->g1:Lft/i;

    iget-object v4, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->g:Lft/i;

    iget-object v5, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->R:Lft/i;

    iget-object v6, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->G:Lft/i;

    iget-object v7, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->L:Lft/i;

    iget-object v8, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->F0:Lft/i;

    iget-object v9, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->x:Lft/i;

    invoke-static/range {v2 .. v9}, Lhn/c0;->a(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)Lhn/c0;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->l:Lhn/c0;

    invoke-static {v1}, Lhn/d0;->b(Lhn/c0;)Lft/i;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->m:Lft/i;

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v3, v2, Lcom/withpersona/sdk2/inquiry/internal/e$f;->R:Lft/i;

    iget-object v4, v2, Lcom/withpersona/sdk2/inquiry/internal/e$f;->H:Lft/i;

    iget-object v2, v2, Lcom/withpersona/sdk2/inquiry/internal/e$f;->L:Lft/i;

    invoke-static {v1, v3, v4, v2}, Lhn/e;->a(Lft/i;Lft/i;Lft/i;Lft/i;)Lhn/e;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->n:Lhn/e;

    invoke-static {v1}, Lhn/f;->b(Lhn/e;)Lft/i;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->o:Lft/i;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v2, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->w:Lft/i;

    iget-object v3, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->m1:Lft/i;

    iget-object v4, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->H:Lft/i;

    iget-object v1, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->n1:Lft/i;

    invoke-static {v2, v3, v4, v1}, Ldq/b;->a(Lft/i;Lft/i;Lft/i;Lft/i;)Ldq/b;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->p:Ldq/b;

    invoke-static {v1}, Ldq/c;->b(Ldq/b;)Lft/i;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->q:Lft/i;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v2, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->F0:Lft/i;

    iget-object v1, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->L:Lft/i;

    invoke-static {v2, v1}, Lyp/w;->a(Lft/i;Lft/i;)Lyp/w;

    move-result-object v15

    iput-object v15, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->r:Lft/i;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v3, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Lft/i;

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->d:Lft/i;

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->e:Lft/i;

    iget-object v6, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->g:Lft/i;

    iget-object v7, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->i:Lft/i;

    iget-object v8, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->k:Lft/i;

    iget-object v9, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->o:Lft/i;

    iget-object v10, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->g1:Lft/i;

    iget-object v11, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->i1:Lft/i;

    iget-object v12, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->S0:Lft/i;

    iget-object v13, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->E1:Lft/i;

    iget-object v14, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->q:Lft/i;

    iget-object v2, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->x:Lft/i;

    iget-object v1, v1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->g:Lft/i;

    move-object/from16 v17, v1

    move-object/from16 v16, v2

    invoke-static/range {v3 .. v17}, Lfq/m2;->a(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)Lfq/m2;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->s:Lfq/m2;

    invoke-static {v1}, Lfq/n2;->b(Lfq/m2;)Lft/i;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->t:Lft/i;

    invoke-static {v1}, Leq/l;->a(Lft/i;)Leq/l;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->u:Leq/l;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/c;->b(Leq/l;)Lft/i;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->v:Lft/i;

    return-void
.end method

.method public c(Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$p;->d(Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;)Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;

    return-void
.end method

.method public final d(Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;)Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/e$f;->a()Ldt/b;

    move-result-object v0

    invoke-static {p1, v0}, Loq/b;->a(Loq/a;Ldt/b;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->v:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b$a;

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/a;->f(Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b$a;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/e$f;->l()Lcom/withpersona/sdk2/camera/b;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/a;->a(Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;Lcom/withpersona/sdk2/camera/b;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->Q:Lft/i;

    invoke-static {v0}, Lft/c;->b(Lft/i;)Lct/a;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/a;->c(Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;Lct/a;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->L:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/a;->e(Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->D0:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvq/a;

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/a;->d(Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;Lvq/a;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$p;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->x:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgo/e;

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/a;->b(Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;Lgo/e;)V

    return-object p1
.end method
