.class public final Lau/d$e;
.super Lau/d$d;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lqu/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lau/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lau/d$d<",
        "TK;TV;>;",
        "Ljava/util/Iterator<",
        "TK;>;",
        "Lqu/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000*\u0004\u0008\u0002\u0010\u0001*\u0004\u0008\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u0008\u0012\u0004\u0012\u00028\u00020\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\t\u001a\u00028\u0002H\u0096\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lau/d$e;",
        "K",
        "V",
        "Lau/d$d;",
        "",
        "Lau/d;",
        "map",
        "<init>",
        "(Lau/d;)V",
        "next",
        "()Ljava/lang/Object;",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Lau/d;)V
    .locals 1
    .param p1    # Lau/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lau/d<",
            "TK;TV;>;)V"
        }
    .end annotation

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lau/d$d;-><init>(Lau/d;)V

    return-void
.end method


# virtual methods
.method public next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    invoke-virtual {p0}, Lau/d$d;->b()V

    invoke-virtual {p0}, Lau/d$d;->d()I

    move-result v0

    invoke-virtual {p0}, Lau/d$d;->f()Lau/d;

    move-result-object v1

    invoke-static {v1}, Lau/d;->d(Lau/d;)I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p0}, Lau/d$d;->d()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p0, v1}, Lau/d$d;->h(I)V

    invoke-virtual {p0, v0}, Lau/d$d;->i(I)V

    invoke-virtual {p0}, Lau/d$d;->f()Lau/d;

    move-result-object v0

    invoke-static {v0}, Lau/d;->c(Lau/d;)[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Lau/d$d;->e()I

    move-result v1

    aget-object v0, v0, v1

    invoke-virtual {p0}, Lau/d$d;->g()V

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
