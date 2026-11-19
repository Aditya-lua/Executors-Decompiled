.class public final Liq/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Liq/l$d;


# instance fields
.field public final a:Liq/m;


# direct methods
.method public constructor <init>(Liq/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Liq/n;->a:Liq/m;

    return-void
.end method

.method public static b(Liq/m;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liq/m;",
            ")",
            "Lwt/i<",
            "Liq/l$d;",
            ">;"
        }
    .end annotation

    new-instance v0, Liq/n;

    invoke-direct {v0, p0}, Liq/n;-><init>(Liq/m;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lfq/n1$c;Landroidx/lifecycle/l0;)Liq/l;
    .locals 1

    iget-object v0, p0, Liq/n;->a:Liq/m;

    invoke-virtual {v0, p1, p2}, Liq/m;->b(Lfq/n1$c;Landroidx/lifecycle/l0;)Liq/l;

    move-result-object p1

    return-object p1
.end method
