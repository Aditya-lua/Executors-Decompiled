.class public Lq/p0$f;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# instance fields
.field public final synthetic a:Lq/p0;


# direct methods
.method public constructor <init>(Lq/p0;)V
    .locals 0

    iput-object p1, p0, Lq/p0$f;->a:Lq/p0;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 1

    iget-object v0, p0, Lq/p0$f;->a:Lq/p0;

    invoke-virtual {v0}, Lq/p0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lq/p0$f;->a:Lq/p0;

    invoke-virtual {v0}, Lq/p0;->show()V

    :cond_0
    return-void
.end method

.method public onInvalidated()V
    .locals 1

    iget-object v0, p0, Lq/p0$f;->a:Lq/p0;

    invoke-virtual {v0}, Lq/p0;->dismiss()V

    return-void
.end method
