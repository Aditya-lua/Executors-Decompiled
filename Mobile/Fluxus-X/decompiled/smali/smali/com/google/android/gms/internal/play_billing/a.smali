.class public final Lcom/google/android/gms/internal/play_billing/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z


# direct methods
.method public constructor <init>(ZZZZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/google/android/gms/internal/play_billing/a;->a:Z

    return-void
.end method

.method public static a(ZZZZZZ)Lcom/google/android/gms/internal/play_billing/a;
    .locals 7

    new-instance v0, Lcom/google/android/gms/internal/play_billing/a;

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v2, 0x1

    const/4 v3, 0x1

    const/4 v4, 0x1

    move v1, p0

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/play_billing/a;-><init>(ZZZZZZ)V

    return-object v0
.end method

.method public static bridge synthetic b(Lcom/google/android/gms/internal/play_billing/a;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/internal/play_billing/a;->a:Z

    return p0
.end method
