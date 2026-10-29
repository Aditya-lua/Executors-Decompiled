.class public final Lef/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lef/a;


# direct methods
.method public constructor <init>(Lef/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lef/c;->a:Lef/a;

    return-void
.end method

.method public static a([BLpe/d0;)Lef/c;
    .locals 0

    if-eqz p1, :cond_0

    new-instance p1, Lef/c;

    invoke-static {p0}, Lef/a;->a([B)Lef/a;

    move-result-object p0

    invoke-direct {p1, p0}, Lef/c;-><init>(Lef/a;)V

    return-object p1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "SecretKeyAccess required"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(I)Lef/c;
    .locals 1

    new-instance v0, Lef/c;

    invoke-static {p0}, Ldf/u;->a(I)[B

    move-result-object p0

    invoke-static {p0}, Lef/a;->a([B)Lef/a;

    move-result-object p0

    invoke-direct {v0, p0}, Lef/c;-><init>(Lef/a;)V

    return-object v0
.end method


# virtual methods
.method public c()I
    .locals 1

    iget-object v0, p0, Lef/c;->a:Lef/a;

    invoke-virtual {v0}, Lef/a;->c()I

    move-result v0

    return v0
.end method

.method public d(Lpe/d0;)[B
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lef/c;->a:Lef/a;

    invoke-virtual {p1}, Lef/a;->d()[B

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "SecretKeyAccess required"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
