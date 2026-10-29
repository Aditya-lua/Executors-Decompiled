.class public final Lcom/withpersona/sdk2/inquiry/internal/e$s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljp/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/internal/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "s"
.end annotation


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/internal/e$f;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/e$f;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$s;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/e$f;Lzo/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$s;-><init>(Lcom/withpersona/sdk2/inquiry/internal/e$f;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ldt/a;
    .locals 0

    check-cast p1, Ljp/b;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$s;->b(Ljp/b;)Ljp/c;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljp/b;)Ljp/c;
    .locals 2

    invoke-static {p1}, Lft/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/e$t;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$s;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-direct {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$t;-><init>(Lcom/withpersona/sdk2/inquiry/internal/e$f;Ljp/b;)V

    return-object v0
.end method
