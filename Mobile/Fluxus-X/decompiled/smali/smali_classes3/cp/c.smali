.class public final Lcp/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcp/a$b;


# instance fields
.field public final a:Lcp/b;


# direct methods
.method public constructor <init>(Lcp/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcp/c;->a:Lcp/b;

    return-void
.end method

.method public static b(Lcp/b;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcp/b;",
            ")",
            "Lwt/i<",
            "Lcp/a$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcp/c;

    invoke-direct {v0, p0}, Lcp/c;-><init>(Lcp/b;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lvo/d3$e;)Lcp/a;
    .locals 1

    iget-object v0, p0, Lcp/c;->a:Lcp/b;

    invoke-virtual {v0, p1}, Lcp/b;->b(Lvo/d3$e;)Lcp/a;

    move-result-object p1

    return-object p1
.end method
