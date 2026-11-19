.class public final Lc8/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz7/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lz7/h<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lc8/o;

.field public final b:Ljava/lang/String;

.field public final c:Lz7/c;

.field public final d:Lz7/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz7/g<",
            "TT;[B>;"
        }
    .end annotation
.end field

.field public final e:Lc8/s;


# direct methods
.method public constructor <init>(Lc8/o;Ljava/lang/String;Lz7/c;Lz7/g;Lc8/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc8/o;",
            "Ljava/lang/String;",
            "Lz7/c;",
            "Lz7/g<",
            "TT;[B>;",
            "Lc8/s;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc8/r;->a:Lc8/o;

    iput-object p2, p0, Lc8/r;->b:Ljava/lang/String;

    iput-object p3, p0, Lc8/r;->c:Lz7/c;

    iput-object p4, p0, Lc8/r;->d:Lz7/g;

    iput-object p5, p0, Lc8/r;->e:Lc8/s;

    return-void
.end method

.method public static synthetic b(Ljava/lang/Exception;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public a(Lz7/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz7/d<",
            "TT;>;)V"
        }
    .end annotation

    new-instance v0, Lc8/q;

    invoke-direct {v0}, Lc8/q;-><init>()V

    invoke-virtual {p0, p1, v0}, Lc8/r;->c(Lz7/d;Lz7/j;)V

    return-void
.end method

.method public c(Lz7/d;Lz7/j;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz7/d<",
            "TT;>;",
            "Lz7/j;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lc8/r;->e:Lc8/s;

    invoke-static {}, Lc8/n;->a()Lc8/n$a;

    move-result-object v1

    iget-object v2, p0, Lc8/r;->a:Lc8/o;

    invoke-virtual {v1, v2}, Lc8/n$a;->e(Lc8/o;)Lc8/n$a;

    move-result-object v1

    invoke-virtual {v1, p1}, Lc8/n$a;->c(Lz7/d;)Lc8/n$a;

    move-result-object p1

    iget-object v1, p0, Lc8/r;->b:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lc8/n$a;->f(Ljava/lang/String;)Lc8/n$a;

    move-result-object p1

    iget-object v1, p0, Lc8/r;->d:Lz7/g;

    invoke-virtual {p1, v1}, Lc8/n$a;->d(Lz7/g;)Lc8/n$a;

    move-result-object p1

    iget-object v1, p0, Lc8/r;->c:Lz7/c;

    invoke-virtual {p1, v1}, Lc8/n$a;->b(Lz7/c;)Lc8/n$a;

    move-result-object p1

    invoke-virtual {p1}, Lc8/n$a;->a()Lc8/n;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lc8/s;->a(Lc8/n;Lz7/j;)V

    return-void
.end method
