.class public final Lsw/g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsw/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsw/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsw/g$c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lsw/e<",
        "TR;",
        "Ljava/util/concurrent/CompletableFuture<",
        "Lsw/x<",
        "TR;>;>;>;"
    }
.end annotation

.annotation build Lorg/codehaus/mojo/animal_sniffer/IgnoreJRERequirement;
.end annotation


# instance fields
.field public final a:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Type;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsw/g$c;->a:Ljava/lang/reflect/Type;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, Lsw/g$c;->a:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public bridge synthetic b(Lsw/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lsw/g$c;->c(Lsw/d;)Ljava/util/concurrent/CompletableFuture;

    move-result-object p1

    return-object p1
.end method

.method public c(Lsw/d;)Ljava/util/concurrent/CompletableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw/d<",
            "TR;>;)",
            "Ljava/util/concurrent/CompletableFuture<",
            "Lsw/x<",
            "TR;>;>;"
        }
    .end annotation

    new-instance v0, Lsw/g$b;

    invoke-direct {v0, p1}, Lsw/g$b;-><init>(Lsw/d;)V

    new-instance v1, Lsw/g$c$a;

    invoke-direct {v1, p0, v0}, Lsw/g$c$a;-><init>(Lsw/g$c;Ljava/util/concurrent/CompletableFuture;)V

    invoke-interface {p1, v1}, Lsw/d;->L(Lsw/f;)V

    return-object v0
.end method
