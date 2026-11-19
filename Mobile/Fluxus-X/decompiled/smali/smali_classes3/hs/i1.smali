.class public final Lhs/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhs/g1$e;


# instance fields
.field public final a:Lhs/h1;


# direct methods
.method public constructor <init>(Lhs/h1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhs/i1;->a:Lhs/h1;

    return-void
.end method

.method public static b(Lhs/h1;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhs/h1;",
            ")",
            "Lwt/i<",
            "Lhs/g1$e;",
            ">;"
        }
    .end annotation

    new-instance v0, Lhs/i1;

    invoke-direct {v0, p0}, Lhs/i1;-><init>(Lhs/h1;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Les/s6$b;Landroidx/lifecycle/l0;)Lhs/g1;
    .locals 1

    iget-object v0, p0, Lhs/i1;->a:Lhs/h1;

    invoke-virtual {v0, p1, p2}, Lhs/h1;->b(Les/s6$b;Landroidx/lifecycle/l0;)Lhs/g1;

    move-result-object p1

    return-object p1
.end method
