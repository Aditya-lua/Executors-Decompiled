.class public final synthetic Lnb/u6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lnb/x6;


# direct methods
.method public synthetic constructor <init>(Lnb/x6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/u6;->a:Lnb/x6;

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lnb/u6;->a:Lnb/x6;

    new-instance v1, Lcom/google/android/gms/internal/measurement/bh;

    iget-object v0, v0, Lnb/x6;->k:Lcom/google/android/gms/internal/measurement/gg;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/bh;-><init>(Lcom/google/android/gms/internal/measurement/gg;)V

    return-object v1
.end method
