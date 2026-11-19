.class public final synthetic Lob/z6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lob/c7;


# direct methods
.method public synthetic constructor <init>(Lob/c7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/z6;->a:Lob/c7;

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lob/z6;->a:Lob/c7;

    new-instance v1, Lcom/google/android/gms/internal/measurement/fh;

    iget-object v0, v0, Lob/c7;->k:Lcom/google/android/gms/internal/measurement/kg;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/fh;-><init>(Lcom/google/android/gms/internal/measurement/kg;)V

    return-object v1
.end method
