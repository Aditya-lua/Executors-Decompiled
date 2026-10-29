.class public final synthetic Lv7/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/b;

.field public final synthetic b:Lv7/j;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/b;Lv7/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/h0;->a:Lcom/android/billingclient/api/b;

    iput-object p2, p0, Lv7/h0;->b:Lv7/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lv7/h0;->a:Lcom/android/billingclient/api/b;

    iget-object v1, p0, Lv7/h0;->b:Lv7/j;

    invoke-static {v0, v1}, Lcom/android/billingclient/api/b;->s(Lcom/android/billingclient/api/b;Lv7/j;)V

    return-void
.end method
