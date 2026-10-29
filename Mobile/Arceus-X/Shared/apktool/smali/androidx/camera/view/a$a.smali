.class public Landroidx/camera/view/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/view/a;->h(Lg0/t;)V
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
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Lg0/t;

.field public final synthetic c:Landroidx/camera/view/a;


# direct methods
.method public constructor <init>(Landroidx/camera/view/a;Ljava/util/List;Lg0/t;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/camera/view/a$a;->c:Landroidx/camera/view/a;

    iput-object p2, p0, Landroidx/camera/view/a$a;->a:Ljava/util/List;

    iput-object p3, p0, Landroidx/camera/view/a$a;->b:Lg0/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)V
    .locals 1

    iget-object p1, p0, Landroidx/camera/view/a$a;->c:Landroidx/camera/view/a;

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/camera/view/a;->e:Lne/x;

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 2

    iget-object p1, p0, Landroidx/camera/view/a$a;->c:Landroidx/camera/view/a;

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/camera/view/a;->e:Lne/x;

    iget-object p1, p0, Landroidx/camera/view/a$a;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Landroidx/camera/view/a$a;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/u;

    iget-object v1, p0, Landroidx/camera/view/a$a;->b:Lg0/t;

    check-cast v1, Ln0/o0;

    invoke-interface {v1, v0}, Ln0/o0;->v(Ln0/u;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/camera/view/a$a;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    :cond_1
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Landroidx/camera/view/a$a;->a(Ljava/lang/Void;)V

    return-void
.end method
