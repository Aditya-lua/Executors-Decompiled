.class public final synthetic Lv7/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/b;

.field public final synthetic b:Lv7/j;

.field public final synthetic c:Lcom/android/billingclient/api/f;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/b;Lv7/j;Lcom/android/billingclient/api/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/g0;->a:Lcom/android/billingclient/api/b;

    iput-object p2, p0, Lv7/g0;->b:Lv7/j;

    iput-object p3, p0, Lv7/g0;->c:Lcom/android/billingclient/api/f;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lv7/g0;->a:Lcom/android/billingclient/api/b;

    iget-object v1, p0, Lv7/g0;->b:Lv7/j;

    iget-object v2, p0, Lv7/g0;->c:Lcom/android/billingclient/api/f;

    invoke-static {v0, v1, v2}, Lcom/android/billingclient/api/b;->O0(Lcom/android/billingclient/api/b;Lv7/j;Lcom/android/billingclient/api/f;)Ljava/lang/Object;

    const/4 v0, 0x0

    return-object v0
.end method
