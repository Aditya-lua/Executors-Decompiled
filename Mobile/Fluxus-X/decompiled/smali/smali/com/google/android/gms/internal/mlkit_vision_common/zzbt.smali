.class final Lcom/google/android/gms/internal/mlkit_vision_common/zzbt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/e;


# static fields
.field static final zza:Lcom/google/android/gms/internal/mlkit_vision_common/zzbt;

.field private static final zzb:Ltf/d;

.field private static final zzc:Ltf/d;

.field private static final zzd:Ltf/d;

.field private static final zze:Ltf/d;

.field private static final zzf:Ltf/d;

.field private static final zzg:Ltf/d;

.field private static final zzh:Ltf/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzbt;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzbt;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzbt;->zza:Lcom/google/android/gms/internal/mlkit_vision_common/zzbt;

    const-string v0, "durationMs"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_common/zzae;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;->zzb()Lcom/google/android/gms/internal/mlkit_vision_common/zzai;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzbt;->zzb:Ltf/d;

    const-string v0, "handledErrors"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_common/zzae;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;->zzb()Lcom/google/android/gms/internal/mlkit_vision_common/zzai;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzbt;->zzc:Ltf/d;

    const-string v0, "partiallyHandledErrors"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;-><init>()V

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_common/zzae;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;->zzb()Lcom/google/android/gms/internal/mlkit_vision_common/zzai;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzbt;->zzd:Ltf/d;

    const-string v0, "unhandledErrors"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;-><init>()V

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_common/zzae;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;->zzb()Lcom/google/android/gms/internal/mlkit_vision_common/zzai;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzbt;->zze:Ltf/d;

    const-string v0, "modelNamespace"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;-><init>()V

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_common/zzae;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;->zzb()Lcom/google/android/gms/internal/mlkit_vision_common/zzai;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzbt;->zzf:Ltf/d;

    const-string v0, "delegateFilter"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;-><init>()V

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_common/zzae;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;->zzb()Lcom/google/android/gms/internal/mlkit_vision_common/zzai;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzbt;->zzg:Ltf/d;

    const-string v0, "httpResponseCode"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;-><init>()V

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_common/zzae;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;->zzb()Lcom/google/android/gms/internal/mlkit_vision_common/zzai;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzbt;->zzh:Ltf/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_common/zzap;

    check-cast p2, Ltf/f;

    const/4 p1, 0x0

    throw p1
.end method
