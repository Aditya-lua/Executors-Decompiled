.class public Lom/l;
.super Lom/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lom/l$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lom/k;-><init>()V

    return-void
.end method

.method public static f0()Lom/l;
    .locals 1

    invoke-static {}, Lom/l$a;->a()Lom/l;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public s(Lom/n;)Ljava/lang/String;
    .locals 0

    const-string p1, ""

    return-object p1
.end method
