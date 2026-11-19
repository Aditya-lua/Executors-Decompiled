.class public final Lsq/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsq/n$a;


# instance fields
.field public final a:Lsq/o;


# direct methods
.method public constructor <init>(Lsq/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsq/p;->a:Lsq/o;

    return-void
.end method

.method public static b(Lsq/o;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsq/o;",
            ")",
            "Lwt/i<",
            "Lsq/n$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lsq/p;

    invoke-direct {v0, p0}, Lsq/p;-><init>(Lsq/o;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Landroidx/lifecycle/l0;Lmq/q5$b;)Lsq/n;
    .locals 1

    iget-object v0, p0, Lsq/p;->a:Lsq/o;

    invoke-virtual {v0, p1, p2}, Lsq/o;->b(Landroidx/lifecycle/l0;Lmq/q5$b;)Lsq/n;

    move-result-object p1

    return-object p1
.end method
