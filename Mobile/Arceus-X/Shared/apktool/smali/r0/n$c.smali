.class public Lr0/n$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr0/n;->v(ZLne/x;Lt/a;Ly1/c$a;Ljava/util/concurrent/Executor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lr0/c<",
        "TI;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ly1/c$a;

.field public final synthetic b:Lt/a;


# direct methods
.method public constructor <init>(Ly1/c$a;Lt/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lr0/n$c;->a:Ly1/c$a;

    iput-object p2, p0, Lr0/n$c;->b:Lt/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lr0/n$c;->a:Ly1/c$a;

    invoke-virtual {v0, p1}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TI;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lr0/n$c;->a:Ly1/c$a;

    iget-object v1, p0, Lr0/n$c;->b:Lt/a;

    invoke-interface {v1, p1}, Lt/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ly1/c$a;->c(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lr0/n$c;->a:Ly1/c$a;

    invoke-virtual {v0, p1}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    return-void
.end method
