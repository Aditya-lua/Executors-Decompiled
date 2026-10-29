.class public final Lnb/f9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/measurement/x1;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Z

.field public final synthetic e:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/x1;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    iput-object p2, p0, Lnb/f9;->a:Lcom/google/android/gms/internal/measurement/x1;

    iput-object p3, p0, Lnb/f9;->b:Ljava/lang/String;

    iput-object p4, p0, Lnb/f9;->c:Ljava/lang/String;

    iput-boolean p5, p0, Lnb/f9;->d:Z

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/f9;->e:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lnb/f9;->e:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->J()Lnb/tc;

    move-result-object v0

    iget-object v1, p0, Lnb/f9;->a:Lcom/google/android/gms/internal/measurement/x1;

    iget-object v2, p0, Lnb/f9;->b:Ljava/lang/String;

    iget-object v3, p0, Lnb/f9;->c:Ljava/lang/String;

    iget-boolean v4, p0, Lnb/f9;->d:Z

    invoke-virtual {v0, v1, v2, v3, v4}, Lnb/tc;->h0(Lcom/google/android/gms/internal/measurement/x1;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
