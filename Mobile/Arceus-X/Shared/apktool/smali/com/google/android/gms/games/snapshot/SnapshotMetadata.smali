.class public interface abstract Lcom/google/android/gms/games/snapshot/SnapshotMetadata;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/e;
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm9/e<",
        "Lcom/google/android/gms/games/snapshot/SnapshotMetadata;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# virtual methods
.method public abstract A0()J
.end method

.method public abstract B2()Ljava/lang/String;
.end method

.method public abstract C1()Ljava/lang/String;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method

.method public abstract Q2()Z
.end method

.method public abstract S0()Landroid/net/Uri;
.end method

.method public abstract V1()J
.end method

.method public abstract Z0()Lcom/google/android/gms/games/Player;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method

.method public abstract f0()J
.end method

.method public abstract getCoverImageUrl()Ljava/lang/String;
    .annotation build Lcom/google/android/gms/common/annotation/KeepName;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract getDescription()Ljava/lang/String;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method

.method public abstract h3()F
.end method

.method public abstract q3()Ljava/lang/String;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method

.method public abstract u3()Lcom/google/android/gms/games/Game;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method

.method public abstract zza()Ljava/lang/String;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method
