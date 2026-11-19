.class public final Lep/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lep/i1$a;


# instance fields
.field public final a:Lep/j1;


# direct methods
.method public constructor <init>(Lep/j1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lep/k1;->a:Lep/j1;

    return-void
.end method

.method public static b(Lep/j1;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lep/j1;",
            ")",
            "Lwt/i<",
            "Lep/i1$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lep/k1;

    invoke-direct {v0, p0}, Lep/k1;-><init>(Lep/j1;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Landroidx/lifecycle/l0;Lvo/d2$a;)Lep/i1;
    .locals 1

    iget-object v0, p0, Lep/k1;->a:Lep/j1;

    invoke-virtual {v0, p1, p2}, Lep/j1;->b(Landroidx/lifecycle/l0;Lvo/d2$a;)Lep/i1;

    move-result-object p1

    return-object p1
.end method
