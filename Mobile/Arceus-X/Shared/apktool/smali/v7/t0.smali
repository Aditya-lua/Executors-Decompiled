.class public final synthetic Lv7/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/a;


# instance fields
.field public final synthetic a:Lv7/j;


# direct methods
.method public synthetic constructor <init>(Lv7/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/t0;->a:Lv7/j;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lcom/android/billingclient/api/d;

    new-instance v0, Lv7/n;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v0, v1, v2}, Lv7/n;-><init>(Ljava/util/List;Ljava/util/List;)V

    iget-object v1, p0, Lv7/t0;->a:Lv7/j;

    invoke-interface {v1, p1, v0}, Lv7/j;->a(Lcom/android/billingclient/api/d;Lv7/n;)V

    return-void
.end method
