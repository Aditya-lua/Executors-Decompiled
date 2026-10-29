.class public final Lr7/e;
.super Lr7/c;
.source "SourceFile"


# static fields
.field public static final n:Lxu/h;

.field public static final o:Lxu/h;

.field public static final p:Lxu/h;

.field public static final q:Lxu/h;

.field public static final r:Lxu/h;


# instance fields
.field public final h:Lxu/g;

.field public final i:Lxu/e;

.field public j:I

.field public k:J

.field public l:I

.field public m:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "\'\\"

    invoke-static {v0}, Lxu/h;->e(Ljava/lang/String;)Lxu/h;

    move-result-object v0

    sput-object v0, Lr7/e;->n:Lxu/h;

    const-string v0, "\"\\"

    invoke-static {v0}, Lxu/h;->e(Ljava/lang/String;)Lxu/h;

    move-result-object v0

    sput-object v0, Lr7/e;->o:Lxu/h;

    const-string v0, "{}[]:, \n\t\r\u000c/\\;#="

    invoke-static {v0}, Lxu/h;->e(Ljava/lang/String;)Lxu/h;

    move-result-object v0

    sput-object v0, Lr7/e;->p:Lxu/h;

    const-string v0, "\n\r"

    invoke-static {v0}, Lxu/h;->e(Ljava/lang/String;)Lxu/h;

    move-result-object v0

    sput-object v0, Lr7/e;->q:Lxu/h;

    const-string v0, "*/"

    invoke-static {v0}, Lxu/h;->e(Ljava/lang/String;)Lxu/h;

    move-result-object v0

    sput-object v0, Lr7/e;->r:Lxu/h;

    return-void
.end method

.method public constructor <init>(Lxu/g;)V
    .locals 1

    invoke-direct {p0}, Lr7/c;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lr7/e;->j:I

    if-eqz p1, :cond_0

    iput-object p1, p0, Lr7/e;->h:Lxu/g;

    invoke-interface {p1}, Lxu/g;->O()Lxu/e;

    move-result-object p1

    iput-object p1, p0, Lr7/e;->i:Lxu/e;

    const/4 p1, 0x6

    invoke-virtual {p0, p1}, Lr7/c;->q(I)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "source == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final B()I
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lr7/c;->b:[I

    iget v2, v0, Lr7/c;->a:I

    add-int/lit8 v3, v2, -0x1

    aget v3, v1, v3

    const/16 v5, 0x22

    const/16 v6, 0x8

    const-wide/16 v7, 0x0

    const/4 v9, 0x3

    const/16 v10, 0x5d

    const/4 v11, 0x7

    const/16 v12, 0x3b

    const/16 v13, 0x2c

    const/4 v14, 0x4

    const/4 v15, 0x2

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    sub-int/2addr v2, v4

    aput v15, v1, v2

    goto/16 :goto_0

    :cond_0
    if-ne v3, v15, :cond_3

    invoke-virtual {v0, v4}, Lr7/e;->I(Z)I

    move-result v1

    iget-object v2, v0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v2}, Lxu/e;->readByte()B

    if-eq v1, v13, :cond_a

    if-eq v1, v12, :cond_2

    if-ne v1, v10, :cond_1

    iput v14, v0, Lr7/e;->j:I

    return v14

    :cond_1
    const-string v1, "Unterminated array"

    invoke-virtual {v0, v1}, Lr7/c;->w(Ljava/lang/String;)Lr7/b;

    move-result-object v1

    throw v1

    :cond_2
    invoke-virtual {v0}, Lr7/e;->y()V

    goto :goto_0

    :cond_3
    const/4 v15, 0x5

    if-eq v3, v9, :cond_17

    if-ne v3, v15, :cond_4

    goto/16 :goto_2

    :cond_4
    if-ne v3, v14, :cond_6

    sub-int/2addr v2, v4

    aput v15, v1, v2

    invoke-virtual {v0, v4}, Lr7/e;->I(Z)I

    move-result v1

    iget-object v2, v0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v2}, Lxu/e;->readByte()B

    const/16 v2, 0x3a

    if-eq v1, v2, :cond_a

    const/16 v2, 0x3d

    if-ne v1, v2, :cond_5

    invoke-virtual {v0}, Lr7/e;->y()V

    iget-object v1, v0, Lr7/e;->h:Lxu/g;

    const-wide/16 v14, 0x1

    invoke-interface {v1, v14, v15}, Lxu/g;->request(J)Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, v0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v1, v7, v8}, Lxu/e;->j(J)B

    move-result v1

    const/16 v2, 0x3e

    if-ne v1, v2, :cond_a

    iget-object v1, v0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v1}, Lxu/e;->readByte()B

    goto :goto_0

    :cond_5
    const-string v1, "Expected \':\'"

    invoke-virtual {v0, v1}, Lr7/c;->w(Ljava/lang/String;)Lr7/b;

    move-result-object v1

    throw v1

    :cond_6
    const/4 v14, 0x6

    if-ne v3, v14, :cond_7

    sub-int/2addr v2, v4

    aput v11, v1, v2

    goto :goto_0

    :cond_7
    if-ne v3, v11, :cond_9

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lr7/e;->I(Z)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_8

    const/16 v1, 0x12

    iput v1, v0, Lr7/e;->j:I

    return v1

    :cond_8
    invoke-virtual {v0}, Lr7/e;->y()V

    goto :goto_0

    :cond_9
    if-eq v3, v6, :cond_16

    :cond_a
    :goto_0
    invoke-virtual {v0, v4}, Lr7/e;->I(Z)I

    move-result v1

    if-eq v1, v5, :cond_15

    const/16 v2, 0x27

    if-eq v1, v2, :cond_14

    if-eq v1, v13, :cond_11

    if-eq v1, v12, :cond_11

    const/16 v2, 0x5b

    if-eq v1, v2, :cond_10

    if-eq v1, v10, :cond_f

    const/16 v2, 0x7b

    if-eq v1, v2, :cond_e

    invoke-virtual {v0}, Lr7/e;->P()I

    move-result v1

    if-eqz v1, :cond_b

    return v1

    :cond_b
    invoke-virtual {v0}, Lr7/e;->U()I

    move-result v1

    if-eqz v1, :cond_c

    return v1

    :cond_c
    iget-object v1, v0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v1, v7, v8}, Lxu/e;->j(J)B

    move-result v1

    invoke-virtual {v0, v1}, Lr7/e;->H(I)Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-virtual {v0}, Lr7/e;->y()V

    const/16 v1, 0xa

    iput v1, v0, Lr7/e;->j:I

    return v1

    :cond_d
    const-string v1, "Expected value"

    invoke-virtual {v0, v1}, Lr7/c;->w(Ljava/lang/String;)Lr7/b;

    move-result-object v1

    throw v1

    :cond_e
    iget-object v1, v0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v1}, Lxu/e;->readByte()B

    iput v4, v0, Lr7/e;->j:I

    return v4

    :cond_f
    if-ne v3, v4, :cond_11

    iget-object v1, v0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v1}, Lxu/e;->readByte()B

    const/4 v1, 0x4

    iput v1, v0, Lr7/e;->j:I

    return v1

    :cond_10
    iget-object v1, v0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v1}, Lxu/e;->readByte()B

    iput v9, v0, Lr7/e;->j:I

    return v9

    :cond_11
    if-eq v3, v4, :cond_13

    const/4 v1, 0x2

    if-ne v3, v1, :cond_12

    goto :goto_1

    :cond_12
    const-string v1, "Unexpected value"

    invoke-virtual {v0, v1}, Lr7/c;->w(Ljava/lang/String;)Lr7/b;

    move-result-object v1

    throw v1

    :cond_13
    :goto_1
    invoke-virtual {v0}, Lr7/e;->y()V

    iput v11, v0, Lr7/e;->j:I

    return v11

    :cond_14
    invoke-virtual {v0}, Lr7/e;->y()V

    iget-object v1, v0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v1}, Lxu/e;->readByte()B

    iput v6, v0, Lr7/e;->j:I

    return v6

    :cond_15
    iget-object v1, v0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v1}, Lxu/e;->readByte()B

    const/16 v1, 0x9

    iput v1, v0, Lr7/e;->j:I

    return v1

    :cond_16
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "JsonReader is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_17
    :goto_2
    sub-int/2addr v2, v4

    const/16 v16, 0x4

    aput v16, v1, v2

    const/16 v1, 0x7d

    if-ne v3, v15, :cond_1a

    invoke-virtual {v0, v4}, Lr7/e;->I(Z)I

    move-result v2

    iget-object v6, v0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v6}, Lxu/e;->readByte()B

    if-eq v2, v13, :cond_1a

    if-eq v2, v12, :cond_19

    if-ne v2, v1, :cond_18

    const/4 v1, 0x2

    iput v1, v0, Lr7/e;->j:I

    return v1

    :cond_18
    const-string v1, "Unterminated object"

    invoke-virtual {v0, v1}, Lr7/c;->w(Ljava/lang/String;)Lr7/b;

    move-result-object v1

    throw v1

    :cond_19
    invoke-virtual {v0}, Lr7/e;->y()V

    :cond_1a
    invoke-virtual {v0, v4}, Lr7/e;->I(Z)I

    move-result v2

    if-eq v2, v5, :cond_1f

    const/16 v4, 0x27

    if-eq v2, v4, :cond_1e

    const-string v4, "Expected name"

    if-eq v2, v1, :cond_1c

    invoke-virtual {v0}, Lr7/e;->y()V

    int-to-char v1, v2

    invoke-virtual {v0, v1}, Lr7/e;->H(I)Z

    move-result v1

    if-eqz v1, :cond_1b

    const/16 v1, 0xe

    iput v1, v0, Lr7/e;->j:I

    return v1

    :cond_1b
    invoke-virtual {v0, v4}, Lr7/c;->w(Ljava/lang/String;)Lr7/b;

    move-result-object v1

    throw v1

    :cond_1c
    if-eq v3, v15, :cond_1d

    iget-object v1, v0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v1}, Lxu/e;->readByte()B

    const/4 v1, 0x2

    iput v1, v0, Lr7/e;->j:I

    return v1

    :cond_1d
    invoke-virtual {v0, v4}, Lr7/c;->w(Ljava/lang/String;)Lr7/b;

    move-result-object v1

    throw v1

    :cond_1e
    iget-object v1, v0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v1}, Lxu/e;->readByte()B

    invoke-virtual {v0}, Lr7/e;->y()V

    const/16 v1, 0xc

    iput v1, v0, Lr7/e;->j:I

    return v1

    :cond_1f
    iget-object v1, v0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v1}, Lxu/e;->readByte()B

    const/16 v1, 0xd

    iput v1, v0, Lr7/e;->j:I

    return v1
