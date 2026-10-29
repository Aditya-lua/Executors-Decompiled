.class public final Lb8/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly7/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ly7/h<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lb8/o;

.field public final b:Ljava/lang/String;

.field public final c:Ly7/c;

.field public final d:Ly7/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly7/g<",
            "TT;[B>;"
        }
    .end annotation
.end field

.field public final e:Lb8/s;


# direct methods
.method public constructor <init>(Lb8/o;Ljava/lang/String;Ly7/c;Ly7/g;Lb8/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb8/o;",
            "Ljava/lang/String;",
            "Ly7/c;",
            "Ly7/g<",
            "TT;[B>;",
            "Lb8/s;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb8/r;->a:Lb8/o;

    iput-object p2, p0, Lb8/r;->b:Ljava/lang/String;

    iput-object p3, p0, Lb8/r;->c:Ly7/c;

    iput-object p4, p0, Lb8/r;->d:Ly7/g;

    iput-object p5, p0, Lb8/r;->e:Lb8/s;

    return-void
.end method

.method public static synthetic b(Ljava/lang/Exception;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public a(Ly7/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly7/d<",
            "TT;>;)V"
        }
    .end annotation

    new-instance v0, Lb8/q;

    invoke-direct {v0}, Lb8/q;-><init>()V

    invoke-virtual {p0, p1, v0}, Lb8/r;->c(Ly7/d;Ly7/j;)V

    return-void
.end method

.method public c(Ly7/d;Ly7/j;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly7/d<",
            "TT;>;",
            "Ly7/j;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lb8/r;->e:Lb8/s;

    invoke-static {}, Lb8/n;->a()Lb8/n$a;

    move-result-object v1

    iget-object v2, p0, Lb8/r;->a:Lb8/o;

    invoke-virtual {v1, v2}, Lb8/n$a;->e(Lb8/o;)Lb8/n$a;

    move-result-object v1

    invoke-virtual {v1, p1}, Lb8/n$a;->c(Ly7/d;)Lb8/n$a;

    move-result-object p1

    iget-object v1, p0, Lb8/r;->b:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lb8/n$a;->f(Ljava/lang/String;)Lb8/n$a;

    move-result-object p1

    iget-object v1, p0, Lb8/r;->d:Ly7/g;

    invoke-virtual {p1, v1}, Lb8/n$a;->d(Ly7/g;)Lb8/n$a;

    move-result-object p1

    iget-object v1, p0, Lb8/r;->c:Ly7/c;

    invoke-virtual {p1, v1}, Lb8/n$a;->b(Ly7/c;)Lb8/n$a;

    move-result-object p1

    invoke-virtual {p1}, Lb8/n$a;->a()Lb8/n;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lb8/s;->a(Lb8/n;Ly7/j;)V

    return-void
.end method
