.class public Lm0/f1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm0/f1;->k(Lm0/n;)Lne/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lr0/c<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lm0/n;

.field public final synthetic b:Lm0/f1;


# direct methods
.method public constructor <init>(Lm0/f1;Lm0/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lm0/f1$a;->b:Lm0/f1;

    iput-object p2, p0, Lm0/f1$a;->a:Lm0/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)V
    .locals 0

    iget-object p1, p0, Lm0/f1$a;->b:Lm0/f1;

    iget-object p1, p1, Lm0/f1;->b:Lm0/c0;

    invoke-interface {p1}, Lm0/c0;->c()V

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 5

    iget-object v0, p0, Lm0/f1$a;->a:Lm0/n;

    invoke-virtual {v0}, Lm0/n;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lm0/f1$a;->a:Lm0/n;

    invoke-virtual {v0}, Lm0/n;->a()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/l1;

    invoke-virtual {v0}, Ln0/l1;->f()I

    move-result v0

    instance-of v1, p1, Lg0/h1;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lm0/f1$a;->b:Lm0/f1;

    iget-object v1, v1, Lm0/f1;->c:Lm0/d0;

    check-cast p1, Lg0/h1;

    invoke-static {v0, p1}, Lm0/b1$a;->c(ILg0/h1;)Lm0/b1$a;

    move-result-object p1

    invoke-virtual {v1, p1}, Lm0/d0;->j(Lm0/b1$a;)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lm0/f1$a;->b:Lm0/f1;

    iget-object v1, v1, Lm0/f1;->c:Lm0/d0;

    new-instance v2, Lg0/h1;

    const/4 v3, 0x2

    const-string v4, "Failed to submit capture request"

    invoke-direct {v2, v3, v4, p1}, Lg0/h1;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0, v2}, Lm0/b1$a;->c(ILg0/h1;)Lm0/b1$a;

    move-result-object p1

    invoke-virtual {v1, p1}, Lm0/d0;->j(Lm0/b1$a;)V

    :goto_0
    iget-object p1, p0, Lm0/f1$a;->b:Lm0/f1;

    iget-object p1, p1, Lm0/f1;->b:Lm0/c0;

    invoke-interface {p1}, Lm0/c0;->c()V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lm0/f1$a;->a(Ljava/lang/Void;)V

    return-void
.end method
