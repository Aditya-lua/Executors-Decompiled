.class public Lc4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc4/a$e;,
        Lc4/a$d;,
        Lc4/a$f;,
        Lc4/a$g;,
        Lc4/a$b;,
        Lc4/a$c;
    }
.end annotation


# static fields
.field public static final A:[I

.field public static final B:[I

.field public static final C:[B

.field public static final D:[B

.field public static final E:[B

.field public static final F:[B

.field public static final G:[B

.field public static final H:[B

.field public static final I:[B

.field public static final J:[B

.field public static final K:[B

.field public static final L:[B

.field public static final M:[B

.field public static final N:[B

.field public static final O:[B

.field public static final P:[B

.field public static final Q:[B

.field public static final R:[B

.field public static final S:[B

.field public static final T:[B

.field public static final U:[B

.field public static final V:Ljava/text/SimpleDateFormat;

.field public static final W:Ljava/text/SimpleDateFormat;

.field public static final X:[Ljava/lang/String;

.field public static final Y:[I

.field public static final Z:[B

.field public static final a0:[Lc4/a$e;

.field public static final b0:[Lc4/a$e;

.field public static final c0:[Lc4/a$e;

.field public static final d0:[Lc4/a$e;

.field public static final e0:[Lc4/a$e;

.field public static final f0:Lc4/a$e;

.field public static final g0:[Lc4/a$e;

.field public static final h0:[Lc4/a$e;

.field public static final i0:[Lc4/a$e;

.field public static final j0:[Lc4/a$e;

.field public static final k0:[[Lc4/a$e;

.field public static final l0:[Lc4/a$e;

.field public static final m0:[Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lc4/a$e;",
            ">;"
        }
    .end annotation
.end field

.field public static final n0:[Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lc4/a$e;",
            ">;"
        }
    .end annotation
.end field

.field public static final o0:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final p0:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final q0:Ljava/nio/charset/Charset;

.field public static final r0:[B

.field public static final s0:[B

.field public static final t0:Ljava/util/regex/Pattern;

.field public static final u0:Ljava/util/regex/Pattern;

.field public static final v0:Ljava/util/regex/Pattern;

.field public static final w:Z

.field public static final w0:Ljava/util/regex/Pattern;

.field public static final x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final z:[I


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/io/FileDescriptor;

.field public c:Landroid/content/res/AssetManager$AssetInputStream;

.field public d:I

.field public e:Z

.field public final f:[Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lc4/a$d;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public h:Ljava/nio/ByteOrder;

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:I

.field public m:I

.field public n:[B

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:Z

.field public u:Lc4/a$d;

.field public v:Z


# direct methods
.method static constructor <clinit>()V
    .locals 139

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ExifInterface"

    invoke-static {v2, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    sput-boolean v2, Lc4/a;->w:Z

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v6, 0x8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array {v3, v5, v1, v7}, [Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    sput-object v5, Lc4/a;->x:Ljava/util/List;

    const/4 v5, 0x2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/4 v9, 0x7

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/4 v11, 0x4

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    const/4 v13, 0x5

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    filled-new-array {v8, v10, v12, v14}, [Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v12}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    sput-object v12, Lc4/a;->y:Ljava/util/List;

    filled-new-array {v6, v6, v6}, [I

    move-result-object v12

    sput-object v12, Lc4/a;->z:[I

    filled-new-array {v11}, [I

    move-result-object v12

    sput-object v12, Lc4/a;->A:[I

    filled-new-array {v6}, [I

    move-result-object v12

    sput-object v12, Lc4/a;->B:[I

    new-array v12, v0, [B

    fill-array-data v12, :array_0

    sput-object v12, Lc4/a;->C:[B

    new-array v12, v11, [B

    fill-array-data v12, :array_1

    sput-object v12, Lc4/a;->D:[B

    new-array v12, v11, [B

    fill-array-data v12, :array_2

    sput-object v12, Lc4/a;->E:[B

    new-array v12, v11, [B

    fill-array-data v12, :array_3

    sput-object v12, Lc4/a;->F:[B

    new-array v12, v11, [B

    fill-array-data v12, :array_4

    sput-object v12, Lc4/a;->G:[B

    new-array v12, v11, [B

    fill-array-data v12, :array_5

    sput-object v12, Lc4/a;->H:[B

    new-array v12, v4, [B

    fill-array-data v12, :array_6

    sput-object v12, Lc4/a;->I:[B

    const/16 v12, 0xa

    new-array v15, v12, [B

    fill-array-data v15, :array_7

    sput-object v15, Lc4/a;->J:[B

    new-array v15, v6, [B

    fill-array-data v15, :array_8

    sput-object v15, Lc4/a;->K:[B

    const-string v15, "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000"

    sget-object v12, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v15, v12}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v12

    sput-object v12, Lc4/a;->L:[B

    new-array v12, v11, [B

    fill-array-data v12, :array_9

    sput-object v12, Lc4/a;->M:[B

    new-array v12, v11, [B

    fill-array-data v12, :array_a

    sput-object v12, Lc4/a;->N:[B

    new-array v12, v11, [B

    fill-array-data v12, :array_b

    sput-object v12, Lc4/a;->O:[B

    new-array v12, v0, [B

    fill-array-data v12, :array_c

    sput-object v12, Lc4/a;->P:[B

    const-string v12, "VP8X"

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v15

    invoke-virtual {v12, v15}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v12

    sput-object v12, Lc4/a;->Q:[B

    const-string v12, "VP8L"

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v15

    invoke-virtual {v12, v15}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v12

    sput-object v12, Lc4/a;->R:[B

    const-string v12, "VP8 "

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v15

    invoke-virtual {v12, v15}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v12

    sput-object v12, Lc4/a;->S:[B

    const-string v12, "ANIM"

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v15

    invoke-virtual {v12, v15}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v12

    sput-object v12, Lc4/a;->T:[B

    const-string v12, "ANMF"

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v15

    invoke-virtual {v12, v15}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v12

    sput-object v12, Lc4/a;->U:[B

    const-string v29, "DOUBLE"

    const-string v30, "IFD"

    const-string v17, ""

    const-string v18, "BYTE"

    const-string v19, "STRING"

    const-string v20, "USHORT"

    const-string v21, "ULONG"

    const-string v22, "URATIONAL"

    const-string v23, "SBYTE"

    const-string v24, "UNDEFINED"

    const-string v25, "SSHORT"

    const-string v26, "SLONG"

    const-string v27, "SRATIONAL"

    const-string v28, "SINGLE"

    filled-new-array/range {v17 .. v30}, [Ljava/lang/String;

    move-result-object v12

    sput-object v12, Lc4/a;->X:[Ljava/lang/String;

    const/16 v12, 0xe

    new-array v12, v12, [I

    fill-array-data v12, :array_d

    sput-object v12, Lc4/a;->Y:[I

    new-array v12, v6, [B

    fill-array-data v12, :array_e

    sput-object v12, Lc4/a;->Z:[B

    new-instance v12, Lc4/a$e;

    const-string v15, "NewSubfileType"

    const/16 v6, 0xfe

    invoke-direct {v12, v15, v6, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v6, Lc4/a$e;

    const-string v15, "SubfileType"

    const/16 v2, 0xff

    invoke-direct {v6, v15, v2, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v2, Lc4/a$e;

    const-string v15, "ImageWidth"

    const/16 v9, 0x100

    invoke-direct {v2, v15, v9, v0, v11}, Lc4/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v15, Lc4/a$e;

    const-string v9, "ImageLength"

    const/16 v4, 0x101

    invoke-direct {v15, v9, v4, v0, v11}, Lc4/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v9, Lc4/a$e;

    const-string v4, "BitsPerSample"

    const/16 v13, 0x102

    invoke-direct {v9, v4, v13, v0}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v4, Lc4/a$e;

    const-string v13, "Compression"

    const/16 v11, 0x103

    invoke-direct {v4, v13, v11, v0}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v13, "PhotometricInterpretation"

    const/16 v5, 0x106

    invoke-direct {v11, v13, v5, v0}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v13, "ImageDescription"

    const/16 v0, 0x10e

    move-object/from16 v19, v2

    const/4 v2, 0x2

    invoke-direct {v5, v13, v0, v2}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lc4/a$e;

    const-string v13, "Make"

    move-object/from16 v22, v4

    const/16 v4, 0x10f

    invoke-direct {v0, v13, v4, v2}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v4, Lc4/a$e;

    const-string v13, "Model"

    move-object/from16 v25, v0

    const/16 v0, 0x110

    invoke-direct {v4, v13, v0, v2}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lc4/a$e;

    const-string v2, "StripOffsets"

    const/16 v13, 0x111

    move-object/from16 v26, v4

    move-object/from16 v24, v5

    const/4 v4, 0x3

    const/4 v5, 0x4

    invoke-direct {v0, v2, v13, v4, v5}, Lc4/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v5, Lc4/a$e;

    const-string v13, "Orientation"

    move-object/from16 v27, v0

    const/16 v0, 0x112

    invoke-direct {v5, v13, v0, v4}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lc4/a$e;

    const-string v13, "SamplesPerPixel"

    move-object/from16 v28, v5

    const/16 v5, 0x115

    invoke-direct {v0, v13, v5, v4}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v13, "RowsPerStrip"

    move-object/from16 v29, v0

    const/16 v0, 0x116

    move-object/from16 v18, v6

    const/4 v6, 0x4

    invoke-direct {v5, v13, v0, v4, v6}, Lc4/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v0, Lc4/a$e;

    const-string v13, "StripByteCounts"

    move-object/from16 v30, v5

    const/16 v5, 0x117

    invoke-direct {v0, v13, v5, v4, v6}, Lc4/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v4, Lc4/a$e;

    const-string v5, "XResolution"

    const/16 v6, 0x11a

    const/4 v13, 0x5

    invoke-direct {v4, v5, v6, v13}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v6, "YResolution"

    move-object/from16 v31, v0

    const/16 v0, 0x11b

    invoke-direct {v5, v6, v0, v13}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lc4/a$e;

    const-string v6, "PlanarConfiguration"

    const/16 v13, 0x11c

    move-object/from16 v32, v4

    const/4 v4, 0x3

    invoke-direct {v0, v6, v13, v4}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v6, Lc4/a$e;

    const-string v13, "ResolutionUnit"

    move-object/from16 v34, v0

    const/16 v0, 0x128

    invoke-direct {v6, v13, v0, v4}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lc4/a$e;

    const-string v13, "TransferFunction"

    move-object/from16 v33, v5

    const/16 v5, 0x12d

    invoke-direct {v0, v13, v5, v4}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v4, Lc4/a$e;

    const-string v5, "Software"

    const/16 v13, 0x131

    move-object/from16 v36, v0

    const/4 v0, 0x2

    invoke-direct {v4, v5, v13, v0}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v13, "DateTime"

    move-object/from16 v37, v4

    const/16 v4, 0x132

    invoke-direct {v5, v13, v4, v0}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v4, Lc4/a$e;

    const-string v13, "Artist"

    move-object/from16 v38, v5

    const/16 v5, 0x13b

    invoke-direct {v4, v13, v5, v0}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lc4/a$e;

    const-string v5, "WhitePoint"

    const/16 v13, 0x13e

    move-object/from16 v39, v4

    const/4 v4, 0x5

    invoke-direct {v0, v5, v13, v4}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v13, "PrimaryChromaticities"

    move-object/from16 v40, v0

    const/16 v0, 0x13f

    invoke-direct {v5, v13, v0, v4}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lc4/a$e;

    const-string v4, "SubIFDPointer"

    const/16 v13, 0x14a

    move-object/from16 v41, v5

    const/4 v5, 0x4

    invoke-direct {v0, v4, v13, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v13, Lc4/a$e;

    move-object/from16 v42, v0

    const-string v0, "JPEGInterchangeFormat"

    move-object/from16 v35, v6

    const/16 v6, 0x201

    invoke-direct {v13, v0, v6, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lc4/a$e;

    const-string v6, "JPEGInterchangeFormatLength"

    move-object/from16 v21, v9

    const/16 v9, 0x202

    invoke-direct {v0, v6, v9, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v6, "YCbCrCoefficients"

    const/16 v9, 0x211

    move-object/from16 v44, v0

    const/4 v0, 0x5

    invoke-direct {v5, v6, v9, v0}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lc4/a$e;

    const-string v6, "YCbCrSubSampling"

    const/16 v9, 0x212

    move-object/from16 v45, v5

    const/4 v5, 0x3

    invoke-direct {v0, v6, v9, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v6, Lc4/a$e;

    const-string v9, "YCbCrPositioning"

    move-object/from16 v46, v0

    const/16 v0, 0x213

    invoke-direct {v6, v9, v0, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lc4/a$e;

    const-string v5, "ReferenceBlackWhite"

    const/16 v9, 0x214

    move-object/from16 v47, v6

    const/4 v6, 0x5

    invoke-direct {v0, v5, v9, v6}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v6, "Copyright"

    const v9, 0x8298

    move-object/from16 v48, v0

    const/4 v0, 0x2

    invoke-direct {v5, v6, v9, v0}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lc4/a$e;

    const-string v6, "ExifIFDPointer"

    const v9, 0x8769

    move-object/from16 v49, v5

    const/4 v5, 0x4

    invoke-direct {v0, v6, v9, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    move-object/from16 v50, v0

    const-string v0, "GPSInfoIFDPointer"

    move-object/from16 v23, v11

    const v11, 0x8825

    invoke-direct {v9, v0, v11, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    move-object/from16 v51, v9

    const-string v9, "SensorTopBorder"

    invoke-direct {v11, v9, v5, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    move-object/from16 v52, v11

    const-string v11, "SensorLeftBorder"

    move-object/from16 v17, v12

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v12, "SensorBottomBorder"

    move-object/from16 v53, v9

    const/4 v9, 0x6

    invoke-direct {v11, v12, v9, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v12, "SensorRightBorder"

    move-object/from16 v54, v11

    const/4 v11, 0x7

    invoke-direct {v9, v12, v11, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v12, "ISO"

    const/16 v11, 0x17

    move-object/from16 v55, v9

    const/4 v9, 0x3

    invoke-direct {v5, v12, v11, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v11, "JpgFromRaw"

    const/16 v12, 0x2e

    move-object/from16 v56, v5

    const/4 v5, 0x7

    invoke-direct {v9, v11, v12, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v11, "Xmp"

    const/16 v12, 0x2bc

    move-object/from16 v57, v9

    const/4 v9, 0x1

    invoke-direct {v5, v11, v12, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    move-object/from16 v58, v5

    move-object/from16 v43, v13

    move-object/from16 v20, v15

    filled-new-array/range {v17 .. v58}, [Lc4/a$e;

    move-result-object v64

    sput-object v64, Lc4/a;->a0:[Lc4/a$e;

    new-instance v5, Lc4/a$e;

    const-string v9, "ExposureTime"

    const v11, 0x829a

    const/4 v12, 0x5

    invoke-direct {v5, v9, v11, v12}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v11, "FNumber"

    const v13, 0x829d

    invoke-direct {v9, v11, v13, v12}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v12, "ExposureProgram"

    const v13, 0x8822

    const/4 v15, 0x3

    invoke-direct {v11, v12, v13, v15}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v12, Lc4/a$e;

    const-string v13, "SpectralSensitivity"

    const v15, 0x8824

    move-object/from16 v65, v5

    const/4 v5, 0x2

    invoke-direct {v12, v13, v15, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v13, "PhotographicSensitivity"

    const v15, 0x8827

    move-object/from16 v66, v9

    const/4 v9, 0x3

    invoke-direct {v5, v13, v15, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v13, Lc4/a$e;

    const-string v15, "OECF"

    const v9, 0x8828

    move-object/from16 v69, v5

    const/4 v5, 0x7

    invoke-direct {v13, v15, v9, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v9, "SensitivityType"

    const v15, 0x8830

    move-object/from16 v67, v11

    const/4 v11, 0x3

    invoke-direct {v5, v9, v15, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v11, "StandardOutputSensitivity"

    const v15, 0x8831

    move-object/from16 v71, v5

    const/4 v5, 0x4

    invoke-direct {v9, v11, v15, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "RecommendedExposureIndex"

    move-object/from16 v72, v9

    const v9, 0x8832

    invoke-direct {v11, v15, v9, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v15, "ISOSpeed"

    move-object/from16 v73, v11

    const v11, 0x8833

    invoke-direct {v9, v15, v11, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "ISOSpeedLatitudeyyy"

    move-object/from16 v74, v9

    const v9, 0x8834

    invoke-direct {v11, v15, v9, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v15, "ISOSpeedLatitudezzz"

    move-object/from16 v75, v11

    const v11, 0x8835

    invoke-direct {v9, v15, v11, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v11, "ExifVersion"

    const v15, 0x9000

    move-object/from16 v76, v9

    const/4 v9, 0x2

    invoke-direct {v5, v11, v15, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "DateTimeOriginal"

    move-object/from16 v77, v5

    const v5, 0x9003

    invoke-direct {v11, v15, v5, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v15, "DateTimeDigitized"

    move-object/from16 v78, v11

    const v11, 0x9004

    invoke-direct {v5, v15, v11, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "OffsetTime"

    move-object/from16 v79, v5

    const v5, 0x9010

    invoke-direct {v11, v15, v5, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v15, "OffsetTimeOriginal"

    move-object/from16 v80, v11

    const v11, 0x9011

    invoke-direct {v5, v15, v11, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "OffsetTimeDigitized"

    move-object/from16 v81, v5

    const v5, 0x9012

    invoke-direct {v11, v15, v5, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v9, "ComponentsConfiguration"

    const v15, 0x9101

    move-object/from16 v82, v11

    const/4 v11, 0x7

    invoke-direct {v5, v9, v15, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v11, "CompressedBitsPerPixel"

    const v15, 0x9102

    move-object/from16 v83, v5

    const/4 v5, 0x5

    invoke-direct {v9, v11, v15, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "ShutterSpeedValue"

    const v5, 0x9201

    move-object/from16 v84, v9

    const/16 v9, 0xa

    invoke-direct {v11, v15, v5, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v15, "ApertureValue"

    const v9, 0x9202

    move-object/from16 v85, v11

    const/4 v11, 0x5

    invoke-direct {v5, v15, v9, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v11, "BrightnessValue"

    const v15, 0x9203

    move-object/from16 v86, v5

    const/16 v5, 0xa

    invoke-direct {v9, v11, v15, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "ExposureBiasValue"

    move-object/from16 v87, v9

    const v9, 0x9204

    invoke-direct {v11, v15, v9, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v9, "MaxApertureValue"

    const v15, 0x9205

    move-object/from16 v88, v11

    const/4 v11, 0x5

    invoke-direct {v5, v9, v15, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v15, "SubjectDistance"

    move-object/from16 v89, v5

    const v5, 0x9206

    invoke-direct {v9, v15, v5, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v11, "MeteringMode"

    const v15, 0x9207

    move-object/from16 v90, v9

    const/4 v9, 0x3

    invoke-direct {v5, v11, v15, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "LightSource"

    move-object/from16 v91, v5

    const v5, 0x9208

    invoke-direct {v11, v15, v5, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v15, "Flash"

    move-object/from16 v92, v11

    const v11, 0x9209

    invoke-direct {v5, v15, v11, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "FocalLength"

    const v9, 0x920a

    move-object/from16 v93, v5

    const/4 v5, 0x5

    invoke-direct {v11, v15, v9, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v9, "SubjectArea"

    const v15, 0x9214

    move-object/from16 v94, v11

    const/4 v11, 0x3

    invoke-direct {v5, v9, v15, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v11, "MakerNote"

    const v15, 0x927c

    move-object/from16 v95, v5

    const/4 v5, 0x7

    invoke-direct {v9, v11, v15, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "UserComment"

    move-object/from16 v96, v9

    const v9, 0x9286

    invoke-direct {v11, v15, v9, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v9, "SubSecTime"

    const v15, 0x9290

    move-object/from16 v97, v11

    const/4 v11, 0x2

    invoke-direct {v5, v9, v15, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v15, "SubSecTimeOriginal"

    move-object/from16 v98, v5

    const v5, 0x9291

    invoke-direct {v9, v15, v5, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v15, "SubSecTimeDigitized"

    move-object/from16 v99, v9

    const v9, 0x9292

    invoke-direct {v5, v15, v9, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v11, "FlashpixVersion"

    const v15, 0xa000

    move-object/from16 v100, v5

    const/4 v5, 0x7

    invoke-direct {v9, v11, v15, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v11, "ColorSpace"

    const v15, 0xa001

    move-object/from16 v101, v9

    const/4 v9, 0x3

    invoke-direct {v5, v11, v15, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "PixelXDimension"

    move-object/from16 v102, v5

    const v5, 0xa002

    move-object/from16 v68, v12

    const/4 v12, 0x4

    invoke-direct {v11, v15, v5, v9, v12}, Lc4/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v5, Lc4/a$e;

    const-string v15, "PixelYDimension"

    move-object/from16 v103, v11

    const v11, 0xa003

    invoke-direct {v5, v15, v11, v9, v12}, Lc4/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v9, Lc4/a$e;

    const-string v11, "RelatedSoundFile"

    const v15, 0xa004

    const/4 v12, 0x2

    invoke-direct {v9, v11, v15, v12}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v12, "InteroperabilityIFDPointer"

    const v15, 0xa005

    move-object/from16 v104, v5

    const/4 v5, 0x4

    invoke-direct {v11, v12, v15, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v12, "FlashEnergy"

    const v15, 0xa20b

    move-object/from16 v105, v9

    const/4 v9, 0x5

    invoke-direct {v5, v12, v15, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v12, Lc4/a$e;

    const-string v15, "SpatialFrequencyResponse"

    const v9, 0xa20c

    move-object/from16 v107, v5

    const/4 v5, 0x7

    invoke-direct {v12, v15, v9, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v9, "FocalPlaneXResolution"

    const v15, 0xa20e

    move-object/from16 v106, v11

    const/4 v11, 0x5

    invoke-direct {v5, v9, v15, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v15, "FocalPlaneYResolution"

    move-object/from16 v109, v5

    const v5, 0xa20f

    invoke-direct {v9, v15, v5, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v11, "FocalPlaneResolutionUnit"

    const v15, 0xa210

    move-object/from16 v110, v9

    const/4 v9, 0x3

    invoke-direct {v5, v11, v15, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "SubjectLocation"

    move-object/from16 v111, v5

    const v5, 0xa214

    invoke-direct {v11, v15, v5, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v15, "ExposureIndex"

    const v9, 0xa215

    move-object/from16 v112, v11

    const/4 v11, 0x5

    invoke-direct {v5, v15, v9, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v11, "SensingMethod"

    const v15, 0xa217

    move-object/from16 v113, v5

    const/4 v5, 0x3

    invoke-direct {v9, v11, v15, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v11, "FileSource"

    const v15, 0xa300

    move-object/from16 v114, v9

    const/4 v9, 0x7

    invoke-direct {v5, v11, v15, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "SceneType"

    move-object/from16 v115, v5

    const v5, 0xa301

    invoke-direct {v11, v15, v5, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v15, "CFAPattern"

    move-object/from16 v116, v11

    const v11, 0xa302

    invoke-direct {v5, v15, v11, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v11, "CustomRendered"

    const v15, 0xa401

    move-object/from16 v117, v5

    const/4 v5, 0x3

    invoke-direct {v9, v11, v15, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "ExposureMode"

    move-object/from16 v118, v9

    const v9, 0xa402

    invoke-direct {v11, v15, v9, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v15, "WhiteBalance"

    move-object/from16 v119, v11

    const v11, 0xa403

    invoke-direct {v9, v15, v11, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "DigitalZoomRatio"

    const v5, 0xa404

    move-object/from16 v120, v9

    const/4 v9, 0x5

    invoke-direct {v11, v15, v5, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v9, "FocalLengthIn35mmFilm"

    const v15, 0xa405

    move-object/from16 v121, v11

    const/4 v11, 0x3

    invoke-direct {v5, v9, v15, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v15, "SceneCaptureType"

    move-object/from16 v122, v5

    const v5, 0xa406

    invoke-direct {v9, v15, v5, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v15, "GainControl"

    move-object/from16 v123, v9

    const v9, 0xa407

    invoke-direct {v5, v15, v9, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v15, "Contrast"

    move-object/from16 v124, v5

    const v5, 0xa408

    invoke-direct {v9, v15, v5, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v15, "Saturation"

    move-object/from16 v125, v9

    const v9, 0xa409

    invoke-direct {v5, v15, v9, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v15, "Sharpness"

    move-object/from16 v126, v5

    const v5, 0xa40a

    invoke-direct {v9, v15, v5, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v15, "DeviceSettingDescription"

    const v11, 0xa40b

    move-object/from16 v127, v9

    const/4 v9, 0x7

    invoke-direct {v5, v15, v11, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v11, "SubjectDistanceRange"

    const v15, 0xa40c

    move-object/from16 v128, v5

    const/4 v5, 0x3

    invoke-direct {v9, v11, v15, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v11, "ImageUniqueID"

    const v15, 0xa420

    move-object/from16 v129, v9

    const/4 v9, 0x2

    invoke-direct {v5, v11, v15, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "CameraOwnerName"

    move-object/from16 v130, v5

    const v5, 0xa430

    invoke-direct {v11, v15, v5, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v15, "BodySerialNumber"

    move-object/from16 v131, v11

    const v11, 0xa431

    invoke-direct {v5, v15, v11, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "LensSpecification"

    const v9, 0xa432

    move-object/from16 v132, v5

    const/4 v5, 0x5

    invoke-direct {v11, v15, v9, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v9, "LensMake"

    const v15, 0xa433

    move-object/from16 v133, v11

    const/4 v11, 0x2

    invoke-direct {v5, v9, v15, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v15, "LensModel"

    move-object/from16 v134, v5

    const v5, 0xa434

    invoke-direct {v9, v15, v5, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v11, "Gamma"

    const v15, 0xa500

    move-object/from16 v135, v9

    const/4 v9, 0x5

    invoke-direct {v5, v11, v15, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v11, "DNGVersion"

    const v15, 0xc612

    move-object/from16 v136, v5

    const/4 v5, 0x1

    invoke-direct {v9, v11, v15, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "DefaultCropSize"

    const v5, 0xc620

    move-object/from16 v137, v9

    move-object/from16 v108, v12

    const/4 v9, 0x3

    const/4 v12, 0x4

    invoke-direct {v11, v15, v5, v9, v12}, Lc4/a$e;-><init>(Ljava/lang/String;III)V

    move-object/from16 v138, v11

    move-object/from16 v70, v13

    filled-new-array/range {v65 .. v138}, [Lc4/a$e;

    move-result-object v65

    sput-object v65, Lc4/a;->b0:[Lc4/a$e;

    new-instance v5, Lc4/a$e;

    const-string v9, "GPSVersionID"

    const/4 v11, 0x0

    const/4 v12, 0x1

    invoke-direct {v5, v9, v11, v12}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v13, "GPSLatitudeRef"

    const/4 v15, 0x2

    invoke-direct {v9, v13, v12, v15}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v12, Lc4/a$e;

    const-string v13, "GPSLatitude"

    move-object/from16 v17, v5

    move/from16 v49, v11

    const/16 v5, 0xa

    const/4 v11, 0x5

    invoke-direct {v12, v13, v15, v11, v5}, Lc4/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v13, Lc4/a$e;

    const-string v5, "GPSLongitudeRef"

    const/4 v11, 0x3

    invoke-direct {v13, v5, v11, v15}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v11, "GPSLongitude"

    move-object/from16 v18, v9

    move-object/from16 v19, v12

    const/4 v9, 0x5

    const/16 v12, 0xa

    const/4 v15, 0x4

    invoke-direct {v5, v11, v15, v9, v12}, Lc4/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v11, Lc4/a$e;

    const-string v12, "GPSAltitudeRef"

    const/4 v15, 0x1

    invoke-direct {v11, v12, v9, v15}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v12, Lc4/a$e;

    const-string v15, "GPSAltitude"

    move-object/from16 v21, v5

    const/4 v5, 0x6

    invoke-direct {v12, v15, v5, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v15, "GPSTimeStamp"

    move-object/from16 v22, v11

    const/4 v11, 0x7

    invoke-direct {v5, v15, v11, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v11, "GPSSatellites"

    move-object/from16 v24, v5

    const/4 v5, 0x2

    const/16 v15, 0x8

    invoke-direct {v9, v11, v15, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "GPSStatus"

    move-object/from16 v25, v9

    const/16 v9, 0x9

    invoke-direct {v11, v15, v9, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v15, "GPSMeasureMode"

    move-object/from16 v26, v11

    const/16 v11, 0xa

    invoke-direct {v9, v15, v11, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "GPSDOP"

    const/16 v5, 0xb

    move-object/from16 v27, v9

    const/4 v9, 0x5

    invoke-direct {v11, v15, v5, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v15, "GPSSpeedRef"

    const/16 v9, 0xc

    move-object/from16 v28, v11

    const/4 v11, 0x2

    invoke-direct {v5, v15, v9, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v15, "GPSSpeed"

    const/16 v11, 0xd

    move-object/from16 v29, v5

    const/4 v5, 0x5

    invoke-direct {v9, v15, v11, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "GPSTrackRef"

    const/16 v5, 0xe

    move-object/from16 v30, v9

    const/4 v9, 0x2

    invoke-direct {v11, v15, v5, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v15, "GPSTrack"

    const/16 v9, 0xf

    move-object/from16 v31, v11

    const/4 v11, 0x5

    invoke-direct {v5, v15, v9, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v15, "GPSImgDirectionRef"

    const/16 v11, 0x10

    move-object/from16 v32, v5

    const/4 v5, 0x2

    invoke-direct {v9, v15, v11, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "GPSImgDirection"

    const/16 v5, 0x11

    move-object/from16 v33, v9

    const/4 v9, 0x5

    invoke-direct {v11, v15, v5, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v9, "GPSMapDatum"

    const/16 v15, 0x12

    move-object/from16 v34, v11

    const/4 v11, 0x2

    invoke-direct {v5, v9, v15, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v15, "GPSDestLatitudeRef"

    move-object/from16 v35, v5

    const/16 v5, 0x13

    invoke-direct {v9, v15, v5, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v15, "GPSDestLatitude"

    const/16 v11, 0x14

    move-object/from16 v36, v9

    const/4 v9, 0x5

    invoke-direct {v5, v15, v11, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "GPSDestLongitudeRef"

    const/16 v9, 0x15

    move-object/from16 v37, v5

    const/4 v5, 0x2

    invoke-direct {v11, v15, v9, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v15, "GPSDestLongitude"

    const/16 v5, 0x16

    move-object/from16 v38, v11

    const/4 v11, 0x5

    invoke-direct {v9, v15, v5, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v15, "GPSDestBearingRef"

    const/16 v11, 0x17

    move-object/from16 v39, v9

    const/4 v9, 0x2

    invoke-direct {v5, v15, v11, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "GPSDestBearing"

    const/16 v9, 0x18

    move-object/from16 v40, v5

    const/4 v5, 0x5

    invoke-direct {v11, v15, v9, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v15, "GPSDestDistanceRef"

    const/16 v5, 0x19

    move-object/from16 v41, v11

    const/4 v11, 0x2

    invoke-direct {v9, v15, v5, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v11, "GPSDestDistance"

    const/16 v15, 0x1a

    move-object/from16 v42, v9

    const/4 v9, 0x5

    invoke-direct {v5, v11, v15, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v11, "GPSProcessingMethod"

    const/16 v15, 0x1b

    move-object/from16 v43, v5

    const/4 v5, 0x7

    invoke-direct {v9, v11, v15, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "GPSAreaInformation"

    move-object/from16 v44, v9

    const/16 v9, 0x1c

    invoke-direct {v11, v15, v9, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v9, "GPSDateStamp"

    const/16 v15, 0x1d

    move-object/from16 v45, v11

    const/4 v11, 0x2

    invoke-direct {v5, v9, v15, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v11, "GPSDifferential"

    const/16 v15, 0x1e

    move-object/from16 v46, v5

    const/4 v5, 0x3

    invoke-direct {v9, v11, v15, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v11, "GPSHPositioningError"

    const/16 v15, 0x1f

    move-object/from16 v47, v9

    const/4 v9, 0x5

    invoke-direct {v5, v11, v15, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    move-object/from16 v48, v5

    move-object/from16 v23, v12

    move-object/from16 v20, v13

    filled-new-array/range {v17 .. v48}, [Lc4/a$e;

    move-result-object v66

    sput-object v66, Lc4/a;->c0:[Lc4/a$e;

    new-instance v5, Lc4/a$e;

    const-string v9, "InteroperabilityIndex"

    const/4 v11, 0x2

    const/4 v12, 0x1

    invoke-direct {v5, v9, v12, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    filled-new-array {v5}, [Lc4/a$e;

    move-result-object v67

    sput-object v67, Lc4/a;->d0:[Lc4/a$e;

    new-instance v5, Lc4/a$e;

    const-string v9, "NewSubfileType"

    const/16 v11, 0xfe

    const/4 v12, 0x4

    invoke-direct {v5, v9, v11, v12}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v11, "SubfileType"

    const/16 v13, 0xff

    invoke-direct {v9, v11, v13, v12}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v13, "ThumbnailImageWidth"

    move-object/from16 v68, v5

    const/16 v5, 0x100

    const/4 v15, 0x3

    invoke-direct {v11, v13, v5, v15, v12}, Lc4/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v5, Lc4/a$e;

    const-string v13, "ThumbnailImageLength"

    move-object/from16 v69, v9

    const/16 v9, 0x101

    invoke-direct {v5, v13, v9, v15, v12}, Lc4/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v9, Lc4/a$e;

    const-string v12, "BitsPerSample"

    const/16 v13, 0x102

    invoke-direct {v9, v12, v13, v15}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v12, Lc4/a$e;

    const-string v13, "Compression"

    move-object/from16 v71, v5

    const/16 v5, 0x103

    invoke-direct {v12, v13, v5, v15}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v13, "PhotometricInterpretation"

    move-object/from16 v72, v9

    const/16 v9, 0x106

    invoke-direct {v5, v13, v9, v15}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v13, "ImageDescription"

    const/16 v15, 0x10e

    move-object/from16 v74, v5

    const/4 v5, 0x2

    invoke-direct {v9, v13, v15, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v13, Lc4/a$e;

    const-string v15, "Make"

    move-object/from16 v75, v9

    const/16 v9, 0x10f

    invoke-direct {v13, v15, v9, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v15, "Model"

    move-object/from16 v70, v11

    const/16 v11, 0x110

    invoke-direct {v9, v15, v11, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    move-object/from16 v77, v9

    const/16 v9, 0x111

    const/4 v11, 0x3

    const/4 v15, 0x4

    invoke-direct {v5, v2, v9, v11, v15}, Lc4/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v9, Lc4/a$e;

    const-string v15, "ThumbnailOrientation"

    move-object/from16 v78, v5

    const/16 v5, 0x112

    invoke-direct {v9, v15, v5, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v15, "SamplesPerPixel"

    move-object/from16 v79, v9

    const/16 v9, 0x115

    invoke-direct {v5, v15, v9, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v15, "RowsPerStrip"

    move-object/from16 v80, v5

    const/16 v5, 0x116

    move-object/from16 v73, v12

    const/4 v12, 0x4

    invoke-direct {v9, v15, v5, v11, v12}, Lc4/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v5, Lc4/a$e;

    const-string v15, "StripByteCounts"

    move-object/from16 v81, v9

    const/16 v9, 0x117

    invoke-direct {v5, v15, v9, v11, v12}, Lc4/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v9, Lc4/a$e;

    const-string v11, "XResolution"

    const/16 v12, 0x11a

    const/4 v15, 0x5

    invoke-direct {v9, v11, v12, v15}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v12, "YResolution"

    move-object/from16 v82, v5

    const/16 v5, 0x11b

    invoke-direct {v11, v12, v5, v15}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v12, "PlanarConfiguration"

    const/16 v15, 0x11c

    move-object/from16 v83, v9

    const/4 v9, 0x3

    invoke-direct {v5, v12, v15, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v12, Lc4/a$e;

    const-string v15, "ResolutionUnit"

    move-object/from16 v85, v5

    const/16 v5, 0x128

    invoke-direct {v12, v15, v5, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v15, "TransferFunction"

    move-object/from16 v84, v11

    const/16 v11, 0x12d

    invoke-direct {v5, v15, v11, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v11, "Software"

    const/16 v15, 0x131

    move-object/from16 v87, v5

    const/4 v5, 0x2

    invoke-direct {v9, v11, v15, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "DateTime"

    move-object/from16 v88, v9

    const/16 v9, 0x132

    invoke-direct {v11, v15, v9, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v15, "Artist"

    move-object/from16 v89, v11

    const/16 v11, 0x13b

    invoke-direct {v9, v15, v11, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v11, "WhitePoint"

    const/16 v15, 0x13e

    move-object/from16 v90, v9

    const/4 v9, 0x5

    invoke-direct {v5, v11, v15, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "PrimaryChromaticities"

    move-object/from16 v91, v5

    const/16 v5, 0x13f

    invoke-direct {v11, v15, v5, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const/16 v9, 0x14a

    const/4 v15, 0x4

    invoke-direct {v5, v4, v9, v15}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    move-object/from16 v93, v5

    const-string v5, "JPEGInterchangeFormat"

    move-object/from16 v92, v11

    const/16 v11, 0x201

    invoke-direct {v9, v5, v11, v15}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v11, "JPEGInterchangeFormatLength"

    move-object/from16 v94, v9

    const/16 v9, 0x202

    invoke-direct {v5, v11, v9, v15}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v11, "YCbCrCoefficients"

    const/16 v15, 0x211

    move-object/from16 v95, v5

    const/4 v5, 0x5

    invoke-direct {v9, v11, v15, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v11, "YCbCrSubSampling"

    const/16 v15, 0x212

    move-object/from16 v96, v9

    const/4 v9, 0x3

    invoke-direct {v5, v11, v15, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    const-string v15, "YCbCrPositioning"

    move-object/from16 v97, v5

    const/16 v5, 0x213

    invoke-direct {v11, v15, v5, v9}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v9, "ReferenceBlackWhite"

    const/16 v15, 0x214

    move-object/from16 v98, v11

    const/4 v11, 0x5

    invoke-direct {v5, v9, v15, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v11, "Copyright"

    const v15, 0x8298

    move-object/from16 v99, v5

    const/4 v5, 0x2

    invoke-direct {v9, v11, v15, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const v11, 0x8769

    const/4 v15, 0x4

    invoke-direct {v5, v6, v11, v15}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lc4/a$e;

    move-object/from16 v101, v5

    const v5, 0x8825

    invoke-direct {v11, v0, v5, v15}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v15, "DNGVersion"

    move-object/from16 v100, v9

    const v9, 0xc612

    move-object/from16 v102, v11

    const/4 v11, 0x1

    invoke-direct {v5, v15, v9, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v11, "DefaultCropSize"

    const v15, 0xc620

    move-object/from16 v103, v5

    move-object/from16 v86, v12

    const/4 v5, 0x3

    const/4 v12, 0x4

    invoke-direct {v9, v11, v15, v5, v12}, Lc4/a$e;-><init>(Ljava/lang/String;III)V

    move-object/from16 v104, v9

    move-object/from16 v76, v13

    filled-new-array/range {v68 .. v104}, [Lc4/a$e;

    move-result-object v68

    sput-object v68, Lc4/a;->e0:[Lc4/a$e;

    new-instance v9, Lc4/a$e;

    const/16 v11, 0x111

    invoke-direct {v9, v2, v11, v5}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lc4/a;->f0:Lc4/a$e;

    new-instance v2, Lc4/a$e;

    const-string v5, "ThumbnailImage"

    const/16 v9, 0x100

    const/4 v11, 0x7

    invoke-direct {v2, v5, v9, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v9, "CameraSettingsIFDPointer"

    const/16 v11, 0x2020

    const/4 v12, 0x4

    invoke-direct {v5, v9, v11, v12}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v11, "ImageProcessingIFDPointer"

    const/16 v13, 0x2040

    invoke-direct {v9, v11, v13, v12}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    filled-new-array {v2, v5, v9}, [Lc4/a$e;

    move-result-object v70

    sput-object v70, Lc4/a;->g0:[Lc4/a$e;

    new-instance v2, Lc4/a$e;

    const-string v5, "PreviewImageStart"

    const/16 v9, 0x101

    invoke-direct {v2, v5, v9, v12}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const-string v9, "PreviewImageLength"

    const/16 v13, 0x102

    invoke-direct {v5, v9, v13, v12}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    filled-new-array {v2, v5}, [Lc4/a$e;

    move-result-object v71

    sput-object v71, Lc4/a;->h0:[Lc4/a$e;

    new-instance v2, Lc4/a$e;

    const-string v5, "AspectFrame"

    const/16 v9, 0x1113

    const/4 v11, 0x3

    invoke-direct {v2, v5, v9, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    filled-new-array {v2}, [Lc4/a$e;

    move-result-object v72

    sput-object v72, Lc4/a;->i0:[Lc4/a$e;

    new-instance v2, Lc4/a$e;

    const-string v5, "ColorSpace"

    const/16 v9, 0x37

    invoke-direct {v2, v5, v9, v11}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    filled-new-array {v2}, [Lc4/a$e;

    move-result-object v73

    sput-object v73, Lc4/a;->j0:[Lc4/a$e;

    move-object/from16 v69, v64

    filled-new-array/range {v64 .. v73}, [[Lc4/a$e;

    move-result-object v2

    sput-object v2, Lc4/a;->k0:[[Lc4/a$e;

    new-instance v15, Lc4/a$e;

    const/16 v9, 0x14a

    const/4 v12, 0x4

    invoke-direct {v15, v4, v9, v12}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v4, Lc4/a$e;

    const v11, 0x8769

    invoke-direct {v4, v6, v11, v12}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lc4/a$e;

    const v6, 0x8825

    invoke-direct {v5, v0, v6, v12}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lc4/a$e;

    const-string v6, "InteroperabilityIFDPointer"

    const v9, 0xa005

    invoke-direct {v0, v6, v9, v12}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v6, Lc4/a$e;

    const-string v9, "CameraSettingsIFDPointer"

    const/16 v11, 0x2020

    const/4 v12, 0x1

    invoke-direct {v6, v9, v11, v12}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lc4/a$e;

    const-string v11, "ImageProcessingIFDPointer"

    const/16 v13, 0x2040

    invoke-direct {v9, v11, v13, v12}, Lc4/a$e;-><init>(Ljava/lang/String;II)V

    move-object/from16 v18, v0

    move-object/from16 v16, v4

    move-object/from16 v17, v5

    move-object/from16 v19, v6

    move-object/from16 v20, v9

    filled-new-array/range {v15 .. v20}, [Lc4/a$e;

    move-result-object v0

    sput-object v0, Lc4/a;->l0:[Lc4/a$e;

    array-length v0, v2

    new-array v0, v0, [Ljava/util/HashMap;

    sput-object v0, Lc4/a;->m0:[Ljava/util/HashMap;

    array-length v0, v2

    new-array v0, v0, [Ljava/util/HashMap;

    sput-object v0, Lc4/a;->n0:[Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashSet;

    const-string v2, "ExposureTime"

    const-string v4, "SubjectDistance"

    const-string v5, "FNumber"

    const-string v6, "DigitalZoomRatio"

    filled-new-array {v5, v6, v2, v4}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lc4/a;->o0:Ljava/util/Set;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lc4/a;->p0:Ljava/util/HashMap;

    const-string v0, "US-ASCII"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lc4/a;->q0:Ljava/nio/charset/Charset;

    const-string v2, "Exif\u0000\u0000"

    invoke-virtual {v2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    sput-object v2, Lc4/a;->r0:[B

    const-string v2, "http://ns.adobe.com/xap/1.0/\u0000"

    invoke-virtual {v2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    sput-object v0, Lc4/a;->s0:[B

    new-instance v0, Ljava/text/SimpleDateFormat;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "yyyy:MM:dd HH:mm:ss"

    invoke-direct {v0, v4, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, Lc4/a;->V:Ljava/text/SimpleDateFormat;

    const-string v4, "UTC"

    invoke-static {v4}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v4, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v0, v4, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, Lc4/a;->W:Ljava/text/SimpleDateFormat;

    const-string v2, "UTC"

    invoke-static {v2}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    move/from16 v0, v49

    :goto_0
    sget-object v2, Lc4/a;->k0:[[Lc4/a$e;

    array-length v4, v2

    if-ge v0, v4, :cond_1

    sget-object v4, Lc4/a;->m0:[Ljava/util/HashMap;

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    aput-object v5, v4, v0

    sget-object v4, Lc4/a;->n0:[Ljava/util/HashMap;

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    aput-object v5, v4, v0

    aget-object v2, v2, v0

    array-length v4, v2

    move/from16 v5, v49

    :goto_1
    if-ge v5, v4, :cond_0

    aget-object v6, v2, v5

    sget-object v9, Lc4/a;->m0:[Ljava/util/HashMap;

    aget-object v9, v9, v0

    iget v11, v6, Lc4/a$e;->a:I

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v9, v11, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v9, Lc4/a;->n0:[Ljava/util/HashMap;

    aget-object v9, v9, v0

    iget-object v11, v6, Lc4/a$e;->b:Ljava/lang/String;

    invoke-virtual {v9, v11, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    sget-object v0, Lc4/a;->p0:Ljava/util/HashMap;

    sget-object v2, Lc4/a;->l0:[Lc4/a$e;

    aget-object v4, v2, v49

    iget v4, v4, Lc4/a$e;->a:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v59, 0x1

    aget-object v4, v2, v59

    iget v4, v4, Lc4/a$e;->a:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v62, 0x2

    aget-object v3, v2, v62

    iget v3, v3, Lc4/a$e;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v63, 0x3

    aget-object v3, v2, v63

    iget v3, v3, Lc4/a$e;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v61, 0x4

    aget-object v1, v2, v61

    iget v1, v1, Lc4/a$e;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v60, 0x5

    aget-object v1, v2, v60

    iget v1, v1, Lc4/a$e;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, ".*[1-9].*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lc4/a;->t0:Ljava/util/regex/Pattern;

    const-string v0, "^(\\d{2}):(\\d{2}):(\\d{2})$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lc4/a;->u0:Ljava/util/regex/Pattern;

    const-string v0, "^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lc4/a;->v0:Ljava/util/regex/Pattern;

    const-string v0, "^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lc4/a;->w0:Ljava/util/regex/Pattern;

    return-void

    nop

    :array_0
    .array-data 1
        -0x1t
        -0x28t
        -0x1t
    .end array-data

    :array_1
    .array-data 1
        0x66t
        0x74t
        0x79t
        0x70t
    .end array-data

    :array_2
    .array-data 1
        0x6dt
        0x69t
        0x66t
        0x31t
    .end array-data

    :array_3
    .array-data 1
        0x68t
        0x65t
        0x69t
        0x63t
    .end array-data

    :array_4
    .array-data 1
        0x61t
        0x76t
        0x69t
        0x66t
    .end array-data

    :array_5
    .array-data 1
        0x61t
        0x76t
        0x69t
        0x73t
    .end array-data

    :array_6
    .array-data 1
        0x4ft
        0x4ct
        0x59t
        0x4dt
        0x50t
        0x0t
    .end array-data

    nop

    :array_7
    .array-data 1
        0x4ft
        0x4ct
        0x59t
        0x4dt
        0x50t
        0x55t
        0x53t
        0x0t
        0x49t
        0x49t
    .end array-data

    nop

    :array_8
    .array-data 1
        -0x77t
        0x50t
        0x4et
        0x47t
        0xdt
        0xat
        0x1at
        0xat
    .end array-data

    :array_9
    .array-data 1
        0x52t
        0x49t
        0x46t
        0x46t
    .end array-data

    :array_a
    .array-data 1
        0x57t
        0x45t
        0x42t
        0x50t
    .end array-data

    :array_b
    .array-data 1
        0x45t
        0x58t
        0x49t
        0x46t
    .end array-data

    :array_c
    .array-data 1
        -0x63t
        0x1t
        0x2at
    .end array-data

    :array_d
    .array-data 4
        0x0
        0x1
        0x1
        0x2
        0x4
        0x8
        0x1
        0x1
        0x2
        0x4
        0x8
        0x4
        0x8
        0x1
    .end array-data

    :array_e
    .array-data 1
        0x41t
        0x53t
        0x43t
        0x49t
        0x49t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, p1, v0}, Lc4/a;-><init>(Ljava/io/InputStream;I)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 2

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    sget-object v0, Lc4/a;->k0:[[Lc4/a$e;

    array-length v1, v0

    new-array v1, v1, [Ljava/util/HashMap;

    iput-object v1, p0, Lc4/a;->f:[Ljava/util/HashMap;

    .line 10
    new-instance v1, Ljava/util/HashSet;

    array-length v0, v0

    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(I)V

    iput-object v1, p0, Lc4/a;->g:Ljava/util/Set;

    .line 11
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    iput-object v0, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    if-eqz p1, :cond_4

    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lc4/a;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-ne p2, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 13
    :goto_0
    iput-boolean v1, p0, Lc4/a;->e:Z

    if-eqz v1, :cond_1

    .line 14
    iput-object v0, p0, Lc4/a;->c:Landroid/content/res/AssetManager$AssetInputStream;

    .line 15
    iput-object v0, p0, Lc4/a;->b:Ljava/io/FileDescriptor;

    goto :goto_1

    .line 16
    :cond_1
    instance-of p2, p1, Landroid/content/res/AssetManager$AssetInputStream;

    if-eqz p2, :cond_2

    .line 17
    move-object p2, p1

    check-cast p2, Landroid/content/res/AssetManager$AssetInputStream;

    iput-object p2, p0, Lc4/a;->c:Landroid/content/res/AssetManager$AssetInputStream;

    .line 18
    iput-object v0, p0, Lc4/a;->b:Ljava/io/FileDescriptor;

    goto :goto_1

    .line 19
    :cond_2
    instance-of p2, p1, Ljava/io/FileInputStream;

    if-eqz p2, :cond_3

    move-object p2, p1

    check-cast p2, Ljava/io/FileInputStream;

    .line 20
    invoke-virtual {p2}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-static {v1}, Lc4/a;->O(Ljava/io/FileDescriptor;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 21
    iput-object v0, p0, Lc4/a;->c:Landroid/content/res/AssetManager$AssetInputStream;

    .line 22
    invoke-virtual {p2}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object p2

    iput-object p2, p0, Lc4/a;->b:Ljava/io/FileDescriptor;

    goto :goto_1

    .line 23
    :cond_3
    iput-object v0, p0, Lc4/a;->c:Landroid/content/res/AssetManager$AssetInputStream;

    .line 24
    iput-object v0, p0, Lc4/a;->b:Ljava/io/FileDescriptor;

    .line 25
    :goto_1
    invoke-virtual {p0, p1}, Lc4/a;->T(Ljava/io/InputStream;)V

    return-void

    .line 26
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "inputStream cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lc4/a;->k0:[[Lc4/a$e;

    array-length v1, v0

    new-array v1, v1, [Ljava/util/HashMap;

    iput-object v1, p0, Lc4/a;->f:[Ljava/util/HashMap;

    .line 3
    new-instance v1, Ljava/util/HashSet;

    array-length v0, v0

    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(I)V

    iput-object v1, p0, Lc4/a;->g:Ljava/util/Set;

    .line 4
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    iput-object v0, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    if-eqz p1, :cond_0

    .line 5
    invoke-virtual {p0, p1}, Lc4/a;->G(Ljava/lang/String;)V

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "filename cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static C(I)I
    .locals 1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/16 v0, 0x9

    if-eq p0, v0, :cond_0

    const/16 v0, 0xf

    if-eq p0, v0, :cond_0

    const/16 v0, 0xc

    if-eq p0, v0, :cond_0

    const/16 v0, 0xd

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x2

    return p0

    :cond_1
    const/4 p0, 0x3

    return p0
.end method

.method public static D(Ljava/lang/String;)Landroid/util/Pair;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xa

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, -0x1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v7, ","

    invoke-virtual {p0, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eqz v8, :cond_9

    invoke-virtual {p0, v7, v5}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    aget-object v0, p0, v9

    invoke-static {v0}, Lc4/a;->D(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v0

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v3, :cond_0

    return-object v0

    :cond_0
    :goto_0
    array-length v1, p0

    if-ge v10, v1, :cond_8

    aget-object v1, p0, v10

    invoke-static {v1}, Lc4/a;->D(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v1

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    iget-object v3, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    iget-object v3, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move v2, v5

    goto :goto_2

    :cond_2
    :goto_1
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :goto_2
    iget-object v3, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-eq v3, v5, :cond_4

    iget-object v3, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    iget-object v7, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    invoke-virtual {v3, v7}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    iget-object v3, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_3
    iget-object v1, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_3

    :cond_4
    move v1, v5

    :goto_3
    if-ne v2, v5, :cond_5

    if-ne v1, v5, :cond_5

    new-instance p0, Landroid/util/Pair;

    invoke-direct {p0, v4, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_5
    if-ne v2, v5, :cond_6

    new-instance v0, Landroid/util/Pair;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_4

    :cond_6
    if-ne v1, v5, :cond_7

    new-instance v0, Landroid/util/Pair;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_7
    :goto_4
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_8
    return-object v0

    :cond_9
    const-string v7, "/"

    invoke-virtual {p0, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    const-wide/16 v11, 0x0

    if-eqz v8, :cond_f

    invoke-virtual {p0, v7, v5}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    array-length v0, p0

    if-ne v0, v3, :cond_e

    :try_start_0
    aget-object v0, p0, v9

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v7

    double-to-long v7, v7

    aget-object p0, p0, v10

    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v9

    double-to-long v9, v9

    cmp-long p0, v7, v11

    if-ltz p0, :cond_d

    cmp-long p0, v9, v11

    if-gez p0, :cond_a

    goto :goto_6

    :cond_a
    const-wide/32 v11, 0x7fffffff

    cmp-long p0, v7, v11

    if-gtz p0, :cond_c

    cmp-long p0, v9, v11

    if-lez p0, :cond_b

    goto :goto_5

    :cond_b
    new-instance p0, Landroid/util/Pair;

    invoke-direct {p0, v2, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_c
    :goto_5
    new-instance p0, Landroid/util/Pair;

    invoke-direct {p0, v1, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_d
    :goto_6
    new-instance p0, Landroid/util/Pair;

    invoke-direct {p0, v2, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_e
    new-instance p0, Landroid/util/Pair;

    invoke-direct {p0, v4, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_f
    :try_start_1
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    cmp-long v3, v1, v11

    if-ltz v3, :cond_10

    const-wide/32 v7, 0xffff

    cmp-long v1, v1, v7

    if-gtz v1, :cond_10

    new-instance v1, Landroid/util/Pair;

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :cond_10
    if-gez v3, :cond_11

    new-instance v0, Landroid/util/Pair;

    const/16 v1, 0x9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_11
    new-instance v1, Landroid/util/Pair;

    invoke-direct {v1, v0, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v1

    :catch_1
    :try_start_2
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    new-instance p0, Landroid/util/Pair;

    const/16 v0, 0xc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p0, v0, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    return-object p0

    :catch_2
    new-instance p0, Landroid/util/Pair;

    invoke-direct {p0, v4, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

.method public static J([B)Z
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    sget-object v2, Lc4/a;->C:[B

    array-length v3, v2

    if-ge v1, v3, :cond_1

    aget-byte v3, p0, v1

    aget-byte v2, v2, v1

    if-eq v3, v2, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static O(Ljava/io/FileDescriptor;)Z
    .locals 3

    :try_start_0
    sget v0, Landroid/system/OsConstants;->SEEK_CUR:I

    const-wide/16 v1, 0x0

    invoke-static {p0, v1, v2, v0}, Landroid/system/Os;->lseek(Ljava/io/FileDescriptor;JI)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    sget-boolean p0, Lc4/a;->w:Z

    if-eqz p0, :cond_0

    const-string p0, "ExifInterface"

    const-string v0, "The file descriptor for the given input is not seekable"

    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static Q(I)Z
    .locals 1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/16 v0, 0xd

    if-eq p0, v0, :cond_1

    const/16 v0, 0xe

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic a()[I
    .locals 1

    sget-object v0, Lc4/a;->Y:[I

    return-object v0
.end method

.method public static synthetic b()Ljava/nio/charset/Charset;
    .locals 1

    sget-object v0, Lc4/a;->q0:Ljava/nio/charset/Charset;

    return-object v0
.end method

.method public static synthetic c()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lc4/a;->X:[Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic d()[B
    .locals 1

    sget-object v0, Lc4/a;->Z:[B

    return-object v0
.end method

.method public static g(Ljava/lang/String;Ljava/lang/String;)D
    .locals 11

    const-string v0, "/"

    :try_start_0
    const-string v1, ","

    const/4 v2, -0x1

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    aget-object v3, p0, v1

    invoke-virtual {v3, v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v3

    aget-object v4, v3, v1

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v4

    const/4 v6, 0x1

    aget-object v3, v3, v6

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v7

    div-double/2addr v4, v7

    aget-object v3, p0, v6

    invoke-virtual {v3, v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v3

    aget-object v7, v3, v1

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v7

    aget-object v3, v3, v6

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v9

    div-double/2addr v7, v9

    const/4 v3, 0x2

    aget-object p0, p0, v3

    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    aget-object v0, p0, v1

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    aget-object p0, p0, v6

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x404e000000000000L    # 60.0

    div-double/2addr v7, v2

    add-double/2addr v4, v7

    const-wide v2, 0x40ac200000000000L    # 3600.0

    div-double/2addr v0, v2

    add-double/2addr v4, v0

    const-string p0, "S"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    const-string p0, "W"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_1

    :cond_0
    const-string p0, "N"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "E"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_0
    return-wide v4

    :cond_3
    :goto_1
    neg-double p0, v4

    return-wide p0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static l0(I)Z
    .locals 1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/16 v0, 0x9

    if-eq p0, v0, :cond_1

    const/16 v0, 0xd

    if-eq p0, v0, :cond_1

    const/16 v0, 0xe

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static n0(Ljava/util/zip/CRC32;I)V
    .locals 1

    ushr-int/lit8 v0, p1, 0x18

    invoke-virtual {p0, v0}, Ljava/util/zip/CRC32;->update(I)V

    ushr-int/lit8 v0, p1, 0x10

    invoke-virtual {p0, v0}, Ljava/util/zip/CRC32;->update(I)V

    ushr-int/lit8 v0, p1, 0x8

    invoke-virtual {p0, v0}, Ljava/util/zip/CRC32;->update(I)V

    invoke-virtual {p0, p1}, Ljava/util/zip/CRC32;->update(I)V

    return-void
.end method


# virtual methods
.method public A()[B
    .locals 8

    const-string v0, "ExifInterface"

    iget-boolean v1, p0, Lc4/a;->i:Z

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    iget-object v1, p0, Lc4/a;->n:[B

    if-eqz v1, :cond_1

    return-object v1

    :cond_1
    :try_start_0
    iget-object v1, p0, Lc4/a;->c:Landroid/content/res/AssetManager$AssetInputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_3

    :try_start_1
    invoke-virtual {v1}, Ljava/io/InputStream;->markSupported()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v1}, Ljava/io/InputStream;->reset()V

    :goto_0
    move-object v3, v2

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object v3, v2

    :goto_1
    move-object v2, v1

    goto/16 :goto_4

    :catch_0
    move-exception v3

    move-object v4, v3

    move-object v3, v2

    goto/16 :goto_3

    :cond_2
    const-string v3, "Cannot read thumbnail from inputstream without mark/reset support"

    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v1}, Lc4/b;->b(Ljava/io/Closeable;)V

    return-object v2

    :cond_3
    :try_start_2
    iget-object v1, p0, Lc4/a;->a:Ljava/lang/String;

    if-eqz v1, :cond_4

    new-instance v1, Ljava/io/FileInputStream;

    iget-object v3, p0, Lc4/a;->a:Ljava/lang/String;

    invoke-direct {v1, v3}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v3, v2

    goto :goto_4

    :catch_1
    move-exception v3

    move-object v1, v2

    move-object v4, v3

    move-object v3, v1

    goto :goto_3

    :cond_4
    iget-object v1, p0, Lc4/a;->b:Ljava/io/FileDescriptor;

    invoke-static {v1}, Landroid/system/Os;->dup(Ljava/io/FileDescriptor;)Ljava/io/FileDescriptor;

    move-result-object v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    sget v3, Landroid/system/OsConstants;->SEEK_SET:I

    const-wide/16 v4, 0x0

    invoke-static {v1, v4, v5, v3}, Landroid/system/Os;->lseek(Ljava/io/FileDescriptor;JI)J

    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    move-object v7, v3

    move-object v3, v1

    move-object v1, v7

    :goto_2
    :try_start_4
    new-instance v4, Lc4/a$b;

    invoke-direct {v4, v1}, Lc4/a$b;-><init>(Ljava/io/InputStream;)V

    iget v5, p0, Lc4/a;->l:I

    iget v6, p0, Lc4/a;->p:I

    add-int/2addr v5, v6

    invoke-virtual {v4, v5}, Lc4/a$b;->f(I)V

    iget v5, p0, Lc4/a;->m:I

    new-array v5, v5, [B

    invoke-virtual {v4, v5}, Lc4/a$b;->readFully([B)V

    iput-object v5, p0, Lc4/a;->n:[B
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    invoke-static {v1}, Lc4/b;->b(Ljava/io/Closeable;)V

    if-eqz v3, :cond_5

    invoke-static {v3}, Lc4/b;->a(Ljava/io/FileDescriptor;)V

    :cond_5
    return-object v5

    :catchall_2
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v4

    goto :goto_3

    :catchall_3
    move-exception v0

    move-object v3, v1

    goto :goto_4

    :catch_3
    move-exception v3

    move-object v4, v3

    move-object v3, v1

    move-object v1, v2

    :goto_3
    :try_start_5
    const-string v5, "Encountered exception while getting thumbnail"

    invoke-static {v0, v5, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    invoke-static {v1}, Lc4/b;->b(Ljava/io/Closeable;)V

    if-eqz v3, :cond_6

    invoke-static {v3}, Lc4/b;->a(Ljava/io/FileDescriptor;)V

    :cond_6
    return-object v2

    :goto_4
    invoke-static {v2}, Lc4/b;->b(Ljava/io/Closeable;)V

    if-eqz v3, :cond_7

    invoke-static {v3}, Lc4/b;->a(Ljava/io/FileDescriptor;)V

    :cond_7
    throw v0
.end method

.method public final B(Lc4/a$b;)V
    .locals 5

    sget-boolean v0, Lc4/a;->w:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getWebpAttributes starting with: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExifInterface"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Lc4/a$b;->e(Ljava/nio/ByteOrder;)V

    sget-object v0, Lc4/a;->M:[B

    array-length v0, v0

    invoke-virtual {p1, v0}, Lc4/a$b;->f(I)V

    invoke-virtual {p1}, Lc4/a$b;->readInt()I

    move-result v0

    add-int/lit8 v0, v0, 0x8

    sget-object v1, Lc4/a;->N:[B

    array-length v2, v1

    invoke-virtual {p1, v2}, Lc4/a$b;->f(I)V

    array-length v1, v1

    add-int/lit8 v1, v1, 0x8

    :goto_0
    const/4 v2, 0x4

    :try_start_0
    new-array v2, v2, [B

    invoke-virtual {p1, v2}, Lc4/a$b;->readFully([B)V

    invoke-virtual {p1}, Lc4/a$b;->readInt()I

    move-result v3

    add-int/lit8 v1, v1, 0x8

    sget-object v4, Lc4/a;->O:[B

    invoke-static {v4, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-eqz v2, :cond_2

    new-array v0, v3, [B

    invoke-virtual {p1, v0}, Lc4/a$b;->readFully([B)V

    sget-object p1, Lc4/a;->r0:[B

    invoke-static {v0, p1}, Lc4/b;->f([B[B)Z

    move-result v2

    if-eqz v2, :cond_1

    array-length p1, p1

    invoke-static {v0, p1, v3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_1
    iput v1, p0, Lc4/a;->p:I

    const/4 p1, 0x0

    invoke-virtual {p0, v0, p1}, Lc4/a;->X([BI)V

    new-instance p1, Lc4/a$b;

    invoke-direct {p1, v0}, Lc4/a$b;-><init>([B)V

    invoke-virtual {p0, p1}, Lc4/a;->k0(Lc4/a$b;)V

    return-void

    :cond_2
    rem-int/lit8 v2, v3, 0x2

    const/4 v4, 0x1

    if-ne v2, v4, :cond_3

    add-int/lit8 v3, v3, 0x1

    :cond_3
    add-int/2addr v1, v3

    if-ne v1, v0, :cond_4

    return-void

    :cond_4
    if-gt v1, v0, :cond_5

    invoke-virtual {p1, v3}, Lc4/a$b;->f(I)V

    goto :goto_0

    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Encountered WebP file with invalid chunk size"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Encountered corrupt WebP file."

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final E(Lc4/a$b;Ljava/util/HashMap;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc4/a$b;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lc4/a$d;",
            ">;)V"
        }
    .end annotation

    const-string v0, "JPEGInterchangeFormat"

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc4/a$d;

    const-string v1, "JPEGInterchangeFormatLength"

    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lc4/a$d;

    if-eqz v0, :cond_3

    if-eqz p2, :cond_3

    iget-object v1, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Lc4/a$d;->m(Ljava/nio/ByteOrder;)I

    move-result v0

    iget-object v1, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {p2, v1}, Lc4/a$d;->m(Ljava/nio/ByteOrder;)I

    move-result p2

    iget v1, p0, Lc4/a;->d:I

    const/4 v2, 0x7

    if-ne v1, v2, :cond_0

    iget v1, p0, Lc4/a;->q:I

    add-int/2addr v0, v1

    :cond_0
    if-lez v0, :cond_2

    if-lez p2, :cond_2

    const/4 v1, 0x1

    iput-boolean v1, p0, Lc4/a;->i:Z

    iget-object v1, p0, Lc4/a;->a:Ljava/lang/String;

    if-nez v1, :cond_1

    iget-object v1, p0, Lc4/a;->c:Landroid/content/res/AssetManager$AssetInputStream;

    if-nez v1, :cond_1

    iget-object v1, p0, Lc4/a;->b:Ljava/io/FileDescriptor;

    if-nez v1, :cond_1

    new-array v1, p2, [B

    invoke-virtual {p1, v0}, Lc4/a$b;->f(I)V

    invoke-virtual {p1, v1}, Lc4/a$b;->readFully([B)V

    iput-object v1, p0, Lc4/a;->n:[B

    :cond_1
    iput v0, p0, Lc4/a;->l:I

    iput p2, p0, Lc4/a;->m:I

    :cond_2
    sget-boolean p1, Lc4/a;->w:Z

    if-eqz p1, :cond_3

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Setting thumbnail attributes with offset: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", length: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ExifInterface"

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    return-void
.end method

.method public final F(Lc4/a$b;Ljava/util/HashMap;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc4/a$b;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lc4/a$d;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, " bytes."

    const-string v4, "StripOffsets"

    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc4/a$d;

    const-string v5, "StripByteCounts"

    invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc4/a$d;

    if-eqz v4, :cond_a

    if-eqz v2, :cond_a

    iget-object v5, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v4, v5}, Lc4/a$d;->o(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lc4/b;->c(Ljava/lang/Object;)[J

    move-result-object v4

    iget-object v5, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v2, v5}, Lc4/a$d;->o(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lc4/b;->c(Ljava/lang/Object;)[J

    move-result-object v2

    const-string v5, "ExifInterface"

    if-eqz v4, :cond_9

    array-length v6, v4

    if-nez v6, :cond_0

    goto/16 :goto_4

    :cond_0
    if-eqz v2, :cond_8

    array-length v6, v2

    if-nez v6, :cond_1

    goto/16 :goto_3

    :cond_1
    array-length v6, v4

    array-length v7, v2

    if-eq v6, v7, :cond_2

    const-string v1, "stripOffsets and stripByteCounts should have same length."

    invoke-static {v5, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_2
    array-length v6, v2

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    move v10, v7

    :goto_0
    if-ge v10, v6, :cond_3

    aget-wide v11, v2, v10

    add-long/2addr v8, v11

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_3
    long-to-int v6, v8

    new-array v8, v6, [B

    const/4 v9, 0x1

    iput-boolean v9, v0, Lc4/a;->k:Z

    iput-boolean v9, v0, Lc4/a;->j:Z

    iput-boolean v9, v0, Lc4/a;->i:Z

    move v10, v7

    move v11, v10

    move v12, v11

    :goto_1
    array-length v13, v4

    if-ge v10, v13, :cond_7

    aget-wide v13, v4, v10

    long-to-int v13, v13

    aget-wide v14, v2, v10

    long-to-int v14, v14

    array-length v15, v4

    sub-int/2addr v15, v9

    if-ge v10, v15, :cond_4

    add-int v15, v13, v14

    move/from16 v16, v10

    int-to-long v9, v15

    add-int/lit8 v15, v16, 0x1

    aget-wide v17, v4, v15

    cmp-long v9, v9, v17

    if-eqz v9, :cond_5

    iput-boolean v7, v0, Lc4/a;->k:Z

    goto :goto_2

    :cond_4
    move/from16 v16, v10

    :cond_5
    :goto_2
    sub-int/2addr v13, v11

    if-gez v13, :cond_6

    const-string v1, "Invalid strip offset value"

    invoke-static {v5, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_6
    :try_start_0
    invoke-virtual {v1, v13}, Lc4/a$b;->f(I)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_1

    add-int/2addr v11, v13

    new-array v9, v14, [B

    :try_start_1
    invoke-virtual {v1, v9}, Lc4/a$b;->readFully([B)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0

    add-int/2addr v11, v14

    invoke-static {v9, v7, v8, v12, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v12, v14

    add-int/lit8 v10, v16, 0x1

    const/4 v9, 0x1

    goto :goto_1

    :catch_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to read "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :catch_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to skip "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_7
    iput-object v8, v0, Lc4/a;->n:[B

    iget-boolean v1, v0, Lc4/a;->k:Z

    if-eqz v1, :cond_a

    aget-wide v1, v4, v7

    long-to-int v1, v1

    iput v1, v0, Lc4/a;->l:I

    iput v6, v0, Lc4/a;->m:I

    return-void

    :cond_8
    :goto_3
    const-string v1, "stripByteCounts should not be null or have zero length."

    invoke-static {v5, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_9
    :goto_4
    const-string v1, "stripOffsets should not be null or have zero length."

    invoke-static {v5, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_a
    return-void
.end method

.method public final G(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    iput-object v0, p0, Lc4/a;->c:Landroid/content/res/AssetManager$AssetInputStream;

    iput-object p1, p0, Lc4/a;->a:Ljava/lang/String;

    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v1}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object p1

    invoke-static {p1}, Lc4/a;->O(Ljava/io/FileDescriptor;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v1}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object p1

    iput-object p1, p0, Lc4/a;->b:Ljava/io/FileDescriptor;

    goto :goto_0

    :catchall_0
    move-exception p1

    move-object v0, v1

    goto :goto_1

    :cond_0
    iput-object v0, p0, Lc4/a;->b:Ljava/io/FileDescriptor;

    :goto_0
    invoke-virtual {p0, v1}, Lc4/a;->T(Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v1}, Lc4/b;->b(Ljava/io/Closeable;)V

    return-void

    :catchall_1
    move-exception p1

    :goto_1
    invoke-static {v0}, Lc4/b;->b(Ljava/io/Closeable;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "filename cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public H()Z
    .locals 3

    const-string v0, "Orientation"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lc4/a;->m(Ljava/lang/String;I)I

    move-result v0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    const/4 v2, 0x7

    if-eq v0, v2, :cond_0

    const/4 v2, 0x4

    if-eq v0, v2, :cond_0

    const/4 v2, 0x5

    if-eq v0, v2, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    return v1
.end method

.method public final I([B)I
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Lc4/a$b;

    invoke-direct {v2, p1}, Lc4/a$b;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v2}, Lc4/a$b;->readInt()I

    move-result v1

    int-to-long v3, v1

    const/4 v1, 0x4

    new-array v5, v1, [B

    invoke-virtual {v2, v5}, Lc4/a$b;->readFully([B)V

    sget-object v6, Lc4/a;->D:[B

    invoke-static {v5, v6}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v5, :cond_0

    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    return v0

    :cond_0
    const-wide/16 v5, 0x1

    cmp-long v7, v3, v5

    const-wide/16 v8, 0x8

    if-nez v7, :cond_1

    :try_start_2
    invoke-virtual {v2}, Lc4/a$b;->readLong()J

    move-result-wide v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-wide/16 v10, 0x10

    cmp-long v7, v3, v10

    if-gez v7, :cond_2

    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    return v0

    :catchall_0
    move-exception p1

    move-object v1, v2

    goto/16 :goto_5

    :catch_0
    move-exception p1

    move-object v1, v2

    goto/16 :goto_3

    :cond_1
    move-wide v10, v8

    :cond_2
    :try_start_3
    array-length v7, p1

    int-to-long v12, v7

    cmp-long v7, v3, v12

    if-lez v7, :cond_3

    array-length p1, p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    int-to-long v3, p1

    :cond_3
    sub-long/2addr v3, v10

    cmp-long p1, v3, v8

    if-gez p1, :cond_4

    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    return v0

    :cond_4
    :try_start_4
    new-array p1, v1, [B

    const-wide/16 v7, 0x0

    move v1, v0

    move v9, v1

    move v10, v9

    :goto_0
    const-wide/16 v11, 0x4

    div-long v11, v3, v11
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    cmp-long v11, v7, v11

    if-gez v11, :cond_c

    :try_start_5
    invoke-virtual {v2, p1}, Lc4/a$b;->readFully([B)V
    :try_end_5
    .catch Ljava/io/EOFException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    cmp-long v11, v7, v5

    if-nez v11, :cond_5

    goto :goto_2

    :cond_5
    :try_start_6
    sget-object v11, Lc4/a;->E:[B

    invoke-static {p1, v11}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v11

    const/4 v12, 0x1

    if-eqz v11, :cond_6

    move v1, v12

    goto :goto_1

    :cond_6
    sget-object v11, Lc4/a;->F:[B

    invoke-static {p1, v11}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v11

    if-eqz v11, :cond_7

    move v9, v12

    goto :goto_1

    :cond_7
    sget-object v11, Lc4/a;->G:[B

    invoke-static {p1, v11}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v11

    if-nez v11, :cond_8

    sget-object v11, Lc4/a;->H:[B

    invoke-static {p1, v11}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v11
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-eqz v11, :cond_9

    :cond_8
    move v10, v12

    :cond_9
    :goto_1
    if-eqz v1, :cond_b

    if-eqz v9, :cond_a

    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    const/16 p1, 0xc

    return p1

    :cond_a
    if-eqz v10, :cond_b

    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    const/16 p1, 0xf

    return p1

    :cond_b
    :goto_2
    add-long/2addr v7, v5

    goto :goto_0

    :catch_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    return v0

    :cond_c
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    goto :goto_4

    :catchall_1
    move-exception p1

    goto :goto_5

    :catch_2
    move-exception p1

    :goto_3
    :try_start_7
    sget-boolean v2, Lc4/a;->w:Z

    if-eqz v2, :cond_d

    const-string v2, "ExifInterface"

    const-string v3, "Exception parsing HEIF file type box."

    invoke-static {v2, v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :cond_d
    if-eqz v1, :cond_e

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    :cond_e
    :goto_4
    return v0

    :goto_5
    if-eqz v1, :cond_f

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    :cond_f
    throw p1
.end method

.method public final K([B)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Lc4/a$b;

    invoke-direct {v2, p1}, Lc4/a$b;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p0, v2}, Lc4/a;->W(Lc4/a$b;)Ljava/nio/ByteOrder;

    move-result-object p1

    iput-object p1, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v2, p1}, Lc4/a$b;->e(Ljava/nio/ByteOrder;)V

    invoke-virtual {v2}, Lc4/a$b;->readShort()S

    move-result p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/16 v1, 0x4f52

    if-eq p1, v1, :cond_0

    const/16 v1, 0x5352

    if-ne p1, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :cond_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    return v0

    :catchall_0
    move-exception p1

    move-object v1, v2

    goto :goto_0

    :catch_0
    move-object v1, v2

    goto :goto_1

    :catchall_1
    move-exception p1

    :goto_0
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    :cond_2
    throw p1

    :catch_1
    :goto_1
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    :cond_3
    return v0
.end method

.method public final L([B)Z
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    sget-object v2, Lc4/a;->K:[B

    array-length v3, v2

    if-ge v1, v3, :cond_1

    aget-byte v3, p1, v1

    aget-byte v2, v2, v1

    if-eq v3, v2, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final M([B)Z
    .locals 5

    const-string v0, "FUJIFILMCCD-RAW"

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_1

    aget-byte v3, p1, v2

    aget-byte v4, v0, v2

    if-eq v3, v4, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final N([B)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Lc4/a$b;

    invoke-direct {v2, p1}, Lc4/a$b;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p0, v2}, Lc4/a;->W(Lc4/a$b;)Ljava/nio/ByteOrder;

    move-result-object p1

    iput-object p1, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v2, p1}, Lc4/a$b;->e(Ljava/nio/ByteOrder;)V

    invoke-virtual {v2}, Lc4/a$b;->readShort()S

    move-result p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/16 v1, 0x55

    if-ne p1, v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    return v0

    :catchall_0
    move-exception p1

    move-object v1, v2

    goto :goto_0

    :catch_0
    move-object v1, v2

    goto :goto_1

    :catchall_1
    move-exception p1

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    :cond_1
    throw p1

    :catch_1
    :goto_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    :cond_2
    return v0
.end method

.method public final P(Ljava/util/HashMap;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lc4/a$d;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "BitsPerSample"

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc4/a$d;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Lc4/a$d;->o(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    sget-object v1, Lc4/a;->z:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    return v3

    :cond_0
    iget v2, p0, Lc4/a;->d:I

    const/4 v4, 0x3

    if-ne v2, v4, :cond_3

    const-string v2, "PhotometricInterpretation"

    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc4/a$d;

    if-eqz p1, :cond_3

    iget-object v2, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v2}, Lc4/a$d;->m(Ljava/nio/ByteOrder;)I

    move-result p1

    if-ne p1, v3, :cond_1

    sget-object v2, Lc4/a;->B:[I

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    const/4 v2, 0x6

    if-ne p1, v2, :cond_3

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    return v3

    :cond_3
    sget-boolean p1, Lc4/a;->w:Z

    if-eqz p1, :cond_4

    const-string p1, "ExifInterface"

    const-string v0, "Unsupported data type value"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method public final R(Ljava/util/HashMap;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lc4/a$d;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "ImageLength"

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc4/a$d;

    const-string v1, "ImageWidth"

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc4/a$d;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-object v1, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Lc4/a$d;->m(Ljava/nio/ByteOrder;)I

    move-result v0

    iget-object v1, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v1}, Lc4/a$d;->m(Ljava/nio/ByteOrder;)I

    move-result p1

    const/16 v1, 0x200

    if-gt v0, v1, :cond_0

    if-gt p1, v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final S([B)Z
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    sget-object v2, Lc4/a;->M:[B

    array-length v3, v2

    if-ge v1, v3, :cond_1

    aget-byte v3, p1, v1

    aget-byte v2, v2, v1

    if-eq v3, v2, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_1
    sget-object v2, Lc4/a;->N:[B

    array-length v3, v2

    if-ge v1, v3, :cond_3

    sget-object v3, Lc4/a;->M:[B

    array-length v3, v3

    add-int/2addr v3, v1

    add-int/lit8 v3, v3, 0x4

    aget-byte v3, p1, v3

    aget-byte v2, v2, v1

    if-eq v3, v2, :cond_2

    return v0

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public final T(Ljava/io/InputStream;)V
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    :try_start_0
    sget-object v2, Lc4/a;->k0:[[Lc4/a$e;

    array-length v2, v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lc4/a;->f:[Ljava/util/HashMap;

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :catch_0
    move-exception p1

    goto/16 :goto_4

    :catch_1
    move-exception p1

    goto/16 :goto_4

    :cond_0
    iget-boolean v1, p0, Lc4/a;->e:Z

    if-nez v1, :cond_1

    new-instance v1, Ljava/io/BufferedInputStream;

    const/16 v2, 0x1388

    invoke-direct {v1, p1, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    invoke-virtual {p0, v1}, Lc4/a;->r(Ljava/io/BufferedInputStream;)I

    move-result p1

    iput p1, p0, Lc4/a;->d:I

    move-object p1, v1

    :cond_1
    iget v1, p0, Lc4/a;->d:I

    invoke-static {v1}, Lc4/a;->l0(I)Z

    move-result v1

    if-eqz v1, :cond_8

    new-instance v0, Lc4/a$g;

    invoke-direct {v0, p1}, Lc4/a$g;-><init>(Ljava/io/InputStream;)V

    iget-boolean p1, p0, Lc4/a;->e:Z

    if-eqz p1, :cond_2

    invoke-virtual {p0, v0}, Lc4/a;->y(Lc4/a$g;)Z

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_7

    invoke-virtual {p0}, Lc4/a;->e()V

    sget-boolean p1, Lc4/a;->w:Z

    if-eqz p1, :cond_e

    invoke-virtual {p0}, Lc4/a;->V()V

    return-void

    :cond_2
    :try_start_1
    iget p1, p0, Lc4/a;->d:I

    const/16 v1, 0xc

    if-eq p1, v1, :cond_6

    const/16 v1, 0xf

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, 0x7

    if-ne p1, v1, :cond_4

    invoke-virtual {p0, v0}, Lc4/a;->s(Lc4/a$g;)V

    goto :goto_2

    :cond_4
    const/16 v1, 0xa

    if-ne p1, v1, :cond_5

    invoke-virtual {p0, v0}, Lc4/a;->x(Lc4/a$g;)V

    goto :goto_2

    :cond_5
    invoke-virtual {p0, v0}, Lc4/a;->v(Lc4/a$g;)V

    goto :goto_2

    :cond_6
    :goto_1
    invoke-virtual {p0, v0, p1}, Lc4/a;->o(Lc4/a$g;I)V

    :cond_7
    :goto_2
    iget p1, p0, Lc4/a;->p:I

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lc4/a$g;->g(J)V

    invoke-virtual {p0, v0}, Lc4/a;->k0(Lc4/a$b;)V

    goto :goto_3

    :cond_8
    new-instance v1, Lc4/a$b;

    invoke-direct {v1, p1}, Lc4/a$b;-><init>(Ljava/io/InputStream;)V

    iget p1, p0, Lc4/a;->d:I

    const/4 v2, 0x4

    if-ne p1, v2, :cond_9

    invoke-virtual {p0, v1, v0, v0}, Lc4/a;->p(Lc4/a$b;II)V

    goto :goto_3

    :cond_9
    const/16 v0, 0xd

    if-ne p1, v0, :cond_a

    invoke-virtual {p0, v1}, Lc4/a;->t(Lc4/a$b;)V

    goto :goto_3

    :cond_a
    const/16 v0, 0x9

    if-ne p1, v0, :cond_b

    invoke-virtual {p0, v1}, Lc4/a;->u(Lc4/a$b;)V

    goto :goto_3

    :cond_b
    const/16 v0, 0xe

    if-ne p1, v0, :cond_c

    invoke-virtual {p0, v1}, Lc4/a;->B(Lc4/a$b;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_c
    :goto_3
    invoke-virtual {p0}, Lc4/a;->e()V

    sget-boolean p1, Lc4/a;->w:Z

    if-eqz p1, :cond_e

    invoke-virtual {p0}, Lc4/a;->V()V

    return-void

    :goto_4
    :try_start_2
    sget-boolean v0, Lc4/a;->w:Z

    if-eqz v0, :cond_d

    const-string v1, "ExifInterface"

    const-string v2, "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."

    invoke-static {v1, v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_d
    invoke-virtual {p0}, Lc4/a;->e()V

    if-eqz v0, :cond_e

    invoke-virtual {p0}, Lc4/a;->V()V

    :cond_e
    return-void

    :goto_5
    invoke-virtual {p0}, Lc4/a;->e()V

    sget-boolean v0, Lc4/a;->w:Z

    if-eqz v0, :cond_f

    invoke-virtual {p0}, Lc4/a;->V()V

    :cond_f
    throw p1
.end method

.method public final U(Lc4/a$b;)V
    .locals 3

    invoke-virtual {p0, p1}, Lc4/a;->W(Lc4/a$b;)Ljava/nio/ByteOrder;

    move-result-object v0

    iput-object v0, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Lc4/a$b;->e(Ljava/nio/ByteOrder;)V

    invoke-virtual {p1}, Lc4/a$b;->readUnsignedShort()I

    move-result v0

    iget v1, p0, Lc4/a;->d:I

    const/4 v2, 0x7

    if-eq v1, v2, :cond_1

    const/16 v2, 0xa

    if-eq v1, v2, :cond_1

    const/16 v1, 0x2a

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid start code: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lc4/a$b;->readInt()I

    move-result v0

    const/16 v1, 0x8

    if-lt v0, v1, :cond_3

    add-int/lit8 v0, v0, -0x8

    if-lez v0, :cond_2

    invoke-virtual {p1, v0}, Lc4/a$b;->f(I)V

    :cond_2
    return-void

    :cond_3
    new-instance p1, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid first Ifd offset: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final V()V
    .locals 7

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lc4/a;->f:[Ljava/util/HashMap;

    array-length v1, v1

    if-ge v0, v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The size of tag group["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "]: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v2, v2, v0

    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ExifInterface"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc4/a$d;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "tagName: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", tagType: "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lc4/a$d;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", tagValue: \'"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v4, v3}, Lc4/a$d;->n(Ljava/nio/ByteOrder;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\'"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_1
    return-void
.end method

.method public final W(Lc4/a$b;)Ljava/nio/ByteOrder;
    .locals 3

    invoke-virtual {p1}, Lc4/a$b;->readShort()S

    move-result p1

    const/16 v0, 0x4949

    const-string v1, "ExifInterface"

    if-eq p1, v0, :cond_2

    const/16 v0, 0x4d4d

    if-ne p1, v0, :cond_1

    sget-boolean p1, Lc4/a;->w:Z

    if-eqz p1, :cond_0

    const-string p1, "readExifSegment: Byte Align MM"

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    sget-object p1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    return-object p1

    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid byte order: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    sget-boolean p1, Lc4/a;->w:Z

    if-eqz p1, :cond_3

    const-string p1, "readExifSegment: Byte Align II"

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    sget-object p1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    return-object p1
.end method

.method public final X([BI)V
    .locals 1

    new-instance v0, Lc4/a$g;

    invoke-direct {v0, p1}, Lc4/a$g;-><init>([B)V

    invoke-virtual {p0, v0}, Lc4/a;->U(Lc4/a$b;)V

    invoke-virtual {p0, v0, p2}, Lc4/a;->Y(Lc4/a$g;I)V

    return-void
.end method

.method public final Y(Lc4/a$g;I)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    iget-object v3, v0, Lc4/a;->g:Ljava/util/Set;

    invoke-virtual {v1}, Lc4/a$b;->b()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Lc4/a$b;->readShort()S

    move-result v3

    sget-boolean v4, Lc4/a;->w:Z

    const-string v5, "ExifInterface"

    if-eqz v4, :cond_0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "numberOfDirectoryEntry: "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    if-gtz v3, :cond_1

    goto/16 :goto_11

    :cond_1
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v3, :cond_26

    invoke-virtual {v1}, Lc4/a$b;->readUnsignedShort()I

    move-result v10

    invoke-virtual {v1}, Lc4/a$b;->readUnsignedShort()I

    move-result v11

    invoke-virtual {v1}, Lc4/a$b;->readInt()I

    move-result v14

    invoke-virtual {v1}, Lc4/a$b;->b()I

    move-result v12

    int-to-long v12, v12

    const-wide/16 v15, 0x4

    add-long/2addr v12, v15

    sget-object v17, Lc4/a;->m0:[Ljava/util/HashMap;

    aget-object v4, v17, v2

    const-wide/16 v18, 0x0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc4/a$e;

    sget-boolean v7, Lc4/a;->w:Z

    if-eqz v7, :cond_3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    move-wide/from16 v20, v15

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    const/16 v16, 0x4

    if-eqz v4, :cond_2

    iget-object v9, v4, Lc4/a$e;->b:Ljava/lang/String;

    :goto_1
    move/from16 v22, v3

    goto :goto_2

    :cond_2
    const/4 v9, 0x0

    goto :goto_1

    :goto_2
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move/from16 v23, v6

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {v8, v15, v9, v3, v6}, [Ljava/lang/Object;

    move-result-object v3

    const-string v6, "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"

    invoke-static {v6, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :cond_3
    move/from16 v22, v3

    move/from16 v23, v6

    move-wide/from16 v20, v15

    const/16 v16, 0x4

    :goto_3
    const/4 v3, 0x7

    if-nez v4, :cond_5

    if-eqz v7, :cond_4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Skip the tag entry since tag number is not defined: "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    :goto_4
    move-object/from16 v24, v4

    goto/16 :goto_8

    :cond_5
    if-lez v11, :cond_6

    sget-object v6, Lc4/a;->Y:[I

    array-length v8, v6

    if-lt v11, v8, :cond_7

    :cond_6
    move-object/from16 v24, v4

    goto :goto_7

    :cond_7
    invoke-virtual {v4, v11}, Lc4/a$e;->a(I)Z

    move-result v8

    if-nez v8, :cond_8

    if-eqz v7, :cond_4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Skip the tag entry since data format ("

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v8, Lc4/a;->X:[Ljava/lang/String;

    aget-object v8, v8, v11

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ") is unexpected for tag: "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, v4, Lc4/a$e;->b:Ljava/lang/String;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :cond_8
    if-ne v11, v3, :cond_9

    iget v11, v4, Lc4/a$e;->c:I

    :cond_9
    int-to-long v8, v14

    aget v6, v6, v11

    move-object/from16 v24, v4

    int-to-long v3, v6

    mul-long/2addr v8, v3

    cmp-long v3, v8, v18

    if-ltz v3, :cond_b

    const-wide/32 v3, 0x7fffffff

    cmp-long v3, v8, v3

    if-lez v3, :cond_a

    goto :goto_5

    :cond_a
    const/4 v3, 0x1

    goto :goto_9

    :cond_b
    :goto_5
    if-eqz v7, :cond_c

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Skip the tag entry since the number of components is invalid: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_c
    :goto_6
    const/4 v3, 0x0

    goto :goto_9

    :goto_7
    if-eqz v7, :cond_d

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Skip the tag entry since data format is invalid: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_d
    :goto_8
    move-wide/from16 v8, v18

    goto :goto_6

    :goto_9
    if-nez v3, :cond_e

    invoke-virtual {v1, v12, v13}, Lc4/a$g;->g(J)V

    goto/16 :goto_10

    :cond_e
    cmp-long v3, v8, v20

    const-string v4, "Compression"

    if-lez v3, :cond_13

    invoke-virtual {v1}, Lc4/a$b;->readInt()I

    move-result v3

    if-eqz v7, :cond_f

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "seek to data offset: "

    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_f
    iget v6, v0, Lc4/a;->d:I

    const/4 v15, 0x7

    if-ne v6, v15, :cond_12

    const-string v6, "MakerNote"

    move/from16 v17, v7

    move-object/from16 v15, v24

    iget-object v7, v15, Lc4/a$e;->b:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_11

    iput v3, v0, Lc4/a;->q:I

    :cond_10
    move-wide/from16 v20, v12

    goto :goto_a

    :cond_11
    const/4 v6, 0x6

    if-ne v2, v6, :cond_10

    const-string v7, "ThumbnailImage"

    iget-object v6, v15, Lc4/a$e;->b:Ljava/lang/String;

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_10

    iput v3, v0, Lc4/a;->r:I

    iput v14, v0, Lc4/a;->s:I

    iget-object v6, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    const/4 v7, 0x6

    invoke-static {v7, v6}, Lc4/a$d;->j(ILjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v6

    iget v7, v0, Lc4/a;->r:I

    move-wide/from16 v20, v12

    int-to-long v12, v7

    iget-object v7, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v12, v13, v7}, Lc4/a$d;->f(JLjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v7

    iget v12, v0, Lc4/a;->s:I

    int-to-long v12, v12

    iget-object v2, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v12, v13, v2}, Lc4/a$d;->f(JLjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v2

    iget-object v12, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v12, v12, v16

    invoke-virtual {v12, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v6, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v6, v6, v16

    const-string v12, "JPEGInterchangeFormat"

    invoke-virtual {v6, v12, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v6, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v6, v6, v16

    const-string v7, "JPEGInterchangeFormatLength"

    invoke-virtual {v6, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    :cond_12
    move/from16 v17, v7

    move-wide/from16 v20, v12

    move-object/from16 v15, v24

    :goto_a
    int-to-long v2, v3

    invoke-virtual {v1, v2, v3}, Lc4/a$g;->g(J)V

    goto :goto_b

    :cond_13
    move/from16 v17, v7

    move-wide/from16 v20, v12

    move-object/from16 v15, v24

    :goto_b
    sget-object v2, Lc4/a;->p0:Ljava/util/HashMap;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v17, :cond_14

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "nextIfdType: "

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " byteCount: "

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_14
    const/16 v3, 0x8

    const/4 v6, 0x3

    if-eqz v2, :cond_1f

    if-eq v11, v6, :cond_18

    move/from16 v4, v16

    if-eq v11, v4, :cond_17

    if-eq v11, v3, :cond_16

    const/16 v3, 0x9

    if-eq v11, v3, :cond_15

    const/16 v3, 0xd

    if-eq v11, v3, :cond_15

    const-wide/16 v3, -0x1

    goto :goto_d

    :cond_15
    invoke-virtual {v1}, Lc4/a$b;->readInt()I

    move-result v3

    :goto_c
    int-to-long v3, v3

    goto :goto_d

    :cond_16
    invoke-virtual {v1}, Lc4/a$b;->readShort()S

    move-result v3

    goto :goto_c

    :cond_17
    invoke-virtual {v1}, Lc4/a$b;->d()J

    move-result-wide v3

    goto :goto_d

    :cond_18
    invoke-virtual {v1}, Lc4/a$b;->readUnsignedShort()I

    move-result v3

    goto :goto_c

    :goto_d
    if-eqz v17, :cond_19

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    iget-object v7, v15, Lc4/a$e;->b:Ljava/lang/String;

    filled-new-array {v6, v7}, [Ljava/lang/Object;

    move-result-object v6

    const-string v7, "Offset: %d, tagName: %s"

    invoke-static {v7, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_19
    cmp-long v6, v3, v18

    const-string v7, ")"

    const/4 v8, -0x1

    if-lez v6, :cond_1d

    invoke-virtual {v1}, Lc4/a$b;->a()I

    move-result v6

    if-eq v6, v8, :cond_1a

    invoke-virtual {v1}, Lc4/a$b;->a()I

    move-result v6

    int-to-long v9, v6

    cmp-long v6, v3, v9

    if-gez v6, :cond_1d

    :cond_1a
    iget-object v6, v0, Lc4/a;->g:Ljava/util/Set;

    long-to-int v8, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v6, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1c

    invoke-virtual {v1, v3, v4}, Lc4/a$g;->g(J)V

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lc4/a;->Y(Lc4/a$g;I)V

    :cond_1b
    :goto_e
    move-wide/from16 v12, v20

    goto :goto_f

    :cond_1c
    if-eqz v17, :cond_1b

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Skip jump into the IFD since it has already been read: IfdType "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " (at "

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_e

    :cond_1d
    if-eqz v17, :cond_1b

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Skip jump into the IFD since its offset is invalid: "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lc4/a$b;->a()I

    move-result v3

    if-eq v3, v8, :cond_1e

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " (total length: "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lc4/a$b;->a()I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_1e
    invoke-static {v5, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_e

    :goto_f
    invoke-virtual {v1, v12, v13}, Lc4/a$g;->g(J)V

    goto/16 :goto_10

    :cond_1f
    move-wide/from16 v12, v20

    invoke-virtual {v1}, Lc4/a$b;->b()I

    move-result v2

    iget v7, v0, Lc4/a;->p:I

    add-int/2addr v2, v7

    long-to-int v7, v8

    new-array v7, v7, [B

    invoke-virtual {v1, v7}, Lc4/a$b;->readFully([B)V

    new-instance v12, Lc4/a$d;

    int-to-long v8, v2

    move-object/from16 v17, v7

    move v13, v11

    move-object v2, v15

    move-wide v15, v8

    move-wide/from16 v7, v20

    invoke-direct/range {v12 .. v17}, Lc4/a$d;-><init>(IIJ[B)V

    iget-object v9, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v9, v9, p2

    iget-object v10, v2, Lc4/a$e;->b:Ljava/lang/String;

    invoke-virtual {v9, v10, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v9, "DNGVersion"

    iget-object v10, v2, Lc4/a$e;->b:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_20

    iput v6, v0, Lc4/a;->d:I

    :cond_20
    const-string v6, "Make"

    iget-object v9, v2, Lc4/a$e;->b:Ljava/lang/String;

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_21

    const-string v6, "Model"

    iget-object v9, v2, Lc4/a$e;->b:Ljava/lang/String;

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_22

    :cond_21
    iget-object v6, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v12, v6}, Lc4/a$d;->n(Ljava/nio/ByteOrder;)Ljava/lang/String;

    move-result-object v6

    const-string v9, "PENTAX"

    invoke-virtual {v6, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_23

    :cond_22
    iget-object v2, v2, Lc4/a$e;->b:Ljava/lang/String;

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_24

    iget-object v2, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v12, v2}, Lc4/a$d;->m(Ljava/nio/ByteOrder;)I

    move-result v2

    const v4, 0xffff

    if-ne v2, v4, :cond_24

    :cond_23
    iput v3, v0, Lc4/a;->d:I

    :cond_24
    invoke-virtual {v1}, Lc4/a$b;->b()I

    move-result v2

    int-to-long v2, v2

    cmp-long v2, v2, v7

    if-eqz v2, :cond_25

    invoke-virtual {v1, v7, v8}, Lc4/a$g;->g(J)V

    :cond_25
    :goto_10
    add-int/lit8 v6, v23, 0x1

    int-to-short v6, v6

    move/from16 v2, p2

    move/from16 v3, v22

    goto/16 :goto_0

    :cond_26
    const-wide/16 v18, 0x0

    invoke-virtual {v1}, Lc4/a$b;->readInt()I

    move-result v2

    sget-boolean v3, Lc4/a;->w:Z

    if-eqz v3, :cond_27

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const-string v6, "nextIfdOffset: %d"

    invoke-static {v6, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_27
    int-to-long v6, v2

    cmp-long v4, v6, v18

    if-lez v4, :cond_2a

    iget-object v4, v0, Lc4/a;->g:Ljava/util/Set;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_29

    invoke-virtual {v1, v6, v7}, Lc4/a$g;->g(J)V

    iget-object v2, v0, Lc4/a;->f:[Ljava/util/HashMap;

    const/4 v4, 0x4

    aget-object v2, v2, v4

    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_28

    invoke-virtual {v0, v1, v4}, Lc4/a;->Y(Lc4/a$g;I)V

    return-void

    :cond_28
    iget-object v2, v0, Lc4/a;->f:[Ljava/util/HashMap;

    const/4 v3, 0x5

    aget-object v2, v2, v3

    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2b

    invoke-virtual {v0, v1, v3}, Lc4/a;->Y(Lc4/a$g;I)V

    return-void

    :cond_29
    if-eqz v3, :cond_2b

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Stop reading file since re-reading an IFD may cause an infinite loop: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_2a
    if-eqz v3, :cond_2b

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Stop reading file since a wrong offset may cause an infinite loop: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2b
    :goto_11
    return-void
.end method

.method public final Z(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lc4/a;->k0:[[Lc4/a$e;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final a0(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v0, v0, p1

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v0, v0, p1

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v0, v0, p1

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc4/a$d;

    invoke-virtual {v0, p3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p3, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object p1, p3, p1

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final b0(Lc4/a$g;I)V
    .locals 4

    iget-object v0, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v0, v0, p2

    const-string v1, "ImageLength"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc4/a$d;

    iget-object v1, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v1, v1, p2

    const-string v2, "ImageWidth"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc4/a$d;

    if-eqz v0, :cond_0

    if-nez v1, :cond_1

    :cond_0
    iget-object v0, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v0, v0, p2

    const-string v1, "JPEGInterchangeFormat"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc4/a$d;

    iget-object v1, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v1, v1, p2

    const-string v2, "JPEGInterchangeFormatLength"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc4/a$d;

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Lc4/a$d;->m(Ljava/nio/ByteOrder;)I

    move-result v1

    iget-object v2, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v2}, Lc4/a$d;->m(Ljava/nio/ByteOrder;)I

    move-result v0

    int-to-long v2, v1

    invoke-virtual {p1, v2, v3}, Lc4/a$g;->g(J)V

    new-array v0, v0, [B

    invoke-virtual {p1, v0}, Lc4/a$b;->readFully([B)V

    new-instance p1, Lc4/a$b;

    invoke-direct {p1, v0}, Lc4/a$b;-><init>([B)V

    invoke-virtual {p0, p1, v1, p2}, Lc4/a;->p(Lc4/a$b;II)V

    :cond_1
    return-void
.end method

.method public c0()V
    .locals 13

    iget v0, p0, Lc4/a;->d:I

    invoke-static {v0}, Lc4/a;->Q(I)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lc4/a;->b:Ljava/io/FileDescriptor;

    if-nez v0, :cond_1

    iget-object v0, p0, Lc4/a;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "ExifInterface does not support saving attributes for the current input."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-boolean v0, p0, Lc4/a;->i:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lc4/a;->j:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lc4/a;->k:Z

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lc4/a;->t:Z

    invoke-virtual {p0}, Lc4/a;->z()[B

    move-result-object v1

    iput-object v1, p0, Lc4/a;->n:[B

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "temp"

    const-string v3, "tmp"

    invoke-static {v2, v3}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    iget-object v3, p0, Lc4/a;->a:Ljava/lang/String;

    const-wide/16 v4, 0x0

    if-eqz v3, :cond_4

    new-instance v3, Ljava/io/FileInputStream;

    iget-object v6, p0, Lc4/a;->a:Ljava/lang/String;

    invoke-direct {v3, v6}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object v6, v1

    goto/16 :goto_11

    :catch_0
    move-exception v0

    move-object v6, v1

    goto/16 :goto_10

    :cond_4
    iget-object v3, p0, Lc4/a;->b:Ljava/io/FileDescriptor;

    sget v6, Landroid/system/OsConstants;->SEEK_SET:I

    invoke-static {v3, v4, v5, v6}, Landroid/system/Os;->lseek(Ljava/io/FileDescriptor;JI)J

    new-instance v3, Ljava/io/FileInputStream;

    iget-object v6, p0, Lc4/a;->b:Ljava/io/FileDescriptor;

    invoke-direct {v3, v6}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    :try_start_1
    new-instance v6, Ljava/io/FileOutputStream;

    invoke-direct {v6, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_9
    .catchall {:try_start_1 .. :try_end_1} :catchall_8

    :try_start_2
    invoke-static {v3, v6}, Lc4/b;->d(Ljava/io/InputStream;Ljava/io/OutputStream;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_8
    .catchall {:try_start_2 .. :try_end_2} :catchall_7

    invoke-static {v3}, Lc4/b;->b(Ljava/io/Closeable;)V

    invoke-static {v6}, Lc4/b;->b(Ljava/io/Closeable;)V

    const/4 v3, 0x0

    :try_start_3
    new-instance v6, Ljava/io/FileInputStream;

    invoke-direct {v6, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    iget-object v7, p0, Lc4/a;->a:Ljava/lang/String;

    if-eqz v7, :cond_5

    new-instance v7, Ljava/io/FileOutputStream;

    iget-object v8, p0, Lc4/a;->a:Ljava/lang/String;

    invoke-direct {v7, v8}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v9, v1

    goto/16 :goto_d

    :catch_1
    move-exception v7

    move-object v8, v1

    move-object v9, v8

    move-object v1, v6

    :goto_3
    move-object v6, v7

    move-object v7, v9

    goto/16 :goto_7

    :cond_5
    iget-object v7, p0, Lc4/a;->b:Ljava/io/FileDescriptor;

    sget v8, Landroid/system/OsConstants;->SEEK_SET:I

    invoke-static {v7, v4, v5, v8}, Landroid/system/Os;->lseek(Ljava/io/FileDescriptor;JI)J

    new-instance v7, Ljava/io/FileOutputStream;

    iget-object v8, p0, Lc4/a;->b:Ljava/io/FileDescriptor;

    invoke-direct {v7, v8}, Ljava/io/FileOutputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_4
    :try_start_5
    new-instance v8, Ljava/io/BufferedInputStream;

    invoke-direct {v8, v6}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    new-instance v9, Ljava/io/BufferedOutputStream;

    invoke-direct {v9, v7}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :try_start_7
    iget v10, p0, Lc4/a;->d:I

    const/4 v11, 0x4

    if-ne v10, v11, :cond_6

    invoke-virtual {p0, v8, v9}, Lc4/a;->d0(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    goto :goto_6

    :catchall_2
    move-exception v0

    :goto_5
    move-object v1, v8

    goto/16 :goto_d

    :catch_2
    move-exception v1

    move-object v12, v6

    move-object v6, v1

    move-object v1, v12

    goto :goto_7

    :cond_6
    const/16 v11, 0xd

    if-ne v10, v11, :cond_7

    invoke-virtual {p0, v8, v9}, Lc4/a;->e0(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    goto :goto_6

    :cond_7
    const/16 v11, 0xe

    if-ne v10, v11, :cond_8

    invoke-virtual {p0, v8, v9}, Lc4/a;->f0(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :cond_8
    :goto_6
    invoke-static {v8}, Lc4/b;->b(Ljava/io/Closeable;)V

    invoke-static {v9}, Lc4/b;->b(Ljava/io/Closeable;)V

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    iput-object v1, p0, Lc4/a;->n:[B

    return-void

    :catchall_3
    move-exception v0

    move-object v9, v1

    goto :goto_5

    :catch_3
    move-exception v9

    move-object v12, v9

    move-object v9, v1

    move-object v1, v6

    move-object v6, v12

    goto :goto_7

    :catch_4
    move-exception v8

    move-object v9, v1

    move-object v1, v6

    move-object v6, v8

    move-object v8, v9

    goto :goto_7

    :catch_5
    move-exception v7

    move-object v8, v1

    move-object v9, v8

    goto :goto_3

    :goto_7
    :try_start_8
    new-instance v10, Ljava/io/FileInputStream;

    invoke-direct {v10, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    :try_start_9
    iget-object v1, p0, Lc4/a;->a:Ljava/lang/String;

    if-eqz v1, :cond_9

    new-instance v1, Ljava/io/FileOutputStream;

    iget-object v4, p0, Lc4/a;->a:Ljava/lang/String;

    invoke-direct {v1, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    :goto_8
    move-object v7, v1

    goto :goto_a

    :catchall_4
    move-exception v0

    :goto_9
    move-object v1, v10

    goto :goto_c

    :catch_6
    move-exception v1

    goto :goto_b

    :cond_9
    iget-object v1, p0, Lc4/a;->b:Ljava/io/FileDescriptor;

    sget v11, Landroid/system/OsConstants;->SEEK_SET:I

    invoke-static {v1, v4, v5, v11}, Landroid/system/Os;->lseek(Ljava/io/FileDescriptor;JI)J

    new-instance v1, Ljava/io/FileOutputStream;

    iget-object v4, p0, Lc4/a;->b:Ljava/io/FileDescriptor;

    invoke-direct {v1, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/FileDescriptor;)V

    goto :goto_8

    :goto_a
    invoke-static {v10, v7}, Lc4/b;->d(Ljava/io/InputStream;Ljava/io/OutputStream;)I
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :try_start_a
    invoke-static {v10}, Lc4/b;->b(Ljava/io/Closeable;)V

    invoke-static {v7}, Lc4/b;->b(Ljava/io/Closeable;)V

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Failed to save new file"

    invoke-direct {v0, v1, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :catchall_5
    move-exception v0

    goto :goto_c

    :catch_7
    move-exception v3

    move-object v10, v1

    move-object v1, v3

    :goto_b
    :try_start_b
    new-instance v3, Ljava/io/IOException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Failed to save new file. Original file is stored in "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    :catchall_6
    move-exception v1

    move v3, v0

    move-object v0, v1

    goto :goto_9

    :goto_c
    :try_start_c
    invoke-static {v1}, Lc4/b;->b(Ljava/io/Closeable;)V

    invoke-static {v7}, Lc4/b;->b(Ljava/io/Closeable;)V

    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    :goto_d
    invoke-static {v1}, Lc4/b;->b(Ljava/io/Closeable;)V

    invoke-static {v9}, Lc4/b;->b(Ljava/io/Closeable;)V

    if-nez v3, :cond_a

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    :cond_a
    throw v0

    :catchall_7
    move-exception v0

    :goto_e
    move-object v1, v3

    goto :goto_11

    :catch_8
    move-exception v0

    :goto_f
    move-object v1, v3

    goto :goto_10

    :catchall_8
    move-exception v0

    move-object v6, v1

    goto :goto_e

    :catch_9
    move-exception v0

    move-object v6, v1

    goto :goto_f

    :goto_10
    :try_start_d
    new-instance v2, Ljava/io/IOException;

    const-string v3, "Failed to copy original file to temp file"

    invoke-direct {v2, v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_9

    :catchall_9
    move-exception v0

    :goto_11
    invoke-static {v1}, Lc4/b;->b(Ljava/io/Closeable;)V

    invoke-static {v6}, Lc4/b;->b(Ljava/io/Closeable;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/io/IOException;

    const-string v1, "ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d0(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 12

    sget-boolean v0, Lc4/a;->w:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "saveJpegAttributes starting with (inputStream: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", outputStream: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExifInterface"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    new-instance v0, Lc4/a$b;

    invoke-direct {v0, p1}, Lc4/a$b;-><init>(Ljava/io/InputStream;)V

    new-instance p1, Lc4/a$c;

    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-direct {p1, p2, v1}, Lc4/a$c;-><init>(Ljava/io/OutputStream;Ljava/nio/ByteOrder;)V

    invoke-virtual {v0}, Lc4/a$b;->readByte()B

    move-result p2

    const-string v1, "Invalid marker"

    const/4 v2, -0x1

    if-ne p2, v2, :cond_e

    invoke-virtual {p1, v2}, Lc4/a$c;->b(I)V

    invoke-virtual {v0}, Lc4/a$b;->readByte()B

    move-result p2

    const/16 v3, -0x28

    if-ne p2, v3, :cond_d

    invoke-virtual {p1, v3}, Lc4/a$c;->b(I)V

    invoke-virtual {p1, v2}, Lc4/a$c;->b(I)V

    const/16 p2, -0x1f

    invoke-virtual {p1, p2}, Lc4/a$c;->b(I)V

    invoke-virtual {p0, p1}, Lc4/a;->q0(Lc4/a$c;)I

    move-result v3

    iput v3, p0, Lc4/a;->p:I

    iget-object v3, p0, Lc4/a;->u:Lc4/a$d;

    if-eqz v3, :cond_1

    invoke-virtual {p1, v2}, Ljava/io/OutputStream;->write(I)V

    invoke-virtual {p1, p2}, Lc4/a$c;->b(I)V

    sget-object v3, Lc4/a;->s0:[B

    array-length v4, v3

    add-int/lit8 v4, v4, 0x2

    iget-object v5, p0, Lc4/a;->u:Lc4/a$d;

    iget-object v5, v5, Lc4/a$d;->d:[B

    array-length v5, v5

    add-int/2addr v4, v5

    invoke-virtual {p1, v4}, Lc4/a$c;->f(I)V

    invoke-virtual {p1, v3}, Lc4/a$c;->write([B)V

    iget-object v3, p0, Lc4/a;->u:Lc4/a$d;

    iget-object v3, v3, Lc4/a$d;->d:[B

    invoke-virtual {p1, v3}, Lc4/a$c;->write([B)V

    const/4 v3, 0x1

    iput-boolean v3, p0, Lc4/a;->v:Z

    :cond_1
    const/16 v3, 0x1000

    new-array v4, v3, [B

    :cond_2
    :goto_0
    invoke-virtual {v0}, Lc4/a$b;->readByte()B

    move-result v5

    if-ne v5, v2, :cond_c

    invoke-virtual {v0}, Lc4/a$b;->readByte()B

    move-result v5

    const/16 v6, -0x27

    if-eq v5, v6, :cond_b

    const/16 v6, -0x26

    if-eq v5, v6, :cond_b

    const-string v6, "Invalid length"

    const/4 v7, 0x0

    if-eq v5, p2, :cond_4

    invoke-virtual {p1, v2}, Lc4/a$c;->b(I)V

    invoke-virtual {p1, v5}, Lc4/a$c;->b(I)V

    invoke-virtual {v0}, Lc4/a$b;->readUnsignedShort()I

    move-result v5

    invoke-virtual {p1, v5}, Lc4/a$c;->f(I)V

    add-int/lit8 v5, v5, -0x2

    if-ltz v5, :cond_3

    :goto_1
    if-lez v5, :cond_2

    invoke-static {v5, v3}, Ljava/lang/Math;->min(II)I

    move-result v6

    invoke-virtual {v0, v4, v7, v6}, Lc4/a$b;->read([BII)I

    move-result v6

    if-ltz v6, :cond_2

    invoke-virtual {p1, v4, v7, v6}, Lc4/a$c;->write([BII)V

    sub-int/2addr v5, v6

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-virtual {v0}, Lc4/a$b;->readUnsignedShort()I

    move-result v8

    add-int/lit8 v9, v8, -0x2

    if-ltz v9, :cond_a

    sget-object v6, Lc4/a;->s0:[B

    array-length v10, v6

    if-lt v9, v10, :cond_5

    array-length v10, v6

    new-array v10, v10, [B

    goto :goto_2

    :cond_5
    sget-object v10, Lc4/a;->r0:[B

    array-length v11, v10

    if-lt v9, v11, :cond_6

    array-length v10, v10

    new-array v10, v10, [B

    goto :goto_2

    :cond_6
    const/4 v10, 0x0

    :goto_2
    if-eqz v10, :cond_8

    invoke-virtual {v0, v10}, Lc4/a$b;->readFully([B)V

    sget-object v11, Lc4/a;->r0:[B

    invoke-static {v10, v11}, Lc4/b;->f([B[B)Z

    move-result v11

    if-nez v11, :cond_7

    invoke-static {v10, v6}, Lc4/b;->f([B[B)Z

    move-result v6

    if-eqz v6, :cond_8

    :cond_7
    array-length v5, v10

    sub-int/2addr v9, v5

    invoke-virtual {v0, v9}, Lc4/a$b;->f(I)V

    goto :goto_0

    :cond_8
    invoke-virtual {p1, v2}, Lc4/a$c;->b(I)V

    invoke-virtual {p1, v5}, Lc4/a$c;->b(I)V

    invoke-virtual {p1, v8}, Lc4/a$c;->f(I)V

    if-eqz v10, :cond_9

    array-length v5, v10

    sub-int/2addr v9, v5

    invoke-virtual {p1, v10}, Lc4/a$c;->write([B)V

    :cond_9
    :goto_3
    if-lez v9, :cond_2

    invoke-static {v9, v3}, Ljava/lang/Math;->min(II)I

    move-result v5

    invoke-virtual {v0, v4, v7, v5}, Lc4/a$b;->read([BII)I

    move-result v5

    if-ltz v5, :cond_2

    invoke-virtual {p1, v4, v7, v5}, Lc4/a$c;->write([BII)V

    sub-int/2addr v9, v5

    goto :goto_3

    :cond_a
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    invoke-virtual {p1, v2}, Lc4/a$c;->b(I)V

    invoke-virtual {p1, v5}, Lc4/a$c;->b(I)V

    invoke-static {v0, p1}, Lc4/b;->d(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    return-void

    :cond_c
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e()V
    .locals 6

    const-string v0, "DateTimeOriginal"

    invoke-virtual {p0, v0}, Lc4/a;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "DateTime"

    invoke-virtual {p0, v2}, Lc4/a;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    iget-object v3, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v3, v3, v1

    invoke-static {v0}, Lc4/a$d;->e(Ljava/lang/String;)Lc4/a$d;

    move-result-object v0

    invoke-virtual {v3, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-string v0, "ImageWidth"

    invoke-virtual {p0, v0}, Lc4/a;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-wide/16 v3, 0x0

    if-nez v2, :cond_1

    iget-object v2, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v2, v2, v1

    iget-object v5, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v3, v4, v5}, Lc4/a$d;->f(JLjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v5

    invoke-virtual {v2, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const-string v0, "ImageLength"

    invoke-virtual {p0, v0}, Lc4/a;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v2, v2, v1

    iget-object v5, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v3, v4, v5}, Lc4/a$d;->f(JLjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v5

    invoke-virtual {v2, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    const-string v0, "Orientation"

    invoke-virtual {p0, v0}, Lc4/a;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_3

    iget-object v2, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v1, v2, v1

    iget-object v2, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v3, v4, v2}, Lc4/a$d;->f(JLjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    const-string v0, "LightSource"

    invoke-virtual {p0, v0}, Lc4/a;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lc4/a;->f:[Ljava/util/HashMap;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    iget-object v2, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v3, v4, v2}, Lc4/a$d;->f(JLjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-void
.end method

.method public final e0(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 8

    sget-boolean v0, Lc4/a;->w:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "savePngAttributes starting with (inputStream: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", outputStream: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExifInterface"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    new-instance v0, Lc4/a$b;

    invoke-direct {v0, p1}, Lc4/a$b;-><init>(Ljava/io/InputStream;)V

    new-instance p1, Lc4/a$c;

    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-direct {p1, p2, v1}, Lc4/a$c;-><init>(Ljava/io/OutputStream;Ljava/nio/ByteOrder;)V

    sget-object p2, Lc4/a;->K:[B

    array-length p2, p2

    invoke-static {v0, p1, p2}, Lc4/b;->e(Ljava/io/InputStream;Ljava/io/OutputStream;I)V

    iget-object p2, p0, Lc4/a;->u:Lc4/a$d;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p2, :cond_1

    iget-boolean p2, p0, Lc4/a;->v:Z

    if-eqz p2, :cond_6

    :cond_1
    move p2, v1

    :cond_2
    :goto_0
    if-nez v1, :cond_4

    if-eqz p2, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {v0, p1}, Lc4/b;->d(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    return-void

    :cond_4
    :goto_1
    invoke-virtual {v0}, Lc4/a$b;->readInt()I

    move-result v3

    invoke-virtual {v0}, Lc4/a$b;->readInt()I

    move-result v4

    const v5, 0x49484452

    if-ne v4, v5, :cond_7

    invoke-virtual {p1, v3}, Lc4/a$c;->c(I)V

    invoke-virtual {p1, v4}, Lc4/a$c;->c(I)V

    add-int/lit8 v3, v3, 0x4

    invoke-static {v0, p1, v3}, Lc4/b;->e(Ljava/io/InputStream;Ljava/io/OutputStream;I)V

    iget v3, p0, Lc4/a;->p:I

    if-nez v3, :cond_5

    invoke-virtual {p0, p1}, Lc4/a;->r0(Lc4/a$c;)V

    move v1, v2

    :cond_5
    iget-object v3, p0, Lc4/a;->u:Lc4/a$d;

    if-eqz v3, :cond_2

    iget-boolean v3, p0, Lc4/a;->v:Z

    if-nez v3, :cond_2

    invoke-virtual {p0, p1}, Lc4/a;->s0(Lc4/a$c;)V

    :cond_6
    :goto_2
    move p2, v2

    goto :goto_0

    :cond_7
    const v5, 0x65584966

    if-ne v4, v5, :cond_8

    if-eqz v1, :cond_8

    invoke-virtual {p0, p1}, Lc4/a;->r0(Lc4/a$c;)V

    add-int/lit8 v3, v3, 0x4

    invoke-virtual {v0, v3}, Lc4/a$b;->f(I)V

    move v1, v2

    goto :goto_0

    :cond_8
    const v5, 0x69545874

    if-ne v4, v5, :cond_b

    sget-object v5, Lc4/a;->L:[B

    array-length v6, v5

    if-lt v3, v6, :cond_b

    array-length v6, v5

    new-array v7, v6, [B

    invoke-virtual {v0, v7}, Lc4/a$b;->readFully([B)V

    sub-int v6, v3, v6

    add-int/lit8 v6, v6, 0x4

    invoke-static {v7, v5}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v5

    if-eqz v5, :cond_a

    iget-object p2, p0, Lc4/a;->u:Lc4/a$d;

    if-eqz p2, :cond_9

    invoke-virtual {p0, p1}, Lc4/a;->s0(Lc4/a$c;)V

    :cond_9
    invoke-virtual {v0, v6}, Lc4/a$b;->f(I)V

    goto :goto_2

    :cond_a
    invoke-virtual {p1, v3}, Lc4/a$c;->c(I)V

    invoke-virtual {p1, v4}, Lc4/a$c;->c(I)V

    invoke-virtual {p1, v7}, Lc4/a$c;->write([B)V

    invoke-static {v0, p1, v6}, Lc4/b;->e(Ljava/io/InputStream;Ljava/io/OutputStream;I)V

    goto :goto_0

    :cond_b
    invoke-virtual {p1, v3}, Lc4/a$c;->c(I)V

    invoke-virtual {p1, v4}, Lc4/a$c;->c(I)V

    add-int/lit8 v3, v3, 0x4

    invoke-static {v0, p1, v3}, Lc4/b;->e(Ljava/io/InputStream;Ljava/io/OutputStream;I)V

    goto/16 :goto_0
.end method

.method public final f(D)Ljava/lang/String;
    .locals 8

    double-to-long v0, p1

    long-to-double v2, v0

    sub-double/2addr p1, v2

    const-wide/high16 v2, 0x404e000000000000L    # 60.0

    mul-double v4, p1, v2

    double-to-long v4, v4

    long-to-double v6, v4

    div-double/2addr v6, v2

    sub-double/2addr p1, v6

    const-wide v2, 0x40ac200000000000L    # 3600.0

    mul-double/2addr p1, v2

    const-wide v2, 0x416312d000000000L    # 1.0E7

    mul-double/2addr p1, v2

    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    move-result-wide p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "/1,"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, "/10000000"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final f0(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    sget-boolean v3, Lc4/a;->w:Z

    if-eqz v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "saveWebpAttributes starting with (inputStream: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", outputStream: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ")"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "ExifInterface"

    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    new-instance v3, Lc4/a$b;

    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-direct {v3, v0, v4}, Lc4/a$b;-><init>(Ljava/io/InputStream;Ljava/nio/ByteOrder;)V

    new-instance v0, Lc4/a$c;

    invoke-direct {v0, v2, v4}, Lc4/a$c;-><init>(Ljava/io/OutputStream;Ljava/nio/ByteOrder;)V

    sget-object v2, Lc4/a;->M:[B

    array-length v5, v2

    invoke-static {v3, v0, v5}, Lc4/b;->e(Ljava/io/InputStream;Ljava/io/OutputStream;I)V

    invoke-virtual {v3}, Lc4/a$b;->readInt()I

    move-result v5

    sget-object v6, Lc4/a;->N:[B

    array-length v7, v6

    invoke-virtual {v3, v7}, Lc4/a$b;->f(I)V

    const/4 v7, 0x0

    :try_start_0
    new-instance v8, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v8}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-instance v9, Lc4/a$c;

    invoke-direct {v9, v8, v4}, Lc4/a$c;-><init>(Ljava/io/OutputStream;Ljava/nio/ByteOrder;)V

    iget v4, v1, Lc4/a;->p:I

    const/4 v11, 0x4

    const/16 v12, 0x8

    if-eqz v4, :cond_2

    array-length v2, v2

    add-int/2addr v2, v11

    array-length v6, v6

    add-int/2addr v2, v6

    sub-int/2addr v4, v2

    sub-int/2addr v4, v12

    invoke-static {v3, v9, v4}, Lc4/b;->e(Ljava/io/InputStream;Ljava/io/OutputStream;I)V

    invoke-virtual {v3, v11}, Lc4/a$b;->f(I)V

    invoke-virtual {v3}, Lc4/a$b;->readInt()I

    move-result v2

    rem-int/lit8 v4, v2, 0x2

    if-eqz v4, :cond_1

    add-int/lit8 v2, v2, 0x1

    :cond_1
    invoke-virtual {v3, v2}, Lc4/a$b;->f(I)V

    invoke-virtual {v1, v9}, Lc4/a;->q0(Lc4/a$c;)I

    move-result v2

    :goto_0
    move/from16 p2, v12

    :goto_1
    const/16 v16, -0x1

    goto/16 :goto_c

    :catchall_0
    move-exception v0

    move-object v7, v8

    goto/16 :goto_e

    :catch_0
    move-exception v0

    move-object v7, v8

    goto/16 :goto_d

    :cond_2
    new-array v2, v11, [B

    invoke-virtual {v3, v2}, Lc4/a$b;->readFully([B)V

    sget-object v4, Lc4/a;->Q:[B

    invoke-static {v2, v4}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v6

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eqz v6, :cond_7

    invoke-virtual {v3}, Lc4/a$b;->readInt()I

    move-result v2

    rem-int/lit8 v6, v2, 0x2

    if-ne v6, v14, :cond_3

    add-int/lit8 v6, v2, 0x1

    goto :goto_2

    :cond_3
    move v6, v2

    :goto_2
    new-array v6, v6, [B

    invoke-virtual {v3, v6}, Lc4/a$b;->readFully([B)V

    aget-byte v15, v6, v13

    or-int/2addr v15, v12

    int-to-byte v15, v15

    aput-byte v15, v6, v13

    shr-int/2addr v15, v14

    and-int/2addr v15, v14

    if-ne v15, v14, :cond_4

    move v13, v14

    :cond_4
    invoke-virtual {v9, v4}, Lc4/a$c;->write([B)V

    invoke-virtual {v9, v2}, Lc4/a$c;->c(I)V

    invoke-virtual {v9, v6}, Lc4/a$c;->write([B)V

    if-eqz v13, :cond_6

    sget-object v2, Lc4/a;->T:[B

    invoke-virtual {v1, v3, v9, v2, v7}, Lc4/a;->h(Lc4/a$b;Lc4/a$c;[B[B)V

    :goto_3
    new-array v2, v11, [B
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v3, v2}, Lc4/a$b;->readFully([B)V

    sget-object v4, Lc4/a;->U:[B

    invoke-static {v2, v4}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v4
    :try_end_2
    .catch Ljava/io/EOFException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    xor-int/2addr v4, v14

    goto :goto_4

    :catch_1
    move v4, v14

    :goto_4
    if-eqz v4, :cond_5

    :try_start_3
    invoke-virtual {v1, v9}, Lc4/a;->q0(Lc4/a$c;)I

    move-result v2

    goto :goto_0

    :cond_5
    invoke-virtual {v1, v3, v9, v2}, Lc4/a;->i(Lc4/a$b;Lc4/a$c;[B)V

    goto :goto_3

    :cond_6
    sget-object v2, Lc4/a;->S:[B

    sget-object v4, Lc4/a;->R:[B

    invoke-virtual {v1, v3, v9, v2, v4}, Lc4/a;->h(Lc4/a$b;Lc4/a$c;[B[B)V

    invoke-virtual {v1, v9}, Lc4/a;->q0(Lc4/a$c;)I

    move-result v2

    goto :goto_0

    :cond_7
    sget-object v6, Lc4/a;->S:[B

    invoke-static {v2, v6}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v7

    if-nez v7, :cond_9

    sget-object v7, Lc4/a;->R:[B

    invoke-static {v2, v7}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v7

    if-eqz v7, :cond_8

    goto :goto_5

    :cond_8
    move/from16 p2, v12

    const/4 v2, -0x1

    goto/16 :goto_1

    :cond_9
    :goto_5
    invoke-virtual {v3}, Lc4/a$b;->readInt()I

    move-result v7

    rem-int/lit8 v15, v7, 0x2

    if-ne v15, v14, :cond_a

    add-int/lit8 v15, v7, 0x1

    :goto_6
    move/from16 p1, v11

    goto :goto_7

    :cond_a
    move v15, v7

    goto :goto_6

    :goto_7
    const/4 v11, 0x3

    move/from16 p2, v12

    new-array v12, v11, [B

    invoke-static {v2, v6}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v16

    move/from16 v17, v13

    const/16 v13, 0x2f

    if-eqz v16, :cond_c

    invoke-virtual {v3, v12}, Lc4/a$b;->readFully([B)V

    new-array v11, v11, [B

    invoke-virtual {v3, v11}, Lc4/a$b;->readFully([B)V

    sget-object v14, Lc4/a;->P:[B

    invoke-static {v14, v11}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v11

    if-eqz v11, :cond_b

    invoke-virtual {v3}, Lc4/a$b;->readInt()I

    move-result v11

    and-int/lit16 v14, v11, 0x3fff

    const/16 v16, -0x1

    shr-int/lit8 v10, v11, 0x10

    and-int/lit16 v10, v10, 0x3fff

    add-int/lit8 v15, v15, -0xa

    move/from16 v20, v15

    move v15, v14

    move/from16 v14, v17

    goto :goto_9

    :cond_b
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Error checking VP8 signature"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    const/16 v16, -0x1

    sget-object v10, Lc4/a;->R:[B

    invoke-static {v2, v10}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v10

    if-eqz v10, :cond_f

    invoke-virtual {v3}, Lc4/a$b;->readByte()B

    move-result v10

    if-ne v10, v13, :cond_e

    invoke-virtual {v3}, Lc4/a$b;->readInt()I

    move-result v11

    and-int/lit16 v10, v11, 0x3fff

    add-int/2addr v10, v14

    const v18, 0xfffc000

    and-int v18, v11, v18

    ushr-int/lit8 v18, v18, 0xe

    add-int/lit8 v18, v18, 0x1

    const/high16 v19, 0x10000000

    and-int v19, v11, v19

    if-eqz v19, :cond_d

    goto :goto_8

    :cond_d
    move/from16 v14, v17

    :goto_8
    add-int/lit8 v15, v15, -0x5

    move/from16 v20, v15

    move v15, v10

    move/from16 v10, v18

    goto :goto_9

    :cond_e
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Error checking VP8L signature"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    move/from16 v20, v15

    move/from16 v10, v17

    move v11, v10

    move v14, v11

    move v15, v14

    :goto_9
    invoke-virtual {v9, v4}, Lc4/a$c;->write([B)V

    const/16 v4, 0xa

    invoke-virtual {v9, v4}, Lc4/a$c;->c(I)V

    new-array v4, v4, [B

    if-eqz v14, :cond_10

    aget-byte v14, v4, v17

    or-int/lit8 v14, v14, 0x10

    int-to-byte v14, v14

    aput-byte v14, v4, v17

    :cond_10
    aget-byte v14, v4, v17

    or-int/lit8 v14, v14, 0x8

    int-to-byte v14, v14

    aput-byte v14, v4, v17

    add-int/lit8 v15, v15, -0x1

    add-int/lit8 v10, v10, -0x1

    int-to-byte v14, v15

    aput-byte v14, v4, p1

    shr-int/lit8 v14, v15, 0x8

    int-to-byte v14, v14

    const/16 v17, 0x5

    aput-byte v14, v4, v17

    shr-int/lit8 v14, v15, 0x10

    int-to-byte v14, v14

    const/4 v15, 0x6

    aput-byte v14, v4, v15

    const/4 v14, 0x7

    int-to-byte v15, v10

    aput-byte v15, v4, v14

    shr-int/lit8 v14, v10, 0x8

    int-to-byte v14, v14

    aput-byte v14, v4, p2

    shr-int/lit8 v10, v10, 0x10

    int-to-byte v10, v10

    const/16 v14, 0x9

    aput-byte v10, v4, v14

    invoke-virtual {v9, v4}, Lc4/a$c;->write([B)V

    invoke-virtual {v9, v2}, Lc4/a$c;->write([B)V

    invoke-virtual {v9, v7}, Lc4/a$c;->c(I)V

    invoke-static {v2, v6}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-virtual {v9, v12}, Lc4/a$c;->write([B)V

    sget-object v2, Lc4/a;->P:[B

    invoke-virtual {v9, v2}, Lc4/a$c;->write([B)V

    invoke-virtual {v9, v11}, Lc4/a$c;->c(I)V

    :cond_11
    :goto_a
    move/from16 v15, v20

    goto :goto_b

    :cond_12
    sget-object v4, Lc4/a;->R:[B

    invoke-static {v2, v4}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-virtual {v9, v13}, Ljava/io/OutputStream;->write(I)V

    invoke-virtual {v9, v11}, Lc4/a$c;->c(I)V

    goto :goto_a

    :goto_b
    invoke-static {v3, v9, v15}, Lc4/b;->e(Ljava/io/InputStream;Ljava/io/OutputStream;I)V

    invoke-virtual {v1, v9}, Lc4/a;->q0(Lc4/a$c;)I

    move-result v2

    :goto_c
    add-int/lit8 v5, v5, 0x8

    invoke-virtual {v3}, Lc4/a$b;->b()I

    move-result v4

    sub-int/2addr v5, v4

    invoke-static {v3, v9, v5}, Lc4/b;->e(Ljava/io/InputStream;Ljava/io/OutputStream;I)V

    invoke-virtual {v8}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v4

    sget-object v5, Lc4/a;->N:[B

    array-length v6, v5

    add-int/2addr v4, v6

    invoke-virtual {v0, v4}, Lc4/a$c;->c(I)V

    invoke-virtual {v0, v5}, Lc4/a$c;->write([B)V

    move/from16 v4, v16

    if-eq v2, v4, :cond_13

    iget-object v4, v0, Lc4/a$c;->a:Ljava/io/DataOutputStream;

    invoke-virtual {v4}, Ljava/io/DataOutputStream;->size()I

    move-result v4

    add-int/2addr v4, v2

    iput v4, v1, Lc4/a;->p:I

    :cond_13
    invoke-virtual {v8, v0}, Ljava/io/ByteArrayOutputStream;->writeTo(Ljava/io/OutputStream;)V

    invoke-static {v3, v0}, Lc4/b;->d(Ljava/io/InputStream;Ljava/io/OutputStream;)I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static {v8}, Lc4/b;->b(Ljava/io/Closeable;)V

    return-void

    :catchall_1
    move-exception v0

    goto :goto_e

    :catch_2
    move-exception v0

    :goto_d
    :try_start_4
    new-instance v2, Ljava/io/IOException;

    const-string v3, "Failed to save WebP file"

    invoke-direct {v2, v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_e
    invoke-static {v7}, Lc4/b;->b(Ljava/io/Closeable;)V

    throw v0
.end method

.method public g0(D)V
    .locals 2

    const-wide/16 v0, 0x0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_0

    const-string v0, "0"

    goto :goto_0

    :cond_0
    const-string v0, "1"

    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Math;->abs(D)D

    move-result-wide p1

    invoke-static {p1, p2}, Lc4/a$f;->b(D)Lc4/a$f;

    move-result-object p1

    invoke-virtual {p1}, Lc4/a$f;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "GPSAltitude"

    invoke-virtual {p0, p2, p1}, Lc4/a;->h0(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "GPSAltitudeRef"

    invoke-virtual {p0, p1, v0}, Lc4/a;->h0(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final h(Lc4/a$b;Lc4/a$c;[B[B)V
    .locals 2

    :cond_0
    const/4 v0, 0x4

    new-array v0, v0, [B

    invoke-virtual {p1, v0}, Lc4/a$b;->readFully([B)V

    invoke-virtual {p0, p1, p2, v0}, Lc4/a;->i(Lc4/a$b;Lc4/a$c;[B)V

    invoke-static {v0, p3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_1

    if-eqz p4, :cond_0

    invoke-static {v0, p4}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_1
    return-void
.end method

.method public h0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    if-eqz v1, :cond_21

    const-string v3, "ISOSpeedRatings"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "ExifInterface"

    if-eqz v3, :cond_1

    sget-boolean v1, Lc4/a;->w:Z

    if-eqz v1, :cond_0

    const-string v1, "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."

    invoke-static {v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const-string v1, "PhotographicSensitivity"

    :cond_1
    const/4 v3, 0x3

    const/4 v5, 0x2

    const-string v6, "/"

    const/4 v7, 0x1

    if-eqz v2, :cond_8

    sget-object v8, Lc4/a;->o0:Ljava/util/Set;

    invoke-interface {v8, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    const-string v9, " : "

    const-string v10, "Invalid value for "

    if-eqz v8, :cond_2

    invoke-virtual {v2, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_2

    :try_start_0
    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v11

    invoke-static {v11, v12}, Lc4/a$f;->b(D)Lc4/a$f;

    move-result-object v8

    invoke-virtual {v8}, Lc4/a$f;->toString()Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    :catch_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_2
    const-string v8, "GPSTimeStamp"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    sget-object v8, Lc4/a;->u0:Ljava/util/regex/Pattern;

    invoke-virtual {v8, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/regex/Matcher;->find()Z

    move-result v11

    if-nez v11, :cond_3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, "/1,"

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v10

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, "/1"

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_4
    const-string v8, "DateTime"

    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    const-string v8, "DateTimeOriginal"

    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    const-string v8, "DateTimeDigitized"

    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    :cond_5
    sget-object v8, Lc4/a;->v0:Ljava/util/regex/Pattern;

    invoke-virtual {v8, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/regex/Matcher;->find()Z

    move-result v8

    sget-object v11, Lc4/a;->w0:Ljava/util/regex/Pattern;

    invoke-virtual {v11, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/regex/Matcher;->find()Z

    move-result v11

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v12

    const/16 v13, 0x13

    if-ne v12, v13, :cond_7

    if-nez v8, :cond_6

    if-nez v11, :cond_6

    goto :goto_0

    :cond_6
    if-eqz v11, :cond_8

    const-string v8, "-"

    const-string v9, ":"

    invoke-virtual {v2, v8, v9}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_7
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_8
    :goto_1
    const-string v8, "Xmp"

    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    const/4 v10, 0x0

    if-eqz v9, :cond_e

    iget-object v9, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v9, v9, v10

    invoke-virtual {v9, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_a

    iget-object v9, v0, Lc4/a;->f:[Ljava/util/HashMap;

    const/4 v11, 0x5

    aget-object v9, v9, v11

    invoke-virtual {v9, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    goto :goto_2

    :cond_9
    move v8, v10

    goto :goto_3

    :cond_a
    :goto_2
    move v8, v7

    :goto_3
    iget v9, v0, Lc4/a;->d:I

    invoke-static {v9}, Lc4/a;->C(I)I

    move-result v9

    if-ne v9, v5, :cond_b

    iget-object v11, v0, Lc4/a;->u:Lc4/a$d;

    if-nez v11, :cond_c

    if-eqz v8, :cond_c

    :cond_b
    if-ne v9, v3, :cond_e

    if-nez v8, :cond_e

    :cond_c
    if-eqz v2, :cond_d

    invoke-static {v2}, Lc4/a$d;->a(Ljava/lang/String;)Lc4/a$d;

    move-result-object v1

    goto :goto_4

    :cond_d
    const/4 v1, 0x0

    :goto_4
    iput-object v1, v0, Lc4/a;->u:Lc4/a$d;

    return-void

    :cond_e
    move v3, v10

    :goto_5
    sget-object v8, Lc4/a;->k0:[[Lc4/a$e;

    array-length v8, v8

    if-ge v3, v8, :cond_20

    const/4 v8, 0x4

    if-ne v3, v8, :cond_10

    iget-boolean v8, v0, Lc4/a;->i:Z

    if-nez v8, :cond_10

    :cond_f
    :goto_6
    move-object/from16 v22, v6

    move/from16 p1, v7

    move/from16 v20, v10

    goto/16 :goto_14

    :cond_10
    sget-object v8, Lc4/a;->n0:[Ljava/util/HashMap;

    aget-object v8, v8, v3

    invoke-virtual {v8, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lc4/a$e;

    if-eqz v8, :cond_f

    if-nez v2, :cond_11

    iget-object v8, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v8, v8, v3

    invoke-virtual {v8, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_11
    invoke-static {v2}, Lc4/a;->D(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v9

    iget v11, v8, Lc4/a$e;->c:I

    iget-object v12, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    const/4 v13, -0x1

    if-eq v11, v12, :cond_19

    iget v11, v8, Lc4/a$e;->c:I

    iget-object v12, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    if-ne v11, v12, :cond_12

    goto/16 :goto_b

    :cond_12
    iget v11, v8, Lc4/a$e;->d:I

    if-eq v11, v13, :cond_14

    iget-object v12, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    if-eq v11, v12, :cond_13

    iget v11, v8, Lc4/a$e;->d:I

    iget-object v12, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    if-ne v11, v12, :cond_14

    :cond_13
    iget v8, v8, Lc4/a$e;->d:I

    goto/16 :goto_c

    :cond_14
    iget v11, v8, Lc4/a$e;->c:I

    if-eq v11, v7, :cond_18

    const/4 v12, 0x7

    if-eq v11, v12, :cond_18

    if-ne v11, v5, :cond_15

    goto/16 :goto_a

    :cond_15
    sget-boolean v11, Lc4/a;->w:Z

    if-eqz v11, :cond_f

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Given tag ("

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, ") value didn\'t match with one of expected formats: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v12, Lc4/a;->X:[Ljava/lang/String;

    iget v14, v8, Lc4/a$e;->c:I

    aget-object v14, v12, v14

    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v14, v8, Lc4/a$e;->d:I

    const-string v15, ", "

    const-string v16, ""

    if-ne v14, v13, :cond_16

    move-object/from16 v8, v16

    goto :goto_7

    :cond_16
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v8, v8, Lc4/a$e;->d:I

    aget-object v8, v12, v8

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    :goto_7
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " (guess: "

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    aget-object v8, v12, v8

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v13, :cond_17

    :goto_8
    move-object/from16 v8, v16

    goto :goto_9

    :cond_17
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    aget-object v9, v12, v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    goto :goto_8

    :goto_9
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ")"

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v4, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_6

    :cond_18
    :goto_a
    move v8, v11

    goto :goto_c

    :cond_19
    :goto_b
    iget v8, v8, Lc4/a$e;->c:I

    :goto_c
    const-string v9, ","

    packed-switch v8, :pswitch_data_0

    :pswitch_0
    sget-boolean v9, Lc4/a;->w:Z

    if-eqz v9, :cond_f

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Data format isn\'t one of expected formats: "

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v4, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_6

    :pswitch_1
    invoke-virtual {v2, v9, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v8

    array-length v9, v8

    new-array v9, v9, [D

    move v11, v10

    :goto_d
    array-length v12, v8

    if-ge v11, v12, :cond_1a

    aget-object v12, v8, v11

    invoke-static {v12}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v12

    aput-wide v12, v9, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_d

    :cond_1a
    iget-object v8, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v8, v8, v3

    iget-object v11, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v9, v11}, Lc4/a$d;->b([DLjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v9

    invoke-virtual {v8, v1, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_6

    :pswitch_2
    invoke-virtual {v2, v9, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v8

    array-length v9, v8

    new-array v9, v9, [Lc4/a$f;

    move v11, v10

    :goto_e
    array-length v12, v8

    if-ge v11, v12, :cond_1b

    aget-object v12, v8, v11

    invoke-virtual {v12, v6, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v12

    new-instance v14, Lc4/a$f;

    aget-object v15, v12, v10

    move/from16 p1, v7

    move-object/from16 p2, v8

    invoke-static {v15}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v7

    double-to-long v7, v7

    aget-object v12, v12, p1

    move/from16 v20, v10

    move/from16 v21, v11

    invoke-static {v12}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v10

    double-to-long v10, v10

    const/16 v19, 0x0

    move-wide v15, v7

    move-wide/from16 v17, v10

    invoke-direct/range {v14 .. v19}, Lc4/a$f;-><init>(JJLc4/a$a;)V

    aput-object v14, v9, v21

    add-int/lit8 v11, v21, 0x1

    move/from16 v7, p1

    move-object/from16 v8, p2

    move/from16 v10, v20

    goto :goto_e

    :cond_1b
    move/from16 p1, v7

    move/from16 v20, v10

    iget-object v7, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v7, v7, v3

    iget-object v8, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v9, v8}, Lc4/a$d;->d([Lc4/a$f;Ljava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v8

    invoke-virtual {v7, v1, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_f
    move-object/from16 v22, v6

    goto/16 :goto_14

    :pswitch_3
    move/from16 p1, v7

    move/from16 v20, v10

    invoke-virtual {v2, v9, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v7

    array-length v8, v7

    new-array v8, v8, [I

    move/from16 v9, v20

    :goto_10
    array-length v10, v7

    if-ge v9, v10, :cond_1c

    aget-object v10, v7, v9

    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v10

    aput v10, v8, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_10

    :cond_1c
    iget-object v7, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v7, v7, v3

    iget-object v9, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v8, v9}, Lc4/a$d;->c([ILjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v8

    invoke-virtual {v7, v1, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_f

    :pswitch_4
    move/from16 p1, v7

    move/from16 v20, v10

    invoke-virtual {v2, v9, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v7

    array-length v8, v7

    new-array v8, v8, [Lc4/a$f;

    move/from16 v9, v20

    :goto_11
    array-length v10, v7

    if-ge v9, v10, :cond_1d

    aget-object v10, v7, v9

    invoke-virtual {v10, v6, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v10

    new-instance v14, Lc4/a$f;

    aget-object v11, v10, v20

    invoke-static {v11}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v11

    double-to-long v11, v11

    aget-object v10, v10, p1

    move-object/from16 v22, v6

    invoke-static {v10}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v5

    double-to-long v5, v5

    const/16 v19, 0x0

    move-wide/from16 v17, v5

    move-wide v15, v11

    invoke-direct/range {v14 .. v19}, Lc4/a$f;-><init>(JJLc4/a$a;)V

    aput-object v14, v8, v9

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v6, v22

    const/4 v5, 0x2

    goto :goto_11

    :cond_1d
    move-object/from16 v22, v6

    iget-object v5, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v5, v5, v3

    iget-object v6, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v8, v6}, Lc4/a$d;->i([Lc4/a$f;Ljava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v6

    invoke-virtual {v5, v1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_14

    :pswitch_5
    move-object/from16 v22, v6

    move/from16 p1, v7

    move/from16 v20, v10

    invoke-virtual {v2, v9, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v5

    array-length v6, v5

    new-array v6, v6, [J

    move/from16 v7, v20

    :goto_12
    array-length v8, v5

    if-ge v7, v8, :cond_1e

    aget-object v8, v5, v7

    invoke-static {v8}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v8

    aput-wide v8, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_12

    :cond_1e
    iget-object v5, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v5, v5, v3

    iget-object v7, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v6, v7}, Lc4/a$d;->g([JLjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v6

    invoke-virtual {v5, v1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_14

    :pswitch_6
    move-object/from16 v22, v6

    move/from16 p1, v7

    move/from16 v20, v10

    invoke-virtual {v2, v9, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v5

    array-length v6, v5

    new-array v6, v6, [I

    move/from16 v7, v20

    :goto_13
    array-length v8, v5

    if-ge v7, v8, :cond_1f

    aget-object v8, v5, v7

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    aput v8, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_13

    :cond_1f
    iget-object v5, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v5, v5, v3

    iget-object v7, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v6, v7}, Lc4/a$d;->k([ILjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v6

    invoke-virtual {v5, v1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_14

    :pswitch_7
    move-object/from16 v22, v6

    move/from16 p1, v7

    move/from16 v20, v10

    iget-object v5, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v5, v5, v3

    invoke-static {v2}, Lc4/a$d;->e(Ljava/lang/String;)Lc4/a$d;

    move-result-object v6

    invoke-virtual {v5, v1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_14

    :pswitch_8
    move-object/from16 v22, v6

    move/from16 p1, v7

    move/from16 v20, v10

    iget-object v5, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v5, v5, v3

    invoke-static {v2}, Lc4/a$d;->a(Ljava/lang/String;)Lc4/a$d;

    move-result-object v6

    invoke-virtual {v5, v1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_14
    add-int/lit8 v3, v3, 0x1

    move/from16 v7, p1

    move/from16 v10, v20

    move-object/from16 v6, v22

    const/4 v5, 0x2

    goto/16 :goto_5

    :cond_20
    return-void

    :cond_21
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "tag shouldn\'t be null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_7
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final i(Lc4/a$b;Lc4/a$c;[B)V
    .locals 2

    invoke-virtual {p1}, Lc4/a$b;->readInt()I

    move-result v0

    invoke-virtual {p2, p3}, Lc4/a$c;->write([B)V

    invoke-virtual {p2, v0}, Lc4/a$c;->c(I)V

    rem-int/lit8 p3, v0, 0x2

    const/4 v1, 0x1

    if-ne p3, v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    :cond_0
    invoke-static {p1, p2, v0}, Lc4/b;->e(Ljava/io/InputStream;Ljava/io/OutputStream;I)V

    return-void
.end method

.method public i0(Landroid/location/Location;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "GPSProcessingMethod"

    invoke-virtual {p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lc4/a;->h0(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-virtual {p0, v0, v1, v2, v3}, Lc4/a;->j0(DD)V

    invoke-virtual {p1}, Landroid/location/Location;->getAltitude()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lc4/a;->g0(D)V

    const-string v0, "GPSSpeedRef"

    const-string v1, "K"

    invoke-virtual {p0, v0, v1}, Lc4/a;->h0(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/location/Location;->getSpeed()F

    move-result v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v1

    long-to-float v1, v1

    mul-float/2addr v0, v1

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Lc4/a$f;->b(D)Lc4/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lc4/a$f;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "GPSSpeed"

    invoke-virtual {p0, v1, v0}, Lc4/a;->h0(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lc4/a;->V:Ljava/text/SimpleDateFormat;

    new-instance v1, Ljava/util/Date;

    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "\\s+"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    aget-object v0, p1, v0

    const-string v1, "GPSDateStamp"

    invoke-virtual {p0, v1, v0}, Lc4/a;->h0(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    aget-object p1, p1, v0

    const-string v0, "GPSTimeStamp"

    invoke-virtual {p0, v0, p1}, Lc4/a;->h0(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public j(D)D
    .locals 6

    const-string v0, "GPSAltitude"

    const-wide/high16 v1, -0x4010000000000000L    # -1.0

    invoke-virtual {p0, v0, v1, v2}, Lc4/a;->l(Ljava/lang/String;D)D

    move-result-wide v0

    const-string v2, "GPSAltitudeRef"

    const/4 v3, -0x1

    invoke-virtual {p0, v2, v3}, Lc4/a;->m(Ljava/lang/String;I)I

    move-result v2

    const-wide/16 v4, 0x0

    cmpl-double v4, v0, v4

    if-ltz v4, :cond_1

    if-ltz v2, :cond_1

    const/4 p1, 0x1

    if-ne v2, p1, :cond_0

    goto :goto_0

    :cond_0
    move v3, p1

    :goto_0
    int-to-double p1, v3

    mul-double/2addr v0, p1

    return-wide v0

    :cond_1
    return-wide p1
.end method

.method public j0(DD)V
    .locals 4

    const-wide v0, -0x3fa9800000000000L    # -90.0

    cmpg-double v0, p1, v0

    const-string v1, " is not valid."

    if-ltz v0, :cond_3

    const-wide v2, 0x4056800000000000L    # 90.0

    cmpl-double v0, p1, v2

    if-gtz v0, :cond_3

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_3

    const-wide v2, -0x3f99800000000000L    # -180.0

    cmpg-double v0, p3, v2

    if-ltz v0, :cond_2

    const-wide v2, 0x4066800000000000L    # 180.0

    cmpl-double v0, p3, v2

    if-gtz v0, :cond_2

    invoke-static {p3, p4}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_2

    const-wide/16 v0, 0x0

    cmpl-double v2, p1, v0

    if-ltz v2, :cond_0

    const-string v2, "N"

    goto :goto_0

    :cond_0
    const-string v2, "S"

    :goto_0
    const-string v3, "GPSLatitudeRef"

    invoke-virtual {p0, v3, v2}, Lc4/a;->h0(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1, p2}, Ljava/lang/Math;->abs(D)D

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lc4/a;->f(D)Ljava/lang/String;

    move-result-object p1

    const-string p2, "GPSLatitude"

    invoke-virtual {p0, p2, p1}, Lc4/a;->h0(Ljava/lang/String;Ljava/lang/String;)V

    cmpl-double p1, p3, v0

    if-ltz p1, :cond_1

    const-string p1, "E"

    goto :goto_1

    :cond_1
    const-string p1, "W"

    :goto_1
    const-string p2, "GPSLongitudeRef"

    invoke-virtual {p0, p2, p1}, Lc4/a;->h0(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p3, p4}, Ljava/lang/Math;->abs(D)D

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lc4/a;->f(D)Ljava/lang/String;

    move-result-object p1

    const-string p2, "GPSLongitude"

    invoke-virtual {p0, p2, p1}, Lc4/a;->h0(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Longitude value "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3, p4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p3, Ljava/lang/IllegalArgumentException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Latitude value "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p3
.end method

.method public k(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    if-eqz p1, :cond_6

    invoke-virtual {p0, p1}, Lc4/a;->n(Ljava/lang/String;)Lc4/a$d;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const-string v2, "GPSTimeStamp"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget p1, v0, Lc4/a$d;->a:I

    const/4 v2, 0x5

    const-string v3, "ExifInterface"

    if-eq p1, v2, :cond_1

    const/16 v2, 0xa

    if-eq p1, v2, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "GPS Timestamp format is not rational. format="

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, v0, Lc4/a$d;->a:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :cond_1
    iget-object p1, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v0, p1}, Lc4/a$d;->o(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lc4/a$f;

    if-eqz p1, :cond_3

    array-length v0, p1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    aget-object v0, p1, v0

    iget-wide v1, v0, Lc4/a$f;->a:J

    long-to-float v1, v1

    iget-wide v2, v0, Lc4/a$f;->b:J

    long-to-float v0, v2

    div-float/2addr v1, v0

    float-to-int v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v1, p1, v1

    iget-wide v2, v1, Lc4/a$f;->a:J

    long-to-float v2, v2

    iget-wide v3, v1, Lc4/a$f;->b:J

    long-to-float v1, v3

    div-float/2addr v2, v1

    float-to-int v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aget-object p1, p1, v2

    iget-wide v2, p1, Lc4/a$f;->a:J

    long-to-float v2, v2

    iget-wide v3, p1, Lc4/a$f;->b:J

    long-to-float p1, v3

    div-float/2addr v2, p1

    float-to-int p1, v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v0, v1, p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "%02d:%02d:%02d"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid GPS Timestamp array. array="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :cond_4
    sget-object v2, Lc4/a;->o0:Ljava/util/Set;

    invoke-interface {v2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    :try_start_0
    iget-object p1, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v0, p1}, Lc4/a$d;->l(Ljava/nio/ByteOrder;)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    return-object v1

    :cond_5
    iget-object p1, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v0, p1}, Lc4/a$d;->n(Ljava/nio/ByteOrder;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "tag shouldn\'t be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final k0(Lc4/a$b;)V
    .locals 4

    iget-object v0, p0, Lc4/a;->f:[Ljava/util/HashMap;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    const-string v1, "Compression"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc4/a$d;

    const/4 v2, 0x6

    if-eqz v1, :cond_3

    iget-object v3, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v3}, Lc4/a$d;->m(Ljava/nio/ByteOrder;)I

    move-result v1

    iput v1, p0, Lc4/a;->o:I

    const/4 v3, 0x1

    if-eq v1, v3, :cond_1

    if-eq v1, v2, :cond_0

    const/4 v2, 0x7

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, v0}, Lc4/a;->E(Lc4/a$b;Ljava/util/HashMap;)V

    return-void

    :cond_1
    invoke-virtual {p0, v0}, Lc4/a;->P(Ljava/util/HashMap;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, p1, v0}, Lc4/a;->F(Lc4/a$b;Ljava/util/HashMap;)V

    :cond_2
    :goto_0
    return-void

    :cond_3
    iput v2, p0, Lc4/a;->o:I

    invoke-virtual {p0, p1, v0}, Lc4/a;->E(Lc4/a$b;Ljava/util/HashMap;)V

    return-void
.end method

.method public l(Ljava/lang/String;D)D
    .locals 1

    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, Lc4/a;->n(Ljava/lang/String;)Lc4/a$d;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Lc4/a$d;->l(Ljava/nio/ByteOrder;)D

    move-result-wide p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    :goto_0
    return-wide p2

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "tag shouldn\'t be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public m(Ljava/lang/String;I)I
    .locals 1

    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, Lc4/a;->n(Ljava/lang/String;)Lc4/a$d;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Lc4/a$d;->m(Ljava/nio/ByteOrder;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    :goto_0
    return p2

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "tag shouldn\'t be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final m0(II)V
    .locals 6

    iget-object v0, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v0, v0, p1

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    const-string v1, "ExifInterface"

    if-nez v0, :cond_5

    iget-object v0, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v0, v0, p2

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v0, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v0, v0, p1

    const-string v2, "ImageLength"

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc4/a$d;

    iget-object v3, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v3, v3, p1

    const-string v4, "ImageWidth"

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc4/a$d;

    iget-object v5, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v5, v5, p2

    invoke-virtual {v5, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc4/a$d;

    iget-object v5, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v5, v5, p2

    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc4/a$d;

    if-eqz v0, :cond_4

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    if-eqz v2, :cond_3

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Lc4/a$d;->m(Ljava/nio/ByteOrder;)I

    move-result v0

    iget-object v1, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v3, v1}, Lc4/a$d;->m(Ljava/nio/ByteOrder;)I

    move-result v1

    iget-object v3, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v2, v3}, Lc4/a$d;->m(Ljava/nio/ByteOrder;)I

    move-result v2

    iget-object v3, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v4, v3}, Lc4/a$d;->m(Ljava/nio/ByteOrder;)I

    move-result v3

    if-ge v0, v2, :cond_6

    if-ge v1, v3, :cond_6

    iget-object v0, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v1, v0, p1

    aget-object v2, v0, p2

    aput-object v2, v0, p1

    aput-object v1, v0, p2

    return-void

    :cond_3
    :goto_0
    sget-boolean p1, Lc4/a;->w:Z

    if-eqz p1, :cond_6

    const-string p1, "Second image does not contain valid size information"

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_4
    :goto_1
    sget-boolean p1, Lc4/a;->w:Z

    if-eqz p1, :cond_6

    const-string p1, "First image does not contain valid size information"

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_5
    :goto_2
    sget-boolean p1, Lc4/a;->w:Z

    if-eqz p1, :cond_6

    const-string p1, "Cannot perform swap since only one image data exists"

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_6
    return-void
.end method

.method public final n(Ljava/lang/String;)Lc4/a$d;
    .locals 3

    if-eqz p1, :cond_6

    const-string v0, "ISOSpeedRatings"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-boolean p1, Lc4/a;->w:Z

    if-eqz p1, :cond_0

    const-string p1, "ExifInterface"

    const-string v0, "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const-string p1, "PhotographicSensitivity"

    :cond_1
    const-string v0, "Xmp"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Lc4/a;->d:I

    invoke-static {v1}, Lc4/a;->C(I)I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Lc4/a;->u:Lc4/a$d;

    if-eqz v1, :cond_2

    return-object v1

    :cond_2
    const/4 v1, 0x0

    :goto_0
    sget-object v2, Lc4/a;->k0:[[Lc4/a$e;

    array-length v2, v2

    if-ge v1, v2, :cond_4

    iget-object v2, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc4/a$d;

    if-eqz v2, :cond_3

    return-object v2

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lc4/a;->u:Lc4/a$d;

    if-eqz p1, :cond_5

    return-object p1

    :cond_5
    const/4 p1, 0x0

    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "tag shouldn\'t be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final o(Lc4/a$g;I)V
    .locals 13

    const-string v0, "yes"

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_f

    const/16 v2, 0xf

    const/16 v3, 0x1f

    if-ne p2, v2, :cond_1

    if-lt v1, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Reading EXIF from AVIF files is supported from SDK 31 and above"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    new-instance p2, Landroid/media/MediaMetadataRetriever;

    invoke-direct {p2}, Landroid/media/MediaMetadataRetriever;-><init>()V

    :try_start_0
    new-instance v1, Lc4/a$a;

    invoke-direct {v1, p0, p1}, Lc4/a$a;-><init>(Lc4/a;Lc4/a$g;)V

    invoke-static {p2, v1}, Lc4/b$a;->a(Landroid/media/MediaMetadataRetriever;Landroid/media/MediaDataSource;)V

    const/16 v1, 0x21

    invoke-virtual {p2, v1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x22

    invoke-virtual {p2, v2}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v2

    const/16 v4, 0x1a

    invoke-virtual {p2, v4}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x11

    invoke-virtual {p2, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v0, 0x1d

    invoke-virtual {p2, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v0

    const/16 v4, 0x1e

    invoke-virtual {p2, v4}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2, v3}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_5

    :catch_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_4

    :cond_2
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x12

    invoke-virtual {p2, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v0

    const/16 v3, 0x13

    invoke-virtual {p2, v3}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v4

    const/16 v3, 0x18

    invoke-virtual {p2, v3}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    move-object v3, v0

    move-object v4, v3

    :goto_1
    const/4 v5, 0x0

    if-eqz v0, :cond_4

    iget-object v6, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v6, v6, v5

    const-string v7, "ImageWidth"

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    iget-object v9, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v8, v9}, Lc4/a$d;->j(ILjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    if-eqz v4, :cond_5

    iget-object v6, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v6, v6, v5

    const-string v7, "ImageLength"

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    iget-object v9, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v8, v9}, Lc4/a$d;->j(ILjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    const/4 v6, 0x1

    const/4 v7, 0x6

    if-eqz v3, :cond_9

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    const/16 v9, 0x5a

    if-eq v8, v9, :cond_8

    const/16 v9, 0xb4

    if-eq v8, v9, :cond_7

    const/16 v9, 0x10e

    if-eq v8, v9, :cond_6

    move v8, v6

    goto :goto_2

    :cond_6
    const/16 v8, 0x8

    goto :goto_2

    :cond_7
    const/4 v8, 0x3

    goto :goto_2

    :cond_8
    move v8, v7

    :goto_2
    iget-object v9, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v9, v9, v5

    const-string v10, "Orientation"

    iget-object v11, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v8, v11}, Lc4/a$d;->j(ILjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v8

    invoke-virtual {v9, v10, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    if-eqz v1, :cond_c

    if-eqz v2, :cond_c

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    if-le v2, v7, :cond_b

    int-to-long v8, v1

    invoke-virtual {p1, v8, v9}, Lc4/a$g;->g(J)V

    new-array v8, v7, [B

    invoke-virtual {p1, v8}, Lc4/a$b;->readFully([B)V

    add-int/2addr v1, v7

    add-int/lit8 v2, v2, -0x6

    sget-object v7, Lc4/a;->r0:[B

    invoke-static {v8, v7}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v7

    if-eqz v7, :cond_a

    new-array v2, v2, [B

    invoke-virtual {p1, v2}, Lc4/a$b;->readFully([B)V

    iput v1, p0, Lc4/a;->p:I

    invoke-virtual {p0, v2, v5}, Lc4/a;->X([BI)V

    goto :goto_3

    :cond_a
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid identifier"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid exif length"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    :goto_3
    const/16 v1, 0x29

    invoke-virtual {p2, v1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x2a

    invoke-virtual {p2, v2}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_d

    if-eqz v2, :cond_d

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    int-to-long v10, v1

    invoke-virtual {p1, v10, v11}, Lc4/a$g;->g(J)V

    new-array v12, v9, [B

    invoke-virtual {p1, v12}, Lc4/a$b;->readFully([B)V

    new-instance v7, Lc4/a$d;

    const/4 v8, 0x1

    invoke-direct/range {v7 .. v12}, Lc4/a$d;-><init>(IIJ[B)V

    iput-object v7, p0, Lc4/a;->u:Lc4/a$d;

    iput-boolean v6, p0, Lc4/a;->v:Z

    :cond_d
    sget-boolean p1, Lc4/a;->w:Z

    if-eqz p1, :cond_e

    const-string p1, "ExifInterface"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Heif meta: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "x"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", rotation "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_e
    :try_start_1
    invoke-virtual {p2}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void

    :goto_4
    :try_start_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."

    invoke-direct {v0, v1, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_5
    :try_start_3
    invoke-virtual {p2}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    throw p1

    :cond_f
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Reading EXIF from HEIC files is supported from SDK 28 and above"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final o0(Lc4/a$g;I)V
    .locals 9

    iget-object v0, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v0, v0, p2

    const-string v1, "DefaultCropSize"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc4/a$d;

    iget-object v1, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v1, v1, p2

    const-string v2, "SensorTopBorder"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc4/a$d;

    iget-object v2, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v2, v2, p2

    const-string v3, "SensorLeftBorder"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc4/a$d;

    iget-object v3, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v3, v3, p2

    const-string v4, "SensorBottomBorder"

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc4/a$d;

    iget-object v4, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v4, v4, p2

    const-string v5, "SensorRightBorder"

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc4/a$d;

    const-string v5, "ImageLength"

    const-string v6, "ImageWidth"

    if-eqz v0, :cond_5

    iget p1, v0, Lc4/a$d;->a:I

    const/4 v1, 0x5

    const-string v2, "Invalid crop size values. cropSize="

    const-string v3, "ExifInterface"

    const/4 v4, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x2

    if-ne p1, v1, :cond_2

    iget-object p1, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v0, p1}, Lc4/a$d;->o(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lc4/a$f;

    if-eqz p1, :cond_1

    array-length v0, p1

    if-eq v0, v8, :cond_0

    goto :goto_0

    :cond_0
    aget-object v0, p1, v7

    iget-object v1, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v0, v1}, Lc4/a$d;->h(Lc4/a$f;Ljava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v0

    aget-object p1, p1, v4

    iget-object v1, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {p1, v1}, Lc4/a$d;->h(Lc4/a$f;Ljava/nio/ByteOrder;)Lc4/a$d;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_2
    iget-object p1, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v0, p1}, Lc4/a$d;->o(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    if-eqz p1, :cond_4

    array-length v0, p1

    if-eq v0, v8, :cond_3

    goto :goto_2

    :cond_3
    aget v0, p1, v7

    iget-object v1, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v0, v1}, Lc4/a$d;->j(ILjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v0

    aget p1, p1, v4

    iget-object v1, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {p1, v1}, Lc4/a$d;->j(ILjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object p1

    :goto_1
    iget-object v1, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v1, v1, p2

    invoke-virtual {v1, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object p2, v0, p2

    invoke-virtual {p2, v5, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_4
    :goto_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_5
    if-eqz v1, :cond_7

    if-eqz v2, :cond_7

    if-eqz v3, :cond_7

    if-eqz v4, :cond_7

    iget-object p1, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v1, p1}, Lc4/a$d;->m(Ljava/nio/ByteOrder;)I

    move-result p1

    iget-object v0, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v3, v0}, Lc4/a$d;->m(Ljava/nio/ByteOrder;)I

    move-result v0

    iget-object v1, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v4, v1}, Lc4/a$d;->m(Ljava/nio/ByteOrder;)I

    move-result v1

    iget-object v3, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v2, v3}, Lc4/a$d;->m(Ljava/nio/ByteOrder;)I

    move-result v2

    if-le v0, p1, :cond_6

    if-le v1, v2, :cond_6

    sub-int/2addr v0, p1

    sub-int/2addr v1, v2

    iget-object p1, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v0, p1}, Lc4/a$d;->j(ILjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object p1

    iget-object v0, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v1, v0}, Lc4/a$d;->j(ILjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v0

    iget-object v1, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v1, v1, p2

    invoke-virtual {v1, v5, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object p1, p1, p2

    invoke-virtual {p1, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    return-void

    :cond_7
    invoke-virtual {p0, p1, p2}, Lc4/a;->b0(Lc4/a$g;I)V

    return-void
.end method

.method public final p(Lc4/a$b;II)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    sget-boolean v3, Lc4/a;->w:Z

    const-string v4, "ExifInterface"

    if-eqz v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getJpegAttributes starting with: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    sget-object v3, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v3}, Lc4/a$b;->e(Ljava/nio/ByteOrder;)V

    invoke-virtual {v1}, Lc4/a$b;->readByte()B

    move-result v3

    const-string v5, "Invalid marker: "

    const/4 v6, -0x1

    if-ne v3, v6, :cond_10

    invoke-virtual {v1}, Lc4/a$b;->readByte()B

    move-result v7

    const/16 v8, -0x28

    if-ne v7, v8, :cond_f

    const/4 v3, 0x2

    :goto_0
    invoke-virtual {v1}, Lc4/a$b;->readByte()B

    move-result v5

    if-ne v5, v6, :cond_e

    invoke-virtual {v1}, Lc4/a$b;->readByte()B

    move-result v5

    sget-boolean v7, Lc4/a;->w:Z

    if-eqz v7, :cond_1

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Found JPEG segment indicator: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    and-int/lit16 v9, v5, 0xff

    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v4, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    const/16 v8, -0x27

    if-eq v5, v8, :cond_d

    const/16 v8, -0x26

    if-ne v5, v8, :cond_2

    goto/16 :goto_6

    :cond_2
    invoke-virtual {v1}, Lc4/a$b;->readUnsignedShort()I

    move-result v8

    add-int/lit8 v9, v8, -0x2

    const/4 v10, 0x4

    add-int/2addr v3, v10

    if-eqz v7, :cond_3

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "JPEG segment: "

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    and-int/lit16 v11, v5, 0xff

    invoke-static {v11}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, " (length: "

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v11, ")"

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    const-string v7, "Invalid length"

    if-ltz v9, :cond_c

    const/16 v11, -0x1f

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eq v5, v11, :cond_8

    const/4 v11, -0x2

    if-eq v5, v11, :cond_6

    packed-switch v5, :pswitch_data_0

    packed-switch v5, :pswitch_data_1

    packed-switch v5, :pswitch_data_2

    packed-switch v5, :pswitch_data_3

    goto/16 :goto_5

    :pswitch_0
    invoke-virtual {v1, v13}, Lc4/a$b;->f(I)V

    iget-object v5, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v5, v5, v2

    if-eq v2, v10, :cond_4

    const-string v9, "ImageLength"

    goto :goto_1

    :cond_4
    const-string v9, "ThumbnailImageLength"

    :goto_1
    invoke-virtual {v1}, Lc4/a$b;->readUnsignedShort()I

    move-result v11

    int-to-long v11, v11

    iget-object v13, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v11, v12, v13}, Lc4/a$d;->f(JLjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v11

    invoke-virtual {v5, v9, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v5, v5, v2

    if-eq v2, v10, :cond_5

    const-string v9, "ImageWidth"

    goto :goto_2

    :cond_5
    const-string v9, "ThumbnailImageWidth"

    :goto_2
    invoke-virtual {v1}, Lc4/a$b;->readUnsignedShort()I

    move-result v10

    int-to-long v10, v10

    iget-object v12, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v10, v11, v12}, Lc4/a$d;->f(JLjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v10

    invoke-virtual {v5, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v9, v8, -0x7

    goto :goto_5

    :cond_6
    new-array v5, v9, [B

    invoke-virtual {v1, v5}, Lc4/a$b;->readFully([B)V

    const-string v8, "UserComment"

    invoke-virtual {v0, v8}, Lc4/a;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_7

    iget-object v9, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v9, v9, v13

    new-instance v10, Ljava/lang/String;

    sget-object v11, Lc4/a;->q0:Ljava/nio/charset/Charset;

    invoke-direct {v10, v5, v11}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-static {v10}, Lc4/a$d;->e(Ljava/lang/String;)Lc4/a$d;

    move-result-object v5

    invoke-virtual {v9, v8, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    :goto_3
    move v9, v12

    goto :goto_5

    :cond_8
    new-array v5, v9, [B

    invoke-virtual {v1, v5}, Lc4/a$b;->readFully([B)V

    add-int v8, v3, v9

    sget-object v10, Lc4/a;->r0:[B

    invoke-static {v5, v10}, Lc4/b;->f([B[B)Z

    move-result v11

    if-eqz v11, :cond_9

    array-length v11, v10

    invoke-static {v5, v11, v9}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v5

    add-int v3, p2, v3

    array-length v9, v10

    add-int/2addr v3, v9

    iput v3, v0, Lc4/a;->p:I

    invoke-virtual {v0, v5, v2}, Lc4/a;->X([BI)V

    new-instance v3, Lc4/a$b;

    invoke-direct {v3, v5}, Lc4/a$b;-><init>([B)V

    invoke-virtual {v0, v3}, Lc4/a;->k0(Lc4/a$b;)V

    goto :goto_4

    :cond_9
    sget-object v10, Lc4/a;->s0:[B

    invoke-static {v5, v10}, Lc4/b;->f([B[B)Z

    move-result v11

    if-eqz v11, :cond_a

    array-length v11, v10

    add-int/2addr v3, v11

    array-length v10, v10

    invoke-static {v5, v10, v9}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v5

    new-instance v14, Lc4/a$d;

    array-length v9, v5

    int-to-long v10, v3

    const/4 v15, 0x1

    move-object/from16 v19, v5

    move/from16 v16, v9

    move-wide/from16 v17, v10

    invoke-direct/range {v14 .. v19}, Lc4/a$d;-><init>(IIJ[B)V

    iput-object v14, v0, Lc4/a;->u:Lc4/a$d;

    iput-boolean v13, v0, Lc4/a;->v:Z

    :cond_a
    :goto_4
    move v3, v8

    goto :goto_3

    :goto_5
    if-ltz v9, :cond_b

    invoke-virtual {v1, v9}, Lc4/a$b;->f(I)V

    add-int/2addr v3, v9

    goto/16 :goto_0

    :cond_b
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_c
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_d
    :goto_6
    iget-object v2, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v2}, Lc4/a$b;->e(Ljava/nio/ByteOrder;)V

    return-void

    :cond_e
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid marker:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    and-int/lit16 v3, v5, 0xff

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_f
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    and-int/lit16 v3, v3, 0xff

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_10
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    and-int/lit16 v3, v3, 0xff

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_data_0
    .packed-switch -0x40
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch -0x3b
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch -0x37
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_3
    .packed-switch -0x33
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final p0()V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x5

    invoke-virtual {p0, v0, v1}, Lc4/a;->m0(II)V

    const/4 v2, 0x4

    invoke-virtual {p0, v0, v2}, Lc4/a;->m0(II)V

    invoke-virtual {p0, v1, v2}, Lc4/a;->m0(II)V

    iget-object v3, p0, Lc4/a;->f:[Ljava/util/HashMap;

    const/4 v4, 0x1

    aget-object v3, v3, v4

    const-string v5, "PixelXDimension"

    invoke-virtual {v3, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc4/a$d;

    iget-object v5, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v4, v5, v4

    const-string v5, "PixelYDimension"

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc4/a$d;

    const-string v5, "ImageLength"

    const-string v6, "ImageWidth"

    if-eqz v3, :cond_0

    if-eqz v4, :cond_0

    iget-object v7, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v7, v7, v0

    invoke-virtual {v7, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v3, v3, v0

    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v3, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v3, v3, v2

    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v3, v3, v1

    invoke-virtual {p0, v3}, Lc4/a;->R(Ljava/util/HashMap;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v4, v3, v1

    aput-object v4, v3, v2

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    aput-object v4, v3, v1

    :cond_1
    iget-object v3, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v3, v3, v2

    invoke-virtual {p0, v3}, Lc4/a;->R(Ljava/util/HashMap;)Z

    move-result v3

    if-nez v3, :cond_2

    const-string v3, "ExifInterface"

    const-string v4, "No image meets the size requirements of a thumbnail image."

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    const-string v3, "ThumbnailOrientation"

    const-string v4, "Orientation"

    invoke-virtual {p0, v0, v3, v4}, Lc4/a;->a0(ILjava/lang/String;Ljava/lang/String;)V

    const-string v7, "ThumbnailImageLength"

    invoke-virtual {p0, v0, v7, v5}, Lc4/a;->a0(ILjava/lang/String;Ljava/lang/String;)V

    const-string v8, "ThumbnailImageWidth"

    invoke-virtual {p0, v0, v8, v6}, Lc4/a;->a0(ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1, v3, v4}, Lc4/a;->a0(ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1, v7, v5}, Lc4/a;->a0(ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1, v8, v6}, Lc4/a;->a0(ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v2, v4, v3}, Lc4/a;->a0(ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v2, v5, v7}, Lc4/a;->a0(ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v2, v6, v8}, Lc4/a;->a0(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public q()[D
    .locals 10

    const-string v0, "GPSLatitude"

    invoke-virtual {p0, v0}, Lc4/a;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "GPSLatitudeRef"

    invoke-virtual {p0, v1}, Lc4/a;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "GPSLongitude"

    invoke-virtual {p0, v2}, Lc4/a;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "GPSLongitudeRef"

    invoke-virtual {p0, v3}, Lc4/a;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    if-eqz v3, :cond_0

    :try_start_0
    invoke-static {v0, v1}, Lc4/a;->g(Ljava/lang/String;Ljava/lang/String;)D

    move-result-wide v4

    invoke-static {v2, v3}, Lc4/a;->g(Ljava/lang/String;Ljava/lang/String;)D

    move-result-wide v6

    const/4 v8, 0x2

    new-array v8, v8, [D

    const/4 v9, 0x0

    aput-wide v4, v8, v9

    const/4 v4, 0x1

    aput-wide v6, v8, v4
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v8

    :catch_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Latitude/longitude values are not parsable. "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "latValue=%s, latRef=%s, lngValue=%s, lngRef=%s"

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExifInterface"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final q0(Lc4/a$c;)I
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, Lc4/a;->k0:[[Lc4/a$e;

    array-length v3, v2

    new-array v3, v3, [I

    array-length v2, v2

    new-array v2, v2, [I

    sget-object v4, Lc4/a;->l0:[Lc4/a$e;

    array-length v5, v4

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    if-ge v7, v5, :cond_0

    aget-object v8, v4, v7

    iget-object v8, v8, Lc4/a$e;->b:Ljava/lang/String;

    invoke-virtual {v0, v8}, Lc4/a;->Z(Ljava/lang/String;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_0
    iget-boolean v4, v0, Lc4/a;->i:Z

    const-string v5, "JPEGInterchangeFormatLength"

    const-string v7, "StripByteCounts"

    const-string v8, "JPEGInterchangeFormat"

    const-string v9, "StripOffsets"

    if-eqz v4, :cond_2

    iget-boolean v4, v0, Lc4/a;->j:Z

    if-eqz v4, :cond_1

    invoke-virtual {v0, v9}, Lc4/a;->Z(Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Lc4/a;->Z(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v8}, Lc4/a;->Z(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Lc4/a;->Z(Ljava/lang/String;)V

    :cond_2
    :goto_1
    move v4, v6

    :goto_2
    sget-object v10, Lc4/a;->k0:[[Lc4/a$e;

    array-length v10, v10

    if-ge v4, v10, :cond_5

    iget-object v10, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v10, v10, v4

    invoke-virtual {v10}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_3
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map$Entry;

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->remove()V

    goto :goto_3

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_5
    iget-object v4, v0, Lc4/a;->f:[Ljava/util/HashMap;

    const/4 v10, 0x1

    aget-object v4, v4, v10

    invoke-virtual {v4}, Ljava/util/HashMap;->isEmpty()Z

    move-result v4

    const-wide/16 v11, 0x0

    if-nez v4, :cond_6

    iget-object v4, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v4, v4, v6

    sget-object v13, Lc4/a;->l0:[Lc4/a$e;

    aget-object v13, v13, v10

    iget-object v13, v13, Lc4/a$e;->b:Ljava/lang/String;

    iget-object v14, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v11, v12, v14}, Lc4/a$d;->f(JLjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v14

    invoke-virtual {v4, v13, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    iget-object v4, v0, Lc4/a;->f:[Ljava/util/HashMap;

    const/4 v13, 0x2

    aget-object v4, v4, v13

    invoke-virtual {v4}, Ljava/util/HashMap;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_7

    iget-object v4, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v4, v4, v6

    sget-object v14, Lc4/a;->l0:[Lc4/a$e;

    aget-object v14, v14, v13

    iget-object v14, v14, Lc4/a$e;->b:Ljava/lang/String;

    iget-object v15, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v11, v12, v15}, Lc4/a$d;->f(JLjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v15

    invoke-virtual {v4, v14, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    iget-object v4, v0, Lc4/a;->f:[Ljava/util/HashMap;

    const/4 v14, 0x3

    aget-object v4, v4, v14

    invoke-virtual {v4}, Ljava/util/HashMap;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_8

    iget-object v4, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v4, v4, v10

    sget-object v15, Lc4/a;->l0:[Lc4/a$e;

    aget-object v15, v15, v14

    iget-object v15, v15, Lc4/a$e;->b:Ljava/lang/String;

    move/from16 v16, v13

    iget-object v13, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v11, v12, v13}, Lc4/a$d;->f(JLjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v13

    invoke-virtual {v4, v15, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_8
    move/from16 v16, v13

    :goto_4
    iget-boolean v4, v0, Lc4/a;->i:Z

    const/4 v13, 0x4

    if-eqz v4, :cond_9

    iget-boolean v4, v0, Lc4/a;->j:Z

    if-eqz v4, :cond_a

    iget-object v4, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v4, v4, v13

    iget-object v5, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v6, v5}, Lc4/a$d;->j(ILjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v5

    invoke-virtual {v4, v9, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v4, v4, v13

    iget v5, v0, Lc4/a;->m:I

    iget-object v15, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v5, v15}, Lc4/a$d;->j(ILjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v5

    invoke-virtual {v4, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    move/from16 v17, v14

    goto :goto_5

    :cond_a
    iget-object v4, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v4, v4, v13

    iget-object v7, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v11, v12, v7}, Lc4/a$d;->f(JLjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v7

    invoke-virtual {v4, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v4, v4, v13

    iget v7, v0, Lc4/a;->m:I

    move/from16 v17, v14

    int-to-long v14, v7

    iget-object v7, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v14, v15, v7}, Lc4/a$d;->f(JLjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v7

    invoke-virtual {v4, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_5
    move v4, v6

    :goto_6
    sget-object v5, Lc4/a;->k0:[[Lc4/a$e;

    array-length v5, v5

    if-ge v4, v5, :cond_d

    iget-object v5, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v5, v5, v4

    invoke-virtual {v5}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v7, v6

    :cond_b
    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_c

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/Map$Entry;

    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lc4/a$d;

    invoke-virtual {v14}, Lc4/a$d;->p()I

    move-result v14

    if-le v14, v13, :cond_b

    add-int/2addr v7, v14

    goto :goto_7

    :cond_c
    aget v5, v2, v4

    add-int/2addr v5, v7

    aput v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_d
    const/16 v4, 0x8

    move v5, v6

    :goto_8
    sget-object v7, Lc4/a;->k0:[[Lc4/a$e;

    array-length v7, v7

    if-ge v5, v7, :cond_f

    iget-object v7, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v7, v7, v5

    invoke-virtual {v7}, Ljava/util/HashMap;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_e

    aput v4, v3, v5

    iget-object v7, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v7, v7, v5

    invoke-virtual {v7}, Ljava/util/HashMap;->size()I

    move-result v7

    mul-int/lit8 v7, v7, 0xc

    add-int/lit8 v7, v7, 0x6

    aget v14, v2, v5

    add-int/2addr v7, v14

    add-int/2addr v4, v7

    :cond_e
    add-int/lit8 v5, v5, 0x1

    goto :goto_8

    :cond_f
    iget-boolean v5, v0, Lc4/a;->i:Z

    if-eqz v5, :cond_11

    iget-boolean v5, v0, Lc4/a;->j:Z

    if-eqz v5, :cond_10

    iget-object v5, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v5, v5, v13

    iget-object v7, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v4, v7}, Lc4/a$d;->j(ILjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v7

    invoke-virtual {v5, v9, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_9

    :cond_10
    iget-object v5, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v5, v5, v13

    int-to-long v14, v4

    iget-object v7, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v14, v15, v7}, Lc4/a$d;->f(JLjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v7

    invoke-virtual {v5, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_9
    iput v4, v0, Lc4/a;->l:I

    iget v5, v0, Lc4/a;->m:I

    add-int/2addr v4, v5

    :cond_11
    iget v5, v0, Lc4/a;->d:I

    if-ne v5, v13, :cond_12

    add-int/lit8 v4, v4, 0x8

    :cond_12
    sget-boolean v5, Lc4/a;->w:Z

    if-eqz v5, :cond_13

    move v5, v6

    :goto_a
    sget-object v7, Lc4/a;->k0:[[Lc4/a$e;

    array-length v7, v7

    if-ge v5, v7, :cond_13

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aget v8, v3, v5

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iget-object v9, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v9, v9, v5

    invoke-virtual {v9}, Ljava/util/HashMap;->size()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aget v14, v2, v5

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    filled-new-array {v7, v8, v9, v14, v15}, [Ljava/lang/Object;

    move-result-object v7

    const-string v8, "index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d"

    invoke-static {v8, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "ExifInterface"

    invoke-static {v8, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    add-int/lit8 v5, v5, 0x1

    goto :goto_a

    :cond_13
    iget-object v2, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v2, v2, v10

    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_14

    iget-object v2, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v2, v2, v6

    sget-object v5, Lc4/a;->l0:[Lc4/a$e;

    aget-object v5, v5, v10

    iget-object v5, v5, Lc4/a$e;->b:Ljava/lang/String;

    aget v7, v3, v10

    int-to-long v7, v7

    iget-object v9, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v7, v8, v9}, Lc4/a$d;->f(JLjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v7

    invoke-virtual {v2, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_14
    iget-object v2, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v2, v2, v16

    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_15

    iget-object v2, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v2, v2, v6

    sget-object v5, Lc4/a;->l0:[Lc4/a$e;

    aget-object v5, v5, v16

    iget-object v5, v5, Lc4/a$e;->b:Ljava/lang/String;

    aget v7, v3, v16

    int-to-long v7, v7

    iget-object v9, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v7, v8, v9}, Lc4/a$d;->f(JLjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v7

    invoke-virtual {v2, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_15
    iget-object v2, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v2, v2, v17

    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_16

    iget-object v2, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v2, v2, v10

    sget-object v5, Lc4/a;->l0:[Lc4/a$e;

    aget-object v5, v5, v17

    iget-object v5, v5, Lc4/a$e;->b:Ljava/lang/String;

    aget v7, v3, v17

    int-to-long v7, v7

    iget-object v9, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v7, v8, v9}, Lc4/a$d;->f(JLjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v7

    invoke-virtual {v2, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_16
    iget v2, v0, Lc4/a;->d:I

    const/16 v5, 0xe

    if-eq v2, v13, :cond_19

    const/16 v7, 0xd

    if-eq v2, v7, :cond_18

    if-eq v2, v5, :cond_17

    goto :goto_b

    :cond_17
    sget-object v2, Lc4/a;->O:[B

    invoke-virtual {v1, v2}, Lc4/a$c;->write([B)V

    invoke-virtual {v1, v4}, Lc4/a$c;->c(I)V

    goto :goto_b

    :cond_18
    invoke-virtual {v1, v4}, Lc4/a$c;->c(I)V

    const v2, 0x65584966

    invoke-virtual {v1, v2}, Lc4/a$c;->c(I)V

    goto :goto_b

    :cond_19
    const v2, 0xffff

    if-gt v4, v2, :cond_25

    invoke-virtual {v1, v4}, Lc4/a$c;->f(I)V

    sget-object v2, Lc4/a;->r0:[B

    invoke-virtual {v1, v2}, Lc4/a$c;->write([B)V

    :goto_b
    iget-object v2, v1, Lc4/a$c;->a:Ljava/io/DataOutputStream;

    invoke-virtual {v2}, Ljava/io/DataOutputStream;->size()I

    move-result v2

    iget-object v7, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    sget-object v8, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    if-ne v7, v8, :cond_1a

    const/16 v7, 0x4d4d

    goto :goto_c

    :cond_1a
    const/16 v7, 0x4949

    :goto_c
    invoke-virtual {v1, v7}, Lc4/a$c;->d(S)V

    iget-object v7, v0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v7}, Lc4/a$c;->a(Ljava/nio/ByteOrder;)V

    const/16 v7, 0x2a

    invoke-virtual {v1, v7}, Lc4/a$c;->f(I)V

    const-wide/16 v7, 0x8

    invoke-virtual {v1, v7, v8}, Lc4/a$c;->e(J)V

    move v7, v6

    :goto_d
    sget-object v8, Lc4/a;->k0:[[Lc4/a$e;

    array-length v8, v8

    if-ge v7, v8, :cond_22

    iget-object v8, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v8, v8, v7

    invoke-virtual {v8}, Ljava/util/HashMap;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_20

    iget-object v8, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v8, v8, v7

    invoke-virtual {v8}, Ljava/util/HashMap;->size()I

    move-result v8

    invoke-virtual {v1, v8}, Lc4/a$c;->f(I)V

    aget v8, v3, v7

    add-int/lit8 v8, v8, 0x2

    iget-object v9, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v9, v9, v7

    invoke-virtual {v9}, Ljava/util/HashMap;->size()I

    move-result v9

    mul-int/lit8 v9, v9, 0xc

    add-int/2addr v8, v9

    add-int/2addr v8, v13

    iget-object v9, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v9, v9, v7

    invoke-virtual {v9}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_e
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_1d

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/Map$Entry;

    sget-object v15, Lc4/a;->n0:[Ljava/util/HashMap;

    aget-object v15, v15, v7

    invoke-interface {v14}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v15, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lc4/a$e;

    iget v10, v10, Lc4/a$e;->a:I

    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lc4/a$d;

    invoke-virtual {v14}, Lc4/a$d;->p()I

    move-result v15

    invoke-virtual {v1, v10}, Lc4/a$c;->f(I)V

    iget v10, v14, Lc4/a$d;->a:I

    invoke-virtual {v1, v10}, Lc4/a$c;->f(I)V

    iget v10, v14, Lc4/a$d;->b:I

    invoke-virtual {v1, v10}, Lc4/a$c;->c(I)V

    if-le v15, v13, :cond_1b

    int-to-long v11, v8

    invoke-virtual {v1, v11, v12}, Lc4/a$c;->e(J)V

    add-int/2addr v8, v15

    goto :goto_10

    :cond_1b
    iget-object v10, v14, Lc4/a$d;->d:[B

    invoke-virtual {v1, v10}, Lc4/a$c;->write([B)V

    if-ge v15, v13, :cond_1c

    :goto_f
    if-ge v15, v13, :cond_1c

    invoke-virtual {v1, v6}, Lc4/a$c;->b(I)V

    add-int/lit8 v15, v15, 0x1

    goto :goto_f

    :cond_1c
    :goto_10
    const/4 v10, 0x1

    const-wide/16 v11, 0x0

    goto :goto_e

    :cond_1d
    if-nez v7, :cond_1e

    iget-object v8, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v8, v8, v13

    invoke-virtual {v8}, Ljava/util/HashMap;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_1e

    aget v8, v3, v13

    int-to-long v8, v8

    invoke-virtual {v1, v8, v9}, Lc4/a$c;->e(J)V

    const-wide/16 v8, 0x0

    goto :goto_11

    :cond_1e
    const-wide/16 v8, 0x0

    invoke-virtual {v1, v8, v9}, Lc4/a$c;->e(J)V

    :goto_11
    iget-object v10, v0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v10, v10, v7

    invoke-virtual {v10}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_1f
    :goto_12
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_21

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map$Entry;

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lc4/a$d;

    iget-object v11, v11, Lc4/a$d;->d:[B

    array-length v12, v11

    if-le v12, v13, :cond_1f

    array-length v12, v11

    invoke-virtual {v1, v11, v6, v12}, Lc4/a$c;->write([BII)V

    goto :goto_12

    :cond_20
    move-wide v8, v11

    :cond_21
    add-int/lit8 v7, v7, 0x1

    move-wide v11, v8

    const/4 v10, 0x1

    goto/16 :goto_d

    :cond_22
    iget-boolean v3, v0, Lc4/a;->i:Z

    if-eqz v3, :cond_23

    invoke-virtual {v0}, Lc4/a;->A()[B

    move-result-object v3

    invoke-virtual {v1, v3}, Lc4/a$c;->write([B)V

    :cond_23
    iget v3, v0, Lc4/a;->d:I

    if-ne v3, v5, :cond_24

    rem-int/lit8 v4, v4, 0x2

    const/4 v3, 0x1

    if-ne v4, v3, :cond_24

    invoke-virtual {v1, v6}, Lc4/a$c;->b(I)V

    :cond_24
    sget-object v3, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v3}, Lc4/a$c;->a(Ljava/nio/ByteOrder;)V

    return v2

    :cond_25
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Size of exif data ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final r(Ljava/io/BufferedInputStream;)I
    .locals 1

    const/16 v0, 0x1388

    invoke-virtual {p1, v0}, Ljava/io/BufferedInputStream;->mark(I)V

    new-array v0, v0, [B

    invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I

    invoke-virtual {p1}, Ljava/io/BufferedInputStream;->reset()V

    invoke-static {v0}, Lc4/a;->J([B)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    return p1

    :cond_0
    invoke-virtual {p0, v0}, Lc4/a;->M([B)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 p1, 0x9

    return p1

    :cond_1
    invoke-virtual {p0, v0}, Lc4/a;->I([B)I

    move-result p1

    if-eqz p1, :cond_2

    return p1

    :cond_2
    invoke-virtual {p0, v0}, Lc4/a;->K([B)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x7

    return p1

    :cond_3
    invoke-virtual {p0, v0}, Lc4/a;->N([B)Z

    move-result p1

    if-eqz p1, :cond_4

    const/16 p1, 0xa

    return p1

    :cond_4
    invoke-virtual {p0, v0}, Lc4/a;->L([B)Z

    move-result p1

    if-eqz p1, :cond_5

    const/16 p1, 0xd

    return p1

    :cond_5
    invoke-virtual {p0, v0}, Lc4/a;->S([B)Z

    move-result p1

    if-eqz p1, :cond_6

    const/16 p1, 0xe

    return p1

    :cond_6
    const/4 p1, 0x0

    return p1
.end method

.method public final r0(Lc4/a$c;)V
    .locals 4

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v1, Lc4/a$c;

    sget-object v2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-direct {v1, v0, v2}, Lc4/a$c;-><init>(Ljava/io/OutputStream;Ljava/nio/ByteOrder;)V

    invoke-virtual {p0, v1}, Lc4/a;->q0(Lc4/a$c;)I

    move-result v1

    iget-object v2, p1, Lc4/a$c;->a:Ljava/io/DataOutputStream;

    invoke-virtual {v2}, Ljava/io/DataOutputStream;->size()I

    move-result v2

    add-int/2addr v2, v1

    iput v2, p0, Lc4/a;->p:I

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Lc4/a$c;->write([B)V

    new-instance v1, Ljava/util/zip/CRC32;

    invoke-direct {v1}, Ljava/util/zip/CRC32;-><init>()V

    array-length v2, v0

    const/4 v3, 0x4

    sub-int/2addr v2, v3

    invoke-virtual {v1, v0, v3, v2}, Ljava/util/zip/CRC32;->update([BII)V

    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-virtual {p1, v0}, Lc4/a$c;->c(I)V

    return-void
.end method

.method public final s(Lc4/a$g;)V
    .locals 5

    invoke-virtual {p0, p1}, Lc4/a;->v(Lc4/a$g;)V

    iget-object p1, p0, Lc4/a;->f:[Ljava/util/HashMap;

    const/4 v0, 0x1

    aget-object p1, p1, v0

    const-string v1, "MakerNote"

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc4/a$d;

    if-eqz p1, :cond_6

    new-instance v1, Lc4/a$g;

    iget-object p1, p1, Lc4/a$d;->d:[B

    invoke-direct {v1, p1}, Lc4/a$g;-><init>([B)V

    iget-object p1, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v1, p1}, Lc4/a$b;->e(Ljava/nio/ByteOrder;)V

    sget-object p1, Lc4/a;->I:[B

    array-length v2, p1

    new-array v2, v2, [B

    invoke-virtual {v1, v2}, Lc4/a$b;->readFully([B)V

    const-wide/16 v3, 0x0

    invoke-virtual {v1, v3, v4}, Lc4/a$g;->g(J)V

    sget-object v3, Lc4/a;->J:[B

    array-length v4, v3

    new-array v4, v4, [B

    invoke-virtual {v1, v4}, Lc4/a$b;->readFully([B)V

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_0

    const-wide/16 v2, 0x8

    invoke-virtual {v1, v2, v3}, Lc4/a$g;->g(J)V

    goto :goto_0

    :cond_0
    invoke-static {v4, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_1

    const-wide/16 v2, 0xc

    invoke-virtual {v1, v2, v3}, Lc4/a$g;->g(J)V

    :cond_1
    :goto_0
    const/4 p1, 0x6

    invoke-virtual {p0, v1, p1}, Lc4/a;->Y(Lc4/a$g;I)V

    iget-object p1, p0, Lc4/a;->f:[Ljava/util/HashMap;

    const/4 v1, 0x7

    aget-object p1, p1, v1

    const-string v2, "PreviewImageStart"

    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc4/a$d;

    iget-object v2, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v1, v2, v1

    const-string v2, "PreviewImageLength"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc4/a$d;

    if-eqz p1, :cond_2

    if-eqz v1, :cond_2

    iget-object v2, p0, Lc4/a;->f:[Ljava/util/HashMap;

    const/4 v3, 0x5

    aget-object v2, v2, v3

    const-string v4, "JPEGInterchangeFormat"

    invoke-virtual {v2, v4, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object p1, p1, v3

    const-string v2, "JPEGInterchangeFormatLength"

    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object p1, p0, Lc4/a;->f:[Ljava/util/HashMap;

    const/16 v1, 0x8

    aget-object p1, p1, v1

    const-string v1, "AspectFrame"

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc4/a$d;

    if-eqz p1, :cond_6

    iget-object v1, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v1}, Lc4/a$d;->o(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    if-eqz p1, :cond_5

    array-length v1, p1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, 0x2

    aget v1, p1, v1

    const/4 v2, 0x0

    aget v3, p1, v2

    if-le v1, v3, :cond_6

    const/4 v4, 0x3

    aget v4, p1, v4

    aget p1, p1, v0

    if-le v4, p1, :cond_6

    sub-int/2addr v1, v3

    add-int/2addr v1, v0

    sub-int/2addr v4, p1

    add-int/2addr v4, v0

    if-ge v1, v4, :cond_4

    add-int/2addr v1, v4

    sub-int v4, v1, v4

    sub-int/2addr v1, v4

    :cond_4
    iget-object p1, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v1, p1}, Lc4/a$d;->j(ILjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object p1

    iget-object v0, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v4, v0}, Lc4/a$d;->j(ILjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v0

    iget-object v1, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v1, v1, v2

    const-string v3, "ImageWidth"

    invoke-virtual {v1, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object p1, p1, v2

    const-string v1, "ImageLength"

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_5
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid aspect frame values. frame="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ExifInterface"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_6
    return-void
.end method

.method public final s0(Lc4/a$c;)V
    .locals 2

    iget-object v0, p0, Lc4/a;->u:Lc4/a$d;

    iget-object v0, v0, Lc4/a$d;->d:[B

    array-length v0, v0

    add-int/lit8 v0, v0, 0x16

    invoke-virtual {p1, v0}, Lc4/a$c;->c(I)V

    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    const v1, 0x69545874

    invoke-virtual {p1, v1}, Lc4/a$c;->c(I)V

    invoke-static {v0, v1}, Lc4/a;->n0(Ljava/util/zip/CRC32;I)V

    sget-object v1, Lc4/a;->L:[B

    invoke-virtual {p1, v1}, Lc4/a$c;->write([B)V

    invoke-virtual {v0, v1}, Ljava/util/zip/CRC32;->update([B)V

    iget-object v1, p0, Lc4/a;->u:Lc4/a$d;

    iget-object v1, v1, Lc4/a$d;->d:[B

    invoke-virtual {p1, v1}, Lc4/a$c;->write([B)V

    iget-object v1, p0, Lc4/a;->u:Lc4/a$d;

    iget-object v1, v1, Lc4/a$d;->d:[B

    invoke-virtual {v0, v1}, Ljava/util/zip/CRC32;->update([B)V

    invoke-virtual {v0}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-virtual {p1, v0}, Lc4/a$c;->c(I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lc4/a;->v:Z

    return-void
.end method

.method public final t(Lc4/a$b;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    sget-boolean v2, Lc4/a;->w:Z

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getPngAttributes starting with: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ExifInterface"

    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    sget-object v2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v2}, Lc4/a$b;->e(Ljava/nio/ByteOrder;)V

    invoke-virtual {v0}, Lc4/a$b;->b()I

    move-result v2

    sget-object v3, Lc4/a;->K:[B

    array-length v3, v3

    invoke-virtual {v0, v3}, Lc4/a$b;->f(I)V

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    if-eqz v4, :cond_1

    if-nez v5, :cond_4

    :cond_1
    :try_start_0
    invoke-virtual {v0}, Lc4/a$b;->readInt()I

    move-result v6

    invoke-virtual {v0}, Lc4/a$b;->readInt()I

    move-result v7

    invoke-virtual {v0}, Lc4/a$b;->b()I

    move-result v8

    add-int/2addr v8, v6

    add-int/lit8 v8, v8, 0x4

    invoke-virtual {v0}, Lc4/a$b;->b()I

    move-result v9

    sub-int/2addr v9, v2

    const/16 v10, 0x10

    if-ne v9, v10, :cond_3

    const v9, 0x49484452

    if-ne v7, v9, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Encountered invalid PNG file--IHDR chunk should appear as the first chunk"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    move-exception v0

    goto/16 :goto_3

    :cond_3
    :goto_1
    const v9, 0x49454e44    # 808164.25f

    if-ne v7, v9, :cond_5

    :cond_4
    iput-boolean v5, v1, Lc4/a;->v:Z

    return-void

    :cond_5
    const v9, 0x65584966

    const/4 v10, 0x1

    if-ne v7, v9, :cond_7

    if-nez v4, :cond_7

    invoke-virtual {v0}, Lc4/a$b;->b()I

    move-result v4

    sub-int/2addr v4, v2

    iput v4, v1, Lc4/a;->p:I

    new-array v4, v6, [B

    invoke-virtual {v0, v4}, Lc4/a$b;->readFully([B)V

    invoke-virtual {v0}, Lc4/a$b;->readInt()I

    move-result v6

    new-instance v9, Ljava/util/zip/CRC32;

    invoke-direct {v9}, Ljava/util/zip/CRC32;-><init>()V

    invoke-static {v9, v7}, Lc4/a;->n0(Ljava/util/zip/CRC32;I)V

    invoke-virtual {v9, v4}, Ljava/util/zip/CRC32;->update([B)V

    invoke-virtual {v9}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v11

    long-to-int v7, v11

    if-ne v7, v6, :cond_6

    invoke-virtual {v1, v4, v3}, Lc4/a;->X([BI)V

    invoke-virtual {v1}, Lc4/a;->p0()V

    new-instance v6, Lc4/a$b;

    invoke-direct {v6, v4}, Lc4/a$b;-><init>([B)V

    invoke-virtual {v1, v6}, Lc4/a;->k0(Lc4/a$b;)V

    move v4, v10

    goto :goto_2

    :cond_6
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", calculated CRC value: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    const v9, 0x69545874

    if-ne v7, v9, :cond_8

    if-nez v5, :cond_8

    sget-object v7, Lc4/a;->L:[B

    array-length v9, v7

    if-lt v6, v9, :cond_8

    array-length v9, v7

    new-array v11, v9, [B

    invoke-virtual {v0, v11}, Lc4/a$b;->readFully([B)V

    invoke-static {v11, v7}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-virtual {v0}, Lc4/a$b;->b()I

    move-result v5

    sub-int/2addr v5, v2

    sub-int v13, v6, v9

    new-array v6, v13, [B

    invoke-virtual {v0, v6}, Lc4/a$b;->readFully([B)V

    new-instance v11, Lc4/a$d;

    const/4 v12, 0x1

    int-to-long v14, v5

    move-object/from16 v16, v6

    invoke-direct/range {v11 .. v16}, Lc4/a$d;-><init>(IIJ[B)V

    iput-object v11, v1, Lc4/a;->u:Lc4/a$d;

    move v5, v10

    :cond_8
    :goto_2
    invoke-virtual {v0}, Lc4/a$b;->b()I

    move-result v6

    sub-int/2addr v8, v6

    invoke-virtual {v0, v8}, Lc4/a$b;->f(I)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :goto_3
    new-instance v2, Ljava/io/IOException;

    const-string v3, "Encountered corrupt PNG file."

    invoke-direct {v2, v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public final u(Lc4/a$b;)V
    .locals 7

    sget-boolean v0, Lc4/a;->w:Z

    const-string v1, "ExifInterface"

    if-eqz v0, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getRafAttributes starting with: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const/16 v2, 0x54

    invoke-virtual {p1, v2}, Lc4/a$b;->f(I)V

    const/4 v2, 0x4

    new-array v3, v2, [B

    new-array v4, v2, [B

    new-array v2, v2, [B

    invoke-virtual {p1, v3}, Lc4/a$b;->readFully([B)V

    invoke-virtual {p1, v4}, Lc4/a$b;->readFully([B)V

    invoke-virtual {p1, v2}, Lc4/a$b;->readFully([B)V

    invoke-static {v3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v3

    invoke-static {v4}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v4

    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    new-array v4, v4, [B

    invoke-virtual {p1}, Lc4/a$b;->b()I

    move-result v5

    sub-int v5, v3, v5

    invoke-virtual {p1, v5}, Lc4/a$b;->f(I)V

    invoke-virtual {p1, v4}, Lc4/a$b;->readFully([B)V

    new-instance v5, Lc4/a$b;

    invoke-direct {v5, v4}, Lc4/a$b;-><init>([B)V

    const/4 v4, 0x5

    invoke-virtual {p0, v5, v3, v4}, Lc4/a;->p(Lc4/a$b;II)V

    invoke-virtual {p1}, Lc4/a$b;->b()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p1, v2}, Lc4/a$b;->f(I)V

    sget-object v2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v2}, Lc4/a$b;->e(Ljava/nio/ByteOrder;)V

    invoke-virtual {p1}, Lc4/a$b;->readInt()I

    move-result v2

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "numberOfDirectoryEntry: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    const/4 v0, 0x0

    move v3, v0

    :goto_0
    if-ge v3, v2, :cond_3

    invoke-virtual {p1}, Lc4/a$b;->readUnsignedShort()I

    move-result v4

    invoke-virtual {p1}, Lc4/a$b;->readUnsignedShort()I

    move-result v5

    sget-object v6, Lc4/a;->f0:Lc4/a$e;

    iget v6, v6, Lc4/a$e;->a:I

    if-ne v4, v6, :cond_2

    invoke-virtual {p1}, Lc4/a$b;->readShort()S

    move-result v2

    invoke-virtual {p1}, Lc4/a$b;->readShort()S

    move-result p1

    iget-object v3, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {v2, v3}, Lc4/a$d;->j(ILjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v3

    iget-object v4, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-static {p1, v4}, Lc4/a$d;->j(ILjava/nio/ByteOrder;)Lc4/a$d;

    move-result-object v4

    iget-object v5, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v5, v5, v0

    const-string v6, "ImageLength"

    invoke-virtual {v5, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v0, v3, v0

    const-string v3, "ImageWidth"

    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-boolean v0, Lc4/a;->w:Z

    if-eqz v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Updated to length: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", width: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_2
    invoke-virtual {p1, v5}, Lc4/a$b;->f(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final v(Lc4/a$g;)V
    .locals 3

    invoke-virtual {p0, p1}, Lc4/a;->U(Lc4/a$b;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lc4/a;->Y(Lc4/a$g;I)V

    invoke-virtual {p0, p1, v0}, Lc4/a;->o0(Lc4/a$g;I)V

    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0}, Lc4/a;->o0(Lc4/a$g;I)V

    const/4 v0, 0x4

    invoke-virtual {p0, p1, v0}, Lc4/a;->o0(Lc4/a$g;I)V

    invoke-virtual {p0}, Lc4/a;->p0()V

    iget p1, p0, Lc4/a;->d:I

    const/16 v0, 0x8

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lc4/a;->f:[Ljava/util/HashMap;

    const/4 v0, 0x1

    aget-object p1, p1, v0

    const-string v1, "MakerNote"

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc4/a$d;

    if-eqz p1, :cond_0

    new-instance v1, Lc4/a$g;

    iget-object p1, p1, Lc4/a$d;->d:[B

    invoke-direct {v1, p1}, Lc4/a$g;-><init>([B)V

    iget-object p1, p0, Lc4/a;->h:Ljava/nio/ByteOrder;

    invoke-virtual {v1, p1}, Lc4/a$b;->e(Ljava/nio/ByteOrder;)V

    const/4 p1, 0x6

    invoke-virtual {v1, p1}, Lc4/a$b;->f(I)V

    const/16 p1, 0x9

    invoke-virtual {p0, v1, p1}, Lc4/a;->Y(Lc4/a$g;I)V

    iget-object v1, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object p1, v1, p1

    const-string v1, "ColorSpace"

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc4/a$d;

    if-eqz p1, :cond_0

    iget-object v2, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v0, v2, v0

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public w()I
    .locals 2

    const-string v0, "Orientation"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lc4/a;->m(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return v0

    :pswitch_0
    const/16 v0, 0x5a

    return v0

    :pswitch_1
    const/16 v0, 0x10e

    return v0

    :pswitch_2
    const/16 v0, 0xb4

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final x(Lc4/a$g;)V
    .locals 4

    sget-boolean v0, Lc4/a;->w:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getRw2Attributes starting with: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExifInterface"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p0, p1}, Lc4/a;->v(Lc4/a$g;)V

    iget-object p1, p0, Lc4/a;->f:[Ljava/util/HashMap;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    const-string v1, "JpgFromRaw"

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc4/a$d;

    if-eqz p1, :cond_1

    new-instance v1, Lc4/a$b;

    iget-object v2, p1, Lc4/a$d;->d:[B

    invoke-direct {v1, v2}, Lc4/a$b;-><init>([B)V

    iget-wide v2, p1, Lc4/a$d;->c:J

    long-to-int p1, v2

    const/4 v2, 0x5

    invoke-virtual {p0, v1, p1, v2}, Lc4/a;->p(Lc4/a$b;II)V

    :cond_1
    iget-object p1, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object p1, p1, v0

    const-string v0, "ISO"

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc4/a$d;

    iget-object v0, p0, Lc4/a;->f:[Ljava/util/HashMap;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    const-string v2, "PhotographicSensitivity"

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc4/a$d;

    if-eqz p1, :cond_2

    if-nez v0, :cond_2

    iget-object v0, p0, Lc4/a;->f:[Ljava/util/HashMap;

    aget-object v0, v0, v1

    invoke-virtual {v0, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public final y(Lc4/a$g;)Z
    .locals 3

    sget-object v0, Lc4/a;->r0:[B

    array-length v1, v0

    new-array v1, v1, [B

    invoke-virtual {p1, v1}, Lc4/a$b;->readFully([B)V

    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const-string p1, "ExifInterface"

    const-string v0, "Given data is not EXIF-only."

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :cond_0
    invoke-virtual {p1}, Lc4/a$b;->c()[B

    move-result-object p1

    array-length v0, v0

    iput v0, p0, Lc4/a;->p:I

    invoke-virtual {p0, p1, v2}, Lc4/a;->X([BI)V

    const/4 p1, 0x1

    return p1
.end method

.method public z()[B
    .locals 2

    iget v0, p0, Lc4/a;->o:I

    const/4 v1, 0x6

    if-eq v0, v1, :cond_1

    const/4 v1, 0x7

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return-object v0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lc4/a;->A()[B

    move-result-object v0

    return-object v0
.end method
