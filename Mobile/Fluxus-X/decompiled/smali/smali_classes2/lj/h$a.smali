.class public Llj/h$a;
.super Lkj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llj/h;->a(Landroid/net/Uri;)Landroid/database/Cursor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Llj/h;


# direct methods
.method public constructor <init>(Llj/h;)V
    .locals 0

    iput-object p1, p0, Llj/h$a;->a:Llj/h;

    invoke-direct {p0}, Lkj/a;-><init>()V

    return-void
.end method


# virtual methods
.method public getColumnNames()[Ljava/lang/String;
    .locals 2

    const-string v0, "cookie_header"

    const-string v1, "cookie_value"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getString(I)Ljava/lang/String;
    .locals 1

    const-string v0, "cookie_header"

    invoke-virtual {p0, v0}, Landroid/database/AbstractCursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-ne p1, v0, :cond_0

    const-string p1, "Cookie"

    return-object p1

    :cond_0
    const-string v0, "cookie_value"

    invoke-virtual {p0, v0}, Landroid/database/AbstractCursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-ne p1, v0, :cond_1

    invoke-static {}, Ldl/j;->e()Ldl/j;

    move-result-object p1

    invoke-static {}, Lbh/a1;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ldl/j;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
