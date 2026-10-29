.class public final synthetic Lx5/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx5/l0;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;

.field public final synthetic d:Landroidx/lifecycle/d0;

.field public final synthetic e:Ly1/c$a;


# direct methods
.method public synthetic constructor <init>(Lx5/l0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/lifecycle/d0;Ly1/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx5/d0;->a:Lx5/l0;

    iput-object p2, p0, Lx5/d0;->b:Ljava/lang/String;

    iput-object p3, p0, Lx5/d0;->c:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lx5/d0;->d:Landroidx/lifecycle/d0;

    iput-object p5, p0, Lx5/d0;->e:Ly1/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lx5/d0;->a:Lx5/l0;

    iget-object v1, p0, Lx5/d0;->b:Ljava/lang/String;

    iget-object v2, p0, Lx5/d0;->c:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lx5/d0;->d:Landroidx/lifecycle/d0;

    iget-object v4, p0, Lx5/d0;->e:Ly1/c$a;

    invoke-static {v0, v1, v2, v3, v4}, Lx5/e0;->b(Lx5/l0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/lifecycle/d0;Ly1/c$a;)V

    return-void
.end method
