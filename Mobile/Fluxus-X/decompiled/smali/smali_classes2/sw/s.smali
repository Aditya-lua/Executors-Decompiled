.class public abstract Lsw/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsw/s$q;,
        Lsw/s$c;,
        Lsw/s$j;,
        Lsw/s$o;,
        Lsw/s$i;,
        Lsw/s$e;,
        Lsw/s$d;,
        Lsw/s$h;,
        Lsw/s$g;,
        Lsw/s$m;,
        Lsw/s$n;,
        Lsw/s$l;,
        Lsw/s$k;,
        Lsw/s$f;,
        Lsw/s$p;
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
.method public abstract a(Lsw/v;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw/v;",
            "TT;)V"
        }
    .end annotation
.end method

.method public final b()Lsw/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lsw/s<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Lsw/s$b;

    invoke-direct {v0, p0}, Lsw/s$b;-><init>(Lsw/s;)V

    return-object v0
.end method

.method public final c()Lsw/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lsw/s<",
            "Ljava/lang/Iterable<",
            "TT;>;>;"
        }
    .end annotation

    new-instance v0, Lsw/s$a;

    invoke-direct {v0, p0}, Lsw/s$a;-><init>(Lsw/s;)V

    return-object v0
.end method
