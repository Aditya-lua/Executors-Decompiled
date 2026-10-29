.class public final synthetic Lv7/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/v9;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/b;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/v;->a:Lcom/android/billingclient/api/b;

    iput p2, p0, Lv7/v;->b:I

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/play_billing/t9;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lv7/v;->a:Lcom/android/billingclient/api/b;

    iget v1, p0, Lv7/v;->b:I

    invoke-static {v0, v1, p1}, Lcom/android/billingclient/api/b;->M0(Lcom/android/billingclient/api/b;ILcom/google/android/gms/internal/play_billing/t9;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
