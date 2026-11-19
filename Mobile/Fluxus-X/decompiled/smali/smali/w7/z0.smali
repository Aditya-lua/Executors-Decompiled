.class public final synthetic Lw7/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/g;

.field public final synthetic b:Lw7/b;

.field public final synthetic c:Lw7/c;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/g;Lw7/b;Lw7/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw7/z0;->a:Lcom/android/billingclient/api/g;

    iput-object p2, p0, Lw7/z0;->b:Lw7/b;

    iput-object p3, p0, Lw7/z0;->c:Lw7/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lw7/z0;->a:Lcom/android/billingclient/api/g;

    iget-object v1, p0, Lw7/z0;->b:Lw7/b;

    iget-object v2, p0, Lw7/z0;->c:Lw7/c;

    invoke-static {v0, v1, v2}, Lcom/android/billingclient/api/g;->k1(Lcom/android/billingclient/api/g;Lw7/b;Lw7/c;)V

    return-void
.end method
