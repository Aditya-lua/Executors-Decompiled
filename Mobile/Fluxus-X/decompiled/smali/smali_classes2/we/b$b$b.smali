.class public final enum Lwe/b$b$b;
.super Lwe/b$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwe/b$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lwe/b$b;-><init>(Ljava/lang/String;ILwe/b$a;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    invoke-static {}, Lwe/b;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lwe/b;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
