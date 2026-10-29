.class public final Lcom/google/android/gms/internal/play_billing/a6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/h6;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/play_billing/h6<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final l:[I

.field public static final m:Lsun/misc/Unsafe;


# instance fields
.field public final a:[I

.field public final b:[Ljava/lang/Object;

.field public final c:I

.field public final d:I

.field public final e:Lcom/google/android/gms/internal/play_billing/x5;

.field public final f:Z

.field public final g:[I

.field public final h:I

.field public final i:I

.field public final j:Lcom/google/android/gms/internal/play_billing/t6;

.field public final k:Lcom/google/android/gms/internal/play_billing/g4;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, Lcom/google/android/gms/internal/play_billing/a6;->l:[I

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/a7;->k()Lsun/misc/Unsafe;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/play_billing/a6;->m:Lsun/misc/Unsafe;

    return-void
.end method

.method public constructor <init>([I[Ljava/lang/Object;IILcom/google/android/gms/internal/play_billing/x5;Z[IIILcom/google/android/gms/internal/play_billing/c6;Lcom/google/android/gms/internal/play_billing/i5;Lcom/google/android/gms/internal/play_billing/t6;Lcom/google/android/gms/internal/play_billing/g4;Lcom/google/android/gms/internal/play_billing/s5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/a6;->a:[I

    iput-object p2, p0, Lcom/google/android/gms/internal/play_billing/a6;->b:[Ljava/lang/Object;

    iput p3, p0, Lcom/google/android/gms/internal/play_billing/a6;->c:I

    iput p4, p0, Lcom/google/android/gms/internal/play_billing/a6;->d:I

    const/4 p1, 0x0

    if-eqz p13, :cond_0

    instance-of p2, p5, Lcom/google/android/gms/internal/play_billing/q4;

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    :cond_0
    iput-boolean p1, p0, Lcom/google/android/gms/internal/play_billing/a6;->f:Z

    iput-object p7, p0, Lcom/google/android/gms/internal/play_billing/a6;->g:[I

    iput p8, p0, Lcom/google/android/gms/internal/play_billing/a6;->h:I

    iput p9, p0, Lcom/google/android/gms/internal/play_billing/a6;->i:I

    iput-object p12, p0, Lcom/google/android/gms/internal/play_billing/a6;->j:Lcom/google/android/gms/internal/play_billing/t6;

    iput-object p13, p0, Lcom/google/android/gms/internal/play_billing/a6;->k:Lcom/google/android/gms/internal/play_billing/g4;

    iput-object p5, p0, Lcom/google/android/gms/internal/play_billing/a6;->e:Lcom/google/android/gms/internal/play_billing/x5;

    return-void
.end method

.method public static B(I)I
    .locals 0

    ushr-int/lit8 p0, p0, 0x14

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public static D(Ljava/lang/Object;J)J
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    return-wide p0
.end method

.method public static K(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 6

    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    return-object v4

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Field "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " not found. Known fields are "

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public static L(Ljava/lang/Object;)V
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/internal/play_billing/a6;->q(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "Mutating immutable message: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static p(Ljava/lang/Object;ILcom/google/android/gms/internal/play_billing/h6;)Z
    .locals 2

    const v0, 0xfffff

    and-int/2addr p1, v0

    int-to-long v0, p1

    invoke-static {p0, v0, v1}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p2, p0}, Lcom/google/android/gms/internal/play_billing/h6;->a(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static q(Ljava/lang/Object;)Z
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    instance-of v0, p0, Lcom/google/android/gms/internal/play_billing/t4;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/google/android/gms/internal/play_billing/t4;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/t4;->l()Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final u(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/i7;)V
    .locals 1

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-interface {p2, p0, p1}, Lcom/google/android/gms/internal/play_billing/i7;->n(ILjava/lang/String;)V

    return-void

    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/play_billing/s3;

    invoke-interface {p2, p0, p1}, Lcom/google/android/gms/internal/play_billing/i7;->E(ILcom/google/android/gms/internal/play_billing/s3;)V

    return-void
.end method

.method public static w(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/u6;
    .locals 2

    check-cast p0, Lcom/google/android/gms/internal/play_billing/t4;

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/t4;->zzc:Lcom/google/android/gms/internal/play_billing/u6;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/u6;->c()Lcom/google/android/gms/internal/play_billing/u6;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/u6;->f()Lcom/google/android/gms/internal/play_billing/u6;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/t4;->zzc:Lcom/google/android/gms/internal/play_billing/u6;

    :cond_0
    return-object v0
.end method

.method public static x(Ljava/lang/Class;Lcom/google/android/gms/internal/play_billing/u5;Lcom/google/android/gms/internal/play_billing/c6;Lcom/google/android/gms/internal/play_billing/i5;Lcom/google/android/gms/internal/play_billing/t6;Lcom/google/android/gms/internal/play_billing/g4;Lcom/google/android/gms/internal/play_billing/s5;)Lcom/google/android/gms/internal/play_billing/a6;
    .locals 31

    move-object/from16 v0, p1

    instance-of v1, v0, Lcom/google/android/gms/internal/play_billing/g6;

    if-eqz v1, :cond_36

    check-cast v0, Lcom/google/android/gms/internal/play_billing/g6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/g6;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const v5, 0xd800

    if-lt v4, v5, :cond_0

    const/4 v4, 0x1

    :goto_0
    add-int/lit8 v7, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_1

    move v4, v7

    goto :goto_0

    :cond_0
    const/4 v7, 0x1

    :cond_1
    add-int/lit8 v4, v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v5, :cond_3

    and-int/lit16 v7, v7, 0x1fff

    const/16 v9, 0xd

    :goto_1
    add-int/lit8 v10, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_2

    and-int/lit16 v4, v4, 0x1fff

    shl-int/2addr v4, v9

    or-int/2addr v7, v4

    add-int/lit8 v9, v9, 0xd

    move v4, v10

    goto :goto_1

    :cond_2
    shl-int/2addr v4, v9

    or-int/2addr v7, v4

    move v4, v10

    :cond_3
    if-nez v7, :cond_4

    sget-object v7, Lcom/google/android/gms/internal/play_billing/a6;->l:[I

    move v9, v3

    move v10, v9

    move v11, v10

    move v12, v11

    move v13, v12

    move/from16 v17, v13

    move-object/from16 v16, v7

    move/from16 v7, v17

    goto/16 :goto_a

    :cond_4
    add-int/lit8 v7, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_6

    and-int/lit16 v4, v4, 0x1fff

    const/16 v9, 0xd

    :goto_2
    add-int/lit8 v10, v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v5, :cond_5

    and-int/lit16 v7, v7, 0x1fff

    shl-int/2addr v7, v9

    or-int/2addr v4, v7

    add-int/lit8 v9, v9, 0xd

    move v7, v10

    goto :goto_2

    :cond_5
    shl-int/2addr v7, v9

    or-int/2addr v4, v7

    move v7, v10

    :cond_6
    add-int/lit8 v9, v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v5, :cond_8

    and-int/lit16 v7, v7, 0x1fff

    const/16 v10, 0xd

    :goto_3
    add-int/lit8 v11, v9, 0x1

    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v5, :cond_7

    and-int/lit16 v9, v9, 0x1fff

    shl-int/2addr v9, v10

    or-int/2addr v7, v9

    add-int/lit8 v10, v10, 0xd

    move v9, v11

    goto :goto_3

    :cond_7
    shl-int/2addr v9, v10

    or-int/2addr v7, v9

    move v9, v11

    :cond_8
    add-int/lit8 v10, v9, 0x1

    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v5, :cond_a

    and-int/lit16 v9, v9, 0x1fff

    const/16 v11, 0xd

    :goto_4
    add-int/lit8 v12, v10, 0x1

    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-lt v10, v5, :cond_9

    and-int/lit16 v10, v10, 0x1fff

    shl-int/2addr v10, v11

    or-int/2addr v9, v10

    add-int/lit8 v11, v11, 0xd

    move v10, v12

    goto :goto_4

    :cond_9
    shl-int/2addr v10, v11

    or-int/2addr v9, v10

    move v10, v12

    :cond_a
    add-int/lit8 v11, v10, 0x1

    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-lt v10, v5, :cond_c

    and-int/lit16 v10, v10, 0x1fff

    const/16 v12, 0xd

    :goto_5
    add-int/lit8 v13, v11, 0x1

    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v5, :cond_b

    and-int/lit16 v11, v11, 0x1fff

    shl-int/2addr v11, v12

    or-int/2addr v10, v11

    add-int/lit8 v12, v12, 0xd

    move v11, v13

    goto :goto_5

    :cond_b
    shl-int/2addr v11, v12

    or-int/2addr v10, v11

    move v11, v13

    :cond_c
    add-int/lit8 v12, v11, 0x1

    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v5, :cond_e

    and-int/lit16 v11, v11, 0x1fff

    const/16 v13, 0xd

    :goto_6
    add-int/lit8 v14, v12, 0x1

    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v5, :cond_d

    and-int/lit16 v12, v12, 0x1fff

    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    add-int/lit8 v13, v13, 0xd

    move v12, v14

    goto :goto_6

    :cond_d
    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    move v12, v14

    :cond_e
    add-int/lit8 v13, v12, 0x1

    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v5, :cond_10

    and-int/lit16 v12, v12, 0x1fff

    const/16 v14, 0xd

    :goto_7
    add-int/lit8 v15, v13, 0x1

    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v5, :cond_f

    and-int/lit16 v13, v13, 0x1fff

    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    add-int/lit8 v14, v14, 0xd

    move v13, v15

    goto :goto_7

    :cond_f
    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    move v13, v15

    :cond_10
    add-int/lit8 v14, v13, 0x1

    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v5, :cond_12

    :goto_8
    add-int/lit8 v13, v14, 0x1

    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v5, :cond_11

    move v14, v13

    goto :goto_8

    :cond_11
    move v14, v13

    :cond_12
    add-int/lit8 v13, v14, 0x1

    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v5, :cond_14

    and-int/lit16 v14, v14, 0x1fff

    const/16 v15, 0xd

    :goto_9
    add-int/lit8 v16, v13, 0x1

    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v5, :cond_13

    and-int/lit16 v13, v13, 0x1fff

    shl-int/2addr v13, v15

    or-int/2addr v14, v13

    add-int/lit8 v15, v15, 0xd

    move/from16 v13, v16

    goto :goto_9

    :cond_13
    shl-int/2addr v13, v15

    or-int/2addr v14, v13

    move/from16 v13, v16

    :cond_14
    add-int v15, v14, v12

    add-int/2addr v15, v4

    add-int v16, v4, v4

    add-int v16, v16, v7

    new-array v7, v15, [I

    move-object/from16 v17, v7

    move v7, v4

    move v4, v13

    move v13, v10

    move/from16 v10, v16

    move-object/from16 v16, v17

    move/from16 v17, v12

    move v12, v9

    move/from16 v9, v17

    move/from16 v17, v14

    :goto_a
    sget-object v14, Lcom/google/android/gms/internal/play_billing/a6;->m:Lsun/misc/Unsafe;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/g6;->b()[Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/g6;->zza()Lcom/google/android/gms/internal/play_billing/x5;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    add-int v18, v17, v9

    add-int v9, v11, v11

    mul-int/lit8 v11, v11, 0x3

    new-array v11, v11, [I

    new-array v9, v9, [Ljava/lang/Object;

    move/from16 v22, v17

    move/from16 v21, v18

    const/16 v19, 0x0

    const/16 v20, 0x0

    :goto_b
    if-ge v4, v2, :cond_35

    add-int/lit8 v23, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_16

    and-int/lit16 v4, v4, 0x1fff

    move/from16 v8, v23

    const/16 v23, 0xd

    :goto_c
    add-int/lit8 v24, v8, 0x1

    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v5, :cond_15

    and-int/lit16 v8, v8, 0x1fff

    shl-int v8, v8, v23

    or-int/2addr v4, v8

    add-int/lit8 v23, v23, 0xd

    move/from16 v8, v24

    goto :goto_c

    :cond_15
    shl-int v8, v8, v23

    or-int/2addr v4, v8

    move/from16 v8, v24

    goto :goto_d

    :cond_16
    move/from16 v8, v23

    :goto_d
    add-int/lit8 v23, v8, 0x1

    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v5, :cond_18

    and-int/lit16 v8, v8, 0x1fff

    move/from16 v6, v23

    const/16 v23, 0xd

    :goto_e
    add-int/lit8 v25, v6, 0x1

    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v5, :cond_17

    and-int/lit16 v6, v6, 0x1fff

    shl-int v6, v6, v23

    or-int/2addr v8, v6

    add-int/lit8 v23, v23, 0xd

    move/from16 v6, v25

    goto :goto_e

    :cond_17
    shl-int v6, v6, v23

    or-int/2addr v8, v6

    move/from16 v6, v25

    goto :goto_f

    :cond_18
    move/from16 v6, v23

    :goto_f
    and-int/lit16 v5, v8, 0x400

    if-eqz v5, :cond_19

    add-int/lit8 v5, v19, 0x1

    aput v20, v16, v19

    move/from16 v19, v5

    :cond_19
    and-int/lit16 v5, v8, 0xff

    move-object/from16 v25, v0

    and-int/lit16 v0, v8, 0x800

    move/from16 v26, v0

    const/16 v0, 0x33

    if-lt v5, v0, :cond_23

    add-int/lit8 v0, v6, 0x1

    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    move/from16 v27, v0

    const v0, 0xd800

    if-lt v6, v0, :cond_1b

    and-int/lit16 v6, v6, 0x1fff

    move/from16 v29, v27

    move/from16 v27, v6

    move/from16 v6, v29

    const/16 v29, 0xd

    :goto_10
    add-int/lit8 v30, v6, 0x1

    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v0, :cond_1a

    and-int/lit16 v0, v6, 0x1fff

    shl-int v0, v0, v29

    or-int v27, v27, v0

    add-int/lit8 v29, v29, 0xd

    move/from16 v6, v30

    const v0, 0xd800

    goto :goto_10

    :cond_1a
    shl-int v0, v6, v29

    or-int v6, v27, v0

    move/from16 v0, v30

    goto :goto_11

    :cond_1b
    move/from16 v0, v27

    :goto_11
    move/from16 v27, v0

    add-int/lit8 v0, v5, -0x33

    move/from16 v29, v2

    const/16 v2, 0x9

    if-eq v0, v2, :cond_1c

    const/16 v2, 0x11

    if-ne v0, v2, :cond_1d

    :cond_1c
    const/4 v2, 0x1

    goto :goto_14

    :cond_1d
    const/16 v2, 0xc

    if-ne v0, v2, :cond_20

    invoke-virtual/range {v25 .. v25}, Lcom/google/android/gms/internal/play_billing/g6;->zzc()I

    move-result v0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1f

    if-eqz v26, :cond_1e

    goto :goto_12

    :cond_1e
    const/4 v0, 0x0

    goto :goto_15

    :cond_1f
    :goto_12
    add-int/lit8 v0, v10, 0x1

    div-int/lit8 v24, v20, 0x3

    add-int v24, v24, v24

    add-int/lit8 v24, v24, 0x1

    aget-object v10, v15, v10

    aput-object v10, v9, v24

    :goto_13
    move v10, v0

    :cond_20
    move/from16 v0, v26

    goto :goto_15

    :goto_14
    add-int/lit8 v0, v10, 0x1

    div-int/lit8 v24, v20, 0x3

    add-int v24, v24, v24

    add-int/lit8 v28, v24, 0x1

    aget-object v2, v15, v10

    aput-object v2, v9, v28

    goto :goto_13

    :goto_15
    add-int/2addr v6, v6

    aget-object v2, v15, v6

    move/from16 v26, v0

    instance-of v0, v2, Ljava/lang/reflect/Field;

    if-eqz v0, :cond_21

    check-cast v2, Ljava/lang/reflect/Field;

    :goto_16
    move/from16 v28, v6

    move v0, v7

    goto :goto_17

    :cond_21
    check-cast v2, Ljava/lang/String;

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/play_billing/a6;->K(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    aput-object v2, v15, v6

    add-int/lit8 v0, v21, 0x1

    aput v20, v16, v21

    move/from16 v21, v0

    goto :goto_16

    :goto_17
    invoke-virtual {v14, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v6

    long-to-int v2, v6

    add-int/lit8 v6, v28, 0x1

    aget-object v7, v15, v6

    move/from16 v30, v0

    instance-of v0, v7, Ljava/lang/reflect/Field;

    if-eqz v0, :cond_22

    check-cast v7, Ljava/lang/reflect/Field;

    goto :goto_18

    :cond_22
    check-cast v7, Ljava/lang/String;

    invoke-static {v3, v7}, Lcom/google/android/gms/internal/play_billing/a6;->K(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v7

    aput-object v7, v15, v6

    :goto_18
    invoke-virtual {v14, v7}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v6

    long-to-int v0, v6

    move-object v7, v1

    move v6, v2

    const/4 v2, 0x0

    const v23, 0xd800

    :goto_19
    move v1, v0

    move/from16 v0, v26

    goto/16 :goto_24

    :cond_23
    move/from16 v29, v2

    move/from16 v30, v7

    add-int/lit8 v0, v10, 0x1

    aget-object v2, v15, v10

    check-cast v2, Ljava/lang/String;

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/play_billing/a6;->K(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    const/16 v7, 0x9

    if-eq v5, v7, :cond_24

    const/16 v7, 0x11

    if-ne v5, v7, :cond_25

    :cond_24
    move/from16 v27, v0

    const/4 v0, 0x1

    goto/16 :goto_1e

    :cond_25
    const/16 v7, 0x1b

    if-eq v5, v7, :cond_2d

    const/16 v7, 0x31

    if-ne v5, v7, :cond_26

    add-int/lit8 v10, v10, 0x2

    move/from16 v27, v0

    const/4 v0, 0x1

    goto/16 :goto_1d

    :cond_26
    const/16 v7, 0xc

    if-eq v5, v7, :cond_2a

    const/16 v7, 0x1e

    if-eq v5, v7, :cond_2a

    const/16 v7, 0x2c

    if-ne v5, v7, :cond_27

    goto :goto_1b

    :cond_27
    const/16 v7, 0x32

    if-ne v5, v7, :cond_29

    add-int/lit8 v7, v10, 0x2

    add-int/lit8 v27, v22, 0x1

    aput v20, v16, v22

    div-int/lit8 v22, v20, 0x3

    aget-object v0, v15, v0

    add-int v22, v22, v22

    aput-object v0, v9, v22

    if-eqz v26, :cond_28

    add-int/lit8 v22, v22, 0x1

    add-int/lit8 v0, v10, 0x3

    aget-object v7, v15, v7

    aput-object v7, v9, v22

    move v10, v0

    move-object v7, v1

    move/from16 v22, v27

    goto :goto_20

    :cond_28
    move v10, v7

    move/from16 v22, v27

    const/16 v26, 0x0

    :goto_1a
    move-object v7, v1

    goto :goto_20

    :cond_29
    move/from16 v27, v0

    const/4 v0, 0x1

    goto :goto_1f

    :cond_2a
    :goto_1b
    invoke-virtual/range {v25 .. v25}, Lcom/google/android/gms/internal/play_billing/g6;->zzc()I

    move-result v7

    move/from16 v27, v0

    const/4 v0, 0x1

    if-eq v7, v0, :cond_2c

    if-eqz v26, :cond_2b

    goto :goto_1c

    :cond_2b
    move-object v7, v1

    move/from16 v10, v27

    const/16 v26, 0x0

    goto :goto_20

    :cond_2c
    :goto_1c
    add-int/lit8 v10, v10, 0x2

    div-int/lit8 v7, v20, 0x3

    add-int/2addr v7, v7

    add-int/2addr v7, v0

    aget-object v24, v15, v27

    aput-object v24, v9, v7

    goto :goto_1a

    :cond_2d
    move/from16 v27, v0

    const/4 v0, 0x1

    add-int/lit8 v10, v10, 0x2

    :goto_1d
    div-int/lit8 v7, v20, 0x3

    add-int/2addr v7, v7

    add-int/2addr v7, v0

    aget-object v24, v15, v27

    aput-object v24, v9, v7

    goto :goto_1a

    :goto_1e
    div-int/lit8 v7, v20, 0x3

    add-int/2addr v7, v7

    add-int/2addr v7, v0

    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v10

    aput-object v10, v9, v7

    :goto_1f
    move-object v7, v1

    move/from16 v10, v27

    :goto_20
    invoke-virtual {v14, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v0

    long-to-int v2, v0

    and-int/lit16 v0, v8, 0x1000

    const v1, 0xfffff

    if-eqz v0, :cond_31

    const/16 v0, 0x11

    if-gt v5, v0, :cond_31

    add-int/lit8 v0, v6, 0x1

    invoke-virtual {v7, v6}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const v6, 0xd800

    if-lt v1, v6, :cond_2f

    and-int/lit16 v1, v1, 0x1fff

    const/16 v23, 0xd

    :goto_21
    add-int/lit8 v27, v0, 0x1

    invoke-virtual {v7, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-lt v0, v6, :cond_2e

    and-int/lit16 v0, v0, 0x1fff

    shl-int v0, v0, v23

    or-int/2addr v1, v0

    add-int/lit8 v23, v23, 0xd

    move/from16 v0, v27

    goto :goto_21

    :cond_2e
    shl-int v0, v0, v23

    or-int/2addr v1, v0

    move/from16 v0, v27

    :cond_2f
    add-int v23, v30, v30

    div-int/lit8 v27, v1, 0x20

    add-int v23, v23, v27

    aget-object v6, v15, v23

    move/from16 v28, v0

    instance-of v0, v6, Ljava/lang/reflect/Field;

    if-eqz v0, :cond_30

    check-cast v6, Ljava/lang/reflect/Field;

    :goto_22
    move/from16 v23, v1

    goto :goto_23

    :cond_30
    check-cast v6, Ljava/lang/String;

    invoke-static {v3, v6}, Lcom/google/android/gms/internal/play_billing/a6;->K(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v6

    aput-object v6, v15, v23

    goto :goto_22

    :goto_23
    invoke-virtual {v14, v6}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v0

    long-to-int v0, v0

    rem-int/lit8 v1, v23, 0x20

    move v6, v2

    move/from16 v27, v28

    const v23, 0xd800

    move v2, v1

    goto/16 :goto_19

    :cond_31
    const v23, 0xd800

    move/from16 v27, v6

    move/from16 v0, v26

    move v6, v2

    const/4 v2, 0x0

    :goto_24
    add-int/lit8 v26, v20, 0x1

    aput v4, v11, v20

    add-int/lit8 v4, v20, 0x2

    move/from16 v28, v0

    and-int/lit16 v0, v8, 0x200

    if-eqz v0, :cond_32

    const/high16 v0, 0x20000000

    goto :goto_25

    :cond_32
    const/4 v0, 0x0

    :goto_25
    and-int/lit16 v8, v8, 0x100

    if-eqz v8, :cond_33

    const/high16 v8, 0x10000000

    goto :goto_26

    :cond_33
    const/4 v8, 0x0

    :goto_26
    if-eqz v28, :cond_34

    const/high16 v28, -0x80000000

    goto :goto_27

    :cond_34
    const/16 v28, 0x0

    :goto_27
    shl-int/lit8 v5, v5, 0x14

    or-int/2addr v0, v8

    or-int v0, v0, v28

    or-int/2addr v0, v5

    or-int/2addr v0, v6

    aput v0, v11, v26

    add-int/lit8 v20, v20, 0x3

    shl-int/lit8 v0, v2, 0x14

    or-int/2addr v0, v1

    aput v0, v11, v4

    move-object v1, v7

    move/from16 v5, v23

    move-object/from16 v0, v25

    move/from16 v4, v27

    move/from16 v2, v29

    move/from16 v7, v30

    goto/16 :goto_b

    :cond_35
    move-object/from16 v25, v0

    new-instance v0, Lcom/google/android/gms/internal/play_billing/a6;

    invoke-virtual/range {v25 .. v25}, Lcom/google/android/gms/internal/play_billing/g6;->zza()Lcom/google/android/gms/internal/play_billing/x5;

    move-result-object v14

    const/4 v15, 0x0

    move-object/from16 v19, p2

    move-object/from16 v20, p3

    move-object/from16 v21, p4

    move-object/from16 v22, p5

    move-object/from16 v23, p6

    move-object v10, v11

    move-object v11, v9

    move-object v9, v0

    invoke-direct/range {v9 .. v23}, Lcom/google/android/gms/internal/play_billing/a6;-><init>([I[Ljava/lang/Object;IILcom/google/android/gms/internal/play_billing/x5;Z[IIILcom/google/android/gms/internal/play_billing/c6;Lcom/google/android/gms/internal/play_billing/i5;Lcom/google/android/gms/internal/play_billing/t6;Lcom/google/android/gms/internal/play_billing/g4;Lcom/google/android/gms/internal/play_billing/s5;)V

    return-object v9

    :cond_36
    check-cast v0, Lcom/google/android/gms/internal/play_billing/q6;

    const/4 v0, 0x0

    throw v0
.end method

.method public static y(Ljava/lang/Object;J)I
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method


# virtual methods
.method public final A(II)I
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/a6;->a:[I

    array-length v1, v0

    div-int/lit8 v1, v1, 0x3

    const/4 v2, -0x1

    add-int/2addr v1, v2

    :goto_0
    if-gt p2, v1, :cond_2

    add-int v3, v1, p2

    ushr-int/lit8 v3, v3, 0x1

    mul-int/lit8 v4, v3, 0x3

    aget v5, v0, v4

    if-ne p1, v5, :cond_0

    return v4

    :cond_0
    if-ge p1, v5, :cond_1

    add-int/lit8 v1, v3, -0x1

    goto :goto_0

    :cond_1
    add-int/lit8 p2, v3, 0x1

    goto :goto_0

    :cond_2
    return v2
.end method

.method public final C(I)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/a6;->a:[I

    add-int/lit8 p1, p1, 0x1

    aget p1, v0, p1

    return p1
.end method

.method public final E(I)Lcom/google/android/gms/internal/play_billing/w4;
    .locals 1

    div-int/lit8 p1, p1, 0x3

    add-int/2addr p1, p1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/a6;->b:[Ljava/lang/Object;

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/w4;

    return-object p1
.end method

.method public final F(I)Lcom/google/android/gms/internal/play_billing/h6;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/a6;->b:[Ljava/lang/Object;

    div-int/lit8 p1, p1, 0x3

    add-int/2addr p1, p1

    aget-object v1, v0, p1

    check-cast v1, Lcom/google/android/gms/internal/play_billing/h6;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v1, p1, 0x1

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/e6;->a()Lcom/google/android/gms/internal/play_billing/e6;

    move-result-object v2

    aget-object v1, v0, v1

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/play_billing/e6;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object v1

    aput-object v1, v0, p1

    return-object v1
.end method

.method public final G(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/t6;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/a6;->a:[I

    aget v0, v0, p2

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/play_billing/a6;->C(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-static {p1, v1, v2}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/play_billing/a6;->E(I)Lcom/google/android/gms/internal/play_billing/w4;

    move-result-object v1

    if-nez v1, :cond_1

    :goto_0
    return-object p3

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/play_billing/r5;

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/play_billing/a6;->H(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/q5;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/q5;->c()Lcom/google/android/gms/internal/play_billing/p5;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/play_billing/w4;->a(I)Z

    move-result v2

    if-nez v2, :cond_2

    if-nez p3, :cond_3

    invoke-virtual {p4, p5}, Lcom/google/android/gms/internal/play_billing/t6;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    :cond_3
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v4, v2, v3}, Lcom/google/android/gms/internal/play_billing/q5;->b(Lcom/google/android/gms/internal/play_billing/p5;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    sget-object v3, Lcom/google/android/gms/internal/play_billing/s3;->b:Lcom/google/android/gms/internal/play_billing/s3;

    new-array v3, v2, [B

    sget-boolean v5, Lcom/google/android/gms/internal/play_billing/a4;->b:Z

    new-instance v5, Lcom/google/android/gms/internal/play_billing/x3;

    const/4 v6, 0x0

    invoke-direct {v5, v3, v6, v2}, Lcom/google/android/gms/internal/play_billing/x3;-><init>([BII)V

    :try_start_0
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-static {v5, v4, v2, p2}, Lcom/google/android/gms/internal/play_billing/q5;->d(Lcom/google/android/gms/internal/play_billing/a4;Lcom/google/android/gms/internal/play_billing/p5;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {v5, v3}, Lcom/google/android/gms/internal/play_billing/o3;->a(Lcom/google/android/gms/internal/play_billing/a4;[B)Lcom/google/android/gms/internal/play_billing/s3;

    move-result-object p2

    shl-int/lit8 v2, v0, 0x3

    move-object v3, p3

    check-cast v3, Lcom/google/android/gms/internal/play_billing/u6;

    or-int/lit8 v2, v2, 0x2

    invoke-virtual {v3, v2, p2}, Lcom/google/android/gms/internal/play_billing/u6;->j(ILjava/lang/Object;)V

    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_4
    return-object p3
.end method

.method public final H(I)Ljava/lang/Object;
    .locals 1

    div-int/lit8 p1, p1, 0x3

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/a6;->b:[Ljava/lang/Object;

    add-int/2addr p1, p1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final I(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object v0

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/play_billing/a6;->C(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/a6;->n(Ljava/lang/Object;I)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/play_billing/h6;->zze()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    int-to-long v1, v1

    sget-object p2, Lcom/google/android/gms/internal/play_billing/a6;->m:Lsun/misc/Unsafe;

    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/a6;->q(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/play_billing/h6;->zze()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, Lcom/google/android/gms/internal/play_billing/h6;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method public final J(Ljava/lang/Object;II)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/play_billing/h6;->zze()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p2, Lcom/google/android/gms/internal/play_billing/a6;->m:Lsun/misc/Unsafe;

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/play_billing/a6;->C(I)I

    move-result p3

    const v1, 0xfffff

    and-int/2addr p3, v1

    int-to-long v1, p3

    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/a6;->q(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/play_billing/h6;->zze()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, Lcom/google/android/gms/internal/play_billing/h6;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method public final a(Ljava/lang/Object;)Z
    .locals 14

    const/4 v0, 0x0

    const v1, 0xfffff

    move v2, v0

    move v4, v2

    move v3, v1

    :goto_0
    iget v5, p0, Lcom/google/android/gms/internal/play_billing/a6;->h:I

    const/4 v6, 0x1

    if-ge v2, v5, :cond_a

    iget-object v5, p0, Lcom/google/android/gms/internal/play_billing/a6;->g:[I

    aget v9, v5, v2

    invoke-virtual {p0, v9}, Lcom/google/android/gms/internal/play_billing/a6;->C(I)I

    move-result v5

    iget-object v13, p0, Lcom/google/android/gms/internal/play_billing/a6;->a:[I

    add-int/lit8 v7, v9, 0x2

    aget v7, v13, v7

    and-int v8, v7, v1

    ushr-int/lit8 v7, v7, 0x14

    shl-int v12, v6, v7

    if-eq v8, v3, :cond_1

    if-eq v8, v1, :cond_0

    int-to-long v3, v8

    sget-object v6, Lcom/google/android/gms/internal/play_billing/a6;->m:Lsun/misc/Unsafe;

    invoke-virtual {v6, p1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v4

    :cond_0
    move v11, v4

    move v10, v8

    goto :goto_1

    :cond_1
    move v10, v3

    move v11, v4

    :goto_1
    const/high16 v3, 0x10000000

    and-int/2addr v3, v5

    move-object v7, p0

    move-object v8, p1

    if-eqz v3, :cond_2

    invoke-virtual/range {v7 .. v12}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result p1

    if-nez p1, :cond_2

    return v0

    :cond_2
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a6;->B(I)I

    move-result p1

    const/16 v3, 0x9

    if-eq p1, v3, :cond_8

    const/16 v3, 0x11

    if-eq p1, v3, :cond_8

    const/16 v3, 0x1b

    if-eq p1, v3, :cond_6

    const/16 v3, 0x3c

    if-eq p1, v3, :cond_5

    const/16 v3, 0x44

    if-eq p1, v3, :cond_5

    const/16 v3, 0x31

    if-eq p1, v3, :cond_6

    const/16 v3, 0x32

    if-eq p1, v3, :cond_3

    goto :goto_3

    :cond_3
    and-int p1, v5, v1

    int-to-long v3, p1

    invoke-static {v8, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/r5;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p0, v9}, Lcom/google/android/gms/internal/play_billing/a6;->H(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/q5;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/q5;->c()Lcom/google/android/gms/internal/play_billing/p5;

    const/4 p1, 0x0

    throw p1

    :cond_5
    aget p1, v13, v9

    invoke-virtual {p0, v8, p1, v9}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-virtual {p0, v9}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object p1

    invoke-static {v8, v5, p1}, Lcom/google/android/gms/internal/play_billing/a6;->p(Ljava/lang/Object;ILcom/google/android/gms/internal/play_billing/h6;)Z

    move-result p1

    if-nez p1, :cond_9

    return v0

    :cond_6
    and-int p1, v5, v1

    int-to-long v3, p1

    invoke-static {v8, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_9

    invoke-virtual {p0, v9}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object v3

    move v4, v0

    :goto_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    if-ge v4, v5, :cond_9

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v3, v5}, Lcom/google/android/gms/internal/play_billing/h6;->a(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    return v0

    :cond_7
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_8
    invoke-virtual/range {v7 .. v12}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-virtual {p0, v9}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object p1

    invoke-static {v8, v5, p1}, Lcom/google/android/gms/internal/play_billing/a6;->p(Ljava/lang/Object;ILcom/google/android/gms/internal/play_billing/h6;)Z

    move-result p1

    if-nez p1, :cond_9

    return v0

    :cond_9
    :goto_3
    add-int/lit8 v2, v2, 0x1

    move-object p1, v8

    move v3, v10

    move v4, v11

    goto/16 :goto_0

    :cond_a
    move-object v7, p0

    move-object v8, p1

    iget-boolean p1, v7, Lcom/google/android/gms/internal/play_billing/a6;->f:Z

    if-eqz p1, :cond_b

    move-object p1, v8

    check-cast p1, Lcom/google/android/gms/internal/play_billing/q4;

    iget-object p1, p1, Lcom/google/android/gms/internal/play_billing/q4;->zzb:Lcom/google/android/gms/internal/play_billing/k4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/k4;->i()Z

    move-result p1

    if-nez p1, :cond_b

    return v0

    :cond_b
    return v6
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 7

    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/a6;->q(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/play_billing/t4;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/play_billing/t4;

    const v2, 0x7fffffff

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/play_billing/t4;->j(I)V

    iput v1, v0, Lcom/google/android/gms/internal/play_billing/c3;->zza:I

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/t4;->h()V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/a6;->a:[I

    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/play_billing/a6;->C(I)I

    move-result v2

    const v3, 0xfffff

    and-int/2addr v3, v2

    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/a6;->B(I)I

    move-result v2

    int-to-long v3, v3

    const/16 v5, 0x9

    if-eq v2, v5, :cond_3

    const/16 v5, 0x3c

    if-eq v2, v5, :cond_2

    const/16 v5, 0x44

    if-eq v2, v5, :cond_2

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    sget-object v2, Lcom/google/android/gms/internal/play_billing/a6;->m:Lsun/misc/Unsafe;

    invoke-virtual {v2, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_4

    move-object v6, v5

    check-cast v6, Lcom/google/android/gms/internal/play_billing/r5;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/play_billing/r5;->c()V

    invoke-virtual {v2, p1, v3, v4, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/play_billing/y4;

    invoke-interface {v2}, Lcom/google/android/gms/internal/play_billing/y4;->zzb()V

    goto :goto_1

    :cond_2
    aget v2, v0, v1

    invoke-virtual {p0, p1, v2, v1}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object v2

    sget-object v5, Lcom/google/android/gms/internal/play_billing/a6;->m:Lsun/misc/Unsafe;

    invoke-virtual {v5, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/play_billing/h6;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    :pswitch_2
    invoke-virtual {p0, p1, v1}, Lcom/google/android/gms/internal/play_billing/a6;->n(Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object v2

    sget-object v5, Lcom/google/android/gms/internal/play_billing/a6;->m:Lsun/misc/Unsafe;

    invoke-virtual {v5, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/play_billing/h6;->b(Ljava/lang/Object;)V

    :cond_4
    :goto_1
    add-int/lit8 v1, v1, 0x3

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/a6;->j:Lcom/google/android/gms/internal/play_billing/t6;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/t6;->b(Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/play_billing/a6;->f:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/a6;->k:Lcom/google/android/gms/internal/play_billing/g4;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/g4;->a(Ljava/lang/Object;)V

    :cond_6
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/a6;->L(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/a6;->a:[I

    array-length v2, v1

    if-ge v0, v2, :cond_4

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/play_billing/a6;->C(I)I

    move-result v2

    const v3, 0xfffff

    and-int/2addr v3, v2

    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/a6;->B(I)I

    move-result v2

    aget v1, v1, v0

    int-to-long v3, v3

    packed-switch v2, :pswitch_data_0

    goto/16 :goto_2

    :pswitch_0
    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/play_billing/a6;->h(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_1
    invoke-virtual {p0, p2, v1, v0}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p1, v3, v4, v2}, Lcom/google/android/gms/internal/play_billing/a7;->w(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v1, v0}, Lcom/google/android/gms/internal/play_billing/a6;->j(Ljava/lang/Object;II)V

    goto/16 :goto_2

    :pswitch_2
    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/play_billing/a6;->h(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_3
    invoke-virtual {p0, p2, v1, v0}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p1, v3, v4, v2}, Lcom/google/android/gms/internal/play_billing/a7;->w(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v1, v0}, Lcom/google/android/gms/internal/play_billing/a6;->j(Ljava/lang/Object;II)V

    goto/16 :goto_2

    :pswitch_4
    sget-object v1, Lcom/google/android/gms/internal/play_billing/i6;->a:Lcom/google/android/gms/internal/play_billing/t6;

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/s5;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/play_billing/a7;->w(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_5
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/play_billing/y4;

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/play_billing/y4;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    if-lez v5, :cond_1

    if-lez v6, :cond_1

    invoke-interface {v1}, Lcom/google/android/gms/internal/play_billing/y4;->zzc()Z

    move-result v7

    if-nez v7, :cond_0

    add-int/2addr v6, v5

    invoke-interface {v1, v6}, Lcom/google/android/gms/internal/play_billing/y4;->r(I)Lcom/google/android/gms/internal/play_billing/y4;

    move-result-object v1

    :cond_0
    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    if-gtz v5, :cond_2

    goto :goto_1

    :cond_2
    move-object v2, v1

    :goto_1
    invoke-static {p1, v3, v4, v2}, Lcom/google/android/gms/internal/play_billing/a7;->w(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_6
    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/play_billing/a6;->g(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_7
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/a6;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->h(Ljava/lang/Object;J)J

    move-result-wide v1

    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/android/gms/internal/play_billing/a7;->v(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/a6;->i(Ljava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_8
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/a6;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/play_billing/a7;->u(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/a6;->i(Ljava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_9
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/a6;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->h(Ljava/lang/Object;J)J

    move-result-wide v1

    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/android/gms/internal/play_billing/a7;->v(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/a6;->i(Ljava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_a
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/a6;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/play_billing/a7;->u(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/a6;->i(Ljava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_b
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/a6;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/play_billing/a7;->u(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/a6;->i(Ljava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_c
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/a6;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/play_billing/a7;->u(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/a6;->i(Ljava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_d
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/a6;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/play_billing/a7;->w(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/a6;->i(Ljava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_e
    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/play_billing/a6;->g(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_f
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/a6;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/play_billing/a7;->w(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/a6;->i(Ljava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_10
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/a6;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->A(Ljava/lang/Object;J)Z

    move-result v1

    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/play_billing/a7;->q(Ljava/lang/Object;JZ)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/a6;->i(Ljava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_11
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/a6;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/play_billing/a7;->u(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/a6;->i(Ljava/lang/Object;I)V

    goto :goto_2

    :pswitch_12
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/a6;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->h(Ljava/lang/Object;J)J

    move-result-wide v1

    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/android/gms/internal/play_billing/a7;->v(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/a6;->i(Ljava/lang/Object;I)V

    goto :goto_2

    :pswitch_13
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/a6;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/play_billing/a7;->u(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/a6;->i(Ljava/lang/Object;I)V

    goto :goto_2

    :pswitch_14
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/a6;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->h(Ljava/lang/Object;J)J

    move-result-wide v1

    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/android/gms/internal/play_billing/a7;->v(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/a6;->i(Ljava/lang/Object;I)V

    goto :goto_2

    :pswitch_15
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/a6;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->h(Ljava/lang/Object;J)J

    move-result-wide v1

    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/android/gms/internal/play_billing/a7;->v(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/a6;->i(Ljava/lang/Object;I)V

    goto :goto_2

    :pswitch_16
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/a6;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->f(Ljava/lang/Object;J)F

    move-result v1

    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/play_billing/a7;->t(Ljava/lang/Object;JF)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/a6;->i(Ljava/lang/Object;I)V

    goto :goto_2

    :pswitch_17
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/a6;->n(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->e(Ljava/lang/Object;J)D

    move-result-wide v1

    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/android/gms/internal/play_billing/a7;->s(Ljava/lang/Object;JD)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/a6;->i(Ljava/lang/Object;I)V

    :cond_3
    :goto_2
    add-int/lit8 v0, v0, 0x3

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/a6;->j:Lcom/google/android/gms/internal/play_billing/t6;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/play_billing/i6;->u(Lcom/google/android/gms/internal/play_billing/t6;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/play_billing/a6;->f:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/a6;->k:Lcom/google/android/gms/internal/play_billing/g4;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/play_billing/i6;->t(Lcom/google/android/gms/internal/play_billing/g4;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/play_billing/a6;->a:[I

    array-length v2, v2

    const v3, 0xfffff

    if-ge v1, v2, :cond_3

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/play_billing/a6;->C(I)I

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/a6;->B(I)I

    move-result v4

    const/16 v5, 0x32

    if-le v4, v5, :cond_0

    const/16 v5, 0x45

    if-ge v4, v5, :cond_0

    goto/16 :goto_2

    :cond_0
    and-int/2addr v2, v3

    int-to-long v2, v2

    packed-switch v4, :pswitch_data_0

    goto/16 :goto_2

    :pswitch_0
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/a6;->r(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/google/android/gms/internal/play_billing/i6;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto/16 :goto_2

    :pswitch_1
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/google/android/gms/internal/play_billing/i6;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    goto :goto_1

    :pswitch_2
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/google/android/gms/internal/play_billing/i6;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    :goto_1
    if-nez v2, :cond_1

    goto/16 :goto_3

    :pswitch_3
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/a6;->m(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/google/android/gms/internal/play_billing/i6;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto/16 :goto_2

    :pswitch_4
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/a6;->m(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->h(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->h(Ljava/lang/Object;J)J

    move-result-wide v2

    cmp-long v2, v4, v2

    if-nez v2, :cond_2

    goto/16 :goto_2

    :pswitch_5
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/a6;->m(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result v4

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result v2

    if-ne v4, v2, :cond_2

    goto/16 :goto_2

    :pswitch_6
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/a6;->m(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->h(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->h(Ljava/lang/Object;J)J

    move-result-wide v2

    cmp-long v2, v4, v2

    if-nez v2, :cond_2

    goto/16 :goto_2

    :pswitch_7
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/a6;->m(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result v4

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result v2

    if-ne v4, v2, :cond_2

    goto/16 :goto_2

    :pswitch_8
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/a6;->m(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result v4

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result v2

    if-ne v4, v2, :cond_2

    goto/16 :goto_2

    :pswitch_9
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/a6;->m(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result v4

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result v2

    if-ne v4, v2, :cond_2

    goto/16 :goto_2

    :pswitch_a
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/a6;->m(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/google/android/gms/internal/play_billing/i6;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto/16 :goto_2

    :pswitch_b
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/a6;->m(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/google/android/gms/internal/play_billing/i6;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto/16 :goto_2

    :pswitch_c
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/a6;->m(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/google/android/gms/internal/play_billing/i6;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto/16 :goto_2

    :pswitch_d
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/a6;->m(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->A(Ljava/lang/Object;J)Z

    move-result v4

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->A(Ljava/lang/Object;J)Z

    move-result v2

    if-ne v4, v2, :cond_2

    goto/16 :goto_2

    :pswitch_e
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/a6;->m(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result v4

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result v2

    if-ne v4, v2, :cond_2

    goto/16 :goto_2

    :pswitch_f
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/a6;->m(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->h(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->h(Ljava/lang/Object;J)J

    move-result-wide v2

    cmp-long v2, v4, v2

    if-nez v2, :cond_2

    goto :goto_2

    :pswitch_10
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/a6;->m(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result v4

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result v2

    if-ne v4, v2, :cond_2

    goto :goto_2

    :pswitch_11
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/a6;->m(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->h(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->h(Ljava/lang/Object;J)J

    move-result-wide v2

    cmp-long v2, v4, v2

    if-nez v2, :cond_2

    goto :goto_2

    :pswitch_12
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/a6;->m(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->h(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->h(Ljava/lang/Object;J)J

    move-result-wide v2

    cmp-long v2, v4, v2

    if-nez v2, :cond_2

    goto :goto_2

    :pswitch_13
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/a6;->m(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->f(Ljava/lang/Object;J)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->f(Ljava/lang/Object;J)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v2

    if-ne v4, v2, :cond_2

    goto :goto_2

    :pswitch_14
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/a6;->m(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->e(Ljava/lang/Object;J)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->e(Ljava/lang/Object;J)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    cmp-long v2, v4, v2

    if-nez v2, :cond_2

    :cond_1
    :goto_2
    add-int/lit8 v1, v1, 0x3

    goto/16 :goto_0

    :cond_2
    :goto_3
    return v0

    :cond_3
    iget v1, p0, Lcom/google/android/gms/internal/play_billing/a6;->i:I

    :goto_4
    iget-object v2, p0, Lcom/google/android/gms/internal/play_billing/a6;->g:[I

    array-length v4, v2

    if-ge v1, v4, :cond_7

    aget v2, v2, v1

    invoke-virtual {p0, p1, p2, v2}, Lcom/google/android/gms/internal/play_billing/a6;->r(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v4

    if-nez v4, :cond_4

    return v0

    :cond_4
    invoke-virtual {p0, p1, v0, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/play_billing/a6;->C(I)I

    move-result v2

    and-int/2addr v2, v3

    int-to-long v4, v2

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/google/android/gms/internal/play_billing/i6;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    return v0

    :cond_6
    :goto_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_7
    move-object v1, p1

    check-cast v1, Lcom/google/android/gms/internal/play_billing/t4;

    iget-object v1, v1, Lcom/google/android/gms/internal/play_billing/t4;->zzc:Lcom/google/android/gms/internal/play_billing/u6;

    move-object v2, p2

    check-cast v2, Lcom/google/android/gms/internal/play_billing/t4;

    iget-object v2, v2, Lcom/google/android/gms/internal/play_billing/t4;->zzc:Lcom/google/android/gms/internal/play_billing/u6;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v0

    :cond_8
    iget-boolean v0, p0, Lcom/google/android/gms/internal/play_billing/a6;->f:Z

    if-eqz v0, :cond_9

    check-cast p1, Lcom/google/android/gms/internal/play_billing/q4;

    iget-object p1, p1, Lcom/google/android/gms/internal/play_billing/q4;->zzb:Lcom/google/android/gms/internal/play_billing/k4;

    check-cast p2, Lcom/google/android/gms/internal/play_billing/q4;

    iget-object p2, p2, Lcom/google/android/gms/internal/play_billing/q4;->zzb:Lcom/google/android/gms/internal/play_billing/k4;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/play_billing/k4;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_9
    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Ljava/lang/Object;Lcom/google/android/gms/internal/play_billing/i7;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v6, p2

    iget-boolean v2, v0, Lcom/google/android/gms/internal/play_billing/a6;->f:Z

    const/4 v7, 0x0

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/google/android/gms/internal/play_billing/q4;

    iget-object v2, v2, Lcom/google/android/gms/internal/play_billing/q4;->zzb:Lcom/google/android/gms/internal/play_billing/k4;

    iget-object v3, v2, Lcom/google/android/gms/internal/play_billing/k4;->a:Lcom/google/android/gms/internal/play_billing/p6;

    invoke-virtual {v3}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Lcom/google/android/gms/internal/play_billing/k4;->f()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    move-object v8, v2

    goto :goto_0

    :cond_0
    move-object v8, v7

    :goto_0
    iget-object v9, v0, Lcom/google/android/gms/internal/play_billing/a6;->a:[I

    sget-object v10, Lcom/google/android/gms/internal/play_billing/a6;->m:Lsun/misc/Unsafe;

    const v11, 0xfffff

    move v3, v11

    const/4 v2, 0x0

    const/4 v4, 0x0

    :goto_1
    array-length v5, v9

    if-ge v2, v5, :cond_8

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/play_billing/a6;->C(I)I

    move-result v5

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a6;->B(I)I

    move-result v13

    aget v14, v9, v2

    const/16 v15, 0x11

    if-gt v13, v15, :cond_3

    add-int/lit8 v15, v2, 0x2

    aget v15, v9, v15

    const/16 v16, 0x1

    and-int v12, v15, v11

    if-eq v12, v3, :cond_2

    if-ne v12, v11, :cond_1

    const/4 v4, 0x0

    goto :goto_2

    :cond_1
    int-to-long v3, v12

    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    move v4, v3

    :goto_2
    move v3, v12

    :cond_2
    ushr-int/lit8 v12, v15, 0x14

    shl-int v12, v16, v12

    move/from16 v18, v12

    move v12, v5

    move/from16 v5, v18

    goto :goto_3

    :cond_3
    const/16 v16, 0x1

    move v12, v5

    const/4 v5, 0x0

    :goto_3
    if-nez v8, :cond_7

    and-int/2addr v12, v11

    int-to-long v11, v12

    packed-switch v13, :pswitch_data_0

    :cond_4
    :goto_4
    move-object/from16 v17, v7

    :cond_5
    :goto_5
    const/4 v13, 0x0

    goto/16 :goto_8

    :pswitch_0
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object v11

    invoke-interface {v6, v14, v5, v11}, Lcom/google/android/gms/internal/play_billing/i7;->s(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/h6;)V

    goto :goto_4

    :pswitch_1
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/play_billing/a6;->D(Ljava/lang/Object;J)J

    move-result-wide v11

    invoke-interface {v6, v14, v11, v12}, Lcom/google/android/gms/internal/play_billing/i7;->r(IJ)V

    goto :goto_4

    :pswitch_2
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/play_billing/a6;->y(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v6, v14, v5}, Lcom/google/android/gms/internal/play_billing/i7;->x(II)V

    goto :goto_4

    :pswitch_3
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/play_billing/a6;->D(Ljava/lang/Object;J)J

    move-result-wide v11

    invoke-interface {v6, v14, v11, v12}, Lcom/google/android/gms/internal/play_billing/i7;->j(IJ)V

    goto :goto_4

    :pswitch_4
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/play_billing/a6;->y(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v6, v14, v5}, Lcom/google/android/gms/internal/play_billing/i7;->z(II)V

    goto :goto_4

    :pswitch_5
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/play_billing/a6;->y(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v6, v14, v5}, Lcom/google/android/gms/internal/play_billing/i7;->e(II)V

    goto :goto_4

    :pswitch_6
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/play_billing/a6;->y(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v6, v14, v5}, Lcom/google/android/gms/internal/play_billing/i7;->K(II)V

    goto :goto_4

    :pswitch_7
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/play_billing/s3;

    invoke-interface {v6, v14, v5}, Lcom/google/android/gms/internal/play_billing/i7;->E(ILcom/google/android/gms/internal/play_billing/s3;)V

    goto :goto_4

    :pswitch_8
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object v11

    invoke-interface {v6, v14, v5, v11}, Lcom/google/android/gms/internal/play_billing/i7;->H(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/h6;)V

    goto/16 :goto_4

    :pswitch_9
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v14, v5, v6}, Lcom/google/android/gms/internal/play_billing/a6;->u(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/i7;)V

    goto/16 :goto_4

    :pswitch_a
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    invoke-interface {v6, v14, v5}, Lcom/google/android/gms/internal/play_billing/i7;->i(IZ)V

    goto/16 :goto_4

    :pswitch_b
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/play_billing/a6;->y(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v6, v14, v5}, Lcom/google/android/gms/internal/play_billing/i7;->d(II)V

    goto/16 :goto_4

    :pswitch_c
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/play_billing/a6;->D(Ljava/lang/Object;J)J

    move-result-wide v11

    invoke-interface {v6, v14, v11, v12}, Lcom/google/android/gms/internal/play_billing/i7;->L(IJ)V

    goto/16 :goto_4

    :pswitch_d
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/play_billing/a6;->y(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v6, v14, v5}, Lcom/google/android/gms/internal/play_billing/i7;->o(II)V

    goto/16 :goto_4

    :pswitch_e
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/play_billing/a6;->D(Ljava/lang/Object;J)J

    move-result-wide v11

    invoke-interface {v6, v14, v11, v12}, Lcom/google/android/gms/internal/play_billing/i7;->C(IJ)V

    goto/16 :goto_4

    :pswitch_f
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/play_billing/a6;->D(Ljava/lang/Object;J)J

    move-result-wide v11

    invoke-interface {v6, v14, v11, v12}, Lcom/google/android/gms/internal/play_billing/i7;->k(IJ)V

    goto/16 :goto_4

    :pswitch_10
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Float;

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-interface {v6, v14, v5}, Lcom/google/android/gms/internal/play_billing/i7;->F(IF)V

    goto/16 :goto_4

    :pswitch_11
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Double;

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v11

    invoke-interface {v6, v14, v11, v12}, Lcom/google/android/gms/internal/play_billing/i7;->a(ID)V

    goto/16 :goto_4

    :pswitch_12
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/play_billing/a6;->H(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/internal/play_billing/q5;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/play_billing/q5;->c()Lcom/google/android/gms/internal/play_billing/p5;

    check-cast v5, Lcom/google/android/gms/internal/play_billing/r5;

    invoke-interface {v6, v14, v7, v5}, Lcom/google/android/gms/internal/play_billing/i7;->u(ILcom/google/android/gms/internal/play_billing/p5;Ljava/util/Map;)V

    goto/16 :goto_4

    :pswitch_13
    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object v12

    sget-object v13, Lcom/google/android/gms/internal/play_billing/i6;->a:Lcom/google/android/gms/internal/play_billing/t6;

    if-eqz v11, :cond_4

    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_4

    const/4 v13, 0x0

    :goto_6
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v14

    if-ge v13, v14, :cond_4

    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    move-object/from16 v17, v7

    move-object v7, v6

    check-cast v7, Lcom/google/android/gms/internal/play_billing/b4;

    invoke-virtual {v7, v5, v14, v12}, Lcom/google/android/gms/internal/play_billing/b4;->s(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/h6;)V

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v7, v17

    goto :goto_6

    :pswitch_14
    move-object/from16 v17, v7

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    move/from16 v13, v16

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->b(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_5

    :pswitch_15
    move-object/from16 v17, v7

    move/from16 v13, v16

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->a(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_5

    :pswitch_16
    move-object/from16 v17, v7

    move/from16 v13, v16

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->E(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_5

    :pswitch_17
    move-object/from16 v17, v7

    move/from16 v13, v16

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->D(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_5

    :pswitch_18
    move-object/from16 v17, v7

    move/from16 v13, v16

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->x(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_5

    :pswitch_19
    move-object/from16 v17, v7

    move/from16 v13, v16

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->c(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_5

    :pswitch_1a
    move-object/from16 v17, v7

    move/from16 v13, v16

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->v(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_5

    :pswitch_1b
    move-object/from16 v17, v7

    move/from16 v13, v16

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->y(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_5

    :pswitch_1c
    move-object/from16 v17, v7

    move/from16 v13, v16

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->z(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_5

    :pswitch_1d
    move-object/from16 v17, v7

    move/from16 v13, v16

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->B(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_5

    :pswitch_1e
    move-object/from16 v17, v7

    move/from16 v13, v16

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->d(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_5

    :pswitch_1f
    move-object/from16 v17, v7

    move/from16 v13, v16

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->C(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_5

    :pswitch_20
    move-object/from16 v17, v7

    move/from16 v13, v16

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->A(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_5

    :pswitch_21
    move-object/from16 v17, v7

    move/from16 v13, v16

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->w(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_5

    :pswitch_22
    move-object/from16 v17, v7

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    const/4 v13, 0x0

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->b(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_8

    :pswitch_23
    move-object/from16 v17, v7

    const/4 v13, 0x0

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->a(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_8

    :pswitch_24
    move-object/from16 v17, v7

    const/4 v13, 0x0

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->E(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_8

    :pswitch_25
    move-object/from16 v17, v7

    const/4 v13, 0x0

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->D(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_8

    :pswitch_26
    move-object/from16 v17, v7

    const/4 v13, 0x0

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->x(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_8

    :pswitch_27
    move-object/from16 v17, v7

    const/4 v13, 0x0

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->c(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_8

    :pswitch_28
    move-object/from16 v17, v7

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    sget-object v11, Lcom/google/android/gms/internal/play_billing/i6;->a:Lcom/google/android/gms/internal/play_billing/t6;

    if-eqz v7, :cond_5

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_5

    invoke-interface {v6, v5, v7}, Lcom/google/android/gms/internal/play_billing/i7;->h(ILjava/util/List;)V

    goto/16 :goto_5

    :pswitch_29
    move-object/from16 v17, v7

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object v11

    sget-object v12, Lcom/google/android/gms/internal/play_billing/i6;->a:Lcom/google/android/gms/internal/play_billing/t6;

    if-eqz v7, :cond_5

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_5

    const/4 v13, 0x0

    :goto_7
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v12

    if-ge v13, v12, :cond_5

    invoke-interface {v7, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object v14, v6

    check-cast v14, Lcom/google/android/gms/internal/play_billing/b4;

    invoke-virtual {v14, v5, v12, v11}, Lcom/google/android/gms/internal/play_billing/b4;->H(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/h6;)V

    add-int/lit8 v13, v13, 0x1

    goto :goto_7

    :pswitch_2a
    move-object/from16 v17, v7

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    sget-object v11, Lcom/google/android/gms/internal/play_billing/i6;->a:Lcom/google/android/gms/internal/play_billing/t6;

    if-eqz v7, :cond_5

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_5

    invoke-interface {v6, v5, v7}, Lcom/google/android/gms/internal/play_billing/i7;->I(ILjava/util/List;)V

    goto/16 :goto_5

    :pswitch_2b
    move-object/from16 v17, v7

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    const/4 v13, 0x0

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->v(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_8

    :pswitch_2c
    move-object/from16 v17, v7

    const/4 v13, 0x0

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->y(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_8

    :pswitch_2d
    move-object/from16 v17, v7

    const/4 v13, 0x0

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->z(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_8

    :pswitch_2e
    move-object/from16 v17, v7

    const/4 v13, 0x0

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->B(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_8

    :pswitch_2f
    move-object/from16 v17, v7

    const/4 v13, 0x0

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->d(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_8

    :pswitch_30
    move-object/from16 v17, v7

    const/4 v13, 0x0

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->C(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_8

    :pswitch_31
    move-object/from16 v17, v7

    const/4 v13, 0x0

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->A(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_8

    :pswitch_32
    move-object/from16 v17, v7

    const/4 v13, 0x0

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/play_billing/i6;->w(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/i7;Z)V

    goto/16 :goto_8

    :pswitch_33
    move-object/from16 v17, v7

    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object v7

    invoke-interface {v6, v14, v5, v7}, Lcom/google/android/gms/internal/play_billing/i7;->s(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/h6;)V

    goto/16 :goto_8

    :pswitch_34
    move-object/from16 v17, v7

    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v11

    invoke-interface {v6, v14, v11, v12}, Lcom/google/android/gms/internal/play_billing/i7;->r(IJ)V

    goto/16 :goto_8

    :pswitch_35
    move-object/from16 v17, v7

    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v6, v14, v0}, Lcom/google/android/gms/internal/play_billing/i7;->x(II)V

    goto/16 :goto_8

    :pswitch_36
    move-object/from16 v17, v7

    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v11

    invoke-interface {v6, v14, v11, v12}, Lcom/google/android/gms/internal/play_billing/i7;->j(IJ)V

    goto/16 :goto_8

    :pswitch_37
    move-object/from16 v17, v7

    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v6, v14, v0}, Lcom/google/android/gms/internal/play_billing/i7;->z(II)V

    goto/16 :goto_8

    :pswitch_38
    move-object/from16 v17, v7

    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v6, v14, v0}, Lcom/google/android/gms/internal/play_billing/i7;->e(II)V

    goto/16 :goto_8

    :pswitch_39
    move-object/from16 v17, v7

    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v6, v14, v0}, Lcom/google/android/gms/internal/play_billing/i7;->K(II)V

    goto/16 :goto_8

    :pswitch_3a
    move-object/from16 v17, v7

    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/s3;

    invoke-interface {v6, v14, v0}, Lcom/google/android/gms/internal/play_billing/i7;->E(ILcom/google/android/gms/internal/play_billing/s3;)V

    goto/16 :goto_8

    :pswitch_3b
    move-object/from16 v17, v7

    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object v7

    invoke-interface {v6, v14, v5, v7}, Lcom/google/android/gms/internal/play_billing/i7;->H(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/h6;)V

    goto/16 :goto_8

    :pswitch_3c
    move-object/from16 v17, v7

    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v14, v0, v6}, Lcom/google/android/gms/internal/play_billing/a6;->u(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/i7;)V

    goto/16 :goto_8

    :pswitch_3d
    move-object/from16 v17, v7

    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/play_billing/a7;->A(Ljava/lang/Object;J)Z

    move-result v0

    invoke-interface {v6, v14, v0}, Lcom/google/android/gms/internal/play_billing/i7;->i(IZ)V

    goto/16 :goto_8

    :pswitch_3e
    move-object/from16 v17, v7

    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v6, v14, v0}, Lcom/google/android/gms/internal/play_billing/i7;->d(II)V

    goto :goto_8

    :pswitch_3f
    move-object/from16 v17, v7

    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v11

    invoke-interface {v6, v14, v11, v12}, Lcom/google/android/gms/internal/play_billing/i7;->L(IJ)V

    goto :goto_8

    :pswitch_40
    move-object/from16 v17, v7

    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v6, v14, v0}, Lcom/google/android/gms/internal/play_billing/i7;->o(II)V

    goto :goto_8

    :pswitch_41
    move-object/from16 v17, v7

    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v11

    invoke-interface {v6, v14, v11, v12}, Lcom/google/android/gms/internal/play_billing/i7;->C(IJ)V

    goto :goto_8

    :pswitch_42
    move-object/from16 v17, v7

    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v11

    invoke-interface {v6, v14, v11, v12}, Lcom/google/android/gms/internal/play_billing/i7;->k(IJ)V

    goto :goto_8

    :pswitch_43
    move-object/from16 v17, v7

    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/play_billing/a7;->f(Ljava/lang/Object;J)F

    move-result v0

    invoke-interface {v6, v14, v0}, Lcom/google/android/gms/internal/play_billing/i7;->F(IF)V

    goto :goto_8

    :pswitch_44
    move-object/from16 v17, v7

    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/play_billing/a7;->e(Ljava/lang/Object;J)D

    move-result-wide v11

    invoke-interface {v6, v14, v11, v12}, Lcom/google/android/gms/internal/play_billing/i7;->a(ID)V

    :cond_6
    :goto_8
    add-int/lit8 v2, v2, 0x3

    move-object/from16 v0, p0

    move-object/from16 v7, v17

    const v11, 0xfffff

    goto/16 :goto_1

    :cond_7
    move-object/from16 v17, v7

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/r4;

    throw v17

    :cond_8
    move-object/from16 v17, v7

    if-nez v8, :cond_9

    move-object v0, v1

    check-cast v0, Lcom/google/android/gms/internal/play_billing/t4;

    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/t4;->zzc:Lcom/google/android/gms/internal/play_billing/u6;

    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/play_billing/u6;->l(Lcom/google/android/gms/internal/play_billing/i7;)V

    return-void

    :cond_9
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/r4;

    throw v17

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Ljava/lang/Object;[BIILcom/google/android/gms/internal/play_billing/f3;)V
    .locals 7

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/play_billing/a6;->v(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/play_billing/f3;)I

    return-void
.end method

.method public final g(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 5

    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/play_billing/a6;->n(Ljava/lang/Object;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/play_billing/a6;->C(I)I

    move-result v0

    const v1, 0xfffff

    and-int/2addr v0, v1

    sget-object v1, Lcom/google/android/gms/internal/play_billing/a6;->m:Lsun/misc/Unsafe;

    int-to-long v2, v0

    invoke-virtual {v1, p2, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object p2

    invoke-virtual {p0, p1, p3}, Lcom/google/android/gms/internal/play_billing/a6;->n(Ljava/lang/Object;I)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a6;->q(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v1, p1, v2, v3, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Lcom/google/android/gms/internal/play_billing/h6;->zze()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4, v0}, Lcom/google/android/gms/internal/play_billing/h6;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, p1, v2, v3, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    invoke-virtual {p0, p1, p3}, Lcom/google/android/gms/internal/play_billing/a6;->i(Ljava/lang/Object;I)V

    return-void

    :cond_2
    invoke-virtual {v1, p1, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lcom/google/android/gms/internal/play_billing/a6;->q(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    invoke-interface {p2}, Lcom/google/android/gms/internal/play_billing/h6;->zze()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4, p3}, Lcom/google/android/gms/internal/play_billing/h6;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, p1, v2, v3, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p3, v4

    :cond_3
    invoke-interface {p2, p3, v0}, Lcom/google/android/gms/internal/play_billing/h6;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/internal/play_billing/a6;->a:[I

    new-instance v0, Ljava/lang/IllegalStateException;

    aget p1, p1, p3

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Source subfield "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is present but null: "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/a6;->a:[I

    aget v1, v0, p3

    invoke-virtual {p0, p2, v1, p3}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/play_billing/a6;->C(I)I

    move-result v2

    const v3, 0xfffff

    and-int/2addr v2, v3

    sget-object v3, Lcom/google/android/gms/internal/play_billing/a6;->m:Lsun/misc/Unsafe;

    int-to-long v4, v2

    invoke-virtual {v3, p2, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object p2

    invoke-virtual {p0, p1, v1, p3}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/a6;->q(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v3, p1, v4, v5, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Lcom/google/android/gms/internal/play_billing/h6;->zze()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, v0, v2}, Lcom/google/android/gms/internal/play_billing/h6;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, p1, v4, v5, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    invoke-virtual {p0, p1, v1, p3}, Lcom/google/android/gms/internal/play_billing/a6;->j(Ljava/lang/Object;II)V

    return-void

    :cond_2
    invoke-virtual {v3, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lcom/google/android/gms/internal/play_billing/a6;->q(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p2}, Lcom/google/android/gms/internal/play_billing/h6;->zze()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, v0, p3}, Lcom/google/android/gms/internal/play_billing/h6;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, p1, v4, v5, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p3, v0

    :cond_3
    invoke-interface {p2, p3, v2}, Lcom/google/android/gms/internal/play_billing/h6;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    aget p3, v0, p3

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Source subfield "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " is present but null: "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final i(Ljava/lang/Object;I)V
    .locals 4

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/play_billing/a6;->z(I)I

    move-result p2

    const v0, 0xfffff

    and-int/2addr v0, p2

    int-to-long v0, v0

    const-wide/32 v2, 0xfffff

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    ushr-int/lit8 p2, p2, 0x14

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result v2

    const/4 v3, 0x1

    shl-int p2, v3, p2

    or-int/2addr p2, v2

    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/play_billing/a7;->u(Ljava/lang/Object;JI)V

    return-void
.end method

.method public final j(Ljava/lang/Object;II)V
    .locals 2

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/play_billing/a6;->z(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/play_billing/a7;->u(Ljava/lang/Object;JI)V

    return-void
.end method

.method public final k(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/play_billing/a6;->m:Lsun/misc/Unsafe;

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/play_billing/a6;->C(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v0, p1, v1, v2, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/a6;->i(Ljava/lang/Object;I)V

    return-void
.end method

.method public final l(Ljava/lang/Object;IILjava/lang/Object;)V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/play_billing/a6;->m:Lsun/misc/Unsafe;

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/play_billing/a6;->C(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v0, p1, v1, v2, p4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/play_billing/a6;->j(Ljava/lang/Object;II)V

    return-void
.end method

.method public final m(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 0

    invoke-virtual {p0, p1, p3}, Lcom/google/android/gms/internal/play_billing/a6;->n(Ljava/lang/Object;I)Z

    move-result p1

    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/play_billing/a6;->n(Ljava/lang/Object;I)Z

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final n(Ljava/lang/Object;I)Z
    .locals 7

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/play_billing/a6;->z(I)I

    move-result v0

    const v1, 0xfffff

    and-int v2, v0, v1

    int-to-long v2, v2

    const-wide/32 v4, 0xfffff

    cmp-long v4, v2, v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-nez v4, :cond_14

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/play_billing/a6;->C(I)I

    move-result p2

    and-int v0, p2, v1

    invoke-static {p2}, Lcom/google/android/gms/internal/play_billing/a6;->B(I)I

    move-result p2

    int-to-long v0, v0

    const-wide/16 v2, 0x0

    packed-switch p2, :pswitch_data_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/a6;->t()Z

    move-result p1

    return p1

    :pswitch_0
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    return v6

    :cond_0
    return v5

    :pswitch_1
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/a7;->h(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_1

    return v6

    :cond_1
    return v5

    :pswitch_2
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_2

    return v6

    :cond_2
    return v5

    :pswitch_3
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/a7;->h(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_3

    return v6

    :cond_3
    return v5

    :pswitch_4
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_4

    return v6

    :cond_4
    return v5

    :pswitch_5
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_5

    return v6

    :cond_5
    return v5

    :pswitch_6
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_6

    return v6

    :cond_6
    return v5

    :pswitch_7
    sget-object p2, Lcom/google/android/gms/internal/play_billing/s3;->b:Lcom/google/android/gms/internal/play_billing/s3;

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/play_billing/s3;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v6

    :cond_7
    return v5

    :pswitch_8
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_8

    return v6

    :cond_8
    return v5

    :pswitch_9
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_a

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_9

    return v6

    :cond_9
    return v5

    :cond_a
    instance-of p2, p1, Lcom/google/android/gms/internal/play_billing/s3;

    if-eqz p2, :cond_c

    sget-object p2, Lcom/google/android/gms/internal/play_billing/s3;->b:Lcom/google/android/gms/internal/play_billing/s3;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/play_billing/s3;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v6

    :cond_b
    return v5

    :cond_c
    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/a6;->t()Z

    move-result p1

    return p1

    :pswitch_a
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/a7;->A(Ljava/lang/Object;J)Z

    move-result p1

    return p1

    :pswitch_b
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_d

    return v6

    :cond_d
    return v5

    :pswitch_c
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/a7;->h(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_e

    return v6

    :cond_e
    return v5

    :pswitch_d
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_f

    return v6

    :cond_f
    return v5

    :pswitch_e
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/a7;->h(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_10

    return v6

    :cond_10
    return v5

    :pswitch_f
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/a7;->h(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_11

    return v6

    :cond_11
    return v5

    :pswitch_10
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/a7;->f(Ljava/lang/Object;J)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    if-eqz p1, :cond_12

    return v6

    :cond_12
    return v5

    :pswitch_11
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/a7;->e(Ljava/lang/Object;J)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_13

    return v6

    :cond_13
    return v5

    :cond_14
    ushr-int/lit8 p2, v0, 0x14

    shl-int p2, v6, p2

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result p1

    and-int/2addr p1, p2

    if-eqz p1, :cond_15

    return v6

    :cond_15
    return v5

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final o(Ljava/lang/Object;IIII)Z
    .locals 1

    const v0, 0xfffff

    if-ne p3, v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/a6;->n(Ljava/lang/Object;I)Z

    move-result p1

    return p1

    :cond_0
    and-int p1, p4, p5

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final r(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 2

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/play_billing/a6;->z(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result p1

    invoke-static {p2, v0, v1}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final s(Ljava/lang/Object;II)Z
    .locals 2

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/play_billing/a6;->z(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result p1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final t()Z
    .locals 1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
.end method

.method public final v(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/play_billing/f3;)I
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v6, p6

    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/a6;->L(Ljava/lang/Object;)V

    sget-object v1, Lcom/google/android/gms/internal/play_billing/a6;->m:Lsun/misc/Unsafe;

    const/4 v11, 0x0

    const/4 v12, -0x1

    move/from16 v5, p3

    move v8, v11

    move v14, v8

    move v15, v14

    move v7, v12

    const v9, 0xfffff

    :goto_0
    const/16 v16, 0x0

    if-ge v5, v4, :cond_83

    add-int/lit8 v15, v5, 0x1

    aget-byte v5, v3, v5

    if-gez v5, :cond_0

    invoke-static {v5, v3, v15, v6}, Lcom/google/android/gms/internal/play_billing/g3;->j(I[BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v15

    iget v5, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    :cond_0
    move v6, v15

    move v15, v5

    ushr-int/lit8 v5, v15, 0x3

    const v17, 0xfffff

    const/4 v13, 0x3

    if-le v5, v7, :cond_1

    div-int/2addr v8, v13

    iget v7, v0, Lcom/google/android/gms/internal/play_billing/a6;->c:I

    if-lt v5, v7, :cond_2

    iget v7, v0, Lcom/google/android/gms/internal/play_billing/a6;->d:I

    if-gt v5, v7, :cond_2

    invoke-virtual {v0, v5, v8}, Lcom/google/android/gms/internal/play_billing/a6;->A(II)I

    move-result v7

    goto :goto_1

    :cond_1
    iget v7, v0, Lcom/google/android/gms/internal/play_billing/a6;->c:I

    if-lt v5, v7, :cond_2

    iget v7, v0, Lcom/google/android/gms/internal/play_billing/a6;->d:I

    if-gt v5, v7, :cond_2

    invoke-virtual {v0, v5, v11}, Lcom/google/android/gms/internal/play_billing/a6;->A(II)I

    move-result v7

    goto :goto_1

    :cond_2
    move v7, v12

    :goto_1
    if-ne v7, v12, :cond_3

    move/from16 v12, p5

    move-object/from16 v7, p6

    move-object v13, v2

    move/from16 v20, v9

    move v8, v11

    move v10, v15

    move-object v11, v0

    move-object v9, v1

    move v0, v5

    move v5, v6

    goto/16 :goto_4f

    :cond_3
    and-int/lit8 v8, v15, 0x7

    iget-object v11, v0, Lcom/google/android/gms/internal/play_billing/a6;->a:[I

    add-int/lit8 v18, v7, 0x1

    aget v12, v11, v18

    invoke-static {v12}, Lcom/google/android/gms/internal/play_billing/a6;->B(I)I

    move-result v13

    and-int v3, v12, v17

    int-to-long v3, v3

    move-wide/from16 v19, v3

    const/high16 v18, 0x20000000

    const-wide/16 v21, 0x0

    const-string v4, ""

    const-string v3, "CodedInputStream encountered an embedded string or message which claimed to have negative size."

    move/from16 v24, v5

    const/16 v25, 0x1

    const/16 v5, 0x11

    if-gt v13, v5, :cond_15

    add-int/lit8 v5, v7, 0x2

    aget v5, v11, v5

    ushr-int/lit8 v11, v5, 0x14

    shl-int v11, v25, v11

    and-int v5, v5, v17

    move/from16 v23, v6

    if-eq v5, v9, :cond_6

    move/from16 v6, v17

    move/from16 v26, v7

    if-eq v9, v6, :cond_4

    int-to-long v6, v9

    invoke-virtual {v1, v2, v6, v7, v14}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    const v6, 0xfffff

    :cond_4
    if-ne v5, v6, :cond_5

    const/4 v6, 0x0

    goto :goto_2

    :cond_5
    int-to-long v6, v5

    invoke-virtual {v1, v2, v6, v7}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    :goto_2
    move v14, v5

    goto :goto_3

    :cond_6
    move/from16 v26, v7

    move v6, v14

    move v14, v9

    :goto_3
    packed-switch v13, :pswitch_data_0

    const/4 v5, 0x3

    if-ne v8, v5, :cond_7

    or-int/2addr v11, v6

    move/from16 v12, v26

    invoke-virtual {v0, v2, v12}, Lcom/google/android/gms/internal/play_billing/a6;->I(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v3

    shl-int/lit8 v4, v24, 0x3

    or-int/lit8 v8, v4, 0x4

    invoke-virtual {v0, v12}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object v4

    move-object/from16 v5, p2

    move/from16 v7, p4

    move-object/from16 v9, p6

    move v13, v12

    move/from16 v6, v23

    invoke-static/range {v3 .. v9}, Lcom/google/android/gms/internal/play_billing/g3;->m(Ljava/lang/Object;Lcom/google/android/gms/internal/play_billing/h6;[BIIILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v4

    move-object v7, v5

    invoke-virtual {v0, v2, v13, v3}, Lcom/google/android/gms/internal/play_billing/a6;->k(Ljava/lang/Object;ILjava/lang/Object;)V

    move v5, v4

    move-object v3, v7

    move-object v6, v9

    move v8, v13

    move v9, v14

    move/from16 v7, v24

    const/4 v12, -0x1

    move/from16 v4, p4

    move v14, v11

    :goto_4
    const/4 v11, 0x0

    goto/16 :goto_0

    :cond_7
    move-object/from16 v7, p2

    move-object/from16 v11, p6

    move-object v5, v1

    move-object v1, v2

    move/from16 p3, v6

    move/from16 v2, v23

    goto/16 :goto_13

    :pswitch_0
    move-object/from16 v7, p2

    move-object/from16 v9, p6

    move/from16 v4, v23

    move/from16 v13, v26

    if-nez v8, :cond_8

    or-int v8, v6, v11

    invoke-static {v7, v4, v9}, Lcom/google/android/gms/internal/play_billing/g3;->l([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v11

    iget-wide v3, v9, Lcom/google/android/gms/internal/play_billing/f3;->b:J

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/play_billing/w3;->b(J)J

    move-result-wide v5

    move-wide/from16 v3, v19

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move-object/from16 v30, v2

    move-object v2, v1

    move-object/from16 v1, v30

    move-object v3, v2

    move-object v2, v1

    move-object v1, v3

    move/from16 v4, p4

    move-object v3, v7

    move-object v6, v9

    move v5, v11

    :goto_5
    move v9, v14

    move/from16 v7, v24

    const/4 v11, 0x0

    const/4 v12, -0x1

    move v14, v8

    move v8, v13

    goto/16 :goto_0

    :cond_8
    move-object/from16 v30, v2

    move-object v2, v1

    move-object/from16 v1, v30

    move-object v5, v2

    move v2, v4

    move/from16 p3, v6

    :goto_6
    move-object v11, v9

    :goto_7
    move/from16 v26, v13

    goto/16 :goto_13

    :pswitch_1
    move-object/from16 p3, v2

    move-object v2, v1

    move-object/from16 v1, p3

    move-object/from16 v7, p2

    move-object/from16 v9, p6

    move/from16 p3, v6

    move-wide/from16 v5, v19

    move/from16 v4, v23

    move/from16 v13, v26

    if-nez v8, :cond_9

    or-int v3, p3, v11

    invoke-static {v7, v4, v9}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v4

    iget v8, v9, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    invoke-static {v8}, Lcom/google/android/gms/internal/play_billing/w3;->a(I)I

    move-result v8

    invoke-virtual {v2, v1, v5, v6, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_8
    move-object v5, v2

    move-object v2, v1

    move-object v1, v5

    move v5, v4

    move-object v6, v9

    move v8, v13

    move v9, v14

    const/4 v11, 0x0

    const/4 v12, -0x1

    move/from16 v4, p4

    move v14, v3

    move-object v3, v7

    move/from16 v7, v24

    goto/16 :goto_0

    :cond_9
    move-object v5, v2

    move v2, v4

    goto :goto_6

    :pswitch_2
    move-object/from16 p3, v2

    move-object v2, v1

    move-object/from16 v1, p3

    move-object/from16 v7, p2

    move-object/from16 v9, p6

    move/from16 p3, v6

    move-wide/from16 v5, v19

    move/from16 v4, v23

    move/from16 v13, v26

    if-nez v8, :cond_9

    invoke-static {v7, v4, v9}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v3

    iget v4, v9, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    invoke-virtual {v0, v13}, Lcom/google/android/gms/internal/play_billing/a6;->E(I)Lcom/google/android/gms/internal/play_billing/w4;

    move-result-object v8

    const/high16 v16, -0x80000000

    and-int v12, v12, v16

    if-eqz v12, :cond_b

    if-eqz v8, :cond_b

    invoke-interface {v8, v4}, Lcom/google/android/gms/internal/play_billing/w4;->a(I)Z

    move-result v8

    if-eqz v8, :cond_a

    goto :goto_9

    :cond_a
    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/a6;->w(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/u6;

    move-result-object v5

    int-to-long v11, v4

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v5, v15, v4}, Lcom/google/android/gms/internal/play_billing/u6;->j(ILjava/lang/Object;)V

    move-object v4, v2

    move-object v2, v1

    move-object v1, v4

    move/from16 v4, p4

    move v5, v3

    move-object v3, v7

    move-object v6, v9

    move v8, v13

    move v9, v14

    move/from16 v7, v24

    const/4 v11, 0x0

    const/4 v12, -0x1

    move/from16 v14, p3

    goto/16 :goto_0

    :cond_b
    :goto_9
    or-int v8, p3, v11

    invoke-virtual {v2, v1, v5, v6, v4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move-object v4, v2

    move-object v2, v1

    move-object v1, v4

    move/from16 v4, p4

    move v5, v3

    move-object v3, v7

    move-object v6, v9

    goto/16 :goto_5

    :pswitch_3
    move-object/from16 p3, v2

    move-object v2, v1

    move-object/from16 v1, p3

    move-object/from16 v7, p2

    move-object/from16 v9, p6

    move/from16 p3, v6

    move-wide/from16 v5, v19

    move/from16 v4, v23

    move/from16 v13, v26

    const/4 v3, 0x2

    if-ne v8, v3, :cond_9

    or-int v3, p3, v11

    invoke-static {v7, v4, v9}, Lcom/google/android/gms/internal/play_billing/g3;->a([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v4

    iget-object v8, v9, Lcom/google/android/gms/internal/play_billing/f3;->c:Ljava/lang/Object;

    invoke-virtual {v2, v1, v5, v6, v8}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_4
    move-object/from16 p3, v2

    move-object v2, v1

    move-object/from16 v1, p3

    move-object/from16 v7, p2

    move-object/from16 v9, p6

    move/from16 p3, v6

    move/from16 v4, v23

    move/from16 v13, v26

    const/4 v3, 0x2

    if-ne v8, v3, :cond_c

    or-int v8, p3, v11

    move-object v3, v1

    invoke-virtual {v0, v3, v13}, Lcom/google/android/gms/internal/play_billing/a6;->I(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v2

    invoke-virtual {v0, v13}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object v2

    move-object v6, v7

    move-object v7, v3

    move-object v3, v6

    move-object v6, v9

    move-object v9, v5

    move/from16 v5, p4

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/play_billing/g3;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/play_billing/h6;[BIILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v2

    move-object/from16 v30, v3

    move-object v3, v1

    move-object/from16 v1, v30

    invoke-virtual {v0, v7, v13, v3}, Lcom/google/android/gms/internal/play_billing/a6;->k(Ljava/lang/Object;ILjava/lang/Object;)V

    move/from16 v4, p4

    move-object/from16 v6, p6

    move-object v3, v1

    move v5, v2

    move-object v2, v7

    move-object v1, v9

    goto/16 :goto_5

    :cond_c
    move-object v9, v7

    move-object v7, v1

    move-object v1, v9

    move-object v9, v2

    move v2, v4

    move-object v5, v7

    move-object v7, v1

    move-object v1, v5

    move-object/from16 v11, p6

    move-object v5, v9

    goto/16 :goto_7

    :pswitch_5
    move-object v9, v1

    move-object v7, v2

    move/from16 p3, v6

    move-wide/from16 v5, v19

    move/from16 v2, v23

    const/4 v13, 0x2

    move-object/from16 v1, p2

    move/from16 v19, v11

    move-object/from16 v11, p6

    if-ne v8, v13, :cond_10

    and-int v8, v12, v18

    if-eqz v8, :cond_d

    or-int v3, p3, v19

    invoke-static {v1, v2, v11}, Lcom/google/android/gms/internal/play_billing/g3;->g([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v2

    goto :goto_a

    :cond_d
    invoke-static {v1, v2, v11}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v2

    iget v8, v11, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ltz v8, :cond_f

    or-int v3, p3, v19

    if-nez v8, :cond_e

    iput-object v4, v11, Lcom/google/android/gms/internal/play_billing/f3;->c:Ljava/lang/Object;

    goto :goto_a

    :cond_e
    new-instance v4, Ljava/lang/String;

    sget-object v12, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v4, v1, v2, v8, v12}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iput-object v4, v11, Lcom/google/android/gms/internal/play_billing/f3;->c:Ljava/lang/Object;

    add-int/2addr v2, v8

    :goto_a
    iget-object v4, v11, Lcom/google/android/gms/internal/play_billing/f3;->c:Ljava/lang/Object;

    invoke-virtual {v9, v7, v5, v6, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_b
    move v4, v3

    move-object v3, v1

    move-object v1, v9

    move v9, v14

    move v14, v4

    move/from16 v4, p4

    move v5, v2

    move-object v2, v7

    :goto_c
    move-object v6, v11

    :goto_d
    move/from16 v7, v24

    move/from16 v8, v26

    const/4 v11, 0x0

    :goto_e
    const/4 v12, -0x1

    goto/16 :goto_0

    :cond_f
    new-instance v1, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_10
    move-object v5, v7

    move-object v7, v1

    move-object v1, v5

    :cond_11
    :goto_f
    move-object v5, v9

    goto/16 :goto_13

    :pswitch_6
    move-object v9, v1

    move-object v7, v2

    move/from16 p3, v6

    move-wide/from16 v5, v19

    move/from16 v2, v23

    move-object/from16 v1, p2

    move/from16 v19, v11

    move-object/from16 v11, p6

    if-nez v8, :cond_10

    or-int v3, p3, v19

    invoke-static {v1, v2, v11}, Lcom/google/android/gms/internal/play_billing/g3;->l([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v2

    iget-wide v12, v11, Lcom/google/android/gms/internal/play_billing/f3;->b:J

    cmp-long v4, v12, v21

    if-eqz v4, :cond_12

    move/from16 v4, v25

    goto :goto_10

    :cond_12
    const/4 v4, 0x0

    :goto_10
    invoke-static {v7, v5, v6, v4}, Lcom/google/android/gms/internal/play_billing/a7;->q(Ljava/lang/Object;JZ)V

    goto :goto_b

    :pswitch_7
    move-object v9, v1

    move-object v7, v2

    move/from16 p3, v6

    move-wide/from16 v5, v19

    move/from16 v2, v23

    const/4 v3, 0x5

    move-object/from16 v1, p2

    move/from16 v19, v11

    move-object/from16 v11, p6

    if-ne v8, v3, :cond_10

    add-int/lit8 v3, v2, 0x4

    or-int v4, p3, v19

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/g3;->b([BI)I

    move-result v2

    invoke-virtual {v9, v7, v5, v6, v2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move v5, v3

    move-object v2, v7

    move-object v6, v11

    move/from16 v7, v24

    move/from16 v8, v26

    const/4 v11, 0x0

    const/4 v12, -0x1

    move-object v3, v1

    move-object v1, v9

    move v9, v14

    move v14, v4

    move/from16 v4, p4

    goto/16 :goto_0

    :pswitch_8
    move-object v9, v1

    move-object v7, v2

    move/from16 p3, v6

    move-wide/from16 v5, v19

    move/from16 v2, v23

    move/from16 v3, v25

    move-object/from16 v1, p2

    move/from16 v19, v11

    move-object/from16 v11, p6

    if-ne v8, v3, :cond_13

    add-int/lit8 v8, v2, 0x8

    or-int v12, p3, v19

    move-wide v3, v5

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/g3;->o([BI)J

    move-result-wide v5

    move-object v2, v7

    move-object v7, v1

    move-object v1, v9

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move/from16 v4, p4

    move-object v3, v7

    move v5, v8

    move-object v6, v11

    move v9, v14

    move/from16 v7, v24

    move/from16 v8, v26

    const/4 v11, 0x0

    move v14, v12

    goto/16 :goto_e

    :cond_13
    move-object/from16 v30, v7

    move-object v7, v1

    move-object/from16 v1, v30

    goto/16 :goto_f

    :pswitch_9
    move-object/from16 v7, p2

    move-object v9, v1

    move-object v1, v2

    move/from16 p3, v6

    move-wide/from16 v3, v19

    move/from16 v2, v23

    move/from16 v19, v11

    move-object/from16 v11, p6

    if-nez v8, :cond_11

    or-int v5, p3, v19

    invoke-static {v7, v2, v11}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v2

    iget v6, v11, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    invoke-virtual {v9, v1, v3, v4, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move v3, v2

    move-object v2, v1

    move-object v1, v9

    move v9, v14

    move v14, v5

    move v5, v3

    move/from16 v4, p4

    move-object v3, v7

    goto/16 :goto_c

    :pswitch_a
    move-object/from16 v7, p2

    move-object v9, v1

    move-object v1, v2

    move/from16 p3, v6

    move-wide/from16 v3, v19

    move/from16 v2, v23

    move/from16 v19, v11

    move-object/from16 v11, p6

    if-nez v8, :cond_11

    or-int v8, p3, v19

    invoke-static {v7, v2, v11}, Lcom/google/android/gms/internal/play_billing/g3;->l([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v12

    iget-wide v5, v11, Lcom/google/android/gms/internal/play_billing/f3;->b:J

    move-object v2, v1

    move-object v1, v9

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move/from16 v4, p4

    move-object v3, v7

    move-object v6, v11

    move v5, v12

    :goto_11
    move v9, v14

    move/from16 v7, v24

    const/4 v11, 0x0

    const/4 v12, -0x1

    move v14, v8

    move/from16 v8, v26

    goto/16 :goto_0

    :pswitch_b
    move-object/from16 v7, p2

    move-object v5, v1

    move-object v1, v2

    move/from16 p3, v6

    move-wide/from16 v3, v19

    move/from16 v2, v23

    const/4 v6, 0x5

    move/from16 v19, v11

    move-object/from16 v11, p6

    if-ne v8, v6, :cond_14

    add-int/lit8 v6, v2, 0x4

    or-int v8, p3, v19

    invoke-static {v7, v2}, Lcom/google/android/gms/internal/play_billing/g3;->b([BI)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-static {v1, v3, v4, v2}, Lcom/google/android/gms/internal/play_billing/a7;->t(Ljava/lang/Object;JF)V

    :goto_12
    move/from16 v4, p4

    move-object v2, v1

    move-object v1, v5

    move v5, v6

    move-object v3, v7

    move-object v6, v11

    goto :goto_11

    :pswitch_c
    move-object/from16 v7, p2

    move-object v5, v1

    move-object v1, v2

    move/from16 p3, v6

    move-wide/from16 v3, v19

    move/from16 v2, v23

    move/from16 v6, v25

    move/from16 v19, v11

    move-object/from16 v11, p6

    if-ne v8, v6, :cond_14

    add-int/lit8 v6, v2, 0x8

    or-int v8, p3, v19

    invoke-static {v7, v2}, Lcom/google/android/gms/internal/play_billing/g3;->o([BI)J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v12

    invoke-static {v1, v3, v4, v12, v13}, Lcom/google/android/gms/internal/play_billing/a7;->s(Ljava/lang/Object;JD)V

    goto :goto_12

    :cond_14
    :goto_13
    move/from16 v12, p5

    move-object v13, v1

    move-object v9, v5

    move-object v3, v7

    move-object v7, v11

    move/from16 v20, v14

    move v10, v15

    move/from16 v8, v26

    move/from16 v14, p3

    move-object v11, v0

    move v5, v2

    move/from16 v0, v24

    goto/16 :goto_4f

    :cond_15
    move-object v5, v1

    move-object v1, v2

    move/from16 v26, v6

    move v6, v7

    move/from16 v23, v14

    move-object/from16 v7, p2

    move-object/from16 v30, v11

    move-object/from16 v11, p6

    move-wide/from16 v31, v19

    move-object/from16 v19, v30

    move/from16 v20, v15

    move-wide/from16 v14, v31

    const/16 v2, 0x1b

    if-ne v13, v2, :cond_19

    const/4 v2, 0x2

    if-ne v8, v2, :cond_18

    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/play_billing/y4;

    invoke-interface {v2}, Lcom/google/android/gms/internal/play_billing/y4;->zzc()Z

    move-result v3

    if-nez v3, :cond_17

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_16

    const/16 v3, 0xa

    goto :goto_14

    :cond_16
    add-int/2addr v3, v3

    :goto_14
    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/play_billing/y4;->r(I)Lcom/google/android/gms/internal/play_billing/y4;

    move-result-object v2

    invoke-virtual {v5, v1, v14, v15, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_17
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object v1

    move-object v8, v5

    move-object v3, v7

    move-object v7, v11

    move/from16 v4, v26

    move-object/from16 v11, p1

    move/from16 v5, p4

    move/from16 v26, v6

    move-object v6, v2

    move/from16 v2, v20

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/play_billing/g3;->e(Lcom/google/android/gms/internal/play_billing/h6;I[BIILcom/google/android/gms/internal/play_billing/y4;Lcom/google/android/gms/internal/play_billing/f3;)I

    move-result v1

    move v7, v2

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v6, p6

    move v5, v1

    move v15, v7

    move-object v1, v8

    move-object v2, v11

    move/from16 v14, v23

    goto/16 :goto_d

    :cond_18
    move/from16 v2, v26

    move-object/from16 v7, p2

    move-object v11, v0

    move-object v13, v1

    move v1, v2

    move v3, v6

    move/from16 v10, v20

    move/from16 v0, v24

    move-object/from16 v6, p6

    move/from16 v20, v9

    goto/16 :goto_42

    :cond_19
    move-object v11, v1

    move-object v1, v5

    move v5, v6

    move/from16 v7, v20

    move/from16 v2, v26

    const/16 v6, 0x31

    const-string v2, "Protocol message had invalid UTF-8."

    move/from16 v20, v9

    const-string v9, "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."

    if-gt v13, v6, :cond_70

    move v6, v13

    int-to-long v12, v12

    invoke-virtual {v1, v11, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v18

    move/from16 v27, v6

    move-object/from16 v6, v18

    check-cast v6, Lcom/google/android/gms/internal/play_billing/y4;

    invoke-interface {v6}, Lcom/google/android/gms/internal/play_billing/y4;->zzc()Z

    move-result v18

    if-nez v18, :cond_1a

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v18

    move-wide/from16 v28, v12

    add-int v12, v18, v18

    invoke-interface {v6, v12}, Lcom/google/android/gms/internal/play_billing/y4;->r(I)Lcom/google/android/gms/internal/play_billing/y4;

    move-result-object v6

    invoke-virtual {v1, v11, v14, v15, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_15
    move-object v12, v6

    goto :goto_16

    :cond_1a
    move-wide/from16 v28, v12

    goto :goto_15

    :goto_16
    packed-switch v27, :pswitch_data_1

    const/4 v6, 0x3

    if-ne v8, v6, :cond_1c

    and-int/lit8 v2, v7, -0x8

    or-int/lit8 v2, v2, 0x4

    move-object v9, v1

    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object v1

    move/from16 v4, p4

    move-object/from16 v6, p6

    move v15, v5

    move-object v13, v9

    move/from16 v14, v24

    move/from16 v3, v26

    move v5, v2

    move-object/from16 v2, p2

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/play_billing/g3;->c(Lcom/google/android/gms/internal/play_billing/h6;[BIIILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v8

    iget-object v3, v6, Lcom/google/android/gms/internal/play_billing/f3;->c:Ljava/lang/Object;

    invoke-interface {v12, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_17
    if-ge v8, v4, :cond_1b

    invoke-static {v2, v8, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v3

    iget v9, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ne v7, v9, :cond_1b

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/play_billing/g3;->c(Lcom/google/android/gms/internal/play_billing/h6;[BIIILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v8

    iget-object v3, v6, Lcom/google/android/gms/internal/play_billing/f3;->c:Ljava/lang/Object;

    invoke-interface {v12, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_17

    :cond_1b
    move v5, v4

    move v10, v7

    move-object/from16 v24, v13

    move/from16 v18, v14

    move/from16 v1, v26

    move-object v7, v2

    move-object v13, v11

    move/from16 v26, v15

    move-object v11, v0

    move v0, v8

    goto/16 :goto_3e

    :cond_1c
    move-object/from16 v6, p6

    move v10, v7

    move-object v13, v11

    move/from16 v18, v24

    move-object/from16 v7, p2

    move-object v11, v0

    move-object/from16 v24, v1

    move/from16 v1, v26

    move/from16 v26, v5

    move/from16 v5, p4

    goto/16 :goto_3d

    :pswitch_d
    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object/from16 v6, p6

    move-object v13, v1

    move v15, v5

    move/from16 v14, v24

    move/from16 v1, v26

    const/4 v5, 0x2

    if-ne v8, v5, :cond_21

    sget v5, Lcom/google/android/gms/internal/play_billing/g3;->a:I

    check-cast v12, Lcom/google/android/gms/internal/play_billing/l5;

    invoke-static {v2, v1, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v5

    iget v8, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ltz v8, :cond_20

    array-length v3, v2

    sub-int/2addr v3, v5

    if-gt v8, v3, :cond_1f

    add-int/2addr v8, v5

    :goto_18
    if-ge v5, v8, :cond_1d

    invoke-static {v2, v5, v6}, Lcom/google/android/gms/internal/play_billing/g3;->l([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v5

    iget-wide v10, v6, Lcom/google/android/gms/internal/play_billing/f3;->b:J

    invoke-static {v10, v11}, Lcom/google/android/gms/internal/play_billing/w3;->b(J)J

    move-result-wide v10

    invoke-virtual {v12, v10, v11}, Lcom/google/android/gms/internal/play_billing/l5;->d(J)V

    move-object/from16 v11, p1

    goto :goto_18

    :cond_1d
    if-ne v5, v8, :cond_1e

    :goto_19
    move-object v11, v0

    move v0, v5

    move v10, v7

    move-object/from16 v24, v13

    move/from16 v18, v14

    move/from16 v26, v15

    move-object/from16 v13, p1

    move-object v7, v2

    :goto_1a
    move v5, v4

    goto/16 :goto_3e

    :cond_1e
    new-instance v1, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v1, v9}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1f
    new-instance v1, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v1, v9}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_20
    new-instance v1, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_21
    if-nez v8, :cond_23

    sget v3, Lcom/google/android/gms/internal/play_billing/g3;->a:I

    check-cast v12, Lcom/google/android/gms/internal/play_billing/l5;

    invoke-static {v2, v1, v6}, Lcom/google/android/gms/internal/play_billing/g3;->l([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v3

    iget-wide v8, v6, Lcom/google/android/gms/internal/play_billing/f3;->b:J

    invoke-static {v8, v9}, Lcom/google/android/gms/internal/play_billing/w3;->b(J)J

    move-result-wide v8

    invoke-virtual {v12, v8, v9}, Lcom/google/android/gms/internal/play_billing/l5;->d(J)V

    :goto_1b
    if-ge v3, v4, :cond_22

    invoke-static {v2, v3, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v5

    iget v8, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ne v7, v8, :cond_22

    invoke-static {v2, v5, v6}, Lcom/google/android/gms/internal/play_billing/g3;->l([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v3

    iget-wide v8, v6, Lcom/google/android/gms/internal/play_billing/f3;->b:J

    invoke-static {v8, v9}, Lcom/google/android/gms/internal/play_billing/w3;->b(J)J

    move-result-wide v8

    invoke-virtual {v12, v8, v9}, Lcom/google/android/gms/internal/play_billing/l5;->d(J)V

    goto :goto_1b

    :cond_22
    move-object v11, v0

    move v0, v3

    move v5, v4

    move v10, v7

    move-object/from16 v24, v13

    move/from16 v18, v14

    move/from16 v26, v15

    move-object/from16 v13, p1

    move-object v7, v2

    goto/16 :goto_3e

    :cond_23
    move-object v11, v0

    move v5, v4

    move v10, v7

    move-object/from16 v24, v13

    move/from16 v18, v14

    move/from16 v26, v15

    move-object/from16 v13, p1

    :goto_1c
    move-object v7, v2

    goto/16 :goto_3d

    :pswitch_e
    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object/from16 v6, p6

    move-object v13, v1

    move v15, v5

    move/from16 v14, v24

    move/from16 v1, v26

    const/4 v5, 0x2

    if-ne v8, v5, :cond_28

    sget v5, Lcom/google/android/gms/internal/play_billing/g3;->a:I

    check-cast v12, Lcom/google/android/gms/internal/play_billing/u4;

    invoke-static {v2, v1, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v5

    iget v8, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ltz v8, :cond_27

    array-length v3, v2

    sub-int/2addr v3, v5

    if-gt v8, v3, :cond_26

    add-int/2addr v8, v5

    :goto_1d
    if-ge v5, v8, :cond_24

    invoke-static {v2, v5, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v5

    iget v3, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    invoke-static {v3}, Lcom/google/android/gms/internal/play_billing/w3;->a(I)I

    move-result v3

    invoke-virtual {v12, v3}, Lcom/google/android/gms/internal/play_billing/u4;->w(I)V

    goto :goto_1d

    :cond_24
    if-ne v5, v8, :cond_25

    goto/16 :goto_19

    :cond_25
    new-instance v1, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v1, v9}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_26
    new-instance v1, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v1, v9}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_27
    new-instance v1, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_28
    if-nez v8, :cond_23

    sget v3, Lcom/google/android/gms/internal/play_billing/g3;->a:I

    check-cast v12, Lcom/google/android/gms/internal/play_billing/u4;

    invoke-static {v2, v1, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v3

    iget v5, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/w3;->a(I)I

    move-result v5

    invoke-virtual {v12, v5}, Lcom/google/android/gms/internal/play_billing/u4;->w(I)V

    :goto_1e
    if-ge v3, v4, :cond_22

    invoke-static {v2, v3, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v5

    iget v8, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ne v7, v8, :cond_22

    invoke-static {v2, v5, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v3

    iget v5, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/w3;->a(I)I

    move-result v5

    invoke-virtual {v12, v5}, Lcom/google/android/gms/internal/play_billing/u4;->w(I)V

    goto :goto_1e

    :pswitch_f
    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object/from16 v6, p6

    move-object v13, v1

    move v15, v5

    move/from16 v14, v24

    move/from16 v1, v26

    const/4 v5, 0x2

    if-ne v8, v5, :cond_29

    invoke-static {v2, v1, v12, v6}, Lcom/google/android/gms/internal/play_billing/g3;->f([BILcom/google/android/gms/internal/play_billing/y4;Lcom/google/android/gms/internal/play_billing/f3;)I

    move-result v3

    move v5, v1

    move v1, v7

    move-object v10, v12

    goto :goto_1f

    :cond_29
    if-nez v8, :cond_31

    move v3, v1

    move v1, v7

    move-object v5, v12

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/play_billing/g3;->k(I[BIILcom/google/android/gms/internal/play_billing/y4;Lcom/google/android/gms/internal/play_billing/f3;)I

    move-result v7

    move-object v10, v5

    move v5, v3

    move v3, v7

    :goto_1f
    invoke-virtual {v0, v15}, Lcom/google/android/gms/internal/play_billing/a6;->E(I)Lcom/google/android/gms/internal/play_billing/w4;

    move-result-object v7

    iget-object v8, v0, Lcom/google/android/gms/internal/play_billing/a6;->j:Lcom/google/android/gms/internal/play_billing/t6;

    sget-object v9, Lcom/google/android/gms/internal/play_billing/i6;->a:Lcom/google/android/gms/internal/play_billing/t6;

    if-eqz v7, :cond_2f

    if-eqz v10, :cond_2d

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v9

    move/from16 p3, v3

    move-object/from16 v3, v16

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_20
    if-ge v11, v9, :cond_2c

    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v24, v13

    move-object/from16 v13, v18

    check-cast v13, Ljava/lang/Integer;

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v7, v0}, Lcom/google/android/gms/internal/play_billing/w4;->a(I)Z

    move-result v18

    if-eqz v18, :cond_2b

    if-eq v11, v12, :cond_2a

    invoke-interface {v10, v12, v13}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_2a
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v13, p1

    goto :goto_21

    :cond_2b
    move-object/from16 v13, p1

    invoke-static {v13, v14, v0, v3, v8}, Lcom/google/android/gms/internal/play_billing/i6;->s(Ljava/lang/Object;IILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/t6;)Ljava/lang/Object;

    move-result-object v3

    :goto_21
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v0, p0

    move-object/from16 v13, v24

    goto :goto_20

    :cond_2c
    move-object/from16 v24, v13

    move-object/from16 v13, p1

    if-eq v12, v9, :cond_30

    invoke-interface {v10, v12, v9}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    goto :goto_23

    :cond_2d
    move/from16 p3, v3

    move-object/from16 v24, v13

    move-object/from16 v13, p1

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object/from16 v3, v16

    :cond_2e
    :goto_22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_30

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-interface {v7, v9}, Lcom/google/android/gms/internal/play_billing/w4;->a(I)Z

    move-result v10

    if-nez v10, :cond_2e

    invoke-static {v13, v14, v9, v3, v8}, Lcom/google/android/gms/internal/play_billing/i6;->s(Ljava/lang/Object;IILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/t6;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_22

    :cond_2f
    move/from16 p3, v3

    move-object/from16 v24, v13

    move-object/from16 v13, p1

    :cond_30
    :goto_23
    move-object/from16 v11, p0

    move/from16 v0, p3

    :goto_24
    move v10, v1

    move-object v7, v2

    move v1, v5

    move/from16 v18, v14

    move/from16 v26, v15

    goto/16 :goto_1a

    :cond_31
    move-object/from16 v24, v13

    move-object/from16 v13, p1

    move-object/from16 v11, p0

    move v5, v4

    move v10, v7

    move/from16 v18, v14

    move/from16 v26, v15

    goto/16 :goto_1c

    :pswitch_10
    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object/from16 v6, p6

    move v15, v5

    move-object v13, v11

    move-object v10, v12

    move/from16 v14, v24

    move/from16 v5, v26

    const/4 v0, 0x2

    move-object/from16 v24, v1

    move v1, v7

    if-ne v8, v0, :cond_39

    invoke-static {v2, v5, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v0

    iget v7, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ltz v7, :cond_38

    array-length v8, v2

    sub-int/2addr v8, v0

    if-gt v7, v8, :cond_37

    if-nez v7, :cond_32

    sget-object v7, Lcom/google/android/gms/internal/play_billing/s3;->b:Lcom/google/android/gms/internal/play_billing/s3;

    invoke-interface {v10, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_26

    :cond_32
    invoke-static {v2, v0, v7}, Lcom/google/android/gms/internal/play_billing/s3;->k([BII)Lcom/google/android/gms/internal/play_billing/s3;

    move-result-object v8

    invoke-interface {v10, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_25
    add-int/2addr v0, v7

    :goto_26
    if-ge v0, v4, :cond_36

    invoke-static {v2, v0, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v7

    iget v8, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ne v1, v8, :cond_36

    invoke-static {v2, v7, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v0

    iget v7, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ltz v7, :cond_35

    array-length v8, v2

    sub-int/2addr v8, v0

    if-gt v7, v8, :cond_34

    if-nez v7, :cond_33

    sget-object v7, Lcom/google/android/gms/internal/play_billing/s3;->b:Lcom/google/android/gms/internal/play_billing/s3;

    invoke-interface {v10, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_26

    :cond_33
    invoke-static {v2, v0, v7}, Lcom/google/android/gms/internal/play_billing/s3;->k([BII)Lcom/google/android/gms/internal/play_billing/s3;

    move-result-object v8

    invoke-interface {v10, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_25

    :cond_34
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v9}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_35
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_36
    move-object/from16 v11, p0

    goto :goto_24

    :cond_37
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v9}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_38
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_39
    move-object/from16 v11, p0

    move v10, v1

    move-object v7, v2

    move v1, v5

    move/from16 v18, v14

    move/from16 v26, v15

    move v5, v4

    goto/16 :goto_3d

    :pswitch_11
    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object/from16 v6, p6

    move v15, v5

    move-object v13, v11

    move-object v10, v12

    move/from16 v14, v24

    move/from16 v5, v26

    const/4 v0, 0x2

    move-object/from16 v24, v1

    move v1, v7

    if-ne v8, v0, :cond_39

    move-object/from16 v11, p0

    move v7, v1

    invoke-virtual {v11, v15}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object v1

    move v3, v5

    move v5, v4

    move v4, v3

    move-object v3, v2

    move v2, v7

    move-object v7, v6

    move-object v6, v10

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/play_billing/g3;->e(Lcom/google/android/gms/internal/play_billing/h6;I[BIILcom/google/android/gms/internal/play_billing/y4;Lcom/google/android/gms/internal/play_billing/f3;)I

    move-result v0

    move v10, v2

    move v1, v4

    move-object v6, v7

    move/from16 v18, v14

    move/from16 v26, v15

    move-object v7, v3

    goto/16 :goto_3e

    :pswitch_12
    move-object/from16 v6, p6

    move v15, v5

    move-object v13, v11

    move/from16 v14, v24

    move/from16 v10, v26

    move/from16 v5, p4

    move-object v11, v0

    move-object/from16 v24, v1

    move v1, v7

    const/4 v0, 0x2

    move-object/from16 v7, p2

    if-ne v8, v0, :cond_47

    const-wide/32 v8, 0x20000000

    and-long v8, v28, v8

    cmp-long v0, v8, v21

    if-nez v0, :cond_3f

    invoke-static {v7, v10, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v0

    iget v2, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ltz v2, :cond_3e

    if-nez v2, :cond_3a

    invoke-interface {v12, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_28

    :cond_3a
    new-instance v8, Ljava/lang/String;

    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v8, v7, v0, v2, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v12, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_27
    add-int/2addr v0, v2

    :goto_28
    if-ge v0, v5, :cond_3d

    invoke-static {v7, v0, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v2

    iget v8, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ne v1, v8, :cond_3d

    invoke-static {v7, v2, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v0

    iget v2, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ltz v2, :cond_3c

    if-nez v2, :cond_3b

    invoke-interface {v12, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_28

    :cond_3b
    new-instance v8, Ljava/lang/String;

    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v8, v7, v0, v2, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v12, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_27

    :cond_3c
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3d
    move/from16 v18, v10

    move v10, v1

    move/from16 v1, v18

    move/from16 v18, v14

    :goto_29
    move/from16 v26, v15

    goto/16 :goto_3e

    :cond_3e
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3f
    invoke-static {v7, v10, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v0

    iget v8, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ltz v8, :cond_46

    if-nez v8, :cond_40

    invoke-interface {v12, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move/from16 v18, v14

    goto :goto_2b

    :cond_40
    add-int v9, v0, v8

    invoke-static {v7, v0, v9}, Lcom/google/android/gms/internal/play_billing/e7;->b([BII)Z

    move-result v18

    if-eqz v18, :cond_45

    move/from16 p3, v9

    new-instance v9, Ljava/lang/String;

    move/from16 v18, v14

    sget-object v14, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v9, v7, v0, v8, v14}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v12, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2a
    move/from16 v0, p3

    :goto_2b
    if-ge v0, v5, :cond_44

    invoke-static {v7, v0, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v8

    iget v9, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ne v1, v9, :cond_44

    invoke-static {v7, v8, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v0

    iget v8, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ltz v8, :cond_43

    if-nez v8, :cond_41

    invoke-interface {v12, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2b

    :cond_41
    add-int v9, v0, v8

    invoke-static {v7, v0, v9}, Lcom/google/android/gms/internal/play_billing/e7;->b([BII)Z

    move-result v14

    if-eqz v14, :cond_42

    new-instance v14, Ljava/lang/String;

    move/from16 p3, v9

    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v14, v7, v0, v8, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v12, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2a

    :cond_42
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_43
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_44
    :goto_2c
    move/from16 v26, v10

    move v10, v1

    move/from16 v1, v26

    goto :goto_29

    :cond_45
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_46
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_47
    move/from16 v18, v14

    :cond_48
    move/from16 v26, v10

    move v10, v1

    move/from16 v1, v26

    move/from16 v26, v15

    goto/16 :goto_3d

    :pswitch_13
    move-object/from16 v6, p6

    move v15, v5

    move-object v13, v11

    move/from16 v18, v24

    move/from16 v10, v26

    move/from16 v5, p4

    move-object v11, v0

    move-object/from16 v24, v1

    move v1, v7

    const/4 v0, 0x2

    move-object/from16 v7, p2

    if-ne v8, v0, :cond_4e

    sget v0, Lcom/google/android/gms/internal/play_billing/g3;->a:I

    check-cast v12, Lcom/google/android/gms/internal/play_billing/h3;

    invoke-static {v7, v10, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v0

    iget v2, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ltz v2, :cond_4d

    array-length v3, v7

    sub-int/2addr v3, v0

    if-gt v2, v3, :cond_4c

    add-int/2addr v2, v0

    :goto_2d
    if-ge v0, v2, :cond_4a

    invoke-static {v7, v0, v6}, Lcom/google/android/gms/internal/play_billing/g3;->l([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v0

    iget-wide v3, v6, Lcom/google/android/gms/internal/play_billing/f3;->b:J

    cmp-long v3, v3, v21

    if-eqz v3, :cond_49

    const/4 v3, 0x1

    goto :goto_2e

    :cond_49
    const/4 v3, 0x0

    :goto_2e
    invoke-virtual {v12, v3}, Lcom/google/android/gms/internal/play_billing/h3;->c(Z)V

    goto :goto_2d

    :cond_4a
    if-ne v0, v2, :cond_4b

    goto :goto_2c

    :cond_4b
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v9}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4c
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v9}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4d
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4e
    if-nez v8, :cond_48

    sget v0, Lcom/google/android/gms/internal/play_billing/g3;->a:I

    check-cast v12, Lcom/google/android/gms/internal/play_billing/h3;

    invoke-static {v7, v10, v6}, Lcom/google/android/gms/internal/play_billing/g3;->l([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v0

    iget-wide v2, v6, Lcom/google/android/gms/internal/play_billing/f3;->b:J

    cmp-long v2, v2, v21

    if-eqz v2, :cond_4f

    const/4 v2, 0x1

    goto :goto_2f

    :cond_4f
    const/4 v2, 0x0

    :goto_2f
    invoke-virtual {v12, v2}, Lcom/google/android/gms/internal/play_billing/h3;->c(Z)V

    :goto_30
    if-ge v0, v5, :cond_44

    invoke-static {v7, v0, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v2

    iget v3, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ne v1, v3, :cond_44

    invoke-static {v7, v2, v6}, Lcom/google/android/gms/internal/play_billing/g3;->l([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v0

    iget-wide v2, v6, Lcom/google/android/gms/internal/play_billing/f3;->b:J

    cmp-long v2, v2, v21

    if-eqz v2, :cond_50

    const/4 v2, 0x1

    goto :goto_31

    :cond_50
    const/4 v2, 0x0

    :goto_31
    invoke-virtual {v12, v2}, Lcom/google/android/gms/internal/play_billing/h3;->c(Z)V

    goto :goto_30

    :pswitch_14
    move-object/from16 v6, p6

    move v15, v5

    move-object v13, v11

    move/from16 v18, v24

    move/from16 v10, v26

    move/from16 v5, p4

    move-object v11, v0

    move-object/from16 v24, v1

    move v1, v7

    const/4 v0, 0x2

    move-object/from16 v7, p2

    if-ne v8, v0, :cond_55

    sget v0, Lcom/google/android/gms/internal/play_billing/g3;->a:I

    check-cast v12, Lcom/google/android/gms/internal/play_billing/u4;

    invoke-static {v7, v10, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v0

    iget v2, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ltz v2, :cond_54

    array-length v3, v7

    sub-int/2addr v3, v0

    if-gt v2, v3, :cond_53

    add-int v3, v0, v2

    invoke-virtual {v12}, Lcom/google/android/gms/internal/play_billing/u4;->size()I

    move-result v4

    shr-int/lit8 v2, v2, 0x2

    add-int/2addr v4, v2

    invoke-virtual {v12, v4}, Lcom/google/android/gms/internal/play_billing/u4;->e(I)V

    :goto_32
    if-ge v0, v3, :cond_51

    invoke-static {v7, v0}, Lcom/google/android/gms/internal/play_billing/g3;->b([BI)I

    move-result v2

    invoke-virtual {v12, v2}, Lcom/google/android/gms/internal/play_billing/u4;->w(I)V

    add-int/lit8 v0, v0, 0x4

    goto :goto_32

    :cond_51
    if-ne v0, v3, :cond_52

    goto/16 :goto_2c

    :cond_52
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v9}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_53
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v9}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_54
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_55
    const/4 v3, 0x5

    if-ne v8, v3, :cond_48

    add-int/lit8 v0, v10, 0x4

    sget v2, Lcom/google/android/gms/internal/play_billing/g3;->a:I

    check-cast v12, Lcom/google/android/gms/internal/play_billing/u4;

    invoke-static {v7, v10}, Lcom/google/android/gms/internal/play_billing/g3;->b([BI)I

    move-result v2

    invoke-virtual {v12, v2}, Lcom/google/android/gms/internal/play_billing/u4;->w(I)V

    :goto_33
    if-ge v0, v5, :cond_44

    invoke-static {v7, v0, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v2

    iget v3, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ne v1, v3, :cond_44

    invoke-static {v7, v2}, Lcom/google/android/gms/internal/play_billing/g3;->b([BI)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/google/android/gms/internal/play_billing/u4;->w(I)V

    add-int/lit8 v0, v2, 0x4

    goto :goto_33

    :pswitch_15
    move-object/from16 v6, p6

    move v15, v5

    move-object v13, v11

    move/from16 v18, v24

    move/from16 v10, v26

    move/from16 v5, p4

    move-object v11, v0

    move-object/from16 v24, v1

    move v1, v7

    const/4 v0, 0x2

    move-object/from16 v7, p2

    if-ne v8, v0, :cond_5b

    sget v0, Lcom/google/android/gms/internal/play_billing/g3;->a:I

    check-cast v12, Lcom/google/android/gms/internal/play_billing/l5;

    invoke-static {v7, v10, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v0

    iget v2, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ltz v2, :cond_5a

    array-length v3, v7

    sub-int/2addr v3, v0

    if-gt v2, v3, :cond_59

    add-int v3, v0, v2

    invoke-virtual {v12}, Lcom/google/android/gms/internal/play_billing/l5;->size()I

    move-result v4

    shr-int/lit8 v2, v2, 0x3

    add-int/2addr v4, v2

    invoke-virtual {v12, v4}, Lcom/google/android/gms/internal/play_billing/l5;->e(I)V

    :goto_34
    if-ge v0, v3, :cond_56

    move/from16 v26, v15

    invoke-static {v7, v0}, Lcom/google/android/gms/internal/play_billing/g3;->o([BI)J

    move-result-wide v14

    invoke-virtual {v12, v14, v15}, Lcom/google/android/gms/internal/play_billing/l5;->d(J)V

    add-int/lit8 v0, v0, 0x8

    move/from16 v15, v26

    goto :goto_34

    :cond_56
    move/from16 v26, v15

    if-ne v0, v3, :cond_58

    :cond_57
    :goto_35
    move/from16 v30, v10

    move v10, v1

    move/from16 v1, v30

    goto/16 :goto_3e

    :cond_58
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v9}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_59
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v9}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5a
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5b
    move/from16 v26, v15

    const/4 v3, 0x1

    if-ne v8, v3, :cond_5c

    add-int/lit8 v0, v10, 0x8

    sget v2, Lcom/google/android/gms/internal/play_billing/g3;->a:I

    check-cast v12, Lcom/google/android/gms/internal/play_billing/l5;

    invoke-static {v7, v10}, Lcom/google/android/gms/internal/play_billing/g3;->o([BI)J

    move-result-wide v2

    invoke-virtual {v12, v2, v3}, Lcom/google/android/gms/internal/play_billing/l5;->d(J)V

    :goto_36
    if-ge v0, v5, :cond_57

    invoke-static {v7, v0, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v2

    iget v3, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ne v1, v3, :cond_57

    invoke-static {v7, v2}, Lcom/google/android/gms/internal/play_billing/g3;->o([BI)J

    move-result-wide v3

    invoke-virtual {v12, v3, v4}, Lcom/google/android/gms/internal/play_billing/l5;->d(J)V

    add-int/lit8 v0, v2, 0x8

    goto :goto_36

    :cond_5c
    move/from16 v30, v10

    move v10, v1

    move/from16 v1, v30

    goto/16 :goto_3d

    :pswitch_16
    move-object/from16 v6, p6

    move-object v13, v11

    move/from16 v18, v24

    move/from16 v10, v26

    move-object v11, v0

    move-object/from16 v24, v1

    move/from16 v26, v5

    move v1, v7

    const/4 v0, 0x2

    move-object/from16 v7, p2

    move/from16 v5, p4

    if-ne v8, v0, :cond_5d

    invoke-static {v7, v10, v12, v6}, Lcom/google/android/gms/internal/play_billing/g3;->f([BILcom/google/android/gms/internal/play_billing/y4;Lcom/google/android/gms/internal/play_billing/f3;)I

    move-result v0

    goto :goto_35

    :cond_5d
    if-nez v8, :cond_5c

    move v4, v5

    move-object v2, v7

    move v3, v10

    move-object v5, v12

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/play_billing/g3;->k(I[BIILcom/google/android/gms/internal/play_billing/y4;Lcom/google/android/gms/internal/play_billing/f3;)I

    move-result v0

    move v10, v1

    move v1, v3

    goto/16 :goto_1a

    :pswitch_17
    move-object/from16 v6, p6

    move v10, v7

    move-object v13, v11

    move/from16 v18, v24

    move-object/from16 v7, p2

    move-object v11, v0

    move-object/from16 v24, v1

    move/from16 v1, v26

    const/4 v0, 0x2

    move/from16 v26, v5

    move/from16 v5, p4

    if-ne v8, v0, :cond_62

    sget v0, Lcom/google/android/gms/internal/play_billing/g3;->a:I

    check-cast v12, Lcom/google/android/gms/internal/play_billing/l5;

    invoke-static {v7, v1, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v0

    iget v2, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ltz v2, :cond_61

    array-length v3, v7

    sub-int/2addr v3, v0

    if-gt v2, v3, :cond_60

    add-int/2addr v2, v0

    :goto_37
    if-ge v0, v2, :cond_5e

    invoke-static {v7, v0, v6}, Lcom/google/android/gms/internal/play_billing/g3;->l([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v0

    iget-wide v3, v6, Lcom/google/android/gms/internal/play_billing/f3;->b:J

    invoke-virtual {v12, v3, v4}, Lcom/google/android/gms/internal/play_billing/l5;->d(J)V

    goto :goto_37

    :cond_5e
    if-ne v0, v2, :cond_5f

    goto/16 :goto_3e

    :cond_5f
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v9}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_60
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v9}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_61
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_62
    if-nez v8, :cond_6d

    sget v0, Lcom/google/android/gms/internal/play_billing/g3;->a:I

    check-cast v12, Lcom/google/android/gms/internal/play_billing/l5;

    invoke-static {v7, v1, v6}, Lcom/google/android/gms/internal/play_billing/g3;->l([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v0

    iget-wide v2, v6, Lcom/google/android/gms/internal/play_billing/f3;->b:J

    invoke-virtual {v12, v2, v3}, Lcom/google/android/gms/internal/play_billing/l5;->d(J)V

    :goto_38
    if-ge v0, v5, :cond_6e

    invoke-static {v7, v0, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v2

    iget v3, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ne v10, v3, :cond_6e

    invoke-static {v7, v2, v6}, Lcom/google/android/gms/internal/play_billing/g3;->l([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v0

    iget-wide v2, v6, Lcom/google/android/gms/internal/play_billing/f3;->b:J

    invoke-virtual {v12, v2, v3}, Lcom/google/android/gms/internal/play_billing/l5;->d(J)V

    goto :goto_38

    :pswitch_18
    move-object/from16 v6, p6

    move v10, v7

    move-object v13, v11

    move/from16 v18, v24

    move-object/from16 v7, p2

    move-object v11, v0

    move-object/from16 v24, v1

    move/from16 v1, v26

    const/4 v0, 0x2

    move/from16 v26, v5

    move/from16 v5, p4

    if-ne v8, v0, :cond_67

    sget v0, Lcom/google/android/gms/internal/play_billing/g3;->a:I

    check-cast v12, Lcom/google/android/gms/internal/play_billing/n4;

    invoke-static {v7, v1, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v0

    iget v2, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ltz v2, :cond_66

    array-length v3, v7

    sub-int/2addr v3, v0

    if-gt v2, v3, :cond_65

    add-int v3, v0, v2

    invoke-virtual {v12}, Lcom/google/android/gms/internal/play_billing/n4;->size()I

    move-result v4

    shr-int/lit8 v2, v2, 0x2

    add-int/2addr v4, v2

    invoke-virtual {v12, v4}, Lcom/google/android/gms/internal/play_billing/n4;->e(I)V

    :goto_39
    if-ge v0, v3, :cond_63

    invoke-static {v7, v0}, Lcom/google/android/gms/internal/play_billing/g3;->b([BI)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-virtual {v12, v2}, Lcom/google/android/gms/internal/play_billing/n4;->d(F)V

    add-int/lit8 v0, v0, 0x4

    goto :goto_39

    :cond_63
    if-ne v0, v3, :cond_64

    goto/16 :goto_3e

    :cond_64
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v9}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_65
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v9}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_66
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_67
    const/4 v3, 0x5

    if-ne v8, v3, :cond_6d

    add-int/lit8 v0, v1, 0x4

    sget v2, Lcom/google/android/gms/internal/play_billing/g3;->a:I

    check-cast v12, Lcom/google/android/gms/internal/play_billing/n4;

    invoke-static {v7, v1}, Lcom/google/android/gms/internal/play_billing/g3;->b([BI)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-virtual {v12, v2}, Lcom/google/android/gms/internal/play_billing/n4;->d(F)V

    :goto_3a
    if-ge v0, v5, :cond_6e

    invoke-static {v7, v0, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v2

    iget v3, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ne v10, v3, :cond_6e

    invoke-static {v7, v2}, Lcom/google/android/gms/internal/play_billing/g3;->b([BI)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-virtual {v12, v0}, Lcom/google/android/gms/internal/play_billing/n4;->d(F)V

    add-int/lit8 v0, v2, 0x4

    goto :goto_3a

    :pswitch_19
    move-object/from16 v6, p6

    move v10, v7

    move-object v13, v11

    move/from16 v18, v24

    move-object/from16 v7, p2

    move-object v11, v0

    move-object/from16 v24, v1

    move/from16 v1, v26

    const/4 v0, 0x2

    move/from16 v26, v5

    move/from16 v5, p4

    if-ne v8, v0, :cond_6c

    sget v0, Lcom/google/android/gms/internal/play_billing/g3;->a:I

    check-cast v12, Lcom/google/android/gms/internal/play_billing/c4;

    invoke-static {v7, v1, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v0

    iget v2, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ltz v2, :cond_6b

    array-length v3, v7

    sub-int/2addr v3, v0

    if-gt v2, v3, :cond_6a

    add-int v3, v0, v2

    invoke-virtual {v12}, Lcom/google/android/gms/internal/play_billing/c4;->size()I

    move-result v4

    shr-int/lit8 v2, v2, 0x3

    add-int/2addr v4, v2

    invoke-virtual {v12, v4}, Lcom/google/android/gms/internal/play_billing/c4;->e(I)V

    :goto_3b
    if-ge v0, v3, :cond_68

    invoke-static {v7, v0}, Lcom/google/android/gms/internal/play_billing/g3;->o([BI)J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v14

    invoke-virtual {v12, v14, v15}, Lcom/google/android/gms/internal/play_billing/c4;->d(D)V

    add-int/lit8 v0, v0, 0x8

    goto :goto_3b

    :cond_68
    if-ne v0, v3, :cond_69

    goto :goto_3e

    :cond_69
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v9}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6a
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v9}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6b
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6c
    const/4 v3, 0x1

    if-ne v8, v3, :cond_6d

    add-int/lit8 v0, v1, 0x8

    sget v2, Lcom/google/android/gms/internal/play_billing/g3;->a:I

    check-cast v12, Lcom/google/android/gms/internal/play_billing/c4;

    invoke-static {v7, v1}, Lcom/google/android/gms/internal/play_billing/g3;->o([BI)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v2

    invoke-virtual {v12, v2, v3}, Lcom/google/android/gms/internal/play_billing/c4;->d(D)V

    :goto_3c
    if-ge v0, v5, :cond_6e

    invoke-static {v7, v0, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v2

    iget v3, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ne v10, v3, :cond_6e

    invoke-static {v7, v2}, Lcom/google/android/gms/internal/play_billing/g3;->o([BI)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v3

    invoke-virtual {v12, v3, v4}, Lcom/google/android/gms/internal/play_billing/c4;->d(D)V

    add-int/lit8 v0, v2, 0x8

    goto :goto_3c

    :cond_6d
    :goto_3d
    move v0, v1

    :cond_6e
    :goto_3e
    if-eq v0, v1, :cond_6f

    move v4, v5

    move-object v3, v7

    move v15, v10

    move-object v2, v13

    move/from16 v7, v18

    move/from16 v9, v20

    move/from16 v14, v23

    move-object/from16 v1, v24

    move/from16 v8, v26

    const/4 v12, -0x1

    move v5, v0

    :goto_3f
    move-object v0, v11

    goto/16 :goto_4

    :cond_6f
    move/from16 v12, p5

    move v5, v0

    move-object v3, v7

    move/from16 v0, v18

    move/from16 v14, v23

    move-object/from16 v9, v24

    move/from16 v8, v26

    :goto_40
    move-object v7, v6

    goto/16 :goto_4f

    :cond_70
    move-object/from16 v6, p6

    move v3, v5

    move v10, v7

    move/from16 v27, v13

    move-object/from16 v7, p2

    move-object v13, v11

    move-object v11, v0

    move/from16 v0, v24

    move-object/from16 v24, v1

    move/from16 v1, v26

    const/16 v5, 0x32

    move/from16 v26, v12

    move/from16 v12, v27

    if-ne v12, v5, :cond_75

    const/4 v5, 0x2

    if-ne v8, v5, :cond_74

    invoke-virtual {v11, v3}, Lcom/google/android/gms/internal/play_billing/a6;->H(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v5, v24

    invoke-virtual {v5, v13, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/google/android/gms/internal/play_billing/r5;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/play_billing/r5;->f()Z

    move-result v3

    if-nez v3, :cond_71

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/r5;->a()Lcom/google/android/gms/internal/play_billing/r5;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/play_billing/r5;->b()Lcom/google/android/gms/internal/play_billing/r5;

    move-result-object v3

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/play_billing/s5;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v13, v14, v15, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object v2, v3

    :cond_71
    check-cast v0, Lcom/google/android/gms/internal/play_billing/q5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/q5;->c()Lcom/google/android/gms/internal/play_billing/p5;

    check-cast v2, Lcom/google/android/gms/internal/play_billing/r5;

    invoke-static {v7, v1, v6}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v0

    iget v1, v6, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-ltz v1, :cond_73

    sub-int v0, p4, v0

    if-le v1, v0, :cond_72

    goto :goto_41

    :cond_72
    throw v16

    :cond_73
    :goto_41
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v9}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_74
    move-object/from16 v5, v24

    :goto_42
    move/from16 v12, p5

    move v8, v3

    move-object v9, v5

    move-object v3, v7

    move/from16 v14, v23

    move v5, v1

    goto :goto_40

    :cond_75
    move-object/from16 v5, v24

    add-int/lit8 v9, v3, 0x2

    aget v9, v19, v9

    const v17, 0xfffff

    and-int v9, v9, v17

    int-to-long v5, v9

    packed-switch v12, :pswitch_data_2

    move v12, v1

    move/from16 v19, v3

    move-object v3, v7

    move-object/from16 v9, v24

    move-object/from16 v7, p6

    goto/16 :goto_4c

    :pswitch_1a
    const/4 v5, 0x3

    if-ne v8, v5, :cond_76

    and-int/lit8 v2, v10, -0x8

    or-int/lit8 v6, v2, 0x4

    move v4, v1

    invoke-virtual {v11, v13, v0, v3}, Lcom/google/android/gms/internal/play_billing/a6;->J(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v11, v3}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object v2

    move/from16 v5, p4

    move v12, v3

    move-object v3, v7

    move-object/from16 v9, v24

    move-object/from16 v7, p6

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/play_billing/g3;->m(Ljava/lang/Object;Lcom/google/android/gms/internal/play_billing/h6;[BIIILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v2

    invoke-virtual {v11, v13, v0, v12, v1}, Lcom/google/android/gms/internal/play_billing/a6;->l(Ljava/lang/Object;IILjava/lang/Object;)V

    :goto_43
    move v5, v2

    :goto_44
    move/from16 v19, v12

    move v12, v4

    goto/16 :goto_4d

    :cond_76
    move v12, v3

    move-object v3, v7

    move-object/from16 v9, v24

    move-object/from16 v7, p6

    move/from16 v19, v12

    move v12, v1

    goto/16 :goto_4c

    :pswitch_1b
    move v4, v1

    move v12, v3

    move-object v3, v7

    move-object/from16 v9, v24

    move-object/from16 v7, p6

    if-nez v8, :cond_77

    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/play_billing/g3;->l([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v1

    move/from16 p3, v1

    iget-wide v1, v7, Lcom/google/android/gms/internal/play_billing/f3;->b:J

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/w3;->b(J)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v9, v13, v14, v15, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v9, v13, v5, v6, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move/from16 v5, p3

    goto :goto_44

    :cond_77
    move/from16 v19, v12

    move v12, v4

    goto/16 :goto_4c

    :pswitch_1c
    move v4, v1

    move v12, v3

    move-object v3, v7

    move-object/from16 v9, v24

    move-object/from16 v7, p6

    if-nez v8, :cond_77

    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v1

    iget v2, v7, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/w3;->a(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v9, v13, v14, v15, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v9, v13, v5, v6, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_45
    move v5, v1

    goto :goto_44

    :pswitch_1d
    move v4, v1

    move v12, v3

    move-object v3, v7

    move-object/from16 v9, v24

    move-object/from16 v7, p6

    if-nez v8, :cond_77

    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v1

    iget v2, v7, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    invoke-virtual {v11, v12}, Lcom/google/android/gms/internal/play_billing/a6;->E(I)Lcom/google/android/gms/internal/play_billing/w4;

    move-result-object v8

    if-eqz v8, :cond_79

    invoke-interface {v8, v2}, Lcom/google/android/gms/internal/play_billing/w4;->a(I)Z

    move-result v8

    if-eqz v8, :cond_78

    goto :goto_46

    :cond_78
    invoke-static {v13}, Lcom/google/android/gms/internal/play_billing/a6;->w(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/u6;

    move-result-object v5

    int-to-long v14, v2

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v5, v10, v2}, Lcom/google/android/gms/internal/play_billing/u6;->j(ILjava/lang/Object;)V

    goto :goto_45

    :cond_79
    :goto_46
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v9, v13, v14, v15, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v9, v13, v5, v6, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_45

    :pswitch_1e
    move v4, v1

    move v12, v3

    move-object v3, v7

    move-object/from16 v9, v24

    const/4 v1, 0x2

    move-object/from16 v7, p6

    if-ne v8, v1, :cond_77

    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/play_billing/g3;->a([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v1

    iget-object v2, v7, Lcom/google/android/gms/internal/play_billing/f3;->c:Ljava/lang/Object;

    invoke-virtual {v9, v13, v14, v15, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v9, v13, v5, v6, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_45

    :pswitch_1f
    move v4, v1

    move v12, v3

    move-object v3, v7

    move-object/from16 v9, v24

    const/4 v1, 0x2

    move-object/from16 v7, p6

    if-ne v8, v1, :cond_77

    invoke-virtual {v11, v13, v0, v12}, Lcom/google/android/gms/internal/play_billing/a6;->J(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v11, v12}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object v2

    move/from16 v5, p4

    move-object v6, v7

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/play_billing/g3;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/play_billing/h6;[BIILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v2

    invoke-virtual {v11, v13, v0, v12, v1}, Lcom/google/android/gms/internal/play_billing/a6;->l(Ljava/lang/Object;IILjava/lang/Object;)V

    goto/16 :goto_43

    :pswitch_20
    move v12, v1

    move/from16 v19, v3

    move-object v3, v7

    move-object/from16 v9, v24

    const/4 v1, 0x2

    move-object/from16 v7, p6

    if-ne v8, v1, :cond_7e

    invoke-static {v3, v12, v7}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v1

    iget v8, v7, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    if-nez v8, :cond_7a

    invoke-virtual {v9, v13, v14, v15, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_48

    :cond_7a
    and-int v4, v26, v18

    move/from16 p3, v4

    add-int v4, v1, v8

    if-eqz p3, :cond_7c

    invoke-static {v3, v1, v4}, Lcom/google/android/gms/internal/play_billing/e7;->b([BII)Z

    move-result v18

    if-eqz v18, :cond_7b

    goto :goto_47

    :cond_7b
    new-instance v0, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7c
    :goto_47
    new-instance v2, Ljava/lang/String;

    move/from16 p3, v4

    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v2, v3, v1, v8, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-virtual {v9, v13, v14, v15, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move/from16 v1, p3

    :goto_48
    invoke-virtual {v9, v13, v5, v6, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_49
    move v5, v1

    goto/16 :goto_4d

    :pswitch_21
    move v12, v1

    move/from16 v19, v3

    move-object v3, v7

    move-object/from16 v9, v24

    move-object/from16 v7, p6

    if-nez v8, :cond_7e

    invoke-static {v3, v12, v7}, Lcom/google/android/gms/internal/play_billing/g3;->l([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v1

    move/from16 p3, v1

    iget-wide v1, v7, Lcom/google/android/gms/internal/play_billing/f3;->b:J

    cmp-long v1, v1, v21

    if-eqz v1, :cond_7d

    const/16 v25, 0x1

    goto :goto_4a

    :cond_7d
    const/16 v25, 0x0

    :goto_4a
    invoke-static/range {v25 .. v25}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v9, v13, v14, v15, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v9, v13, v5, v6, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_4b
    move/from16 v5, p3

    goto/16 :goto_4d

    :pswitch_22
    move v12, v1

    move/from16 v19, v3

    move-object v3, v7

    move-object/from16 v9, v24

    const/4 v1, 0x5

    move-object/from16 v7, p6

    if-ne v8, v1, :cond_7e

    add-int/lit8 v1, v12, 0x4

    invoke-static {v3, v12}, Lcom/google/android/gms/internal/play_billing/g3;->b([BI)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v9, v13, v14, v15, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v9, v13, v5, v6, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_49

    :pswitch_23
    move v12, v1

    move/from16 v19, v3

    move-object v3, v7

    move-object/from16 v9, v24

    const/4 v1, 0x1

    move-object/from16 v7, p6

    if-ne v8, v1, :cond_7e

    add-int/lit8 v1, v12, 0x8

    invoke-static {v3, v12}, Lcom/google/android/gms/internal/play_billing/g3;->o([BI)J

    move-result-wide v21

    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v9, v13, v14, v15, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v9, v13, v5, v6, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_49

    :pswitch_24
    move v12, v1

    move/from16 v19, v3

    move-object v3, v7

    move-object/from16 v9, v24

    move-object/from16 v7, p6

    if-nez v8, :cond_7e

    invoke-static {v3, v12, v7}, Lcom/google/android/gms/internal/play_billing/g3;->i([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v1

    iget v2, v7, Lcom/google/android/gms/internal/play_billing/f3;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v9, v13, v14, v15, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v9, v13, v5, v6, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_49

    :pswitch_25
    move v12, v1

    move/from16 v19, v3

    move-object v3, v7

    move-object/from16 v9, v24

    move-object/from16 v7, p6

    if-nez v8, :cond_7e

    invoke-static {v3, v12, v7}, Lcom/google/android/gms/internal/play_billing/g3;->l([BILcom/google/android/gms/internal/play_billing/f3;)I

    move-result v1

    move/from16 p3, v1

    iget-wide v1, v7, Lcom/google/android/gms/internal/play_billing/f3;->b:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v9, v13, v14, v15, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v9, v13, v5, v6, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_4b

    :pswitch_26
    move v12, v1

    move/from16 v19, v3

    move-object v3, v7

    move-object/from16 v9, v24

    const/4 v1, 0x5

    move-object/from16 v7, p6

    if-ne v8, v1, :cond_7e

    add-int/lit8 v1, v12, 0x4

    invoke-static {v3, v12}, Lcom/google/android/gms/internal/play_billing/g3;->b([BI)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v9, v13, v14, v15, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v9, v13, v5, v6, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_49

    :pswitch_27
    move v12, v1

    move/from16 v19, v3

    move-object v3, v7

    move-object/from16 v9, v24

    const/4 v1, 0x1

    move-object/from16 v7, p6

    if-ne v8, v1, :cond_7e

    add-int/lit8 v1, v12, 0x8

    invoke-static {v3, v12}, Lcom/google/android/gms/internal/play_billing/g3;->o([BI)J

    move-result-wide v21

    invoke-static/range {v21 .. v22}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v21

    invoke-static/range {v21 .. v22}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v9, v13, v14, v15, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v9, v13, v5, v6, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_49

    :cond_7e
    :goto_4c
    move v5, v12

    :goto_4d
    if-eq v5, v12, :cond_7f

    move/from16 v4, p4

    move-object v6, v7

    move-object v1, v9

    move v15, v10

    move-object v2, v13

    move/from16 v8, v19

    move/from16 v9, v20

    move/from16 v14, v23

    :goto_4e
    const/4 v12, -0x1

    move v7, v0

    goto/16 :goto_3f

    :cond_7f
    move/from16 v12, p5

    move/from16 v8, v19

    move/from16 v14, v23

    :goto_4f
    if-ne v10, v12, :cond_80

    if-eqz v12, :cond_80

    move/from16 v7, p4

    move v15, v10

    :goto_50
    move v6, v5

    move/from16 v0, v20

    const v1, 0xfffff

    goto/16 :goto_53

    :cond_80
    iget-boolean v1, v11, Lcom/google/android/gms/internal/play_billing/a6;->f:Z

    if-eqz v1, :cond_82

    iget-object v1, v7, Lcom/google/android/gms/internal/play_billing/f3;->d:Lcom/google/android/gms/internal/play_billing/f4;

    sget-object v2, Lcom/google/android/gms/internal/play_billing/f4;->b:Lcom/google/android/gms/internal/play_billing/f4;

    sget v2, Lcom/google/android/gms/internal/play_billing/e3;->a:I

    sget-object v2, Lcom/google/android/gms/internal/play_billing/f4;->b:Lcom/google/android/gms/internal/play_billing/f4;

    if-eq v1, v2, :cond_82

    iget-object v2, v11, Lcom/google/android/gms/internal/play_billing/a6;->e:Lcom/google/android/gms/internal/play_billing/x5;

    sget v4, Lcom/google/android/gms/internal/play_billing/g3;->a:I

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/play_billing/f4;->a(Lcom/google/android/gms/internal/play_billing/x5;I)Lcom/google/android/gms/internal/play_billing/s4;

    move-result-object v1

    if-nez v1, :cond_81

    move v3, v5

    invoke-static {v13}, Lcom/google/android/gms/internal/play_billing/a6;->w(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/u6;

    move-result-object v5

    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object v6, v7

    move v1, v10

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/play_billing/g3;->h(I[BIILcom/google/android/gms/internal/play_billing/u6;Lcom/google/android/gms/internal/play_billing/f3;)I

    move-result v3

    move/from16 v7, p4

    :goto_51
    move v5, v3

    goto :goto_52

    :cond_81
    move-object v0, v13

    check-cast v0, Lcom/google/android/gms/internal/play_billing/q4;

    throw v16

    :cond_82
    move v3, v5

    move v1, v10

    invoke-static {v13}, Lcom/google/android/gms/internal/play_billing/a6;->w(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/u6;

    move-result-object v5

    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object/from16 v6, p6

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/play_billing/g3;->h(I[BIILcom/google/android/gms/internal/play_billing/u6;Lcom/google/android/gms/internal/play_billing/f3;)I

    move-result v3

    move v7, v4

    goto :goto_51

    :goto_52
    move-object/from16 v3, p2

    move-object/from16 v6, p6

    move v15, v1

    move v4, v7

    move-object v1, v9

    move-object v2, v13

    move/from16 v9, v20

    goto :goto_4e

    :cond_83
    move/from16 v12, p5

    move-object v11, v0

    move-object v13, v2

    move v7, v4

    move/from16 v20, v9

    move/from16 v23, v14

    move-object v9, v1

    goto :goto_50

    :goto_53
    if-eq v0, v1, :cond_84

    int-to-long v0, v0

    invoke-virtual {v9, v13, v0, v1, v14}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_84
    iget v0, v11, Lcom/google/android/gms/internal/play_billing/a6;->h:I

    move v8, v0

    move-object/from16 v3, v16

    :goto_54
    iget v0, v11, Lcom/google/android/gms/internal/play_billing/a6;->i:I

    if-ge v8, v0, :cond_85

    iget-object v0, v11, Lcom/google/android/gms/internal/play_billing/a6;->g:[I

    iget-object v4, v11, Lcom/google/android/gms/internal/play_billing/a6;->j:Lcom/google/android/gms/internal/play_billing/t6;

    aget v2, v0, v8

    move-object/from16 v5, p1

    move-object v0, v11

    move-object v1, v13

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->G(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/t6;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/google/android/gms/internal/play_billing/u6;

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v11, p0

    move-object/from16 v13, p1

    goto :goto_54

    :cond_85
    if-eqz v3, :cond_86

    move-object/from16 v0, p1

    check-cast v0, Lcom/google/android/gms/internal/play_billing/t4;

    iput-object v3, v0, Lcom/google/android/gms/internal/play_billing/t4;->zzc:Lcom/google/android/gms/internal/play_billing/u6;

    :cond_86
    const-string v0, "Failed to parse the message."

    if-nez v12, :cond_88

    if-ne v6, v7, :cond_87

    goto :goto_55

    :cond_87
    new-instance v1, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_88
    if-gt v6, v7, :cond_89

    if-ne v15, v12, :cond_89

    :goto_55
    return v6

    :cond_89
    new-instance v1, Lcom/google/android/gms/internal/play_billing/f5;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/play_billing/f5;-><init>(Ljava/lang/String;)V

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x12
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_16
        :pswitch_f
        :pswitch_14
        :pswitch_15
        :pswitch_e
        :pswitch_d
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_16
        :pswitch_f
        :pswitch_14
        :pswitch_15
        :pswitch_e
        :pswitch_d
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x33
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_24
        :pswitch_1d
        :pswitch_22
        :pswitch_23
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
    .end packed-switch
.end method

.method public final z(I)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/a6;->a:[I

    add-int/lit8 p1, p1, 0x2

    aget p1, v0, p1

    return p1
.end method

.method public final zza(Ljava/lang/Object;)I
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v6, Lcom/google/android/gms/internal/play_billing/a6;->m:Lsun/misc/Unsafe;

    const/4 v7, 0x0

    const v8, 0xfffff

    move v2, v7

    move v4, v2

    move v9, v4

    move v3, v8

    :goto_0
    iget-object v5, v0, Lcom/google/android/gms/internal/play_billing/a6;->a:[I

    array-length v10, v5

    if-ge v2, v10, :cond_1c

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/play_billing/a6;->C(I)I

    move-result v10

    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/a6;->B(I)I

    move-result v11

    aget v12, v5, v2

    add-int/lit8 v13, v2, 0x2

    aget v5, v5, v13

    and-int v13, v5, v8

    const/16 v14, 0x11

    const/4 v15, 0x1

    if-gt v11, v14, :cond_2

    if-eq v13, v3, :cond_1

    if-ne v13, v8, :cond_0

    move v4, v7

    goto :goto_1

    :cond_0
    int-to-long v3, v13

    invoke-virtual {v6, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    move v4, v3

    :goto_1
    move v3, v13

    :cond_1
    ushr-int/lit8 v5, v5, 0x14

    shl-int v5, v15, v5

    goto :goto_2

    :cond_2
    move v5, v7

    :goto_2
    and-int/2addr v10, v8

    sget-object v13, Lcom/google/android/gms/internal/play_billing/l4;->K:Lcom/google/android/gms/internal/play_billing/l4;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/play_billing/l4;->zza()I

    move-result v13

    if-lt v11, v13, :cond_3

    sget-object v13, Lcom/google/android/gms/internal/play_billing/l4;->X:Lcom/google/android/gms/internal/play_billing/l4;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/play_billing/l4;->zza()I

    :cond_3
    int-to-long v13, v10

    const/16 v10, 0x3f

    packed-switch v11, :pswitch_data_0

    goto/16 :goto_1f

    :pswitch_0
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1b

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/play_billing/x5;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object v10

    invoke-static {v12, v5, v10}, Lcom/google/android/gms/internal/play_billing/i6;->f(ILcom/google/android/gms/internal/play_billing/x5;Lcom/google/android/gms/internal/play_billing/h6;)I

    move-result v5

    :goto_3
    add-int/2addr v9, v5

    goto/16 :goto_1f

    :pswitch_1
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1b

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v1, v13, v14}, Lcom/google/android/gms/internal/play_billing/a6;->D(Ljava/lang/Object;J)J

    move-result-wide v11

    add-long v13, v11, v11

    shr-long v10, v11, v10

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v5

    xor-long/2addr v10, v13

    invoke-static {v10, v11}, Lcom/google/android/gms/internal/play_billing/a4;->w(J)I

    move-result v10

    :goto_4
    add-int/2addr v5, v10

    goto :goto_3

    :pswitch_2
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1b

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v1, v13, v14}, Lcom/google/android/gms/internal/play_billing/a6;->y(Ljava/lang/Object;J)I

    move-result v10

    add-int v11, v10, v10

    shr-int/lit8 v10, v10, 0x1f

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v5

    xor-int/2addr v10, v11

    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v10

    goto :goto_4

    :pswitch_3
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1b

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v5

    :goto_5
    add-int/lit8 v5, v5, 0x8

    goto :goto_3

    :pswitch_4
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1b

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v5

    :goto_6
    add-int/lit8 v5, v5, 0x4

    goto :goto_3

    :pswitch_5
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1b

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v1, v13, v14}, Lcom/google/android/gms/internal/play_billing/a6;->y(Ljava/lang/Object;J)I

    move-result v10

    int-to-long v10, v10

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v5

    invoke-static {v10, v11}, Lcom/google/android/gms/internal/play_billing/a4;->w(J)I

    move-result v10

    goto :goto_4

    :pswitch_6
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1b

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v1, v13, v14}, Lcom/google/android/gms/internal/play_billing/a6;->y(Ljava/lang/Object;J)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v5

    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v10

    goto :goto_4

    :pswitch_7
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1b

    shl-int/lit8 v5, v12, 0x3

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/internal/play_billing/s3;

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v5

    invoke-virtual {v10}, Lcom/google/android/gms/internal/play_billing/s3;->d()I

    move-result v10

    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v11

    :goto_7
    add-int/2addr v11, v10

    add-int/2addr v5, v11

    goto/16 :goto_3

    :pswitch_8
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1b

    shl-int/lit8 v5, v12, 0x3

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object v11

    sget-object v12, Lcom/google/android/gms/internal/play_billing/i6;->a:Lcom/google/android/gms/internal/play_billing/t6;

    check-cast v10, Lcom/google/android/gms/internal/play_billing/c3;

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v5

    invoke-virtual {v10, v11}, Lcom/google/android/gms/internal/play_billing/c3;->c(Lcom/google/android/gms/internal/play_billing/h6;)I

    move-result v10

    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v11

    goto :goto_7

    :pswitch_9
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1b

    shl-int/lit8 v5, v12, 0x3

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v10

    instance-of v11, v10, Lcom/google/android/gms/internal/play_billing/s3;

    if-eqz v11, :cond_4

    check-cast v10, Lcom/google/android/gms/internal/play_billing/s3;

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v5

    invoke-virtual {v10}, Lcom/google/android/gms/internal/play_billing/s3;->d()I

    move-result v10

    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v11

    goto :goto_7

    :cond_4
    check-cast v10, Ljava/lang/String;

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v5

    sget v11, Lcom/google/android/gms/internal/play_billing/e7;->a:I

    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/c7;->b(Ljava/lang/String;)I

    move-result v10

    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v11

    goto :goto_7

    :pswitch_a
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1b

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v5

    add-int/2addr v5, v15

    goto/16 :goto_3

    :pswitch_b
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1b

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v5

    goto/16 :goto_6

    :pswitch_c
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1b

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v5

    goto/16 :goto_5

    :pswitch_d
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1b

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v1, v13, v14}, Lcom/google/android/gms/internal/play_billing/a6;->y(Ljava/lang/Object;J)I

    move-result v10

    int-to-long v10, v10

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v5

    invoke-static {v10, v11}, Lcom/google/android/gms/internal/play_billing/a4;->w(J)I

    move-result v10

    goto/16 :goto_4

    :pswitch_e
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1b

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v1, v13, v14}, Lcom/google/android/gms/internal/play_billing/a6;->D(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v5

    invoke-static {v10, v11}, Lcom/google/android/gms/internal/play_billing/a4;->w(J)I

    move-result v10

    goto/16 :goto_4

    :pswitch_f
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1b

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v1, v13, v14}, Lcom/google/android/gms/internal/play_billing/a6;->D(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v5

    invoke-static {v10, v11}, Lcom/google/android/gms/internal/play_billing/a4;->w(J)I

    move-result v10

    goto/16 :goto_4

    :pswitch_10
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1b

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v5

    goto/16 :goto_6

    :pswitch_11
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1b

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v5

    goto/16 :goto_5

    :pswitch_12
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/play_billing/a6;->H(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v5, Lcom/google/android/gms/internal/play_billing/r5;

    check-cast v10, Lcom/google/android/gms/internal/play_billing/q5;

    invoke-virtual {v5}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_5

    :goto_8
    move v11, v7

    goto :goto_a

    :cond_5
    invoke-virtual {v5}, Lcom/google/android/gms/internal/play_billing/r5;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v11, v7

    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Map$Entry;

    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v14

    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v10, v12, v14, v13}, Lcom/google/android/gms/internal/play_billing/q5;->a(ILjava/lang/Object;Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v11, v13

    goto :goto_9

    :cond_6
    :goto_a
    add-int/2addr v9, v11

    goto/16 :goto_1f

    :pswitch_13
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object v10

    sget-object v11, Lcom/google/android/gms/internal/play_billing/i6;->a:Lcom/google/android/gms/internal/play_billing/t6;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v11

    if-nez v11, :cond_7

    move v14, v7

    goto :goto_c

    :cond_7
    move v13, v7

    move v14, v13

    :goto_b
    if-ge v13, v11, :cond_8

    invoke-interface {v5, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/google/android/gms/internal/play_billing/x5;

    invoke-static {v12, v15, v10}, Lcom/google/android/gms/internal/play_billing/i6;->f(ILcom/google/android/gms/internal/play_billing/x5;Lcom/google/android/gms/internal/play_billing/h6;)I

    move-result v15

    add-int/2addr v14, v15

    add-int/lit8 v13, v13, 0x1

    goto :goto_b

    :cond_8
    :goto_c
    add-int/2addr v9, v14

    goto/16 :goto_1f

    :pswitch_14
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/i6;->o(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_1b

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v11

    :goto_d
    add-int/2addr v10, v11

    add-int/2addr v10, v5

    :cond_9
    :goto_e
    add-int/2addr v9, v10

    goto/16 :goto_1f

    :pswitch_15
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/i6;->n(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_1b

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v11

    goto :goto_d

    :pswitch_16
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/i6;->k(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_1b

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v11

    goto :goto_d

    :pswitch_17
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/i6;->i(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_1b

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v11

    goto :goto_d

    :pswitch_18
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/i6;->g(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_1b

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v11

    goto :goto_d

    :pswitch_19
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/i6;->p(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_1b

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v11

    goto :goto_d

    :pswitch_1a
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    sget-object v10, Lcom/google/android/gms/internal/play_billing/i6;->a:Lcom/google/android/gms/internal/play_billing/t6;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_1b

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v11

    goto/16 :goto_d

    :pswitch_1b
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/i6;->i(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_1b

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v11

    goto/16 :goto_d

    :pswitch_1c
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/i6;->k(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_1b

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v11

    goto/16 :goto_d

    :pswitch_1d
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/i6;->l(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_1b

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v11

    goto/16 :goto_d

    :pswitch_1e
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/i6;->q(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_1b

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v11

    goto/16 :goto_d

    :pswitch_1f
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/i6;->m(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_1b

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v11

    goto/16 :goto_d

    :pswitch_20
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/i6;->i(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_1b

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v11

    goto/16 :goto_d

    :pswitch_21
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/i6;->k(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_1b

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v11

    goto/16 :goto_d

    :pswitch_22
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    sget-object v10, Lcom/google/android/gms/internal/play_billing/i6;->a:Lcom/google/android/gms/internal/play_billing/t6;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_a

    :goto_f
    move v5, v7

    goto/16 :goto_3

    :cond_a
    shl-int/lit8 v11, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/i6;->o(Ljava/util/List;)I

    move-result v5

    invoke-static {v11}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v11

    :goto_10
    mul-int/2addr v10, v11

    goto/16 :goto_4

    :pswitch_23
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    sget-object v10, Lcom/google/android/gms/internal/play_billing/i6;->a:Lcom/google/android/gms/internal/play_billing/t6;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_b

    goto :goto_f

    :cond_b
    shl-int/lit8 v11, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/i6;->n(Ljava/util/List;)I

    move-result v5

    invoke-static {v11}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v11

    goto :goto_10

    :pswitch_24
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v12, v5, v7}, Lcom/google/android/gms/internal/play_billing/i6;->j(ILjava/util/List;Z)I

    move-result v5

    goto/16 :goto_3

    :pswitch_25
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v12, v5, v7}, Lcom/google/android/gms/internal/play_billing/i6;->h(ILjava/util/List;Z)I

    move-result v5

    goto/16 :goto_3

    :pswitch_26
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    sget-object v10, Lcom/google/android/gms/internal/play_billing/i6;->a:Lcom/google/android/gms/internal/play_billing/t6;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_c

    goto :goto_f

    :cond_c
    shl-int/lit8 v11, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/i6;->g(Ljava/util/List;)I

    move-result v5

    invoke-static {v11}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v11

    goto :goto_10

    :pswitch_27
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    sget-object v10, Lcom/google/android/gms/internal/play_billing/i6;->a:Lcom/google/android/gms/internal/play_billing/t6;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_d

    goto :goto_f

    :cond_d
    shl-int/lit8 v11, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/i6;->p(Ljava/util/List;)I

    move-result v5

    invoke-static {v11}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v11

    goto :goto_10

    :pswitch_28
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    sget-object v10, Lcom/google/android/gms/internal/play_billing/i6;->a:Lcom/google/android/gms/internal/play_billing/t6;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_e

    move v10, v7

    goto/16 :goto_e

    :cond_e
    shl-int/lit8 v11, v12, 0x3

    invoke-static {v11}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v11

    mul-int/2addr v10, v11

    move v11, v7

    :goto_11
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v12

    if-ge v11, v12, :cond_9

    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/google/android/gms/internal/play_billing/s3;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/play_billing/s3;->d()I

    move-result v12

    invoke-static {v12}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v13

    add-int/2addr v13, v12

    add-int/2addr v10, v13

    add-int/lit8 v11, v11, 0x1

    goto :goto_11

    :pswitch_29
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object v10

    sget-object v11, Lcom/google/android/gms/internal/play_billing/i6;->a:Lcom/google/android/gms/internal/play_billing/t6;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v11

    if-nez v11, :cond_f

    move v12, v7

    goto :goto_13

    :cond_f
    shl-int/lit8 v12, v12, 0x3

    invoke-static {v12}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v12

    mul-int/2addr v12, v11

    move v13, v7

    :goto_12
    if-ge v13, v11, :cond_10

    invoke-interface {v5, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/google/android/gms/internal/play_billing/c3;

    invoke-virtual {v14, v10}, Lcom/google/android/gms/internal/play_billing/c3;->c(Lcom/google/android/gms/internal/play_billing/h6;)I

    move-result v14

    invoke-static {v14}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v15

    add-int/2addr v15, v14

    add-int/2addr v12, v15

    add-int/lit8 v13, v13, 0x1

    goto :goto_12

    :cond_10
    :goto_13
    add-int/2addr v9, v12

    goto/16 :goto_1f

    :pswitch_2a
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    sget-object v10, Lcom/google/android/gms/internal/play_billing/i6;->a:Lcom/google/android/gms/internal/play_billing/t6;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_11

    goto/16 :goto_8

    :cond_11
    shl-int/lit8 v11, v12, 0x3

    invoke-static {v11}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v11

    mul-int/2addr v11, v10

    instance-of v12, v5, Lcom/google/android/gms/internal/play_billing/h5;

    if-eqz v12, :cond_13

    check-cast v5, Lcom/google/android/gms/internal/play_billing/h5;

    move v12, v7

    :goto_14
    if-ge v12, v10, :cond_6

    invoke-interface {v5}, Lcom/google/android/gms/internal/play_billing/h5;->zza()Ljava/lang/Object;

    move-result-object v13

    instance-of v14, v13, Lcom/google/android/gms/internal/play_billing/s3;

    if-eqz v14, :cond_12

    check-cast v13, Lcom/google/android/gms/internal/play_billing/s3;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/play_billing/s3;->d()I

    move-result v13

    invoke-static {v13}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v14

    :goto_15
    add-int/2addr v14, v13

    add-int/2addr v11, v14

    goto :goto_16

    :cond_12
    check-cast v13, Ljava/lang/String;

    sget v14, Lcom/google/android/gms/internal/play_billing/e7;->a:I

    invoke-static {v13}, Lcom/google/android/gms/internal/play_billing/c7;->b(Ljava/lang/String;)I

    move-result v13

    invoke-static {v13}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v14

    goto :goto_15

    :goto_16
    add-int/lit8 v12, v12, 0x1

    goto :goto_14

    :cond_13
    move v12, v7

    :goto_17
    if-ge v12, v10, :cond_6

    invoke-interface {v5, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    instance-of v14, v13, Lcom/google/android/gms/internal/play_billing/s3;

    if-eqz v14, :cond_14

    check-cast v13, Lcom/google/android/gms/internal/play_billing/s3;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/play_billing/s3;->d()I

    move-result v13

    invoke-static {v13}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v14

    :goto_18
    add-int/2addr v14, v13

    add-int/2addr v11, v14

    goto :goto_19

    :cond_14
    check-cast v13, Ljava/lang/String;

    sget v14, Lcom/google/android/gms/internal/play_billing/e7;->a:I

    invoke-static {v13}, Lcom/google/android/gms/internal/play_billing/c7;->b(Ljava/lang/String;)I

    move-result v13

    invoke-static {v13}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v14

    goto :goto_18

    :goto_19
    add-int/lit8 v12, v12, 0x1

    goto :goto_17

    :pswitch_2b
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    sget-object v10, Lcom/google/android/gms/internal/play_billing/i6;->a:Lcom/google/android/gms/internal/play_billing/t6;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-nez v5, :cond_15

    goto/16 :goto_f

    :cond_15
    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v10

    add-int/2addr v10, v15

    mul-int/2addr v5, v10

    goto/16 :goto_3

    :pswitch_2c
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v12, v5, v7}, Lcom/google/android/gms/internal/play_billing/i6;->h(ILjava/util/List;Z)I

    move-result v5

    goto/16 :goto_3

    :pswitch_2d
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v12, v5, v7}, Lcom/google/android/gms/internal/play_billing/i6;->j(ILjava/util/List;Z)I

    move-result v5

    goto/16 :goto_3

    :pswitch_2e
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    sget-object v10, Lcom/google/android/gms/internal/play_billing/i6;->a:Lcom/google/android/gms/internal/play_billing/t6;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_16

    goto/16 :goto_f

    :cond_16
    shl-int/lit8 v11, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/i6;->l(Ljava/util/List;)I

    move-result v5

    invoke-static {v11}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v11

    goto/16 :goto_10

    :pswitch_2f
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    sget-object v10, Lcom/google/android/gms/internal/play_billing/i6;->a:Lcom/google/android/gms/internal/play_billing/t6;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_17

    goto/16 :goto_f

    :cond_17
    shl-int/lit8 v11, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/i6;->q(Ljava/util/List;)I

    move-result v5

    invoke-static {v11}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v11

    goto/16 :goto_10

    :pswitch_30
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    sget-object v10, Lcom/google/android/gms/internal/play_billing/i6;->a:Lcom/google/android/gms/internal/play_billing/t6;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_18

    goto/16 :goto_8

    :cond_18
    shl-int/lit8 v10, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/i6;->m(Ljava/util/List;)I

    move-result v11

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v10

    mul-int/2addr v5, v10

    add-int/2addr v11, v5

    goto/16 :goto_a

    :pswitch_31
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v12, v5, v7}, Lcom/google/android/gms/internal/play_billing/i6;->h(ILjava/util/List;Z)I

    move-result v5

    goto/16 :goto_3

    :pswitch_32
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v12, v5, v7}, Lcom/google/android/gms/internal/play_billing/i6;->j(ILjava/util/List;Z)I

    move-result v5

    goto/16 :goto_3

    :pswitch_33
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_1b

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/play_billing/x5;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object v10

    invoke-static {v12, v5, v10}, Lcom/google/android/gms/internal/play_billing/i6;->f(ILcom/google/android/gms/internal/play_billing/x5;Lcom/google/android/gms/internal/play_billing/h6;)I

    move-result v5

    goto/16 :goto_3

    :pswitch_34
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v0, v12, 0x3

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v11

    add-long v13, v11, v11

    shr-long v10, v11, v10

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v0

    xor-long/2addr v10, v13

    invoke-static {v10, v11}, Lcom/google/android/gms/internal/play_billing/a4;->w(J)I

    move-result v5

    :goto_1a
    add-int/2addr v0, v5

    :goto_1b
    add-int/2addr v9, v0

    :cond_19
    move-object/from16 v0, p0

    goto/16 :goto_1f

    :pswitch_35
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v0, v12, 0x3

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    add-int v10, v5, v5

    shr-int/lit8 v5, v5, 0x1f

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v0

    xor-int/2addr v5, v10

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v5

    goto :goto_1a

    :pswitch_36
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v0, v12, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v0

    :goto_1c
    add-int/lit8 v0, v0, 0x8

    goto :goto_1b

    :pswitch_37
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v0, v12, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v0

    :goto_1d
    add-int/lit8 v0, v0, 0x4

    goto :goto_1b

    :pswitch_38
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v0, v12, 0x3

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    int-to-long v10, v5

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v0

    invoke-static {v10, v11}, Lcom/google/android/gms/internal/play_billing/a4;->w(J)I

    move-result v5

    goto :goto_1a

    :pswitch_39
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v0, v12, 0x3

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v0

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v5

    goto :goto_1a

    :pswitch_3a
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v0, v12, 0x3

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/play_billing/s3;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v0

    invoke-virtual {v5}, Lcom/google/android/gms/internal/play_billing/s3;->d()I

    move-result v5

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v10

    :goto_1e
    add-int/2addr v10, v5

    add-int/2addr v0, v10

    goto/16 :goto_1b

    :pswitch_3b
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_1b

    shl-int/lit8 v5, v12, 0x3

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/play_billing/a6;->F(I)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object v11

    sget-object v12, Lcom/google/android/gms/internal/play_billing/i6;->a:Lcom/google/android/gms/internal/play_billing/t6;

    check-cast v10, Lcom/google/android/gms/internal/play_billing/c3;

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v5

    invoke-virtual {v10, v11}, Lcom/google/android/gms/internal/play_billing/c3;->c(Lcom/google/android/gms/internal/play_billing/h6;)I

    move-result v10

    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v11

    goto/16 :goto_7

    :pswitch_3c
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v0, v12, 0x3

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    instance-of v10, v5, Lcom/google/android/gms/internal/play_billing/s3;

    if-eqz v10, :cond_1a

    check-cast v5, Lcom/google/android/gms/internal/play_billing/s3;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v0

    invoke-virtual {v5}, Lcom/google/android/gms/internal/play_billing/s3;->d()I

    move-result v5

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v10

    goto :goto_1e

    :cond_1a
    check-cast v5, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v0

    sget v10, Lcom/google/android/gms/internal/play_billing/e7;->a:I

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/c7;->b(Ljava/lang/String;)I

    move-result v5

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v10

    goto :goto_1e

    :pswitch_3d
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v0, v12, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v0

    add-int/2addr v0, v15

    goto/16 :goto_1b

    :pswitch_3e
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v0, v12, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v0

    goto/16 :goto_1d

    :pswitch_3f
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v0, v12, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v0

    goto/16 :goto_1c

    :pswitch_40
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v0, v12, 0x3

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    int-to-long v10, v5

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v0

    invoke-static {v10, v11}, Lcom/google/android/gms/internal/play_billing/a4;->w(J)I

    move-result v5

    goto/16 :goto_1a

    :pswitch_41
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v0, v12, 0x3

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v0

    invoke-static {v10, v11}, Lcom/google/android/gms/internal/play_billing/a4;->w(J)I

    move-result v5

    goto/16 :goto_1a

    :pswitch_42
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v0, v12, 0x3

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v0

    invoke-static {v10, v11}, Lcom/google/android/gms/internal/play_billing/a4;->w(J)I

    move-result v5

    goto/16 :goto_1a

    :pswitch_43
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v0, v12, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v0

    goto/16 :goto_1d

    :pswitch_44
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/a6;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_1b

    shl-int/lit8 v1, v12, 0x3

    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x8

    add-int/2addr v9, v1

    :cond_1b
    :goto_1f
    add-int/lit8 v2, v2, 0x3

    move-object/from16 v1, p1

    goto/16 :goto_0

    :cond_1c
    move-object/from16 v1, p1

    check-cast v1, Lcom/google/android/gms/internal/play_billing/t4;

    iget-object v1, v1, Lcom/google/android/gms/internal/play_billing/t4;->zzc:Lcom/google/android/gms/internal/play_billing/u6;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/u6;->a()I

    move-result v1

    add-int/2addr v9, v1

    iget-boolean v1, v0, Lcom/google/android/gms/internal/play_billing/a6;->f:Z

    if-eqz v1, :cond_1f

    move-object/from16 v1, p1

    check-cast v1, Lcom/google/android/gms/internal/play_billing/q4;

    iget-object v1, v1, Lcom/google/android/gms/internal/play_billing/q4;->zzb:Lcom/google/android/gms/internal/play_billing/k4;

    iget-object v1, v1, Lcom/google/android/gms/internal/play_billing/k4;->a:Lcom/google/android/gms/internal/play_billing/p6;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/p6;->c()I

    move-result v2

    move v3, v7

    :goto_20
    if-ge v7, v2, :cond_1d

    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/play_billing/p6;->g(I)Ljava/util/Map$Entry;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/google/android/gms/internal/play_billing/k6;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/play_billing/k6;->a()Ljava/lang/Comparable;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/play_billing/j4;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5, v4}, Lcom/google/android/gms/internal/play_billing/k4;->c(Lcom/google/android/gms/internal/play_billing/j4;Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v7, v7, 0x1

    goto :goto_20

    :cond_1d
    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/p6;->d()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_21
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/play_billing/j4;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/google/android/gms/internal/play_billing/k4;->c(Lcom/google/android/gms/internal/play_billing/j4;Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v3, v2

    goto :goto_21

    :cond_1e
    add-int/2addr v9, v3

    :cond_1f
    return v9

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zzb(Ljava/lang/Object;)I
    .locals 8

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/internal/play_billing/a6;->a:[I

    array-length v3, v3

    const v4, 0xfffff

    if-ge v1, v3, :cond_3

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/play_billing/a6;->C(I)I

    move-result v3

    invoke-static {v3}, Lcom/google/android/gms/internal/play_billing/a6;->B(I)I

    move-result v5

    const/16 v6, 0x32

    if-le v5, v6, :cond_0

    const/16 v6, 0x45

    if-lt v5, v6, :cond_2

    :cond_0
    and-int/2addr v3, v4

    int-to-long v3, v3

    const/16 v6, 0x25

    const/16 v7, 0x20

    packed-switch v5, :pswitch_data_0

    goto/16 :goto_4

    :pswitch_0
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v2, v3

    goto/16 :goto_4

    :pswitch_1
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_1

    :pswitch_2
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v6

    :cond_1
    :goto_2
    add-int/2addr v2, v6

    goto/16 :goto_4

    :pswitch_3
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->h(Ljava/lang/Object;J)J

    move-result-wide v3

    sget-object v5, Lcom/google/android/gms/internal/play_billing/z4;->a:[B

    :goto_3
    ushr-long v5, v3, v7

    xor-long/2addr v3, v5

    long-to-int v3, v3

    goto :goto_1

    :pswitch_4
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result v3

    goto :goto_1

    :pswitch_5
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->h(Ljava/lang/Object;J)J

    move-result-wide v3

    sget-object v5, Lcom/google/android/gms/internal/play_billing/z4;->a:[B

    goto :goto_3

    :pswitch_6
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result v3

    goto :goto_1

    :pswitch_7
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result v3

    goto :goto_1

    :pswitch_8
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result v3

    goto :goto_1

    :pswitch_9
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_1

    :pswitch_a
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v6

    goto :goto_2

    :pswitch_b
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    goto :goto_1

    :pswitch_c
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->A(Ljava/lang/Object;J)Z

    move-result v3

    invoke-static {v3}, Lcom/google/android/gms/internal/play_billing/z4;->a(Z)I

    move-result v3

    goto :goto_1

    :pswitch_d
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_1

    :pswitch_e
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->h(Ljava/lang/Object;J)J

    move-result-wide v3

    sget-object v5, Lcom/google/android/gms/internal/play_billing/z4;->a:[B

    goto :goto_3

    :pswitch_f
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->g(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_1

    :pswitch_10
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->h(Ljava/lang/Object;J)J

    move-result-wide v3

    sget-object v5, Lcom/google/android/gms/internal/play_billing/z4;->a:[B

    goto :goto_3

    :pswitch_11
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->h(Ljava/lang/Object;J)J

    move-result-wide v3

    sget-object v5, Lcom/google/android/gms/internal/play_billing/z4;->a:[B

    goto/16 :goto_3

    :pswitch_12
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->f(Ljava/lang/Object;J)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    goto/16 :goto_1

    :pswitch_13
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/a7;->e(Ljava/lang/Object;J)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    sget-object v5, Lcom/google/android/gms/internal/play_billing/z4;->a:[B

    goto/16 :goto_3

    :cond_2
    :goto_4
    add-int/lit8 v1, v1, 0x3

    goto/16 :goto_0

    :cond_3
    iget v1, p0, Lcom/google/android/gms/internal/play_billing/a6;->i:I

    :goto_5
    iget-object v3, p0, Lcom/google/android/gms/internal/play_billing/a6;->g:[I

    array-length v5, v3

    if-ge v1, v5, :cond_5

    aget v3, v3, v1

    invoke-virtual {p0, p1, v0, v3}, Lcom/google/android/gms/internal/play_billing/a6;->s(Ljava/lang/Object;II)Z

    move-result v5

    if-nez v5, :cond_4

    mul-int/lit8 v2, v2, 0x35

    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/play_billing/a6;->C(I)I

    move-result v3

    and-int/2addr v3, v4

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/google/android/gms/internal/play_billing/a7;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v2, v3

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_5
    mul-int/lit8 v2, v2, 0x35

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/play_billing/t4;

    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/t4;->zzc:Lcom/google/android/gms/internal/play_billing/u6;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v2, v0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/play_billing/a6;->f:Z

    if-eqz v0, :cond_6

    mul-int/lit8 v2, v2, 0x35

    check-cast p1, Lcom/google/android/gms/internal/play_billing/q4;

    iget-object p1, p1, Lcom/google/android/gms/internal/play_billing/q4;->zzb:Lcom/google/android/gms/internal/play_billing/k4;

    iget-object p1, p1, Lcom/google/android/gms/internal/play_billing/k4;->a:Lcom/google/android/gms/internal/play_billing/p6;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/p6;->hashCode()I

    move-result p1

    add-int/2addr v2, p1

    :cond_6
    return v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zze()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/a6;->e:Lcom/google/android/gms/internal/play_billing/x5;

    check-cast v0, Lcom/google/android/gms/internal/play_billing/t4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/t4;->u()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object v0

    return-object v0
.end method
