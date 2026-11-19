.class public final synthetic Lob/b7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lob/c7;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lob/c7;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/b7;->a:Lob/c7;

    iput-object p2, p0, Lob/b7;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/measurement/fc;

    new-instance v1, Lob/x6;

    iget-object v2, p0, Lob/b7;->a:Lob/c7;

    iget-object v3, p0, Lob/b7;->b:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lob/x6;-><init>(Lob/c7;Ljava/lang/String;)V

    const-string v2, "internal.remoteConfig"

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/measurement/fc;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/gd;)V

    return-object v0
.end method
