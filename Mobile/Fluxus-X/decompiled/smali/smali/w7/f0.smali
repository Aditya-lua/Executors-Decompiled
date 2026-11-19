.class public final synthetic Lw7/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/b;

.field public final synthetic b:Lw7/f;

.field public final synthetic c:Lw7/e;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/b;Lw7/f;Lw7/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw7/f0;->a:Lcom/android/billingclient/api/b;

    iput-object p2, p0, Lw7/f0;->b:Lw7/f;

    iput-object p3, p0, Lw7/f0;->c:Lw7/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lw7/f0;->a:Lcom/android/billingclient/api/b;

    iget-object v1, p0, Lw7/f0;->b:Lw7/f;

    iget-object v2, p0, Lw7/f0;->c:Lw7/e;

    invoke-static {v0, v1, v2}, Lcom/android/billingclient/api/b;->p(Lcom/android/billingclient/api/b;Lw7/f;Lw7/e;)V

    return-void
.end method
