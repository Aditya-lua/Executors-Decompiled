.class public Ljv/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljv/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljv/i;->a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljv/y;)Ljv/e;
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

.field public final synthetic b:Ljava/util/concurrent/Executor;

.field public final synthetic c:Ljv/i;


# direct methods
.method public constructor <init>(Ljv/i;Ljava/lang/reflect/Type;Ljava/util/concurrent/Executor;)V
    .locals 0

    iput-object p1, p0, Ljv/i$a;->c:Ljv/i;

    iput-object p2, p0, Ljv/i$a;->a:Ljava/lang/reflect/Type;

    iput-object p3, p0, Ljv/i$a;->b:Ljava/util/concurrent/Executor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, Ljv/i$a;->a:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public bridge synthetic b(Ljv/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ljv/i$a;->c(Ljv/d;)Ljv/d;

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

    iget-object v0, p0, Ljv/i$a;->b:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    new-instance v1, Ljv/i$b;

    invoke-direct {v1, v0, p1}, Ljv/i$b;-><init>(Ljava/util/concurrent/Executor;Ljv/d;)V

    return-object v1
.end method
