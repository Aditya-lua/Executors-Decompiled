.class public final Lcom/google/android/gms/internal/measurement/l3;
.super Lcom/google/android/gms/internal/measurement/c2;
.source "SourceFile"


# instance fields
.field public final a:Lnb/v8;


# direct methods
.method public constructor <init>(Lnb/v8;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/c2;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/l3;->a:Lnb/v8;

    return-void
.end method


# virtual methods
.method public final p(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/l3;->a:Lnb/v8;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-interface/range {v0 .. v5}, Lnb/v8;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    return-void
.end method

.method public final zzf()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/l3;->a:Lnb/v8;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
