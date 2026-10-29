.class public final Lcom/withpersona/sdk2/inquiry/internal/e$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/internal/workflows/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/internal/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/internal/e$f;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/e$f;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$g;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/e$f;Lzo/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$g;-><init>(Lcom/withpersona/sdk2/inquiry/internal/e$f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/withpersona/sdk2/inquiry/internal/workflows/a;
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/e$h;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$g;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/internal/e$h;-><init>(Lcom/withpersona/sdk2/inquiry/internal/e$f;)V

    return-object v0
.end method
