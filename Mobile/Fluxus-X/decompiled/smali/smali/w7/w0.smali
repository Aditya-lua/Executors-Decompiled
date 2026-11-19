.class public final synthetic Lw7/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/g;

.field public final synthetic b:Lw7/e;

.field public final synthetic c:Lw7/f;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/g;Lw7/e;Lw7/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw7/w0;->a:Lcom/android/billingclient/api/g;

    iput-object p2, p0, Lw7/w0;->b:Lw7/e;

    iput-object p3, p0, Lw7/w0;->c:Lw7/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lw7/w0;->a:Lcom/android/billingclient/api/g;

    iget-object v1, p0, Lw7/w0;->b:Lw7/e;

    iget-object v2, p0, Lw7/w0;->c:Lw7/f;

    invoke-static {v0, v1, v2}, Lcom/android/billingclient/api/g;->l1(Lcom/android/billingclient/api/g;Lw7/e;Lw7/f;)V

    return-void
.end method
