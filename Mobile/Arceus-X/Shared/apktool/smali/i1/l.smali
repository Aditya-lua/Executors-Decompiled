.class public final synthetic Li1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Li1/n;

.field public final synthetic b:Ljava/util/concurrent/Executor;

.field public final synthetic c:Li1/n$c;


# direct methods
.method public synthetic constructor <init>(Li1/n;Ljava/util/concurrent/Executor;Li1/n$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/l;->a:Li1/n;

    iput-object p2, p0, Li1/l;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Li1/l;->c:Li1/n$c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Li1/l;->a:Li1/n;

    iget-object v1, p0, Li1/l;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Li1/l;->c:Li1/n$c;

    invoke-static {v0, v1, v2}, Li1/n;->b(Li1/n;Ljava/util/concurrent/Executor;Li1/n$c;)V

    return-void
.end method