.end method

.method public final F(Ljava/lang/String;Lr7/c$a;)I
    .locals 4

    iget-object v0, p2, Lr7/c$a;->a:[Ljava/lang/String;

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p2, Lr7/c$a;->a:[Ljava/lang/String;

    aget-object v3, v3, v2

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iput v1, p0, Lr7/e;->j:I

    iget-object p2, p0, Lr7/c;->c:[Ljava/lang/String;

    iget v0, p0, Lr7/c;->a:I

    add-int/lit8 v0, v0, -0x1

    aput-object p1, p2, v0

    return v2

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final H(I)Z
    .locals 1

    const/16 v0, 0x9

    if-eq p1, v0, :cond_1

    const/16 v0, 0xa

    if-eq p1, v0, :cond_1

    const/16 v0, 0xc

    if-eq p1, v0, :cond_1

    const/16 v0, 0xd

    if-eq p1, v0, :cond_1

    const/16 v0, 0x20

    if-eq p1, v0, :cond_1

    const/16 v0, 0x23

    if-eq p1, v0, :cond_0

    const/16 v0, 0x2c

    if-eq p1, v0, :cond_1

    const/16 v0, 0x2f

    if-eq p1, v0, :cond_0

    const/16 v0, 0x3d

    if-eq p1, v0, :cond_0

    const/16 v0, 0x7b

    if-eq p1, v0, :cond_1

    const/16 v0, 0x7d

    if-eq p1, v0, :cond_1

    const/16 v0, 0x3a

    if-eq p1, v0, :cond_1

    const/16 v0, 0x3b

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x1

    return p1

    :cond_0
    :pswitch_0
    invoke-virtual {p0}, Lr7/e;->y()V

    :cond_1
    :pswitch_1
    const/4 p1, 0x0

    return p1

    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final I(Z)I
    .locals 6

    const/4 v0, 0x0

    :goto_0
    move v1, v0

    :goto_1
    iget-object v2, p0, Lr7/e;->h:Lxu/g;

    add-int/lit8 v3, v1, 0x1

    int-to-long v4, v3

    invoke-interface {v2, v4, v5}, Lxu/g;->request(J)Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v2, p0, Lr7/e;->i:Lxu/e;

    int-to-long v4, v1

    invoke-virtual {v2, v4, v5}, Lxu/e;->j(J)B

    move-result v2

    const/16 v4, 0xa

    if-eq v2, v4, :cond_7

    const/16 v4, 0x20

    if-eq v2, v4, :cond_7

    const/16 v4, 0xd

    if-eq v2, v4, :cond_7

    const/16 v4, 0x9

    if-ne v2, v4, :cond_0

    goto :goto_3

    :cond_0
    iget-object v3, p0, Lr7/e;->i:Lxu/e;

    int-to-long v4, v1

    invoke-virtual {v3, v4, v5}, Lxu/e;->skip(J)V

    const/16 v1, 0x2f

    if-ne v2, v1, :cond_5

    iget-object v3, p0, Lr7/e;->h:Lxu/g;

    const-wide/16 v4, 0x2

    invoke-interface {v3, v4, v5}, Lxu/g;->request(J)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Lr7/e;->y()V

    iget-object v3, p0, Lr7/e;->i:Lxu/e;

    const-wide/16 v4, 0x1

    invoke-virtual {v3, v4, v5}, Lxu/e;->j(J)B

    move-result v3

    const/16 v4, 0x2a

    if-eq v3, v4, :cond_3

    if-eq v3, v1, :cond_2

    goto :goto_2

    :cond_2
    iget-object v1, p0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v1}, Lxu/e;->readByte()B

    iget-object v1, p0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v1}, Lxu/e;->readByte()B

    invoke-virtual {p0}, Lr7/e;->a0()V

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v1}, Lxu/e;->readByte()B

    iget-object v1, p0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v1}, Lxu/e;->readByte()B

    invoke-virtual {p0}, Lr7/e;->Z()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_0

    :cond_4
    const-string p1, "Unterminated comment"

    invoke-virtual {p0, p1}, Lr7/c;->w(Ljava/lang/String;)Lr7/b;

    move-result-object p1

    throw p1

    :cond_5
    const/16 v1, 0x23

    if-ne v2, v1, :cond_6

    invoke-virtual {p0}, Lr7/e;->y()V

    invoke-virtual {p0}, Lr7/e;->a0()V

    goto :goto_0

    :cond_6
    :goto_2
    return v2

    :cond_7
    :goto_3
    move v1, v3

    goto :goto_1

    :cond_8
    if-nez p1, :cond_9

    const/4 p1, -0x1

    return p1

    :cond_9
    new-instance p1, Ljava/io/EOFException;

    const-string v0, "End of input"

    invoke-direct {p1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final L(Lxu/h;)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lr7/e;->h:Lxu/g;

    invoke-interface {v1, p1}, Lxu/g;->h0(Lxu/h;)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long v3, v1, v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v3, v1, v2}, Lxu/e;->j(J)B

    move-result v3

    const/16 v4, 0x5c

    if-ne v3, v4, :cond_1

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :cond_0
    iget-object v3, p0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v3, v1, v2}, Lxu/e;->G1(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v1}, Lxu/e;->readByte()B

    invoke-virtual {p0}, Lr7/e;->X()C

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    iget-object p1, p0, Lr7/e;->i:Lxu/e;

    invoke-virtual {p1, v1, v2}, Lxu/e;->G1(J)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v0}, Lxu/e;->readByte()B

    return-object p1

    :cond_2
    iget-object p1, p0, Lr7/e;->i:Lxu/e;

    invoke-virtual {p1, v1, v2}, Lxu/e;->G1(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lr7/e;->i:Lxu/e;

    invoke-virtual {p1}, Lxu/e;->readByte()B

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    const-string p1, "Unterminated string"

    invoke-virtual {p0, p1}, Lr7/c;->w(Ljava/lang/String;)Lr7/b;

    move-result-object p1

    throw p1
.end method

.method public final M()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lr7/e;->h:Lxu/g;

    sget-object v1, Lr7/e;->p:Lxu/h;

    invoke-interface {v0, v1}, Lxu/g;->h0(Lxu/h;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v2, v0, v1}, Lxu/e;->G1(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v0}, Lxu/e;->R2()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final P()I
    .locals 10

    iget-object v0, p0, Lr7/e;->i:Lxu/e;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lxu/e;->j(J)B

    move-result v0

    const/16 v1, 0x74

    const/4 v2, 0x0

    if-eq v0, v1, :cond_5

    const/16 v1, 0x54

    if-ne v0, v1, :cond_0

    goto :goto_2

    :cond_0
    const/16 v1, 0x66

    if-eq v0, v1, :cond_4

    const/16 v1, 0x46

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    const/16 v1, 0x6e

    if-eq v0, v1, :cond_3

    const/16 v1, 0x4e

    if-ne v0, v1, :cond_2

    goto :goto_0

    :cond_2
    return v2

    :cond_3
    :goto_0
    const-string v0, "null"

    const-string v1, "NULL"

    const/4 v3, 0x7

    goto :goto_3

    :cond_4
    :goto_1
    const-string v0, "false"

    const-string v1, "FALSE"

    const/4 v3, 0x6

    goto :goto_3

    :cond_5
    :goto_2
    const-string v0, "true"

    const-string v1, "TRUE"

    const/4 v3, 0x5

    :goto_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x1

    :goto_4
    if-ge v5, v4, :cond_8

    iget-object v6, p0, Lr7/e;->h:Lxu/g;

    add-int/lit8 v7, v5, 0x1

    int-to-long v8, v7

    invoke-interface {v6, v8, v9}, Lxu/g;->request(J)Z

    move-result v6

    if-nez v6, :cond_6

    return v2

    :cond_6
    iget-object v6, p0, Lr7/e;->i:Lxu/e;

    int-to-long v8, v5

    invoke-virtual {v6, v8, v9}, Lxu/e;->j(J)B

    move-result v6

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-eq v6, v8, :cond_7

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-eq v6, v5, :cond_7

    return v2

    :cond_7
    move v5, v7

    goto :goto_4

    :cond_8
    iget-object v0, p0, Lr7/e;->h:Lxu/g;

    add-int/lit8 v1, v4, 0x1

    int-to-long v5, v1

    invoke-interface {v0, v5, v6}, Lxu/g;->request(J)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lr7/e;->i:Lxu/e;

    int-to-long v5, v4

    invoke-virtual {v0, v5, v6}, Lxu/e;->j(J)B

    move-result v0

    invoke-virtual {p0, v0}, Lr7/e;->H(I)Z

    move-result v0

    if-eqz v0, :cond_9

    return v2

    :cond_9
    iget-object v0, p0, Lr7/e;->i:Lxu/e;

    int-to-long v1, v4

    invoke-virtual {v0, v1, v2}, Lxu/e;->skip(J)V

    iput v3, p0, Lr7/e;->j:I

    return v3
.end method

.method public final U()I
    .locals 19

    move-object/from16 v0, p0

    const/4 v4, 0x1

    move v7, v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    :goto_0
    iget-object v11, v0, Lr7/e;->h:Lxu/g;

    add-int/lit8 v12, v5, 0x1

    int-to-long v13, v12

    invoke-interface {v11, v13, v14}, Lxu/g;->request(J)Z

    move-result v11

    const/4 v14, 0x4

    const/4 v15, 0x2

    if-nez v11, :cond_0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    goto/16 :goto_5

    :cond_0
    iget-object v11, v0, Lr7/e;->i:Lxu/e;

    const-wide/16 v16, 0x0

    int-to-long v1, v5

    invoke-virtual {v11, v1, v2}, Lxu/e;->j(J)B

    move-result v1

    const/16 v2, 0x2b

    const/4 v11, 0x6

    const/16 v18, 0x0

    const/4 v3, 0x5

    if-eq v1, v2, :cond_1a

    const/16 v2, 0x45

    if-eq v1, v2, :cond_17

    const/16 v2, 0x65

    if-eq v1, v2, :cond_17

    const/16 v2, 0x2d

    if-eq v1, v2, :cond_14

    const/16 v2, 0x2e

    const/4 v13, 0x3

    if-eq v1, v2, :cond_12

    const/16 v2, 0x30

    if-lt v1, v2, :cond_a

    const/16 v2, 0x39

    if-le v1, v2, :cond_1

    goto :goto_4

    :cond_1
    if-eq v6, v4, :cond_9

    if-nez v6, :cond_2

    goto :goto_3

    :cond_2
    if-ne v6, v15, :cond_6

    cmp-long v2, v8, v16

    if-nez v2, :cond_3

    return v18

    :cond_3
    const-wide/16 v2, 0xa

    mul-long/2addr v2, v8

    add-int/lit8 v1, v1, -0x30

    int-to-long v13, v1

    sub-long/2addr v2, v13

    const-wide v13, -0xcccccccccccccccL

    cmp-long v1, v8, v13

    if-gtz v1, :cond_5

    if-nez v1, :cond_4

    cmp-long v1, v2, v8

    if-gez v1, :cond_4

    goto :goto_1

    :cond_4
    move/from16 v1, v18

    goto :goto_2

    :cond_5
    :goto_1
    move v1, v4

    :goto_2
    and-int/2addr v7, v1

    move-wide v8, v2

    goto/16 :goto_a

    :cond_6
    if-ne v6, v13, :cond_7

    move v6, v14

    goto/16 :goto_a

    :cond_7
    if-eq v6, v3, :cond_8

    if-ne v6, v11, :cond_1b

    :cond_8
    const/4 v6, 0x7

    goto/16 :goto_a

    :cond_9
    :goto_3
    add-int/lit8 v1, v1, -0x30

    neg-int v1, v1

    int-to-long v8, v1

    move v6, v15

    goto/16 :goto_a

    :cond_a
    :goto_4
    invoke-virtual {v0, v1}, Lr7/e;->H(I)Z

    move-result v1

    if-nez v1, :cond_11

    :goto_5
    if-ne v6, v15, :cond_e

    if-eqz v7, :cond_e

    const-wide/high16 v1, -0x8000000000000000L

    cmp-long v1, v8, v1

    if-nez v1, :cond_b

    if-eqz v10, :cond_e

    :cond_b
    cmp-long v1, v8, v16

    if-nez v1, :cond_c

    if-nez v10, :cond_e

    :cond_c
    if-eqz v10, :cond_d

    goto :goto_6

    :cond_d
    neg-long v8, v8

    :goto_6
    iput-wide v8, v0, Lr7/e;->k:J

    iget-object v1, v0, Lr7/e;->i:Lxu/e;

    int-to-long v2, v5

    invoke-virtual {v1, v2, v3}, Lxu/e;->skip(J)V

    const/16 v1, 0x10

    iput v1, v0, Lr7/e;->j:I

    return v1

    :cond_e
    if-eq v6, v15, :cond_10

    if-eq v6, v14, :cond_10

    const/4 v1, 0x7

    if-ne v6, v1, :cond_f

    goto :goto_7

    :cond_f
    return v18

    :cond_10
    :goto_7
    iput v5, v0, Lr7/e;->l:I

    const/16 v1, 0x11

    iput v1, v0, Lr7/e;->j:I

    return v1

    :cond_11
    return v18

    :cond_12
    if-ne v6, v15, :cond_13

    move v6, v13

    goto :goto_a

    :cond_13
    return v18

    :cond_14
    if-nez v6, :cond_15

    move v6, v4

    move v10, v6

    goto :goto_a

    :cond_15
    if-ne v6, v3, :cond_16

    :goto_8
    move v6, v11

    goto :goto_a

    :cond_16
    return v18

    :cond_17
    if-eq v6, v15, :cond_19

    if-ne v6, v14, :cond_18

    goto :goto_9

    :cond_18
    return v18

    :cond_19
    :goto_9
    move v6, v3

    goto :goto_a

    :cond_1a
    if-ne v6, v3, :cond_1c

    goto :goto_8

    :cond_1b
    :goto_a
    move v5, v12

    goto/16 :goto_0

    :cond_1c
    return v18
.end method

.method public final X()C
    .locals 8

    iget-object v0, p0, Lr7/e;->h:Lxu/g;

    const-wide/16 v1, 0x1

    invoke-interface {v0, v1, v2}, Lxu/g;->request(J)Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v0}, Lxu/e;->readByte()B

    move-result v0

    const/16 v1, 0xa

    if-eq v0, v1, :cond_c

    const/16 v2, 0x22

    if-eq v0, v2, :cond_c

    const/16 v2, 0x27

    if-eq v0, v2, :cond_c

    const/16 v2, 0x2f

    if-eq v0, v2, :cond_c

    const/16 v2, 0x5c

    if-eq v0, v2, :cond_c

    const/16 v2, 0x62

    if-eq v0, v2, :cond_b

    const/16 v2, 0x66

    if-eq v0, v2, :cond_a

    const/16 v3, 0x6e

    if-eq v0, v3, :cond_9

    const/16 v1, 0x72

    if-eq v0, v1, :cond_8

    const/16 v1, 0x74

    if-eq v0, v1, :cond_7

    const/16 v1, 0x75

    if-eq v0, v1, :cond_1

    iget-boolean v1, p0, Lr7/c;->e:Z

    if-eqz v1, :cond_0

    int-to-char v0, v0

    return v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid escape sequence: \\"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    int-to-char v0, v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lr7/c;->w(Ljava/lang/String;)Lr7/b;

    move-result-object v0

    throw v0

    :cond_1
    iget-object v0, p0, Lr7/e;->h:Lxu/g;

    const-wide/16 v3, 0x4

    invoke-interface {v0, v3, v4}, Lxu/g;->request(J)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v5, 0x4

    if-ge v0, v5, :cond_5

    iget-object v5, p0, Lr7/e;->i:Lxu/e;

    int-to-long v6, v0

    invoke-virtual {v5, v6, v7}, Lxu/e;->j(J)B

    move-result v5

    shl-int/lit8 v1, v1, 0x4

    int-to-char v1, v1

    const/16 v6, 0x30

    if-lt v5, v6, :cond_2

    const/16 v6, 0x39

    if-gt v5, v6, :cond_2

    add-int/lit8 v5, v5, -0x30

    :goto_1
    add-int/2addr v1, v5

    int-to-char v1, v1

    goto :goto_2

    :cond_2
    const/16 v6, 0x61

    if-lt v5, v6, :cond_3

    if-gt v5, v2, :cond_3

    add-int/lit8 v5, v5, -0x57

    goto :goto_1

    :cond_3
    const/16 v6, 0x41

    if-lt v5, v6, :cond_4

    const/16 v6, 0x46

    if-gt v5, v6, :cond_4

    add-int/lit8 v5, v5, -0x37

    goto :goto_1

    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\\u"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v1, v3, v4}, Lxu/e;->G1(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lr7/c;->w(Ljava/lang/String;)Lr7/b;

    move-result-object v0

    throw v0

    :cond_5
    iget-object v0, p0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v0, v3, v4}, Lxu/e;->skip(J)V

    return v1

    :cond_6
    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unterminated escape sequence at path "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/c;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    const/16 v0, 0x9

    return v0

    :cond_8
    const/16 v0, 0xd

    return v0

    :cond_9
    return v1

    :cond_a
    const/16 v0, 0xc

    return v0

    :cond_b
    const/16 v0, 0x8

    return v0

    :cond_c
    int-to-char v0, v0

    return v0

    :cond_d
    const-string v0, "Unterminated escape sequence"

    invoke-virtual {p0, v0}, Lr7/c;->w(Ljava/lang/String;)Lr7/b;

    move-result-object v0

    throw v0
