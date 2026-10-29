.class public final synthetic Lv7/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/g;

.field public final synthetic b:Lcom/android/billingclient/api/f;

.field public final synthetic c:Lv7/j;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/g;Lcom/android/billingclient/api/f;Lv7/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/u0;->a:Lcom/android/billingclient/api/g;

    iput-object p2, p0, Lv7/u0;->b:Lcom/android/billingclient/api/f;

    iput-object p3, p0, Lv7/u0;->c:Lv7/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lv7/u0;->a:Lcom/android/billingclient/api/g;

    iget-object v1, p0, Lv7/u0;->b:Lcom/android/billingclient/api/f;

    iget-object v2, p0, Lv7/u0;->c:Lv7/j;

    invoke-static {v0, v1, v2}, Lcom/android/billingclient/api/g;->Q0(Lcom/android/billingclient/api/g;Lcom/android/billingclient/api/f;Lv7/j;)V

    return-void
.end method
