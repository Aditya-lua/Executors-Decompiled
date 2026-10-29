.class public final synthetic Lm1/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm1/i0$g;

.field public final synthetic b:Ljava/util/concurrent/Executor;

.field public final synthetic c:Lm1/m;


# direct methods
.method public synthetic constructor <init>(Lm1/i0$g;Ljava/util/concurrent/Executor;Lm1/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/b1;->a:Lm1/i0$g;

    iput-object p2, p0, Lm1/b1;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lm1/b1;->c:Lm1/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lm1/b1;->a:Lm1/i0$g;

    iget-object v1, p0, Lm1/b1;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lm1/b1;->c:Lm1/m;

    invoke-static {v0, v1, v2}, Lm1/i0$g;->b(Lm1/i0$g;Ljava/util/concurrent/Executor;Lm1/m;)V

    return-void
.end method
