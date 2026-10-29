.class public Lo2/a;
.super Lw8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lw8/a<",
        "Lo2/a;",
        ">;"
    }
.end annotation


# instance fields
.field public e:[Lo2/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "Capability"

    invoke-direct {p0, v0}, Lw8/a;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public varargs l([Lo2/b;)Lo2/a;
    .locals 1
    .param p1    # [Lo2/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lo2/a;->e:[Lo2/b;

    const-string v0, "parameter"

    invoke-virtual {p0, v0, p1}, Lw8/a;->c(Ljava/lang/String;[Lw8/a;)Lw8/a;

    move-result-object p1

    check-cast p1, Lo2/a;

    return-object p1
.end method
