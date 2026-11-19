.class public Llj/g;
.super Llj/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Llj/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)Landroid/database/Cursor;
    .locals 0

    new-instance p1, Lkj/a;

    invoke-direct {p1}, Lkj/a;-><init>()V

    return-object p1
.end method

.method public b(Llj/i$a;)Lph/a;
    .locals 1

    sget-object v0, Llj/i$a;->a:Llj/i$a;

    if-ne p1, v0, :cond_0

    sget-object p1, Lph/a;->c:Lph/a;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
