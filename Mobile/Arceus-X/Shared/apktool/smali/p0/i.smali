.class public Lp0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp0/i$b;,
        Lp0/i$c;
    }
.end annotation


# static fields
.field public static final c:[Ljava/lang/String;

.field public static final d:[Lp0/k;

.field public static final e:[Lp0/k;

.field public static final f:[Lp0/k;

.field public static final g:[Lp0/k;

.field public static final h:[Lp0/k;

.field public static final i:[[Lp0/k;

.field public static final j:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final k:Ljava/lang/String;


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lp0/h;",
            ">;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/nio/ByteOrder;


# direct methods
.method static constructor <clinit>()V
    .locals 58

    const-string v12, "DOUBLE"

    const-string v13, "IFD"

    const-string v0, ""

    const-string v1, "BYTE"

    const-string v2, "STRING"

    const-string v3, "USHORT"

    const-string v4, "ULONG"

    const-string v5, "URATIONAL"

    const-string v6, "SBYTE"

    const-string v7, "UNDEFINED"

    const-string v8, "SSHORT"

    const-string v9, "SLONG"

    const-string v10, "SRATIONAL"

    const-string v11, "SINGLE"

    filled-new-array/range {v0 .. v13}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lp0/i;->c:[Ljava/lang/String;

    new-instance v1, Lp0/k;

    const-string v0, "ImageWidth"

    const/16 v2, 0x100

    const/4 v15, 0x3

    const/4 v3, 0x4

    invoke-direct {v1, v0, v2, v15, v3}, Lp0/k;-><init>(Ljava/lang/String;III)V

    new-instance v2, Lp0/k;

    const-string v0, "ImageLength"

    const/16 v4, 0x101

    invoke-direct {v2, v0, v4, v15, v3}, Lp0/k;-><init>(Ljava/lang/String;III)V

    new-instance v0, Lp0/k;

    const-string v4, "Make"

    const/16 v5, 0x10f

    const/4 v6, 0x2

    invoke-direct {v0, v4, v5, v6}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v4, Lp0/k;

    const-string v5, "Model"

    const/16 v7, 0x110

    invoke-direct {v4, v5, v7, v6}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lp0/k;

    const-string v7, "Orientation"

    const/16 v8, 0x112

    invoke-direct {v5, v7, v8, v15}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v7, Lp0/k;

    const-string v8, "XResolution"

    const/16 v9, 0x11a

    const/4 v10, 0x5

    invoke-direct {v7, v8, v9, v10}, Lp0/k;-><init>(Ljava/lang/String;II)V

    move-object v8, v7

    new-instance v7, Lp0/k;

    const-string v9, "YResolution"

    const/16 v11, 0x11b

    invoke-direct {v7, v9, v11, v10}, Lp0/k;-><init>(Ljava/lang/String;II)V

    move-object v9, v8

    new-instance v8, Lp0/k;

    const-string v11, "ResolutionUnit"

    const/16 v12, 0x128

    invoke-direct {v8, v11, v12, v15}, Lp0/k;-><init>(Ljava/lang/String;II)V

    move-object v11, v9

    new-instance v9, Lp0/k;

    const-string v12, "Software"

    const/16 v13, 0x131

    invoke-direct {v9, v12, v13, v6}, Lp0/k;-><init>(Ljava/lang/String;II)V

    move v12, v10

    new-instance v10, Lp0/k;

    const-string v13, "DateTime"

    const/16 v14, 0x132

    invoke-direct {v10, v13, v14, v6}, Lp0/k;-><init>(Ljava/lang/String;II)V

    move v13, v6

    move-object v6, v11

    new-instance v11, Lp0/k;

    const-string v14, "YCbCrPositioning"

    const/16 v12, 0x213

    invoke-direct {v11, v14, v12, v15}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v12, Lp0/k;

    const-string v14, "SubIFDPointer"

    const/16 v15, 0x14a

    invoke-direct {v12, v14, v15, v3}, Lp0/k;-><init>(Ljava/lang/String;II)V

    move/from16 v16, v13

    new-instance v13, Lp0/k;

    const-string v15, "ExifIFDPointer"

    move-object/from16 v17, v0

    const v0, 0x8769

    invoke-direct {v13, v15, v0, v3}, Lp0/k;-><init>(Ljava/lang/String;II)V

    move-object/from16 v18, v14

    new-instance v14, Lp0/k;

    const-string v0, "GPSInfoIFDPointer"

    move-object/from16 v19, v15

    const v15, 0x8825

    invoke-direct {v14, v0, v15, v3}, Lp0/k;-><init>(Ljava/lang/String;II)V

    move-object/from16 v3, v17

    move-object/from16 v20, v18

    const/4 v15, 0x5

    filled-new-array/range {v1 .. v14}, [Lp0/k;

    move-result-object v1

    sput-object v1, Lp0/i;->d:[Lp0/k;

    new-instance v2, Lp0/k;

    const v3, 0x829a

    const-string v4, "ExposureTime"

    invoke-direct {v2, v4, v3, v15}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v3, Lp0/k;

    const v5, 0x829d

    const-string v6, "FNumber"

    invoke-direct {v3, v6, v5, v15}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lp0/k;

    const-string v7, "ExposureProgram"

    const v8, 0x8822

    const/4 v9, 0x3

    invoke-direct {v5, v7, v8, v9}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v7, Lp0/k;

    const-string v8, "PhotographicSensitivity"

    const v10, 0x8827

    invoke-direct {v7, v8, v10, v9}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lp0/k;

    const-string v10, "SensitivityType"

    const v11, 0x8830

    invoke-direct {v8, v10, v11, v9}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lp0/k;

    const-string v10, "ExifVersion"

    const v11, 0x9000

    const/4 v13, 0x2

    invoke-direct {v9, v10, v11, v13}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v10, Lp0/k;

    const-string v11, "DateTimeOriginal"

    const v12, 0x9003

    invoke-direct {v10, v11, v12, v13}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lp0/k;

    const-string v12, "DateTimeDigitized"

    const v14, 0x9004

    invoke-direct {v11, v12, v14, v13}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v12, Lp0/k;

    const-string v13, "ComponentsConfiguration"

    const v14, 0x9101

    const/4 v15, 0x7

    invoke-direct {v12, v13, v14, v15}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v13, Lp0/k;

    const-string v14, "ShutterSpeedValue"

    const v15, 0x9201

    move-object/from16 v21, v2

    const/16 v2, 0xa

    invoke-direct {v13, v14, v15, v2}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v14, Lp0/k;

    const-string v15, "ApertureValue"

    const v2, 0x9202

    move-object/from16 v22, v3

    const/4 v3, 0x5

    invoke-direct {v14, v15, v2, v3}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v2, Lp0/k;

    const-string v3, "BrightnessValue"

    const v15, 0x9203

    move-object/from16 v23, v5

    const/16 v5, 0xa

    invoke-direct {v2, v3, v15, v5}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v3, Lp0/k;

    const-string v15, "ExposureBiasValue"

    move-object/from16 v32, v2

    const v2, 0x9204

    invoke-direct {v3, v15, v2, v5}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v2, Lp0/k;

    const-string v5, "MaxApertureValue"

    const v15, 0x9205

    move-object/from16 v33, v3

    const/4 v3, 0x5

    invoke-direct {v2, v5, v15, v3}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v3, Lp0/k;

    const-string v5, "MeteringMode"

    const v15, 0x9207

    move-object/from16 v34, v2

    const/4 v2, 0x3

    invoke-direct {v3, v5, v15, v2}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lp0/k;

    const-string v15, "LightSource"

    move-object/from16 v35, v3

    const v3, 0x9208

    invoke-direct {v5, v15, v3, v2}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v3, Lp0/k;

    const-string v15, "Flash"

    move-object/from16 v36, v5

    const v5, 0x9209

    invoke-direct {v3, v15, v5, v2}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v2, Lp0/k;

    const-string v5, "FocalLength"

    const v15, 0x920a

    move-object/from16 v37, v3

    const/4 v3, 0x5

    invoke-direct {v2, v5, v15, v3}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v3, Lp0/k;

    const-string v5, "SubSecTime"

    const v15, 0x9290

    move-object/from16 v38, v2

    const/4 v2, 0x2

    invoke-direct {v3, v5, v15, v2}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lp0/k;

    const-string v15, "SubSecTimeOriginal"

    move-object/from16 v39, v3

    const v3, 0x9291

    invoke-direct {v5, v15, v3, v2}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v3, Lp0/k;

    const-string v15, "SubSecTimeDigitized"

    move-object/from16 v40, v5

    const v5, 0x9292

    invoke-direct {v3, v15, v5, v2}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v2, Lp0/k;

    const-string v5, "FlashpixVersion"

    const v15, 0xa000

    move-object/from16 v41, v3

    const/4 v3, 0x7

    invoke-direct {v2, v5, v15, v3}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v3, Lp0/k;

    const-string v5, "ColorSpace"

    const v15, 0xa001

    move-object/from16 v42, v2

    const/4 v2, 0x3

    invoke-direct {v3, v5, v15, v2}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lp0/k;

    const-string v15, "PixelXDimension"

    move-object/from16 v43, v3

    const v3, 0xa002

    move-object/from16 v24, v7

    const/4 v7, 0x4

    invoke-direct {v5, v15, v3, v2, v7}, Lp0/k;-><init>(Ljava/lang/String;III)V

    new-instance v3, Lp0/k;

    const-string v15, "PixelYDimension"

    move-object/from16 v44, v5

    const v5, 0xa003

    invoke-direct {v3, v15, v5, v2, v7}, Lp0/k;-><init>(Ljava/lang/String;III)V

    new-instance v5, Lp0/k;

    const-string v15, "InteroperabilityIFDPointer"

    const v2, 0xa005

    invoke-direct {v5, v15, v2, v7}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v7, Lp0/k;

    const-string v2, "FocalPlaneResolutionUnit"

    move-object/from16 v45, v3

    const v3, 0xa210

    move-object/from16 v46, v5

    const/4 v5, 0x3

    invoke-direct {v7, v2, v3, v5}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v2, Lp0/k;

    const-string v3, "SensingMethod"

    move-object/from16 v47, v7

    const v7, 0xa217

    invoke-direct {v2, v3, v7, v5}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v3, Lp0/k;

    const-string v5, "FileSource"

    const v7, 0xa300

    move-object/from16 v48, v2

    const/4 v2, 0x7

    invoke-direct {v3, v5, v7, v2}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lp0/k;

    const-string v7, "SceneType"

    move-object/from16 v49, v3

    const v3, 0xa301

    invoke-direct {v5, v7, v3, v2}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v2, Lp0/k;

    const-string v3, "CustomRendered"

    const v7, 0xa401

    move-object/from16 v50, v5

    const/4 v5, 0x3

    invoke-direct {v2, v3, v7, v5}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v3, Lp0/k;

    const-string v7, "ExposureMode"

    move-object/from16 v51, v2

    const v2, 0xa402

    invoke-direct {v3, v7, v2, v5}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v2, Lp0/k;

    const-string v7, "WhiteBalance"

    move-object/from16 v52, v3

    const v3, 0xa403

    invoke-direct {v2, v7, v3, v5}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v3, Lp0/k;

    const-string v7, "SceneCaptureType"

    move-object/from16 v53, v2

    const v2, 0xa406

    invoke-direct {v3, v7, v2, v5}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v2, Lp0/k;

    const-string v7, "Contrast"

    move-object/from16 v54, v3

    const v3, 0xa408

    invoke-direct {v2, v7, v3, v5}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v3, Lp0/k;

    const-string v7, "Saturation"

    move-object/from16 v55, v2

    const v2, 0xa409

    invoke-direct {v3, v7, v2, v5}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v2, Lp0/k;

    const-string v7, "Sharpness"

    move-object/from16 v56, v3

    const v3, 0xa40a

    invoke-direct {v2, v7, v3, v5}, Lp0/k;-><init>(Ljava/lang/String;II)V

    move-object/from16 v57, v2

    move-object/from16 v25, v8

    move-object/from16 v26, v9

    move-object/from16 v27, v10

    move-object/from16 v28, v11

    move-object/from16 v29, v12

    move-object/from16 v30, v13

    move-object/from16 v31, v14

    filled-new-array/range {v21 .. v57}, [Lp0/k;

    move-result-object v2

    sput-object v2, Lp0/i;->e:[Lp0/k;

    new-instance v3, Lp0/k;

    const-string v5, "GPSVersionID"

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-direct {v3, v5, v7, v8}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lp0/k;

    const-string v7, "GPSLatitudeRef"

    const/4 v13, 0x2

    invoke-direct {v5, v7, v8, v13}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v7, Lp0/k;

    const-string v9, "GPSLatitude"

    const/16 v10, 0xa

    const/4 v12, 0x5

    invoke-direct {v7, v9, v13, v12, v10}, Lp0/k;-><init>(Ljava/lang/String;III)V

    new-instance v9, Lp0/k;

    const-string v11, "GPSLongitudeRef"

    const/4 v14, 0x3

    invoke-direct {v9, v11, v14, v13}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lp0/k;

    const-string v13, "GPSLongitude"

    const/4 v14, 0x4

    invoke-direct {v11, v13, v14, v12, v10}, Lp0/k;-><init>(Ljava/lang/String;III)V

    new-instance v10, Lp0/k;

    const-string v13, "GPSAltitudeRef"

    invoke-direct {v10, v13, v12, v8}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v13, Lp0/k;

    const-string v14, "GPSAltitude"

    const/4 v8, 0x6

    invoke-direct {v13, v14, v8, v12}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lp0/k;

    const-string v14, "GPSTimeStamp"

    move-object/from16 v21, v3

    const/4 v3, 0x7

    invoke-direct {v8, v14, v3, v12}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v3, Lp0/k;

    const-string v12, "GPSSpeedRef"

    move-object/from16 v22, v5

    const/16 v5, 0xc

    move-object/from16 v23, v7

    const/4 v7, 0x2

    invoke-direct {v3, v12, v5, v7}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lp0/k;

    const-string v12, "GPSTrackRef"

    move-object/from16 v29, v3

    const/16 v3, 0xe

    invoke-direct {v5, v12, v3, v7}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v3, Lp0/k;

    const-string v12, "GPSImgDirectionRef"

    move-object/from16 v30, v5

    const/16 v5, 0x10

    invoke-direct {v3, v12, v5, v7}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lp0/k;

    const-string v12, "GPSDestBearingRef"

    move-object/from16 v31, v3

    const/16 v3, 0x17

    invoke-direct {v5, v12, v3, v7}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v3, Lp0/k;

    const-string v12, "GPSDestDistanceRef"

    move-object/from16 v32, v5

    const/16 v5, 0x19

    invoke-direct {v3, v12, v5, v7}, Lp0/k;-><init>(Ljava/lang/String;II)V

    move-object/from16 v33, v3

    move-object/from16 v28, v8

    move-object/from16 v24, v9

    move-object/from16 v26, v10

    move-object/from16 v25, v11

    move-object/from16 v27, v13

    filled-new-array/range {v21 .. v33}, [Lp0/k;

    move-result-object v3

    sput-object v3, Lp0/i;->f:[Lp0/k;

    new-instance v5, Lp0/k;

    move-object/from16 v8, v20

    const/4 v7, 0x4

    const/16 v9, 0x14a

    invoke-direct {v5, v8, v9, v7}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lp0/k;

    move-object/from16 v9, v19

    const v10, 0x8769

    invoke-direct {v8, v9, v10, v7}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lp0/k;

    const v10, 0x8825

    invoke-direct {v9, v0, v10, v7}, Lp0/k;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lp0/k;

    const v10, 0xa005

    invoke-direct {v0, v15, v10, v7}, Lp0/k;-><init>(Ljava/lang/String;II)V

    filled-new-array {v5, v8, v9, v0}, [Lp0/k;

    move-result-object v0

    sput-object v0, Lp0/i;->g:[Lp0/k;

    new-instance v0, Lp0/k;

    const-string v5, "InteroperabilityIndex"

    const/4 v7, 0x1

    const/4 v13, 0x2

    invoke-direct {v0, v5, v7, v13}, Lp0/k;-><init>(Ljava/lang/String;II)V

    filled-new-array {v0}, [Lp0/k;

    move-result-object v0

    sput-object v0, Lp0/i;->h:[Lp0/k;

    filled-new-array {v1, v2, v3, v0}, [[Lp0/k;

    move-result-object v0

    sput-object v0, Lp0/i;->i:[[Lp0/k;

    new-instance v0, Ljava/util/HashSet;

    filled-new-array {v6, v4, v14}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lp0/i;->j:Ljava/util/HashSet;

    new-instance v0, Ljava/lang/String;

    const/4 v7, 0x4

    new-array v1, v7, [B

    fill-array-data v1, :array_0

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    sput-object v0, Lp0/i;->k:Ljava/lang/String;

    return-void

    nop

    :array_0
    .array-data 1
        0x1t
        0x2t
        0x3t
        0x0t
    .end array-data
.end method

.method public constructor <init>(Ljava/nio/ByteOrder;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/ByteOrder;",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lp0/h;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    sget-object v1, Lp0/i;->i:[[Lp0/k;

    array-length v1, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Malformed attributes list. Number of IFDs mismatch."

    invoke-static {v0, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    iput-object p1, p0, Lp0/i;->b:Ljava/nio/ByteOrder;

    iput-object p2, p0, Lp0/i;->a:Ljava/util/List;

    return-void
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lp0/i;->k:Ljava/lang/String;

    return-object v0
.end method

.method public static b()Lp0/i$b;
    .locals 4

    new-instance v0, Lp0/i$b;

    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-direct {v0, v1}, Lp0/i$b;-><init>(Ljava/nio/ByteOrder;)V

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Orientation"

    invoke-virtual {v0, v3, v2}, Lp0/i$b;->c(Ljava/lang/String;Ljava/lang/String;)Lp0/i$b;

    move-result-object v0

    const-string v2, "XResolution"

    const-string v3, "72/1"

    invoke-virtual {v0, v2, v3}, Lp0/i$b;->c(Ljava/lang/String;Ljava/lang/String;)Lp0/i$b;

    move-result-object v0

    const-string v2, "YResolution"

    invoke-virtual {v0, v2, v3}, Lp0/i$b;->c(Ljava/lang/String;Ljava/lang/String;)Lp0/i$b;

    move-result-object v0

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "ResolutionUnit"

    invoke-virtual {v0, v3, v2}, Lp0/i$b;->c(Ljava/lang/String;Ljava/lang/String;)Lp0/i$b;

    move-result-object v0

    const-string v2, "YCbCrPositioning"

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lp0/i$b;->c(Ljava/lang/String;Ljava/lang/String;)Lp0/i$b;

    move-result-object v0

    const-string v1, "Make"

    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lp0/i$b;->c(Ljava/lang/String;Ljava/lang/String;)Lp0/i$b;

    move-result-object v0

    const-string v1, "Model"

    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lp0/i$b;->c(Ljava/lang/String;Ljava/lang/String;)Lp0/i$b;

    move-result-object v0

    return-object v0
.end method

.method public static c(Landroidx/camera/core/d;I)Lp0/i;
    .locals 2

    invoke-static {}, Lp0/i;->b()Lp0/i$b;

    move-result-object v0

    invoke-interface {p0}, Landroidx/camera/core/d;->H2()Lg0/i1;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Landroidx/camera/core/d;->H2()Lg0/i1;

    move-result-object v1

    invoke-interface {v1, v0}, Lg0/i1;->a(Lp0/i$b;)V

    :cond_0
    invoke-virtual {v0, p1}, Lp0/i$b;->m(I)Lp0/i$b;

    invoke-interface {p0}, Landroidx/camera/core/d;->getWidth()I

    move-result p1

    invoke-virtual {v0, p1}, Lp0/i$b;->j(I)Lp0/i$b;

    move-result-object p1

    invoke-interface {p0}, Landroidx/camera/core/d;->getHeight()I

    move-result p0

    invoke-virtual {p1, p0}, Lp0/i$b;->i(I)Lp0/i$b;

    move-result-object p0

    invoke-virtual {p0}, Lp0/i$b;->a()Lp0/i;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public d(I)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lp0/h;",
            ">;"
        }
    .end annotation

    sget-object v0, Lp0/i;->i:[[Lp0/k;

    array-length v0, v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid IFD index: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ". Index should be between [0, EXIF_TAGS.length] "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1}, Lx2/g;->c(IIILjava/lang/String;)I

    iget-object v0, p0, Lp0/i;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    return-object p1
.end method

.method public e()Ljava/nio/ByteOrder;
    .locals 1

    iget-object v0, p0, Lp0/i;->b:Ljava/nio/ByteOrder;

    return-object v0
.end method
