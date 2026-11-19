.class public final Lfq/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfq/j$a;


# instance fields
.field public final a:Lfq/k;


# direct methods
.method public constructor <init>(Lfq/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/l;->a:Lfq/k;

    return-void
.end method

.method public static b(Lfq/k;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfq/k;",
            ")",
            "Lwt/i<",
            "Lfq/j$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lfq/l;

    invoke-direct {v0, p0}, Lfq/l;-><init>(Lfq/k;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Lfq/j;
    .locals 1

    iget-object v0, p0, Lfq/l;->a:Lfq/k;

    invoke-virtual {v0}, Lfq/k;->b()Lfq/j;

    move-result-object v0

    return-object v0
.end method
