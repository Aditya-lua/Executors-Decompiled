.class public final Lcom/android/billingclient/api/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/billingclient/api/f$a;,
        Lcom/android/billingclient/api/f$b;
    }
.end annotation


# instance fields
.field public final a:Lcom/google/android/gms/internal/play_billing/n0;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/f$a;Lv7/y1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/android/billingclient/api/f$a;->c(Lcom/android/billingclient/api/f$a;)Lcom/google/android/gms/internal/play_billing/n0;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/f;->a:Lcom/google/android/gms/internal/play_billing/n0;

    return-void
.end method

.method public static a()Lcom/android/billingclient/api/f$a;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/android/billingclient/api/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/android/billingclient/api/f$a;-><init>(Lv7/y1;)V

    return-object v0
.end method


# virtual methods
.method public final b()Lcom/google/android/gms/internal/play_billing/n0;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/f;->a:Lcom/google/android/gms/internal/play_billing/n0;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/android/billingclient/api/f;->a:Lcom/google/android/gms/internal/play_billing/n0;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/f$b;

    invoke-virtual {v0}, Lcom/android/billingclient/api/f$b;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
