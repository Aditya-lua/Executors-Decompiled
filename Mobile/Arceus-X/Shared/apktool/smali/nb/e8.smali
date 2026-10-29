.class public final Lnb/e8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/measurement/x1;

.field public final synthetic b:Lcom/google/android/gms/measurement/internal/zzbg;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/x1;Lcom/google/android/gms/measurement/internal/zzbg;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lnb/e8;->a:Lcom/google/android/gms/internal/measurement/x1;

    iput-object p3, p0, Lnb/e8;->b:Lcom/google/android/gms/measurement/internal/zzbg;

    iput-object p4, p0, Lnb/e8;->c:Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/e8;->d:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lnb/e8;->d:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->J()Lnb/tc;

    move-result-object v0

    iget-object v1, p0, Lnb/e8;->a:Lcom/google/android/gms/internal/measurement/x1;

    iget-object v2, p0, Lnb/e8;->b:Lcom/google/android/gms/measurement/internal/zzbg;

    iget-object v3, p0, Lnb/e8;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lnb/tc;->B(Lcom/google/android/gms/internal/measurement/x1;Lcom/google/android/gms/measurement/internal/zzbg;Ljava/lang/String;)V

    return-void
.end method
