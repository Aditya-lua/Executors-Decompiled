.class public Lel/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsw/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lel/c;->a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lsw/y;)Lsw/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsw/e<",
        "Ljava/lang/Object;",
        "Lsw/d<",
        "*>;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/reflect/Type;

.field public final synthetic b:Lel/c;


# direct methods
.method public constructor <init>(Lel/c;Ljava/lang/reflect/Type;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lel/c$a;->b:Lel/c;

    iput-object p2, p0, Lel/c$a;->a:Ljava/lang/reflect/Type;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, Lel/c$a;->a:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public bridge synthetic b(Lsw/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lel/c$a;->c(Lsw/d;)Lsw/d;

    move-result-object p1

    return-object p1
.end method

.method public c(Lsw/d;)Lsw/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw/d<",
            "Ljava/lang/Object;",
            ">;)",
            "Lsw/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Lel/b;

    iget-object v1, p0, Lel/c$a;->b:Lel/c;

    invoke-static {v1}, Lel/c;->d(Lel/c;)Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lel/b;-><init>(Ljava/util/concurrent/Executor;Lsw/d;)V

    return-object v0
.end method
