.class public final Lyp/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyp/i$a;


# instance fields
.field public final a:Lyp/j;


# direct methods
.method public constructor <init>(Lyp/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/k;->a:Lyp/j;

    return-void
.end method

.method public static b(Lyp/j;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyp/j;",
            ")",
            "Lwt/i<",
            "Lyp/i$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lyp/k;

    invoke-direct {v0, p0}, Lyp/k;-><init>(Lyp/j;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Landroidx/lifecycle/l0;)Lyp/i;
    .locals 1

    iget-object v0, p0, Lyp/k;->a:Lyp/j;

    invoke-virtual {v0, p1}, Lyp/j;->b(Landroidx/lifecycle/l0;)Lyp/i;

    move-result-object p1

    return-object p1
.end method
