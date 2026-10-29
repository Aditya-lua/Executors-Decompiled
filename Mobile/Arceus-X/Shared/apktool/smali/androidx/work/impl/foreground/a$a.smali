.class public Landroidx/work/impl/foreground/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/impl/foreground/a;->j(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Landroidx/work/impl/foreground/a;


# direct methods
.method public constructor <init>(Landroidx/work/impl/foreground/a;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/work/impl/foreground/a$a;->b:Landroidx/work/impl/foreground/a;

    iput-object p2, p0, Landroidx/work/impl/foreground/a$a;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Landroidx/work/impl/foreground/a$a;->b:Landroidx/work/impl/foreground/a;

    invoke-static {v0}, Landroidx/work/impl/foreground/a;->a(Landroidx/work/impl/foreground/a;)Ly5/f1;

    move-result-object v0

    invoke-virtual {v0}, Ly5/f1;->r()Ly5/s;

    move-result-object v0

    iget-object v1, p0, Landroidx/work/impl/foreground/a$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ly5/s;->g(Ljava/lang/String;)Lf6/j0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf6/j0;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroidx/work/impl/foreground/a$a;->b:Landroidx/work/impl/foreground/a;

    iget-object v1, v1, Landroidx/work/impl/foreground/a;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Landroidx/work/impl/foreground/a$a;->b:Landroidx/work/impl/foreground/a;

    iget-object v2, v2, Landroidx/work/impl/foreground/a;->g:Ljava/util/Map;

    invoke-static {v0}, Lf6/o1;->a(Lf6/j0;)Lf6/w;

    move-result-object v3

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Landroidx/work/impl/foreground/a$a;->b:Landroidx/work/impl/foreground/a;

    iget-object v3, v2, Landroidx/work/impl/foreground/a;->i:Lb6/l;

    invoke-static {v2}, Landroidx/work/impl/foreground/a;->b(Landroidx/work/impl/foreground/a;)Lh6/b;

    move-result-object v2

    invoke-interface {v2}, Lh6/b;->b()Lku/l0;

    move-result-object v2

    iget-object v4, p0, Landroidx/work/impl/foreground/a$a;->b:Landroidx/work/impl/foreground/a;

    invoke-static {v3, v0, v2, v4}, Lb6/m;->e(Lb6/l;Lf6/j0;Lku/l0;Lb6/i;)Lku/d2;

    move-result-object v2

    iget-object v3, p0, Landroidx/work/impl/foreground/a$a;->b:Landroidx/work/impl/foreground/a;

    iget-object v3, v3, Landroidx/work/impl/foreground/a;->h:Ljava/util/Map;

    invoke-static {v0}, Lf6/o1;->a(Lf6/j0;)Lf6/w;

    move-result-object v0

    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    return-void
.end method
