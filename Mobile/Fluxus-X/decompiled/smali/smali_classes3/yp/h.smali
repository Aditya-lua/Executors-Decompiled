.class public final Lyp/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyp/f$a;


# instance fields
.field public final a:Lyp/g;


# direct methods
.method public constructor <init>(Lyp/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/h;->a:Lyp/g;

    return-void
.end method

.method public static b(Lyp/g;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyp/g;",
            ")",
            "Lwt/i<",
            "Lyp/f$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lyp/h;

    invoke-direct {v0, p0}, Lyp/h;-><init>(Lyp/g;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Landroidx/lifecycle/l0;)Lyp/f;
    .locals 1

    iget-object v0, p0, Lyp/h;->a:Lyp/g;

    invoke-virtual {v0, p1}, Lyp/g;->b(Landroidx/lifecycle/l0;)Lyp/f;

    move-result-object p1

    return-object p1
.end method
