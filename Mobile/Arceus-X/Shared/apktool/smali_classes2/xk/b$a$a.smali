.class public Lxk/b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxk/b$a;->a(Ljv/d;Ljv/x;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljv/x;

.field public final synthetic b:Lxk/b$a;


# direct methods
.method public constructor <init>(Lxk/b$a;Ljv/x;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lxk/b$a$a;->b:Lxk/b$a;

    iput-object p2, p0, Lxk/b$a$a;->a:Ljv/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lxk/b$a$a;->b:Lxk/b$a;

    iget-object v0, v0, Lxk/b$a;->c:Lxk/b;

    iget-object v0, v0, Lxk/b;->b:Ljv/d;

    invoke-interface {v0}, Ljv/d;->isCanceled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxk/b$a$a;->b:Lxk/b$a;

    invoke-static {v0}, Lxk/b$a;->c(Lxk/b$a;)Ljv/f;

    move-result-object v0

    iget-object v1, p0, Lxk/b$a$a;->b:Lxk/b$a;

    iget-object v1, v1, Lxk/b$a;->c:Lxk/b;

    new-instance v2, Ljava/io/IOException;

    const-string v3, "Canceled"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1, v2}, Ljv/f;->b(Ljv/d;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lxk/b$a$a;->b:Lxk/b$a;

    invoke-static {v0}, Lxk/b$a;->c(Lxk/b$a;)Ljv/f;

    move-result-object v0

    iget-object v1, p0, Lxk/b$a$a;->b:Lxk/b$a;

    iget-object v1, v1, Lxk/b$a;->c:Lxk/b;

    iget-object v2, p0, Lxk/b$a$a;->a:Ljv/x;

    invoke-interface {v0, v1, v2}, Ljv/f;->a(Ljv/d;Ljv/x;)V

    return-void
.end method
