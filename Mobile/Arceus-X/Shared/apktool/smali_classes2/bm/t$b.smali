.class public Lbm/t$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbm/t;->c(Landroid/app/Activity;Le3/b;Lbm/t$d;Le3/o;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le3/p<",
        "Le3/c;",
        "Lf3/f;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lbm/t$d;

.field public final synthetic b:Lbm/t;


# direct methods
.method public constructor <init>(Lbm/t;Lbm/t$d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lbm/t$b;->b:Lbm/t;

    iput-object p2, p0, Lbm/t$b;->a:Lbm/t$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lf3/f;

    invoke-virtual {p0, p1}, Lbm/t$b;->b(Lf3/f;)V

    return-void
.end method

.method public b(Lf3/f;)V
    .locals 4
    .param p1    # Lf3/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {}, Lbm/t;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Error registering credentials "

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    instance-of v0, p1, Lh3/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lh3/a;

    invoke-virtual {v0}, Lh3/a;->b()Lg3/e;

    move-result-object v0

    instance-of v0, v0, Lg3/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbm/t$b;->a:Lbm/t$d;

    const/16 v1, 0xb

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lbm/t$d;->b(ILjava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lbm/t$b;->a:Lbm/t$d;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lbm/t$d;->b(ILjava/lang/String;)V

    return-void

    :cond_1
    instance-of v0, p1, Lf3/d;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lbm/t$b;->a:Lbm/t$d;

    const/4 v1, 0x1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lbm/t$d;->b(ILjava/lang/String;)V

    return-void

    :cond_2
    instance-of v0, p1, Lf3/g;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lbm/t$b;->a:Lbm/t$d;

    const/4 v1, 0x2

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lbm/t$d;->b(ILjava/lang/String;)V

    return-void

    :cond_3
    invoke-static {}, Lbm/t;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected exception type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lbm/t$b;->a:Lbm/t$d;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lbm/t$d;->b(ILjava/lang/String;)V

    return-void
.end method

.method public c(Le3/c;)V
    .locals 2

    instance-of v0, p1, Le3/j;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbm/t$b;->a:Lbm/t$d;

    check-cast p1, Le3/j;

    invoke-virtual {p1}, Le3/j;->a()Ljava/lang/String;

    move-result-object p1

    const-string v1, "FIDO2"

    invoke-interface {v0, p1, v1}, Lbm/t$d;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    instance-of p1, p1, Le3/h;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lbm/t$b;->a:Lbm/t$d;

    const-string v0, ""

    const-string v1, "password"

    invoke-interface {p1, v0, v1}, Lbm/t$d;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object p1, p0, Lbm/t$b;->a:Lbm/t$d;

    const/4 v0, 0x0

    const-string v1, "Unexpected CreateCredentialResponse"

    invoke-interface {p1, v0, v1}, Lbm/t$d;->b(ILjava/lang/String;)V

    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Le3/c;

    invoke-virtual {p0, p1}, Lbm/t$b;->c(Le3/c;)V

    return-void
.end method
