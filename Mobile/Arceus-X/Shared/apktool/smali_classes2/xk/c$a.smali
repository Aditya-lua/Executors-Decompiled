.class public Lxk/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljv/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxk/c;->a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljv/y;)Ljv/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljv/e<",
        "Ljava/lang/Object;",
        "Ljv/d<",
        "*>;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/reflect/Type;

.field public final synthetic b:Lxk/c;


# direct methods
.method public constructor <init>(Lxk/c;Ljava/lang/reflect/Type;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lxk/c$a;->b:Lxk/c;

    iput-object p2, p0, Lxk/c$a;->a:Ljava/lang/reflect/Type;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, Lxk/c$a;->a:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public bridge synthetic b(Ljv/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lxk/c$a;->c(Ljv/d;)Ljv/d;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljv/d;)Ljv/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv/d<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljv/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Lxk/b;

    iget-object v1, p0, Lxk/c$a;->b:Lxk/c;

    invoke-static {v1}, Lxk/c;->d(Lxk/c;)Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lxk/b;-><init>(Ljava/util/concurrent/Executor;Ljv/d;)V

    return-object v0
.end method
