.class public final synthetic Lcom/google/android/gms/internal/mlkit_common/zzc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic zza:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_common/zzc;->zza:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    sget v0, Lcom/google/android/gms/internal/mlkit_common/zzi;->zza:I

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzc;->zza:Landroid/content/Context;

    invoke-static {v0}, Ll2/b;->g(Landroid/content/Context;)[Ljava/io/File;

    move-result-object v0

    return-object v0
.end method
