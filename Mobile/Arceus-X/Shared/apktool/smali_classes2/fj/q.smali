.class public final synthetic Lfj/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/j;


# instance fields
.field public final synthetic a:Lfj/a0;

.field public final synthetic b:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lfj/a0;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfj/q;->a:Lfj/a0;

    iput-object p2, p0, Lfj/q;->b:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/billingclient/api/d;Lv7/n;)V
    .locals 2

    iget-object v0, p0, Lfj/q;->a:Lfj/a0;

    iget-object v1, p0, Lfj/q;->b:Ljava/lang/Runnable;

    invoke-static {v0, v1, p1, p2}, Lfj/a0;->y(Lfj/a0;Ljava/lang/Runnable;Lcom/android/billingclient/api/d;Lv7/n;)V

    return-void
.end method
