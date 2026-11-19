.class final Lcom/google/android/gms/internal/mlkit_vision_face/zzhf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/e;


# static fields
.field static final zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzhf;

.field private static final zzb:Ltf/d;

.field private static final zzc:Ltf/d;

.field private static final zzd:Ltf/d;

.field private static final zze:Ltf/d;

.field private static final zzf:Ltf/d;

.field private static final zzg:Ltf/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzhf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzhf;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzhf;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzhf;

    const-string v0, "inferenceCommonLogEvent"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;->zzb()Lcom/google/android/gms/internal/mlkit_vision_face/zzcu;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzhf;->zzb:Ltf/d;

    const-string v0, "options"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;->zzb()Lcom/google/android/gms/internal/mlkit_vision_face/zzcu;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzhf;->zzc:Ltf/d;

    const-string v0, "imageInfo"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;-><init>()V

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;->zzb()Lcom/google/android/gms/internal/mlkit_vision_face/zzcu;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzhf;->zzd:Ltf/d;

    const-string v0, "detectorOptions"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;-><init>()V

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;->zzb()Lcom/google/android/gms/internal/mlkit_vision_face/zzcu;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzhf;->zze:Ltf/d;

    const-string v0, "contourDetectedFaces"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;-><init>()V

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;->zzb()Lcom/google/android/gms/internal/mlkit_vision_face/zzcu;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzhf;->zzf:Ltf/d;

    const-string v0, "nonContourDetectedFaces"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;-><init>()V

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzcq;->zzb()Lcom/google/android/gms/internal/mlkit_vision_face/zzcu;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzhf;->zzg:Ltf/d;

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

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_face/zzll;

    check-cast p2, Ltf/f;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzhf;->zzb:Ltf/d;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzll;->zzc()Lcom/google/android/gms/internal/mlkit_vision_face/zzkl;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzhf;->zzc:Ltf/d;

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzhf;->zzd:Ltf/d;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzll;->zzb()Lcom/google/android/gms/internal/mlkit_vision_face/zzkh;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzhf;->zze:Ltf/d;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzll;->zza()Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzhf;->zzf:Ltf/d;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzll;->zzd()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzhf;->zzg:Ltf/d;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzll;->zze()Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    return-void
.end method
