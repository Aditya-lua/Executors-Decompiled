.class public final synthetic Lx5/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/Executor;

.field public final synthetic b:Lx5/l0;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:Landroidx/lifecycle/d0;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Lx5/l0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/lifecycle/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx5/c0;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lx5/c0;->b:Lx5/l0;

    iput-object p3, p0, Lx5/c0;->c:Ljava/lang/String;

    iput-object p4, p0, Lx5/c0;->d:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lx5/c0;->e:Landroidx/lifecycle/d0;

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lx5/c0;->a:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lx5/c0;->b:Lx5/l0;

    iget-object v2, p0, Lx5/c0;->c:Ljava/lang/String;

    iget-object v3, p0, Lx5/c0;->d:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Lx5/c0;->e:Landroidx/lifecycle/d0;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lx5/e0;->a(Ljava/util/concurrent/Executor;Lx5/l0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/lifecycle/d0;Ly1/c$a;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
