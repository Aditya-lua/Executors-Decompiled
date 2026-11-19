.class public final Les/q1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Les/o1$a;


# instance fields
.field public final a:Les/p1;


# direct methods
.method public constructor <init>(Les/p1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/q1;->a:Les/p1;

    return-void
.end method

.method public static b(Les/p1;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Les/p1;",
            ")",
            "Lwt/i<",
            "Les/o1$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Les/q1;

    invoke-direct {v0, p0}, Les/q1;-><init>(Les/p1;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Les/o1;
    .locals 1

    iget-object v0, p0, Les/q1;->a:Les/p1;

    invoke-virtual {v0, p1, p2, p3, p4}, Les/p1;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Les/o1;

    move-result-object p1

    return-object p1
.end method
