.class public Lg0/v2$a;
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
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ly1/c$a;

.field public final synthetic b:Lne/x;

.field public final synthetic c:Lg0/v2;


# direct methods
.method public constructor <init>(Lg0/v2;Ly1/c$a;Lne/x;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lg0/v2$a;->c:Lg0/v2;

    iput-object p2, p0, Lg0/v2$a;->a:Ly1/c$a;

    iput-object p3, p0, Lg0/v2$a;->b:Lne/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)V
    .locals 1

    iget-object p1, p0, Lg0/v2$a;->a:Ly1/c$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Lx2/g;->i(Z)V

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 1

    instance-of p1, p1, Lg0/v2$f;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lg0/v2$a;->b:Lne/x;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    move-result p1

    invoke-static {p1}, Lx2/g;->i(Z)V

    return-void

    :cond_0
    iget-object p1, p0, Lg0/v2$a;->a:Ly1/c$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Lx2/g;->i(Z)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lg0/v2$a;->a(Ljava/lang/Void;)V

    return-void
.end method
