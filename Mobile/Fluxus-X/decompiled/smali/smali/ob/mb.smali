.class public final Lob/mb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/measurement/x1;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/x1;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lob/mb;->a:Lcom/google/android/gms/internal/measurement/x1;

    iput-object p3, p0, Lob/mb;->b:Ljava/lang/String;

    iput-object p4, p0, Lob/mb;->c:Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/mb;->d:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lob/mb;->d:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->J()Lob/yc;

    move-result-object v0

    iget-object v1, p0, Lob/mb;->a:Lcom/google/android/gms/internal/measurement/x1;

    iget-object v2, p0, Lob/mb;->b:Ljava/lang/String;

    iget-object v3, p0, Lob/mb;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lob/yc;->f0(Lcom/google/android/gms/internal/measurement/x1;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
