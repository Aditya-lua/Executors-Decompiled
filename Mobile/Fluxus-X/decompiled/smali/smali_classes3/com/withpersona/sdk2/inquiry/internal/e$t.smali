.class public final Lcom/withpersona/sdk2/inquiry/internal/e$t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxp/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/internal/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "t"
.end annotation


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

.field public final b:Lcom/withpersona/sdk2/inquiry/internal/e$t;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/e$f;Lxp/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$t;->b:Lcom/withpersona/sdk2/inquiry/internal/e$t;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$t;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lxp/b;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$t;->b(Lxp/b;)V

    return-void
.end method

.method public b(Lxp/b;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$t;->c(Lxp/b;)Lxp/b;

    return-void
.end method

.method public final c(Lxp/b;)Lxp/b;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$t;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/e$f;->a()Lut/b;

    move-result-object v0

    invoke-static {p1, v0}, Lcr/b;->a(Lcr/a;Lut/b;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$t;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->W:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnn/d0;

    invoke-static {p1, v0}, Lxp/d;->b(Lxp/b;Lnn/d0;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$t;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->D0:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljr/a;

    invoke-static {p1, v0}, Lxp/d;->a(Lxp/b;Ljr/a;)V

    return-object p1
.end method
