.class public final Lp0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp0/g$d;
    }
.end annotation


# static fields
.field public static final c:Ljava/lang/String; = "g"

.field public static final d:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/text/SimpleDateFormat;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/text/SimpleDateFormat;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/text/SimpleDateFormat;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lc4/a;

.field public b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lp0/g$a;

    invoke-direct {v0}, Lp0/g$a;-><init>()V

    sput-object v0, Lp0/g;->d:Ljava/lang/ThreadLocal;

    new-instance v0, Lp0/g$b;

    invoke-direct {v0}, Lp0/g$b;-><init>()V

    sput-object v0, Lp0/g;->e:Ljava/lang/ThreadLocal;

    new-instance v0, Lp0/g$c;

    invoke-direct {v0}, Lp0/g$c;-><init>()V

    sput-object v0, Lp0/g;->f:Ljava/lang/ThreadLocal;

    invoke-static {}, Lp0/g;->n()Ljava/util/List;

    move-result-object v0

    sput-object v0, Lp0/g;->g:Ljava/util/List;

    const-string v9, "ThumbnailImageWidth"

    const-string v10, "ThumbnailOrientation"

    const-string v1, "ImageWidth"

    const-string v2, "ImageLength"

    const-string v3, "PixelXDimension"

    const-string v4, "PixelYDimension"

    const-string v5, "Compression"

    const-string v6, "JPEGInterchangeFormat"

    const-string v7, "JPEGInterchangeFormatLength"

    const-string v8, "ThumbnailImageLength"

    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lp0/g;->h:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lc4/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lp0/g;->b:Z

    iput-object p1, p0, Lp0/g;->a:Lc4/a;

    return-void
.end method

.method public static c(Ljava/lang/String;)Ljava/util/Date;
    .locals 1

    sget-object v0, Lp0/g;->d:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/SimpleDateFormat;

    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0

    return-object p0
.end method

.method public static d(Ljava/lang/String;)Ljava/util/Date;
    .locals 1

    sget-object v0, Lp0/g;->f:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/SimpleDateFormat;

    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0

    return-object p0
.end method

.method public static e(Ljava/lang/String;)Ljava/util/Date;
    .locals 1

    sget-object v0, Lp0/g;->e:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/SimpleDateFormat;

    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0

    return-object p0
.end method

.method public static f(J)Ljava/lang/String;
    .locals 2

    sget-object v0, Lp0/g;->f:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/SimpleDateFormat;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1, p0, p1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static h(Ljava/io/File;)Lp0/g;
    .locals 0

    invoke-virtual {p0}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lp0/g;->i(Ljava/lang/String;)Lp0/g;

    move-result-object p0

    return-object p0
.end method

.method public static i(Ljava/lang/String;)Lp0/g;
    .locals 2

    new-instance v0, Lp0/g;

    new-instance v1, Lc4/a;

    invoke-direct {v1, p0}, Lc4/a;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lp0/g;-><init>(Lc4/a;)V

    return-object v0
.end method

