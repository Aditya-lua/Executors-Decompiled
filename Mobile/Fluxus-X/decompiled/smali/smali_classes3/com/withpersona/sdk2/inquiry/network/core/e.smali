.class public final synthetic Lcom/withpersona/sdk2/inquiry/network/core/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmv/a0;


# instance fields
.field public final synthetic a:Lhn/w;


# direct methods
.method public synthetic constructor <init>(Lhn/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/core/e;->a:Lhn/w;

    return-void
.end method


# virtual methods
.method public final intercept(Lmv/a0$a;)Lmv/h0;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/e;->a:Lhn/w;

    invoke-static {v0, p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->b(Lhn/w;Lmv/a0$a;)Lmv/h0;

    move-result-object p1

    return-object p1
.end method
