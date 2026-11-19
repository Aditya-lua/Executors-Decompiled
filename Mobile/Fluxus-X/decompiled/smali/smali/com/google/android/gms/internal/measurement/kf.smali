.class public final Lcom/google/android/gms/internal/measurement/kf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lje/s;


# static fields
.field public static final b:Lcom/google/android/gms/internal/measurement/kf;


# instance fields
.field public final a:Lje/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/kf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/kf;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/kf;->b:Lcom/google/android/gms/internal/measurement/kf;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/mf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/mf;-><init>()V

    invoke-static {v0}, Lje/t;->b(Ljava/lang/Object;)Lje/s;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/kf;->a:Lje/s;

    return-void
.end method

.method public static a()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/kf;->b:Lcom/google/android/gms/internal/measurement/kf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/kf;->b()Lcom/google/android/gms/internal/measurement/lf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/lf;->zza()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final b()Lcom/google/android/gms/internal/measurement/lf;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/kf;->a:Lje/s;

    invoke-interface {v0}, Lje/s;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/lf;

    return-object v0
.end method

.method public final bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/kf;->b()Lcom/google/android/gms/internal/measurement/lf;

    move-result-object v0

    return-object v0
.end method
