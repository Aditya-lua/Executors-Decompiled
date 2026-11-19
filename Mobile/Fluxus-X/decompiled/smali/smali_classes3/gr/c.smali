.class public final Lgr/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lgr/b;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Landroidx/lifecycle/l0;",
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
            "Landroidx/lifecycle/l0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgr/c;->a:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;)Lgr/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroidx/lifecycle/l0;",
            ">;)",
            "Lgr/c;"
        }
    .end annotation

    new-instance v0, Lgr/c;

    invoke-direct {v0, p0}, Lgr/c;-><init>(Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroidx/lifecycle/l0;)Lgr/b;
    .locals 1

    new-instance v0, Lgr/b;

    invoke-direct {v0, p0}, Lgr/b;-><init>(Landroidx/lifecycle/l0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lgr/b;
    .locals 1

    iget-object v0, p0, Lgr/c;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/l0;

    invoke-static {v0}, Lgr/c;->c(Landroidx/lifecycle/l0;)Lgr/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgr/c;->b()Lgr/b;

    move-result-object v0

    return-object v0
.end method
