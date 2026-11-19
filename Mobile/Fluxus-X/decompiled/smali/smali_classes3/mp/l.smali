.class public final Lmp/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmp/j$c;


# instance fields
.field public final a:Lmp/k;


# direct methods
.method public constructor <init>(Lmp/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmp/l;->a:Lmp/k;

    return-void
.end method

.method public static b(Lmp/k;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmp/k;",
            ")",
            "Lwt/i<",
            "Lmp/j$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Lmp/l;

    invoke-direct {v0, p0}, Lmp/l;-><init>(Lmp/k;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Llp/v$b;Landroidx/lifecycle/l0;)Lmp/j;
    .locals 1

    iget-object v0, p0, Lmp/l;->a:Lmp/k;

    invoke-virtual {v0, p1, p2}, Lmp/k;->b(Llp/v$b;Landroidx/lifecycle/l0;)Lmp/j;

    move-result-object p1

    return-object p1
.end method
