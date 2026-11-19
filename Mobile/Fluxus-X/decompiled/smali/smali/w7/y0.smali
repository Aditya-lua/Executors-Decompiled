.class public final synthetic Lw7/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/a;


# instance fields
.field public final synthetic a:Lw7/c;


# direct methods
.method public synthetic constructor <init>(Lw7/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw7/y0;->a:Lw7/c;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lw7/y0;->a:Lw7/c;

    check-cast p1, Lcom/android/billingclient/api/d;

    invoke-interface {v0, p1}, Lw7/c;->a(Lcom/android/billingclient/api/d;)V

    return-void
.end method
