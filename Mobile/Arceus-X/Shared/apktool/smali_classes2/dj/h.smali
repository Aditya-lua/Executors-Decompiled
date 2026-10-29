.class public Ldj/h;
.super Ldj/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ldj/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ldj/i$a;)Lgh/a;
    .locals 1

    sget-object v0, Ldj/i$a;->a:Ldj/i$a;

    if-ne p1, v0, :cond_0

    sget-object p1, Lgh/a;->i:Lgh/a;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public b(Landroid/net/Uri;)Landroid/database/Cursor;
    .locals 0

    new-instance p1, Ldj/h$a;

    invoke-direct {p1, p0}, Ldj/h$a;-><init>(Ldj/h;)V

    return-object p1
.end method
