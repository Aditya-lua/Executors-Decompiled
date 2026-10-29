.class public final Lwe/p;
.super Lpe/l;
.source "SourceFile"


# instance fields
.field public final a:Lwe/l0;


# direct methods
.method public constructor <init>(Lwe/l0;Lpe/d0;)V
    .locals 0

    invoke-direct {p0}, Lpe/l;-><init>()V

    invoke-static {p1, p2}, Lwe/p;->c(Lwe/l0;Lpe/d0;)V

    iput-object p1, p0, Lwe/p;->a:Lwe/l0;

    return-void
.end method

.method public static c(Lwe/l0;Lpe/d0;)V
    .locals 1

    sget-object v0, Lwe/p$a;->b:[I

    invoke-virtual {p0}, Lwe/l0;->d()Laf/f0$c;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Lpe/d0;->b(Lpe/d0;)Lpe/d0;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lwe/p;->a:Lwe/l0;

    invoke-virtual {v0}, Lwe/l0;->c()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public b(Lpe/d0;)Lwe/l0;
    .locals 1

    iget-object v0, p0, Lwe/p;->a:Lwe/l0;

    invoke-static {v0, p1}, Lwe/p;->c(Lwe/l0;Lpe/d0;)V

    iget-object p1, p0, Lwe/p;->a:Lwe/l0;

    return-object p1
.end method
