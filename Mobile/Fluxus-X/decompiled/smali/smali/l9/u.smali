.class public final Ll9/u;
.super Lcom/google/android/gms/common/api/internal/BasePendingResult;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R::",
        "Ll9/p;",
        ">",
        "Lcom/google/android/gms/common/api/internal/BasePendingResult<",
        "TR;>;"
    }
.end annotation


# instance fields
.field public final o:Ll9/p;


# direct methods
.method public constructor <init>(Ll9/h;Ll9/p;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;-><init>(Ll9/h;)V

    iput-object p2, p0, Ll9/u;->o:Ll9/p;

    return-void
.end method


# virtual methods
.method public final e(Lcom/google/android/gms/common/api/Status;)Ll9/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/Status;",
            ")TR;"
        }
    .end annotation

    iget-object p1, p0, Ll9/u;->o:Ll9/p;

    return-object p1
.end method
