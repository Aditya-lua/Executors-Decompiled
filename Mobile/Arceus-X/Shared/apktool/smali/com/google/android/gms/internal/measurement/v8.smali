.class public final synthetic Lcom/google/android/gms/internal/measurement/v8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/s8;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/measurement/w8;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/w8;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/v8;->a:Lcom/google/android/gms/internal/measurement/w8;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final synthetic zza()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/v8;->a:Lcom/google/android/gms/internal/measurement/w8;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/v8;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/w8;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
