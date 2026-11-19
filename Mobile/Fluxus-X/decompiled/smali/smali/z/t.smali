.class public final synthetic Lz/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz/y;

.field public final synthetic b:Ljava/util/concurrent/Executor;

.field public final synthetic c:Ln0/u;


# direct methods
.method public synthetic constructor <init>(Lz/y;Ljava/util/concurrent/Executor;Ln0/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/t;->a:Lz/y;

    iput-object p2, p0, Lz/t;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lz/t;->c:Ln0/u;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lz/t;->a:Lz/y;

    iget-object v1, p0, Lz/t;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lz/t;->c:Ln0/u;

    invoke-static {v0, v1, v2}, Lz/y;->y(Lz/y;Ljava/util/concurrent/Executor;Ln0/u;)V

    return-void
.end method
