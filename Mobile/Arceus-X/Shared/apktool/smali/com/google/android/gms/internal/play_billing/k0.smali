.class public final Lcom/google/android/gms/internal/play_billing/k0;
.super Lcom/google/android/gms/internal/play_billing/e0;
.source "SourceFile"


# instance fields
.field public final c:Lcom/google/android/gms/internal/play_billing/n0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/play_billing/n0;I)V
    .locals 1

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, Lcom/google/android/gms/internal/play_billing/e0;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/k0;->c:Lcom/google/android/gms/internal/play_billing/n0;

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/k0;->c:Lcom/google/android/gms/internal/play_billing/n0;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
