.class public final synthetic Lcom/google/mlkit/common/sdkinternal/zzq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk9/h;


# instance fields
.field public final synthetic zza:[Lcom/google/android/gms/common/Feature;


# direct methods
.method public synthetic constructor <init>([Lcom/google/android/gms/common/Feature;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/common/sdkinternal/zzq;->zza:[Lcom/google/android/gms/common/Feature;

    return-void
.end method


# virtual methods
.method public final getOptionalFeatures()[Lcom/google/android/gms/common/Feature;
    .locals 1

    sget-object v0, Lcom/google/mlkit/common/sdkinternal/OptionalModuleUtils;->EMPTY_FEATURES:[Lcom/google/android/gms/common/Feature;

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/zzq;->zza:[Lcom/google/android/gms/common/Feature;

    return-object v0
.end method
