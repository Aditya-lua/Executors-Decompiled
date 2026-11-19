.class public final Lf0/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/l0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf0/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg0/l0<",
        "Lf0/l;",
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

    iput-object v0, p0, Lf0/l$a;->a:Ln0/x2;

    return-void
.end method

.method public static synthetic b(Lf0/l$a;Ln0/n1;Ln0/n1$a;)Z
    .locals 1

    invoke-virtual {p0}, Lf0/l$a;->a()Ln0/w2;

    move-result-object p0

    invoke-interface {p1, p2}, Ln0/n1;->g(Ln0/n1$a;)Ln0/n1$c;

    move-result-object v0

    invoke-interface {p1, p2}, Ln0/n1;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p2, v0, p1}, Ln0/w2;->D(Ln0/n1$a;Ln0/n1$c;Ljava/lang/Object;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static d(Ln0/n1;)Lf0/l$a;
    .locals 3

    new-instance v0, Lf0/l$a;

    invoke-direct {v0}, Lf0/l$a;-><init>()V

    new-instance v1, Lf0/k;

    invoke-direct {v1, v0, p0}, Lf0/k;-><init>(Lf0/l$a;Ln0/n1;)V

    const-string v2, "camera2.captureRequest.option."

    invoke-interface {p0, v2, v1}, Ln0/n1;->d(Ljava/lang/String;Ln0/n1$b;)V

    return-object v0
.end method


# virtual methods
.method public a()Ln0/w2;
    .locals 1

    iget-object v0, p0, Lf0/l$a;->a:Ln0/x2;

    return-object v0
.end method

.method public c()Lf0/l;
    .locals 2

    new-instance v0, Lf0/l;

    iget-object v1, p0, Lf0/l$a;->a:Ln0/x2;

    invoke-static {v1}, Ln0/c3;->j0(Ln0/n1;)Ln0/c3;

    move-result-object v1

    invoke-direct {v0, v1}, Lf0/l;-><init>(Ln0/n1;)V

    return-object v0
.end method

.method public f(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lf0/l$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ValueT:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/hardware/camera2/CaptureRequest$Key<",
            "TValueT;>;TValueT;)",
            "Lf0/l$a;"
        }
    .end annotation

    invoke-static {p1}, Ly/a;->h0(Landroid/hardware/camera2/CaptureRequest$Key;)Ln0/n1$a;

    move-result-object p1

    iget-object v0, p0, Lf0/l$a;->a:Ln0/x2;

    invoke-virtual {v0, p1, p2}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method
