.class public final synthetic Lv7/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/a;


# instance fields
.field public final synthetic a:Lv7/c;


# direct methods
.method public synthetic constructor <init>(Lv7/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/y0;->a:Lv7/c;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lv7/y0;->a:Lv7/c;

    check-cast p1, Lcom/android/billingclient/api/d;

    invoke-interface {v0, p1}, Lv7/c;->a(Lcom/android/billingclient/api/d;)V

    return-void
.end method
