.class public final Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f$a;


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/h;->a:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;

    return-void
.end method

.method public static b(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;)Lft/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;",
            ")",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/h;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/h;-><init>(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(I)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/h;->a:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;

    invoke-virtual {v0, p1}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;->b(I)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;

    move-result-object p1

    return-object p1
.end method