.end method

.method public final Y(Lxu/h;)V
    .locals 6

    :goto_0
    iget-object v0, p0, Lr7/e;->h:Lxu/g;

    invoke-interface {v0, p1}, Lxu/g;->h0(Lxu/h;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v2, v0, v1}, Lxu/e;->j(J)B

    move-result v2

    const/16 v3, 0x5c

    const-wide/16 v4, 0x1

    if-ne v2, v3, :cond_0

    iget-object v2, p0, Lr7/e;->i:Lxu/e;

    add-long/2addr v0, v4

    invoke-virtual {v2, v0, v1}, Lxu/e;->skip(J)V

    invoke-virtual {p0}, Lr7/e;->X()C

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lr7/e;->i:Lxu/e;

    add-long/2addr v0, v4

    invoke-virtual {p1, v0, v1}, Lxu/e;->skip(J)V

    return-void

    :cond_1
    const-string p1, "Unterminated string"

    invoke-virtual {p0, p1}, Lr7/c;->w(Ljava/lang/String;)Lr7/b;

    move-result-object p1

    throw p1
.end method

.method public final Z()Z
    .locals 7

    iget-object v0, p0, Lr7/e;->h:Lxu/g;

    sget-object v1, Lr7/e;->r:Lxu/h;

    invoke-interface {v0, v1}, Lxu/g;->V(Lxu/h;)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v4, p0, Lr7/e;->i:Lxu/e;

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Lxu/h;->I()I

    move-result v1

    int-to-long v5, v1

    add-long/2addr v2, v5

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lxu/e;->size()J

    move-result-wide v2

    :goto_1
    invoke-virtual {v4, v2, v3}, Lxu/e;->skip(J)V

    return v0
