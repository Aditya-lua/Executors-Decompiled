.class public Llj/j$a;
.super Lkj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llj/j;->a(Landroid/net/Uri;)Landroid/database/Cursor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Llj/j;


# direct methods
.method public constructor <init>(Llj/j;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Llj/j$a;->b:Llj/j;

    iput-object p2, p0, Llj/j$a;->a:Ljava/lang/String;

    invoke-direct {p0}, Lkj/a;-><init>()V

    return-void
.end method


# virtual methods
.method public getColumnNames()[Ljava/lang/String;
    .locals 1

    const-string v0, "user_agent_param"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getString(I)Ljava/lang/String;
    .locals 0

    iget-object p1, p0, Llj/j$a;->a:Ljava/lang/String;

    return-object p1
.end method
