.class public final Lhq/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhq/f$a;


# instance fields
.field public final a:Lhq/g;


# direct methods
.method public constructor <init>(Lhq/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhq/h;->a:Lhq/g;

    return-void
.end method

.method public static b(Lhq/g;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhq/g;",
            ")",
            "Lwt/i<",
            "Lhq/f$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lhq/h;

    invoke-direct {v0, p0}, Lhq/h;-><init>(Lhq/g;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Landroidx/lifecycle/l0;)Lhq/f;
    .locals 1

    iget-object v0, p0, Lhq/h;->a:Lhq/g;

    invoke-virtual {v0, p1}, Lhq/g;->b(Landroidx/lifecycle/l0;)Lhq/f;

    move-result-object p1

    return-object p1
.end method
