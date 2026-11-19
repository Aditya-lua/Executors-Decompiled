.class public final synthetic Lm1/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm1/i0$e;

.field public final synthetic b:Ln0/a3$a;

.field public final synthetic c:Ljava/util/concurrent/Executor;


# direct methods
.method public synthetic constructor <init>(Lm1/i0$e;Ln0/a3$a;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/l0;->a:Lm1/i0$e;

    iput-object p2, p0, Lm1/l0;->b:Ln0/a3$a;

    iput-object p3, p0, Lm1/l0;->c:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lm1/l0;->a:Lm1/i0$e;

    iget-object v1, p0, Lm1/l0;->b:Ln0/a3$a;

    iget-object v2, p0, Lm1/l0;->c:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lm1/i0$e;->i(Lm1/i0$e;Ln0/a3$a;Ljava/util/concurrent/Executor;)V

    return-void
.end method
