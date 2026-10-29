.class public Lj/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj/b;->u1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lj/b;


# direct methods
.method public constructor <init>(Lj/b;)V
    .locals 0

    iput-object p1, p0, Lj/b$b;->a:Lj/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lj/b$b;->a:Lj/b;

    invoke-virtual {p1}, Lj/b;->s1()Lj/e;

    move-result-object p1

    invoke-virtual {p1}, Lj/e;->s()V

    iget-object v0, p0, Lj/b$b;->a:Lj/b;

    invoke-virtual {v0}, Le/p;->A()Ld5/f;

    move-result-object v0

    const-string v1, "androidx:appcompat"

    invoke-virtual {v0, v1}, Ld5/f;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p1, v0}, Lj/e;->w(Landroid/os/Bundle;)V

    return-void
.end method
