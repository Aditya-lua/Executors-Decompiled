.class public final Lqo/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqo/h1$a;


# instance fields
.field public final a:Lqo/i1;


# direct methods
.method public constructor <init>(Lqo/i1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqo/j1;->a:Lqo/i1;

    return-void
.end method

.method public static b(Lqo/i1;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqo/i1;",
            ")",
            "Lwt/i<",
            "Lqo/h1$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lqo/j1;

    invoke-direct {v0, p0}, Lqo/j1;-><init>(Lqo/i1;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Landroidx/lifecycle/l0;Lno/u2$b;)Lqo/h1;
    .locals 1

    iget-object v0, p0, Lqo/j1;->a:Lqo/i1;

    invoke-virtual {v0, p1, p2}, Lqo/i1;->b(Landroidx/lifecycle/l0;Lno/u2$b;)Lqo/h1;

    move-result-object p1

    return-object p1
.end method
