.class public final Lcom/withpersona/sdk2/inquiry/internal/e$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfq/v1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/internal/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "n"
.end annotation


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

.field public final b:Lcom/withpersona/sdk2/inquiry/internal/e$n;

.field public c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lfq/o0$a;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lfq/k;

.field public e:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lfq/j$a;",
            ">;"
        }
    .end annotation
.end field

.field public f:Liq/m;

.field public g:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Liq/l$d;",
            ">;"
        }
    .end annotation
.end field

.field public h:Lhq/g;

.field public i:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lhq/f$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/e$f;Lhq/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->b:Lcom/withpersona/sdk2/inquiry/internal/e$n;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/internal/e$n;->b(Lhq/c;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lhq/c;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$n;->c(Lhq/c;)V

    return-void
.end method

.method public final b(Lhq/c;)V
    .locals 4

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Lwt/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->j1:Lwt/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->L:Lwt/i;

    invoke-static {v0, v1, p1}, Lfq/p0;->a(Lwt/i;Lwt/i;Lwt/i;)Lfq/p0;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->c:Lwt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->k1:Lwt/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Lwt/i;

    invoke-static {v0, p1}, Lfq/k;->a(Lwt/i;Lwt/i;)Lfq/k;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->d:Lfq/k;

    invoke-static {p1}, Lfq/l;->b(Lfq/k;)Lwt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->e:Lwt/i;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Lwt/i;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->c:Lwt/i;

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->L:Lwt/i;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->E1:Lwt/i;

    invoke-static {v1, v2, p1, v3, v0}, Liq/m;->a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Liq/m;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->f:Liq/m;

    invoke-static {p1}, Liq/n;->b(Liq/m;)Lwt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->g:Lwt/i;

    invoke-static {p1}, Lhq/g;->a(Lwt/i;)Lhq/g;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->h:Lhq/g;

    invoke-static {p1}, Lhq/h;->b(Lhq/g;)Lwt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->i:Lwt/i;

    return-void
.end method

.method public c(Lhq/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$n;->d(Lhq/c;)Lhq/c;

    return-void
.end method

.method public final d(Lhq/c;)Lhq/c;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/e$f;->a()Lut/b;

    move-result-object v0

    invoke-static {p1, v0}, Lcr/b;->a(Lcr/a;Lut/b;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$n;->i:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhq/f$a;

    invoke-static {p1, v0}, Lhq/d;->a(Lhq/c;Lhq/f$a;)V

    return-object p1
.end method
