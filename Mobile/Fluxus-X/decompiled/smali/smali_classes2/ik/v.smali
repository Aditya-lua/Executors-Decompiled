.class public final synthetic Lik/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lik/x;

.field public final synthetic b:Ljava/lang/Runnable;

.field public final synthetic c:Ljava/util/concurrent/Executor;


# direct methods
.method public synthetic constructor <init>(Lik/x;Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lik/v;->a:Lik/x;

    iput-object p2, p0, Lik/v;->b:Ljava/lang/Runnable;

    iput-object p3, p0, Lik/v;->c:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lik/v;->a:Lik/x;

    iget-object v1, p0, Lik/v;->b:Ljava/lang/Runnable;

    iget-object v2, p0, Lik/v;->c:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lik/x;->b(Lik/x;Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method
