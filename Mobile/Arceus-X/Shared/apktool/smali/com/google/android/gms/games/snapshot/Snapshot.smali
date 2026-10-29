.class public interface abstract Lcom/google/android/gms/games/snapshot/Snapshot;
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
        "Lcom/google/android/gms/games/snapshot/Snapshot;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# virtual methods
.method public abstract getMetadata()Lcom/google/android/gms/games/snapshot/SnapshotMetadata;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method

.method public abstract m3()Lcom/google/android/gms/games/snapshot/SnapshotContents;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method
