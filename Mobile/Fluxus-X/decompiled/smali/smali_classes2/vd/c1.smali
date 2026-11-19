.class public final Lvd/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvd/d1;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)Ll9/b;
    .locals 2

    const-string v0, "error"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lvd/b;

    invoke-direct {v1, p1, v0}, Lvd/b;-><init>(ILjava/lang/Throwable;)V

    return-object v1
.end method
