.class public final synthetic Lnj/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw7/j;


# instance fields
.field public final synthetic a:Lnj/a0;

.field public final synthetic b:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lnj/a0;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnj/q;->a:Lnj/a0;

    iput-object p2, p0, Lnj/q;->b:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/billingclient/api/d;Lw7/n;)V
    .locals 2

    iget-object v0, p0, Lnj/q;->a:Lnj/a0;

    iget-object v1, p0, Lnj/q;->b:Ljava/lang/Runnable;

    invoke-static {v0, v1, p1, p2}, Lnj/a0;->y(Lnj/a0;Ljava/lang/Runnable;Lcom/android/billingclient/api/d;Lw7/n;)V

    return-void
.end method
