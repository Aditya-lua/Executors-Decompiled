.class public final synthetic Lf4/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le5/f$b;


# instance fields
.field public final synthetic a:Lf4/v;


# direct methods
.method public synthetic constructor <init>(Lf4/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/r;->a:Lf4/v;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lf4/r;->a:Lf4/v;

    invoke-static {v0}, Lf4/v;->i1(Lf4/v;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
