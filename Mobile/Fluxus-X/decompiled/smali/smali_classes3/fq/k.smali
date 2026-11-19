.class public final Lfq/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lg/d<",
            "Lg/i;",
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


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lg/d<",
            "Lg/i;",
            ">;>;",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/k;->a:Lwt/i;

    iput-object p2, p0, Lfq/k;->b:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;)Lfq/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lg/d<",
            "Lg/i;",
            ">;>;",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;)",
            "Lfq/k;"
        }
    .end annotation

    new-instance v0, Lfq/k;

    invoke-direct {v0, p0, p1}, Lfq/k;-><init>(Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Lg/d;Landroid/content/Context;)Lfq/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg/d<",
            "Lg/i;",
            ">;",
            "Landroid/content/Context;",
            ")",
            "Lfq/j;"
        }
    .end annotation

    new-instance v0, Lfq/j;

    invoke-direct {v0, p0, p1}, Lfq/j;-><init>(Lg/d;Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public b()Lfq/j;
    .locals 2

    iget-object v0, p0, Lfq/k;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg/d;

    iget-object v1, p0, Lfq/k;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {v0, v1}, Lfq/k;->c(Lg/d;Landroid/content/Context;)Lfq/j;

    move-result-object v0

    return-object v0
.end method
