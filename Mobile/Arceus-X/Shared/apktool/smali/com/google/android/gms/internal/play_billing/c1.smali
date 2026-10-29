.class public final Lcom/google/android/gms/internal/play_billing/c1;
.super Lcom/google/android/gms/internal/play_billing/s0;
.source "SourceFile"


# static fields
.field public static final h:[Ljava/lang/Object;

.field public static final i:Lcom/google/android/gms/internal/play_billing/c1;


# instance fields
.field public final transient c:[Ljava/lang/Object;

.field public final transient d:I

.field public final transient e:[Ljava/lang/Object;

.field public final transient f:I

.field public final transient g:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/4 v0, 0x0

    new-array v2, v0, [Ljava/lang/Object;

    sput-object v2, Lcom/google/android/gms/internal/play_billing/c1;->h:[Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/internal/play_billing/c1;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v4, v2

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/play_billing/c1;-><init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    sput-object v1, Lcom/google/android/gms/internal/play_billing/c1;->i:Lcom/google/android/gms/internal/play_billing/c1;

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/s0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/c1;->c:[Ljava/lang/Object;

    iput p2, p0, Lcom/google/android/gms/internal/play_billing/c1;->d:I

    iput-object p3, p0, Lcom/google/android/gms/internal/play_billing/c1;->e:[Ljava/lang/Object;

    iput p4, p0, Lcom/google/android/gms/internal/play_billing/c1;->f:I

    iput p5, p0, Lcom/google/android/gms/internal/play_billing/c1;->g:I

    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;I)I
    .locals 2

    iget-object p2, p0, Lcom/google/android/gms/internal/play_billing/c1;->c:[Ljava/lang/Object;

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/c1;->g:I

    const/4 v1, 0x0

    invoke-static {p2, v1, p1, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/c1;->g:I

    return v0
.end method

.method public final c()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/c1;->e:[Ljava/lang/Object;

    array-length v2, v1

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/g0;->a(I)I

    move-result v2

    :goto_0
    iget v3, p0, Lcom/google/android/gms/internal/play_billing/c1;->f:I

    and-int/2addr v2, v3

    aget-object v3, v1, v2

    if-nez v3, :cond_0

    return v0

    :cond_0
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public final f()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/c1;->c:[Ljava/lang/Object;

    return-object v0
.end method

.method public final h()Lcom/google/android/gms/internal/play_billing/n0;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/c1;->c:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/c1;->g:I

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/n0;->h([Ljava/lang/Object;I)Lcom/google/android/gms/internal/play_billing/n0;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/c1;->d:I

    return v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/j0;->d()Lcom/google/android/gms/internal/play_billing/n0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/n0;->p(I)Lcom/google/android/gms/internal/play_billing/g1;

    move-result-object v0

    return-object v0
.end method

.method public final l()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/c1;->g:I

    return v0
.end method
