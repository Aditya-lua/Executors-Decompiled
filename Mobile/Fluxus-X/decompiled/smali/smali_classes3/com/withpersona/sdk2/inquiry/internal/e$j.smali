.class public final Lcom/withpersona/sdk2/inquiry/internal/e$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llp/f;


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

.field public c:Llp/d;

.field public d:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Llp/c$a;",
            ">;"
        }
    .end annotation
.end field

.field public e:Lmp/k;

.field public f:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lmp/j$c;",
            ">;"
        }
    .end annotation
.end field

.field public g:Lmp/n;

.field public h:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lmp/m$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/e$f;Lmp/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$j;->b:Lcom/withpersona/sdk2/inquiry/internal/e$j;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$j;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/internal/e$j;->b(Lmp/c;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lmp/c;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$j;->c(Lmp/c;)V

    return-void
.end method

.method public final b(Lmp/c;)V
    .locals 4

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$j;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Lwt/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->r1:Lwt/i;

    invoke-static {v0, p1}, Llp/d;->a(Lwt/i;Lwt/i;)Llp/d;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$j;->c:Llp/d;

    invoke-static {p1}, Llp/e;->b(Llp/d;)Lwt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$j;->d:Lwt/i;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$j;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Lwt/i;

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->i1:Lwt/i;

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->L:Lwt/i;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->E1:Lwt/i;

    invoke-static {v1, v2, p1, v3, v0}, Lmp/k;->a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lmp/k;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$j;->e:Lmp/k;

    invoke-static {p1}, Lmp/l;->b(Lmp/k;)Lwt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$j;->f:Lwt/i;

    invoke-static {p1}, Lmp/n;->a(Lwt/i;)Lmp/n;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$j;->g:Lmp/n;

    invoke-static {p1}, Lmp/o;->b(Lmp/n;)Lwt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$j;->h:Lwt/i;

    return-void
.end method

.method public c(Lmp/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$j;->d(Lmp/c;)Lmp/c;

    return-void
.end method

.method public final d(Lmp/c;)Lmp/c;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$j;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/e$f;->a()Lut/b;

    move-result-object v0

    invoke-static {p1, v0}, Lcr/b;->a(Lcr/a;Lut/b;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$j;->h:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmp/m$a;

    invoke-static {p1, v0}, Lmp/d;->b(Lmp/c;Lmp/m$a;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$j;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->D0:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljr/a;

    invoke-static {p1, v0}, Lmp/d;->a(Lmp/c;Ljr/a;)V

    return-object p1
.end method
