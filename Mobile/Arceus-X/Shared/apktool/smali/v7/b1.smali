.class public final synthetic Lv7/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/g;

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:Lcom/android/billingclient/api/c;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/g;Landroid/app/Activity;Lcom/android/billingclient/api/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/b1;->a:Lcom/android/billingclient/api/g;

    iput-object p2, p0, Lv7/b1;->b:Landroid/app/Activity;

    iput-object p3, p0, Lv7/b1;->c:Lcom/android/billingclient/api/c;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lv7/b1;->a:Lcom/android/billingclient/api/g;

    iget-object v1, p0, Lv7/b1;->b:Landroid/app/Activity;

    iget-object v2, p0, Lv7/b1;->c:Lcom/android/billingclient/api/c;

    invoke-static {v0, v1, v2}, Lcom/android/billingclient/api/g;->j1(Lcom/android/billingclient/api/g;Landroid/app/Activity;Lcom/android/billingclient/api/c;)Lcom/android/billingclient/api/d;

    move-result-object v0

    return-object v0
.end method
