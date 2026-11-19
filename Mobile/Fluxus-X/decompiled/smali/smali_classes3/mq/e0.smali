.class public final Lmq/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmq/c0$b;


# instance fields
.field public final a:Lmq/d0;


# direct methods
.method public constructor <init>(Lmq/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/e0;->a:Lmq/d0;

    return-void
.end method

.method public static b(Lmq/d0;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmq/d0;",
            ")",
            "Lwt/i<",
            "Lmq/c0$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lmq/e0;

    invoke-direct {v0, p0}, Lmq/e0;-><init>(Lmq/d0;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lmq/f0;Lrq/a;Z)Lmq/c0;
    .locals 1

    iget-object v0, p0, Lmq/e0;->a:Lmq/d0;

    invoke-virtual {v0, p2, p3, p1}, Lmq/d0;->b(Lrq/a;ZLmq/f0;)Lmq/c0;

    move-result-object p1

    return-object p1
.end method
