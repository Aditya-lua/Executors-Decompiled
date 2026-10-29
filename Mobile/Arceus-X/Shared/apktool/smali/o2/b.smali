.class public Lo2/b;
.super Lw8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lw8/a<",
        "Lo2/b;",
        ">;"
    }
.end annotation


# instance fields
.field public e:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "Parameter"

    invoke-direct {p0, v0}, Lw8/a;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public varargs l([Ljava/lang/String;)Lo2/b;
    .locals 1
    .param p1    # [Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lo2/b;->e:[Ljava/lang/String;

    const-string v0, "value"

    invoke-virtual {p0, v0, p1}, Lw8/a;->b(Ljava/lang/String;[Ljava/lang/String;)Lw8/a;

    move-result-object p1

    check-cast p1, Lo2/b;

    return-object p1
.end method
