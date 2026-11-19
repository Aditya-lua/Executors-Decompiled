.class public final Lm9/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/k$a;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/common/api/internal/BasePendingResult;

.field public final synthetic b:Lm9/z;


# direct methods
.method public constructor <init>(Lm9/z;Lcom/google/android/gms/common/api/internal/BasePendingResult;)V
    .locals 0

    iput-object p1, p0, Lm9/x;->b:Lm9/z;

    iput-object p2, p0, Lm9/x;->a:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object p1, p0, Lm9/x;->b:Lm9/z;

    invoke-static {p1}, Lm9/z;->a(Lm9/z;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lm9/x;->a:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
