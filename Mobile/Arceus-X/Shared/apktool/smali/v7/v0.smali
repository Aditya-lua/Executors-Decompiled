.class public final synthetic Lv7/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/a;


# instance fields
.field public final synthetic a:Lv7/f;

.field public final synthetic b:Lv7/e;


# direct methods
.method public synthetic constructor <init>(Lv7/f;Lv7/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/v0;->a:Lv7/f;

    iput-object p2, p0, Lv7/v0;->b:Lv7/e;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lv7/v0;->a:Lv7/f;

    iget-object v1, p0, Lv7/v0;->b:Lv7/e;

    check-cast p1, Lcom/android/billingclient/api/d;

    invoke-virtual {v1}, Lv7/e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lv7/f;->a(Lcom/android/billingclient/api/d;Ljava/lang/String;)V

    return-void
.end method
