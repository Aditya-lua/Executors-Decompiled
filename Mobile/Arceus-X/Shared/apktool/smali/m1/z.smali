.class public final synthetic Lm1/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/Executor;

.field public final synthetic b:Lm1/i0$g;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Lm1/i0$g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/z;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lm1/z;->b:Lm1/i0$g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lm1/z;->a:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lm1/z;->b:Lm1/i0$g;

    invoke-static {v0, v1}, Lm1/i0;->n(Ljava/util/concurrent/Executor;Lm1/i0$g;)V

    return-void
.end method
