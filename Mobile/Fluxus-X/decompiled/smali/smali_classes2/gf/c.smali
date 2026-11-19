.class public final Lgf/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lgf/a;


# direct methods
.method public constructor <init>(Lgf/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgf/c;->a:Lgf/a;

    return-void
.end method

.method public static a([BLre/d0;)Lgf/c;
    .locals 0

    if-eqz p1, :cond_0

    new-instance p1, Lgf/c;

    invoke-static {p0}, Lgf/a;->a([B)Lgf/a;

    move-result-object p0

    invoke-direct {p1, p0}, Lgf/c;-><init>(Lgf/a;)V

    return-object p1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "SecretKeyAccess required"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(I)Lgf/c;
    .locals 1

    new-instance v0, Lgf/c;

    invoke-static {p0}, Lff/u;->a(I)[B

    move-result-object p0

    invoke-static {p0}, Lgf/a;->a([B)Lgf/a;

    move-result-object p0

    invoke-direct {v0, p0}, Lgf/c;-><init>(Lgf/a;)V

    return-object v0
.end method


# virtual methods
.method public c()I
    .locals 1

    iget-object v0, p0, Lgf/c;->a:Lgf/a;

    invoke-virtual {v0}, Lgf/a;->c()I

    move-result v0

    return v0
.end method

.method public d(Lre/d0;)[B
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lgf/c;->a:Lgf/a;

    invoke-virtual {p1}, Lgf/a;->d()[B

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "SecretKeyAccess required"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
