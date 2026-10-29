.class public Ldj/f;
.super Ldj/a;
.source "SourceFile"


# instance fields
.field public a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ldj/a;-><init>()V

    iput-object p1, p0, Ldj/f;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(Ldj/i$a;)Lgh/a;
    .locals 1

    sget-object v0, Ldj/i$a;->a:Ldj/i$a;

    if-ne p1, v0, :cond_0

    sget-object p1, Lgh/a;->g:Lgh/a;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public b(Landroid/net/Uri;)Landroid/database/Cursor;
    .locals 1

    iget-object p1, p0, Ldj/f;->a:Landroid/content/Context;

    invoke-static {p1}, Lsg/t;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ldj/f$a;

    invoke-direct {v0, p0, p1}, Ldj/f$a;-><init>(Ldj/f;Ljava/lang/String;)V

    return-object v0
.end method
