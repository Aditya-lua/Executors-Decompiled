.class public final Ly/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/l0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg0/l0<",
        "Ly/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ln0/x2;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ln0/x2;->k0()Ln0/x2;

    move-result-object v0

    iput-object v0, p0, Ly/a$a;->a:Ln0/x2;

    return-void
.end method


# virtual methods
.method public a()Ln0/w2;
    .locals 1

    iget-object v0, p0, Ly/a$a;->a:Ln0/x2;

    return-object v0
.end method

.method public b()Ly/a;
    .locals 2

    new-instance v0, Ly/a;

    iget-object v1, p0, Ly/a$a;->a:Ln0/x2;

    invoke-static {v1}, Ln0/c3;->j0(Ln0/n1;)Ln0/c3;

    move-result-object v1

    invoke-direct {v0, v1}, Ly/a;-><init>(Ln0/n1;)V

    return-object v0
.end method

.method public c(Ln0/n1;)Ly/a$a;
    .locals 1

    sget-object v0, Ln0/n1$c;->d:Ln0/n1$c;

    invoke-virtual {p0, p1, v0}, Ly/a$a;->d(Ln0/n1;Ln0/n1$c;)Ly/a$a;

    return-object p0
.end method

.method public d(Ln0/n1;Ln0/n1$c;)Ly/a$a;
    .locals 4

    invoke-interface {p1}, Ln0/n1;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/n1$a;

    iget-object v2, p0, Ly/a$a;->a:Ln0/x2;

    invoke-interface {p1, v1}, Ln0/n1;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v1, p2, v3}, Ln0/x2;->D(Ln0/n1$a;Ln0/n1$c;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public f(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Ly/a$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ValueT:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/hardware/camera2/CaptureRequest$Key<",
            "TValueT;>;TValueT;)",
            "Ly/a$a;"
        }
    .end annotation

    invoke-static {p1}, Ly/a;->h0(Landroid/hardware/camera2/CaptureRequest$Key;)Ln0/n1$a;

    move-result-object p1

    iget-object v0, p0, Ly/a$a;->a:Ln0/x2;

    invoke-virtual {v0, p1, p2}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;Ln0/n1$c;)Ly/a$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ValueT:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/hardware/camera2/CaptureRequest$Key<",
            "TValueT;>;TValueT;",
            "Ln0/n1$c;",
            ")",
            "Ly/a$a;"
        }
    .end annotation

    invoke-static {p1}, Ly/a;->h0(Landroid/hardware/camera2/CaptureRequest$Key;)Ln0/n1$a;

    move-result-object p1

    iget-object v0, p0, Ly/a$a;->a:Ln0/x2;

    invoke-virtual {v0, p1, p3, p2}, Ln0/x2;->D(Ln0/n1$a;Ln0/n1$c;Ljava/lang/Object;)V

    return-object p0
.end method
