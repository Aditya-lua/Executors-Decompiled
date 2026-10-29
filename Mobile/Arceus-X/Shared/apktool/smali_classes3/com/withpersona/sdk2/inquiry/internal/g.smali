.class public final Lcom/withpersona/sdk2/inquiry/internal/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/internal/f$a;


# instance fields
.field public final a:Lzo/k;


# direct methods
.method public constructor <init>(Lzo/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/g;->a:Lzo/k;

    return-void
.end method

.method public static a(Lzo/k;)Lft/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzo/k;",
            ")",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/f$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/g;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/g;-><init>(Lzo/k;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public create(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/f;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/g;->a:Lzo/k;

    invoke-virtual {v0, p1}, Lzo/k;->b(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/f;

    move-result-object p1

    return-object p1
.end method
