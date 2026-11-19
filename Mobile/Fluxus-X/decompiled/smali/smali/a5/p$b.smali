.class public final La5/p$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly4/f0;
.implements La5/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La5/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ly4/f0<",
        "TT;>;",
        "La5/q;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J2\u0010\u000c\u001a\u00028\u0001\"\u0004\u0008\u0001\u0010\u00062\u0006\u0010\u0008\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\tH\u0096@\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "La5/p$b;",
        "T",
        "Ly4/f0;",
        "La5/q;",
        "<init>",
        "(La5/p;)V",
        "R",
        "",
        "sql",
        "Lkotlin/Function1;",
        "Lg5/d;",
        "block",
        "a",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;",
        "Lg5/b;",
        "d",
        "()Lg5/b;",
        "rawConnection",
        "room-runtime"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:La5/p;


# direct methods
.method public constructor <init>(La5/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, La5/p$b;->a:La5/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lg5/d;",
            "+TR;>;",
            "Leu/b<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, La5/p$b;->a:La5/p;

    invoke-virtual {v0, p1, p2, p3}, La5/p;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d()Lg5/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, La5/p$b;->a:La5/p;

    invoke-virtual {v0}, La5/p;->d()Lg5/b;

    move-result-object v0

    return-object v0
.end method
