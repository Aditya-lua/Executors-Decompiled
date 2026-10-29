.class public final synthetic Lio/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt7/e;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/governmentid/m;

.field public final synthetic b:Lno/m;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/m;Lno/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/v;->a:Lcom/withpersona/sdk2/inquiry/governmentid/m;

    iput-object p2, p0, Lio/v;->b:Lno/m;

    return-void
.end method


# virtual methods
.method public final a(Lt7/b;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lio/v;->a:Lcom/withpersona/sdk2/inquiry/governmentid/m;

    iget-object v1, p0, Lio/v;->b:Lno/m;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/m;->c(Lcom/withpersona/sdk2/inquiry/governmentid/m;Lno/m;Lt7/b;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
