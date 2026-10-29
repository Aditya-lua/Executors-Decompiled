.class public final Lcom/google/android/gms/internal/measurement/p1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/internal/measurement/n1;

.field public static volatile b:Lcom/google/android/gms/internal/measurement/n1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/o1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/o1;-><init>([B)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/p1;->a:Lcom/google/android/gms/internal/measurement/n1;

    sput-object v0, Lcom/google/android/gms/internal/measurement/p1;->b:Lcom/google/android/gms/internal/measurement/n1;

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/measurement/n1;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/p1;->b:Lcom/google/android/gms/internal/measurement/n1;

    return-object v0
.end method
