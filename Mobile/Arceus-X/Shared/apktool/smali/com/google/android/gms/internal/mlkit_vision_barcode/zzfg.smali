.class final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrf/f;


# static fields
.field private static final zza:Ljava/nio/charset/Charset;

.field private static final zzb:Lrf/d;

.field private static final zzc:Lrf/d;

.field private static final zzd:Lrf/e;


# instance fields
.field private zze:Ljava/io/OutputStream;

.field private final zzf:Ljava/util/Map;

.field private final zzg:Ljava/util/Map;

.field private final zzh:Lrf/e;

.field private final zzi:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfk;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zza:Ljava/nio/charset/Charset;

    const-string v0, "key"

    invoke-static {v0}, Lrf/d;->a(Ljava/lang/String;)Lrf/d$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfa;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfa;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfa;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfa;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfa;->zzb()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrf/d$b;->b(Ljava/lang/annotation/Annotation;)Lrf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lrf/d$b;->a()Lrf/d;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzb:Lrf/d;

    const-string v0, "value"

    invoke-static {v0}, Lrf/d;->a(Ljava/lang/String;)Lrf/d$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfa;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfa;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfa;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfa;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfa;->zzb()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrf/d$b;->b(Ljava/lang/annotation/Annotation;)Lrf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lrf/d$b;->a()Lrf/d;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzc:Lrf/d;

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzff;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzff;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzd:Lrf/e;

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;Ljava/util/Map;Ljava/util/Map;Lrf/e;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfk;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfk;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzi:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfk;

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zze:Ljava/io/OutputStream;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzf:Ljava/util/Map;

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzg:Ljava/util/Map;

    iput-object p4, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzh:Lrf/e;

    return-void
.end method

.method public static synthetic zzg(Ljava/util/Map$Entry;Lrf/f;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzb:Lrf/d;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzc:Lrf/d;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, v0, p0}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    return-void
.end method

