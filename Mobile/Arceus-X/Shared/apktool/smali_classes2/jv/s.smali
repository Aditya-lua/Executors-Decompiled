.class public abstract Ljv/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljv/s$q;,
        Ljv/s$c;,
        Ljv/s$j;,
        Ljv/s$o;,
        Ljv/s$i;,
        Ljv/s$e;,
        Ljv/s$d;,
        Ljv/s$h;,
        Ljv/s$g;,
        Ljv/s$m;,
        Ljv/s$n;,
        Ljv/s$l;,
        Ljv/s$k;,
        Ljv/s$f;,
        Ljv/s$p;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Ljv/v;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv/v;",
            "TT;)V"
        }
    .end annotation
.end method

.method public final b()Ljv/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljv/s<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljv/s$b;

    invoke-direct {v0, p0}, Ljv/s$b;-><init>(Ljv/s;)V

    return-object v0
.end method

.method public final c()Ljv/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljv/s<",
            "Ljava/lang/Iterable<",
            "TT;>;>;"
        }
    .end annotation

    new-instance v0, Ljv/s$a;

    invoke-direct {v0, p0}, Ljv/s$a;-><init>(Ljv/s;)V

    return-object v0
.end method
