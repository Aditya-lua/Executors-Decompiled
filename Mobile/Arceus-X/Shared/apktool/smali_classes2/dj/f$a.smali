.class public Ldj/f$a;
.super Lcj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldj/f;->b(Landroid/net/Uri;)Landroid/database/Cursor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ldj/f;


# direct methods
.method public constructor <init>(Ldj/f;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ldj/f$a;->b:Ldj/f;

    iput-object p2, p0, Ldj/f$a;->a:Ljava/lang/String;

    invoke-direct {p0}, Lcj/a;-><init>()V

    return-void
.end method


# virtual methods
.method public getColumnNames()[Ljava/lang/String;
    .locals 1

    const-string v0, "dev_rpc_ip_port_override"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getString(I)Ljava/lang/String;
    .locals 0

    iget-object p1, p0, Ldj/f$a;->a:Ljava/lang/String;

    return-object p1
.end method
