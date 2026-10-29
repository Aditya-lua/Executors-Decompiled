.class public final synthetic Lv7/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/g;

.field public final synthetic b:Lv7/b;

.field public final synthetic c:Lv7/c;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/g;Lv7/b;Lv7/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/z0;->a:Lcom/android/billingclient/api/g;

    iput-object p2, p0, Lv7/z0;->b:Lv7/b;

    iput-object p3, p0, Lv7/z0;->c:Lv7/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lv7/z0;->a:Lcom/android/billingclient/api/g;

    iget-object v1, p0, Lv7/z0;->b:Lv7/b;

    iget-object v2, p0, Lv7/z0;->c:Lv7/c;

    invoke-static {v0, v1, v2}, Lcom/android/billingclient/api/g;->k1(Lcom/android/billingclient/api/g;Lv7/b;Lv7/c;)V

    return-void
.end method
