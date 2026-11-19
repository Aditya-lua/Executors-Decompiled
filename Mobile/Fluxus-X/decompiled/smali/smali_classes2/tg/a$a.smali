.class public Ltg/a$a;
.super Lng/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lng/z;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltg/a;)V
    .locals 2

    instance-of v0, p1, Log/g;

    if-eqz v0, :cond_0

    check-cast p1, Log/g;

    invoke-virtual {p1}, Log/g;->G0()V

    return-void

    :cond_0
    iget v0, p1, Ltg/a;->i:I

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ltg/a;->f()I

    move-result v0

    :cond_1
    const/16 v1, 0xd

    if-ne v0, v1, :cond_2

    const/16 v0, 0x9

    iput v0, p1, Ltg/a;->i:I

    return-void

    :cond_2
    const/16 v1, 0xc

    if-ne v0, v1, :cond_3

    const/16 v0, 0x8

    iput v0, p1, Ltg/a;->i:I

    return-void

    :cond_3
    const/16 v1, 0xe

    if-ne v0, v1, :cond_4

    const/16 v0, 0xa

    iput v0, p1, Ltg/a;->i:I

    return-void

    :cond_4
    const-string v0, "a name"

    invoke-static {p1, v0}, Ltg/a;->a(Ltg/a;Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object p1

    throw p1
.end method
