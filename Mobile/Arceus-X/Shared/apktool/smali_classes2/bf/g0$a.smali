.class public Lbf/g0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbf/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lwe/j0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/j0<",
            "Lpe/z;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwe/s$a;


# direct methods
.method public constructor <init>(Lwe/j0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwe/j0<",
            "Lpe/z;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbf/g0$a;->a:Lwe/j0;

    invoke-virtual {p1}, Lwe/j0;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lwe/y;->b()Lwe/y;

    move-result-object v0

    invoke-virtual {v0}, Lwe/y;->a()Lwe/s;

    move-result-object v0

    invoke-static {p1}, Lwe/u;->a(Lwe/j0;)Lwe/t;

    move-result-object p1

    const-string v1, "public_key_sign"

    const-string v2, "sign"

    invoke-interface {v0, p1, v1, v2}, Lwe/s;->a(Lwe/t;Ljava/lang/String;Ljava/lang/String;)Lwe/s$a;

    move-result-object p1

    iput-object p1, p0, Lbf/g0$a;->b:Lwe/s$a;

    return-void

    :cond_0
    sget-object p1, Lwe/u;->a:Lwe/s$a;

    iput-object p1, p0, Lbf/g0$a;->b:Lwe/s$a;

    return-void
.end method


# virtual methods
.method public a([B)[B
    .locals 5

    :try_start_0
    iget-object v0, p0, Lbf/g0$a;->a:Lwe/j0;

    invoke-virtual {v0}, Lwe/j0;->d()Lwe/j0$c;

    move-result-object v0

    invoke-virtual {v0}, Lwe/j0$c;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpe/z;

    invoke-interface {v0, p1}, Lpe/z;->a([B)[B

    move-result-object v0

    iget-object v1, p0, Lbf/g0$a;->b:Lwe/s$a;

    iget-object v2, p0, Lbf/g0$a;->a:Lwe/j0;

    invoke-virtual {v2}, Lwe/j0;->d()Lwe/j0$c;

    move-result-object v2

    invoke-virtual {v2}, Lwe/j0$c;->c()I

    move-result v2

    array-length p1, p1

    int-to-long v3, p1

    invoke-interface {v1, v2, v3, v4}, Lwe/s$a;->a(IJ)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    iget-object v0, p0, Lbf/g0$a;->b:Lwe/s$a;

    invoke-interface {v0}, Lwe/s$a;->b()V

    throw p1
.end method
