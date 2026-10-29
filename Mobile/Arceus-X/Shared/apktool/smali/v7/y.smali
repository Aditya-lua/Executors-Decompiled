.class public final synthetic Lv7/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/b;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/y;->a:Lcom/android/billingclient/api/b;

    iput-object p2, p0, Lv7/y;->b:Ljava/lang/String;

    iput-object p3, p0, Lv7/y;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lv7/y;->a:Lcom/android/billingclient/api/b;

    iget-object v1, p0, Lv7/y;->b:Ljava/lang/String;

    iget-object v2, p0, Lv7/y;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/android/billingclient/api/b;->w0(Lcom/android/billingclient/api/b;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
