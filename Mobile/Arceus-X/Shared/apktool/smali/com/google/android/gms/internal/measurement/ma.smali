.class public abstract Lcom/google/android/gms/internal/measurement/ma;
.super Lcom/google/android/gms/internal/measurement/y9;
.source "SourceFile"


# static fields
.field public static final b:Ljava/util/logging/Logger;

.field public static final c:Z


# instance fields
.field public a:Lcom/google/android/gms/internal/measurement/na;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/measurement/ma;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/ma;->b:Ljava/util/logging/Logger;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/sd;->f()Z

    move-result v0

    sput-boolean v0, Lcom/google/android/gms/internal/measurement/ma;->c:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    throw v0
.end method

.method public synthetic constructor <init>([B)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/y9;-><init>()V

    return-void
.end method

.method public static G(I)I
    .locals 0

    invoke-static {p0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result p0

    mul-int/lit8 p0, p0, 0x9

    rsub-int p0, p0, 0x160

    ushr-int/lit8 p0, p0, 0x6

    return p0
.end method

.method public static a(J)I
    .locals 0

    invoke-static {p0, p1}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result p0

    mul-int/lit8 p0, p0, 0x9

    rsub-int p0, p0, 0x280

    ushr-int/lit8 p0, p0, 0x6

    return p0
.end method

.method public static b(Ljava/lang/String;)I
    .locals 1

    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/vd;->b(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Lcom/google/android/gms/internal/measurement/ud; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, Lcom/google/android/gms/internal/measurement/qb;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    array-length p0, p0

    :goto_0
    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v0

    add-int/2addr v0, p0

    return v0
.end method

.method public static c(Lcom/google/android/gms/internal/measurement/oc;)I
    .locals 1

    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/oc;->a()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v0

    add-int/2addr v0, p0

    return v0
.end method

.method public static d(Lcom/google/android/gms/internal/measurement/oc;Lcom/google/android/gms/internal/measurement/zc;)I
    .locals 0

    check-cast p0, Lcom/google/android/gms/internal/measurement/r9;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/r9;->g(Lcom/google/android/gms/internal/measurement/zc;)I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static g(ILcom/google/android/gms/internal/measurement/oc;Lcom/google/android/gms/internal/measurement/zc;)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    shl-int/lit8 p0, p0, 0x3

    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result p0

    add-int/2addr p0, p0

    check-cast p1, Lcom/google/android/gms/internal/measurement/r9;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/r9;->g(Lcom/google/android/gms/internal/measurement/zc;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method public static synthetic h()Z
    .locals 1

    sget-boolean v0, Lcom/google/android/gms/internal/measurement/ma;->c:Z

    return v0
.end method


# virtual methods
.method public abstract A(I)V
.end method

.method public abstract B(J)V
.end method

.method public abstract C(J)V
.end method

.method public abstract D([BII)V
.end method

.method public abstract E(Ljava/lang/String;)V
.end method

.method public abstract F()I
.end method

.method public final e()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/ma;->F()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Did not write as much data as expected."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final f(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/ud;)V
    .locals 6

    sget-object v0, Lcom/google/android/gms/internal/measurement/ma;->b:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v3, "inefficientWriteStringNoTag"

    const-string v4, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"

    const-string v2, "com.google.protobuf.CodedOutputStream"

    move-object v5, p2

    invoke-virtual/range {v0 .. v5}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object p2, Lcom/google/android/gms/internal/measurement/qb;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    :try_start_0
    array-length p2, p1

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/ma;->z(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lcom/google/android/gms/internal/measurement/ma;->D([BII)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    new-instance p2, Lcom/google/android/gms/internal/measurement/la;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/measurement/la;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public abstract i(II)V
.end method

.method public abstract j(II)V
.end method

.method public abstract k(II)V
.end method

.method public abstract l(II)V
.end method

.method public abstract m(IJ)V
.end method

.method public abstract n(IJ)V
.end method

.method public abstract o(IZ)V
.end method

.method public abstract p(ILjava/lang/String;)V
.end method

.method public abstract q(ILcom/google/android/gms/internal/measurement/ha;)V
.end method

.method public abstract r(Lcom/google/android/gms/internal/measurement/ha;)V
.end method

.method public abstract s([BII)V
.end method

.method public abstract t(ILcom/google/android/gms/internal/measurement/oc;Lcom/google/android/gms/internal/measurement/zc;)V
.end method

.method public abstract u(ILcom/google/android/gms/internal/measurement/oc;)V
.end method

.method public abstract v(ILcom/google/android/gms/internal/measurement/ha;)V
.end method

.method public abstract w(Lcom/google/android/gms/internal/measurement/oc;)V
.end method

.method public abstract x(B)V
.end method

.method public abstract y(I)V
.end method

.method public abstract z(I)V
.end method
