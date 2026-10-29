.class public Lre/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a([B[B)[B
    .locals 57

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    array-length v2, v0

    const/16 v3, 0x20

    if-ne v2, v3, :cond_1

    const/4 v2, 0x0

    invoke-static {v0, v2, v2}, Lre/k0;->c([BII)J

    move-result-wide v4

    const-wide/32 v6, 0x3ffffff

    and-long/2addr v4, v6

    const/4 v8, 0x3

    const/4 v9, 0x2

    invoke-static {v0, v8, v9}, Lre/k0;->c([BII)J

    move-result-wide v10

    const-wide/32 v12, 0x3ffff03

    and-long/2addr v10, v12

    const/4 v12, 0x6

    const/4 v13, 0x4

    invoke-static {v0, v12, v13}, Lre/k0;->c([BII)J

    move-result-wide v14

    const-wide/32 v16, 0x3ffc0ff

    and-long v14, v14, v16

    move/from16 v16, v3

    const/16 v3, 0x9

    invoke-static {v0, v3, v12}, Lre/k0;->c([BII)J

    move-result-wide v17

    const-wide/32 v19, 0x3f03fff

    and-long v17, v17, v19

    move-wide/from16 v19, v6

    const/16 v6, 0xc

    const/16 v7, 0x8

    invoke-static {v0, v6, v7}, Lre/k0;->c([BII)J

    move-result-wide v21

    const-wide/32 v23, 0xfffff

    and-long v21, v21, v23

    const-wide/16 v23, 0x5

    mul-long v25, v10, v23

    mul-long v27, v14, v23

    mul-long v29, v17, v23

    mul-long v31, v21, v23

    const/16 v6, 0x11

    new-array v6, v6, [B

    const-wide/16 v34, 0x0

    move v7, v2

    move-wide/from16 v36, v34

    move-wide/from16 v38, v36

    move-wide/from16 v40, v38

    move-wide/from16 v42, v40

    :goto_0
    array-length v3, v1

    const/16 v46, 0x18

    const/16 v12, 0x10

    const/16 v47, 0x1a

    if-ge v7, v3, :cond_0

    invoke-static {v6, v1, v7}, Lre/k0;->b([B[BI)V

    invoke-static {v6, v2, v2}, Lre/k0;->c([BII)J

    move-result-wide v48

    add-long v42, v42, v48

    invoke-static {v6, v8, v9}, Lre/k0;->c([BII)J

    move-result-wide v48

    add-long v34, v34, v48

    const/4 v3, 0x6

    invoke-static {v6, v3, v13}, Lre/k0;->c([BII)J

    move-result-wide v48

    add-long v36, v36, v48

    const/16 v8, 0x9

    invoke-static {v6, v8, v3}, Lre/k0;->c([BII)J

    move-result-wide v49

    add-long v38, v38, v49

    const/16 v3, 0x8

    const/16 v8, 0xc

    invoke-static {v6, v8, v3}, Lre/k0;->c([BII)J

    move-result-wide v49

    aget-byte v3, v6, v12

    shl-int/lit8 v3, v3, 0x18

    move-wide/from16 v51, v10

    int-to-long v9, v3

    or-long v9, v49, v9

    add-long v40, v40, v9

    mul-long v9, v42, v4

    mul-long v11, v34, v31

    add-long/2addr v9, v11

    mul-long v11, v36, v29

    add-long/2addr v9, v11

    mul-long v11, v38, v27

    add-long/2addr v9, v11

    mul-long v11, v40, v25

    add-long/2addr v9, v11

    mul-long v11, v42, v51

    mul-long v49, v34, v4

    add-long v11, v11, v49

    mul-long v49, v36, v31

    add-long v11, v11, v49

    mul-long v49, v38, v29

    add-long v11, v11, v49

    mul-long v49, v40, v27

    add-long v11, v11, v49

    mul-long v49, v42, v14

    mul-long v53, v34, v51

    add-long v49, v49, v53

    mul-long v53, v36, v4

    add-long v49, v49, v53

    mul-long v53, v38, v31

    add-long v49, v49, v53

    mul-long v53, v40, v29

    add-long v49, v49, v53

    mul-long v53, v42, v17

    mul-long v55, v34, v14

    add-long v53, v53, v55

    mul-long v55, v36, v51

    add-long v53, v53, v55

    mul-long v55, v38, v4

    add-long v53, v53, v55

    mul-long v55, v40, v31

    add-long v53, v53, v55

    mul-long v42, v42, v21

    mul-long v34, v34, v17

    add-long v42, v42, v34

    mul-long v36, v36, v14

    add-long v42, v42, v36

    mul-long v38, v38, v51

    add-long v42, v42, v38

    mul-long v40, v40, v4

    add-long v42, v42, v40

    shr-long v34, v9, v47

    and-long v9, v9, v19

    add-long v11, v11, v34

    shr-long v34, v11, v47

    and-long v11, v11, v19

    add-long v49, v49, v34

    shr-long v34, v49, v47

    and-long v36, v49, v19

    add-long v53, v53, v34

    shr-long v34, v53, v47

    and-long v38, v53, v19

    add-long v42, v42, v34

    shr-long v34, v42, v47

    and-long v40, v42, v19

    mul-long v34, v34, v23

    add-long v9, v9, v34

    shr-long v34, v9, v47

    and-long v42, v9, v19

    add-long v34, v11, v34

    add-int/lit8 v7, v7, 0x10

    move-wide/from16 v10, v51

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v12, 0x6

    goto/16 :goto_0

    :cond_0
    shr-long v3, v34, v47

    and-long v5, v34, v19

    add-long v36, v36, v3

    shr-long v3, v36, v47

    and-long v7, v36, v19

    add-long v38, v38, v3

    shr-long v3, v38, v47

    and-long v9, v38, v19

    add-long v40, v40, v3

    shr-long v3, v40, v47

    and-long v14, v40, v19

    mul-long v3, v3, v23

    add-long v42, v42, v3

    shr-long v3, v42, v47

    and-long v17, v42, v19

    add-long/2addr v5, v3

    add-long v23, v17, v23

    shr-long v3, v23, v47

    and-long v21, v23, v19

    add-long/2addr v3, v5

    shr-long v23, v3, v47

    and-long v3, v3, v19

    add-long v23, v7, v23

    shr-long v25, v23, v47

    and-long v23, v23, v19

    add-long v25, v9, v25

    shr-long v27, v25, v47

    and-long v19, v25, v19

    add-long v27, v14, v27

    const-wide/32 v25, 0x4000000

    sub-long v27, v27, v25

    const/16 v1, 0x3f

    move-wide/from16 v25, v14

    shr-long v13, v27, v1

    and-long v17, v17, v13

    and-long/2addr v5, v13

    and-long/2addr v7, v13

    and-long/2addr v9, v13

    and-long v25, v25, v13

    not-long v13, v13

    and-long v21, v21, v13

    or-long v17, v17, v21

    and-long/2addr v3, v13

    or-long/2addr v3, v5

    and-long v5, v23, v13

    or-long/2addr v5, v7

    and-long v7, v19, v13

    or-long/2addr v7, v9

    and-long v9, v27, v13

    or-long v9, v25, v9

    shl-long v13, v3, v47

    or-long v13, v17, v13

    const-wide v17, 0xffffffffL

    and-long v13, v13, v17

    const/16 v45, 0x6

    shr-long v3, v3, v45

    const/16 v1, 0x14

    shl-long v19, v5, v1

    or-long v3, v3, v19

    and-long v3, v3, v17

    const/16 v33, 0xc

    shr-long v5, v5, v33

    const/16 v15, 0xe

    shl-long v19, v7, v15

    or-long v5, v5, v19

    and-long v5, v5, v17

    const/16 v15, 0x12

    shr-long/2addr v7, v15

    const/16 v44, 0x8

    shl-long v9, v9, v44

    or-long/2addr v7, v9

    and-long v7, v7, v17

    invoke-static {v0, v12}, Lre/k0;->d([BI)J

    move-result-wide v9

    add-long/2addr v13, v9

    and-long v9, v13, v17

    invoke-static {v0, v1}, Lre/k0;->d([BI)J

    move-result-wide v19

    add-long v3, v3, v19

    shr-long v13, v13, v16

    add-long/2addr v3, v13

    and-long v13, v3, v17

    move/from16 v1, v46

    invoke-static {v0, v1}, Lre/k0;->d([BI)J

    move-result-wide v19

    add-long v5, v5, v19

    shr-long v3, v3, v16

    add-long/2addr v5, v3

    and-long v3, v5, v17

    const/16 v1, 0x1c

    invoke-static {v0, v1}, Lre/k0;->d([BI)J

    move-result-wide v0

    add-long/2addr v7, v0

    shr-long v0, v5, v16

    add-long/2addr v7, v0

    and-long v0, v7, v17

    new-array v5, v12, [B

    invoke-static {v5, v9, v10, v2}, Lre/k0;->e([BJI)V

    const/4 v11, 0x4

    invoke-static {v5, v13, v14, v11}, Lre/k0;->e([BJI)V

    const/16 v2, 0x8

    invoke-static {v5, v3, v4, v2}, Lre/k0;->e([BJI)V

    const/16 v8, 0xc

    invoke-static {v5, v0, v1, v8}, Lre/k0;->e([BJI)V

    return-object v5

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The key length in bytes must be 32."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static b([B[BI)V
    .locals 3

    array-length v0, p1

    sub-int/2addr v0, p2

    const/16 v1, 0x10

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v2, 0x0

    invoke-static {p1, p2, p0, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 p1, 0x1

    aput-byte p1, p0, v0

    if-eq v0, v1, :cond_0

    add-int/2addr v0, p1

    array-length p1, p0

    invoke-static {p0, v0, p1, v2}, Ljava/util/Arrays;->fill([BIIB)V

    :cond_0
    return-void
.end method

.method public static c([BII)J
    .locals 2

    invoke-static {p0, p1}, Lre/k0;->d([BI)J

    move-result-wide p0

    shr-long/2addr p0, p2

    const-wide/32 v0, 0x3ffffff

    and-long/2addr p0, v0

    return-wide p0
.end method

.method public static d([BI)J
    .locals 2

    aget-byte v0, p0, p1

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x3

    aget-byte p0, p0, p1

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x18

    or-int/2addr p0, v0

    int-to-long p0, p0

    const-wide v0, 0xffffffffL

    and-long/2addr p0, v0

    return-wide p0
.end method

.method public static e([BJI)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x4

    if-ge v0, v1, :cond_0

    add-int v1, p3, v0

    const-wide/16 v2, 0xff

    and-long/2addr v2, p1

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, p0, v1

    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0x8

    shr-long/2addr p1, v1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static f([B[B[B)V
    .locals 0

    invoke-static {p0, p1}, Lre/k0;->a([B[B)[B

    move-result-object p0

    invoke-static {p0, p2}, Ldf/e;->b([B[B)Z

    move-result p0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "invalid MAC"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
