.class public final Lsp/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lsp/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lbq/e$a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lsp/f;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lav/l0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lbq/e$a;",
            ">;",
            "Lwt/i<",
            "Lsp/f;",
            ">;",
            "Lwt/i<",
            "Lav/l0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsp/c;->a:Lwt/i;

    iput-object p2, p0, Lsp/c;->b:Lwt/i;

    iput-object p3, p0, Lsp/c;->c:Lwt/i;

    iput-object p4, p0, Lsp/c;->d:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lsp/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lbq/e$a;",
            ">;",
            "Lwt/i<",
            "Lsp/f;",
            ">;",
            "Lwt/i<",
            "Lav/l0;",
            ">;)",
            "Lsp/c;"
        }
    .end annotation

    new-instance v0, Lsp/c;

    invoke-direct {v0, p0, p1, p2, p3}, Lsp/c;-><init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lbq/e$a;Lsp/f;Lav/l0;)Lsp/a;
    .locals 1

    new-instance v0, Lsp/a;

    invoke-direct {v0, p0, p1, p2, p3}, Lsp/a;-><init>(Landroid/content/Context;Lbq/e$a;Lsp/f;Lav/l0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lsp/a;
    .locals 4

    iget-object v0, p0, Lsp/c;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lsp/c;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbq/e$a;

    iget-object v2, p0, Lsp/c;->c:Lwt/i;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsp/f;

    iget-object v3, p0, Lsp/c;->d:Lwt/i;

    invoke-interface {v3}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lav/l0;

    invoke-static {v0, v1, v2, v3}, Lsp/c;->c(Landroid/content/Context;Lbq/e$a;Lsp/f;Lav/l0;)Lsp/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lsp/c;->b()Lsp/a;

    move-result-object v0

    return-object v0
.end method
