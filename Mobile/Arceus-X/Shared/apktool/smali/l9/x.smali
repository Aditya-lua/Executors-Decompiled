.class public final Ll9/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk9/i$a;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/common/api/internal/BasePendingResult;

.field public final synthetic b:Ll9/z;


# direct methods
.method public constructor <init>(Ll9/z;Lcom/google/android/gms/common/api/internal/BasePendingResult;)V
    .locals 0

    iput-object p1, p0, Ll9/x;->b:Ll9/z;

    iput-object p2, p0, Ll9/x;->a:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object p1, p0, Ll9/x;->b:Ll9/z;

    invoke-static {p1}, Ll9/z;->a(Ll9/z;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Ll9/x;->a:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
