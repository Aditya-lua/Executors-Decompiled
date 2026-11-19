.class public final Lhq/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Liq/l$d;",
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
            "Liq/l$d;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhq/g;->a:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;)Lhq/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Liq/l$d;",
            ">;)",
            "Lhq/g;"
        }
    .end annotation

    new-instance v0, Lhq/g;

    invoke-direct {v0, p0}, Lhq/g;-><init>(Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroidx/lifecycle/l0;Liq/l$d;)Lhq/f;
    .locals 1

    new-instance v0, Lhq/f;

    invoke-direct {v0, p0, p1}, Lhq/f;-><init>(Landroidx/lifecycle/l0;Liq/l$d;)V

    return-object v0
.end method


# virtual methods
.method public b(Landroidx/lifecycle/l0;)Lhq/f;
    .locals 1

    iget-object v0, p0, Lhq/g;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Liq/l$d;

    invoke-static {p1, v0}, Lhq/g;->c(Landroidx/lifecycle/l0;Liq/l$d;)Lhq/f;

    move-result-object p1

    return-object p1
.end method
