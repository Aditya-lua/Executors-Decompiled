.class public final Lcom/withpersona/sdk2/inquiry/internal/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/internal/v$a;


# instance fields
.field public final a:Lzo/p0;


# direct methods
.method public constructor <init>(Lzo/p0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/w;->a:Lzo/p0;

    return-void
.end method

.method public static b(Lzo/p0;)Lft/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzo/p0;",
            ")",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/v$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/w;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/w;-><init>(Lzo/p0;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)Lcom/withpersona/sdk2/inquiry/internal/v;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/w;->a:Lzo/p0;

    invoke-virtual {v0, p1, p2, p3}, Lzo/p0;->b(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)Lcom/withpersona/sdk2/inquiry/internal/v;

    move-result-object p1

    return-object p1
.end method
