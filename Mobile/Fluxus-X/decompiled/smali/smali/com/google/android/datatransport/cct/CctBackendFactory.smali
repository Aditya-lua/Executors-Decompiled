.class public Lcom/google/android/datatransport/cct/CctBackendFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld8/d;


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
.method public create(Ld8/h;)Ld8/m;
    .locals 3

    new-instance v0, La8/d;

    invoke-virtual {p1}, Ld8/h;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Ld8/h;->e()Lm8/a;

    move-result-object v2

    invoke-virtual {p1}, Ld8/h;->d()Lm8/a;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, La8/d;-><init>(Landroid/content/Context;Lm8/a;Lm8/a;)V

    return-object v0
.end method
