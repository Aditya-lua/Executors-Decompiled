.class public final Lvp/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvp/e0$b;


# instance fields
.field public final a:Lvp/f0;


# direct methods
.method public constructor <init>(Lvp/f0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvp/g0;->a:Lvp/f0;

    return-void
.end method

.method public static b(Lvp/f0;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvp/f0;",
            ")",
            "Lwt/i<",
            "Lvp/e0$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lvp/g0;

    invoke-direct {v0, p0}, Lvp/g0;-><init>(Lvp/f0;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/withpersona/sdk2/inquiry/internal/m;Landroidx/lifecycle/l0;)Lvp/e0;
    .locals 1

    iget-object v0, p0, Lvp/g0;->a:Lvp/f0;

    invoke-virtual {v0, p1, p2}, Lvp/f0;->b(Lcom/withpersona/sdk2/inquiry/internal/m;Landroidx/lifecycle/l0;)Lvp/e0;

    move-result-object p1

    return-object p1
.end method
