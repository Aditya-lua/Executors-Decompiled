.class public final synthetic Lzo/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzo/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic a:[I

.field public static final synthetic b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;->values()[Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    const/4 v1, 0x1

    :try_start_0
    sget-object v2, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;->REQUIRE:Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v2, 0x2

    :try_start_1
    sget-object v3, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;->OPTIONAL:Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v2, v0, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v3, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;->NONE:Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    const/4 v4, 0x3

    aput v4, v0, v3
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    sput-object v0, Lzo/b$a;->a:[I

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;->values()[Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_3
    sget-object v3, Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;->PRECISE:Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v1, v0, v3
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v1, Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;->ROUGH:Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    sput-object v0, Lzo/b$a;->b:[I

    return-void
.end method
