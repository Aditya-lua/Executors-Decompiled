.class public final Lob/mc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/measurement/x1;

.field public final synthetic b:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/x1;)V
    .locals 0

    iput-object p2, p0, Lob/mc;->a:Lcom/google/android/gms/internal/measurement/x1;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/mc;->b:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lob/mc;->b:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->C()Lob/ff;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->f()Z

    move-result v0

    iget-object v2, p0, Lob/mc;->a:Lcom/google/android/gms/internal/measurement/x1;

    invoke-virtual {v1, v2, v0}, Lob/ff;->e0(Lcom/google/android/gms/internal/measurement/x1;Z)V

    return-void
.end method
