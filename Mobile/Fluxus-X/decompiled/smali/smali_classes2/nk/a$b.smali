.class public Lnk/a$b;
.super Lpi/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnk/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Lpi/b;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lnk/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnk/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lmi/j;)Z
    .locals 2

    invoke-virtual {p1}, Lmi/j;->b()I

    move-result v0

    const/16 v1, 0xc8

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lmi/j;->b()I

    move-result p1

    const/16 v0, 0x191

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic e(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lmi/j;

    invoke-virtual {p0, p1}, Lnk/a$b;->a(Lmi/j;)Z

    move-result p1

    return p1
.end method
