.class public final Lcom/withpersona/sdk2/inquiry/permissions/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/permissions/a$a;


# instance fields
.field public final a:Lrp/j;


# direct methods
.method public constructor <init>(Lrp/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/b;->a:Lrp/j;

    return-void
.end method

.method public static b(Lrp/j;)Lft/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrp/j;",
            ")",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/permissions/a$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/b;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/permissions/b;-><init>(Lrp/j;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Lcom/withpersona/sdk2/inquiry/permissions/a;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/b;->a:Lrp/j;

    invoke-virtual {v0}, Lrp/j;->b()Lcom/withpersona/sdk2/inquiry/permissions/a;

    move-result-object v0

    return-object v0
.end method
