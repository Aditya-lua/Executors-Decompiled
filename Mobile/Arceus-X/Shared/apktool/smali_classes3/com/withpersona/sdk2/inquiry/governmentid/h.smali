.class public final Lcom/withpersona/sdk2/inquiry/governmentid/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/governmentid/f$a;


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/governmentid/g;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/h;->a:Lcom/withpersona/sdk2/inquiry/governmentid/g;

    return-void
.end method

.method public static b(Lcom/withpersona/sdk2/inquiry/governmentid/g;)Lft/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/governmentid/g;",
            ")",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/f$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/h;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/governmentid/h;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/g;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/f;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/h;->a:Lcom/withpersona/sdk2/inquiry/governmentid/g;

    invoke-virtual {v0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/g;->b(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/f;

    move-result-object p1

    return-object p1
.end method
