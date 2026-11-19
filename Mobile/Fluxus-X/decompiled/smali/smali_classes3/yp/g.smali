.class public final Lyp/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lvp/e0$b;",
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
            "Lvp/e0$b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/g;->a:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;)Lyp/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lvp/e0$b;",
            ">;)",
            "Lyp/g;"
        }
    .end annotation

    new-instance v0, Lyp/g;

    invoke-direct {v0, p0}, Lyp/g;-><init>(Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroidx/lifecycle/l0;Lvp/e0$b;)Lyp/f;
    .locals 1

    new-instance v0, Lyp/f;

    invoke-direct {v0, p0, p1}, Lyp/f;-><init>(Landroidx/lifecycle/l0;Lvp/e0$b;)V

    return-object v0
.end method


# virtual methods
.method public b(Landroidx/lifecycle/l0;)Lyp/f;
    .locals 1

    iget-object v0, p0, Lyp/g;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvp/e0$b;

    invoke-static {p1, v0}, Lyp/g;->c(Landroidx/lifecycle/l0;Lvp/e0$b;)Lyp/f;

    move-result-object p1

    return-object p1
.end method
