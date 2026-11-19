.class public final Lqo/i1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lqo/e1$c;",
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
            "Lqo/e1$c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqo/i1;->a:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;)Lqo/i1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lqo/e1$c;",
            ">;)",
            "Lqo/i1;"
        }
    .end annotation

    new-instance v0, Lqo/i1;

    invoke-direct {v0, p0}, Lqo/i1;-><init>(Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroidx/lifecycle/l0;Lno/u2$b;Lqo/e1$c;)Lqo/h1;
    .locals 1

    new-instance v0, Lqo/h1;

    invoke-direct {v0, p0, p1, p2}, Lqo/h1;-><init>(Landroidx/lifecycle/l0;Lno/u2$b;Lqo/e1$c;)V

    return-object v0
.end method


# virtual methods
.method public b(Landroidx/lifecycle/l0;Lno/u2$b;)Lqo/h1;
    .locals 1

    iget-object v0, p0, Lqo/i1;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqo/e1$c;

    invoke-static {p1, p2, v0}, Lqo/i1;->c(Landroidx/lifecycle/l0;Lno/u2$b;Lqo/e1$c;)Lqo/h1;

    move-result-object p1

    return-object p1
.end method
