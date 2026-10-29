.class public final synthetic Ln0/v1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Lne/x;

.field public final synthetic b:Ljava/util/concurrent/Executor;

.field public final synthetic c:Z

.field public final synthetic d:Ljava/util/Collection;


# direct methods
.method public synthetic constructor <init>(Lne/x;Ljava/util/concurrent/Executor;ZLjava/util/Collection;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/v1;->a:Lne/x;

    iput-object p2, p0, Ln0/v1;->b:Ljava/util/concurrent/Executor;

    iput-boolean p3, p0, Ln0/v1;->c:Z

    iput-object p4, p0, Ln0/v1;->d:Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ln0/v1;->a:Lne/x;

    iget-object v1, p0, Ln0/v1;->b:Ljava/util/concurrent/Executor;

    iget-boolean v2, p0, Ln0/v1;->c:Z

    iget-object v3, p0, Ln0/v1;->d:Ljava/util/Collection;

    invoke-static {v0, v1, v2, v3, p1}, Ln0/x1;->a(Lne/x;Ljava/util/concurrent/Executor;ZLjava/util/Collection;Ly1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
