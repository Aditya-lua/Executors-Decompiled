.class public final Lpe/s$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpe/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Z

.field public final b:Lke/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lke/t<",
            "Lpe/x<",
            "+TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLke/t;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lke/t<",
            "Lpe/x<",
            "+TV;>;>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lpe/s$b;->a:Z

    .line 4
    iput-object p2, p0, Lpe/s$b;->b:Lke/t;

    return-void
.end method

.method public synthetic constructor <init>(ZLke/t;Lpe/r;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lpe/s$b;-><init>(ZLke/t;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lpe/x;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TC;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lpe/x<",
            "TC;>;"
        }
    .end annotation

    new-instance v0, Lpe/k;

    iget-object v1, p0, Lpe/s$b;->b:Lke/t;

    iget-boolean v2, p0, Lpe/s$b;->a:Z

    invoke-direct {v0, v1, v2, p2, p1}, Lpe/k;-><init>(Lke/r;ZLjava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)V

    return-object v0
.end method
