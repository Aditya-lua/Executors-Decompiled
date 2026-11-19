.class public final Lsq/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ltq/k2$d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Ltq/k2$d;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsq/o;->a:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;)Lsq/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Ltq/k2$d;",
            ">;)",
            "Lsq/o;"
        }
    .end annotation

    new-instance v0, Lsq/o;

    invoke-direct {v0, p0}, Lsq/o;-><init>(Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroidx/lifecycle/l0;Lmq/q5$b;Ltq/k2$d;)Lsq/n;
    .locals 1

    new-instance v0, Lsq/n;

    invoke-direct {v0, p0, p1, p2}, Lsq/n;-><init>(Landroidx/lifecycle/l0;Lmq/q5$b;Ltq/k2$d;)V

    return-object v0
.end method


# virtual methods
.method public b(Landroidx/lifecycle/l0;Lmq/q5$b;)Lsq/n;
    .locals 1

    iget-object v0, p0, Lsq/o;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltq/k2$d;

    invoke-static {p1, p2, v0}, Lsq/o;->c(Landroidx/lifecycle/l0;Lmq/q5$b;Ltq/k2$d;)Lsq/n;

    move-result-object p1

    return-object p1
.end method
