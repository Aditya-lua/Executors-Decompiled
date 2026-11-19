.class public final Log/n$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llg/s;
.implements Llg/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Log/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Log/n;


# direct methods
.method public constructor <init>(Log/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Log/n$b;->a:Log/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Log/n;Log/n$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Log/n$b;-><init>(Log/n;)V

    return-void
.end method
