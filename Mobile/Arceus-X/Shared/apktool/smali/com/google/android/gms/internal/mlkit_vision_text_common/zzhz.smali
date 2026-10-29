.class final Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrf/e;


# static fields
.field static final zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhz;

.field private static final zzb:Lrf/d;

.field private static final zzc:Lrf/d;

.field private static final zzd:Lrf/d;

.field private static final zze:Lrf/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhz;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhz;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhz;

    const-string v0, "imageFormat"

    invoke-static {v0}, Lrf/d;->a(Ljava/lang/String;)Lrf/d$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;->zzb()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcx;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrf/d$b;->b(Ljava/lang/annotation/Annotation;)Lrf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lrf/d$b;->a()Lrf/d;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhz;->zzb:Lrf/d;

    const-string v0, "originalImageSize"

    invoke-static {v0}, Lrf/d;->a(Ljava/lang/String;)Lrf/d$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;->zzb()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcx;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrf/d$b;->b(Ljava/lang/annotation/Annotation;)Lrf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lrf/d$b;->a()Lrf/d;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhz;->zzc:Lrf/d;

    const-string v0, "compressedImageSize"

    invoke-static {v0}, Lrf/d;->a(Ljava/lang/String;)Lrf/d$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;-><init>()V

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;->zzb()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcx;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrf/d$b;->b(Ljava/lang/annotation/Annotation;)Lrf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lrf/d$b;->a()Lrf/d;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhz;->zzd:Lrf/d;

    const-string v0, "isOdmlImage"

    invoke-static {v0}, Lrf/d;->a(Ljava/lang/String;)Lrf/d$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;-><init>()V

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;->zzb()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcx;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrf/d$b;->b(Ljava/lang/annotation/Annotation;)Lrf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lrf/d$b;->a()Lrf/d;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhz;->zze:Lrf/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzod;

    check-cast p2, Lrf/f;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhz;->zzb:Lrf/d;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzod;->zza()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzob;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhz;->zzc:Lrf/d;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzod;->zzb()Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhz;->zzd:Lrf/d;

    const/4 v0, 0x0

    invoke-interface {p2, p1, v0}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzhz;->zze:Lrf/d;

    invoke-interface {p2, p1, v0}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    return-void
.end method
