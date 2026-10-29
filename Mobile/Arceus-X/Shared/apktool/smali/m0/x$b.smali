.class public Lm0/x$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm0/x;->l(Lm0/v0;)V
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
.field public final synthetic a:Lm0/v0;

.field public final synthetic b:Lm0/x;


# direct methods
.method public constructor <init>(Lm0/x;Lm0/v0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lm0/x$b;->b:Lm0/x;

    iput-object p2, p0, Lm0/x$b;->a:Lm0/v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-object p1, p0, Lm0/x$b;->a:Lm0/v0;

    iget-object v0, p0, Lm0/x$b;->b:Lm0/x;

    iget-object v0, v0, Lm0/x;->a:Lm0/v0;

    if-ne p1, v0, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "request aborted, id="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lm0/x$b;->b:Lm0/x;

    iget-object v0, v0, Lm0/x;->a:Lm0/v0;

    invoke-virtual {v0}, Lm0/v0;->e()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "CaptureNode"

    invoke-static {v0, p1}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lm0/x$b;->b:Lm0/x;

    invoke-static {p1}, Lm0/x;->g(Lm0/x;)Lm0/j0;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lm0/x$b;->b:Lm0/x;

    invoke-static {p1}, Lm0/x;->g(Lm0/x;)Lm0/j0;

    move-result-object p1

    invoke-virtual {p1}, Lm0/j0;->i()V

    :cond_0
    iget-object p1, p0, Lm0/x$b;->b:Lm0/x;

    const/4 v0, 0x0

    iput-object v0, p1, Lm0/x;->a:Lm0/v0;

    :cond_1
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lm0/x$b;->a(Ljava/lang/Void;)V

    return-void
.end method
