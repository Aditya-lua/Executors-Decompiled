.class public Ldj/j$a;
.super Lcj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldj/j;->b(Landroid/net/Uri;)Landroid/database/Cursor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ldj/j;


# direct methods
.method public constructor <init>(Ldj/j;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ldj/j$a;->b:Ldj/j;

    iput-object p2, p0, Ldj/j$a;->a:Ljava/lang/String;

    invoke-direct {p0}, Lcj/a;-><init>()V

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

    iget-object p1, p0, Ldj/j$a;->a:Ljava/lang/String;

    return-object p1
.end method
