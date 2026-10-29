.class public final Lil/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;",
        "Lil/a;",
        "b",
        "(Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;)Lil/a;",
        "universalapp_googleProdRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a(Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;)Lil/a;
    .locals 0

    invoke-static {p0}, Lil/e;->b(Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;)Lil/a;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;)Lil/a;
    .locals 7

    new-instance v0, Lil/a;

    invoke-virtual {p0}, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;->getLight()Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;->getR()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-virtual {p0}, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;->getLight()Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;->getG()D

    move-result-wide v2

    double-to-float v2, v2

    invoke-virtual {p0}, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;->getLight()Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;->getB()D

    move-result-wide v3

    double-to-float v3, v3

    invoke-virtual {p0}, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;->getLight()Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;->getA()D

    move-result-wide v4

    double-to-float v4, v4

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->valueOf(FFFF)Landroid/graphics/Color;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Color;->toArgb()I

    move-result v1

    invoke-virtual {p0}, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;->getDark()Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;->getR()D

    move-result-wide v2

    double-to-float v2, v2

    invoke-virtual {p0}, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;->getDark()Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;->getG()D

    move-result-wide v3

    double-to-float v3, v3

    invoke-virtual {p0}, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;->getDark()Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;->getB()D

    move-result-wide v4

    double-to-float v4, v4

    invoke-virtual {p0}, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;->getDark()Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;

    move-result-object p0

    invoke-virtual {p0}, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;->getA()D

    move-result-wide v5

    double-to-float p0, v5

    invoke-static {v2, v3, v4, p0}, Landroid/graphics/Color;->valueOf(FFFF)Landroid/graphics/Color;

    move-result-object p0

    invoke-virtual {p0}, Landroid/graphics/Color;->toArgb()I

    move-result p0

    invoke-direct {v0, v1, p0}, Lil/a;-><init>(II)V

    return-object v0
.end method
