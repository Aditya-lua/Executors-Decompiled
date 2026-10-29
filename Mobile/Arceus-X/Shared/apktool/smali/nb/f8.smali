.class public final synthetic Lnb/f8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/i8;

.field public final synthetic b:Lcom/google/android/gms/measurement/internal/zzr;

.field public final synthetic c:Lcom/google/android/gms/measurement/internal/zzaf;


# direct methods
.method public synthetic constructor <init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzr;Lcom/google/android/gms/measurement/internal/zzaf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/f8;->a:Lnb/i8;

    iput-object p2, p0, Lnb/f8;->b:Lcom/google/android/gms/measurement/internal/zzr;

    iput-object p3, p0, Lnb/f8;->c:Lcom/google/android/gms/measurement/internal/zzaf;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 3

    iget-object v0, p0, Lnb/f8;->a:Lnb/i8;

    iget-object v1, p0, Lnb/f8;->b:Lcom/google/android/gms/measurement/internal/zzr;

    iget-object v2, p0, Lnb/f8;->c:Lcom/google/android/gms/measurement/internal/zzaf;

    invoke-virtual {v0, v1, v2}, Lnb/i8;->x2(Lcom/google/android/gms/measurement/internal/zzr;Lcom/google/android/gms/measurement/internal/zzaf;)V

    return-void
.end method