.method private static zzh(Lrf/d;)I
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;

    invoke-virtual {p0, v0}, Lrf/d;->c(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;->zza()I

    move-result p0

    return p0

    :cond_0
    new-instance p0, Lrf/c;

    const-string v0, "Field has no @Protobuf config"

    invoke-direct {p0, v0}, Lrf/c;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final zzi(Lrf/e;Ljava/lang/Object;)J
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfb;-><init>()V

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zze:Ljava/io/OutputStream;

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zze:Ljava/io/OutputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {p1, p2, p0}, Lrf/b;->encode(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iput-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zze:Ljava/io/OutputStream;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfb;->zza()J

    move-result-wide p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    return-wide p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_3
    iput-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zze:Ljava/io/OutputStream;

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    :try_start_4
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
.end method

.method private static zzj(Lrf/d;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;

    invoke-virtual {p0, v0}, Lrf/d;->c(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Lrf/c;

    const-string v0, "Field has no @Protobuf config"

    invoke-direct {p0, v0}, Lrf/c;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final zzk(Lrf/e;Lrf/d;Ljava/lang/Object;Z)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;
    .locals 4

    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzi(Lrf/e;Ljava/lang/Object;)J

    move-result-wide v0

    if-eqz p4, :cond_0

    const-wide/16 v2, 0x0

    cmp-long p4, v0, v2

    if-nez p4, :cond_0

    return-object p0

    :cond_0
    invoke-static {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzh(Lrf/d;)I

    move-result p2

    shl-int/lit8 p2, p2, 0x3

    or-int/lit8 p2, p2, 0x2

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzn(I)V

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzo(J)V

    invoke-interface {p1, p3, p0}, Lrf/b;->encode(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

.method private final zzl(Lrf/g;Lrf/d;Ljava/lang/Object;Z)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzi:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfk;

    invoke-virtual {v0, p2, p4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfk;->zza(Lrf/d;Z)V

    iget-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzi:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfk;

    invoke-interface {p1, p3, p2}, Lrf/b;->encode(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

.method private static zzm(I)Ljava/nio/ByteBuffer;
    .locals 1

    invoke-static {p0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p0

    return-object p0
.end method

.method private final zzn(I)V
    .locals 4

    :goto_0
    and-int/lit8 v0, p1, -0x80

    int-to-long v0, v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    and-int/lit8 v1, p1, 0x7f

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zze:Ljava/io/OutputStream;

    or-int/lit16 v1, v1, 0x80

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zze:Ljava/io/OutputStream;

    invoke-virtual {p1, v1}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method

.method private final zzo(J)V
    .locals 5

    :goto_0
    const-wide/16 v0, -0x80

    and-long/2addr v0, p1

    long-to-int v2, p1

    const-wide/16 v3, 0x0

    cmp-long v0, v0, v3

    and-int/lit8 v1, v2, 0x7f

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zze:Ljava/io/OutputStream;

    or-int/lit16 v1, v1, 0x80

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    const/4 v0, 0x7

    ushr-long/2addr p1, v0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zze:Ljava/io/OutputStream;

    invoke-virtual {p1, v1}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/String;D)Lrf/f;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 7
    invoke-static {p1}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object p1

    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zza(Lrf/d;DZ)Lrf/f;

    return-object p0
.end method

.method public final add(Ljava/lang/String;I)Lrf/f;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 9
    invoke-static {p1}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object p1

    const/4 v0, 0x1

    .line 10
    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzd(Lrf/d;IZ)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;

    return-object p0
.end method

.method public final add(Ljava/lang/String;J)Lrf/f;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 11
    invoke-static {p1}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object p1

    const/4 v0, 0x1

    .line 12
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zze(Lrf/d;JZ)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;

    return-object p0
.end method

.method public final add(Ljava/lang/String;Ljava/lang/Object;)Lrf/f;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 13
    invoke-static {p1}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object p1

    const/4 v0, 0x1

    .line 14
    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzc(Lrf/d;Ljava/lang/Object;Z)Lrf/f;

    return-object p0
.end method

.method public final add(Ljava/lang/String;Z)Lrf/f;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 15
    invoke-static {p1}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object p1

    const/4 v0, 0x1

    .line 16
    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzd(Lrf/d;IZ)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;

    return-object p0
.end method

.method public final add(Lrf/d;D)Lrf/f;
    .locals 1
    .param p1    # Lrf/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zza(Lrf/d;DZ)Lrf/f;

    return-object p0
.end method

.method public final add(Lrf/d;F)Lrf/f;
    .locals 1
    .param p1    # Lrf/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzb(Lrf/d;FZ)Lrf/f;

    return-object p0
.end method

.method public final synthetic add(Lrf/d;I)Lrf/f;
    .locals 1
    .param p1    # Lrf/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzd(Lrf/d;IZ)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;

    return-object p0
.end method

.method public final synthetic add(Lrf/d;J)Lrf/f;
    .locals 1
    .param p1    # Lrf/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x1

    .line 4
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zze(Lrf/d;JZ)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;

    return-object p0
.end method

.method public final add(Lrf/d;Ljava/lang/Object;)Lrf/f;
    .locals 1
    .param p1    # Lrf/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzc(Lrf/d;Ljava/lang/Object;Z)Lrf/f;

    return-object p0
.end method

.method public final synthetic add(Lrf/d;Z)Lrf/f;
    .locals 1
    .param p1    # Lrf/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x1

    .line 6
    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzd(Lrf/d;IZ)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;

    return-object p0
.end method

.method public final inline(Ljava/lang/Object;)Lrf/f;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzf(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;

    return-object p0
.end method

.method public final nested(Ljava/lang/String;)Lrf/f;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    invoke-static {p1}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->nested(Lrf/d;)Lrf/f;

    move-result-object p1

    return-object p1
.end method

.method public final nested(Lrf/d;)Lrf/f;
    .locals 1
    .param p1    # Lrf/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance p1, Lrf/c;

    const-string v0, "nested() is not implemented for protobuf encoding."

    invoke-direct {p1, v0}, Lrf/c;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zza(Lrf/d;DZ)Lrf/f;
    .locals 2
    .param p1    # Lrf/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-eqz p4, :cond_0

    const-wide/16 v0, 0x0

    cmpl-double p4, p2, v0

    if-nez p4, :cond_0

    return-object p0

    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzh(Lrf/d;)I

    move-result p1

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzn(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zze:Ljava/io/OutputStream;

    const/16 p4, 0x8

    invoke-static {p4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzm(I)Ljava/nio/ByteBuffer;

    move-result-object p4

    invoke-virtual {p4, p2, p3}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    return-object p0
.end method

.method public final zzb(Lrf/d;FZ)Lrf/f;
    .locals 0
    .param p1    # Lrf/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-eqz p3, :cond_0

    const/4 p3, 0x0

    cmpl-float p3, p2, p3

    if-nez p3, :cond_0

    return-object p0

    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzh(Lrf/d;)I

    move-result p1

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x5

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzn(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zze:Ljava/io/OutputStream;

    const/4 p3, 0x4

    invoke-static {p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzm(I)Ljava/nio/ByteBuffer;

    move-result-object p3

    invoke-virtual {p3, p2}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    return-object p0
.end method

.method public final zzc(Lrf/d;Ljava/lang/Object;Z)Lrf/f;
    .locals 2
    .param p1    # Lrf/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-nez p2, :cond_0

    goto/16 :goto_2

    :cond_0
    instance-of v0, p2, Ljava/lang/CharSequence;

    if-eqz v0, :cond_2

    check-cast p2, Ljava/lang/CharSequence;

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p3

    if-eqz p3, :cond_9

    :cond_1
    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzh(Lrf/d;)I

    move-result p1

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzn(I)V

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zza:Ljava/nio/charset/Charset;

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    array-length p2, p1

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzn(I)V

    iget-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zze:Ljava/io/OutputStream;

    invoke-virtual {p2, p1}, Ljava/io/OutputStream;->write([B)V

    return-object p0

    :cond_2
    instance-of v0, p2, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_9

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p0, p1, p3, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzc(Lrf/d;Ljava/lang/Object;Z)Lrf/f;

    goto :goto_0

    :cond_3
    instance-of v0, p2, Ljava/util/Map;

    if-eqz v0, :cond_4

    check-cast p2, Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_9

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzd:Lrf/e;

    invoke-direct {p0, v0, p1, p3, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzk(Lrf/e;Lrf/d;Ljava/lang/Object;Z)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;

    goto :goto_1

    :cond_4
    instance-of v0, p2, Ljava/lang/Double;

    if-eqz v0, :cond_5

    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zza(Lrf/d;DZ)Lrf/f;

    return-object p0

    :cond_5
    instance-of v0, p2, Ljava/lang/Float;

    if-eqz v0, :cond_6

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzb(Lrf/d;FZ)Lrf/f;

    return-object p0

    :cond_6
    instance-of v0, p2, Ljava/lang/Number;

    if-eqz v0, :cond_7

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zze(Lrf/d;JZ)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;

    return-object p0

    :cond_7
    instance-of v0, p2, Ljava/lang/Boolean;

    if-eqz v0, :cond_8

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzd(Lrf/d;IZ)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;

    return-object p0

    :cond_8
    instance-of v0, p2, [B

    if-eqz v0, :cond_b

    check-cast p2, [B

    if-eqz p3, :cond_a

    array-length p3, p2

    if-eqz p3, :cond_9

    goto :goto_3

    :cond_9
    :goto_2
    return-object p0

    :cond_a
    :goto_3
    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzh(Lrf/d;)I

    move-result p1

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzn(I)V

    array-length p1, p2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzn(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zze:Ljava/io/OutputStream;

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    return-object p0

    :cond_b
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzf:Ljava/util/Map;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrf/e;

    if-eqz v0, :cond_c

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzk(Lrf/e;Lrf/d;Ljava/lang/Object;Z)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;

    return-object p0

    :cond_c
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzg:Ljava/util/Map;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrf/g;

    if-eqz v0, :cond_d

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzl(Lrf/g;Lrf/d;Ljava/lang/Object;Z)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;

    return-object p0

    :cond_d
    instance-of v0, p2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;

    const/4 v1, 0x1

    if-eqz v0, :cond_e

    check-cast p2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;

    invoke-interface {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfc;->zza()I

    move-result p2

    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzd(Lrf/d;IZ)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;

    return-object p0

    :cond_e
    instance-of v0, p2, Ljava/lang/Enum;

    if-eqz v0, :cond_f

    check-cast p2, Ljava/lang/Enum;

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzd(Lrf/d;IZ)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;

    return-object p0

    :cond_f
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzh:Lrf/e;

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzk(Lrf/e;Lrf/d;Ljava/lang/Object;Z)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;

    return-object p0
.end method

.method public final zzd(Lrf/d;IZ)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;
    .locals 1
    .param p1    # Lrf/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-eqz p3, :cond_0

    if-eqz p2, :cond_1

    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzj(Lrf/d;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;->zzb()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfd;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    if-eqz p3, :cond_4

    const/4 v0, 0x1

    if-eq p3, v0, :cond_3

    const/4 v0, 0x2

    if-eq p3, v0, :cond_2

    :cond_1
    return-object p0

    :cond_2
    invoke-interface {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;->zza()I

    move-result p1

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x5

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzn(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zze:Ljava/io/OutputStream;

    const/4 p3, 0x4

    invoke-static {p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzm(I)Ljava/nio/ByteBuffer;

    move-result-object p3

    invoke-virtual {p3, p2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    return-object p0

    :cond_3
    invoke-interface {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;->zza()I

    move-result p1

    shl-int/lit8 p1, p1, 0x3

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzn(I)V

    add-int p1, p2, p2

    shr-int/lit8 p2, p2, 0x1f

    xor-int/2addr p1, p2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzn(I)V

    return-object p0

    :cond_4
    invoke-interface {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;->zza()I

    move-result p1

    shl-int/lit8 p1, p1, 0x3

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzn(I)V

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzn(I)V

    return-object p0
.end method

.method public final zze(Lrf/d;JZ)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;
    .locals 2
    .param p1    # Lrf/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-eqz p4, :cond_0

    const-wide/16 v0, 0x0

    cmp-long p4, p2, v0

    if-eqz p4, :cond_1

    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzj(Lrf/d;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;->zzb()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfd;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p4

    if-eqz p4, :cond_4

    const/4 v0, 0x1

    if-eq p4, v0, :cond_3

    const/4 v1, 0x2

    if-eq p4, v1, :cond_2

    :cond_1
    return-object p0

    :cond_2
    invoke-interface {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;->zza()I

    move-result p1

    shl-int/lit8 p1, p1, 0x3

    or-int/2addr p1, v0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzn(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zze:Ljava/io/OutputStream;

    const/16 p4, 0x8

    invoke-static {p4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzm(I)Ljava/nio/ByteBuffer;

    move-result-object p4

    invoke-virtual {p4, p2, p3}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    return-object p0

    :cond_3
    invoke-interface {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;->zza()I

    move-result p1

    shl-int/lit8 p1, p1, 0x3

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzn(I)V

    add-long v0, p2, p2

    const/16 p1, 0x3f

    shr-long p1, p2, p1

    xor-long/2addr p1, v0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzo(J)V

    return-object p0

    :cond_4
    invoke-interface {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;->zza()I

    move-result p1

    shl-int/lit8 p1, p1, 0x3

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzn(I)V

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzo(J)V

    return-object p0
.end method

.method public final zzf(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;
    .locals 2

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfg;->zzf:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrf/e;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p0}, Lrf/b;->encode(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    new-instance v0, Lrf/c;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "No encoder for "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lrf/c;-><init>(Ljava/lang/String;)V

    throw v0
.end method