.end method

.method public final a0()V
    .locals 5

    iget-object v0, p0, Lr7/e;->h:Lxu/g;

    sget-object v1, Lr7/e;->q:Lxu/h;

    invoke-interface {v0, v1}, Lxu/g;->h0(Lxu/h;)J

    move-result-wide v0

    iget-object v2, p0, Lr7/e;->i:Lxu/e;

    const-wide/16 v3, -0x1

    cmp-long v3, v0, v3

    if-eqz v3, :cond_0

    const-wide/16 v3, 0x1

    add-long/2addr v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lxu/e;->size()J

    move-result-wide v0

    :goto_0
    invoke-virtual {v2, v0, v1}, Lxu/e;->skip(J)V

    return-void
.end method

.method public b()V
    .locals 3

    iget v0, p0, Lr7/e;->j:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lr7/e;->B()I

    move-result v0

    :cond_0
    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lr7/c;->q(I)V

    iget-object v1, p0, Lr7/c;->d:[I

    iget v2, p0, Lr7/c;->a:I

    sub-int/2addr v2, v0

    const/4 v0, 0x0

    aput v0, v1, v2

    iput v0, p0, Lr7/e;->j:I

    return-void

    :cond_1
    new-instance v0, Lr7/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected BEGIN_ARRAY but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/e;->o()Lr7/c$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " at path "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/c;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lr7/a;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b0()V
    .locals 5

    iget-object v0, p0, Lr7/e;->h:Lxu/g;

    sget-object v1, Lr7/e;->p:Lxu/h;

    invoke-interface {v0, v1}, Lxu/g;->h0(Lxu/h;)J

    move-result-wide v0

    iget-object v2, p0, Lr7/e;->i:Lxu/e;

    const-wide/16 v3, -0x1

    cmp-long v3, v0, v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lxu/e;->size()J

    move-result-wide v0

    :goto_0
    invoke-virtual {v2, v0, v1}, Lxu/e;->skip(J)V

    return-void
.end method

.method public c()V
    .locals 3

    iget v0, p0, Lr7/e;->j:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lr7/e;->B()I

    move-result v0

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lr7/c;->q(I)V

    const/4 v0, 0x0

    iput v0, p0, Lr7/e;->j:I

    return-void

    :cond_1
    new-instance v0, Lr7/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected BEGIN_OBJECT but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/e;->o()Lr7/c$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " at path "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/c;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lr7/a;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public close()V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lr7/e;->j:I

    iget-object v1, p0, Lr7/c;->b:[I

    const/16 v2, 0x8

    aput v2, v1, v0

    const/4 v0, 0x1

    iput v0, p0, Lr7/c;->a:I

    iget-object v0, p0, Lr7/e;->i:Lxu/e;

    invoke-virtual {v0}, Lxu/e;->a()V

    iget-object v0, p0, Lr7/e;->h:Lxu/g;

    invoke-interface {v0}, Lxu/r0;->close()V

    return-void
.end method

.method public d()V
    .locals 3

    iget v0, p0, Lr7/e;->j:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lr7/e;->B()I

    move-result v0

    :cond_0
    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    iget v0, p0, Lr7/c;->a:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lr7/c;->a:I

    iget-object v1, p0, Lr7/c;->d:[I

    add-int/lit8 v0, v0, -0x2

    aget v2, v1, v0

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v0

    const/4 v0, 0x0

    iput v0, p0, Lr7/e;->j:I

    return-void

    :cond_1
    new-instance v0, Lr7/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected END_ARRAY but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/e;->o()Lr7/c$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " at path "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/c;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lr7/a;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e()V
    .locals 5

    iget v0, p0, Lr7/e;->j:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lr7/e;->B()I

    move-result v0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget v0, p0, Lr7/c;->a:I

    add-int/lit8 v2, v0, -0x1

    iput v2, p0, Lr7/c;->a:I

    iget-object v3, p0, Lr7/c;->c:[Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v4, v3, v2

    iget-object v2, p0, Lr7/c;->d:[I

    sub-int/2addr v0, v1

    aget v1, v2, v0

    add-int/lit8 v1, v1, 0x1

    aput v1, v2, v0

    const/4 v0, 0x0

    iput v0, p0, Lr7/e;->j:I

    return-void

    :cond_1
    new-instance v0, Lr7/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected END_OBJECT but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/e;->o()Lr7/c$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " at path "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/c;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lr7/a;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public f()Z
    .locals 2

    iget v0, p0, Lr7/e;->j:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lr7/e;->B()I

    move-result v0

    :cond_0
    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/16 v1, 0x12

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public g()Z
    .locals 5

    iget v0, p0, Lr7/e;->j:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lr7/e;->B()I

    move-result v0

    :cond_0
    const/4 v1, 0x5

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_1

    iput v2, p0, Lr7/e;->j:I

    iget-object v0, p0, Lr7/c;->d:[I

    iget v1, p0, Lr7/c;->a:I

    sub-int/2addr v1, v3

    aget v2, v0, v1

    add-int/2addr v2, v3

    aput v2, v0, v1

    return v3

    :cond_1
    const/4 v1, 0x6

    if-ne v0, v1, :cond_2

    iput v2, p0, Lr7/e;->j:I

    iget-object v0, p0, Lr7/c;->d:[I

    iget v1, p0, Lr7/c;->a:I

    sub-int/2addr v1, v3

    aget v4, v0, v1

    add-int/2addr v4, v3

    aput v4, v0, v1

    return v2

    :cond_2
    new-instance v0, Lr7/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected a boolean but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/e;->o()Lr7/c$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " at path "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/c;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lr7/a;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public h()D
    .locals 8

    iget v0, p0, Lr7/e;->j:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lr7/e;->B()I

    move-result v0

    :cond_0
    const/16 v1, 0x10

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iput v2, p0, Lr7/e;->j:I

    iget-object v0, p0, Lr7/c;->d:[I

    iget v1, p0, Lr7/c;->a:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    iget-wide v0, p0, Lr7/e;->k:J

    long-to-double v0, v0

    return-wide v0

    :cond_1
    const/16 v1, 0x11

    const-string v3, "Expected a double but was "

    const/16 v4, 0xb

    const-string v5, " at path "

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lr7/e;->i:Lxu/e;

    iget v1, p0, Lr7/e;->l:I

    int-to-long v6, v1

    invoke-virtual {v0, v6, v7}, Lxu/e;->G1(J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lr7/e;->m:Ljava/lang/String;

    goto :goto_0

    :cond_2
    const/16 v1, 0x9

    if-ne v0, v1, :cond_3

    sget-object v0, Lr7/e;->o:Lxu/h;

    invoke-virtual {p0, v0}, Lr7/e;->L(Lxu/h;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lr7/e;->m:Ljava/lang/String;

    goto :goto_0

    :cond_3
    const/16 v1, 0x8

    if-ne v0, v1, :cond_4

    sget-object v0, Lr7/e;->n:Lxu/h;

    invoke-virtual {p0, v0}, Lr7/e;->L(Lxu/h;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lr7/e;->m:Ljava/lang/String;

    goto :goto_0

    :cond_4
    const/16 v1, 0xa

    if-ne v0, v1, :cond_5

    invoke-virtual {p0}, Lr7/e;->M()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lr7/e;->m:Ljava/lang/String;

    goto :goto_0

    :cond_5
    if-ne v0, v4, :cond_8

    :goto_0
    iput v4, p0, Lr7/e;->j:I

    :try_start_0
    iget-object v0, p0, Lr7/e;->m:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    iget-boolean v3, p0, Lr7/c;->e:Z

    if-nez v3, :cond_7

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v3

    if-nez v3, :cond_6

    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_1

    :cond_6
    new-instance v2, Lr7/b;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "JSON forbids NaN and infinities: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/c;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lr7/b;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_7
    :goto_1
    const/4 v3, 0x0

    iput-object v3, p0, Lr7/e;->m:Ljava/lang/String;

    iput v2, p0, Lr7/e;->j:I

    iget-object v2, p0, Lr7/c;->d:[I

    iget v3, p0, Lr7/c;->a:I

    add-int/lit8 v3, v3, -0x1

    aget v4, v2, v3

    add-int/lit8 v4, v4, 0x1

    aput v4, v2, v3

    return-wide v0

    :catch_0
    new-instance v0, Lr7/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lr7/e;->m:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/c;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lr7/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Lr7/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/e;->o()Lr7/c$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/c;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lr7/a;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public j()I
    .locals 8

    iget v0, p0, Lr7/e;->j:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lr7/e;->B()I

    move-result v0

    :cond_0
    const/16 v1, 0x10

    const/4 v2, 0x0

    const-string v3, " at path "

    const-string v4, "Expected an int but was "

    if-ne v0, v1, :cond_2

    iget-wide v0, p0, Lr7/e;->k:J

    long-to-int v5, v0

    int-to-long v6, v5

    cmp-long v0, v0, v6

    if-nez v0, :cond_1

    iput v2, p0, Lr7/e;->j:I

    iget-object v0, p0, Lr7/c;->d:[I

    iget v1, p0, Lr7/c;->a:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    return v5

    :cond_1
    new-instance v0, Lr7/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, p0, Lr7/e;->k:J

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/c;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lr7/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const/16 v1, 0x11

    const/16 v5, 0xb

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lr7/e;->i:Lxu/e;

    iget v1, p0, Lr7/e;->l:I

    int-to-long v6, v1

    invoke-virtual {v0, v6, v7}, Lxu/e;->G1(J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lr7/e;->m:Ljava/lang/String;

    goto :goto_2

    :cond_3
    const/16 v1, 0x9

    if-eq v0, v1, :cond_6

    const/16 v6, 0x8

    if-ne v0, v6, :cond_4

    goto :goto_0

    :cond_4
    if-ne v0, v5, :cond_5

    goto :goto_2

    :cond_5
    new-instance v0, Lr7/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/e;->o()Lr7/c$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/c;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lr7/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    :goto_0
    if-ne v0, v1, :cond_7

    sget-object v0, Lr7/e;->o:Lxu/h;

    invoke-virtual {p0, v0}, Lr7/e;->L(Lxu/h;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_7
    sget-object v0, Lr7/e;->n:Lxu/h;

    invoke-virtual {p0, v0}, Lr7/e;->L(Lxu/h;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lr7/e;->m:Ljava/lang/String;

    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v2, p0, Lr7/e;->j:I

    iget-object v1, p0, Lr7/c;->d:[I

    iget v6, p0, Lr7/c;->a:I

    add-int/lit8 v6, v6, -0x1

    aget v7, v1, v6

    add-int/lit8 v7, v7, 0x1

    aput v7, v1, v6
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    :goto_2
    iput v5, p0, Lr7/e;->j:I

    :try_start_1
    iget-object v0, p0, Lr7/e;->m:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    double-to-int v5, v0

    int-to-double v6, v5

    cmpl-double v0, v6, v0

    if-nez v0, :cond_8

    const/4 v0, 0x0

    iput-object v0, p0, Lr7/e;->m:Ljava/lang/String;

    iput v2, p0, Lr7/e;->j:I

    iget-object v0, p0, Lr7/c;->d:[I

    iget v1, p0, Lr7/c;->a:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    return v5

    :cond_8
    new-instance v0, Lr7/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lr7/e;->m:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/c;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lr7/a;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_1
    new-instance v0, Lr7/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lr7/e;->m:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/c;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lr7/a;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public l()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lr7/e;->j:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lr7/e;->B()I

    move-result v0

    :cond_0
    const/16 v1, 0xe

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lr7/e;->M()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/16 v1, 0xd

    if-ne v0, v1, :cond_2

    sget-object v0, Lr7/e;->o:Lxu/h;

    invoke-virtual {p0, v0}, Lr7/e;->L(Lxu/h;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/16 v1, 0xc

    if-ne v0, v1, :cond_3

    sget-object v0, Lr7/e;->n:Lxu/h;

    invoke-virtual {p0, v0}, Lr7/e;->L(Lxu/h;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    const/16 v1, 0xf

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lr7/e;->m:Ljava/lang/String;

    :goto_0
    const/4 v1, 0x0

    iput v1, p0, Lr7/e;->j:I

    iget-object v1, p0, Lr7/c;->c:[Ljava/lang/String;

    iget v2, p0, Lr7/c;->a:I

    add-int/lit8 v2, v2, -0x1

    aput-object v0, v1, v2

    return-object v0

    :cond_4
    new-instance v0, Lr7/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected a name but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/e;->o()Lr7/c$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " at path "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/c;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lr7/a;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public m()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lr7/e;->j:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lr7/e;->B()I

    move-result v0

    :cond_0
    const/16 v1, 0xa

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lr7/e;->M()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/16 v1, 0x9

    if-ne v0, v1, :cond_2

    sget-object v0, Lr7/e;->o:Lxu/h;

    invoke-virtual {p0, v0}, Lr7/e;->L(Lxu/h;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    sget-object v0, Lr7/e;->n:Lxu/h;

    invoke-virtual {p0, v0}, Lr7/e;->L(Lxu/h;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    const/16 v1, 0xb

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lr7/e;->m:Ljava/lang/String;

    const/4 v1, 0x0

    iput-object v1, p0, Lr7/e;->m:Ljava/lang/String;

    goto :goto_0

    :cond_4
    const/16 v1, 0x10

    if-ne v0, v1, :cond_5

    iget-wide v0, p0, Lr7/e;->k:J

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_5
    const/16 v1, 0x11

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lr7/e;->i:Lxu/e;

    iget v1, p0, Lr7/e;->l:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Lxu/e;->G1(J)Ljava/lang/String;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    iput v1, p0, Lr7/e;->j:I

    iget-object v1, p0, Lr7/c;->d:[I

    iget v2, p0, Lr7/c;->a:I

    add-int/lit8 v2, v2, -0x1

    aget v3, v1, v2

    add-int/lit8 v3, v3, 0x1

    aput v3, v1, v2

    return-object v0

    :cond_6
    new-instance v0, Lr7/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected a string but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/e;->o()Lr7/c$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " at path "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/c;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lr7/a;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public o()Lr7/c$b;
    .locals 1

    iget v0, p0, Lr7/e;->j:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lr7/e;->B()I

    move-result v0

    :cond_0
    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :pswitch_0
    sget-object v0, Lr7/c$b;->j:Lr7/c$b;

    return-object v0

    :pswitch_1
    sget-object v0, Lr7/c$b;->g:Lr7/c$b;

    return-object v0

    :pswitch_2
    sget-object v0, Lr7/c$b;->e:Lr7/c$b;

    return-object v0

    :pswitch_3
    sget-object v0, Lr7/c$b;->f:Lr7/c$b;

    return-object v0

    :pswitch_4
    sget-object v0, Lr7/c$b;->i:Lr7/c$b;

    return-object v0

    :pswitch_5
    sget-object v0, Lr7/c$b;->h:Lr7/c$b;

    return-object v0

    :pswitch_6
    sget-object v0, Lr7/c$b;->b:Lr7/c$b;

    return-object v0

    :pswitch_7
    sget-object v0, Lr7/c$b;->a:Lr7/c$b;

    return-object v0

    :pswitch_8
    sget-object v0, Lr7/c$b;->d:Lr7/c$b;

    return-object v0

    :pswitch_9
    sget-object v0, Lr7/c$b;->c:Lr7/c$b;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public r(Lr7/c$a;)I
    .locals 4

    iget v0, p0, Lr7/e;->j:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lr7/e;->B()I

    move-result v0

    :cond_0
    const/16 v1, 0xc

    const/4 v2, -0x1

    if-lt v0, v1, :cond_5

    const/16 v1, 0xf

    if-le v0, v1, :cond_1

    goto :goto_0

    :cond_1
    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lr7/e;->m:Ljava/lang/String;

    invoke-virtual {p0, v0, p1}, Lr7/e;->F(Ljava/lang/String;Lr7/c$a;)I

    move-result p1

    return p1

    :cond_2
    iget-object v0, p0, Lr7/e;->h:Lxu/g;

    iget-object v3, p1, Lr7/c$a;->b:Lxu/f0;

    invoke-interface {v0, v3}, Lxu/g;->l3(Lxu/f0;)I

    move-result v0

    if-eq v0, v2, :cond_3

    const/4 v1, 0x0

    iput v1, p0, Lr7/e;->j:I

    iget-object v1, p0, Lr7/c;->c:[Ljava/lang/String;

    iget v2, p0, Lr7/c;->a:I

    add-int/lit8 v2, v2, -0x1

    iget-object p1, p1, Lr7/c$a;->a:[Ljava/lang/String;

    aget-object p1, p1, v0

    aput-object p1, v1, v2

    return v0

    :cond_3
    iget-object v0, p0, Lr7/c;->c:[Ljava/lang/String;

    iget v3, p0, Lr7/c;->a:I

    add-int/lit8 v3, v3, -0x1

    aget-object v0, v0, v3

    invoke-virtual {p0}, Lr7/e;->l()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3, p1}, Lr7/e;->F(Ljava/lang/String;Lr7/c$a;)I

    move-result p1

    if-ne p1, v2, :cond_4

    iput v1, p0, Lr7/e;->j:I

    iput-object v3, p0, Lr7/e;->m:Ljava/lang/String;

    iget-object v1, p0, Lr7/c;->c:[Ljava/lang/String;

    iget v2, p0, Lr7/c;->a:I

    add-int/lit8 v2, v2, -0x1

    aput-object v0, v1, v2

    :cond_4
    return p1

    :cond_5
    :goto_0
    return v2
.end method

.method public s()V
    .locals 3

    iget-boolean v0, p0, Lr7/c;->f:Z

    if-nez v0, :cond_5

    iget v0, p0, Lr7/e;->j:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lr7/e;->B()I

    move-result v0

    :cond_0
    const/16 v1, 0xe

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lr7/e;->b0()V

    goto :goto_0

    :cond_1
    const/16 v1, 0xd

    if-ne v0, v1, :cond_2

    sget-object v0, Lr7/e;->o:Lxu/h;

    invoke-virtual {p0, v0}, Lr7/e;->Y(Lxu/h;)V

    goto :goto_0

    :cond_2
    const/16 v1, 0xc

    if-ne v0, v1, :cond_3

    sget-object v0, Lr7/e;->n:Lxu/h;

    invoke-virtual {p0, v0}, Lr7/e;->Y(Lxu/h;)V

    goto :goto_0

    :cond_3
    const/16 v1, 0xf

    if-ne v0, v1, :cond_4

    :goto_0
    const/4 v0, 0x0

    iput v0, p0, Lr7/e;->j:I

    iget-object v0, p0, Lr7/c;->c:[Ljava/lang/String;

    iget v1, p0, Lr7/c;->a:I

    add-int/lit8 v1, v1, -0x1

    const-string v2, "null"

    aput-object v2, v0, v1

    return-void

    :cond_4
    new-instance v0, Lr7/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected a name but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/e;->o()Lr7/c$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " at path "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/c;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lr7/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Lr7/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot skip unexpected "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/e;->o()Lr7/c$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " at "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/c;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lr7/a;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "JsonReader("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr7/e;->h:Lxu/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()V
    .locals 7

    iget-boolean v0, p0, Lr7/c;->f:Z

    if-nez v0, :cond_10

    const/4 v0, 0x0

    move v1, v0

    :cond_0
    iget v2, p0, Lr7/e;->j:I

    if-nez v2, :cond_1

    invoke-virtual {p0}, Lr7/e;->B()I

    move-result v2

    :cond_1
    const/4 v3, 0x3

    const/4 v4, 0x1

    if-ne v2, v3, :cond_2

    invoke-virtual {p0, v4}, Lr7/c;->q(I)V

    :goto_0
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_4

    :cond_2
    if-ne v2, v4, :cond_3

    invoke-virtual {p0, v3}, Lr7/c;->q(I)V

    goto :goto_0

    :cond_3
    const/4 v3, 0x4

    const-string v5, " at path "

    const-string v6, "Expected a value but was "

    if-ne v2, v3, :cond_5

    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_4

    iget v2, p0, Lr7/c;->a:I

    sub-int/2addr v2, v4

    iput v2, p0, Lr7/c;->a:I

    goto/16 :goto_4

    :cond_4
    new-instance v0, Lr7/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/e;->o()Lr7/c$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/c;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lr7/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    const/4 v3, 0x2

    if-ne v2, v3, :cond_7

    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_6

    iget v2, p0, Lr7/c;->a:I

    sub-int/2addr v2, v4

    iput v2, p0, Lr7/c;->a:I

    goto/16 :goto_4

    :cond_6
    new-instance v0, Lr7/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/e;->o()Lr7/c$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/c;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lr7/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    const/16 v3, 0xe

    if-eq v2, v3, :cond_f

    const/16 v3, 0xa

    if-ne v2, v3, :cond_8

    goto :goto_3

    :cond_8
    const/16 v3, 0x9

    if-eq v2, v3, :cond_e

    const/16 v3, 0xd

    if-ne v2, v3, :cond_9

    goto :goto_2

    :cond_9
    const/16 v3, 0x8

    if-eq v2, v3, :cond_d

    const/16 v3, 0xc

    if-ne v2, v3, :cond_a

    goto :goto_1

    :cond_a
    const/16 v3, 0x11

    if-ne v2, v3, :cond_b

    iget-object v2, p0, Lr7/e;->i:Lxu/e;

    iget v3, p0, Lr7/e;->l:I

    int-to-long v5, v3

    invoke-virtual {v2, v5, v6}, Lxu/e;->skip(J)V

    goto :goto_4

    :cond_b
    const/16 v3, 0x12

    if-eq v2, v3, :cond_c

    goto :goto_4

    :cond_c
    new-instance v0, Lr7/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/e;->o()Lr7/c$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/c;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lr7/a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    :goto_1
    sget-object v2, Lr7/e;->n:Lxu/h;

    invoke-virtual {p0, v2}, Lr7/e;->Y(Lxu/h;)V

    goto :goto_4

    :cond_e
    :goto_2
    sget-object v2, Lr7/e;->o:Lxu/h;

    invoke-virtual {p0, v2}, Lr7/e;->Y(Lxu/h;)V

    goto :goto_4

    :cond_f
    :goto_3
    invoke-virtual {p0}, Lr7/e;->b0()V

    :goto_4
    iput v0, p0, Lr7/e;->j:I

    if-nez v1, :cond_0

    iget-object v0, p0, Lr7/c;->d:[I

    iget v1, p0, Lr7/c;->a:I

    add-int/lit8 v2, v1, -0x1

    aget v3, v0, v2

    add-int/2addr v3, v4

    aput v3, v0, v2

    iget-object v0, p0, Lr7/c;->c:[Ljava/lang/String;

    sub-int/2addr v1, v4

    const-string v2, "null"

    aput-object v2, v0, v1

    return-void

    :cond_10
    new-instance v0, Lr7/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot skip unexpected "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/e;->o()Lr7/c$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " at "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr7/c;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lr7/a;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final y()V
    .locals 1

    iget-boolean v0, p0, Lr7/c;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "Use JsonReader.setLenient(true) to accept malformed JSON"

    invoke-virtual {p0, v0}, Lr7/c;->w(Ljava/lang/String;)Lr7/b;

    move-result-object v0

    throw v0
.end method
