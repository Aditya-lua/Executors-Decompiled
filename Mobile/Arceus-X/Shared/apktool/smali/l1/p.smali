.class public abstract Ll1/p;
.super Ll1/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll1/p$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ll1/l;-><init>()V

    return-void
.end method

.method public static c(Ljava/lang/String;)Ll1/p$a;
    .locals 1

    new-instance v0, Ll1/i$b;

    invoke-direct {v0}, Ll1/i$b;-><init>()V

    invoke-virtual {v0, p0}, Ll1/i$b;->d(Ljava/lang/String;)Ll1/p$a;

    move-result-object p0

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Ll1/l$a;->a(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll1/p$a;

    return-object p0
.end method


# virtual methods
.method public abstract d()Ln0/a2$c;
.end method
