.class public abstract Lcom/google/android/gms/internal/measurement/db;
.super Lcom/google/android/gms/internal/measurement/gb;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/pc;


# instance fields
.field protected final zzb:Lcom/google/android/gms/internal/measurement/wa;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/gb;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/wa;->a()Lcom/google/android/gms/internal/measurement/wa;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/db;->zzb:Lcom/google/android/gms/internal/measurement/wa;

    return-void
.end method
