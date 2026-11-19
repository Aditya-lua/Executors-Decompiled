.class public final Lvo/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvo/o$a;


# instance fields
.field public final a:Lvo/p;


# direct methods
.method public constructor <init>(Lvo/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/q;->a:Lvo/p;

    return-void
.end method

.method public static b(Lvo/p;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvo/p;",
            ")",
            "Lwt/i<",
            "Lvo/o$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lvo/q;

    invoke-direct {v0, p0}, Lvo/q;-><init>(Lvo/p;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lvo/d3$e;Ljava/lang/String;)Lvo/o;
    .locals 1

    iget-object v0, p0, Lvo/q;->a:Lvo/p;

    invoke-virtual {v0, p1, p2}, Lvo/p;->b(Lvo/d3$e;Ljava/lang/String;)Lvo/o;

    move-result-object p1

    return-object p1
.end method
