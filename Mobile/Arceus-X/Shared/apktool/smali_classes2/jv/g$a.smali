.class public final Ljv/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljv/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljv/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljv/g$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljv/e<",
        "TR;",
        "Ljava/util/concurrent/CompletableFuture<",
        "TR;>;>;"
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

    iput-object p1, p0, Ljv/g$a;->a:Ljava/lang/reflect/Type;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, Ljv/g$a;->a:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public bridge synthetic b(Ljv/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ljv/g$a;->c(Ljv/d;)Ljava/util/concurrent/CompletableFuture;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljv/d;)Ljava/util/concurrent/CompletableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv/d<",
            "TR;>;)",
            "Ljava/util/concurrent/CompletableFuture<",
            "TR;>;"
        }
    .end annotation

    new-instance v0, Ljv/g$b;

    invoke-direct {v0, p1}, Ljv/g$b;-><init>(Ljv/d;)V

    new-instance v1, Ljv/g$a$a;

    invoke-direct {v1, p0, v0}, Ljv/g$a$a;-><init>(Ljv/g$a;Ljava/util/concurrent/CompletableFuture;)V

    invoke-interface {p1, v1}, Ljv/d;->B(Ljv/f;)V

    return-object v0
.end method
