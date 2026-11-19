.class public final Lep/j1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lep/f1$c;",
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
            "Lep/f1$c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lep/j1;->a:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;)Lep/j1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lep/f1$c;",
            ">;)",
            "Lep/j1;"
        }
    .end annotation

    new-instance v0, Lep/j1;

    invoke-direct {v0, p0}, Lep/j1;-><init>(Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroidx/lifecycle/l0;Lvo/d2$a;Lep/f1$c;)Lep/i1;
    .locals 1

    new-instance v0, Lep/i1;

    invoke-direct {v0, p0, p1, p2}, Lep/i1;-><init>(Landroidx/lifecycle/l0;Lvo/d2$a;Lep/f1$c;)V

    return-object v0
.end method


# virtual methods
.method public b(Landroidx/lifecycle/l0;Lvo/d2$a;)Lep/i1;
    .locals 1

    iget-object v0, p0, Lep/j1;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lep/f1$c;

    invoke-static {p1, p2, v0}, Lep/j1;->c(Landroidx/lifecycle/l0;Lvo/d2$a;Lep/f1$c;)Lep/i1;

    move-result-object p1

    return-object p1
.end method
