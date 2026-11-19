.class public Lf4/k0$d;
.super Lf4/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf4/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lf4/k0;


# direct methods
.method public constructor <init>(Lf4/k0;)V
    .locals 0

    iput-object p1, p0, Lf4/k0$d;->b:Lf4/k0;

    invoke-direct {p0}, Lf4/z;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/ClassLoader;Ljava/lang/String;)Lf4/q;
    .locals 2
    .param p1    # Ljava/lang/ClassLoader;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object p1, p0, Lf4/k0$d;->b:Lf4/k0;

    invoke-virtual {p1}, Lf4/k0;->A0()Lf4/a0;

    move-result-object p1

    iget-object v0, p0, Lf4/k0$d;->b:Lf4/k0;

    invoke-virtual {v0}, Lf4/k0;->A0()Lf4/a0;

    move-result-object v0

    invoke-virtual {v0}, Lf4/a0;->g()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lf4/x;->c(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Lf4/q;

    move-result-object p1

    return-object p1
.end method
