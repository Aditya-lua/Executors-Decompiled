.class public abstract Leb/u2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Leb/u2;

.field public static final b:Leb/u2;

.field public static final c:Leb/u2;

.field public static final d:Leb/u2;

.field public static final e:Leb/u2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Leb/s2;

    const/16 v1, 0x3d

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    const-string v2, "base64()"

    const-string v3, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"

    invoke-direct {v0, v2, v3, v1}, Leb/s2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Character;)V

    sput-object v0, Leb/u2;->a:Leb/u2;

    new-instance v0, Leb/s2;

    const-string v2, "base64Url()"

    const-string v3, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_"

    invoke-direct {v0, v2, v3, v1}, Leb/s2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Character;)V

    sput-object v0, Leb/u2;->b:Leb/u2;

    new-instance v0, Leb/t2;

    const-string v2, "base32()"

    const-string v3, "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567"

    invoke-direct {v0, v2, v3, v1}, Leb/t2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Character;)V

    sput-object v0, Leb/u2;->c:Leb/u2;

    new-instance v0, Leb/t2;

    const-string v2, "base32Hex()"

    const-string v3, "0123456789ABCDEFGHIJKLMNOPQRSTUV"

    invoke-direct {v0, v2, v3, v1}, Leb/t2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Character;)V

    sput-object v0, Leb/u2;->d:Leb/u2;

    new-instance v0, Leb/r2;

    const-string v1, "base16()"

    const-string v2, "0123456789ABCDEF"

    invoke-direct {v0, v1, v2}, Leb/r2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Leb/u2;->e:Leb/u2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d()Leb/u2;
    .locals 1

    sget-object v0, Leb/u2;->e:Leb/u2;

    return-object v0
.end method


# virtual methods
.method public abstract a(Ljava/lang/Appendable;[BII)V
.end method

.method public abstract b(I)I
.end method

.method public abstract c()Leb/u2;
.end method

.method public final e([BII)Ljava/lang/String;
    .locals 2

    array-length p2, p1

    const/4 v0, 0x0

    invoke-static {v0, p3, p2}, Leb/n0;->e(III)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Leb/u2;->b(I)I

    move-result v1

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    :try_start_0
    invoke-virtual {p0, p2, p1, v0, p3}, Leb/u2;->a(Ljava/lang/Appendable;[BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/AssertionError;

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p2
.end method
