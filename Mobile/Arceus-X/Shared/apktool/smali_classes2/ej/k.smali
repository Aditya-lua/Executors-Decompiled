.class public abstract Lej/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(Ljava/lang/String;)I
    .locals 10

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x28

    const/4 v2, 0x0

    const/4 v3, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "com.roblox.robloxmobile.robloxpremium2200onemonth"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto/16 :goto_0

    :cond_0
    move v3, v1

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "com.roblox.robloxmobile.premium11000subscribed"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v3, 0x27

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "com.roblox.robloxmobile.premium880subscribed"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v3, 0x26

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "com.roblox.robloxmobile.robloxpremium450onemonth"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v3, 0x25

    goto/16 :goto_0

    :sswitch_4
    const-string v0, "com.roblox.robloxmobile.robloxpremium1000onemonth"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v3, 0x24

    goto/16 :goto_0

    :sswitch_5
    const-string v0, "com.roblox.robloxmobile.premium1870subscribed"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v3, 0x23

    goto/16 :goto_0

    :sswitch_6
    const-string v0, "com.roblox.robloxmobile.premium80robux"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v3, 0x22

    goto/16 :goto_0

    :sswitch_7
    const-string v0, "com.roblox.client.robux800"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v3, 0x21

    goto/16 :goto_0

    :sswitch_8
    const-string v0, "com.roblox.client.robux400"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v3, 0x20

    goto/16 :goto_0

    :sswitch_9
    const-string v0, "com.roblox.robloxmobile.premium160robux"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v3, 0x1f

    goto/16 :goto_0

    :sswitch_a
    const-string v0, "com.roblox.robloxmobile.premium240robux"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v3, 0x1e

    goto/16 :goto_0

    :sswitch_b
    const-string v0, "com.roblox.robloxmobile.premium320robux"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v3, 0x1d

    goto/16 :goto_0

    :sswitch_c
    const-string v0, "com.roblox.robloxmobile.premium400robux"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v3, 0x1c

    goto/16 :goto_0

    :sswitch_d
    const-string v0, "com.roblox.client.robux35000bc"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v3, 0x1b

    goto/16 :goto_0

    :sswitch_e
    const-string v0, "com.roblox.robloxmobile.robloxpremium2200"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v3, 0x1a

    goto/16 :goto_0

    :sswitch_f
    const-string v0, "com.roblox.robloxmobile.robloxpremium1000"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v3, 0x19

    goto/16 :goto_0

    :sswitch_10
    const-string v0, "com.roblox.robloxmobile.robloxpremium450"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v3, 0x18

    goto/16 :goto_0

    :sswitch_11
    const-string v0, "com.roblox.client.robux90bc"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v3, 0x17

    goto/16 :goto_0

    :sswitch_12
    const-string v0, "com.roblox.client.robux4500"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v3, 0x16

    goto/16 :goto_0

    :sswitch_13
    const-string v0, "com.roblox.client.robux2000"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 v3, 0x15

    goto/16 :goto_0

    :sswitch_14
    const-string v0, "com.roblox.robloxmobile.premium4950subscribed"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v3, 0x14

    goto/16 :goto_0

    :sswitch_15
    const-string v0, "com.roblox.robloxmobile.premium10000robux"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_15

    goto/16 :goto_0

    :cond_15
    const/16 v3, 0x13

    goto/16 :goto_0

    :sswitch_16
    const-string v0, "com.roblox.client.robux450bc"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_16

    goto/16 :goto_0

    :cond_16
    const/16 v3, 0x12

    goto/16 :goto_0

    :sswitch_17
    const-string v0, "com.roblox.client.robux22500"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_17

    goto/16 :goto_0

    :cond_17
    const/16 v3, 0x11

    goto/16 :goto_0

    :sswitch_18
    const-string v0, "com.roblox.client.robux10000"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_18

    goto/16 :goto_0

    :cond_18
    const/16 v3, 0x10

    goto/16 :goto_0

    :sswitch_19
    const-string v0, "com.roblox.robloxmobile.premium1700robux"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_19

    goto/16 :goto_0

    :cond_19
    const/16 v3, 0xf

    goto/16 :goto_0

    :sswitch_1a
    const-string v0, "com.roblox.client.robux80"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1a

    goto/16 :goto_0

    :cond_1a
    const/16 v3, 0xe

    goto/16 :goto_0

    :sswitch_1b
    const-string v0, "com.roblox.client.robux40"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1b

    goto/16 :goto_0

    :cond_1b
    const/16 v3, 0xd

    goto/16 :goto_0

    :sswitch_1c
    const-string v0, "com.roblox.robloxmobile.premium175subscribed"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1c

    goto/16 :goto_0

    :cond_1c
    const/16 v3, 0xc

    goto/16 :goto_0

    :sswitch_1d
    const-string v0, "com.roblox.robloxmobile.premium800robux"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1d

    goto/16 :goto_0

    :cond_1d
    const/16 v3, 0xb

    goto/16 :goto_0

    :sswitch_1e
    const-string v0, "com.roblox.client.robux800promo"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1e

    goto/16 :goto_0

    :cond_1e
    const/16 v3, 0xa

    goto/16 :goto_0

    :sswitch_1f
    const-string v0, "com.roblox.robloxmobile.premium4500robux"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1f

    goto/16 :goto_0

    :cond_1f
    const/16 v3, 0x9

    goto/16 :goto_0

    :sswitch_20
    const-string v0, "com.roblox.robloxmobile.premium265subscribed"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_20

    goto/16 :goto_0

    :cond_20
    const/16 v3, 0x8

    goto/16 :goto_0

    :sswitch_21
    const-string v0, "com.roblox.robloxmobile.premium350subscribed"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_21

    goto :goto_0

    :cond_21
    const/4 v3, 0x7

    goto :goto_0

    :sswitch_22
    const-string v0, "com.roblox.client.robux15000bc"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_22

    goto :goto_0

    :cond_22
    const/4 v3, 0x6

    goto :goto_0

    :sswitch_23
    const-string v0, "com.roblox.client.robux6000bc"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_23

    goto :goto_0

    :cond_23
    const/4 v3, 0x5

    goto :goto_0

    :sswitch_24
    const-string v0, "com.roblox.robloxmobile.premium88subscribed"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_24

    goto :goto_0

    :cond_24
    const/4 v3, 0x4

    goto :goto_0

    :sswitch_25
    const-string v0, "com.roblox.client.robux2750bc"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_25

    goto :goto_0

    :cond_25
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_26
    const-string v0, "com.roblox.client.robux1000bc"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_26

    goto :goto_0

    :cond_26
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_27
    const-string v0, "com.roblox.robloxmobile.premium440subscribed2"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_27

    goto :goto_0

    :cond_27
    const/4 v3, 0x1

    goto :goto_0

    :sswitch_28
    const-string v0, "com.roblox.client.robux1000promobc"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_28

    goto :goto_0

    :cond_28
    move v3, v2

    :goto_0
    const/16 p0, 0x2710

    const/16 v0, 0x1194

    const/16 v4, 0x190

    const/16 v5, 0x50

    const/16 v6, 0x898

    const/16 v7, 0x320

    const/16 v8, 0x1c2

    const/16 v9, 0x3e8

    packed-switch v3, :pswitch_data_0

    return v2

    :pswitch_0
    return v6

    :pswitch_1
    const/16 p0, 0x2af8

    return p0

    :pswitch_2
    const/16 p0, 0x370

    return p0

    :pswitch_3
    return v8

    :pswitch_4
    return v9

    :pswitch_5
    const/16 p0, 0x74e

    return p0

    :pswitch_6
    return v5

    :pswitch_7
    return v7

    :pswitch_8
    return v4

    :pswitch_9
    const/16 p0, 0xa0

    return p0

    :pswitch_a
    const/16 p0, 0xf0

    return p0

    :pswitch_b
    const/16 p0, 0x140

    return p0

    :pswitch_c
    return v4

    :pswitch_d
    const p0, 0x88b8

    return p0

    :pswitch_e
    return v6

    :pswitch_f
    return v9

    :pswitch_10
    return v8

    :pswitch_11
    const/16 p0, 0x5a

    return p0

    :pswitch_12
    return v0

    :pswitch_13
    const/16 p0, 0x7d0

    return p0

    :pswitch_14
    const/16 p0, 0x1356

    :pswitch_15
    return p0

    :pswitch_16
    return v8

    :pswitch_17
    const/16 p0, 0x57e4

    :pswitch_18
    return p0

    :pswitch_19
    const/16 p0, 0x6a4

    return p0

    :pswitch_1a
    return v5

    :pswitch_1b
    return v1

    :pswitch_1c
    const/16 p0, 0xaf

    return p0

    :pswitch_1d
    return v7

    :pswitch_1e
    return v0

    :pswitch_1f
    const/16 p0, 0x109

    return p0

    :pswitch_20
    const/16 p0, 0x15e

    return p0

    :pswitch_21
    const/16 p0, 0x3a98

    return p0

    :pswitch_22
    const/16 p0, 0x1770

    return p0

    :pswitch_23
    const/16 p0, 0x58

    return p0

    :pswitch_24
    const/16 p0, 0xabe

    return p0

    :pswitch_25
    return v9

    :pswitch_26
    const/16 p0, 0x1b8

    return p0

    :pswitch_27
    return v9

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e8fa285 -> :sswitch_28
        -0x7b12a84c -> :sswitch_27
        -0x77640a8a -> :sswitch_26
        -0x754a4789 -> :sswitch_25
        -0x745af95a -> :sswitch_24
        -0x6edbcf6f -> :sswitch_23
        -0x6c95c709 -> :sswitch_22
        -0x66a8b0e4 -> :sswitch_21
        -0x65029441 -> :sswitch_20
        -0x5b295445 -> :sswitch_1f
        -0x53d5f513 -> :sswitch_1e
        -0x4f8490c4 -> :sswitch_1d
        -0x4bd3f563 -> :sswitch_1c
        -0x4946b9ee -> :sswitch_1b
        -0x4946b972 -> :sswitch_1a
        -0x4834478a -> :sswitch_19
        -0x3da863a5 -> :sswitch_18
        -0x3d9950a1 -> :sswitch_17
        -0x3d7bd106 -> :sswitch_16
        -0x3ca3a39d -> :sswitch_15
        -0x3c0bbb7a -> :sswitch_14
        -0x1280d92c -> :sswitch_13
        -0x127fdda9 -> :sswitch_12
        -0x127da452 -> :sswitch_11
        -0x10eb9fcd -> :sswitch_10
        -0xc89c985 -> :sswitch_f
        -0xc894da4 -> :sswitch_e
        -0x2c95087 -> :sswitch_d
        0x10f6bbc0 -> :sswitch_c
        0x12e20563 -> :sswitch_b
        0x14cd4f06 -> :sswitch_a
        0x16b898a9 -> :sswitch_9
        0x206f7c5e -> :sswitch_8
        0x206f8b62 -> :sswitch_7
        0x2a5a2c64 -> :sswitch_6
        0x3f3b2be6 -> :sswitch_5
        0x41df0f55 -> :sswitch_4
        0x4674010d -> :sswitch_3
        0x58fb5fbe -> :sswitch_2
        0x6584319e -> :sswitch_1
        0x735a1a36 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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


# virtual methods
.method public abstract c(Landroid/content/Context;)Ljava/lang/CharSequence;
.end method

.method public abstract d()Z
.end method

.method public abstract f()Z
.end method
