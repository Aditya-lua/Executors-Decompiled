.class public final Lcom/withpersona/sdk2/inquiry/internal/e$t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljp/c;


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
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/e$f;Ljp/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$t;->b:Lcom/withpersona/sdk2/inquiry/internal/e$t;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$t;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljp/b;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$t;->b(Ljp/b;)V

    return-void
.end method

.method public b(Ljp/b;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$t;->c(Ljp/b;)Ljp/b;

    return-void
.end method

.method public final c(Ljp/b;)Ljp/b;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$t;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/e$f;->a()Ldt/b;

    move-result-object v0

    invoke-static {p1, v0}, Loq/b;->a(Loq/a;Ldt/b;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$t;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->W:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lan/c0;

    invoke-static {p1, v0}, Ljp/d;->b(Ljp/b;Lan/c0;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$t;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->D0:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvq/a;

    invoke-static {p1, v0}, Ljp/d;->a(Ljp/b;Lvq/a;)V

    return-object p1
.end method
