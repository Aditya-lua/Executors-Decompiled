.class public final Lcom/withpersona/sdk2/inquiry/ui/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/ui/d$a;


# instance fields
.field public final a:Lor/l1;


# direct methods
.method public constructor <init>(Lor/l1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/e;->a:Lor/l1;

    return-void
.end method

.method public static b(Lor/l1;)Lft/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lor/l1;",
            ")",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/ui/d$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/ui/e;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/ui/e;-><init>(Lor/l1;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/d;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/e;->a:Lor/l1;

    invoke-virtual {v0, p1, p2, p3, p4}, Lor/l1;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/d;

    move-result-object p1

    return-object p1
.end method
