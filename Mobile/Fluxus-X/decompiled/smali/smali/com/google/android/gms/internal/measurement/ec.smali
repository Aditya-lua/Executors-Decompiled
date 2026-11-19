.class public final Lcom/google/android/gms/internal/measurement/ec;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/internal/measurement/dc;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/ad;->c:Lcom/google/android/gms/internal/measurement/ad;

    new-instance v0, Lcom/google/android/gms/internal/measurement/dc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/dc;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/ec;->a:Lcom/google/android/gms/internal/measurement/dc;

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/measurement/dc;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/ec;->a:Lcom/google/android/gms/internal/measurement/dc;

    return-object v0
.end method
