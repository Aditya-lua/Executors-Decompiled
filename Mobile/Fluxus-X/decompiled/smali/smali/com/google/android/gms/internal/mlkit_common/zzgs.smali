.class final Lcom/google/android/gms/internal/mlkit_common/zzgs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/e;


# static fields
.field static final zza:Lcom/google/android/gms/internal/mlkit_common/zzgs;

.field private static final zzb:Ltf/d;

.field private static final zzc:Ltf/d;

.field private static final zzd:Ltf/d;

.field private static final zze:Ltf/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/mlkit_common/zzgs;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_common/zzgs;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_common/zzgs;->zza:Lcom/google/android/gms/internal/mlkit_common/zzgs;

    const-string v0, "modelInfo"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_common/zzay;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_common/zzay;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzay;->zza(I)Lcom/google/android/gms/internal/mlkit_common/zzay;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_common/zzay;->zzb()Lcom/google/android/gms/internal/mlkit_common/zzbc;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_common/zzgs;->zzb:Ltf/d;

    const-string v0, "initialDownloadConditions"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_common/zzay;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_common/zzay;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzay;->zza(I)Lcom/google/android/gms/internal/mlkit_common/zzay;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_common/zzay;->zzb()Lcom/google/android/gms/internal/mlkit_common/zzbc;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_common/zzgs;->zzc:Ltf/d;

    const-string v0, "updateDownloadConditions"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_common/zzay;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_common/zzay;-><init>()V

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzay;->zza(I)Lcom/google/android/gms/internal/mlkit_common/zzay;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_common/zzay;->zzb()Lcom/google/android/gms/internal/mlkit_common/zzbc;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_common/zzgs;->zzd:Ltf/d;

    const-string v0, "isModelUpdateEnabled"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_common/zzay;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_common/zzay;-><init>()V

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzay;->zza(I)Lcom/google/android/gms/internal/mlkit_common/zzay;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_common/zzay;->zzb()Lcom/google/android/gms/internal/mlkit_common/zzbc;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_common/zzgs;->zze:Ltf/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/mlkit_common/zznl;

    check-cast p2, Ltf/f;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_common/zzgs;->zzb:Ltf/d;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_common/zznl;->zza()Lcom/google/android/gms/internal/mlkit_common/zznh;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object p1, Lcom/google/android/gms/internal/mlkit_common/zzgs;->zzc:Ltf/d;

    const/4 v0, 0x0

    invoke-interface {p2, p1, v0}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object p1, Lcom/google/android/gms/internal/mlkit_common/zzgs;->zzd:Ltf/d;

    invoke-interface {p2, p1, v0}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object p1, Lcom/google/android/gms/internal/mlkit_common/zzgs;->zze:Ltf/d;

    invoke-interface {p2, p1, v0}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    return-void
.end method
