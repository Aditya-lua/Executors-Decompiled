.class public final synthetic Lf4/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le5/f$b;


# instance fields
.field public final synthetic a:Lf4/k0;


# direct methods
.method public synthetic constructor <init>(Lf4/k0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/i0;->a:Lf4/k0;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lf4/i0;->a:Lf4/k0;

    invoke-static {v0}, Lf4/k0;->b(Lf4/k0;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
