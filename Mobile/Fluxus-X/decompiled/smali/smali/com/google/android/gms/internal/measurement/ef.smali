.class public final Lcom/google/android/gms/internal/measurement/ef;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/df;


# static fields
.field public static final a:Lcom/google/android/gms/internal/measurement/p9;

.field public static final b:Lcom/google/android/gms/internal/measurement/p9;

.field public static final c:Lcom/google/android/gms/internal/measurement/p9;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/measurement/j9;

    const-string v1, "com.google.android.gms.measurement"

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/e9;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/j9;-><init>(Landroid/net/Uri;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/j9;->a()Lcom/google/android/gms/internal/measurement/j9;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/j9;->b()Lcom/google/android/gms/internal/measurement/j9;

    move-result-object v0

    const-string v1, "measurement.service.audience.fix_skip_audience_with_failed_filters"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/j9;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/p9;

    const-string v1, "measurement.audience.refresh_event_count_filters_timestamp"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/j9;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/p9;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/ef;->a:Lcom/google/android/gms/internal/measurement/p9;

    const-string v1, "measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/j9;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/p9;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/ef;->b:Lcom/google/android/gms/internal/measurement/p9;

    const-string v1, "measurement.audience.use_bundle_timestamp_for_event_count_filters"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/j9;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/p9;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/ef;->c:Lcom/google/android/gms/internal/measurement/p9;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final zzb()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/ef;->a:Lcom/google/android/gms/internal/measurement/p9;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/p9;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final zzc()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/ef;->b:Lcom/google/android/gms/internal/measurement/p9;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/p9;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final zzd()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/ef;->c:Lcom/google/android/gms/internal/measurement/p9;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/p9;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
