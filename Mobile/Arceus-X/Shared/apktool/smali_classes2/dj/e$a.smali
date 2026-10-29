.class public Ldj/e$a;
.super Lcj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldj/e;->b(Landroid/net/Uri;)Landroid/database/Cursor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ldj/e;


# direct methods
.method public constructor <init>(Ldj/e;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ldj/e$a;->c:Ldj/e;

    iput-object p2, p0, Ldj/e$a;->a:Ljava/lang/String;

    iput-object p3, p0, Ldj/e$a;->b:Ljava/lang/String;

    invoke-direct {p0}, Lcj/a;-><init>()V

    return-void
.end method


# virtual methods
.method public getColumnNames()[Ljava/lang/String;
    .locals 2

    const-string v0, "dev_branch"

    const-string v1, "dev_commit"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getString(I)Ljava/lang/String;
    .locals 1

    const-string v0, "dev_branch"

    invoke-virtual {p0, v0}, Landroid/database/AbstractCursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Ldj/e$a;->a:Ljava/lang/String;

    return-object p1

    :cond_0
    const-string v0, "dev_commit"

    invoke-virtual {p0, v0}, Landroid/database/AbstractCursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Ldj/e$a;->b:Ljava/lang/String;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
