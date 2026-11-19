.class public final synthetic Lcom/google/android/gms/internal/measurement/r8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/w8;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/measurement/t8;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/t8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/r8;->a:Lcom/google/android/gms/internal/measurement/t8;

    return-void
.end method


# virtual methods
.method public final synthetic zza()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/r8;->a:Lcom/google/android/gms/internal/measurement/t8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/t8;->h()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
