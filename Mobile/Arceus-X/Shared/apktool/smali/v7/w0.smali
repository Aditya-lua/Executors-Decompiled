.class public final synthetic Lv7/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/g;

.field public final synthetic b:Lv7/e;

.field public final synthetic c:Lv7/f;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/g;Lv7/e;Lv7/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/w0;->a:Lcom/android/billingclient/api/g;

    iput-object p2, p0, Lv7/w0;->b:Lv7/e;

    iput-object p3, p0, Lv7/w0;->c:Lv7/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lv7/w0;->a:Lcom/android/billingclient/api/g;

    iget-object v1, p0, Lv7/w0;->b:Lv7/e;

    iget-object v2, p0, Lv7/w0;->c:Lv7/f;

    invoke-static {v0, v1, v2}, Lcom/android/billingclient/api/g;->l1(Lcom/android/billingclient/api/g;Lv7/e;Lv7/f;)V

    return-void
.end method
