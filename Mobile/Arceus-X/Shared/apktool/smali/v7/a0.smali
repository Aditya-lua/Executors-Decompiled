.class public final synthetic Lv7/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/b;

.field public final synthetic b:Lcom/android/billingclient/api/d;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/b;Lcom/android/billingclient/api/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/a0;->a:Lcom/android/billingclient/api/b;

    iput-object p2, p0, Lv7/a0;->b:Lcom/android/billingclient/api/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lv7/a0;->a:Lcom/android/billingclient/api/b;

    iget-object v1, p0, Lv7/a0;->b:Lcom/android/billingclient/api/d;

    invoke-static {v0, v1}, Lcom/android/billingclient/api/b;->t(Lcom/android/billingclient/api/b;Lcom/android/billingclient/api/d;)V

    return-void
.end method
