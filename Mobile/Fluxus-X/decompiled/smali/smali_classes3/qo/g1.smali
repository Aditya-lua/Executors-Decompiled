.class public final Lqo/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqo/e1$c;


# instance fields
.field public final a:Lqo/f1;


# direct methods
.method public constructor <init>(Lqo/f1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqo/g1;->a:Lqo/f1;

    return-void
.end method

.method public static b(Lqo/f1;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqo/f1;",
            ")",
            "Lwt/i<",
            "Lqo/e1$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Lqo/g1;

    invoke-direct {v0, p0}, Lqo/g1;-><init>(Lqo/f1;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lno/u2$b;Landroidx/lifecycle/l0;)Lqo/e1;
    .locals 1

    iget-object v0, p0, Lqo/g1;->a:Lqo/f1;

    invoke-virtual {v0, p1, p2}, Lqo/f1;->b(Lno/u2$b;Landroidx/lifecycle/l0;)Lqo/e1;

    move-result-object p1

    return-object p1
.end method
