.class public Lg0/v2$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg0/v2;-><init>(Landroid/util/Size;Ln0/p0;ZLg0/k0;ILandroid/util/Range;Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lr0/c<",
        "Landroid/view/Surface;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lne/x;

.field public final synthetic b:Ly1/c$a;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lg0/v2;


# direct methods
.method public constructor <init>(Lg0/v2;Lne/x;Ly1/c$a;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lg0/v2$c;->d:Lg0/v2;

    iput-object p2, p0, Lg0/v2$c;->a:Lne/x;

    iput-object p3, p0, Lg0/v2$c;->b:Ly1/c$a;

    iput-object p4, p0, Lg0/v2$c;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/Surface;)V
    .locals 1

    iget-object p1, p0, Lg0/v2$c;->a:Lne/x;

    iget-object v0, p0, Lg0/v2$c;->b:Ly1/c$a;

    invoke-static {p1, v0}, Lr0/n;->t(Lne/x;Ly1/c$a;)V

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 4

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg0/v2$c;->b:Ly1/c$a;

    new-instance v1, Lg0/v2$f;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lg0/v2$c;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " cancelled."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Lg0/v2$f;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    move-result p1

    invoke-static {p1}, Lx2/g;->i(Z)V

    return-void

    :cond_0
    iget-object p1, p0, Lg0/v2$c;->b:Ly1/c$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/view/Surface;

    invoke-virtual {p0, p1}, Lg0/v2$c;->a(Landroid/view/Surface;)V

    return-void
.end method
