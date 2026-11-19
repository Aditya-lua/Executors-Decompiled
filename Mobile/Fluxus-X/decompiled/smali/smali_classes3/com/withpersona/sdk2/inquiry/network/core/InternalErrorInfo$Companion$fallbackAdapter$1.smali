.class public final Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$Companion$fallbackAdapter$1;
.super Lhn/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lhn/h<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lhn/h;-><init>()V

    return-void
.end method


# virtual methods
.method public fromJson(Lhn/m;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p1}, Lhn/m;->b()V

    invoke-virtual {p1}, Lhn/m;->d()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public toJson(Lhn/t;Ljava/lang/Object;)V
    .locals 2

    invoke-virtual {p1}, Lhn/t;->c()Lhn/t;

    move-result-object p1

    const-string v0, "message"

    invoke-virtual {p1, v0}, Lhn/t;->o(Ljava/lang/String;)Lhn/t;

    move-result-object p1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error with class \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\' does not have a json adapter registered."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lhn/t;->Q(Ljava/lang/String;)Lhn/t;

    move-result-object p1

    invoke-virtual {p1}, Lhn/t;->g()Lhn/t;

    return-void
.end method
