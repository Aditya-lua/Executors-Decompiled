.class public final synthetic Lv7/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/b;

.field public final synthetic b:Lv7/f;

.field public final synthetic c:Lv7/e;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/b;Lv7/f;Lv7/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/e0;->a:Lcom/android/billingclient/api/b;

    iput-object p2, p0, Lv7/e0;->b:Lv7/f;

    iput-object p3, p0, Lv7/e0;->c:Lv7/e;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lv7/e0;->a:Lcom/android/billingclient/api/b;

    iget-object v1, p0, Lv7/e0;->b:Lv7/f;

    iget-object v2, p0, Lv7/e0;->c:Lv7/e;

    invoke-static {v0, v1, v2}, Lcom/android/billingclient/api/b;->N0(Lcom/android/billingclient/api/b;Lv7/f;Lv7/e;)Ljava/lang/Object;

    const/4 v0, 0x0

    return-object v0
.end method
