.class public final Lmp/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lmp/j$c;",
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
            "Lmp/j$c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmp/n;->a:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;)Lmp/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lmp/j$c;",
            ">;)",
            "Lmp/n;"
        }
    .end annotation

    new-instance v0, Lmp/n;

    invoke-direct {v0, p0}, Lmp/n;-><init>(Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroidx/lifecycle/l0;Lmp/j$c;)Lmp/m;
    .locals 1

    new-instance v0, Lmp/m;

    invoke-direct {v0, p0, p1}, Lmp/m;-><init>(Landroidx/lifecycle/l0;Lmp/j$c;)V

    return-object v0
.end method


# virtual methods
.method public b(Landroidx/lifecycle/l0;)Lmp/m;
    .locals 1

    iget-object v0, p0, Lmp/n;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmp/j$c;

    invoke-static {p1, v0}, Lmp/n;->c(Landroidx/lifecycle/l0;Lmp/j$c;)Lmp/m;

    move-result-object p1

    return-object p1
.end method
