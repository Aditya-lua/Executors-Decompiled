.class public final Lis/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lis/f$a;


# instance fields
.field public final a:Lis/g;


# direct methods
.method public constructor <init>(Lis/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lis/h;->a:Lis/g;

    return-void
.end method

.method public static b(Lis/g;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lis/g;",
            ")",
            "Lwt/i<",
            "Lis/f$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lis/h;

    invoke-direct {v0, p0}, Lis/h;-><init>(Lis/g;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Landroidx/lifecycle/l0;Les/s6$b;)Lis/f;
    .locals 1

    iget-object v0, p0, Lis/h;->a:Lis/g;

    invoke-virtual {v0, p1, p2}, Lis/g;->b(Landroidx/lifecycle/l0;Les/s6$b;)Lis/f;

    move-result-object p1

    return-object p1
.end method
