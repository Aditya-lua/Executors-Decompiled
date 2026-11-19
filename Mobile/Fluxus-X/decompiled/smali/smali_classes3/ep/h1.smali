.class public final Lep/h1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lep/f1$c;


# instance fields
.field public final a:Lep/g1;


# direct methods
.method public constructor <init>(Lep/g1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lep/h1;->a:Lep/g1;

    return-void
.end method

.method public static b(Lep/g1;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lep/g1;",
            ")",
            "Lwt/i<",
            "Lep/f1$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Lep/h1;

    invoke-direct {v0, p0}, Lep/h1;-><init>(Lep/g1;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lvo/d2$a;Landroidx/lifecycle/l0;)Lep/f1;
    .locals 1

    iget-object v0, p0, Lep/h1;->a:Lep/g1;

    invoke-virtual {v0, p1, p2}, Lep/g1;->b(Lvo/d2$a;Landroidx/lifecycle/l0;)Lep/f1;

    move-result-object p1

    return-object p1
.end method
