.class public final Lhq/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhq/i$a;


# instance fields
.field public final a:Lhq/j;


# direct methods
.method public constructor <init>(Lhq/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhq/k;->a:Lhq/j;

    return-void
.end method

.method public static b(Lhq/j;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhq/j;",
            ")",
            "Lwt/i<",
            "Lhq/i$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lhq/k;

    invoke-direct {v0, p0}, Lhq/k;-><init>(Lhq/j;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lfq/n1$c;)Lhq/i;
    .locals 1

    iget-object v0, p0, Lhq/k;->a:Lhq/j;

    invoke-virtual {v0, p1}, Lhq/j;->b(Lfq/n1$c;)Lhq/i;

    move-result-object p1

    return-object p1
.end method
