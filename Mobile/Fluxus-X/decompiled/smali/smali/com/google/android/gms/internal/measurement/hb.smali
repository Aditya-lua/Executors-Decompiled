.class public abstract Lcom/google/android/gms/internal/measurement/hb;
.super Lcom/google/android/gms/internal/measurement/kb;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/tc;


# instance fields
.field protected final zzb:Lcom/google/android/gms/internal/measurement/ab;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/kb;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/ab;->a()Lcom/google/android/gms/internal/measurement/ab;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/hb;->zzb:Lcom/google/android/gms/internal/measurement/ab;

    return-void
.end method