.method public static j(Landroidx/camera/core/d;)Lp0/g;
    .locals 1

    invoke-interface {p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object p0

    const/4 v0, 0x0

    aget-object p0, p0, v0

    invoke-interface {p0}, Landroidx/camera/core/d$a;->k()Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {p0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    new-array v0, v0, [B

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    new-instance p0, Ljava/io/ByteArrayInputStream;

    invoke-direct {p0, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-static {p0}, Lp0/g;->k(Ljava/io/InputStream;)Lp0/g;

    move-result-object p0

    return-object p0
.end method

.method public static k(Ljava/io/InputStream;)Lp0/g;
    .locals 2

    new-instance v0, Lp0/g;

    new-instance v1, Lc4/a;

    invoke-direct {v1, p0}, Lc4/a;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Lp0/g;-><init>(Lc4/a;)V

    return-object v0
.end method

.method public static n()Ljava/util/List;
    .locals 154
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v152, "NewSubfileType"

    const-string v153, "SubfileType"

    const-string v1, "ImageWidth"

    const-string v2, "ImageLength"

    const-string v3, "BitsPerSample"

    const-string v4, "Compression"

    const-string v5, "PhotometricInterpretation"

    const-string v6, "Orientation"

    const-string v7, "SamplesPerPixel"

    const-string v8, "PlanarConfiguration"

    const-string v9, "YCbCrSubSampling"

    const-string v10, "YCbCrPositioning"

    const-string v11, "XResolution"

    const-string v12, "YResolution"

    const-string v13, "ResolutionUnit"

    const-string v14, "StripOffsets"

    const-string v15, "RowsPerStrip"

    const-string v16, "StripByteCounts"

    const-string v17, "JPEGInterchangeFormat"

    const-string v18, "JPEGInterchangeFormatLength"

    const-string v19, "TransferFunction"

    const-string v20, "WhitePoint"

    const-string v21, "PrimaryChromaticities"

    const-string v22, "YCbCrCoefficients"

    const-string v23, "ReferenceBlackWhite"

    const-string v24, "DateTime"

    const-string v25, "ImageDescription"

    const-string v26, "Make"

    const-string v27, "Model"

    const-string v28, "Software"

    const-string v29, "Artist"

    const-string v30, "Copyright"

    const-string v31, "ExifVersion"

    const-string v32, "FlashpixVersion"

    const-string v33, "ColorSpace"

    const-string v34, "Gamma"

    const-string v35, "PixelXDimension"

    const-string v36, "PixelYDimension"

    const-string v37, "ComponentsConfiguration"

    const-string v38, "CompressedBitsPerPixel"

    const-string v39, "MakerNote"

    const-string v40, "UserComment"

    const-string v41, "RelatedSoundFile"

    const-string v42, "DateTimeOriginal"

    const-string v43, "DateTimeDigitized"

    const-string v44, "OffsetTime"

    const-string v45, "OffsetTimeOriginal"

    const-string v46, "OffsetTimeDigitized"

    const-string v47, "SubSecTime"

    const-string v48, "SubSecTimeOriginal"

    const-string v49, "SubSecTimeDigitized"

    const-string v50, "ExposureTime"

    const-string v51, "FNumber"

    const-string v52, "ExposureProgram"

    const-string v53, "SpectralSensitivity"

    const-string v54, "PhotographicSensitivity"

    const-string v55, "OECF"

    const-string v56, "SensitivityType"

    const-string v57, "StandardOutputSensitivity"

    const-string v58, "RecommendedExposureIndex"

    const-string v59, "ISOSpeed"

    const-string v60, "ISOSpeedLatitudeyyy"

    const-string v61, "ISOSpeedLatitudezzz"

    const-string v62, "ShutterSpeedValue"

    const-string v63, "ApertureValue"

    const-string v64, "BrightnessValue"

    const-string v65, "ExposureBiasValue"

    const-string v66, "MaxApertureValue"

    const-string v67, "SubjectDistance"

    const-string v68, "MeteringMode"

    const-string v69, "LightSource"

    const-string v70, "Flash"

    const-string v71, "SubjectArea"

    const-string v72, "FocalLength"

    const-string v73, "FlashEnergy"

    const-string v74, "SpatialFrequencyResponse"

    const-string v75, "FocalPlaneXResolution"

    const-string v76, "FocalPlaneYResolution"

    const-string v77, "FocalPlaneResolutionUnit"

    const-string v78, "SubjectLocation"

    const-string v79, "ExposureIndex"

    const-string v80, "SensingMethod"

    const-string v81, "FileSource"

    const-string v82, "SceneType"

    const-string v83, "CFAPattern"

    const-string v84, "CustomRendered"

    const-string v85, "ExposureMode"

    const-string v86, "WhiteBalance"

    const-string v87, "DigitalZoomRatio"

    const-string v88, "FocalLengthIn35mmFilm"

    const-string v89, "SceneCaptureType"

    const-string v90, "GainControl"

    const-string v91, "Contrast"

    const-string v92, "Saturation"

    const-string v93, "Sharpness"

    const-string v94, "DeviceSettingDescription"

    const-string v95, "SubjectDistanceRange"

    const-string v96, "ImageUniqueID"

    const-string v97, "CameraOwnerName"

    const-string v98, "BodySerialNumber"

    const-string v99, "LensSpecification"

    const-string v100, "LensMake"

    const-string v101, "LensModel"

    const-string v102, "LensSerialNumber"

    const-string v103, "GPSVersionID"

    const-string v104, "GPSLatitudeRef"

    const-string v105, "GPSLatitude"

    const-string v106, "GPSLongitudeRef"

    const-string v107, "GPSLongitude"

    const-string v108, "GPSAltitudeRef"

    const-string v109, "GPSAltitude"

    const-string v110, "GPSTimeStamp"

    const-string v111, "GPSSatellites"

    const-string v112, "GPSStatus"

    const-string v113, "GPSMeasureMode"

    const-string v114, "GPSDOP"

    const-string v115, "GPSSpeedRef"

    const-string v116, "GPSSpeed"

    const-string v117, "GPSTrackRef"

    const-string v118, "GPSTrack"

    const-string v119, "GPSImgDirectionRef"

    const-string v120, "GPSImgDirection"

    const-string v121, "GPSMapDatum"

    const-string v122, "GPSDestLatitudeRef"

    const-string v123, "GPSDestLatitude"

    const-string v124, "GPSDestLongitudeRef"

    const-string v125, "GPSDestLongitude"

    const-string v126, "GPSDestBearingRef"

    const-string v127, "GPSDestBearing"

    const-string v128, "GPSDestDistanceRef"

    const-string v129, "GPSDestDistance"

    const-string v130, "GPSProcessingMethod"

    const-string v131, "GPSAreaInformation"

    const-string v132, "GPSDateStamp"

    const-string v133, "GPSDifferential"

    const-string v134, "GPSHPositioningError"

    const-string v135, "InteroperabilityIndex"

    const-string v136, "ThumbnailImageLength"

    const-string v137, "ThumbnailImageWidth"

    const-string v138, "ThumbnailOrientation"

    const-string v139, "DNGVersion"

    const-string v140, "DefaultCropSize"

    const-string v141, "ThumbnailImage"

    const-string v142, "PreviewImageStart"

    const-string v143, "PreviewImageLength"

    const-string v144, "AspectFrame"

    const-string v145, "SensorBottomBorder"

    const-string v146, "SensorLeftBorder"

    const-string v147, "SensorRightBorder"

    const-string v148, "SensorTopBorder"

    const-string v149, "ISO"

    const-string v150, "JpgFromRaw"

    const-string v151, "Xmp"

    filled-new-array/range {v1 .. v153}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public A()V
    .locals 1

    iget-boolean v0, p0, Lp0/g;->b:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lp0/g;->a()V

    :cond_0
    iget-object v0, p0, Lp0/g;->a:Lc4/a;

    invoke-virtual {v0}, Lc4/a;->c0()V

    return-void
.end method

.method public final a()V
    .locals 5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lp0/g;->f(J)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lp0/g;->a:Lc4/a;

    const-string v4, "DateTime"

    invoke-virtual {v3, v4, v2}, Lc4/a;->h0(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    invoke-static {v2}, Lp0/g;->d(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lp0/g;->a:Lc4/a;

    const-string v2, "SubSecTime"

    invoke-virtual {v1, v2, v0}, Lc4/a;->h0(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public b(Landroid/location/Location;)V
    .locals 1

    iget-object v0, p0, Lp0/g;->a:Lc4/a;

    invoke-virtual {v0, p1}, Lc4/a;->i0(Landroid/location/Location;)V

    return-void
.end method

.method public g(Lp0/g;)V
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    sget-object v1, Lp0/g;->g:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    sget-object v1, Lp0/g;->h:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :cond_0
    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    check-cast v3, Ljava/lang/String;

    iget-object v4, p0, Lp0/g;->a:Lc4/a;

    invoke-virtual {v4, v3}, Lc4/a;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p1, Lp0/g;->a:Lc4/a;

    invoke-virtual {v5, v3}, Lc4/a;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v4, :cond_0

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    iget-object v5, p1, Lp0/g;->a:Lc4/a;

    invoke-virtual {v5, v3, v4}, Lc4/a;->h0(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public l()V
    .locals 3

    invoke-virtual {p0}, Lp0/g;->r()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x2

    goto :goto_0

    :pswitch_0
    const/4 v0, 0x7

    goto :goto_0

    :pswitch_1
    const/16 v0, 0x8

    goto :goto_0

    :pswitch_2
    const/4 v0, 0x5

    goto :goto_0

    :pswitch_3
    const/4 v0, 0x6

    goto :goto_0

    :pswitch_4
    const/4 v0, 0x3

    goto :goto_0

    :pswitch_5
    const/4 v0, 0x4

    goto :goto_0

    :pswitch_6
    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, Lp0/g;->a:Lc4/a;

    const-string v2, "Orientation"

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lc4/a;->h0(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public m()V
    .locals 3

    invoke-virtual {p0}, Lp0/g;->r()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x4

    goto :goto_0

    :pswitch_0
    const/4 v0, 0x5

    goto :goto_0

    :pswitch_1
    const/4 v0, 0x6

    goto :goto_0

    :pswitch_2
    const/4 v0, 0x7

    goto :goto_0

    :pswitch_3
    const/16 v0, 0x8

    goto :goto_0

    :pswitch_4
    const/4 v0, 0x1

    goto :goto_0

    :pswitch_5
    const/4 v0, 0x2

    goto :goto_0

    :pswitch_6
    const/4 v0, 0x3

    :goto_0
    iget-object v1, p0, Lp0/g;->a:Lc4/a;

    const-string v2, "Orientation"

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lc4/a;->h0(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public o()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lp0/g;->a:Lc4/a;

    const-string v1, "ImageDescription"

    invoke-virtual {v0, v1}, Lc4/a;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public p()I
    .locals 3

    iget-object v0, p0, Lp0/g;->a:Lc4/a;

    const-string v1, "ImageLength"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lc4/a;->m(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public q()Landroid/location/Location;
    .locals 15

    iget-object v0, p0, Lp0/g;->a:Lc4/a;

    const-string v1, "GPSProcessingMethod"

    invoke-virtual {v0, v1}, Lc4/a;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lp0/g;->a:Lc4/a;

    invoke-virtual {v1}, Lc4/a;->q()[D

    move-result-object v1

    iget-object v2, p0, Lp0/g;->a:Lc4/a;

    const-wide/16 v3, 0x0

    invoke-virtual {v2, v3, v4}, Lc4/a;->j(D)D

    move-result-wide v5

    iget-object v2, p0, Lp0/g;->a:Lc4/a;

    const-string v7, "GPSSpeed"

    invoke-virtual {v2, v7, v3, v4}, Lc4/a;->l(Ljava/lang/String;D)D

    move-result-wide v7

    iget-object v2, p0, Lp0/g;->a:Lc4/a;

    const-string v9, "GPSSpeedRef"

    invoke-virtual {v2, v9}, Lc4/a;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v9, "K"

    if-nez v2, :cond_0

    move-object v2, v9

    :cond_0
    iget-object v10, p0, Lp0/g;->a:Lc4/a;

    const-string v11, "GPSDateStamp"

    invoke-virtual {v10, v11}, Lc4/a;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    iget-object v11, p0, Lp0/g;->a:Lc4/a;

    const-string v12, "GPSTimeStamp"

    invoke-virtual {v11, v12}, Lc4/a;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {p0, v10, v11}, Lp0/g;->y(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v10

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    if-nez v0, :cond_2

    sget-object v0, Lp0/g;->c:Ljava/lang/String;

    :cond_2
    new-instance v12, Landroid/location/Location;

    invoke-direct {v12, v0}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x0

    aget-wide v13, v1, v0

    invoke-virtual {v12, v13, v14}, Landroid/location/Location;->setLatitude(D)V

    const/4 v0, 0x1

    aget-wide v0, v1, v0

    invoke-virtual {v12, v0, v1}, Landroid/location/Location;->setLongitude(D)V

    cmpl-double v0, v5, v3

    if-eqz v0, :cond_3

    invoke-virtual {v12, v5, v6}, Landroid/location/Location;->setAltitude(D)V

    :cond_3
    cmpl-double v0, v7, v3

    if-eqz v0, :cond_8

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x4b

    if-eq v0, v1, :cond_6

    const/16 v1, 0x4d

    if-eq v0, v1, :cond_5

    const/16 v1, 0x4e

    if-eq v0, v1, :cond_4

    goto :goto_0

    :cond_4
    const-string v0, "N"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {v7, v8}, Lp0/g$d;->b(D)Lp0/g$d$a;

    move-result-object v0

    invoke-virtual {v0}, Lp0/g$d$a;->a()D

    move-result-wide v0

    goto :goto_1

    :cond_5
    const-string v0, "M"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {v7, v8}, Lp0/g$d;->c(D)Lp0/g$d$a;

    move-result-object v0

    invoke-virtual {v0}, Lp0/g$d$a;->a()D

    move-result-wide v0

    goto :goto_1

    :cond_6
    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    :cond_7
    :goto_0
    invoke-static {v7, v8}, Lp0/g$d;->a(D)Lp0/g$d$a;

    move-result-object v0

    invoke-virtual {v0}, Lp0/g$d$a;->a()D

    move-result-wide v0

    :goto_1
    double-to-float v0, v0

    invoke-virtual {v12, v0}, Landroid/location/Location;->setSpeed(F)V

    :cond_8
    const-wide/16 v0, -0x1

    cmp-long v0, v10, v0

    if-eqz v0, :cond_9

    invoke-virtual {v12, v10, v11}, Landroid/location/Location;->setTime(J)V

    :cond_9
    return-object v12
.end method

.method public r()I
    .locals 3

    iget-object v0, p0, Lp0/g;->a:Lc4/a;

    const-string v1, "Orientation"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lc4/a;->m(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public s()I
    .locals 4

    invoke-virtual {p0}, Lp0/g;->r()I

    move-result v0

    const/16 v1, 0xb4

    const/16 v2, 0x5a

    const/16 v3, 0x10e

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return v0

    :pswitch_0
    return v3

    :pswitch_1
    return v2

    :pswitch_2
    return v3

    :pswitch_3
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public t()J
    .locals 6

    iget-object v0, p0, Lp0/g;->a:Lc4/a;

    const-string v1, "DateTimeOriginal"

    invoke-virtual {v0, v1}, Lc4/a;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lp0/g;->x(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-wide v2

    :cond_0
    iget-object v2, p0, Lp0/g;->a:Lc4/a;

    const-string v3, "SubSecTimeOriginal"

    invoke-virtual {v2, v3}, Lc4/a;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    :try_start_0
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    :goto_0
    const-wide/16 v4, 0x3e8

    cmp-long v4, v2, v4

    if-lez v4, :cond_1

    const-wide/16 v4, 0xa

    div-long/2addr v2, v4
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_1
    add-long/2addr v0, v2

    :catch_0
    :cond_2
    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p0}, Lp0/g;->u()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p0}, Lp0/g;->p()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p0}, Lp0/g;->s()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p0}, Lp0/g;->w()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {p0}, Lp0/g;->v()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {p0}, Lp0/g;->q()Landroid/location/Location;

    move-result-object v7

    invoke-virtual {p0}, Lp0/g;->t()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {p0}, Lp0/g;->o()Ljava/lang/String;

    move-result-object v9

    filled-new-array/range {v2 .. v9}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()I
    .locals 3

    iget-object v0, p0, Lp0/g;->a:Lc4/a;

    const-string v1, "ImageWidth"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lc4/a;->m(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public v()Z
    .locals 2

    invoke-virtual {p0}, Lp0/g;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public w()Z
    .locals 3

    invoke-virtual {p0}, Lp0/g;->r()I

    move-result v0

    const/4 v1, 0x4

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    const/4 v1, 0x7

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    return v2
.end method

.method public final x(Ljava/lang/String;)J
    .locals 2

    const-wide/16 v0, -0x1

    if-nez p1, :cond_0

    return-wide v0

    :cond_0
    :try_start_0
    invoke-static {p1}, Lp0/g;->d(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-wide v0
.end method

.method public final y(Ljava/lang/String;Ljava/lang/String;)J
    .locals 2

    const-wide/16 v0, -0x1

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    return-wide v0

    :cond_0
    if-nez p2, :cond_1

    :try_start_0
    invoke-static {p1}, Lp0/g;->c(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide p1
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    return-wide v0

    :cond_1
    if-nez p1, :cond_2

    :try_start_1
    invoke-static {p2}, Lp0/g;->e(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide p1
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_1

    return-wide p1

    :catch_1
    return-wide v0

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp0/g;->x(Ljava/lang/String;)J

    move-result-wide p1

    return-wide p1
.end method

.method public z(I)V
    .locals 9

    rem-int/lit8 v0, p1, 0x5a

    const-string v1, "Orientation"

    if-eqz v0, :cond_0

    sget-object v0, Lp0/g;->c:Ljava/lang/String;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v3, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported."

    invoke-static {v2, v3, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lp0/g;->a:Lc4/a;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lc4/a;->h0(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    rem-int/lit16 p1, p1, 0x168

    invoke-virtual {p0}, Lp0/g;->r()I

    move-result v0

    :goto_0
    const/4 v2, 0x5

    const/4 v3, 0x7

    const/4 v4, 0x4

    const/4 v5, 0x1

    const/4 v6, 0x2

    const/16 v7, 0x8

    const/4 v8, 0x6

    if-gez p1, :cond_1

    add-int/lit8 p1, p1, 0x5a

    packed-switch v0, :pswitch_data_0

    move v0, v7

    goto :goto_0

    :pswitch_0
    move v0, v8

    goto :goto_0

    :pswitch_1
    move v0, v6

    goto :goto_0

    :pswitch_2
    move v0, v5

    goto :goto_0

    :pswitch_3
    move v0, v4

    goto :goto_0

    :pswitch_4
    move v0, v3

    goto :goto_0

    :pswitch_5
    move v0, v2

    goto :goto_0

    :cond_1
    :goto_1
    if-lez p1, :cond_2

    add-int/lit8 p1, p1, -0x5a

    packed-switch v0, :pswitch_data_1

    move v0, v8

    goto :goto_1

    :pswitch_6
    move v0, v5

    goto :goto_1

    :pswitch_7
    move v0, v4

    goto :goto_1

    :pswitch_8
    const/4 v0, 0x3

    goto :goto_1

    :pswitch_9
    move v0, v6

    goto :goto_1

    :pswitch_a
    move v0, v2

    goto :goto_1

    :pswitch_b
    move v0, v7

    goto :goto_1

    :pswitch_c
    move v0, v3

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lp0/g;->a:Lc4/a;

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lc4/a;->h0(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method
