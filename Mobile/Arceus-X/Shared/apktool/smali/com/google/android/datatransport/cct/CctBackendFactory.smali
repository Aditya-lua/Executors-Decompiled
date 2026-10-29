.class public Lcom/google/android/datatransport/cct/CctBackendFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc8/d;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Lc8/h;)Lc8/m;
    .locals 3

    new-instance v0, Lz7/d;

    invoke-virtual {p1}, Lc8/h;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lc8/h;->e()Ll8/a;

    move-result-object v2

    invoke-virtual {p1}, Lc8/h;->d()Ll8/a;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lz7/d;-><init>(Landroid/content/Context;Ll8/a;Ll8/a;)V

    return-object v0
.end method
