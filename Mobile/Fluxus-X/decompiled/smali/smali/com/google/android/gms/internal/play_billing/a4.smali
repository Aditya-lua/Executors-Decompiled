.class public abstract Lcom/google/android/gms/internal/play_billing/a4;
.super Lcom/google/android/gms/internal/play_billing/i3;
.source "SourceFile"


# static fields
.field public static final b:Z


# instance fields
.field public a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/a7;->B()Z

    move-result v0

    sput-boolean v0, Lcom/google/android/gms/internal/play_billing/a4;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/play_billing/z3;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/i3;-><init>()V

    return-void
.end method

.method public static bridge synthetic b()Z
    .locals 1

    sget-boolean v0, Lcom/google/android/gms/internal/play_billing/a4;->b:Z

    return v0
.end method

.method public static u(Lcom/google/android/gms/internal/play_billing/x5;)I
    .locals 1

    invoke-interface {p0}, Lcom/google/android/gms/internal/play_billing/x5;->zzn()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v0

    add-int/2addr v0, p0

    return v0
.end method

.method public static v(I)I
    .locals 0

    invoke-static {p0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result p0

    mul-int/lit8 p0, p0, 0x9

    rsub-int p0, p0, 0x160

    ushr-int/lit8 p0, p0, 0x6

    return p0
.end method

.method public static w(J)I
    .locals 0

    invoke-static {p0, p1}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result p0

    mul-int/lit8 p0, p0, 0x9

    rsub-int p0, p0, 0x280

    ushr-int/lit8 p0, p0, 0x6

    return p0
.end method


# virtual methods
.method public final a()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/a4;->c()I

    move-result v0

    if-gtz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/a4;->c()I

    move-result v0

    if-ltz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Wrote more data than expected."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Did not write as much data as expected."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public abstract c()I
.end method

.method public abstract d(B)V
.end method

.method public abstract e(IZ)V
.end method

.method public abstract f(ILcom/google/android/gms/internal/play_billing/s3;)V
.end method

.method public abstract g(II)V
.end method

.method public abstract h(I)V
.end method

.method public abstract i(IJ)V
.end method

.method public abstract j(J)V
.end method

.method public abstract k(II)V
.end method

.method public abstract l(I)V
.end method

.method public abstract m(ILcom/google/android/gms/internal/play_billing/x5;)V
.end method

.method public abstract n(ILcom/google/android/gms/internal/play_billing/s3;)V
.end method

.method public abstract o(ILjava/lang/String;)V
.end method

.method public abstract p(II)V
.end method

.method public abstract q(II)V
.end method

.method public abstract r(I)V
.end method

.method public abstract s(IJ)V
.end method

.method public abstract t(J)V
.end method
