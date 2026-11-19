.class public Lel/b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lel/b$a;->b(Lsw/d;Lsw/x;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lsw/x;

.field public final synthetic b:Lel/b$a;


# direct methods
.method public constructor <init>(Lel/b$a;Lsw/x;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lel/b$a$a;->b:Lel/b$a;

    iput-object p2, p0, Lel/b$a$a;->a:Lsw/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lel/b$a$a;->b:Lel/b$a;

    iget-object v0, v0, Lel/b$a;->c:Lel/b;

    iget-object v0, v0, Lel/b;->b:Lsw/d;

    invoke-interface {v0}, Lsw/d;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lel/b$a$a;->b:Lel/b$a;

    invoke-static {v0}, Lel/b$a;->c(Lel/b$a;)Lsw/f;

    move-result-object v0

    iget-object v1, p0, Lel/b$a$a;->b:Lel/b$a;

    iget-object v1, v1, Lel/b$a;->c:Lel/b;

    new-instance v2, Ljava/io/IOException;

    const-string v3, "Canceled"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1, v2}, Lsw/f;->a(Lsw/d;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lel/b$a$a;->b:Lel/b$a;

    invoke-static {v0}, Lel/b$a;->c(Lel/b$a;)Lsw/f;

    move-result-object v0

    iget-object v1, p0, Lel/b$a$a;->b:Lel/b$a;

    iget-object v1, v1, Lel/b$a;->c:Lel/b;

    iget-object v2, p0, Lel/b$a$a;->a:Lsw/x;

    invoke-interface {v0, v1, v2}, Lsw/f;->b(Lsw/d;Lsw/x;)V

    return-void
.end method
