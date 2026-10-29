.class public Lz/u0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/u0;->v0()V
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
.field public final synthetic a:Lz/l3;

.field public final synthetic b:Lz/u0;


# direct methods
.method public constructor <init>(Lz/u0;Lz/l3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lz/u0$d;->b:Lz/u0;

    iput-object p2, p0, Lz/u0$d;->a:Lz/l3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)V
    .locals 1

    iget-object p1, p0, Lz/u0$d;->b:Lz/u0;

    iget-object p1, p1, Lz/u0;->u:Lh0/a;

    invoke-interface {p1}, Lh0/a;->e()I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lz/u0$d;->b:Lz/u0;

    iget-object p1, p1, Lz/u0;->e:Lz/u0$i;

    sget-object v0, Lz/u0$i;->j:Lz/u0$i;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lz/u0$d;->b:Lz/u0;

    sget-object v0, Lz/u0$i;->k:Lz/u0$i;

    invoke-virtual {p1, v0}, Lz/u0;->D0(Lz/u0$i;)V

    :cond_0
    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 3

    instance-of v0, p1, Ln0/u1$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz/u0$d;->b:Lz/u0;

    check-cast p1, Ln0/u1$a;

    invoke-virtual {p1}, Ln0/u1$a;->a()Ln0/u1;

    move-result-object p1

    invoke-virtual {v0, p1}, Lz/u0;->c0(Ln0/u1;)Ln0/o3;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Lz/u0$d;->b:Lz/u0;

    invoke-virtual {v0, p1}, Lz/u0;->x0(Ln0/o3;)V

    return-void

    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lz/u0$d;->b:Lz/u0;

    const-string v0, "Unable to configure camera cancelled"

    invoke-virtual {p1, v0}, Lz/u0;->a0(Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v0, p0, Lz/u0$d;->b:Lz/u0;

    iget-object v0, v0, Lz/u0;->e:Lz/u0$i;

    sget-object v1, Lz/u0$i;->j:Lz/u0$i;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lz/u0$d;->b:Lz/u0;

    const/4 v2, 0x4

    invoke-static {v2, p1}, Lg0/w$a;->b(ILjava/lang/Throwable;)Lg0/w$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lz/u0;->E0(Lz/u0$i;Lg0/w$a;)V

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to configure camera "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz/u0$d;->b:Lz/u0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Camera2CameraImpl"

    invoke-static {v1, v0, p1}, Lg0/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lz/u0$d;->b:Lz/u0;

    iget-object v0, p1, Lz/u0;->m:Lz/l3;

    iget-object v1, p0, Lz/u0$d;->a:Lz/l3;

    if-ne v0, v1, :cond_3

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lz/u0;->B0(Z)V

    :cond_3
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lz/u0$d;->a(Ljava/lang/Void;)V

    return-void
.end method
