.class public final synthetic Li1/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Li1/c0;

.field public final synthetic b:Li1/p$a;

.field public final synthetic c:Ljava/util/concurrent/Executor;


# direct methods
.method public synthetic constructor <init>(Li1/c0;Li1/p$a;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/x;->a:Li1/c0;

    iput-object p2, p0, Li1/x;->b:Li1/p$a;

    iput-object p3, p0, Li1/x;->c:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Li1/x;->a:Li1/c0;

    iget-object v1, p0, Li1/x;->b:Li1/p$a;

    iget-object v2, p0, Li1/x;->c:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Li1/c0;->g(Li1/c0;Li1/p$a;Ljava/util/concurrent/Executor;)V

    return-void
.end method
