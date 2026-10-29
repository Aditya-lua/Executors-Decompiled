.class public final Ln0/i3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln0/i3$a;
    }
.end annotation


# static fields
.field public static final b:Ln0/h3;

.field public static final c:Ln0/i3;


# instance fields
.field public final a:Ln0/y2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/y2<",
            "Ln0/h3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Ln0/h3;->b()Ln0/h3;

    move-result-object v0

    sput-object v0, Ln0/i3;->b:Ln0/h3;

    new-instance v0, Ln0/i3;

    invoke-direct {v0}, Ln0/i3;-><init>()V

    sput-object v0, Ln0/i3;->c:Ln0/i3;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ln0/i3;->b:Ln0/h3;

    invoke-static {v0}, Ln0/y2;->l(Ljava/lang/Object;)Ln0/y2;

    move-result-object v0

    iput-object v0, p0, Ln0/i3;->a:Ln0/y2;

    return-void
.end method

.method public static b()Ln0/i3;
    .locals 1

    sget-object v0, Ln0/i3;->c:Ln0/i3;

    return-object v0
.end method


# virtual methods
.method public a()Ln0/h3;
    .locals 3

    :try_start_0
    iget-object v0, p0, Ln0/i3;->a:Ln0/y2;

    invoke-virtual {v0}, Ln0/s3;->b()Lne/x;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/h3;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    new-instance v1, Ljava/lang/AssertionError;

    const-string v2, "Unexpected error in QuirkSettings StateObservable"

    invoke-direct {v1, v2, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public c(Ljava/util/concurrent/Executor;Lx2/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lx2/a<",
            "Ln0/h3;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ln0/i3;->a:Ln0/y2;

    new-instance v1, Ln0/i3$a;

    invoke-direct {v1, p2}, Ln0/i3$a;-><init>(Lx2/a;)V

    invoke-virtual {v0, p1, v1}, Ln0/s3;->c(Ljava/util/concurrent/Executor;Ln0/a3$a;)V

    return-void
.end method

.method public d(Ln0/h3;)V
    .locals 1

    iget-object v0, p0, Ln0/i3;->a:Ln0/y2;

    invoke-virtual {v0, p1}, Ln0/y2;->k(Ljava/lang/Object;)V

    return-void
.end method
