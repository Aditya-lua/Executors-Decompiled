.class public interface abstract Lcom/google/android/gms/games/achievement/Achievement;
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
        "Lcom/google/android/gms/games/achievement/Achievement;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# virtual methods
.method public abstract C2()Landroid/net/Uri;
.end method

.method public abstract H()Landroid/net/Uri;
.end method

.method public abstract H0()Ljava/lang/String;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method

.method public abstract J1()Ljava/lang/String;
.end method

.method public abstract J2()I
.end method

.method public abstract W1()Ljava/lang/String;
.end method

.method public abstract getDescription()Ljava/lang/String;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method

.method public abstract getName()Ljava/lang/String;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method

.method public abstract getRevealedImageUrl()Ljava/lang/String;
    .annotation build Lcom/google/android/gms/common/annotation/KeepName;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract getState()I
.end method

.method public abstract getType()I
.end method

.method public abstract getUnlockedImageUrl()Ljava/lang/String;
    .annotation build Lcom/google/android/gms/common/annotation/KeepName;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract i1()J
.end method

.method public abstract n2()J
.end method

.method public abstract q1()I
.end method

.method public abstract zza()Ljava/lang/String;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method

.method public abstract zzb()Lcom/google/android/gms/games/Player;
.end method

.method public abstract zzc()F
.end method
