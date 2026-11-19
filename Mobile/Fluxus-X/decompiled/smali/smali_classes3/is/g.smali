.class public final Lis/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lhs/g1$e;",
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
            "Lhs/g1$e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lis/g;->a:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;)Lis/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lhs/g1$e;",
            ">;)",
            "Lis/g;"
        }
    .end annotation

    new-instance v0, Lis/g;

    invoke-direct {v0, p0}, Lis/g;-><init>(Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroidx/lifecycle/l0;Les/s6$b;Lhs/g1$e;)Lis/f;
    .locals 1

    new-instance v0, Lis/f;

    invoke-direct {v0, p0, p1, p2}, Lis/f;-><init>(Landroidx/lifecycle/l0;Les/s6$b;Lhs/g1$e;)V

    return-object v0
.end method


# virtual methods
.method public b(Landroidx/lifecycle/l0;Les/s6$b;)Lis/f;
    .locals 1

    iget-object v0, p0, Lis/g;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhs/g1$e;

    invoke-static {p1, p2, v0}, Lis/g;->c(Landroidx/lifecycle/l0;Les/s6$b;Lhs/g1$e;)Lis/f;

    move-result-object p1

    return-object p1
.end method
