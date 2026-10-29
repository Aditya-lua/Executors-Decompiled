.class public Lv7/o$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv7/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Z


# direct methods
.method public synthetic constructor <init>(Lv7/z1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lv7/o$a;->b:Z

    return-void
.end method

.method public static bridge synthetic c(Lv7/o$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lv7/o$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic d(Lv7/o$a;)Z
    .locals 0

    iget-boolean p0, p0, Lv7/o$a;->b:Z

    return p0
.end method


# virtual methods
.method public a()Lv7/o;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lv7/o$a;->a:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-boolean v1, p0, Lv7/o$a;->b:Z

    if-eqz v1, :cond_1

    const-string v1, "subs"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "includeSuspendedSubscriptions is only supported for subscription purchases"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    new-instance v0, Lv7/o;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lv7/o;-><init>(Lv7/o$a;Lv7/z1;)V

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Product type must be set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Ljava/lang/String;)Lv7/o$a;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lv7/o$a;->a:Ljava/lang/String;

    return-object p0
.end method
