.class public Lg0/v2$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg0/v2;->w(Landroid/view/Surface;Ljava/util/concurrent/Executor;Lx2/a;)V
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
.field public final synthetic a:Lx2/a;

.field public final synthetic b:Landroid/view/Surface;

.field public final synthetic c:Lg0/v2;


# direct methods
.method public constructor <init>(Lg0/v2;Lx2/a;Landroid/view/Surface;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lg0/v2$d;->c:Lg0/v2;

    iput-object p2, p0, Lg0/v2$d;->a:Lx2/a;

    iput-object p3, p0, Lg0/v2$d;->b:Landroid/view/Surface;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)V
    .locals 2

    iget-object p1, p0, Lg0/v2$d;->a:Lx2/a;

    const/4 v0, 0x0

    iget-object v1, p0, Lg0/v2$d;->b:Landroid/view/Surface;

    invoke-static {v0, v1}, Lg0/v2$g;->c(ILandroid/view/Surface;)Lg0/v2$g;

    move-result-object v0

    invoke-interface {p1, v0}, Lx2/a;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 3

    instance-of v0, p1, Lg0/v2$f;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Camera surface session should only fail with request cancellation. Instead failed due to:\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lx2/g;->j(ZLjava/lang/String;)V

    iget-object p1, p0, Lg0/v2$d;->a:Lx2/a;

    const/4 v0, 0x1

    iget-object v1, p0, Lg0/v2$d;->b:Landroid/view/Surface;

    invoke-static {v0, v1}, Lg0/v2$g;->c(ILandroid/view/Surface;)Lg0/v2$g;

    move-result-object v0

    invoke-interface {p1, v0}, Lx2/a;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lg0/v2$d;->a(Ljava/lang/Void;)V

    return-void
.end method
