.class public Lse/m0;
.super Lse/b;
.source "SourceFile"


# instance fields
.field public final a:Lse/n0;

.field public final b:Lgf/a;

.field public final c:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lse/n0;Lgf/a;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Lse/b;-><init>()V

    iput-object p1, p0, Lse/m0;->a:Lse/n0;

    iput-object p2, p0, Lse/m0;->b:Lgf/a;

    iput-object p3, p0, Lse/m0;->c:Ljava/lang/Integer;

    return-void
.end method

.method public static b(Lse/n0;Ljava/lang/Integer;)Lse/m0;
    .locals 2

    invoke-virtual {p0}, Lse/n0;->d()Lse/n0$a;

    move-result-object v0

    sget-object v1, Lse/n0$a;->b:Lse/n0$a;

    if-ne v0, v1, :cond_1

    if-eqz p1, :cond_0

    const/4 v0, 0x5

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lgf/a;->a([B)Lgf/a;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "For given Variant TINK the value of idRequirement must be non-null"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-virtual {p0}, Lse/n0;->d()Lse/n0$a;

    move-result-object v0

    sget-object v1, Lse/n0$a;->c:Lse/n0$a;

    if-ne v0, v1, :cond_3

    if-nez p1, :cond_2

    const/4 v0, 0x0

    new-array v0, v0, [B

    invoke-static {v0}, Lgf/a;->a([B)Lgf/a;

    move-result-object v0

    :goto_0
    new-instance v1, Lse/m0;

    invoke-direct {v1, p0, v0, p1}, Lse/m0;-><init>(Lse/n0;Lgf/a;Ljava/lang/Integer;)V

    return-object v1

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "For given Variant NO_PREFIX the value of idRequirement must be null"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown Variant: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lse/n0;->d()Lse/n0$a;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lse/m0;->c:Ljava/lang/Integer;

    return-object v0
.end method

.method public c()Lgf/a;
    .locals 1

    iget-object v0, p0, Lse/m0;->b:Lgf/a;

    return-object v0
.end method

.method public d()Lse/n0;
    .locals 1

    iget-object v0, p0, Lse/m0;->a:Lse/n0;

    return-object v0
.end method
