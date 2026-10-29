.class public final Lv7/d1;
.super Lcom/google/android/gms/internal/play_billing/n;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/android/gms/internal/play_billing/t9;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/play_billing/t9;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/n;-><init>()V

    iput-object p1, p0, Lv7/d1;->a:Lcom/google/android/gms/internal/play_billing/t9;

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    iget-object v0, p0, Lv7/d1;->a:Lcom/google/android/gms/internal/play_billing/t9;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/t9;->b(Ljava/lang/Object;)Z

    return-void
.end method
