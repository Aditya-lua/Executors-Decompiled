.class public Llj/f;
.super Llj/a;
.source "SourceFile"


# instance fields
.field public a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Llj/a;-><init>()V

    iput-object p1, p0, Llj/f;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)Landroid/database/Cursor;
    .locals 1

    iget-object p1, p0, Llj/f;->a:Landroid/content/Context;

    invoke-static {p1}, Lbh/t;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Llj/f$a;

    invoke-direct {v0, p0, p1}, Llj/f$a;-><init>(Llj/f;Ljava/lang/String;)V

    return-object v0
.end method

.method public b(Llj/i$a;)Lph/a;
    .locals 1

    sget-object v0, Llj/i$a;->a:Llj/i$a;

    if-ne p1, v0, :cond_0

    sget-object p1, Lph/a;->g:Lph/a;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
