.class public Ld3/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Ld3/a;


# direct methods
.method public constructor <init>(Ld3/a;)V
    .locals 0

    iput-object p1, p0, Ld3/a$b;->a:Ld3/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Ld3/a$b;->a:Ld3/a;

    iget-boolean v1, v0, Ld3/a;->o:Z

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-boolean v1, v0, Ld3/a;->m:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iput-boolean v2, v0, Ld3/a;->m:Z

    iget-object v0, v0, Ld3/a;->a:Ld3/a$a;

    invoke-virtual {v0}, Ld3/a$a;->m()V

    :cond_1
    iget-object v0, p0, Ld3/a$b;->a:Ld3/a;

    iget-object v0, v0, Ld3/a;->a:Ld3/a$a;

    invoke-virtual {v0}, Ld3/a$a;->h()Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Ld3/a$b;->a:Ld3/a;

    invoke-virtual {v1}, Ld3/a;->u()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, p0, Ld3/a$b;->a:Ld3/a;

    iget-boolean v3, v1, Ld3/a;->n:Z

    if-eqz v3, :cond_3

    iput-boolean v2, v1, Ld3/a;->n:Z

    invoke-virtual {v1}, Ld3/a;->c()V

    :cond_3
    invoke-virtual {v0}, Ld3/a$a;->a()V

    invoke-virtual {v0}, Ld3/a$a;->b()I

    move-result v1

    invoke-virtual {v0}, Ld3/a$a;->c()I

    move-result v0

    iget-object v2, p0, Ld3/a$b;->a:Ld3/a;

    invoke-virtual {v2, v1, v0}, Ld3/a;->j(II)V

    iget-object v0, p0, Ld3/a$b;->a:Ld3/a;

    iget-object v0, v0, Ld3/a;->c:Landroid/view/View;

    invoke-static {v0, p0}, Landroidx/core/view/o0;->e0(Landroid/view/View;Ljava/lang/Runnable;)V

    return-void

    :cond_4
    :goto_0
    iget-object v0, p0, Ld3/a$b;->a:Ld3/a;

    iput-boolean v2, v0, Ld3/a;->o:Z

    return-void
.end method
