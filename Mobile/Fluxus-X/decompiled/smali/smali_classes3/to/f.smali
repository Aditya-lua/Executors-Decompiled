.class public final Lto/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lto/e;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ljava/util/Set<",
            "Lto/d;",
            ">;>;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Landroidx/lifecycle/l0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Ljava/util/Set<",
            "Lto/d;",
            ">;>;",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Landroidx/lifecycle/l0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lto/f;->a:Lwt/i;

    iput-object p2, p0, Lto/f;->b:Lwt/i;

    iput-object p3, p0, Lto/f;->c:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;)Lto/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Ljava/util/Set<",
            "Lto/d;",
            ">;>;",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Landroidx/lifecycle/l0;",
            ">;)",
            "Lto/f;"
        }
    .end annotation

    new-instance v0, Lto/f;

    invoke-direct {v0, p0, p1, p2}, Lto/f;-><init>(Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Ljava/util/Set;Landroid/content/Context;Landroidx/lifecycle/l0;)Lto/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lto/d;",
            ">;",
            "Landroid/content/Context;",
            "Landroidx/lifecycle/l0;",
            ")",
            "Lto/e;"
        }
    .end annotation

    new-instance v0, Lto/e;

    invoke-direct {v0, p0, p1, p2}, Lto/e;-><init>(Ljava/util/Set;Landroid/content/Context;Landroidx/lifecycle/l0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lto/e;
    .locals 3

    iget-object v0, p0, Lto/f;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    iget-object v1, p0, Lto/f;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, Lto/f;->c:Lwt/i;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/l0;

    invoke-static {v0, v1, v2}, Lto/f;->c(Ljava/util/Set;Landroid/content/Context;Landroidx/lifecycle/l0;)Lto/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lto/f;->b()Lto/e;

    move-result-object v0

    return-object v0
.end method
