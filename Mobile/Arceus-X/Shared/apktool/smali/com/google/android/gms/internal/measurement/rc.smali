.class public final Lcom/google/android/gms/internal/measurement/rc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zc;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/measurement/zc<",
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

.field public final e:Lcom/google/android/gms/internal/measurement/oc;

.field public final f:Z

.field public final g:[I

.field public final h:I

.field public final i:I

.field public final j:Lcom/google/android/gms/internal/measurement/ld;

.field public final k:Lcom/google/android/gms/internal/measurement/sa;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, Lcom/google/android/gms/internal/measurement/rc;->l:[I

    invoke-static {}, Lcom/google/android/gms/internal/measurement/sd;->v()Lsun/misc/Unsafe;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/rc;->m:Lsun/misc/Unsafe;

    return-void
.end method

.method public constructor <init>([I[Ljava/lang/Object;IILcom/google/android/gms/internal/measurement/oc;Z[IIILcom/google/android/gms/internal/measurement/tc;Lcom/google/android/gms/internal/measurement/zb;Lcom/google/android/gms/internal/measurement/ld;Lcom/google/android/gms/internal/measurement/sa;Lcom/google/android/gms/internal/measurement/jc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/rc;->a:[I

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/rc;->b:[Ljava/lang/Object;

    iput p3, p0, Lcom/google/android/gms/internal/measurement/rc;->c:I

    iput p4, p0, Lcom/google/android/gms/internal/measurement/rc;->d:I

    const/4 p1, 0x0

    if-eqz p13, :cond_0

    instance-of p2, p5, Lcom/google/android/gms/internal/measurement/db;

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    :cond_0
    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/rc;->f:Z

    iput-object p7, p0, Lcom/google/android/gms/internal/measurement/rc;->g:[I

    iput p8, p0, Lcom/google/android/gms/internal/measurement/rc;->h:I

    iput p9, p0, Lcom/google/android/gms/internal/measurement/rc;->i:I

    iput-object p12, p0, Lcom/google/android/gms/internal/measurement/rc;->j:Lcom/google/android/gms/internal/measurement/ld;

    iput-object p13, p0, Lcom/google/android/gms/internal/measurement/rc;->k:Lcom/google/android/gms/internal/measurement/sa;

    iput-object p5, p0, Lcom/google/android/gms/internal/measurement/rc;->e:Lcom/google/android/gms/internal/measurement/oc;

    return-void
.end method

.method public static J(Ljava/lang/Object;ILcom/google/android/gms/internal/measurement/zc;)Z
    .locals 2

    const v0, 0xfffff

    and-int/2addr p1, v0

    int-to-long v0, p1

    invoke-static {p0, v0, v1}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p2, p0}, Lcom/google/android/gms/internal/measurement/zc;->a(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static M(I)I
    .locals 0

    ushr-int/lit8 p0, p0, 0x14

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public static g(Ljava/lang/Object;)Z
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    instance-of v0, p0, Lcom/google/android/gms/internal/measurement/gb;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/google/android/gms/internal/measurement/gb;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/gb;->k()Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static h(Ljava/lang/Object;)V
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/rc;->g(Ljava/lang/Object;)Z

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

.method public static i(Ljava/lang/Object;J)D
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Double;

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p0

    return-wide p0
.end method

.method public static j(Ljava/lang/Object;J)F
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    return p0
.end method

.method public static k(Ljava/lang/Object;J)I
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public static l(Ljava/lang/Object;J)J
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    return-wide p0
.end method

.method public static m(Ljava/lang/Object;J)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static final u([BIILcom/google/android/gms/internal/measurement/wd;Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/v9;)I
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/wd;->c:Lcom/google/android/gms/internal/measurement/wd;

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    packed-switch p3, :pswitch_data_0

    :pswitch_0
    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "unsupported field type."

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_1
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/measurement/w9;->c([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result p0

    iget-wide p1, p5, Lcom/google/android/gms/internal/measurement/v9;->b:J

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/measurement/ja;->b(J)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p5, Lcom/google/android/gms/internal/measurement/v9;->c:Ljava/lang/Object;

    return p0

    :pswitch_2
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result p0

    iget p1, p5, Lcom/google/android/gms/internal/measurement/v9;->a:I

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/ja;->a(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p5, Lcom/google/android/gms/internal/measurement/v9;->c:Ljava/lang/Object;

    return p0

    :pswitch_3
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/measurement/w9;->g([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result p0

    return p0

    :pswitch_4
    invoke-static {}, Lcom/google/android/gms/internal/measurement/wc;->a()Lcom/google/android/gms/internal/measurement/wc;

    move-result-object p3

    invoke-virtual {p3, p4}, Lcom/google/android/gms/internal/measurement/wc;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object p3

    invoke-static {p3, p0, p1, p2, p5}, Lcom/google/android/gms/internal/measurement/w9;->h(Lcom/google/android/gms/internal/measurement/zc;[BIILcom/google/android/gms/internal/measurement/v9;)I

    move-result p0

    return p0

    :pswitch_5
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/measurement/w9;->f([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result p0

    return p0

    :pswitch_6
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/measurement/w9;->c([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result p0

    iget-wide p1, p5, Lcom/google/android/gms/internal/measurement/v9;->b:J

    const-wide/16 p3, 0x0

    cmp-long p1, p1, p3

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p5, Lcom/google/android/gms/internal/measurement/v9;->c:Ljava/lang/Object;

    return p0

    :pswitch_7
    add-int/lit8 p2, p1, 0x4

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/measurement/w9;->d([BI)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    iput-object p0, p5, Lcom/google/android/gms/internal/measurement/v9;->c:Ljava/lang/Object;

    return p2

    :pswitch_8
    add-int/lit8 p2, p1, 0x8

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/measurement/w9;->e([BI)J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    iput-object p0, p5, Lcom/google/android/gms/internal/measurement/v9;->c:Ljava/lang/Object;

    return p2

    :pswitch_9
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result p0

    iget p1, p5, Lcom/google/android/gms/internal/measurement/v9;->a:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p5, Lcom/google/android/gms/internal/measurement/v9;->c:Ljava/lang/Object;

    return p0

    :pswitch_a
    invoke-static {p0, p1, p5}, Lcom/google/android/gms/internal/measurement/w9;->c([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result p0

    iget-wide p1, p5, Lcom/google/android/gms/internal/measurement/v9;->b:J

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p5, Lcom/google/android/gms/internal/measurement/v9;->c:Ljava/lang/Object;

    return p0

    :pswitch_b
    add-int/lit8 p2, p1, 0x4

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/measurement/w9;->d([BI)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    iput-object p0, p5, Lcom/google/android/gms/internal/measurement/v9;->c:Ljava/lang/Object;

    return p2

    :pswitch_c
    add-int/lit8 p2, p1, 0x8

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/measurement/w9;->e([BI)J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    iput-object p0, p5, Lcom/google/android/gms/internal/measurement/v9;->c:Ljava/lang/Object;

    return p2

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
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_9
        :pswitch_7
        :pswitch_8
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static final v(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/yd;)V
    .locals 1

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-interface {p2, p0, p1}, Lcom/google/android/gms/internal/measurement/yd;->p(ILjava/lang/String;)V

    return-void

    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/measurement/ha;

    invoke-interface {p2, p0, p1}, Lcom/google/android/gms/internal/measurement/yd;->v(ILcom/google/android/gms/internal/measurement/ha;)V

    return-void
.end method

.method public static w(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/md;
    .locals 2

    check-cast p0, Lcom/google/android/gms/internal/measurement/gb;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->zzc:Lcom/google/android/gms/internal/measurement/md;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/md;->a()Lcom/google/android/gms/internal/measurement/md;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/md;->b()Lcom/google/android/gms/internal/measurement/md;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->zzc:Lcom/google/android/gms/internal/measurement/md;

    :cond_0
    return-object v0
.end method

.method public static y(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/lc;Lcom/google/android/gms/internal/measurement/tc;Lcom/google/android/gms/internal/measurement/zb;Lcom/google/android/gms/internal/measurement/ld;Lcom/google/android/gms/internal/measurement/sa;Lcom/google/android/gms/internal/measurement/jc;)Lcom/google/android/gms/internal/measurement/rc;
    .locals 32

    move-object/from16 v0, p1

    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/yc;

    if-eqz v1, :cond_37

    check-cast v0, Lcom/google/android/gms/internal/measurement/yc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/yc;->a()Ljava/lang/String;

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

    sget-object v7, Lcom/google/android/gms/internal/measurement/rc;->l:[I

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

    and-int/lit16 v13, v13, 0x1fff

    const/16 v15, 0xd

    :goto_8
    add-int/lit8 v16, v14, 0x1

    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v5, :cond_11

    and-int/lit16 v14, v14, 0x1fff

    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    add-int/lit8 v15, v15, 0xd

    move/from16 v14, v16

    goto :goto_8

    :cond_11
    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    move/from16 v14, v16

    :cond_12
    add-int/lit8 v15, v14, 0x1

    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v5, :cond_14

    and-int/lit16 v14, v14, 0x1fff

    const/16 v16, 0xd

    :goto_9
    add-int/lit8 v17, v15, 0x1

    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-lt v15, v5, :cond_13

    and-int/lit16 v15, v15, 0x1fff

    shl-int v15, v15, v16

    or-int/2addr v14, v15

    add-int/lit8 v16, v16, 0xd

    move/from16 v15, v17

    goto :goto_9

    :cond_13
    shl-int v15, v15, v16

    or-int/2addr v14, v15

    move/from16 v15, v17

    :cond_14
    add-int v16, v14, v12

    add-int v13, v16, v13

    add-int v16, v4, v4

    add-int v16, v16, v7

    new-array v7, v13, [I

    move v13, v12

    move v12, v9

    move v9, v13

    move v13, v10

    move/from16 v17, v14

    move/from16 v10, v16

    move-object/from16 v16, v7

    move v7, v4

    move v4, v15

    :goto_a
    sget-object v14, Lcom/google/android/gms/internal/measurement/rc;->m:Lsun/misc/Unsafe;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/yc;->b()[Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/yc;->zzb()Lcom/google/android/gms/internal/measurement/oc;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    add-int v18, v17, v9

    add-int v9, v11, v11

    mul-int/lit8 v11, v11, 0x3

    new-array v11, v11, [I

    new-array v9, v9, [Ljava/lang/Object;

    move/from16 v21, v17

    move/from16 v22, v18

    const/16 v19, 0x0

    const/16 v20, 0x0

    :goto_b
    if-ge v4, v2, :cond_36

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

    move/from16 v30, v27

    move/from16 v27, v6

    move/from16 v6, v30

    const/16 v30, 0xd

    :goto_10
    add-int/lit8 v31, v6, 0x1

    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v0, :cond_1a

    and-int/lit16 v0, v6, 0x1fff

    shl-int v0, v0, v30

    or-int v27, v27, v0

    add-int/lit8 v30, v30, 0xd

    move/from16 v6, v31

    const v0, 0xd800

    goto :goto_10

    :cond_1a
    shl-int v0, v6, v30

    or-int v6, v27, v0

    move/from16 v0, v31

    goto :goto_11

    :cond_1b
    move/from16 v0, v27

    :goto_11
    move/from16 v27, v0

    add-int/lit8 v0, v5, -0x33

    move/from16 v30, v2

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

    invoke-virtual/range {v25 .. v25}, Lcom/google/android/gms/internal/measurement/yc;->zzc()I

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

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/rc;->z(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    aput-object v2, v15, v6

    goto :goto_16

    :goto_17
    invoke-virtual {v14, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v6

    long-to-int v2, v6

    add-int/lit8 v6, v28, 0x1

    aget-object v7, v15, v6

    move/from16 v31, v0

    instance-of v0, v7, Ljava/lang/reflect/Field;

    if-eqz v0, :cond_22

    check-cast v7, Ljava/lang/reflect/Field;

    goto :goto_18

    :cond_22
    check-cast v7, Ljava/lang/String;

    invoke-static {v3, v7}, Lcom/google/android/gms/internal/measurement/rc;->z(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v7

    aput-object v7, v15, v6

    :goto_18
    invoke-virtual {v14, v7}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v6

    long-to-int v0, v6

    move/from16 v28, v0

    move-object v7, v1

    move/from16 v0, v26

    move/from16 v6, v27

    const/4 v1, 0x0

    const v23, 0xd800

    goto/16 :goto_25

    :cond_23
    move/from16 v30, v2

    move/from16 v31, v7

    add-int/lit8 v0, v10, 0x1

    aget-object v2, v15, v10

    check-cast v2, Ljava/lang/String;

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/measurement/rc;->z(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    const/16 v7, 0x9

    if-eq v5, v7, :cond_24

    const/16 v7, 0x11

    if-ne v5, v7, :cond_25

    :cond_24
    move/from16 v28, v0

    const/4 v0, 0x1

    goto/16 :goto_1d

    :cond_25
    const/16 v7, 0x1b

    if-eq v5, v7, :cond_2d

    const/16 v7, 0x31

    if-ne v5, v7, :cond_26

    add-int/lit8 v10, v10, 0x2

    move/from16 v28, v0

    const/4 v0, 0x1

    goto/16 :goto_1c

    :cond_26
    const/16 v7, 0xc

    if-eq v5, v7, :cond_2a

    const/16 v7, 0x1e

    if-eq v5, v7, :cond_2a

    const/16 v7, 0x2c

    if-ne v5, v7, :cond_27

    goto :goto_1a

    :cond_27
    const/16 v7, 0x32

    if-ne v5, v7, :cond_29

    add-int/lit8 v7, v10, 0x2

    add-int/lit8 v28, v21, 0x1

    aput v20, v16, v21

    div-int/lit8 v21, v20, 0x3

    aget-object v0, v15, v0

    add-int v21, v21, v21

    aput-object v0, v9, v21

    if-eqz v26, :cond_28

    add-int/lit8 v21, v21, 0x1

    add-int/lit8 v0, v10, 0x3

    aget-object v7, v15, v7

    aput-object v7, v9, v21

    move v10, v0

    move-object v7, v1

    move/from16 v21, v28

    goto :goto_1f

    :cond_28
    move v10, v7

    move/from16 v21, v28

    const/16 v26, 0x0

    :goto_19
    move-object v7, v1

    goto :goto_1f

    :cond_29
    move/from16 v28, v0

    const/4 v0, 0x1

    goto :goto_1e

    :cond_2a
    :goto_1a
    invoke-virtual/range {v25 .. v25}, Lcom/google/android/gms/internal/measurement/yc;->zzc()I

    move-result v7

    move/from16 v28, v0

    const/4 v0, 0x1

    if-eq v7, v0, :cond_2c

    if-eqz v26, :cond_2b

    goto :goto_1b

    :cond_2b
    move-object v7, v1

    move/from16 v10, v28

    const/16 v26, 0x0

    goto :goto_1f

    :cond_2c
    :goto_1b
    add-int/lit8 v10, v10, 0x2

    div-int/lit8 v7, v20, 0x3

    add-int/2addr v7, v7

    add-int/2addr v7, v0

    aget-object v24, v15, v28

    aput-object v24, v9, v7

    goto :goto_19

    :cond_2d
    move/from16 v28, v0

    const/4 v0, 0x1

    add-int/lit8 v10, v10, 0x2

    :goto_1c
    div-int/lit8 v7, v20, 0x3

    add-int/2addr v7, v7

    add-int/2addr v7, v0

    aget-object v24, v15, v28

    aput-object v24, v9, v7

    goto :goto_19

    :goto_1d
    div-int/lit8 v7, v20, 0x3

    add-int/2addr v7, v7

    add-int/2addr v7, v0

    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v10

    aput-object v10, v9, v7

    :goto_1e
    move-object v7, v1

    move/from16 v10, v28

    :goto_1f
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

    :goto_20
    add-int/lit8 v28, v0, 0x1

    invoke-virtual {v7, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-lt v0, v6, :cond_2e

    and-int/lit16 v0, v0, 0x1fff

    shl-int v0, v0, v23

    or-int/2addr v1, v0

    add-int/lit8 v23, v23, 0xd

    move/from16 v0, v28

    goto :goto_20

    :cond_2e
    shl-int v0, v0, v23

    or-int/2addr v1, v0

    goto :goto_21

    :cond_2f
    move/from16 v28, v0

    :goto_21
    add-int v0, v31, v31

    div-int/lit8 v23, v1, 0x20

    add-int v0, v0, v23

    aget-object v6, v15, v0

    move/from16 v29, v0

    instance-of v0, v6, Ljava/lang/reflect/Field;

    if-eqz v0, :cond_30

    check-cast v6, Ljava/lang/reflect/Field;

    :goto_22
    move/from16 v29, v1

    goto :goto_23

    :cond_30
    check-cast v6, Ljava/lang/String;

    invoke-static {v3, v6}, Lcom/google/android/gms/internal/measurement/rc;->z(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v6

    aput-object v6, v15, v29

    goto :goto_22

    :goto_23
    invoke-virtual {v14, v6}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v0

    long-to-int v0, v0

    rem-int/lit8 v1, v29, 0x20

    move/from16 v6, v28

    const v23, 0xd800

    move/from16 v28, v0

    goto :goto_24

    :cond_31
    const v23, 0xd800

    move/from16 v28, v1

    const/4 v1, 0x0

    :goto_24
    const/16 v0, 0x12

    if-lt v5, v0, :cond_32

    const/16 v0, 0x31

    if-gt v5, v0, :cond_32

    add-int/lit8 v0, v22, 0x1

    aput v2, v16, v22

    move/from16 v22, v0

    :cond_32
    move/from16 v0, v26

    :goto_25
    add-int/lit8 v26, v20, 0x1

    aput v4, v11, v20

    add-int/lit8 v4, v20, 0x2

    move/from16 v27, v0

    and-int/lit16 v0, v8, 0x200

    if-eqz v0, :cond_33

    const/high16 v0, 0x20000000

    goto :goto_26

    :cond_33
    const/4 v0, 0x0

    :goto_26
    and-int/lit16 v8, v8, 0x100

    if-eqz v8, :cond_34

    const/high16 v8, 0x10000000

    goto :goto_27

    :cond_34
    const/4 v8, 0x0

    :goto_27
    if-eqz v27, :cond_35

    const/high16 v27, -0x80000000

    goto :goto_28

    :cond_35
    const/16 v27, 0x0

    :goto_28
    shl-int/lit8 v5, v5, 0x14

    or-int/2addr v0, v8

    or-int v0, v0, v27

    or-int/2addr v0, v5

    or-int/2addr v0, v2

    aput v0, v11, v26

    add-int/lit8 v20, v20, 0x3

    shl-int/lit8 v0, v1, 0x14

    or-int v0, v0, v28

    aput v0, v11, v4

    move v4, v6

    move-object v1, v7

    move/from16 v5, v23

    move-object/from16 v0, v25

    move/from16 v2, v30

    move/from16 v7, v31

    goto/16 :goto_b

    :cond_36
    move-object/from16 v25, v0

    new-instance v0, Lcom/google/android/gms/internal/measurement/rc;

    invoke-virtual/range {v25 .. v25}, Lcom/google/android/gms/internal/measurement/yc;->zzb()Lcom/google/android/gms/internal/measurement/oc;

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

    invoke-direct/range {v9 .. v23}, Lcom/google/android/gms/internal/measurement/rc;-><init>([I[Ljava/lang/Object;IILcom/google/android/gms/internal/measurement/oc;Z[IIILcom/google/android/gms/internal/measurement/tc;Lcom/google/android/gms/internal/measurement/zb;Lcom/google/android/gms/internal/measurement/ld;Lcom/google/android/gms/internal/measurement/sa;Lcom/google/android/gms/internal/measurement/jc;)V

    return-object v9

    :cond_37
    check-cast v0, Lcom/google/android/gms/internal/measurement/id;

    const/4 v0, 0x0

    throw v0
.end method

.method public static z(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
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

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0xb

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    add-int/2addr v3, v4

    add-int/lit8 v3, v3, 0x1d

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    add-int/2addr v3, v4

    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Field "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " not found. Known fields are "

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method


# virtual methods
.method public final A(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 5

    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/measurement/rc;->p(Ljava/lang/Object;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/measurement/rc;->K(I)I

    move-result v0

    const v1, 0xfffff

    and-int/2addr v0, v1

    sget-object v1, Lcom/google/android/gms/internal/measurement/rc;->m:Lsun/misc/Unsafe;

    int-to-long v2, v0

    invoke-virtual {v1, p2, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object p2

    invoke-virtual {p0, p1, p3}, Lcom/google/android/gms/internal/measurement/rc;->p(Ljava/lang/Object;I)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/rc;->g(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v1, p1, v2, v3, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/zc;->zza()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4, v0}, Lcom/google/android/gms/internal/measurement/zc;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, p1, v2, v3, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    invoke-virtual {p0, p1, p3}, Lcom/google/android/gms/internal/measurement/rc;->q(Ljava/lang/Object;I)V

    return-void

    :cond_2
    invoke-virtual {v1, p1, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lcom/google/android/gms/internal/measurement/rc;->g(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/zc;->zza()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4, p3}, Lcom/google/android/gms/internal/measurement/zc;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, p1, v2, v3, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p3, v4

    :cond_3
    invoke-interface {p2, p3, v0}, Lcom/google/android/gms/internal/measurement/zc;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/rc;->a:[I

    new-instance v0, Ljava/lang/IllegalStateException;

    aget p1, p1, p3

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    add-int/lit8 p3, p3, 0x26

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    add-int/2addr p3, v1

    invoke-direct {v2, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p3, "Source subfield "

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is present but null: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final B(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/rc;->a:[I

    aget v1, v0, p3

    invoke-virtual {p0, p2, v1, p3}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/measurement/rc;->K(I)I

    move-result v2

    const v3, 0xfffff

    and-int/2addr v2, v3

    sget-object v3, Lcom/google/android/gms/internal/measurement/rc;->m:Lsun/misc/Unsafe;

    int-to-long v4, v2

    invoke-virtual {v3, p2, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object p2

    invoke-virtual {p0, p1, v1, p3}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/rc;->g(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v3, p1, v4, v5, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/zc;->zza()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, v0, v2}, Lcom/google/android/gms/internal/measurement/zc;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, p1, v4, v5, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    invoke-virtual {p0, p1, v1, p3}, Lcom/google/android/gms/internal/measurement/rc;->s(Ljava/lang/Object;II)V

    return-void

    :cond_2
    invoke-virtual {v3, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lcom/google/android/gms/internal/measurement/rc;->g(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/zc;->zza()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, v0, p3}, Lcom/google/android/gms/internal/measurement/zc;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, p1, v4, v5, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p3, v0

    :cond_3
    invoke-interface {p2, p3, v2}, Lcom/google/android/gms/internal/measurement/zc;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    aget p3, v0, p3

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x26

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    add-int/2addr v0, v1

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Source subfield "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " is present but null: "

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final C(I)Lcom/google/android/gms/internal/measurement/zc;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/rc;->b:[Ljava/lang/Object;

    div-int/lit8 p1, p1, 0x3

    add-int/2addr p1, p1

    aget-object v1, v0, p1

    check-cast v1, Lcom/google/android/gms/internal/measurement/zc;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v1, p1, 0x1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/wc;->a()Lcom/google/android/gms/internal/measurement/wc;

    move-result-object v2

    aget-object v1, v0, v1

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/measurement/wc;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v1

    aput-object v1, v0, p1

    return-object v1
.end method

.method public final D(I)Ljava/lang/Object;
    .locals 1

    div-int/lit8 p1, p1, 0x3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/rc;->b:[Ljava/lang/Object;

    add-int/2addr p1, p1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final E(I)Lcom/google/android/gms/internal/measurement/lb;
    .locals 1

    div-int/lit8 p1, p1, 0x3

    add-int/2addr p1, p1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/rc;->b:[Ljava/lang/Object;

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/lb;

    return-object p1
.end method

.method public final F(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v0

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/rc;->K(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/rc;->p(Ljava/lang/Object;I)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zc;->zza()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    int-to-long v1, v1

    sget-object p2, Lcom/google/android/gms/internal/measurement/rc;->m:Lsun/misc/Unsafe;

    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/rc;->g(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zc;->zza()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/zc;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method public final G(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/measurement/rc;->m:Lsun/misc/Unsafe;

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/rc;->K(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v0, p1, v1, v2, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/rc;->q(Ljava/lang/Object;I)V

    return-void
.end method

.method public final H(Ljava/lang/Object;II)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zc;->zza()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p2, Lcom/google/android/gms/internal/measurement/rc;->m:Lsun/misc/Unsafe;

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/measurement/rc;->K(I)I

    move-result p3

    const v1, 0xfffff

    and-int/2addr p3, v1

    int-to-long v1, p3

    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/rc;->g(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zc;->zza()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/zc;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method public final I(Ljava/lang/Object;IILjava/lang/Object;)V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/measurement/rc;->m:Lsun/misc/Unsafe;

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/measurement/rc;->K(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v0, p1, v1, v2, p4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/rc;->s(Ljava/lang/Object;II)V

    return-void
.end method

.method public final K(I)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/rc;->a:[I

    add-int/lit8 p1, p1, 0x1

    aget p1, v0, p1

    return p1
.end method

.method public final L(I)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/rc;->a:[I

    add-int/lit8 p1, p1, 0x2

    aget p1, v0, p1

    return p1
.end method

.method public final a(Ljava/lang/Object;)Z
    .locals 14

    const/4 v6, 0x0

    const v7, 0xfffff

    move v3, v6

    move v8, v3

    move v2, v7

    :goto_0
    iget v4, p0, Lcom/google/android/gms/internal/measurement/rc;->h:I

    const/4 v5, 0x1

    if-ge v8, v4, :cond_c

    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/rc;->g:[I

    iget-object v9, p0, Lcom/google/android/gms/internal/measurement/rc;->a:[I

    aget v4, v4, v8

    aget v10, v9, v4

    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/measurement/rc;->K(I)I

    move-result v11

    add-int/lit8 v12, v4, 0x2

    aget v9, v9, v12

    and-int v12, v9, v7

    ushr-int/lit8 v9, v9, 0x14

    shl-int/2addr v5, v9

    if-eq v12, v2, :cond_1

    if-eq v12, v7, :cond_0

    int-to-long v2, v12

    sget-object v9, Lcom/google/android/gms/internal/measurement/rc;->m:Lsun/misc/Unsafe;

    invoke-virtual {v9, p1, v2, v3}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    :cond_0
    move v2, v4

    move v4, v3

    move v3, v12

    goto :goto_1

    :cond_1
    move v13, v3

    move v3, v2

    move v2, v4

    move v4, v13

    :goto_1
    const/high16 v9, 0x10000000

    and-int/2addr v9, v11

    if-eqz v9, :cond_3

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v9

    if-eqz v9, :cond_2

    goto :goto_2

    :cond_2
    return v6

    :cond_3
    :goto_2
    invoke-static {v11}, Lcom/google/android/gms/internal/measurement/rc;->M(I)I

    move-result v9

    const/16 v12, 0x9

    if-eq v9, v12, :cond_a

    const/16 v12, 0x11

    if-eq v9, v12, :cond_a

    const/16 v5, 0x1b

    if-eq v9, v5, :cond_8

    const/16 v5, 0x3c

    if-eq v9, v5, :cond_7

    const/16 v5, 0x44

    if-eq v9, v5, :cond_7

    const/16 v5, 0x31

    if-eq v9, v5, :cond_8

    const/16 v5, 0x32

    if-eq v9, v5, :cond_4

    goto/16 :goto_4

    :cond_4
    and-int v5, v11, v7

    int-to-long v9, v5

    invoke-static {p1, v9, v10}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/ic;

    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_b

    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/measurement/rc;->D(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/hc;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/hc;->e()Lcom/google/android/gms/internal/measurement/gc;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/gc;->c:Lcom/google/android/gms/internal/measurement/wd;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/wd;->a()Lcom/google/android/gms/internal/measurement/xd;

    move-result-object v2

    sget-object v9, Lcom/google/android/gms/internal/measurement/xd;->i:Lcom/google/android/gms/internal/measurement/xd;

    if-ne v2, v9, :cond_b

    invoke-interface {v5}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v5, 0x0

    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    if-nez v5, :cond_6

    invoke-static {}, Lcom/google/android/gms/internal/measurement/wc;->a()Lcom/google/android/gms/internal/measurement/wc;

    move-result-object v5

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v5, v10}, Lcom/google/android/gms/internal/measurement/wc;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v5

    :cond_6
    invoke-interface {v5, v9}, Lcom/google/android/gms/internal/measurement/zc;->a(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_5

    return v6

    :cond_7
    invoke-virtual {p0, p1, v10, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v2

    invoke-static {p1, v11, v2}, Lcom/google/android/gms/internal/measurement/rc;->J(Ljava/lang/Object;ILcom/google/android/gms/internal/measurement/zc;)Z

    move-result v2

    if-nez v2, :cond_b

    return v6

    :cond_8
    and-int v5, v11, v7

    int-to-long v9, v5

    invoke-static {p1, v9, v10}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_b

    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v2

    move v9, v6

    :goto_3
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-ge v9, v10, :cond_b

    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v2, v10}, Lcom/google/android/gms/internal/measurement/zc;->a(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_9

    return v6

    :cond_9
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_a
    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v2

    invoke-static {p1, v11, v2}, Lcom/google/android/gms/internal/measurement/rc;->J(Ljava/lang/Object;ILcom/google/android/gms/internal/measurement/zc;)Z

    move-result v2

    if-nez v2, :cond_b

    return v6

    :cond_b
    :goto_4
    add-int/lit8 v8, v8, 0x1

    move v2, v3

    move v3, v4

    goto/16 :goto_0

    :cond_c
    iget-boolean v2, p0, Lcom/google/android/gms/internal/measurement/rc;->f:Z

    if-eqz v2, :cond_d

    move-object v1, p1

    check-cast v1, Lcom/google/android/gms/internal/measurement/db;

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/db;->zzb:Lcom/google/android/gms/internal/measurement/wa;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/wa;->e()Z

    move-result v1

    if-nez v1, :cond_d

    return v6

    :cond_d
    return v5
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/rc;->h(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/rc;->a:[I

    array-length v2, v1

    if-ge v0, v2, :cond_4

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/rc;->K(I)I

    move-result v2

    const v3, 0xfffff

    and-int/2addr v3, v2

    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/rc;->M(I)I

    move-result v2

    aget v1, v1, v0

    int-to-long v3, v3

    packed-switch v2, :pswitch_data_0

    goto/16 :goto_2

    :pswitch_0
    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/measurement/rc;->B(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_1
    invoke-virtual {p0, p2, v1, v0}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p1, v3, v4, v2}, Lcom/google/android/gms/internal/measurement/sd;->t(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v1, v0}, Lcom/google/android/gms/internal/measurement/rc;->s(Ljava/lang/Object;II)V

    goto/16 :goto_2

    :pswitch_2
    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/measurement/rc;->B(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_3
    invoke-virtual {p0, p2, v1, v0}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p1, v3, v4, v2}, Lcom/google/android/gms/internal/measurement/sd;->t(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v1, v0}, Lcom/google/android/gms/internal/measurement/rc;->s(Ljava/lang/Object;II)V

    goto/16 :goto_2

    :pswitch_4
    sget-object v1, Lcom/google/android/gms/internal/measurement/bd;->a:Lcom/google/android/gms/internal/measurement/ld;

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/jc;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/measurement/sd;->t(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_5
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/pb;

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/pb;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    if-lez v5, :cond_1

    if-lez v6, :cond_1

    invoke-interface {v1}, Lcom/google/android/gms/internal/measurement/pb;->zza()Z

    move-result v7

    if-nez v7, :cond_0

    add-int/2addr v6, v5

    invoke-interface {v1, v6}, Lcom/google/android/gms/internal/measurement/pb;->v(I)Lcom/google/android/gms/internal/measurement/pb;

    move-result-object v1

    :cond_0
    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    if-gtz v5, :cond_2

    goto :goto_1

    :cond_2
    move-object v2, v1

    :goto_1
    invoke-static {p1, v3, v4, v2}, Lcom/google/android/gms/internal/measurement/sd;->t(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_6
    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/measurement/rc;->A(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_7
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/rc;->p(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/measurement/sd;->k(Ljava/lang/Object;J)J

    move-result-wide v1

    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/android/gms/internal/measurement/sd;->l(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/rc;->q(Ljava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_8
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/rc;->p(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/measurement/sd;->j(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/rc;->q(Ljava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_9
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/rc;->p(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/measurement/sd;->k(Ljava/lang/Object;J)J

    move-result-wide v1

    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/android/gms/internal/measurement/sd;->l(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/rc;->q(Ljava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_a
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/rc;->p(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/measurement/sd;->j(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/rc;->q(Ljava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_b
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/rc;->p(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/measurement/sd;->j(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/rc;->q(Ljava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_c
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/rc;->p(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/measurement/sd;->j(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/rc;->q(Ljava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_d
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/rc;->p(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/measurement/sd;->t(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/rc;->q(Ljava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_e
    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/measurement/rc;->A(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_f
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/rc;->p(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/measurement/sd;->t(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/rc;->q(Ljava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_10
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/rc;->p(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/measurement/sd;->m(Ljava/lang/Object;J)Z

    move-result v1

    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/measurement/sd;->n(Ljava/lang/Object;JZ)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/rc;->q(Ljava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_11
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/rc;->p(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/measurement/sd;->j(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/rc;->q(Ljava/lang/Object;I)V

    goto :goto_2

    :pswitch_12
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/rc;->p(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/measurement/sd;->k(Ljava/lang/Object;J)J

    move-result-wide v1

    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/android/gms/internal/measurement/sd;->l(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/rc;->q(Ljava/lang/Object;I)V

    goto :goto_2

    :pswitch_13
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/rc;->p(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/measurement/sd;->j(Ljava/lang/Object;JI)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/rc;->q(Ljava/lang/Object;I)V

    goto :goto_2

    :pswitch_14
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/rc;->p(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/measurement/sd;->k(Ljava/lang/Object;J)J

    move-result-wide v1

    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/android/gms/internal/measurement/sd;->l(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/rc;->q(Ljava/lang/Object;I)V

    goto :goto_2

    :pswitch_15
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/rc;->p(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/measurement/sd;->k(Ljava/lang/Object;J)J

    move-result-wide v1

    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/android/gms/internal/measurement/sd;->l(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/rc;->q(Ljava/lang/Object;I)V

    goto :goto_2

    :pswitch_16
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/rc;->p(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/measurement/sd;->o(Ljava/lang/Object;J)F

    move-result v1

    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/measurement/sd;->p(Ljava/lang/Object;JF)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/rc;->q(Ljava/lang/Object;I)V

    goto :goto_2

    :pswitch_17
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/rc;->p(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/measurement/sd;->q(Ljava/lang/Object;J)D

    move-result-wide v1

    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/android/gms/internal/measurement/sd;->r(Ljava/lang/Object;JD)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/rc;->q(Ljava/lang/Object;I)V

    :cond_3
    :goto_2
    add-int/lit8 v0, v0, 0x3

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/rc;->j:Lcom/google/android/gms/internal/measurement/ld;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/bd;->d(Lcom/google/android/gms/internal/measurement/ld;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/rc;->f:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/rc;->k:Lcom/google/android/gms/internal/measurement/sa;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/bd;->c(Lcom/google/android/gms/internal/measurement/sa;Ljava/lang/Object;Ljava/lang/Object;)V

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

.method public final c(Ljava/lang/Object;)V
    .locals 7

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/rc;->g(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/gb;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/measurement/gb;

    const v2, 0x7fffffff

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/gb;->r(I)V

    iput v1, v0, Lcom/google/android/gms/internal/measurement/r9;->zza:I

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/gb;->l()V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/rc;->a:[I

    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/rc;->K(I)I

    move-result v2

    const v3, 0xfffff

    and-int/2addr v3, v2

    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/rc;->M(I)I

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
    sget-object v2, Lcom/google/android/gms/internal/measurement/rc;->m:Lsun/misc/Unsafe;

    invoke-virtual {v2, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_4

    move-object v6, v5

    check-cast v6, Lcom/google/android/gms/internal/measurement/ic;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/ic;->e()V

    invoke-virtual {v2, p1, v3, v4, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/pb;

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/pb;->zzb()V

    goto :goto_1

    :cond_2
    aget v2, v0, v1

    invoke-virtual {p0, p1, v2, v1}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v2

    sget-object v5, Lcom/google/android/gms/internal/measurement/rc;->m:Lsun/misc/Unsafe;

    invoke-virtual {v5, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/measurement/zc;->c(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    :pswitch_2
    invoke-virtual {p0, p1, v1}, Lcom/google/android/gms/internal/measurement/rc;->p(Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v2

    sget-object v5, Lcom/google/android/gms/internal/measurement/rc;->m:Lsun/misc/Unsafe;

    invoke-virtual {v5, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/measurement/zc;->c(Ljava/lang/Object;)V

    :cond_4
    :goto_1
    add-int/lit8 v1, v1, 0x3

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/rc;->j:Lcom/google/android/gms/internal/measurement/ld;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/ld;->b(Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/rc;->f:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/rc;->k:Lcom/google/android/gms/internal/measurement/sa;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/sa;->a(Ljava/lang/Object;)V

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

.method public final d(Ljava/lang/Object;[BIILcom/google/android/gms/internal/measurement/v9;)V
    .locals 7

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/measurement/rc;->x(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/measurement/v9;)I

    return-void
.end method

.method public final e(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/yd;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v6, p2

    iget-boolean v2, v0, Lcom/google/android/gms/internal/measurement/rc;->f:Z

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/google/android/gms/internal/measurement/db;

    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/db;->zzb:Lcom/google/android/gms/internal/measurement/wa;

    iget-object v3, v2, Lcom/google/android/gms/internal/measurement/wa;->a:Lcom/google/android/gms/internal/measurement/hd;

    invoke-virtual {v3}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/wa;->c()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    move-object v8, v2

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    iget-object v9, v0, Lcom/google/android/gms/internal/measurement/rc;->a:[I

    sget-object v10, Lcom/google/android/gms/internal/measurement/rc;->m:Lsun/misc/Unsafe;

    const v11, 0xfffff

    move v3, v11

    const/4 v2, 0x0

    const/4 v4, 0x0

    :goto_1
    array-length v5, v9

    if-ge v2, v5, :cond_7

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/rc;->K(I)I

    move-result v5

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/rc;->M(I)I

    move-result v13

    aget v14, v9, v2

    const/16 v15, 0x11

    const/16 v16, 0x0

    const/4 v7, 0x1

    if-gt v13, v15, :cond_3

    add-int/lit8 v15, v2, 0x2

    aget v15, v9, v15

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

    shl-int v12, v7, v12

    move/from16 v17, v12

    move v12, v5

    move/from16 v5, v17

    goto :goto_3

    :cond_3
    move v12, v5

    const/4 v5, 0x0

    :goto_3
    if-nez v8, :cond_6

    and-int/2addr v12, v11

    int-to-long v11, v12

    packed-switch v13, :pswitch_data_0

    :cond_4
    :goto_4
    const/4 v13, 0x0

    goto/16 :goto_7

    :pswitch_0
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v7

    invoke-interface {v6, v14, v5, v7}, Lcom/google/android/gms/internal/measurement/yd;->s(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/zc;)V

    goto :goto_4

    :pswitch_1
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/measurement/rc;->l(Ljava/lang/Object;J)J

    move-result-wide v11

    invoke-interface {v6, v14, v11, v12}, Lcom/google/android/gms/internal/measurement/yd;->l(IJ)V

    goto :goto_4

    :pswitch_2
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/measurement/rc;->k(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v6, v14, v5}, Lcom/google/android/gms/internal/measurement/yd;->G(II)V

    goto :goto_4

    :pswitch_3
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/measurement/rc;->l(Ljava/lang/Object;J)J

    move-result-wide v11

    invoke-interface {v6, v14, v11, v12}, Lcom/google/android/gms/internal/measurement/yd;->t(IJ)V

    goto :goto_4

    :pswitch_4
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/measurement/rc;->k(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v6, v14, v5}, Lcom/google/android/gms/internal/measurement/yd;->h(II)V

    goto :goto_4

    :pswitch_5
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/measurement/rc;->k(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v6, v14, v5}, Lcom/google/android/gms/internal/measurement/yd;->r(II)V

    goto :goto_4

    :pswitch_6
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/measurement/rc;->k(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v6, v14, v5}, Lcom/google/android/gms/internal/measurement/yd;->E(II)V

    goto :goto_4

    :pswitch_7
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/ha;

    invoke-interface {v6, v14, v5}, Lcom/google/android/gms/internal/measurement/yd;->v(ILcom/google/android/gms/internal/measurement/ha;)V

    goto :goto_4

    :pswitch_8
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v7

    invoke-interface {v6, v14, v5, v7}, Lcom/google/android/gms/internal/measurement/yd;->j(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/zc;)V

    goto/16 :goto_4

    :pswitch_9
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v14, v5, v6}, Lcom/google/android/gms/internal/measurement/rc;->v(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/yd;)V

    goto/16 :goto_4

    :pswitch_a
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/measurement/rc;->m(Ljava/lang/Object;J)Z

    move-result v5

    invoke-interface {v6, v14, v5}, Lcom/google/android/gms/internal/measurement/yd;->K(IZ)V

    goto/16 :goto_4

    :pswitch_b
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/measurement/rc;->k(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v6, v14, v5}, Lcom/google/android/gms/internal/measurement/yd;->d(II)V

    goto/16 :goto_4

    :pswitch_c
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/measurement/rc;->l(Ljava/lang/Object;J)J

    move-result-wide v11

    invoke-interface {v6, v14, v11, v12}, Lcom/google/android/gms/internal/measurement/yd;->w(IJ)V

    goto/16 :goto_4

    :pswitch_d
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/measurement/rc;->k(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v6, v14, v5}, Lcom/google/android/gms/internal/measurement/yd;->e(II)V

    goto/16 :goto_4

    :pswitch_e
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/measurement/rc;->l(Ljava/lang/Object;J)J

    move-result-wide v11

    invoke-interface {v6, v14, v11, v12}, Lcom/google/android/gms/internal/measurement/yd;->A(IJ)V

    goto/16 :goto_4

    :pswitch_f
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/measurement/rc;->l(Ljava/lang/Object;J)J

    move-result-wide v11

    invoke-interface {v6, v14, v11, v12}, Lcom/google/android/gms/internal/measurement/yd;->k(IJ)V

    goto/16 :goto_4

    :pswitch_10
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/measurement/rc;->j(Ljava/lang/Object;J)F

    move-result v5

    invoke-interface {v6, v14, v5}, Lcom/google/android/gms/internal/measurement/yd;->u(IF)V

    goto/16 :goto_4

    :pswitch_11
    invoke-virtual {v0, v1, v14, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/measurement/rc;->i(Ljava/lang/Object;J)D

    move-result-wide v11

    invoke-interface {v6, v14, v11, v12}, Lcom/google/android/gms/internal/measurement/yd;->a(ID)V

    goto/16 :goto_4

    :pswitch_12
    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/rc;->D(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/hc;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/hc;->e()Lcom/google/android/gms/internal/measurement/gc;

    move-result-object v7

    check-cast v5, Lcom/google/android/gms/internal/measurement/ic;

    invoke-interface {v6, v14, v7, v5}, Lcom/google/android/gms/internal/measurement/yd;->i(ILcom/google/android/gms/internal/measurement/gc;Ljava/util/Map;)V

    goto/16 :goto_4

    :pswitch_13
    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v11

    sget-object v12, Lcom/google/android/gms/internal/measurement/bd;->a:Lcom/google/android/gms/internal/measurement/ld;

    if-eqz v7, :cond_4

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_4

    const/4 v12, 0x0

    :goto_5
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v13

    if-ge v12, v13, :cond_4

    invoke-interface {v7, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    move-object v14, v6

    check-cast v14, Lcom/google/android/gms/internal/measurement/na;

    invoke-virtual {v14, v5, v13, v11}, Lcom/google/android/gms/internal/measurement/na;->s(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/zc;)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_5

    :pswitch_14
    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    invoke-static {v5, v11, v6, v7}, Lcom/google/android/gms/internal/measurement/bd;->j(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_4

    :pswitch_15
    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    invoke-static {v5, v11, v6, v7}, Lcom/google/android/gms/internal/measurement/bd;->o(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_4

    :pswitch_16
    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    invoke-static {v5, v11, v6, v7}, Lcom/google/android/gms/internal/measurement/bd;->l(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_4

    :pswitch_17
    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    invoke-static {v5, v11, v6, v7}, Lcom/google/android/gms/internal/measurement/bd;->q(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_4

    :pswitch_18
    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    invoke-static {v5, v11, v6, v7}, Lcom/google/android/gms/internal/measurement/bd;->r(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_4

    :pswitch_19
    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    invoke-static {v5, v11, v6, v7}, Lcom/google/android/gms/internal/measurement/bd;->n(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_4

    :pswitch_1a
    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    invoke-static {v5, v11, v6, v7}, Lcom/google/android/gms/internal/measurement/bd;->s(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_4

    :pswitch_1b
    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    invoke-static {v5, v11, v6, v7}, Lcom/google/android/gms/internal/measurement/bd;->p(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_4

    :pswitch_1c
    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    invoke-static {v5, v11, v6, v7}, Lcom/google/android/gms/internal/measurement/bd;->k(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_4

    :pswitch_1d
    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    invoke-static {v5, v11, v6, v7}, Lcom/google/android/gms/internal/measurement/bd;->m(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_4

    :pswitch_1e
    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    invoke-static {v5, v11, v6, v7}, Lcom/google/android/gms/internal/measurement/bd;->i(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_4

    :pswitch_1f
    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    invoke-static {v5, v11, v6, v7}, Lcom/google/android/gms/internal/measurement/bd;->h(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_4

    :pswitch_20
    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    invoke-static {v5, v11, v6, v7}, Lcom/google/android/gms/internal/measurement/bd;->g(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_4

    :pswitch_21
    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    invoke-static {v5, v11, v6, v7}, Lcom/google/android/gms/internal/measurement/bd;->f(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_4

    :pswitch_22
    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    const/4 v13, 0x0

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/measurement/bd;->j(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_7

    :pswitch_23
    const/4 v13, 0x0

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/measurement/bd;->o(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_7

    :pswitch_24
    const/4 v13, 0x0

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/measurement/bd;->l(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_7

    :pswitch_25
    const/4 v13, 0x0

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/measurement/bd;->q(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_7

    :pswitch_26
    const/4 v13, 0x0

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/measurement/bd;->r(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_7

    :pswitch_27
    const/4 v13, 0x0

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/measurement/bd;->n(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_7

    :pswitch_28
    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    sget-object v11, Lcom/google/android/gms/internal/measurement/bd;->a:Lcom/google/android/gms/internal/measurement/ld;

    if-eqz v7, :cond_4

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_4

    invoke-interface {v6, v5, v7}, Lcom/google/android/gms/internal/measurement/yd;->D(ILjava/util/List;)V

    goto/16 :goto_4

    :pswitch_29
    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v11

    sget-object v12, Lcom/google/android/gms/internal/measurement/bd;->a:Lcom/google/android/gms/internal/measurement/ld;

    if-eqz v7, :cond_4

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_4

    const/4 v13, 0x0

    :goto_6
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v12

    if-ge v13, v12, :cond_4

    invoke-interface {v7, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object v14, v6

    check-cast v14, Lcom/google/android/gms/internal/measurement/na;

    invoke-virtual {v14, v5, v12, v11}, Lcom/google/android/gms/internal/measurement/na;->j(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/zc;)V

    add-int/lit8 v13, v13, 0x1

    goto :goto_6

    :pswitch_2a
    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    sget-object v11, Lcom/google/android/gms/internal/measurement/bd;->a:Lcom/google/android/gms/internal/measurement/ld;

    if-eqz v7, :cond_4

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_4

    invoke-interface {v6, v5, v7}, Lcom/google/android/gms/internal/measurement/yd;->F(ILjava/util/List;)V

    goto/16 :goto_4

    :pswitch_2b
    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    const/4 v13, 0x0

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/measurement/bd;->s(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_7

    :pswitch_2c
    const/4 v13, 0x0

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/measurement/bd;->p(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_7

    :pswitch_2d
    const/4 v13, 0x0

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/measurement/bd;->k(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_7

    :pswitch_2e
    const/4 v13, 0x0

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/measurement/bd;->m(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_7

    :pswitch_2f
    const/4 v13, 0x0

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/measurement/bd;->i(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_7

    :pswitch_30
    const/4 v13, 0x0

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/measurement/bd;->h(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_7

    :pswitch_31
    const/4 v13, 0x0

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/measurement/bd;->g(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_7

    :pswitch_32
    const/4 v13, 0x0

    aget v5, v9, v2

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v5, v7, v6, v13}, Lcom/google/android/gms/internal/measurement/bd;->f(ILjava/util/List;Lcom/google/android/gms/internal/measurement/yd;Z)V

    goto/16 :goto_7

    :pswitch_33
    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v7

    invoke-interface {v6, v14, v5, v7}, Lcom/google/android/gms/internal/measurement/yd;->s(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/zc;)V

    goto/16 :goto_7

    :pswitch_34
    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v11

    invoke-interface {v6, v14, v11, v12}, Lcom/google/android/gms/internal/measurement/yd;->l(IJ)V

    goto/16 :goto_7

    :pswitch_35
    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v6, v14, v0}, Lcom/google/android/gms/internal/measurement/yd;->G(II)V

    goto/16 :goto_7

    :pswitch_36
    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v11

    invoke-interface {v6, v14, v11, v12}, Lcom/google/android/gms/internal/measurement/yd;->t(IJ)V

    goto/16 :goto_7

    :pswitch_37
    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v6, v14, v0}, Lcom/google/android/gms/internal/measurement/yd;->h(II)V

    goto/16 :goto_7

    :pswitch_38
    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v6, v14, v0}, Lcom/google/android/gms/internal/measurement/yd;->r(II)V

    goto/16 :goto_7

    :pswitch_39
    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v6, v14, v0}, Lcom/google/android/gms/internal/measurement/yd;->E(II)V

    goto/16 :goto_7

    :pswitch_3a
    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/ha;

    invoke-interface {v6, v14, v0}, Lcom/google/android/gms/internal/measurement/yd;->v(ILcom/google/android/gms/internal/measurement/ha;)V

    goto/16 :goto_7

    :pswitch_3b
    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v7

    invoke-interface {v6, v14, v5, v7}, Lcom/google/android/gms/internal/measurement/yd;->j(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/zc;)V

    goto/16 :goto_7

    :pswitch_3c
    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v14, v0, v6}, Lcom/google/android/gms/internal/measurement/rc;->v(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/yd;)V

    goto/16 :goto_7

    :pswitch_3d
    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/measurement/sd;->m(Ljava/lang/Object;J)Z

    move-result v0

    invoke-interface {v6, v14, v0}, Lcom/google/android/gms/internal/measurement/yd;->K(IZ)V

    goto :goto_7

    :pswitch_3e
    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v6, v14, v0}, Lcom/google/android/gms/internal/measurement/yd;->d(II)V

    goto :goto_7

    :pswitch_3f
    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v11

    invoke-interface {v6, v14, v11, v12}, Lcom/google/android/gms/internal/measurement/yd;->w(IJ)V

    goto :goto_7

    :pswitch_40
    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v6, v14, v0}, Lcom/google/android/gms/internal/measurement/yd;->e(II)V

    goto :goto_7

    :pswitch_41
    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v11

    invoke-interface {v6, v14, v11, v12}, Lcom/google/android/gms/internal/measurement/yd;->A(IJ)V

    goto :goto_7

    :pswitch_42
    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v10, v1, v11, v12}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v11

    invoke-interface {v6, v14, v11, v12}, Lcom/google/android/gms/internal/measurement/yd;->k(IJ)V

    goto :goto_7

    :pswitch_43
    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/measurement/sd;->o(Ljava/lang/Object;J)F

    move-result v0

    invoke-interface {v6, v14, v0}, Lcom/google/android/gms/internal/measurement/yd;->u(IF)V

    goto :goto_7

    :pswitch_44
    const/4 v13, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-static {v1, v11, v12}, Lcom/google/android/gms/internal/measurement/sd;->q(Ljava/lang/Object;J)D

    move-result-wide v11

    invoke-interface {v6, v14, v11, v12}, Lcom/google/android/gms/internal/measurement/yd;->a(ID)V

    :cond_5
    :goto_7
    add-int/lit8 v2, v2, 0x3

    const v11, 0xfffff

    move-object/from16 v0, p0

    goto/16 :goto_1

    :cond_6
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/eb;

    throw v16

    :cond_7
    const/16 v16, 0x0

    if-nez v8, :cond_8

    move-object v0, v1

    check-cast v0, Lcom/google/android/gms/internal/measurement/gb;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/gb;->zzc:Lcom/google/android/gms/internal/measurement/md;

    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/measurement/md;->g(Lcom/google/android/gms/internal/measurement/yd;)V

    return-void

    :cond_8
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/eb;

    throw v16

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

.method public final f(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/rc;->a:[I

    array-length v2, v2

    if-ge v1, v2, :cond_2

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/rc;->K(I)I

    move-result v2

    const v3, 0xfffff

    and-int v4, v2, v3

    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/rc;->M(I)I

    move-result v2

    int-to-long v4, v4

    packed-switch v2, :pswitch_data_0

    goto/16 :goto_2

    :pswitch_0
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/rc;->L(I)I

    move-result v2

    and-int/2addr v2, v3

    int-to-long v2, v2

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result v6

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result v2

    if-ne v6, v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/bd;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_3

    :pswitch_1
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/bd;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    goto :goto_1

    :pswitch_2
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/bd;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    :goto_1
    if-nez v2, :cond_0

    goto/16 :goto_3

    :pswitch_3
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/rc;->n(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/bd;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_2

    :pswitch_4
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/rc;->n(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->k(Ljava/lang/Object;J)J

    move-result-wide v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->k(Ljava/lang/Object;J)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    goto/16 :goto_2

    :pswitch_5
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/rc;->n(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result v3

    if-ne v2, v3, :cond_1

    goto/16 :goto_2

    :pswitch_6
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/rc;->n(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->k(Ljava/lang/Object;J)J

    move-result-wide v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->k(Ljava/lang/Object;J)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    goto/16 :goto_2

    :pswitch_7
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/rc;->n(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result v3

    if-ne v2, v3, :cond_1

    goto/16 :goto_2

    :pswitch_8
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/rc;->n(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result v3

    if-ne v2, v3, :cond_1

    goto/16 :goto_2

    :pswitch_9
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/rc;->n(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result v3

    if-ne v2, v3, :cond_1

    goto/16 :goto_2

    :pswitch_a
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/rc;->n(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/bd;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_2

    :pswitch_b
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/rc;->n(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/bd;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_2

    :pswitch_c
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/rc;->n(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/bd;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_2

    :pswitch_d
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/rc;->n(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->m(Ljava/lang/Object;J)Z

    move-result v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->m(Ljava/lang/Object;J)Z

    move-result v3

    if-ne v2, v3, :cond_1

    goto/16 :goto_2

    :pswitch_e
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/rc;->n(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result v3

    if-ne v2, v3, :cond_1

    goto/16 :goto_2

    :pswitch_f
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/rc;->n(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->k(Ljava/lang/Object;J)J

    move-result-wide v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->k(Ljava/lang/Object;J)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    goto :goto_2

    :pswitch_10
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/rc;->n(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result v3

    if-ne v2, v3, :cond_1

    goto :goto_2

    :pswitch_11
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/rc;->n(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->k(Ljava/lang/Object;J)J

    move-result-wide v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->k(Ljava/lang/Object;J)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    goto :goto_2

    :pswitch_12
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/rc;->n(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->k(Ljava/lang/Object;J)J

    move-result-wide v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->k(Ljava/lang/Object;J)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    goto :goto_2

    :pswitch_13
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/rc;->n(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->o(Ljava/lang/Object;J)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->o(Ljava/lang/Object;J)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    if-ne v2, v3, :cond_1

    goto :goto_2

    :pswitch_14
    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/rc;->n(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->q(Ljava/lang/Object;J)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->q(Ljava/lang/Object;J)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    :cond_0
    :goto_2
    add-int/lit8 v1, v1, 0x3

    goto/16 :goto_0

    :cond_1
    :goto_3
    return v0

    :cond_2
    move-object v1, p1

    check-cast v1, Lcom/google/android/gms/internal/measurement/gb;

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/gb;->zzc:Lcom/google/android/gms/internal/measurement/md;

    move-object v2, p2

    check-cast v2, Lcom/google/android/gms/internal/measurement/gb;

    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/gb;->zzc:Lcom/google/android/gms/internal/measurement/md;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v0

    :cond_3
    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/rc;->f:Z

    if-eqz v0, :cond_4

    check-cast p1, Lcom/google/android/gms/internal/measurement/db;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/db;->zzb:Lcom/google/android/gms/internal/measurement/wa;

    check-cast p2, Lcom/google/android/gms/internal/measurement/db;

    iget-object p2, p2, Lcom/google/android/gms/internal/measurement/db;->zzb:Lcom/google/android/gms/internal/measurement/wa;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/wa;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
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

.method public final n(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 0

    invoke-virtual {p0, p1, p3}, Lcom/google/android/gms/internal/measurement/rc;->p(Ljava/lang/Object;I)Z

    move-result p1

    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/measurement/rc;->p(Ljava/lang/Object;I)Z

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final o(Ljava/lang/Object;IIII)Z
    .locals 1

    const v0, 0xfffff

    if-ne p3, v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/rc;->p(Ljava/lang/Object;I)Z

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

.method public final p(Ljava/lang/Object;I)Z
    .locals 7

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/rc;->L(I)I

    move-result v0

    const v1, 0xfffff

    and-int v2, v0, v1

    int-to-long v2, v2

    const-wide/32 v4, 0xfffff

    cmp-long v4, v2, v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-nez v4, :cond_14

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/rc;->K(I)I

    move-result p2

    and-int v0, p2, v1

    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/rc;->M(I)I

    move-result p2

    int-to-long v0, v0

    const-wide/16 v2, 0x0

    packed-switch p2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    return v6

    :cond_0
    return v5

    :pswitch_1
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/sd;->k(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_1

    return v6

    :cond_1
    return v5

    :pswitch_2
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_2

    return v6

    :cond_2
    return v5

    :pswitch_3
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/sd;->k(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_3

    return v6

    :cond_3
    return v5

    :pswitch_4
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_4

    return v6

    :cond_4
    return v5

    :pswitch_5
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_5

    return v6

    :cond_5
    return v5

    :pswitch_6
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_6

    return v6

    :cond_6
    return v5

    :pswitch_7
    sget-object p2, Lcom/google/android/gms/internal/measurement/ha;->b:Lcom/google/android/gms/internal/measurement/ha;

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/ha;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v6

    :cond_7
    return v5

    :pswitch_8
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_8

    return v6

    :cond_8
    return v5

    :pswitch_9
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

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
    instance-of p2, p1, Lcom/google/android/gms/internal/measurement/ha;

    if-eqz p2, :cond_c

    sget-object p2, Lcom/google/android/gms/internal/measurement/ha;->b:Lcom/google/android/gms/internal/measurement/ha;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/ha;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v6

    :cond_b
    return v5

    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_a
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/sd;->m(Ljava/lang/Object;J)Z

    move-result p1

    return p1

    :pswitch_b
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_d

    return v6

    :cond_d
    return v5

    :pswitch_c
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/sd;->k(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_e

    return v6

    :cond_e
    return v5

    :pswitch_d
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_f

    return v6

    :cond_f
    return v5

    :pswitch_e
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/sd;->k(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_10

    return v6

    :cond_10
    return v5

    :pswitch_f
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/sd;->k(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_11

    return v6

    :cond_11
    return v5

    :pswitch_10
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/sd;->o(Ljava/lang/Object;J)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    if-eqz p1, :cond_12

    return v6

    :cond_12
    return v5

    :pswitch_11
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/sd;->q(Ljava/lang/Object;J)D

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

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

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

.method public final q(Ljava/lang/Object;I)V
    .locals 4

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/rc;->L(I)I

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

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result v2

    const/4 v3, 0x1

    shl-int p2, v3, p2

    or-int/2addr p2, v2

    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/measurement/sd;->j(Ljava/lang/Object;JI)V

    return-void
.end method

.method public final r(Ljava/lang/Object;II)Z
    .locals 2

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/measurement/rc;->L(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result p1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final s(Ljava/lang/Object;II)V
    .locals 2

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/measurement/rc;->L(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/measurement/sd;->j(Ljava/lang/Object;JI)V

    return-void
.end method

.method public final t(II)I
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/rc;->a:[I

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

.method public final x(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/measurement/v9;)I
    .locals 34

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move/from16 v5, p4

    move-object/from16 v7, p6

    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/rc;->h(Ljava/lang/Object;)V

    sget-object v2, Lcom/google/android/gms/internal/measurement/rc;->m:Lsun/misc/Unsafe;

    const/4 v11, 0x0

    move/from16 v6, p3

    move v9, v11

    move v14, v9

    move v15, v14

    const/4 v8, -0x1

    const v10, 0xfffff

    :goto_0
    const v16, 0xfffff

    :goto_1
    const-string v13, "Failed to parse the message."

    const/16 v17, 0x0

    const/16 p3, 0x3

    if-ge v6, v5, :cond_85

    add-int/lit8 v15, v6, 0x1

    aget-byte v6, v4, v6

    if-gez v6, :cond_0

    invoke-static {v6, v4, v15, v7}, Lcom/google/android/gms/internal/measurement/w9;->b(I[BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v15

    iget v6, v7, Lcom/google/android/gms/internal/measurement/v9;->a:I

    :cond_0
    move v7, v15

    move v15, v6

    ushr-int/lit8 v6, v15, 0x3

    if-le v6, v8, :cond_1

    div-int/lit8 v9, v9, 0x3

    iget v8, v1, Lcom/google/android/gms/internal/measurement/rc;->c:I

    if-lt v6, v8, :cond_2

    iget v8, v1, Lcom/google/android/gms/internal/measurement/rc;->d:I

    if-gt v6, v8, :cond_2

    invoke-virtual {v1, v6, v9}, Lcom/google/android/gms/internal/measurement/rc;->t(II)I

    move-result v8

    :goto_2
    const/4 v9, -0x1

    goto :goto_3

    :cond_1
    iget v8, v1, Lcom/google/android/gms/internal/measurement/rc;->c:I

    if-lt v6, v8, :cond_2

    iget v8, v1, Lcom/google/android/gms/internal/measurement/rc;->d:I

    if-gt v6, v8, :cond_2

    invoke-virtual {v1, v6, v11}, Lcom/google/android/gms/internal/measurement/rc;->t(II)I

    move-result v8

    goto :goto_2

    :cond_2
    const/4 v8, -0x1

    goto :goto_2

    :goto_3
    if-ne v8, v9, :cond_3

    move/from16 v1, p5

    move-object v0, v2

    move/from16 v18, v9

    move/from16 v19, v10

    move v9, v11

    move-object/from16 v26, v13

    move/from16 v22, v14

    move-object/from16 v10, p6

    move-object v14, v3

    move-object v3, v4

    move v11, v6

    move v4, v7

    goto/16 :goto_5a

    :cond_3
    and-int/lit8 v9, v15, 0x7

    iget-object v11, v1, Lcom/google/android/gms/internal/measurement/rc;->a:[I

    add-int/lit8 v19, v8, 0x1

    aget v12, v11, v19

    invoke-static {v12}, Lcom/google/android/gms/internal/measurement/rc;->M(I)I

    move-result v4

    and-int v5, v12, v16

    move/from16 v19, v6

    int-to-long v5, v5

    move-wide/from16 v21, v5

    const/high16 v23, 0x20000000

    const-wide/16 v24, 0x0

    const-string v6, ""

    const-string v5, "CodedInputStream encountered an embedded string or message which claimed to have negative size."

    move-object/from16 v27, v11

    const/16 v11, 0x11

    const/16 v28, 0x1

    if-gt v4, v11, :cond_16

    add-int/lit8 v11, v8, 0x2

    aget v11, v27, v11

    ushr-int/lit8 v26, v11, 0x14

    shl-int v26, v28, v26

    and-int v11, v11, v16

    move/from16 v29, v7

    if-eq v11, v10, :cond_6

    move/from16 v7, v16

    move/from16 v30, v8

    if-eq v10, v7, :cond_4

    int-to-long v7, v10

    invoke-virtual {v2, v3, v7, v8, v14}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    const v7, 0xfffff

    :cond_4
    if-ne v11, v7, :cond_5

    const/4 v7, 0x0

    goto :goto_4

    :cond_5
    int-to-long v7, v11

    invoke-virtual {v2, v3, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v7

    :goto_4
    move v14, v7

    goto :goto_5

    :cond_6
    move/from16 v30, v8

    move v11, v10

    :goto_5
    packed-switch v4, :pswitch_data_0

    move/from16 v4, p3

    if-ne v9, v4, :cond_7

    or-int v14, v14, v26

    move/from16 v8, v30

    invoke-virtual {v1, v3, v8}, Lcom/google/android/gms/internal/measurement/rc;->F(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v4

    shl-int/lit8 v5, v19, 0x3

    or-int/lit8 v9, v5, 0x4

    invoke-virtual {v1, v8}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v5

    move-object/from16 v6, p2

    move-object/from16 v10, p6

    move v12, v8

    move/from16 v7, v29

    const/16 v18, -0x1

    move/from16 v8, p4

    invoke-static/range {v4 .. v10}, Lcom/google/android/gms/internal/measurement/w9;->k(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/zc;[BIIILcom/google/android/gms/internal/measurement/v9;)I

    move-result v5

    move-object v8, v6

    invoke-virtual {v1, v3, v12, v4}, Lcom/google/android/gms/internal/measurement/rc;->G(Ljava/lang/Object;ILjava/lang/Object;)V

    move v6, v5

    move-object v4, v8

    move-object v7, v10

    move v10, v11

    move v9, v12

    :goto_6
    move/from16 v8, v19

    const/4 v11, 0x0

    const v16, 0xfffff

    move/from16 v5, p4

    goto/16 :goto_1

    :cond_7
    const/16 v18, -0x1

    move-object v7, v3

    move-object v3, v2

    move-object v2, v7

    move-object/from16 v8, p2

    move/from16 v22, v14

    move/from16 v21, v15

    move/from16 v7, v29

    move-object/from16 v15, p6

    goto/16 :goto_18

    :pswitch_0
    move-object/from16 v8, p2

    move-object/from16 v10, p6

    move/from16 v5, v29

    move/from16 v12, v30

    const/16 v18, -0x1

    if-nez v9, :cond_8

    or-int v14, v14, v26

    invoke-static {v8, v5, v10}, Lcom/google/android/gms/internal/measurement/w9;->c([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v9

    iget-wide v4, v10, Lcom/google/android/gms/internal/measurement/v9;->b:J

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/measurement/ja;->b(J)J

    move-result-wide v6

    move-wide/from16 v4, v21

    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move-object/from16 v32, v3

    move-object v3, v2

    move-object/from16 v2, v32

    move-object v4, v3

    move-object v3, v2

    move-object v2, v4

    move/from16 v5, p4

    move-object v4, v8

    move v6, v9

    :goto_7
    move-object v7, v10

    move v10, v11

    move v9, v12

    move/from16 v8, v19

    :goto_8
    const/4 v11, 0x0

    goto/16 :goto_0

    :cond_8
    move-object/from16 v32, v3

    move-object v3, v2

    move-object/from16 v2, v32

    :cond_9
    move v7, v5

    move/from16 v30, v12

    :goto_9
    move/from16 v22, v14

    move/from16 v21, v15

    move-object v15, v10

    goto/16 :goto_18

    :pswitch_1
    move-object v5, v3

    move-object v3, v2

    move-object v2, v5

    move-object/from16 v8, p2

    move-object/from16 v10, p6

    move-wide/from16 v6, v21

    move/from16 v5, v29

    move/from16 v12, v30

    const/16 v18, -0x1

    if-nez v9, :cond_9

    or-int v14, v14, v26

    invoke-static {v8, v5, v10}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v4

    iget v5, v10, Lcom/google/android/gms/internal/measurement/v9;->a:I

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ja;->a(I)I

    move-result v5

    invoke-virtual {v3, v2, v6, v7, v5}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move-object v5, v3

    move-object v3, v2

    move-object v2, v5

    move/from16 v5, p4

    move v6, v4

    move-object v4, v8

    goto :goto_7

    :pswitch_2
    move-object v4, v3

    move-object v3, v2

    move-object v2, v4

    move-object/from16 v8, p2

    move-object/from16 v10, p6

    move-wide/from16 v6, v21

    move/from16 v5, v29

    move/from16 v4, v30

    const/16 v18, -0x1

    if-nez v9, :cond_c

    invoke-static {v8, v5, v10}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v5

    iget v9, v10, Lcom/google/android/gms/internal/measurement/v9;->a:I

    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/measurement/rc;->E(I)Lcom/google/android/gms/internal/measurement/lb;

    move-result-object v13

    const/high16 v17, -0x80000000

    and-int v12, v12, v17

    if-eqz v12, :cond_b

    if-eqz v13, :cond_b

    invoke-interface {v13, v9}, Lcom/google/android/gms/internal/measurement/lb;->a(I)Z

    move-result v12

    if-eqz v12, :cond_a

    goto :goto_b

    :cond_a
    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/rc;->w(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/md;

    move-result-object v6

    int-to-long v12, v9

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v6, v15, v7}, Lcom/google/android/gms/internal/measurement/md;->k(ILjava/lang/Object;)V

    :goto_a
    move-object v6, v3

    move-object v3, v2

    move-object v2, v6

    move v9, v4

    move v6, v5

    move-object v4, v8

    move-object v7, v10

    move v10, v11

    goto/16 :goto_6

    :cond_b
    :goto_b
    or-int v14, v14, v26

    invoke-virtual {v3, v2, v6, v7, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_a

    :cond_c
    move/from16 v30, v4

    move v7, v5

    goto :goto_9

    :pswitch_3
    move-object v4, v3

    move-object v3, v2

    move-object v2, v4

    move-object/from16 v8, p2

    move-object/from16 v10, p6

    move-wide/from16 v6, v21

    move/from16 v5, v29

    move/from16 v4, v30

    const/4 v12, 0x2

    const/16 v18, -0x1

    if-ne v9, v12, :cond_c

    or-int v14, v14, v26

    invoke-static {v8, v5, v10}, Lcom/google/android/gms/internal/measurement/w9;->g([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v5

    iget-object v9, v10, Lcom/google/android/gms/internal/measurement/v9;->c:Ljava/lang/Object;

    invoke-virtual {v3, v2, v6, v7, v9}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_a

    :pswitch_4
    move-object v4, v3

    move-object v3, v2

    move-object v2, v4

    move-object/from16 v8, p2

    move-object/from16 v10, p6

    move/from16 v5, v29

    move/from16 v4, v30

    const/4 v12, 0x2

    const/16 v18, -0x1

    if-ne v9, v12, :cond_d

    or-int v14, v14, v26

    move-object v6, v2

    invoke-virtual {v1, v6, v4}, Lcom/google/android/gms/internal/measurement/rc;->F(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v3

    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v3

    move-object v9, v10

    move-object v10, v7

    move-object v7, v9

    move v9, v4

    move-object v4, v8

    move-object v8, v6

    move/from16 v6, p4

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/measurement/w9;->j(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/zc;[BIILcom/google/android/gms/internal/measurement/v9;)I

    move-result v3

    move-object v5, v2

    move-object v2, v4

    move-object v4, v7

    invoke-virtual {v1, v8, v9, v5}, Lcom/google/android/gms/internal/measurement/rc;->G(Ljava/lang/Object;ILjava/lang/Object;)V

    move/from16 v5, p4

    move v6, v3

    move-object v3, v8

    move/from16 v8, v19

    :goto_c
    const v16, 0xfffff

    :goto_d
    move-object v4, v2

    move-object v2, v10

    move v10, v11

    const/4 v11, 0x0

    goto/16 :goto_1

    :cond_d
    move-object v7, v8

    move-object v8, v2

    move-object v2, v7

    move v7, v5

    move-object/from16 v21, v8

    move-object v8, v2

    move-object/from16 v2, v21

    move/from16 v30, v4

    goto/16 :goto_9

    :pswitch_5
    move-object/from16 v4, p6

    move-object v10, v2

    move-object v8, v3

    move/from16 v7, v29

    const/4 v3, 0x2

    const/16 v18, -0x1

    move-object/from16 v2, p2

    move-wide/from16 v32, v21

    move/from16 v22, v14

    move/from16 v21, v15

    move-wide/from16 v14, v32

    if-ne v9, v3, :cond_11

    and-int v3, v12, v23

    if-eqz v3, :cond_e

    or-int v3, v22, v26

    invoke-static {v2, v7, v4}, Lcom/google/android/gms/internal/measurement/w9;->f([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v5

    move v6, v5

    move v5, v3

    goto :goto_f

    :cond_e
    invoke-static {v2, v7, v4}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v3

    iget v7, v4, Lcom/google/android/gms/internal/measurement/v9;->a:I

    if-ltz v7, :cond_10

    or-int v5, v22, v26

    if-nez v7, :cond_f

    iput-object v6, v4, Lcom/google/android/gms/internal/measurement/v9;->c:Ljava/lang/Object;

    :goto_e
    move v6, v3

    goto :goto_f

    :cond_f
    new-instance v6, Ljava/lang/String;

    sget-object v9, Lcom/google/android/gms/internal/measurement/qb;->a:Ljava/nio/charset/Charset;

    invoke-direct {v6, v2, v3, v7, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iput-object v6, v4, Lcom/google/android/gms/internal/measurement/v9;->c:Ljava/lang/Object;

    add-int/2addr v3, v7

    goto :goto_e

    :goto_f
    iget-object v3, v4, Lcom/google/android/gms/internal/measurement/v9;->c:Ljava/lang/Object;

    invoke-virtual {v10, v8, v14, v15, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object v7, v4

    move v14, v5

    move-object v3, v8

    move/from16 v8, v19

    move/from16 v15, v21

    move/from16 v9, v30

    const v16, 0xfffff

    move/from16 v5, p4

    goto :goto_d

    :cond_10
    new-instance v0, Lcom/google/android/gms/internal/measurement/sb;

    invoke-direct {v0, v5}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    move-object v3, v8

    move-object v8, v2

    move-object v2, v3

    move-object v15, v4

    :goto_10
    move-object v3, v10

    goto/16 :goto_18

    :pswitch_6
    move-object/from16 v4, p6

    move-object v10, v2

    move-object v8, v3

    move/from16 v7, v29

    const/16 v18, -0x1

    move-object/from16 v2, p2

    move-wide/from16 v32, v21

    move/from16 v22, v14

    move/from16 v21, v15

    move-wide/from16 v14, v32

    if-nez v9, :cond_11

    or-int v3, v22, v26

    invoke-static {v2, v7, v4}, Lcom/google/android/gms/internal/measurement/w9;->c([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v6

    iget-wide v12, v4, Lcom/google/android/gms/internal/measurement/v9;->b:J

    cmp-long v5, v12, v24

    if-eqz v5, :cond_12

    move/from16 v5, v28

    goto :goto_11

    :cond_12
    const/4 v5, 0x0

    :goto_11
    invoke-static {v8, v14, v15, v5}, Lcom/google/android/gms/internal/measurement/sd;->n(Ljava/lang/Object;JZ)V

    :goto_12
    move/from16 v5, p4

    move v14, v3

    move-object v7, v4

    move-object v3, v8

    move/from16 v8, v19

    move/from16 v15, v21

    move/from16 v9, v30

    goto/16 :goto_c

    :pswitch_7
    move-object/from16 v4, p6

    move-object v10, v2

    move-object v8, v3

    move/from16 v7, v29

    const/4 v3, 0x5

    const/16 v18, -0x1

    move-object/from16 v2, p2

    move-wide/from16 v32, v21

    move/from16 v22, v14

    move/from16 v21, v15

    move-wide/from16 v14, v32

    if-ne v9, v3, :cond_11

    add-int/lit8 v6, v7, 0x4

    or-int v3, v22, v26

    invoke-static {v2, v7}, Lcom/google/android/gms/internal/measurement/w9;->d([BI)I

    move-result v5

    invoke-virtual {v10, v8, v14, v15, v5}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_12

    :pswitch_8
    move-object/from16 v4, p6

    move-object v10, v2

    move-object v8, v3

    move/from16 v3, v28

    move/from16 v7, v29

    const/16 v18, -0x1

    move-object/from16 v2, p2

    move-wide/from16 v32, v21

    move/from16 v22, v14

    move/from16 v21, v15

    move-wide/from16 v14, v32

    if-ne v9, v3, :cond_13

    add-int/lit8 v9, v7, 0x8

    or-int v12, v22, v26

    invoke-static {v2, v7}, Lcom/google/android/gms/internal/measurement/w9;->e([BI)J

    move-result-wide v6

    move-wide/from16 v32, v14

    move-object v15, v4

    move-wide/from16 v4, v32

    move-object v3, v8

    move-object v8, v2

    move-object v2, v10

    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move/from16 v5, p4

    move-object v4, v8

    move v6, v9

    move v10, v11

    move v14, v12

    :goto_13
    move-object v7, v15

    move/from16 v8, v19

    move/from16 v15, v21

    :goto_14
    move/from16 v9, v30

    goto/16 :goto_8

    :cond_13
    move-object v15, v4

    move-object v3, v8

    move-object v8, v2

    move-object v2, v3

    goto/16 :goto_10

    :pswitch_9
    move-object/from16 v8, p2

    move-wide/from16 v4, v21

    move/from16 v7, v29

    const/16 v18, -0x1

    move/from16 v22, v14

    move/from16 v21, v15

    move-object/from16 v15, p6

    if-nez v9, :cond_14

    or-int v14, v22, v26

    invoke-static {v8, v7, v15}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v6

    iget v7, v15, Lcom/google/android/gms/internal/measurement/v9;->a:I

    invoke-virtual {v2, v3, v4, v5, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_15
    move/from16 v5, p4

    move-object v4, v8

    :goto_16
    move v10, v11

    goto :goto_13

    :cond_14
    move-object/from16 v32, v3

    move-object v3, v2

    move-object/from16 v2, v32

    goto/16 :goto_18

    :pswitch_a
    move-object/from16 v8, p2

    move-wide/from16 v4, v21

    move/from16 v7, v29

    const/16 v18, -0x1

    move/from16 v22, v14

    move/from16 v21, v15

    move-object/from16 v15, p6

    if-nez v9, :cond_14

    or-int v14, v22, v26

    invoke-static {v8, v7, v15}, Lcom/google/android/gms/internal/measurement/w9;->c([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v9

    iget-wide v6, v15, Lcom/google/android/gms/internal/measurement/v9;->b:J

    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move-object/from16 v32, v3

    move-object v3, v2

    move-object/from16 v2, v32

    move-object v4, v3

    move-object v3, v2

    move-object v2, v4

    move/from16 v5, p4

    move-object v4, v8

    move v6, v9

    goto :goto_16

    :pswitch_b
    move-object v4, v3

    move-object v3, v2

    move-object v2, v4

    move-object/from16 v8, p2

    move-wide/from16 v4, v21

    move/from16 v7, v29

    const/4 v6, 0x5

    const/16 v18, -0x1

    move/from16 v22, v14

    move/from16 v21, v15

    move-object/from16 v15, p6

    if-ne v9, v6, :cond_15

    add-int/lit8 v6, v7, 0x4

    or-int v14, v22, v26

    invoke-static {v8, v7}, Lcom/google/android/gms/internal/measurement/w9;->d([BI)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    invoke-static {v2, v4, v5, v7}, Lcom/google/android/gms/internal/measurement/sd;->p(Ljava/lang/Object;JF)V

    :goto_17
    move-object v4, v3

    move-object v3, v2

    move-object v2, v4

    goto :goto_15

    :pswitch_c
    move-object v4, v3

    move-object v3, v2

    move-object v2, v4

    move-object/from16 v8, p2

    move-wide/from16 v4, v21

    move/from16 v6, v28

    move/from16 v7, v29

    const/16 v18, -0x1

    move/from16 v22, v14

    move/from16 v21, v15

    move-object/from16 v15, p6

    if-ne v9, v6, :cond_15

    add-int/lit8 v6, v7, 0x8

    or-int v14, v22, v26

    invoke-static {v8, v7}, Lcom/google/android/gms/internal/measurement/w9;->e([BI)J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v9

    invoke-static {v2, v4, v5, v9, v10}, Lcom/google/android/gms/internal/measurement/sd;->r(Ljava/lang/Object;JD)V

    goto :goto_17

    :cond_15
    :goto_18
    move/from16 v0, v19

    move/from16 v19, v11

    move v11, v0

    move/from16 v1, p5

    move-object v14, v2

    move-object v0, v3

    move v4, v7

    move-object v3, v8

    move-object/from16 v26, v13

    move-object v10, v15

    move/from16 v15, v21

    :goto_19
    move/from16 v9, v30

    goto/16 :goto_5a

    :cond_16
    move-object v11, v3

    move-object v3, v2

    move-object v2, v11

    move/from16 v29, v7

    move/from16 v11, v19

    const/16 v18, -0x1

    move/from16 v19, v10

    move v10, v8

    move-wide/from16 v7, v21

    move/from16 v22, v14

    move/from16 v21, v15

    move-object/from16 v15, p6

    const/16 v14, 0x1b

    if-ne v4, v14, :cond_1a

    const/4 v14, 0x2

    if-ne v9, v14, :cond_19

    invoke-virtual {v3, v2, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/pb;

    invoke-interface {v4}, Lcom/google/android/gms/internal/measurement/pb;->zza()Z

    move-result v5

    if-nez v5, :cond_18

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    if-nez v5, :cond_17

    const/16 v5, 0xa

    goto :goto_1a

    :cond_17
    add-int/2addr v5, v5

    :goto_1a
    invoke-interface {v4, v5}, Lcom/google/android/gms/internal/measurement/pb;->v(I)Lcom/google/android/gms/internal/measurement/pb;

    move-result-object v4

    invoke-virtual {v3, v2, v7, v8, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_18
    move-object v7, v4

    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v2

    move-object/from16 v14, p1

    move-object/from16 v4, p2

    move/from16 v6, p4

    move-object v8, v15

    move/from16 v5, v29

    move-object v15, v3

    move/from16 v3, v21

    invoke-static/range {v2 .. v8}, Lcom/google/android/gms/internal/measurement/w9;->n(Lcom/google/android/gms/internal/measurement/zc;I[BIILcom/google/android/gms/internal/measurement/pb;Lcom/google/android/gms/internal/measurement/v9;)I

    move-result v2

    move/from16 v5, p4

    move-object/from16 v7, p6

    move v6, v2

    move v9, v10

    move v8, v11

    move-object v2, v15

    move/from16 v10, v19

    const/4 v11, 0x0

    const v16, 0xfffff

    move v15, v3

    move-object v3, v14

    move/from16 v14, v22

    goto/16 :goto_1

    :cond_19
    move-object v15, v3

    move/from16 v4, v29

    move/from16 v29, v11

    move-object v11, v13

    move v13, v4

    move/from16 v5, p4

    move-object/from16 v4, p6

    move-object v14, v2

    move-object v9, v15

    move/from16 v15, v21

    move-object/from16 v2, p2

    goto/16 :goto_4d

    :cond_1a
    move-object v14, v2

    move-object v15, v3

    move/from16 v3, v21

    const/16 v2, 0x31

    const-string v3, "Protocol message had invalid UTF-8."

    const-string v0, "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."

    if-gt v4, v2, :cond_67

    move-object/from16 v26, v13

    int-to-long v12, v12

    invoke-virtual {v15, v14, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/pb;

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/pb;->zza()Z

    move-result v23

    if-nez v23, :cond_1b

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v23

    move-wide/from16 v30, v12

    add-int v12, v23, v23

    invoke-interface {v2, v12}, Lcom/google/android/gms/internal/measurement/pb;->v(I)Lcom/google/android/gms/internal/measurement/pb;

    move-result-object v2

    invoke-virtual {v15, v14, v7, v8, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_1b
    move-object v8, v2

    goto :goto_1c

    :cond_1b
    move-wide/from16 v30, v12

    goto :goto_1b

    :goto_1c
    packed-switch v4, :pswitch_data_1

    const/4 v4, 0x3

    if-ne v9, v4, :cond_1d

    and-int/lit8 v0, v21, -0x8

    or-int/lit8 v6, v0, 0x4

    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v2

    move-object/from16 v3, p2

    move/from16 v5, p4

    move-object/from16 v7, p6

    move/from16 v12, v21

    move/from16 v4, v29

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/measurement/w9;->i(Lcom/google/android/gms/internal/measurement/zc;[BIIILcom/google/android/gms/internal/measurement/v9;)I

    move-result v0

    move v13, v4

    iget-object v4, v7, Lcom/google/android/gms/internal/measurement/v9;->c:Ljava/lang/Object;

    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1d
    if-ge v0, v5, :cond_1c

    invoke-static {v3, v0, v7}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v4

    iget v9, v7, Lcom/google/android/gms/internal/measurement/v9;->a:I

    if-ne v12, v9, :cond_1c

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/measurement/w9;->i(Lcom/google/android/gms/internal/measurement/zc;[BIIILcom/google/android/gms/internal/measurement/v9;)I

    move-result v0

    iget-object v4, v7, Lcom/google/android/gms/internal/measurement/v9;->c:Ljava/lang/Object;

    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1d

    :cond_1c
    move v6, v0

    move-object v2, v3

    move/from16 v30, v10

    move/from16 v29, v11

    move-object/from16 v21, v15

    move-object v11, v7

    move v15, v12

    goto/16 :goto_49

    :cond_1d
    move/from16 v2, v21

    move-object/from16 v21, v15

    move v15, v2

    move-object/from16 v2, p2

    move/from16 v5, p4

    move/from16 v30, v10

    move/from16 v13, v29

    move/from16 v29, v11

    move-object/from16 v11, p6

    goto/16 :goto_48

    :pswitch_d
    move-object/from16 v3, p2

    move/from16 v5, p4

    move-object/from16 v7, p6

    move/from16 v12, v21

    move/from16 v13, v29

    const/4 v2, 0x2

    if-ne v9, v2, :cond_20

    sget v2, Lcom/google/android/gms/internal/measurement/w9;->a:I

    check-cast v8, Lcom/google/android/gms/internal/measurement/cc;

    invoke-static {v3, v13, v7}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v2

    iget v4, v7, Lcom/google/android/gms/internal/measurement/v9;->a:I

    add-int/2addr v4, v2

    :goto_1e
    if-ge v2, v4, :cond_1e

    invoke-static {v3, v2, v7}, Lcom/google/android/gms/internal/measurement/w9;->c([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v2

    move-object/from16 v21, v15

    iget-wide v14, v7, Lcom/google/android/gms/internal/measurement/v9;->b:J

    invoke-static {v14, v15}, Lcom/google/android/gms/internal/measurement/ja;->b(J)J

    move-result-wide v14

    invoke-virtual {v8, v14, v15}, Lcom/google/android/gms/internal/measurement/cc;->c(J)V

    move-object/from16 v14, p1

    move-object/from16 v15, v21

    goto :goto_1e

    :cond_1e
    move-object/from16 v21, v15

    if-ne v2, v4, :cond_1f

    :goto_1f
    move-object/from16 v14, p1

    move v6, v2

    :goto_20
    move-object v2, v3

    move/from16 v30, v10

    move/from16 v29, v11

    move v15, v12

    :goto_21
    move-object v11, v7

    goto/16 :goto_49

    :cond_1f
    new-instance v2, Lcom/google/android/gms/internal/measurement/sb;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_20
    move-object/from16 v21, v15

    if-nez v9, :cond_22

    sget v0, Lcom/google/android/gms/internal/measurement/w9;->a:I

    check-cast v8, Lcom/google/android/gms/internal/measurement/cc;

    invoke-static {v3, v13, v7}, Lcom/google/android/gms/internal/measurement/w9;->c([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v0

    iget-wide v14, v7, Lcom/google/android/gms/internal/measurement/v9;->b:J

    invoke-static {v14, v15}, Lcom/google/android/gms/internal/measurement/ja;->b(J)J

    move-result-wide v14

    invoke-virtual {v8, v14, v15}, Lcom/google/android/gms/internal/measurement/cc;->c(J)V

    :goto_22
    if-ge v0, v5, :cond_21

    invoke-static {v3, v0, v7}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v2

    iget v4, v7, Lcom/google/android/gms/internal/measurement/v9;->a:I

    if-ne v12, v4, :cond_21

    invoke-static {v3, v2, v7}, Lcom/google/android/gms/internal/measurement/w9;->c([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v0

    iget-wide v14, v7, Lcom/google/android/gms/internal/measurement/v9;->b:J

    invoke-static {v14, v15}, Lcom/google/android/gms/internal/measurement/ja;->b(J)J

    move-result-wide v14

    invoke-virtual {v8, v14, v15}, Lcom/google/android/gms/internal/measurement/cc;->c(J)V

    goto :goto_22

    :cond_21
    move-object/from16 v14, p1

    move v6, v0

    goto :goto_20

    :cond_22
    :goto_23
    move-object/from16 v14, p1

    move-object v2, v3

    move/from16 v30, v10

    move/from16 v29, v11

    move v15, v12

    :goto_24
    move-object v11, v7

    goto/16 :goto_48

    :pswitch_e
    move-object/from16 v3, p2

    move/from16 v5, p4

    move-object/from16 v7, p6

    move/from16 v12, v21

    move/from16 v13, v29

    const/4 v14, 0x2

    move-object/from16 v21, v15

    if-ne v9, v14, :cond_25

    sget v2, Lcom/google/android/gms/internal/measurement/w9;->a:I

    check-cast v8, Lcom/google/android/gms/internal/measurement/hb;

    invoke-static {v3, v13, v7}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v2

    iget v4, v7, Lcom/google/android/gms/internal/measurement/v9;->a:I

    add-int/2addr v4, v2

    :goto_25
    if-ge v2, v4, :cond_23

    invoke-static {v3, v2, v7}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v2

    iget v6, v7, Lcom/google/android/gms/internal/measurement/v9;->a:I

    invoke-static {v6}, Lcom/google/android/gms/internal/measurement/ja;->a(I)I

    move-result v6

    invoke-virtual {v8, v6}, Lcom/google/android/gms/internal/measurement/hb;->w(I)V

    goto :goto_25

    :cond_23
    if-ne v2, v4, :cond_24

    goto :goto_1f

    :cond_24
    new-instance v2, Lcom/google/android/gms/internal/measurement/sb;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_25
    if-nez v9, :cond_22

    sget v0, Lcom/google/android/gms/internal/measurement/w9;->a:I

    check-cast v8, Lcom/google/android/gms/internal/measurement/hb;

    invoke-static {v3, v13, v7}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v0

    iget v2, v7, Lcom/google/android/gms/internal/measurement/v9;->a:I

    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/ja;->a(I)I

    move-result v2

    invoke-virtual {v8, v2}, Lcom/google/android/gms/internal/measurement/hb;->w(I)V

    :goto_26
    if-ge v0, v5, :cond_21

    invoke-static {v3, v0, v7}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v2

    iget v4, v7, Lcom/google/android/gms/internal/measurement/v9;->a:I

    if-ne v12, v4, :cond_21

    invoke-static {v3, v2, v7}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v0

    iget v2, v7, Lcom/google/android/gms/internal/measurement/v9;->a:I

    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/ja;->a(I)I

    move-result v2

    invoke-virtual {v8, v2}, Lcom/google/android/gms/internal/measurement/hb;->w(I)V

    goto :goto_26

    :pswitch_f
    move-object/from16 v3, p2

    move/from16 v5, p4

    move-object/from16 v7, p6

    move/from16 v12, v21

    move/from16 v13, v29

    const/4 v14, 0x2

    move-object/from16 v21, v15

    if-ne v9, v14, :cond_26

    invoke-static {v3, v13, v8, v7}, Lcom/google/android/gms/internal/measurement/w9;->m([BILcom/google/android/gms/internal/measurement/pb;Lcom/google/android/gms/internal/measurement/v9;)I

    move-result v0

    move v2, v12

    move v4, v13

    :goto_27
    move v6, v5

    goto :goto_28

    :cond_26
    if-nez v9, :cond_2e

    move-object v6, v8

    move v2, v12

    move v4, v13

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/measurement/w9;->l(I[BIILcom/google/android/gms/internal/measurement/pb;Lcom/google/android/gms/internal/measurement/v9;)I

    move-result v0

    goto :goto_27

    :goto_28
    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/measurement/rc;->E(I)Lcom/google/android/gms/internal/measurement/lb;

    move-result-object v5

    iget-object v9, v1, Lcom/google/android/gms/internal/measurement/rc;->j:Lcom/google/android/gms/internal/measurement/ld;

    sget-object v12, Lcom/google/android/gms/internal/measurement/bd;->a:Lcom/google/android/gms/internal/measurement/ld;

    if-eqz v5, :cond_2c

    if-eqz v8, :cond_2a

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v12

    move-object/from16 v15, v17

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_29
    if-ge v13, v12, :cond_29

    invoke-interface {v8, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v23

    move/from16 v24, v0

    move-object/from16 v0, v23

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v5, v1}, Lcom/google/android/gms/internal/measurement/lb;->a(I)Z

    move-result v23

    if-eqz v23, :cond_28

    if-eq v13, v14, :cond_27

    invoke-interface {v8, v14, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_27
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v0, p1

    goto :goto_2a

    :cond_28
    move-object/from16 v0, p1

    invoke-static {v0, v11, v1, v15, v9}, Lcom/google/android/gms/internal/measurement/bd;->e(Ljava/lang/Object;IILjava/lang/Object;Lcom/google/android/gms/internal/measurement/ld;)Ljava/lang/Object;

    move-result-object v15

    :goto_2a
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v1, p0

    move/from16 v0, v24

    goto :goto_29

    :cond_29
    move/from16 v24, v0

    move-object/from16 v0, p1

    if-eq v14, v12, :cond_2d

    invoke-interface {v8, v14, v12}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->clear()V

    goto :goto_2c

    :cond_2a
    move/from16 v24, v0

    move-object/from16 v0, p1

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object/from16 v8, v17

    :cond_2b
    :goto_2b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_2d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-interface {v5, v12}, Lcom/google/android/gms/internal/measurement/lb;->a(I)Z

    move-result v13

    if-nez v13, :cond_2b

    invoke-static {v0, v11, v12, v8, v9}, Lcom/google/android/gms/internal/measurement/bd;->e(Ljava/lang/Object;IILjava/lang/Object;Lcom/google/android/gms/internal/measurement/ld;)Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_2b

    :cond_2c
    move/from16 v24, v0

    move-object/from16 v0, p1

    :cond_2d
    :goto_2c
    move-object/from16 v1, p0

    move-object v14, v0

    move v15, v2

    move-object v2, v3

    move v13, v4

    move v5, v6

    move/from16 v30, v10

    move/from16 v29, v11

    move/from16 v6, v24

    goto/16 :goto_21

    :cond_2e
    move-object/from16 v1, p0

    goto/16 :goto_23

    :pswitch_10
    move-object/from16 v3, p2

    move/from16 v6, p4

    move-object/from16 v7, p6

    move/from16 v2, v21

    move/from16 v4, v29

    const/4 v12, 0x2

    move-object/from16 v21, v15

    if-ne v9, v12, :cond_36

    invoke-static {v3, v4, v7}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v1

    iget v9, v7, Lcom/google/android/gms/internal/measurement/v9;->a:I

    if-ltz v9, :cond_35

    array-length v12, v3

    sub-int/2addr v12, v1

    if-gt v9, v12, :cond_34

    if-nez v9, :cond_2f

    sget-object v9, Lcom/google/android/gms/internal/measurement/ha;->b:Lcom/google/android/gms/internal/measurement/ha;

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2e

    :cond_2f
    invoke-static {v3, v1, v9}, Lcom/google/android/gms/internal/measurement/ha;->h([BII)Lcom/google/android/gms/internal/measurement/ha;

    move-result-object v12

    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2d
    add-int/2addr v1, v9

    :goto_2e
    if-ge v1, v6, :cond_33

    invoke-static {v3, v1, v7}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v9

    iget v12, v7, Lcom/google/android/gms/internal/measurement/v9;->a:I

    if-ne v2, v12, :cond_33

    invoke-static {v3, v9, v7}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v1

    iget v9, v7, Lcom/google/android/gms/internal/measurement/v9;->a:I

    if-ltz v9, :cond_32

    array-length v12, v3

    sub-int/2addr v12, v1

    if-gt v9, v12, :cond_31

    if-nez v9, :cond_30

    sget-object v9, Lcom/google/android/gms/internal/measurement/ha;->b:Lcom/google/android/gms/internal/measurement/ha;

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2e

    :cond_30
    invoke-static {v3, v1, v9}, Lcom/google/android/gms/internal/measurement/ha;->h([BII)Lcom/google/android/gms/internal/measurement/ha;

    move-result-object v12

    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2d

    :cond_31
    new-instance v1, Lcom/google/android/gms/internal/measurement/sb;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_32
    new-instance v0, Lcom/google/android/gms/internal/measurement/sb;

    invoke-direct {v0, v5}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_33
    move v15, v2

    move-object v2, v3

    move v13, v4

    move v5, v6

    move/from16 v30, v10

    move/from16 v29, v11

    move v6, v1

    move-object v11, v7

    move-object/from16 v1, p0

    goto/16 :goto_49

    :cond_34
    new-instance v1, Lcom/google/android/gms/internal/measurement/sb;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_35
    new-instance v0, Lcom/google/android/gms/internal/measurement/sb;

    invoke-direct {v0, v5}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_36
    move-object/from16 v1, p0

    move v15, v2

    move-object v2, v3

    move v13, v4

    move v5, v6

    move/from16 v30, v10

    move/from16 v29, v11

    goto/16 :goto_24

    :pswitch_11
    move-object/from16 v3, p2

    move/from16 v6, p4

    move-object/from16 v7, p6

    move/from16 v2, v21

    move/from16 v4, v29

    const/4 v12, 0x2

    move-object/from16 v21, v15

    if-ne v9, v12, :cond_36

    move-object/from16 v1, p0

    move v3, v2

    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v2

    move-object v5, v8

    move-object v8, v7

    move-object v7, v5

    move v5, v4

    move-object/from16 v4, p2

    invoke-static/range {v2 .. v8}, Lcom/google/android/gms/internal/measurement/w9;->n(Lcom/google/android/gms/internal/measurement/zc;I[BIILcom/google/android/gms/internal/measurement/pb;Lcom/google/android/gms/internal/measurement/v9;)I

    move-result v0

    move v15, v3

    move-object v2, v4

    move v13, v5

    move v5, v6

    move/from16 v30, v10

    move/from16 v29, v11

    move v6, v0

    move-object v11, v8

    goto/16 :goto_49

    :pswitch_12
    move-object/from16 v4, p2

    move-object/from16 v7, p6

    move/from16 v2, v21

    move/from16 v13, v29

    const/4 v12, 0x2

    move-object/from16 v21, v15

    move-object v15, v8

    move/from16 v8, p4

    if-ne v9, v12, :cond_44

    const-wide/32 v27, 0x20000000

    and-long v27, v30, v27

    cmp-long v0, v27, v24

    if-nez v0, :cond_3c

    invoke-static {v4, v13, v7}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v0

    iget v3, v7, Lcom/google/android/gms/internal/measurement/v9;->a:I

    if-ltz v3, :cond_3b

    if-nez v3, :cond_37

    invoke-interface {v15, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_30

    :cond_37
    new-instance v9, Ljava/lang/String;

    sget-object v12, Lcom/google/android/gms/internal/measurement/qb;->a:Ljava/nio/charset/Charset;

    invoke-direct {v9, v4, v0, v3, v12}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v15, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2f
    add-int/2addr v0, v3

    :goto_30
    if-ge v0, v8, :cond_3a

    invoke-static {v4, v0, v7}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v3

    iget v9, v7, Lcom/google/android/gms/internal/measurement/v9;->a:I

    if-ne v2, v9, :cond_3a

    invoke-static {v4, v3, v7}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v0

    iget v3, v7, Lcom/google/android/gms/internal/measurement/v9;->a:I

    if-ltz v3, :cond_39

    if-nez v3, :cond_38

    invoke-interface {v15, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_30

    :cond_38
    new-instance v9, Ljava/lang/String;

    sget-object v12, Lcom/google/android/gms/internal/measurement/qb;->a:Ljava/nio/charset/Charset;

    invoke-direct {v9, v4, v0, v3, v12}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v15, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2f

    :cond_39
    new-instance v0, Lcom/google/android/gms/internal/measurement/sb;

    invoke-direct {v0, v5}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3a
    move v6, v0

    move v15, v2

    move-object v2, v4

    move v5, v8

    move/from16 v30, v10

    move/from16 v29, v11

    goto/16 :goto_21

    :cond_3b
    new-instance v0, Lcom/google/android/gms/internal/measurement/sb;

    invoke-direct {v0, v5}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3c
    invoke-static {v4, v13, v7}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v0

    iget v9, v7, Lcom/google/android/gms/internal/measurement/v9;->a:I

    if-ltz v9, :cond_43

    if-nez v9, :cond_3d

    invoke-interface {v15, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move/from16 v29, v11

    goto :goto_32

    :cond_3d
    add-int v12, v0, v9

    invoke-static {v4, v0, v12}, Lcom/google/android/gms/internal/measurement/vd;->a([BII)Z

    move-result v23

    if-eqz v23, :cond_42

    move/from16 v23, v12

    new-instance v12, Ljava/lang/String;

    move/from16 v29, v11

    sget-object v11, Lcom/google/android/gms/internal/measurement/qb;->a:Ljava/nio/charset/Charset;

    invoke-direct {v12, v4, v0, v9, v11}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v15, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_31
    move/from16 v0, v23

    :goto_32
    if-ge v0, v8, :cond_41

    invoke-static {v4, v0, v7}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v9

    iget v11, v7, Lcom/google/android/gms/internal/measurement/v9;->a:I

    if-ne v2, v11, :cond_41

    invoke-static {v4, v9, v7}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v0

    iget v9, v7, Lcom/google/android/gms/internal/measurement/v9;->a:I

    if-ltz v9, :cond_40

    if-nez v9, :cond_3e

    invoke-interface {v15, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_32

    :cond_3e
    add-int v11, v0, v9

    invoke-static {v4, v0, v11}, Lcom/google/android/gms/internal/measurement/vd;->a([BII)Z

    move-result v12

    if-eqz v12, :cond_3f

    new-instance v12, Ljava/lang/String;

    move/from16 v23, v11

    sget-object v11, Lcom/google/android/gms/internal/measurement/qb;->a:Ljava/nio/charset/Charset;

    invoke-direct {v12, v4, v0, v9, v11}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v15, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_31

    :cond_3f
    new-instance v0, Lcom/google/android/gms/internal/measurement/sb;

    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_40
    new-instance v0, Lcom/google/android/gms/internal/measurement/sb;

    invoke-direct {v0, v5}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_41
    :goto_33
    move v6, v0

    move v15, v2

    :goto_34
    move-object v2, v4

    :goto_35
    move-object v11, v7

    move v5, v8

    :goto_36
    move/from16 v30, v10

    goto/16 :goto_49

    :cond_42
    new-instance v0, Lcom/google/android/gms/internal/measurement/sb;

    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_43
    new-instance v0, Lcom/google/android/gms/internal/measurement/sb;

    invoke-direct {v0, v5}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_44
    move/from16 v29, v11

    :cond_45
    move v15, v2

    move-object v2, v4

    move-object v11, v7

    move v5, v8

    :cond_46
    move/from16 v30, v10

    goto/16 :goto_48

    :pswitch_13
    move-object/from16 v4, p2

    move-object/from16 v7, p6

    move/from16 v2, v21

    move/from16 v13, v29

    const/4 v12, 0x2

    move/from16 v29, v11

    move-object/from16 v21, v15

    move-object v15, v8

    move/from16 v8, p4

    if-ne v9, v12, :cond_4a

    sget v3, Lcom/google/android/gms/internal/measurement/w9;->a:I

    move-object v3, v15

    check-cast v3, Lcom/google/android/gms/internal/measurement/x9;

    invoke-static {v4, v13, v7}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v5

    iget v6, v7, Lcom/google/android/gms/internal/measurement/v9;->a:I

    add-int/2addr v6, v5

    :goto_37
    if-ge v5, v6, :cond_48

    invoke-static {v4, v5, v7}, Lcom/google/android/gms/internal/measurement/w9;->c([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v5

    iget-wide v11, v7, Lcom/google/android/gms/internal/measurement/v9;->b:J

    cmp-long v9, v11, v24

    if-eqz v9, :cond_47

    const/4 v9, 0x1

    goto :goto_38

    :cond_47
    const/4 v9, 0x0

    :goto_38
    invoke-virtual {v3, v9}, Lcom/google/android/gms/internal/measurement/x9;->d(Z)V

    goto :goto_37

    :cond_48
    if-ne v5, v6, :cond_49

    :goto_39
    move v15, v2

    move-object v2, v4

    move v6, v5

    goto :goto_35

    :cond_49
    new-instance v2, Lcom/google/android/gms/internal/measurement/sb;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_4a
    if-nez v9, :cond_45

    sget v0, Lcom/google/android/gms/internal/measurement/w9;->a:I

    move-object v0, v15

    check-cast v0, Lcom/google/android/gms/internal/measurement/x9;

    invoke-static {v4, v13, v7}, Lcom/google/android/gms/internal/measurement/w9;->c([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v3

    iget-wide v5, v7, Lcom/google/android/gms/internal/measurement/v9;->b:J

    cmp-long v5, v5, v24

    if-eqz v5, :cond_4b

    const/4 v5, 0x1

    goto :goto_3a

    :cond_4b
    const/4 v5, 0x0

    :goto_3a
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/measurement/x9;->d(Z)V

    :goto_3b
    if-ge v3, v8, :cond_4d

    invoke-static {v4, v3, v7}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v5

    iget v6, v7, Lcom/google/android/gms/internal/measurement/v9;->a:I

    if-ne v2, v6, :cond_4d

    invoke-static {v4, v5, v7}, Lcom/google/android/gms/internal/measurement/w9;->c([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v3

    iget-wide v5, v7, Lcom/google/android/gms/internal/measurement/v9;->b:J

    cmp-long v5, v5, v24

    if-eqz v5, :cond_4c

    const/4 v5, 0x1

    goto :goto_3c

    :cond_4c
    const/4 v5, 0x0

    :goto_3c
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/measurement/x9;->d(Z)V

    goto :goto_3b

    :cond_4d
    move v15, v2

    move v6, v3

    goto/16 :goto_34

    :pswitch_14
    move-object/from16 v4, p2

    move-object/from16 v7, p6

    move/from16 v2, v21

    move/from16 v13, v29

    const/4 v12, 0x2

    move/from16 v29, v11

    move-object/from16 v21, v15

    move-object v15, v8

    move/from16 v8, p4

    if-ne v9, v12, :cond_51

    sget v3, Lcom/google/android/gms/internal/measurement/w9;->a:I

    move-object v3, v15

    check-cast v3, Lcom/google/android/gms/internal/measurement/hb;

    invoke-static {v4, v13, v7}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v5

    iget v6, v7, Lcom/google/android/gms/internal/measurement/v9;->a:I

    add-int v9, v5, v6

    array-length v11, v4

    if-gt v9, v11, :cond_50

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/hb;->size()I

    move-result v11

    div-int/lit8 v6, v6, 0x4

    add-int/2addr v11, v6

    invoke-virtual {v3, v11}, Lcom/google/android/gms/internal/measurement/hb;->d(I)V

    :goto_3d
    if-ge v5, v9, :cond_4e

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/measurement/w9;->d([BI)I

    move-result v6

    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/measurement/hb;->w(I)V

    add-int/lit8 v5, v5, 0x4

    goto :goto_3d

    :cond_4e
    if-ne v5, v9, :cond_4f

    goto :goto_39

    :cond_4f
    new-instance v2, Lcom/google/android/gms/internal/measurement/sb;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_50
    new-instance v2, Lcom/google/android/gms/internal/measurement/sb;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_51
    const/4 v3, 0x5

    if-ne v9, v3, :cond_45

    add-int/lit8 v0, v13, 0x4

    sget v3, Lcom/google/android/gms/internal/measurement/w9;->a:I

    move-object v3, v15

    check-cast v3, Lcom/google/android/gms/internal/measurement/hb;

    invoke-static {v4, v13}, Lcom/google/android/gms/internal/measurement/w9;->d([BI)I

    move-result v5

    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/measurement/hb;->w(I)V

    :goto_3e
    if-ge v0, v8, :cond_41

    invoke-static {v4, v0, v7}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v5

    iget v6, v7, Lcom/google/android/gms/internal/measurement/v9;->a:I

    if-ne v2, v6, :cond_41

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/measurement/w9;->d([BI)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/measurement/hb;->w(I)V

    add-int/lit8 v0, v5, 0x4

    goto :goto_3e

    :pswitch_15
    move-object/from16 v4, p2

    move-object/from16 v7, p6

    move/from16 v2, v21

    move/from16 v13, v29

    const/4 v12, 0x2

    move/from16 v29, v11

    move-object/from16 v21, v15

    move-object v15, v8

    move/from16 v8, p4

    if-ne v9, v12, :cond_55

    sget v3, Lcom/google/android/gms/internal/measurement/w9;->a:I

    move-object v3, v15

    check-cast v3, Lcom/google/android/gms/internal/measurement/cc;

    invoke-static {v4, v13, v7}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v5

    iget v6, v7, Lcom/google/android/gms/internal/measurement/v9;->a:I

    add-int v9, v5, v6

    array-length v11, v4

    if-gt v9, v11, :cond_54

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/cc;->size()I

    move-result v11

    div-int/lit8 v6, v6, 0x8

    add-int/2addr v11, v6

    invoke-virtual {v3, v11}, Lcom/google/android/gms/internal/measurement/cc;->w(I)V

    :goto_3f
    if-ge v5, v9, :cond_52

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/measurement/w9;->e([BI)J

    move-result-wide v11

    invoke-virtual {v3, v11, v12}, Lcom/google/android/gms/internal/measurement/cc;->c(J)V

    add-int/lit8 v5, v5, 0x8

    goto :goto_3f

    :cond_52
    if-ne v5, v9, :cond_53

    goto/16 :goto_39

    :cond_53
    new-instance v2, Lcom/google/android/gms/internal/measurement/sb;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_54
    new-instance v2, Lcom/google/android/gms/internal/measurement/sb;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_55
    const/4 v3, 0x1

    if-ne v9, v3, :cond_45

    add-int/lit8 v0, v13, 0x8

    sget v3, Lcom/google/android/gms/internal/measurement/w9;->a:I

    move-object v3, v15

    check-cast v3, Lcom/google/android/gms/internal/measurement/cc;

    invoke-static {v4, v13}, Lcom/google/android/gms/internal/measurement/w9;->e([BI)J

    move-result-wide v5

    invoke-virtual {v3, v5, v6}, Lcom/google/android/gms/internal/measurement/cc;->c(J)V

    :goto_40
    if-ge v0, v8, :cond_41

    invoke-static {v4, v0, v7}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v5

    iget v6, v7, Lcom/google/android/gms/internal/measurement/v9;->a:I

    if-ne v2, v6, :cond_41

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/measurement/w9;->e([BI)J

    move-result-wide v11

    invoke-virtual {v3, v11, v12}, Lcom/google/android/gms/internal/measurement/cc;->c(J)V

    add-int/lit8 v0, v5, 0x8

    goto :goto_40

    :pswitch_16
    move-object/from16 v4, p2

    move-object/from16 v7, p6

    move/from16 v2, v21

    move/from16 v13, v29

    const/4 v12, 0x2

    move/from16 v29, v11

    move-object/from16 v21, v15

    move-object v15, v8

    move/from16 v8, p4

    if-ne v9, v12, :cond_56

    invoke-static {v4, v13, v15, v7}, Lcom/google/android/gms/internal/measurement/w9;->m([BILcom/google/android/gms/internal/measurement/pb;Lcom/google/android/gms/internal/measurement/v9;)I

    move-result v0

    goto/16 :goto_33

    :cond_56
    if-nez v9, :cond_45

    move-object v3, v4

    move v5, v8

    move v4, v13

    move-object v6, v15

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/measurement/w9;->l(I[BIILcom/google/android/gms/internal/measurement/pb;Lcom/google/android/gms/internal/measurement/v9;)I

    move-result v0

    move v15, v2

    move-object v2, v3

    move-object v11, v7

    :cond_57
    move v6, v0

    goto/16 :goto_36

    :pswitch_17
    move/from16 v2, v21

    move-object/from16 v21, v15

    move v15, v2

    move-object/from16 v2, p2

    move/from16 v5, p4

    move-object v6, v8

    move/from16 v13, v29

    const/4 v12, 0x2

    move/from16 v29, v11

    move-object/from16 v11, p6

    if-ne v9, v12, :cond_5a

    sget v3, Lcom/google/android/gms/internal/measurement/w9;->a:I

    move-object v8, v6

    check-cast v8, Lcom/google/android/gms/internal/measurement/cc;

    invoke-static {v2, v13, v11}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v3

    iget v4, v11, Lcom/google/android/gms/internal/measurement/v9;->a:I

    add-int/2addr v4, v3

    :goto_41
    if-ge v3, v4, :cond_58

    invoke-static {v2, v3, v11}, Lcom/google/android/gms/internal/measurement/w9;->c([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v3

    iget-wide v6, v11, Lcom/google/android/gms/internal/measurement/v9;->b:J

    invoke-virtual {v8, v6, v7}, Lcom/google/android/gms/internal/measurement/cc;->c(J)V

    goto :goto_41

    :cond_58
    if-ne v3, v4, :cond_59

    :goto_42
    move v6, v3

    goto/16 :goto_36

    :cond_59
    new-instance v2, Lcom/google/android/gms/internal/measurement/sb;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_5a
    if-nez v9, :cond_46

    sget v0, Lcom/google/android/gms/internal/measurement/w9;->a:I

    move-object v8, v6

    check-cast v8, Lcom/google/android/gms/internal/measurement/cc;

    invoke-static {v2, v13, v11}, Lcom/google/android/gms/internal/measurement/w9;->c([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v0

    iget-wide v3, v11, Lcom/google/android/gms/internal/measurement/v9;->b:J

    invoke-virtual {v8, v3, v4}, Lcom/google/android/gms/internal/measurement/cc;->c(J)V

    :goto_43
    if-ge v0, v5, :cond_57

    invoke-static {v2, v0, v11}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v3

    iget v4, v11, Lcom/google/android/gms/internal/measurement/v9;->a:I

    if-ne v15, v4, :cond_57

    invoke-static {v2, v3, v11}, Lcom/google/android/gms/internal/measurement/w9;->c([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v0

    iget-wide v3, v11, Lcom/google/android/gms/internal/measurement/v9;->b:J

    invoke-virtual {v8, v3, v4}, Lcom/google/android/gms/internal/measurement/cc;->c(J)V

    goto :goto_43

    :pswitch_18
    move/from16 v2, v21

    move-object/from16 v21, v15

    move v15, v2

    move-object/from16 v2, p2

    move/from16 v5, p4

    move-object v6, v8

    move/from16 v13, v29

    const/4 v12, 0x2

    move/from16 v29, v11

    move-object/from16 v11, p6

    if-ne v9, v12, :cond_5e

    sget v3, Lcom/google/android/gms/internal/measurement/w9;->a:I

    move-object v8, v6

    check-cast v8, Lcom/google/android/gms/internal/measurement/ya;

    invoke-static {v2, v13, v11}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v3

    iget v4, v11, Lcom/google/android/gms/internal/measurement/v9;->a:I

    add-int v6, v3, v4

    array-length v7, v2

    if-gt v6, v7, :cond_5d

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/ya;->size()I

    move-result v7

    div-int/lit8 v4, v4, 0x4

    add-int/2addr v7, v4

    invoke-virtual {v8, v7}, Lcom/google/android/gms/internal/measurement/ya;->w(I)V

    :goto_44
    if-ge v3, v6, :cond_5b

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/w9;->d([BI)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    invoke-virtual {v8, v4}, Lcom/google/android/gms/internal/measurement/ya;->d(F)V

    add-int/lit8 v3, v3, 0x4

    goto :goto_44

    :cond_5b
    if-ne v3, v6, :cond_5c

    goto :goto_42

    :cond_5c
    new-instance v2, Lcom/google/android/gms/internal/measurement/sb;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_5d
    new-instance v2, Lcom/google/android/gms/internal/measurement/sb;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_5e
    const/4 v3, 0x5

    if-ne v9, v3, :cond_46

    add-int/lit8 v7, v13, 0x4

    sget v0, Lcom/google/android/gms/internal/measurement/w9;->a:I

    move-object v8, v6

    check-cast v8, Lcom/google/android/gms/internal/measurement/ya;

    invoke-static {v2, v13}, Lcom/google/android/gms/internal/measurement/w9;->d([BI)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/measurement/ya;->d(F)V

    :goto_45
    if-ge v7, v5, :cond_5f

    invoke-static {v2, v7, v11}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v0

    iget v3, v11, Lcom/google/android/gms/internal/measurement/v9;->a:I

    if-ne v15, v3, :cond_5f

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/measurement/w9;->d([BI)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-virtual {v8, v3}, Lcom/google/android/gms/internal/measurement/ya;->d(F)V

    add-int/lit8 v7, v0, 0x4

    goto :goto_45

    :cond_5f
    move v6, v7

    goto/16 :goto_36

    :pswitch_19
    move/from16 v2, v21

    move-object/from16 v21, v15

    move v15, v2

    move-object/from16 v2, p2

    move/from16 v5, p4

    move-object v6, v8

    move/from16 v13, v29

    const/4 v12, 0x2

    move/from16 v29, v11

    move-object/from16 v11, p6

    if-ne v9, v12, :cond_63

    sget v3, Lcom/google/android/gms/internal/measurement/w9;->a:I

    move-object v8, v6

    check-cast v8, Lcom/google/android/gms/internal/measurement/oa;

    invoke-static {v2, v13, v11}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v3

    iget v4, v11, Lcom/google/android/gms/internal/measurement/v9;->a:I

    add-int v6, v3, v4

    array-length v7, v2

    if-gt v6, v7, :cond_62

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/oa;->size()I

    move-result v7

    div-int/lit8 v4, v4, 0x8

    add-int/2addr v7, v4

    invoke-virtual {v8, v7}, Lcom/google/android/gms/internal/measurement/oa;->w(I)V

    :goto_46
    if-ge v3, v6, :cond_60

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/w9;->e([BI)J

    move-result-wide v23

    move/from16 v30, v10

    invoke-static/range {v23 .. v24}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/internal/measurement/oa;->d(D)V

    add-int/lit8 v3, v3, 0x8

    move/from16 v10, v30

    goto :goto_46

    :cond_60
    move/from16 v30, v10

    if-ne v3, v6, :cond_61

    move v6, v3

    goto :goto_49

    :cond_61
    new-instance v2, Lcom/google/android/gms/internal/measurement/sb;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_62
    new-instance v2, Lcom/google/android/gms/internal/measurement/sb;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_63
    move/from16 v30, v10

    const/4 v3, 0x1

    if-ne v9, v3, :cond_65

    add-int/lit8 v7, v13, 0x8

    sget v0, Lcom/google/android/gms/internal/measurement/w9;->a:I

    move-object v8, v6

    check-cast v8, Lcom/google/android/gms/internal/measurement/oa;

    invoke-static {v2, v13}, Lcom/google/android/gms/internal/measurement/w9;->e([BI)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v3

    invoke-virtual {v8, v3, v4}, Lcom/google/android/gms/internal/measurement/oa;->d(D)V

    :goto_47
    if-ge v7, v5, :cond_64

    invoke-static {v2, v7, v11}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v0

    iget v3, v11, Lcom/google/android/gms/internal/measurement/v9;->a:I

    if-ne v15, v3, :cond_64

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/measurement/w9;->e([BI)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v3

    invoke-virtual {v8, v3, v4}, Lcom/google/android/gms/internal/measurement/oa;->d(D)V

    add-int/lit8 v7, v0, 0x8

    goto :goto_47

    :cond_64
    move v6, v7

    goto :goto_49

    :cond_65
    :goto_48
    move v6, v13

    :goto_49
    if-eq v6, v13, :cond_66

    move-object v4, v2

    move-object v7, v11

    move-object v3, v14

    move/from16 v10, v19

    move-object/from16 v2, v21

    move/from16 v14, v22

    move/from16 v8, v29

    goto/16 :goto_14

    :cond_66
    move/from16 v1, p5

    move-object v3, v2

    move v4, v6

    move-object v10, v11

    move-object/from16 v0, v21

    move/from16 v11, v29

    goto/16 :goto_19

    :cond_67
    move/from16 v2, v21

    move-object/from16 v21, v15

    move v15, v2

    move-object/from16 v2, p2

    move/from16 v5, p4

    move/from16 v30, v10

    move-object/from16 v26, v13

    move/from16 v13, v29

    move/from16 v29, v11

    move-object/from16 v11, p6

    const/16 v10, 0x32

    if-ne v4, v10, :cond_73

    const/4 v10, 0x2

    if-ne v9, v10, :cond_72

    move/from16 v10, v30

    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/measurement/rc;->D(I)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v9, v21

    invoke-virtual {v9, v14, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lcom/google/android/gms/internal/measurement/ic;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/ic;->f()Z

    move-result v6

    if-nez v6, :cond_68

    invoke-static {}, Lcom/google/android/gms/internal/measurement/ic;->a()Lcom/google/android/gms/internal/measurement/ic;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/ic;->c()Lcom/google/android/gms/internal/measurement/ic;

    move-result-object v6

    invoke-static {v6, v4}, Lcom/google/android/gms/internal/measurement/jc;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v9, v14, v7, v8, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object v4, v6

    :cond_68
    check-cast v3, Lcom/google/android/gms/internal/measurement/hc;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/hc;->e()Lcom/google/android/gms/internal/measurement/gc;

    move-result-object v8

    move-object v12, v4

    check-cast v12, Lcom/google/android/gms/internal/measurement/ic;

    invoke-static {v2, v13, v11}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v3

    iget v4, v11, Lcom/google/android/gms/internal/measurement/v9;->a:I

    if-ltz v4, :cond_71

    sub-int v6, v5, v3

    if-gt v4, v6, :cond_71

    add-int v0, v3, v4

    iget-object v4, v8, Lcom/google/android/gms/internal/measurement/gc;->b:Ljava/lang/Object;

    iget-object v6, v8, Lcom/google/android/gms/internal/measurement/gc;->d:Ljava/lang/Object;

    move-object v7, v6

    :goto_4a
    if-ge v3, v0, :cond_6e

    move-object/from16 v21, v4

    add-int/lit8 v4, v3, 0x1

    aget-byte v3, v2, v3

    if-gez v3, :cond_69

    invoke-static {v3, v2, v4, v11}, Lcom/google/android/gms/internal/measurement/w9;->b(I[BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v4

    iget v3, v11, Lcom/google/android/gms/internal/measurement/v9;->a:I

    :cond_69
    ushr-int/lit8 v2, v3, 0x3

    move/from16 v23, v4

    and-int/lit8 v4, v3, 0x7

    const/4 v5, 0x1

    if-eq v2, v5, :cond_6d

    const/4 v5, 0x2

    if-eq v2, v5, :cond_6a

    move-object/from16 v2, p2

    move/from16 v5, p4

    move-object v4, v11

    move-object/from16 v11, v21

    move-object/from16 v21, v6

    move-object v6, v7

    move/from16 v7, v23

    goto/16 :goto_4c

    :cond_6a
    iget-object v5, v8, Lcom/google/android/gms/internal/measurement/gc;->c:Lcom/google/android/gms/internal/measurement/wd;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/wd;->b()I

    move-result v2

    if-ne v4, v2, :cond_6b

    move-object v2, v6

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    move/from16 v4, p4

    move-object v7, v11

    move-object/from16 v11, v21

    move/from16 v3, v23

    move-object/from16 v21, v2

    move-object/from16 v2, p2

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/measurement/rc;->u([BIILcom/google/android/gms/internal/measurement/wd;Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/v9;)I

    move-result v3

    move-object v2, v7

    iget-object v7, v2, Lcom/google/android/gms/internal/measurement/v9;->c:Ljava/lang/Object;

    move/from16 v5, p4

    move-object v4, v11

    move-object/from16 v6, v21

    move-object v11, v2

    move-object/from16 v2, p2

    goto :goto_4a

    :cond_6b
    move-object v2, v11

    move-object/from16 v11, v21

    move-object/from16 v21, v6

    :cond_6c
    move/from16 v5, p4

    move-object v4, v2

    move-object v6, v7

    move/from16 v7, v23

    move-object/from16 v2, p2

    goto :goto_4c

    :cond_6d
    move-object v2, v11

    move-object/from16 v11, v21

    move-object/from16 v21, v6

    iget-object v5, v8, Lcom/google/android/gms/internal/measurement/gc;->a:Lcom/google/android/gms/internal/measurement/wd;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/wd;->b()I

    move-result v6

    if-ne v4, v6, :cond_6c

    const/4 v6, 0x0

    move/from16 v4, p4

    move-object v11, v7

    move/from16 v3, v23

    move-object v7, v2

    move-object/from16 v2, p2

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/measurement/rc;->u([BIILcom/google/android/gms/internal/measurement/wd;Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/v9;)I

    move-result v3

    move v5, v4

    move-object v4, v7

    iget-object v6, v4, Lcom/google/android/gms/internal/measurement/v9;->c:Ljava/lang/Object;

    move-object v7, v11

    move-object v11, v4

    move-object v4, v6

    :goto_4b
    move-object/from16 v6, v21

    goto/16 :goto_4a

    :goto_4c
    invoke-static {v3, v2, v7, v5, v4}, Lcom/google/android/gms/internal/measurement/w9;->p(I[BIILcom/google/android/gms/internal/measurement/v9;)I

    move-result v3

    move-object v7, v11

    move-object v11, v4

    move-object v4, v7

    move-object v7, v6

    goto :goto_4b

    :cond_6e
    move-object v6, v11

    move-object v11, v4

    move-object v4, v6

    move-object v6, v7

    if-ne v3, v0, :cond_70

    invoke-interface {v12, v11, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eq v0, v13, :cond_6f

    move v6, v0

    move-object v7, v4

    move-object v3, v14

    move/from16 v14, v22

    move/from16 v8, v29

    const/4 v11, 0x0

    const v16, 0xfffff

    move-object v4, v2

    move-object v2, v9

    move v9, v10

    move/from16 v10, v19

    goto/16 :goto_1

    :cond_6f
    move-object v1, v4

    move v4, v0

    move-object v0, v9

    move v9, v10

    move-object v10, v1

    move/from16 v1, p5

    move-object v3, v2

    move/from16 v11, v29

    goto/16 :goto_5a

    :cond_70
    new-instance v0, Lcom/google/android/gms/internal/measurement/sb;

    move-object/from16 v11, v26

    invoke-direct {v0, v11}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_71
    new-instance v2, Lcom/google/android/gms/internal/measurement/sb;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_72
    move-object v4, v11

    move-object/from16 v9, v21

    move-object/from16 v11, v26

    move/from16 v10, v30

    :goto_4d
    move/from16 v1, p5

    move-object v3, v2

    move-object v0, v9

    move v9, v10

    move-object/from16 v26, v11

    move/from16 v11, v29

    move-object v10, v4

    move v4, v13

    goto/16 :goto_5a

    :cond_73
    move-object/from16 v0, v21

    move-object/from16 v11, v26

    move/from16 v10, v30

    add-int/lit8 v21, v10, 0x2

    aget v21, v27, v21

    const v16, 0xfffff

    and-int v2, v21, v16

    move/from16 v21, v4

    int-to-long v4, v2

    packed-switch v21, :pswitch_data_2

    :cond_74
    move-object/from16 v3, p2

    move/from16 v30, v10

    move-object/from16 v26, v11

    move v12, v13

    move/from16 v11, v29

    :goto_4e
    move-object/from16 v10, p6

    goto/16 :goto_58

    :pswitch_1a
    const/4 v4, 0x3

    if-ne v9, v4, :cond_74

    and-int/lit8 v2, v15, -0x8

    or-int/lit8 v7, v2, 0x4

    move/from16 v12, v29

    invoke-virtual {v1, v14, v12, v10}, Lcom/google/android/gms/internal/measurement/rc;->H(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v3

    move-object/from16 v4, p2

    move/from16 v6, p4

    move-object/from16 v8, p6

    move v5, v13

    invoke-static/range {v2 .. v8}, Lcom/google/android/gms/internal/measurement/w9;->k(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/zc;[BIIILcom/google/android/gms/internal/measurement/v9;)I

    move-result v3

    move-object v6, v4

    move-object v4, v2

    move-object v2, v6

    move-object v6, v8

    invoke-virtual {v1, v14, v12, v10, v4}, Lcom/google/android/gms/internal/measurement/rc;->I(Ljava/lang/Object;IILjava/lang/Object;)V

    move/from16 v30, v10

    move-object/from16 v26, v11

    move v11, v12

    move v12, v13

    move-object v10, v6

    :goto_4f
    move v6, v3

    move-object v3, v2

    goto/16 :goto_59

    :pswitch_1b
    move-object/from16 v2, p2

    move-object/from16 v6, p6

    move/from16 v12, v29

    if-nez v9, :cond_75

    invoke-static {v2, v13, v6}, Lcom/google/android/gms/internal/measurement/w9;->c([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v3

    move/from16 v30, v10

    iget-wide v9, v6, Lcom/google/android/gms/internal/measurement/v9;->b:J

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/measurement/ja;->b(J)J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v0, v14, v7, v8, v9}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v0, v14, v4, v5, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_50
    move-object v10, v6

    move-object/from16 v26, v11

    move v11, v12

    move v12, v13

    goto :goto_4f

    :cond_75
    move-object v3, v2

    move/from16 v30, v10

    move-object/from16 v26, v11

    move v11, v12

    move v12, v13

    move-object v10, v6

    goto/16 :goto_58

    :pswitch_1c
    move-object/from16 v2, p2

    move-object/from16 v6, p6

    move/from16 v30, v10

    move/from16 v12, v29

    if-nez v9, :cond_76

    invoke-static {v2, v13, v6}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v3

    iget v9, v6, Lcom/google/android/gms/internal/measurement/v9;->a:I

    invoke-static {v9}, Lcom/google/android/gms/internal/measurement/ja;->a(I)I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v0, v14, v7, v8, v9}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v0, v14, v4, v5, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_50

    :cond_76
    move-object v3, v2

    move-object v10, v6

    move-object/from16 v26, v11

    move v11, v12

    move v12, v13

    goto/16 :goto_58

    :pswitch_1d
    move-object/from16 v2, p2

    move-object/from16 v6, p6

    move/from16 v30, v10

    move/from16 v12, v29

    if-nez v9, :cond_76

    invoke-static {v2, v13, v6}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v3

    iget v9, v6, Lcom/google/android/gms/internal/measurement/v9;->a:I

    move/from16 v21, v3

    move/from16 v10, v30

    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/measurement/rc;->E(I)Lcom/google/android/gms/internal/measurement/lb;

    move-result-object v3

    if-eqz v3, :cond_78

    invoke-interface {v3, v9}, Lcom/google/android/gms/internal/measurement/lb;->a(I)Z

    move-result v3

    if-eqz v3, :cond_77

    goto :goto_51

    :cond_77
    invoke-static {v14}, Lcom/google/android/gms/internal/measurement/rc;->w(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/md;

    move-result-object v3

    int-to-long v4, v9

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v3, v15, v4}, Lcom/google/android/gms/internal/measurement/md;->k(ILjava/lang/Object;)V

    goto :goto_52

    :cond_78
    :goto_51
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v14, v7, v8, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v0, v14, v4, v5, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_52
    move-object v3, v2

    move/from16 v30, v10

    move-object/from16 v26, v11

    move v11, v12

    move v12, v13

    move-object v10, v6

    move/from16 v6, v21

    goto/16 :goto_59

    :pswitch_1e
    move-object/from16 v2, p2

    move-object/from16 v6, p6

    move/from16 v12, v29

    const/4 v3, 0x2

    if-ne v9, v3, :cond_75

    invoke-static {v2, v13, v6}, Lcom/google/android/gms/internal/measurement/w9;->g([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v9

    iget-object v3, v6, Lcom/google/android/gms/internal/measurement/v9;->c:Ljava/lang/Object;

    invoke-virtual {v0, v14, v7, v8, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v0, v14, v4, v5, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move-object v3, v2

    move/from16 v30, v10

    move-object/from16 v26, v11

    move v11, v12

    move v12, v13

    move-object v10, v6

    :goto_53
    move v6, v9

    goto/16 :goto_59

    :pswitch_1f
    move-object/from16 v2, p2

    move-object/from16 v6, p6

    move/from16 v12, v29

    const/4 v3, 0x2

    if-ne v9, v3, :cond_79

    invoke-virtual {v1, v14, v12, v10}, Lcom/google/android/gms/internal/measurement/rc;->H(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v2

    move/from16 v20, v3

    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v3

    move-object/from16 v4, p2

    move-object v7, v6

    move v5, v13

    move/from16 v13, v20

    move/from16 v6, p4

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/measurement/w9;->j(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/zc;[BIILcom/google/android/gms/internal/measurement/v9;)I

    move-result v3

    move-object/from16 v32, v4

    move-object v4, v2

    move-object/from16 v2, v32

    invoke-virtual {v1, v14, v12, v10, v4}, Lcom/google/android/gms/internal/measurement/rc;->I(Ljava/lang/Object;IILjava/lang/Object;)V

    move v6, v3

    move/from16 v30, v10

    move-object/from16 v26, v11

    move v11, v12

    move-object/from16 v10, p6

    move-object v3, v2

    move v12, v5

    goto/16 :goto_59

    :cond_79
    move-object v3, v2

    move/from16 v30, v10

    move-object/from16 v26, v11

    move v11, v12

    move v12, v13

    goto/16 :goto_4e

    :pswitch_20
    move-object/from16 v2, p2

    move/from16 v30, v10

    move-object/from16 v26, v11

    move/from16 v21, v12

    move v12, v13

    move/from16 v11, v29

    const/4 v13, 0x2

    move-object/from16 v10, p6

    if-ne v9, v13, :cond_7d

    invoke-static {v2, v12, v10}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v9

    iget v13, v10, Lcom/google/android/gms/internal/measurement/v9;->a:I

    if-nez v13, :cond_7a

    invoke-virtual {v0, v14, v7, v8, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_55

    :cond_7a
    and-int v6, v21, v23

    move/from16 v21, v6

    add-int v6, v9, v13

    if-eqz v21, :cond_7c

    invoke-static {v2, v9, v6}, Lcom/google/android/gms/internal/measurement/vd;->a([BII)Z

    move-result v21

    if-eqz v21, :cond_7b

    goto :goto_54

    :cond_7b
    new-instance v0, Lcom/google/android/gms/internal/measurement/sb;

    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7c
    :goto_54
    new-instance v3, Ljava/lang/String;

    move/from16 v21, v6

    sget-object v6, Lcom/google/android/gms/internal/measurement/qb;->a:Ljava/nio/charset/Charset;

    invoke-direct {v3, v2, v9, v13, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-virtual {v0, v14, v7, v8, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move/from16 v9, v21

    :goto_55
    invoke-virtual {v0, v14, v4, v5, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move-object v3, v2

    goto/16 :goto_53

    :cond_7d
    move-object v3, v2

    goto/16 :goto_58

    :pswitch_21
    move-object/from16 v2, p2

    move/from16 v30, v10

    move-object/from16 v26, v11

    move v12, v13

    move/from16 v11, v29

    move-object/from16 v10, p6

    if-nez v9, :cond_7f

    invoke-static {v2, v12, v10}, Lcom/google/android/gms/internal/measurement/w9;->c([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v3

    iget-wide v1, v10, Lcom/google/android/gms/internal/measurement/v9;->b:J

    cmp-long v1, v1, v24

    if-eqz v1, :cond_7e

    const/16 v28, 0x1

    goto :goto_56

    :cond_7e
    const/16 v28, 0x0

    :goto_56
    invoke-static/range {v28 .. v28}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v14, v7, v8, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v0, v14, v4, v5, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move v6, v3

    move-object/from16 v3, p2

    goto/16 :goto_59

    :cond_7f
    move-object/from16 v3, p2

    goto/16 :goto_58

    :pswitch_22
    move/from16 v30, v10

    move-object/from16 v26, v11

    move v12, v13

    move/from16 v11, v29

    const/4 v3, 0x5

    move-object/from16 v10, p6

    if-ne v9, v3, :cond_7f

    add-int/lit8 v1, v12, 0x4

    move-object/from16 v3, p2

    invoke-static {v3, v12}, Lcom/google/android/gms/internal/measurement/w9;->d([BI)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v14, v7, v8, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v0, v14, v4, v5, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_57
    move v6, v1

    goto/16 :goto_59

    :pswitch_23
    move-object/from16 v3, p2

    move/from16 v30, v10

    move-object/from16 v26, v11

    move v12, v13

    move/from16 v11, v29

    const/4 v6, 0x1

    move-object/from16 v10, p6

    if-ne v9, v6, :cond_80

    add-int/lit8 v1, v12, 0x8

    invoke-static {v3, v12}, Lcom/google/android/gms/internal/measurement/w9;->e([BI)J

    move-result-wide v23

    invoke-static/range {v23 .. v24}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v14, v7, v8, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v0, v14, v4, v5, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_57

    :pswitch_24
    move-object/from16 v3, p2

    move/from16 v30, v10

    move-object/from16 v26, v11

    move v12, v13

    move/from16 v11, v29

    move-object/from16 v10, p6

    if-nez v9, :cond_80

    invoke-static {v3, v12, v10}, Lcom/google/android/gms/internal/measurement/w9;->a([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v1

    iget v2, v10, Lcom/google/android/gms/internal/measurement/v9;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v14, v7, v8, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v0, v14, v4, v5, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_57

    :pswitch_25
    move-object/from16 v3, p2

    move/from16 v30, v10

    move-object/from16 v26, v11

    move v12, v13

    move/from16 v11, v29

    move-object/from16 v10, p6

    if-nez v9, :cond_80

    invoke-static {v3, v12, v10}, Lcom/google/android/gms/internal/measurement/w9;->c([BILcom/google/android/gms/internal/measurement/v9;)I

    move-result v1

    move v6, v1

    iget-wide v1, v10, Lcom/google/android/gms/internal/measurement/v9;->b:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v14, v7, v8, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v0, v14, v4, v5, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_59

    :pswitch_26
    move-object/from16 v3, p2

    move/from16 v30, v10

    move-object/from16 v26, v11

    move v12, v13

    move/from16 v11, v29

    const/4 v6, 0x5

    move-object/from16 v10, p6

    if-ne v9, v6, :cond_80

    add-int/lit8 v1, v12, 0x4

    invoke-static {v3, v12}, Lcom/google/android/gms/internal/measurement/w9;->d([BI)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v0, v14, v7, v8, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v0, v14, v4, v5, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_57

    :pswitch_27
    move-object/from16 v3, p2

    move/from16 v30, v10

    move-object/from16 v26, v11

    move v12, v13

    move/from16 v11, v29

    const/4 v6, 0x1

    move-object/from16 v10, p6

    if-ne v9, v6, :cond_80

    add-int/lit8 v1, v12, 0x8

    invoke-static {v3, v12}, Lcom/google/android/gms/internal/measurement/w9;->e([BI)J

    move-result-wide v23

    invoke-static/range {v23 .. v24}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v23

    invoke-static/range {v23 .. v24}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v0, v14, v7, v8, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v0, v14, v4, v5, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_57

    :cond_80
    :goto_58
    move v6, v12

    :goto_59
    if-eq v6, v12, :cond_81

    move-object/from16 v1, p0

    move/from16 v5, p4

    move-object v2, v0

    move-object v4, v3

    move-object v7, v10

    move v8, v11

    move-object v3, v14

    move/from16 v10, v19

    move/from16 v14, v22

    goto/16 :goto_14

    :cond_81
    move/from16 v1, p5

    move v4, v6

    goto/16 :goto_19

    :goto_5a
    if-ne v15, v1, :cond_82

    if-eqz v1, :cond_82

    move-object/from16 v8, p0

    move/from16 v5, p4

    move-object v2, v0

    move v6, v4

    move/from16 v10, v19

    :goto_5b
    move/from16 v0, v22

    const v7, 0xfffff

    goto/16 :goto_5e

    :cond_82
    move-object/from16 v8, p0

    iget-boolean v2, v8, Lcom/google/android/gms/internal/measurement/rc;->f:Z

    if-eqz v2, :cond_84

    iget-object v2, v10, Lcom/google/android/gms/internal/measurement/v9;->d:Lcom/google/android/gms/internal/measurement/ra;

    sget-object v5, Lcom/google/android/gms/internal/measurement/ra;->b:Lcom/google/android/gms/internal/measurement/ra;

    sget-object v5, Lcom/google/android/gms/internal/measurement/wc;->c:Lcom/google/android/gms/internal/measurement/wc;

    sget-object v5, Lcom/google/android/gms/internal/measurement/ra;->c:Lcom/google/android/gms/internal/measurement/ra;

    if-eq v2, v5, :cond_84

    iget-object v5, v8, Lcom/google/android/gms/internal/measurement/rc;->e:Lcom/google/android/gms/internal/measurement/oc;

    sget v6, Lcom/google/android/gms/internal/measurement/w9;->a:I

    invoke-virtual {v2, v5, v11}, Lcom/google/android/gms/internal/measurement/ra;->b(Lcom/google/android/gms/internal/measurement/oc;I)Lcom/google/android/gms/internal/measurement/fb;

    move-result-object v2

    if-nez v2, :cond_83

    invoke-static {v14}, Lcom/google/android/gms/internal/measurement/rc;->w(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/md;

    move-result-object v6

    move/from16 v5, p4

    move-object v7, v10

    move v2, v15

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/measurement/w9;->o(I[BIILcom/google/android/gms/internal/measurement/md;Lcom/google/android/gms/internal/measurement/v9;)I

    move-result v4

    :goto_5c
    move v6, v4

    goto :goto_5d

    :cond_83
    move-object v0, v14

    check-cast v0, Lcom/google/android/gms/internal/measurement/db;

    throw v17

    :cond_84
    move v2, v15

    invoke-static {v14}, Lcom/google/android/gms/internal/measurement/rc;->w(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/md;

    move-result-object v6

    move-object/from16 v3, p2

    move/from16 v5, p4

    move-object/from16 v7, p6

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/measurement/w9;->o(I[BIILcom/google/android/gms/internal/measurement/md;Lcom/google/android/gms/internal/measurement/v9;)I

    move-result v4

    goto :goto_5c

    :goto_5d
    move-object/from16 v4, p2

    move-object/from16 v7, p6

    move v15, v2

    move-object v1, v8

    move v8, v11

    move-object v3, v14

    move/from16 v10, v19

    move/from16 v14, v22

    const/4 v11, 0x0

    const v16, 0xfffff

    move-object v2, v0

    goto/16 :goto_1

    :cond_85
    move-object v8, v1

    move/from16 v19, v10

    move-object/from16 v26, v13

    move/from16 v22, v14

    move/from16 v1, p5

    move-object v14, v3

    goto :goto_5b

    :goto_5e
    if-eq v10, v7, :cond_86

    int-to-long v3, v10

    invoke-virtual {v2, v14, v3, v4, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_86
    iget v0, v8, Lcom/google/android/gms/internal/measurement/rc;->h:I

    move-object/from16 v2, v17

    :goto_5f
    iget v3, v8, Lcom/google/android/gms/internal/measurement/rc;->i:I

    if-ge v0, v3, :cond_8a

    iget-object v3, v8, Lcom/google/android/gms/internal/measurement/rc;->g:[I

    iget-object v4, v8, Lcom/google/android/gms/internal/measurement/rc;->j:Lcom/google/android/gms/internal/measurement/ld;

    iget-object v7, v8, Lcom/google/android/gms/internal/measurement/rc;->a:[I

    aget v3, v3, v0

    aget v7, v7, v3

    invoke-virtual {v8, v3}, Lcom/google/android/gms/internal/measurement/rc;->K(I)I

    move-result v9

    const v16, 0xfffff

    and-int v9, v9, v16

    int-to-long v9, v9

    invoke-static {v14, v9, v10}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v9

    if-eqz v9, :cond_89

    invoke-virtual {v8, v3}, Lcom/google/android/gms/internal/measurement/rc;->E(I)Lcom/google/android/gms/internal/measurement/lb;

    move-result-object v10

    if-eqz v10, :cond_89

    check-cast v9, Lcom/google/android/gms/internal/measurement/ic;

    invoke-virtual {v8, v3}, Lcom/google/android/gms/internal/measurement/rc;->D(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/hc;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/hc;->e()Lcom/google/android/gms/internal/measurement/gc;

    move-result-object v3

    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_60
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_89

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map$Entry;

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-interface {v10, v12}, Lcom/google/android/gms/internal/measurement/lb;->a(I)Z

    move-result v12

    if-nez v12, :cond_88

    if-nez v2, :cond_87

    invoke-virtual {v4, v14}, Lcom/google/android/gms/internal/measurement/ld;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    :cond_87
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v3, v12, v13}, Lcom/google/android/gms/internal/measurement/hc;->c(Lcom/google/android/gms/internal/measurement/gc;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v12

    sget-object v13, Lcom/google/android/gms/internal/measurement/ha;->b:Lcom/google/android/gms/internal/measurement/ha;

    new-array v13, v12, [B

    sget-object v17, Lcom/google/android/gms/internal/measurement/ma;->b:Ljava/util/logging/Logger;

    move/from16 v17, v0

    new-instance v0, Lcom/google/android/gms/internal/measurement/ka;

    move-object/from16 v18, v4

    const/4 v4, 0x0

    invoke-direct {v0, v13, v4, v12}, Lcom/google/android/gms/internal/measurement/ka;-><init>([BII)V

    :try_start_0
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v0, v3, v12, v11}, Lcom/google/android/gms/internal/measurement/hc;->b(Lcom/google/android/gms/internal/measurement/ma;Lcom/google/android/gms/internal/measurement/gc;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {v0, v13}, Lcom/google/android/gms/internal/measurement/ea;->a(Lcom/google/android/gms/internal/measurement/ma;[B)Lcom/google/android/gms/internal/measurement/ha;

    move-result-object v0

    const/4 v11, 0x3

    shl-int/lit8 v12, v7, 0x3

    move-object v13, v2

    check-cast v13, Lcom/google/android/gms/internal/measurement/md;

    const/16 v20, 0x2

    or-int/lit8 v12, v12, 0x2

    invoke-virtual {v13, v12, v0}, Lcom/google/android/gms/internal/measurement/md;->k(ILjava/lang/Object;)V

    invoke-interface {v9}, Ljava/util/Iterator;->remove()V

    move/from16 v0, v17

    move-object/from16 v4, v18

    goto :goto_60

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_88
    const/16 v20, 0x2

    goto :goto_60

    :cond_89
    move/from16 v17, v0

    const/4 v4, 0x0

    const/4 v11, 0x3

    const/16 v20, 0x2

    check-cast v2, Lcom/google/android/gms/internal/measurement/md;

    add-int/lit8 v0, v17, 0x1

    goto/16 :goto_5f

    :cond_8a
    if-eqz v2, :cond_8b

    move-object v0, v14

    check-cast v0, Lcom/google/android/gms/internal/measurement/gb;

    iput-object v2, v0, Lcom/google/android/gms/internal/measurement/gb;->zzc:Lcom/google/android/gms/internal/measurement/md;

    :cond_8b
    if-nez v1, :cond_8d

    if-ne v6, v5, :cond_8c

    goto :goto_61

    :cond_8c
    new-instance v0, Lcom/google/android/gms/internal/measurement/sb;

    move-object/from16 v11, v26

    invoke-direct {v0, v11}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8d
    move-object/from16 v11, v26

    if-gt v6, v5, :cond_8e

    if-ne v15, v1, :cond_8e

    :goto_61
    return v6

    :cond_8e
    new-instance v0, Lcom/google/android/gms/internal/measurement/sb;

    invoke-direct {v0, v11}, Lcom/google/android/gms/internal/measurement/sb;-><init>(Ljava/lang/String;)V

    throw v0

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

.method public final zza()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/rc;->e:Lcom/google/android/gms/internal/measurement/oc;

    check-cast v0, Lcom/google/android/gms/internal/measurement/gb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/gb;->m()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    return-object v0
.end method

.method public final zzc(Ljava/lang/Object;)I
    .locals 8

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/rc;->a:[I

    array-length v3, v2

    if-ge v0, v3, :cond_2

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/rc;->K(I)I

    move-result v3

    const v4, 0xfffff

    and-int/2addr v4, v3

    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/rc;->M(I)I

    move-result v3

    aget v2, v2, v0

    int-to-long v4, v4

    const/16 v6, 0x25

    const/16 v7, 0x20

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_4

    :pswitch_0
    invoke-virtual {p0, p1, v2, v0}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v1, v2

    goto/16 :goto_4

    :pswitch_1
    invoke-virtual {p0, p1, v2, v0}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/rc;->l(Ljava/lang/Object;J)J

    move-result-wide v2

    sget-object v4, Lcom/google/android/gms/internal/measurement/qb;->a:Ljava/nio/charset/Charset;

    :goto_2
    ushr-long v4, v2, v7

    xor-long/2addr v2, v4

    long-to-int v2, v2

    goto :goto_1

    :pswitch_2
    invoke-virtual {p0, p1, v2, v0}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/rc;->k(Ljava/lang/Object;J)I

    move-result v2

    goto :goto_1

    :pswitch_3
    invoke-virtual {p0, p1, v2, v0}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/rc;->l(Ljava/lang/Object;J)J

    move-result-wide v2

    sget-object v4, Lcom/google/android/gms/internal/measurement/qb;->a:Ljava/nio/charset/Charset;

    goto :goto_2

    :pswitch_4
    invoke-virtual {p0, p1, v2, v0}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/rc;->k(Ljava/lang/Object;J)I

    move-result v2

    goto :goto_1

    :pswitch_5
    invoke-virtual {p0, p1, v2, v0}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/rc;->k(Ljava/lang/Object;J)I

    move-result v2

    goto :goto_1

    :pswitch_6
    invoke-virtual {p0, p1, v2, v0}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/rc;->k(Ljava/lang/Object;J)I

    move-result v2

    goto :goto_1

    :pswitch_7
    invoke-virtual {p0, p1, v2, v0}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :pswitch_8
    invoke-virtual {p0, p1, v2, v0}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :pswitch_9
    invoke-virtual {p0, p1, v2, v0}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto/16 :goto_1

    :pswitch_a
    invoke-virtual {p0, p1, v2, v0}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/rc;->m(Ljava/lang/Object;J)Z

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/qb;->b(Z)I

    move-result v2

    goto/16 :goto_1

    :pswitch_b
    invoke-virtual {p0, p1, v2, v0}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/rc;->k(Ljava/lang/Object;J)I

    move-result v2

    goto/16 :goto_1

    :pswitch_c
    invoke-virtual {p0, p1, v2, v0}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/rc;->l(Ljava/lang/Object;J)J

    move-result-wide v2

    sget-object v4, Lcom/google/android/gms/internal/measurement/qb;->a:Ljava/nio/charset/Charset;

    goto/16 :goto_2

    :pswitch_d
    invoke-virtual {p0, p1, v2, v0}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/rc;->k(Ljava/lang/Object;J)I

    move-result v2

    goto/16 :goto_1

    :pswitch_e
    invoke-virtual {p0, p1, v2, v0}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/rc;->l(Ljava/lang/Object;J)J

    move-result-wide v2

    sget-object v4, Lcom/google/android/gms/internal/measurement/qb;->a:Ljava/nio/charset/Charset;

    goto/16 :goto_2

    :pswitch_f
    invoke-virtual {p0, p1, v2, v0}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/rc;->l(Ljava/lang/Object;J)J

    move-result-wide v2

    sget-object v4, Lcom/google/android/gms/internal/measurement/qb;->a:Ljava/nio/charset/Charset;

    goto/16 :goto_2

    :pswitch_10
    invoke-virtual {p0, p1, v2, v0}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/rc;->j(Ljava/lang/Object;J)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v2

    goto/16 :goto_1

    :pswitch_11
    invoke-virtual {p0, p1, v2, v0}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/rc;->i(Ljava/lang/Object;J)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    sget-object v4, Lcom/google/android/gms/internal/measurement/qb;->a:Ljava/nio/charset/Charset;

    goto/16 :goto_2

    :pswitch_12
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto/16 :goto_1

    :pswitch_13
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto/16 :goto_1

    :pswitch_14
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v6

    :cond_0
    :goto_3
    add-int/2addr v1, v6

    goto/16 :goto_4

    :pswitch_15
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->k(Ljava/lang/Object;J)J

    move-result-wide v2

    sget-object v4, Lcom/google/android/gms/internal/measurement/qb;->a:Ljava/nio/charset/Charset;

    goto/16 :goto_2

    :pswitch_16
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result v2

    goto/16 :goto_1

    :pswitch_17
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->k(Ljava/lang/Object;J)J

    move-result-wide v2

    sget-object v4, Lcom/google/android/gms/internal/measurement/qb;->a:Ljava/nio/charset/Charset;

    goto/16 :goto_2

    :pswitch_18
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result v2

    goto/16 :goto_1

    :pswitch_19
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result v2

    goto/16 :goto_1

    :pswitch_1a
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result v2

    goto/16 :goto_1

    :pswitch_1b
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto/16 :goto_1

    :pswitch_1c
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v6

    goto :goto_3

    :pswitch_1d
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->s(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto/16 :goto_1

    :pswitch_1e
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->m(Ljava/lang/Object;J)Z

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/qb;->b(Z)I

    move-result v2

    goto/16 :goto_1

    :pswitch_1f
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result v2

    goto/16 :goto_1

    :pswitch_20
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->k(Ljava/lang/Object;J)J

    move-result-wide v2

    sget-object v4, Lcom/google/android/gms/internal/measurement/qb;->a:Ljava/nio/charset/Charset;

    goto/16 :goto_2

    :pswitch_21
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->i(Ljava/lang/Object;J)I

    move-result v2

    goto/16 :goto_1

    :pswitch_22
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->k(Ljava/lang/Object;J)J

    move-result-wide v2

    sget-object v4, Lcom/google/android/gms/internal/measurement/qb;->a:Ljava/nio/charset/Charset;

    goto/16 :goto_2

    :pswitch_23
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->k(Ljava/lang/Object;J)J

    move-result-wide v2

    sget-object v4, Lcom/google/android/gms/internal/measurement/qb;->a:Ljava/nio/charset/Charset;

    goto/16 :goto_2

    :pswitch_24
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->o(Ljava/lang/Object;J)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v2

    goto/16 :goto_1

    :pswitch_25
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/measurement/sd;->q(Ljava/lang/Object;J)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    sget-object v4, Lcom/google/android/gms/internal/measurement/qb;->a:Ljava/nio/charset/Charset;

    goto/16 :goto_2

    :cond_1
    :goto_4
    add-int/lit8 v0, v0, 0x3

    goto/16 :goto_0

    :cond_2
    mul-int/lit8 v1, v1, 0x35

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/measurement/gb;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/gb;->zzc:Lcom/google/android/gms/internal/measurement/md;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/rc;->f:Z

    if-eqz v0, :cond_3

    mul-int/lit8 v1, v1, 0x35

    check-cast p1, Lcom/google/android/gms/internal/measurement/db;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/db;->zzb:Lcom/google/android/gms/internal/measurement/wa;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/wa;->a:Lcom/google/android/gms/internal/measurement/hd;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/hd;->hashCode()I

    move-result p1

    add-int/2addr v1, p1

    :cond_3
    return v1

    :pswitch_data_0
    .packed-switch 0x0
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
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
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

.method public final zze(Ljava/lang/Object;)I
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v6, Lcom/google/android/gms/internal/measurement/rc;->m:Lsun/misc/Unsafe;

    const/4 v7, 0x0

    const v8, 0xfffff

    move v2, v7

    move v4, v2

    move v9, v4

    move v3, v8

    :goto_0
    iget-object v5, v0, Lcom/google/android/gms/internal/measurement/rc;->a:[I

    array-length v10, v5

    if-ge v2, v10, :cond_1d

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/rc;->K(I)I

    move-result v10

    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/rc;->M(I)I

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

    sget-object v13, Lcom/google/android/gms/internal/measurement/xa;->K:Lcom/google/android/gms/internal/measurement/xa;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/xa;->zza()I

    move-result v13

    if-lt v11, v13, :cond_3

    sget-object v13, Lcom/google/android/gms/internal/measurement/xa;->X:Lcom/google/android/gms/internal/measurement/xa;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/xa;->zza()I

    :cond_3
    int-to-long v13, v10

    const/16 v10, 0x3f

    packed-switch v11, :pswitch_data_0

    goto/16 :goto_1e

    :pswitch_0
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1c

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/oc;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v10

    invoke-static {v12, v5, v10}, Lcom/google/android/gms/internal/measurement/ma;->g(ILcom/google/android/gms/internal/measurement/oc;Lcom/google/android/gms/internal/measurement/zc;)I

    move-result v5

    :goto_3
    add-int/2addr v9, v5

    goto/16 :goto_1e

    :pswitch_1
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1c

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v1, v13, v14}, Lcom/google/android/gms/internal/measurement/rc;->l(Ljava/lang/Object;J)J

    move-result-wide v11

    add-long v13, v11, v11

    shr-long v10, v11, v10

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v5

    xor-long/2addr v10, v13

    invoke-static {v10, v11}, Lcom/google/android/gms/internal/measurement/ma;->a(J)I

    move-result v10

    :goto_4
    add-int/2addr v5, v10

    goto :goto_3

    :pswitch_2
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1c

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v1, v13, v14}, Lcom/google/android/gms/internal/measurement/rc;->k(Ljava/lang/Object;J)I

    move-result v10

    add-int v11, v10, v10

    shr-int/lit8 v10, v10, 0x1f

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v5

    xor-int/2addr v10, v11

    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v10

    goto :goto_4

    :pswitch_3
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1c

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v5

    :goto_5
    add-int/lit8 v5, v5, 0x8

    goto :goto_3

    :pswitch_4
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1c

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v5

    :goto_6
    add-int/lit8 v5, v5, 0x4

    goto :goto_3

    :pswitch_5
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1c

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v1, v13, v14}, Lcom/google/android/gms/internal/measurement/rc;->k(Ljava/lang/Object;J)I

    move-result v10

    int-to-long v10, v10

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v5

    invoke-static {v10, v11}, Lcom/google/android/gms/internal/measurement/ma;->a(J)I

    move-result v10

    goto :goto_4

    :pswitch_6
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1c

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v1, v13, v14}, Lcom/google/android/gms/internal/measurement/rc;->k(Ljava/lang/Object;J)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v5

    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v10

    goto :goto_4

    :pswitch_7
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1c

    shl-int/lit8 v5, v12, 0x3

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/internal/measurement/ha;

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v5

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/ha;->d()I

    move-result v10

    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v11

    :goto_7
    add-int/2addr v11, v10

    add-int/2addr v5, v11

    goto/16 :goto_3

    :pswitch_8
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1c

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v10

    invoke-static {v12, v5, v10}, Lcom/google/android/gms/internal/measurement/bd;->E(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/zc;)I

    move-result v5

    goto/16 :goto_3

    :pswitch_9
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1c

    shl-int/lit8 v5, v12, 0x3

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v10

    instance-of v11, v10, Lcom/google/android/gms/internal/measurement/ha;

    if-eqz v11, :cond_4

    check-cast v10, Lcom/google/android/gms/internal/measurement/ha;

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v5

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/ha;->d()I

    move-result v10

    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v11

    goto :goto_7

    :cond_4
    check-cast v10, Ljava/lang/String;

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v5

    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/ma;->b(Ljava/lang/String;)I

    move-result v10

    goto/16 :goto_4

    :pswitch_a
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1c

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v5

    add-int/2addr v5, v15

    goto/16 :goto_3

    :pswitch_b
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1c

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v5

    goto/16 :goto_6

    :pswitch_c
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1c

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v5

    goto/16 :goto_5

    :pswitch_d
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1c

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v1, v13, v14}, Lcom/google/android/gms/internal/measurement/rc;->k(Ljava/lang/Object;J)I

    move-result v10

    int-to-long v10, v10

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v5

    invoke-static {v10, v11}, Lcom/google/android/gms/internal/measurement/ma;->a(J)I

    move-result v10

    goto/16 :goto_4

    :pswitch_e
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1c

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v1, v13, v14}, Lcom/google/android/gms/internal/measurement/rc;->l(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v5

    invoke-static {v10, v11}, Lcom/google/android/gms/internal/measurement/ma;->a(J)I

    move-result v10

    goto/16 :goto_4

    :pswitch_f
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1c

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v1, v13, v14}, Lcom/google/android/gms/internal/measurement/rc;->l(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v5

    invoke-static {v10, v11}, Lcom/google/android/gms/internal/measurement/ma;->a(J)I

    move-result v10

    goto/16 :goto_4

    :pswitch_10
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1c

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v5

    goto/16 :goto_6

    :pswitch_11
    invoke-virtual {v0, v1, v12, v2}, Lcom/google/android/gms/internal/measurement/rc;->r(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_1c

    shl-int/lit8 v5, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v5

    goto/16 :goto_5

    :pswitch_12
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/rc;->D(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v5, Lcom/google/android/gms/internal/measurement/ic;

    check-cast v10, Lcom/google/android/gms/internal/measurement/hc;

    invoke-virtual {v5}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_5

    :goto_8
    move v11, v7

    goto :goto_a

    :cond_5
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/ic;->entrySet()Ljava/util/Set;

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

    invoke-virtual {v10, v12, v14, v13}, Lcom/google/android/gms/internal/measurement/hc;->d(ILjava/lang/Object;Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v11, v13

    goto :goto_9

    :cond_6
    :goto_a
    add-int/2addr v9, v11

    goto/16 :goto_1e

    :pswitch_13
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v10

    sget-object v11, Lcom/google/android/gms/internal/measurement/bd;->a:Lcom/google/android/gms/internal/measurement/ld;

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

    check-cast v15, Lcom/google/android/gms/internal/measurement/oc;

    invoke-static {v12, v15, v10}, Lcom/google/android/gms/internal/measurement/ma;->g(ILcom/google/android/gms/internal/measurement/oc;Lcom/google/android/gms/internal/measurement/zc;)I

    move-result v15

    add-int/2addr v14, v15

    add-int/lit8 v13, v13, 0x1

    goto :goto_b

    :cond_8
    :goto_c
    add-int/2addr v9, v14

    goto/16 :goto_1e

    :pswitch_14
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/bd;->v(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_1c

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v11

    :goto_d
    add-int/2addr v10, v11

    add-int/2addr v10, v5

    :cond_9
    :goto_e
    add-int/2addr v9, v10

    goto/16 :goto_1e

    :pswitch_15
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/bd;->z(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_1c

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v11

    goto :goto_d

    :pswitch_16
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/bd;->C(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_1c

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v11

    goto :goto_d

    :pswitch_17
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/bd;->A(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_1c

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v11

    goto :goto_d

    :pswitch_18
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/bd;->w(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_1c

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v11

    goto :goto_d

    :pswitch_19
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/bd;->y(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_1c

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v11

    goto :goto_d

    :pswitch_1a
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    sget-object v10, Lcom/google/android/gms/internal/measurement/bd;->a:Lcom/google/android/gms/internal/measurement/ld;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_1c

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v11

    goto/16 :goto_d

    :pswitch_1b
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/bd;->A(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_1c

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v11

    goto/16 :goto_d

    :pswitch_1c
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/bd;->C(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_1c

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v11

    goto/16 :goto_d

    :pswitch_1d
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/bd;->x(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_1c

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v11

    goto/16 :goto_d

    :pswitch_1e
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/bd;->u(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_1c

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v11

    goto/16 :goto_d

    :pswitch_1f
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/bd;->t(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_1c

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v11

    goto/16 :goto_d

    :pswitch_20
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/bd;->A(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_1c

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v11

    goto/16 :goto_d

    :pswitch_21
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/bd;->C(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_1c

    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v10

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v11

    goto/16 :goto_d

    :pswitch_22
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    sget-object v10, Lcom/google/android/gms/internal/measurement/bd;->a:Lcom/google/android/gms/internal/measurement/ld;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_a

    :goto_f
    move v5, v7

    goto/16 :goto_3

    :cond_a
    shl-int/lit8 v11, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/bd;->v(Ljava/util/List;)I

    move-result v5

    invoke-static {v11}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v11

    :goto_10
    mul-int/2addr v10, v11

    goto/16 :goto_4

    :pswitch_23
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    sget-object v10, Lcom/google/android/gms/internal/measurement/bd;->a:Lcom/google/android/gms/internal/measurement/ld;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_b

    goto :goto_f

    :cond_b
    shl-int/lit8 v11, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/bd;->z(Ljava/util/List;)I

    move-result v5

    invoke-static {v11}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v11

    goto :goto_10

    :pswitch_24
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v12, v5, v7}, Lcom/google/android/gms/internal/measurement/bd;->D(ILjava/util/List;Z)I

    move-result v5

    goto/16 :goto_3

    :pswitch_25
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v12, v5, v7}, Lcom/google/android/gms/internal/measurement/bd;->B(ILjava/util/List;Z)I

    move-result v5

    goto/16 :goto_3

    :pswitch_26
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    sget-object v10, Lcom/google/android/gms/internal/measurement/bd;->a:Lcom/google/android/gms/internal/measurement/ld;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_c

    goto :goto_f

    :cond_c
    shl-int/lit8 v11, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/bd;->w(Ljava/util/List;)I

    move-result v5

    invoke-static {v11}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v11

    goto :goto_10

    :pswitch_27
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    sget-object v10, Lcom/google/android/gms/internal/measurement/bd;->a:Lcom/google/android/gms/internal/measurement/ld;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_d

    goto :goto_f

    :cond_d
    shl-int/lit8 v11, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/bd;->y(Ljava/util/List;)I

    move-result v5

    invoke-static {v11}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v11

    goto :goto_10

    :pswitch_28
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    sget-object v10, Lcom/google/android/gms/internal/measurement/bd;->a:Lcom/google/android/gms/internal/measurement/ld;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_e

    move v10, v7

    goto/16 :goto_e

    :cond_e
    shl-int/lit8 v11, v12, 0x3

    invoke-static {v11}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v11

    mul-int/2addr v10, v11

    move v11, v7

    :goto_11
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v12

    if-ge v11, v12, :cond_9

    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/google/android/gms/internal/measurement/ha;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/ha;->d()I

    move-result v12

    invoke-static {v12}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v13

    add-int/2addr v13, v12

    add-int/2addr v10, v13

    add-int/lit8 v11, v11, 0x1

    goto :goto_11

    :pswitch_29
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v10

    sget-object v11, Lcom/google/android/gms/internal/measurement/bd;->a:Lcom/google/android/gms/internal/measurement/ld;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v11

    if-nez v11, :cond_f

    move v12, v7

    goto :goto_14

    :cond_f
    shl-int/lit8 v12, v12, 0x3

    invoke-static {v12}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v12

    mul-int/2addr v12, v11

    move v13, v7

    :goto_12
    if-ge v13, v11, :cond_11

    invoke-interface {v5, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    instance-of v15, v14, Lcom/google/android/gms/internal/measurement/xb;

    if-eqz v15, :cond_10

    check-cast v14, Lcom/google/android/gms/internal/measurement/xb;

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/xb;->b()I

    move-result v14

    invoke-static {v14}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v15

    add-int/2addr v15, v14

    add-int/2addr v12, v15

    goto :goto_13

    :cond_10
    check-cast v14, Lcom/google/android/gms/internal/measurement/oc;

    invoke-static {v14, v10}, Lcom/google/android/gms/internal/measurement/ma;->d(Lcom/google/android/gms/internal/measurement/oc;Lcom/google/android/gms/internal/measurement/zc;)I

    move-result v14

    add-int/2addr v12, v14

    :goto_13
    add-int/lit8 v13, v13, 0x1

    goto :goto_12

    :cond_11
    :goto_14
    add-int/2addr v9, v12

    goto/16 :goto_1e

    :pswitch_2a
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    sget-object v10, Lcom/google/android/gms/internal/measurement/bd;->a:Lcom/google/android/gms/internal/measurement/ld;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_12

    goto/16 :goto_8

    :cond_12
    shl-int/lit8 v11, v12, 0x3

    invoke-static {v11}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v11

    mul-int/2addr v11, v10

    instance-of v12, v5, Lcom/google/android/gms/internal/measurement/yb;

    if-eqz v12, :cond_14

    check-cast v5, Lcom/google/android/gms/internal/measurement/yb;

    move v12, v7

    :goto_15
    if-ge v12, v10, :cond_6

    invoke-interface {v5}, Lcom/google/android/gms/internal/measurement/yb;->zzc()Ljava/lang/Object;

    move-result-object v13

    instance-of v14, v13, Lcom/google/android/gms/internal/measurement/ha;

    if-eqz v14, :cond_13

    check-cast v13, Lcom/google/android/gms/internal/measurement/ha;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/ha;->d()I

    move-result v13

    invoke-static {v13}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v14

    add-int/2addr v14, v13

    add-int/2addr v11, v14

    goto :goto_16

    :cond_13
    check-cast v13, Ljava/lang/String;

    invoke-static {v13}, Lcom/google/android/gms/internal/measurement/ma;->b(Ljava/lang/String;)I

    move-result v13

    add-int/2addr v11, v13

    :goto_16
    add-int/lit8 v12, v12, 0x1

    goto :goto_15

    :cond_14
    move v12, v7

    :goto_17
    if-ge v12, v10, :cond_6

    invoke-interface {v5, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    instance-of v14, v13, Lcom/google/android/gms/internal/measurement/ha;

    if-eqz v14, :cond_15

    check-cast v13, Lcom/google/android/gms/internal/measurement/ha;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/ha;->d()I

    move-result v13

    invoke-static {v13}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v14

    add-int/2addr v14, v13

    add-int/2addr v11, v14

    goto :goto_18

    :cond_15
    check-cast v13, Ljava/lang/String;

    invoke-static {v13}, Lcom/google/android/gms/internal/measurement/ma;->b(Ljava/lang/String;)I

    move-result v13

    add-int/2addr v11, v13

    :goto_18
    add-int/lit8 v12, v12, 0x1

    goto :goto_17

    :pswitch_2b
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    sget-object v10, Lcom/google/android/gms/internal/measurement/bd;->a:Lcom/google/android/gms/internal/measurement/ld;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-nez v5, :cond_16

    goto/16 :goto_f

    :cond_16
    shl-int/lit8 v10, v12, 0x3

    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v10

    add-int/2addr v10, v15

    mul-int/2addr v5, v10

    goto/16 :goto_3

    :pswitch_2c
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v12, v5, v7}, Lcom/google/android/gms/internal/measurement/bd;->B(ILjava/util/List;Z)I

    move-result v5

    goto/16 :goto_3

    :pswitch_2d
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v12, v5, v7}, Lcom/google/android/gms/internal/measurement/bd;->D(ILjava/util/List;Z)I

    move-result v5

    goto/16 :goto_3

    :pswitch_2e
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    sget-object v10, Lcom/google/android/gms/internal/measurement/bd;->a:Lcom/google/android/gms/internal/measurement/ld;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_17

    goto/16 :goto_f

    :cond_17
    shl-int/lit8 v11, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/bd;->x(Ljava/util/List;)I

    move-result v5

    invoke-static {v11}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v11

    goto/16 :goto_10

    :pswitch_2f
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    sget-object v10, Lcom/google/android/gms/internal/measurement/bd;->a:Lcom/google/android/gms/internal/measurement/ld;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_18

    goto/16 :goto_f

    :cond_18
    shl-int/lit8 v11, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/bd;->u(Ljava/util/List;)I

    move-result v5

    invoke-static {v11}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v11

    goto/16 :goto_10

    :pswitch_30
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    sget-object v10, Lcom/google/android/gms/internal/measurement/bd;->a:Lcom/google/android/gms/internal/measurement/ld;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_19

    goto/16 :goto_8

    :cond_19
    shl-int/lit8 v10, v12, 0x3

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/bd;->t(Ljava/util/List;)I

    move-result v11

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v10

    mul-int/2addr v5, v10

    add-int/2addr v11, v5

    goto/16 :goto_a

    :pswitch_31
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v12, v5, v7}, Lcom/google/android/gms/internal/measurement/bd;->B(ILjava/util/List;Z)I

    move-result v5

    goto/16 :goto_3

    :pswitch_32
    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v12, v5, v7}, Lcom/google/android/gms/internal/measurement/bd;->D(ILjava/util/List;Z)I

    move-result v5

    goto/16 :goto_3

    :pswitch_33
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_1c

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/oc;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v10

    invoke-static {v12, v5, v10}, Lcom/google/android/gms/internal/measurement/ma;->g(ILcom/google/android/gms/internal/measurement/oc;Lcom/google/android/gms/internal/measurement/zc;)I

    move-result v5

    goto/16 :goto_3

    :pswitch_34
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_1a

    shl-int/lit8 v0, v12, 0x3

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v11

    add-long v13, v11, v11

    shr-long v10, v11, v10

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v0

    xor-long/2addr v10, v13

    invoke-static {v10, v11}, Lcom/google/android/gms/internal/measurement/ma;->a(J)I

    move-result v5

    :goto_19
    add-int/2addr v0, v5

    :goto_1a
    add-int/2addr v9, v0

    :cond_1a
    move-object/from16 v0, p0

    goto/16 :goto_1e

    :pswitch_35
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_1a

    shl-int/lit8 v0, v12, 0x3

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    add-int v10, v5, v5

    shr-int/lit8 v5, v5, 0x1f

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v0

    xor-int/2addr v5, v10

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v5

    goto :goto_19

    :pswitch_36
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_1a

    shl-int/lit8 v0, v12, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v0

    :goto_1b
    add-int/lit8 v0, v0, 0x8

    goto :goto_1a

    :pswitch_37
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_1a

    shl-int/lit8 v0, v12, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v0

    :goto_1c
    add-int/lit8 v0, v0, 0x4

    goto :goto_1a

    :pswitch_38
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_1a

    shl-int/lit8 v0, v12, 0x3

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    int-to-long v10, v5

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v0

    invoke-static {v10, v11}, Lcom/google/android/gms/internal/measurement/ma;->a(J)I

    move-result v5

    goto :goto_19

    :pswitch_39
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_1a

    shl-int/lit8 v0, v12, 0x3

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v0

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v5

    goto :goto_19

    :pswitch_3a
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_1a

    shl-int/lit8 v0, v12, 0x3

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/ha;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v0

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/ha;->d()I

    move-result v5

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v10

    :goto_1d
    add-int/2addr v10, v5

    add-int/2addr v0, v10

    goto/16 :goto_1a

    :pswitch_3b
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_1c

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/rc;->C(I)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v10

    invoke-static {v12, v5, v10}, Lcom/google/android/gms/internal/measurement/bd;->E(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/zc;)I

    move-result v5

    goto/16 :goto_3

    :pswitch_3c
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_1a

    shl-int/lit8 v0, v12, 0x3

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    instance-of v10, v5, Lcom/google/android/gms/internal/measurement/ha;

    if-eqz v10, :cond_1b

    check-cast v5, Lcom/google/android/gms/internal/measurement/ha;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v0

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/ha;->d()I

    move-result v5

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v10

    goto :goto_1d

    :cond_1b
    check-cast v5, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v0

    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/ma;->b(Ljava/lang/String;)I

    move-result v5

    goto/16 :goto_19

    :pswitch_3d
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_1a

    shl-int/lit8 v0, v12, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v0

    add-int/2addr v0, v15

    goto/16 :goto_1a

    :pswitch_3e
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_1a

    shl-int/lit8 v0, v12, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v0

    goto/16 :goto_1c

    :pswitch_3f
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_1a

    shl-int/lit8 v0, v12, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v0

    goto/16 :goto_1b

    :pswitch_40
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_1a

    shl-int/lit8 v0, v12, 0x3

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    int-to-long v10, v5

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v0

    invoke-static {v10, v11}, Lcom/google/android/gms/internal/measurement/ma;->a(J)I

    move-result v5

    goto/16 :goto_19

    :pswitch_41
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_1a

    shl-int/lit8 v0, v12, 0x3

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v0

    invoke-static {v10, v11}, Lcom/google/android/gms/internal/measurement/ma;->a(J)I

    move-result v5

    goto/16 :goto_19

    :pswitch_42
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_1a

    shl-int/lit8 v0, v12, 0x3

    invoke-virtual {v6, v1, v13, v14}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v0

    invoke-static {v10, v11}, Lcom/google/android/gms/internal/measurement/ma;->a(J)I

    move-result v5

    goto/16 :goto_19

    :pswitch_43
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_1a

    shl-int/lit8 v0, v12, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v0

    goto/16 :goto_1c

    :pswitch_44
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/rc;->o(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_1c

    shl-int/lit8 v1, v12, 0x3

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x8

    add-int/2addr v9, v1

    :cond_1c
    :goto_1e
    add-int/lit8 v2, v2, 0x3

    move-object/from16 v1, p1

    goto/16 :goto_0

    :cond_1d
    move-object/from16 v1, p1

    check-cast v1, Lcom/google/android/gms/internal/measurement/gb;

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/gb;->zzc:Lcom/google/android/gms/internal/measurement/md;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/md;->i()I

    move-result v1

    add-int/2addr v9, v1

    iget-boolean v1, v0, Lcom/google/android/gms/internal/measurement/rc;->f:Z

    if-eqz v1, :cond_20

    move-object/from16 v1, p1

    check-cast v1, Lcom/google/android/gms/internal/measurement/db;

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/db;->zzb:Lcom/google/android/gms/internal/measurement/wa;

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/wa;->a:Lcom/google/android/gms/internal/measurement/hd;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/hd;->c()I

    move-result v2

    move v3, v7

    :goto_1f
    if-ge v7, v2, :cond_1e

    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/measurement/hd;->d(I)Ljava/util/Map$Entry;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/google/android/gms/internal/measurement/ed;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/ed;->a()Ljava/lang/Comparable;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/va;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5, v4}, Lcom/google/android/gms/internal/measurement/wa;->j(Lcom/google/android/gms/internal/measurement/va;Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v7, v7, 0x1

    goto :goto_1f

    :cond_1e
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/hd;->e()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_20
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/va;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/google/android/gms/internal/measurement/wa;->j(Lcom/google/android/gms/internal/measurement/va;Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v3, v2

    goto :goto_20

    :cond_1f
    add-int/2addr v9, v3

    :cond_20
    return v9

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
