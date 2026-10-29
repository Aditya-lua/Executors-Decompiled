.class public final Lwe/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwe/p0;


# instance fields
.field public final a:Lef/a;

.field public final b:Laf/h0;


# direct methods
.method public constructor <init>(Laf/h0;Lef/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwe/m0;->b:Laf/h0;

    iput-object p2, p0, Lwe/m0;->a:Lef/a;

    return-void
.end method

.method public static b(Laf/h0;)Lwe/m0;
    .locals 2

    new-instance v0, Lwe/m0;

    invoke-virtual {p0}, Laf/h0;->f0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwe/s0;->b(Ljava/lang/String;)Lef/a;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lwe/m0;-><init>(Laf/h0;Lef/a;)V

    return-object v0
.end method

.method public static c(Laf/h0;)Lwe/m0;
    .locals 2

    new-instance v0, Lwe/m0;

    invoke-virtual {p0}, Laf/h0;->f0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwe/s0;->h(Ljava/lang/String;)Lef/a;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lwe/m0;-><init>(Laf/h0;Lef/a;)V

    return-object v0
.end method


# virtual methods
.method public a()Lef/a;
    .locals 1

    iget-object v0, p0, Lwe/m0;->a:Lef/a;

    return-object v0
.end method

.method public d()Laf/h0;
    .locals 1

    iget-object v0, p0, Lwe/m0;->b:Laf/h0;

    return-object v0
.end method
