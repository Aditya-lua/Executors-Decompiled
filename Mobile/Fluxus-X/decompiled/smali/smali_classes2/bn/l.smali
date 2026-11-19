.class public Lbn/l;
.super Lbn/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbn/l$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lbn/k;-><init>()V

    return-void
.end method

.method public static U()Lbn/l;
    .locals 1

    invoke-static {}, Lbn/l$a;->a()Lbn/l;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public k(Lbn/o;)Ljava/lang/String;
    .locals 0

    const-string p1, ""

    return-object p1
.end method
