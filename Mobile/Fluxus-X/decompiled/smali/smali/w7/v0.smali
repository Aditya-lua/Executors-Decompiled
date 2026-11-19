.class public final synthetic Lw7/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/a;


# instance fields
.field public final synthetic a:Lw7/f;

.field public final synthetic b:Lw7/e;


# direct methods
.method public synthetic constructor <init>(Lw7/f;Lw7/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw7/v0;->a:Lw7/f;

    iput-object p2, p0, Lw7/v0;->b:Lw7/e;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lw7/v0;->a:Lw7/f;

    iget-object v1, p0, Lw7/v0;->b:Lw7/e;

    check-cast p1, Lcom/android/billingclient/api/d;

    invoke-virtual {v1}, Lw7/e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lw7/f;->a(Lcom/android/billingclient/api/d;Ljava/lang/String;)V

    return-void
.end method
