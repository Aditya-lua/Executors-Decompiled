.class public final Lcom/google/android/gms/internal/measurement/ag;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zf;


# static fields
.field public static final a:Lcom/google/android/gms/internal/measurement/l9;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/measurement/f9;

    const-string v1, "com.google.android.gms.measurement"

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/a9;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/f9;-><init>(Landroid/net/Uri;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/f9;->a()Lcom/google/android/gms/internal/measurement/f9;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/f9;->b()Lcom/google/android/gms/internal/measurement/f9;

    move-result-object v0

    const-string v1, "measurement.add_first_launch_logging_timestamp.service"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/f9;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/l9;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/ag;->a:Lcom/google/android/gms/internal/measurement/l9;

    const-string v1, "measurement.id.add_first_launch_logging_timestamp.service"

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/f9;->c(Ljava/lang/String;J)Lcom/google/android/gms/internal/measurement/l9;

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

    sget-object v0, Lcom/google/android/gms/internal/measurement/ag;->a:Lcom/google/android/gms/internal/measurement/l9;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/l9;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
