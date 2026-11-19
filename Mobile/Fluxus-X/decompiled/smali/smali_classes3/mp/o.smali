.class public final Lmp/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmp/m$a;


# instance fields
.field public final a:Lmp/n;


# direct methods
.method public constructor <init>(Lmp/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmp/o;->a:Lmp/n;

    return-void
.end method

.method public static b(Lmp/n;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmp/n;",
            ")",
            "Lwt/i<",
            "Lmp/m$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lmp/o;

    invoke-direct {v0, p0}, Lmp/o;-><init>(Lmp/n;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Landroidx/lifecycle/l0;)Lmp/m;
    .locals 1

    iget-object v0, p0, Lmp/o;->a:Lmp/n;

    invoke-virtual {v0, p1}, Lmp/n;->b(Landroidx/lifecycle/l0;)Lmp/m;

    move-result-object p1

    return-object p1
.end method
