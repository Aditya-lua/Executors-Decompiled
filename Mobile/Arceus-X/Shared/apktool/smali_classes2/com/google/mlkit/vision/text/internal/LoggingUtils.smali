.class public final Lcom/google/mlkit/vision/text/internal/LoggingUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zza(I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;
    .locals 0
    .param p0    # I
        .annotation build Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface$LanguageOption;
        .end annotation
    .end param

    packed-switch p0, :pswitch_data_0

    sget-object p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    return-object p0

    :pswitch_0
    sget-object p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zzi:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    return-object p0

    :pswitch_1
    sget-object p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zzh:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    return-object p0

    :pswitch_2
    sget-object p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zzg:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    return-object p0

    :pswitch_3
    sget-object p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zzf:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    return-object p0

    :pswitch_4
    sget-object p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zze:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    return-object p0

    :pswitch_5
    sget-object p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zzd:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    return-object p0

    :pswitch_6
    sget-object p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zzc:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    return-object p0

    :pswitch_7
    sget-object p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static zzb(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;ZLcom/google/android/gms/internal/mlkit_vision_text_common/zzou;)V
    .locals 1

    new-instance v0, Lcom/google/mlkit/vision/text/internal/zzl;

    invoke-direct {v0, p1, p2}, Lcom/google/mlkit/vision/text/internal/zzl;-><init>(ZLcom/google/android/gms/internal/mlkit_vision_text_common/zzou;)V

    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;->zzi:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzf(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzub;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;)V

    return-void
.end method
