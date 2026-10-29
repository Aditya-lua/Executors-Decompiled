.class public final Llb/v;
.super Lk9/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk9/a$a<",
        "Lhb/n;",
        "Lk9/a$d$c;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lk9/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Landroid/content/Context;Landroid/os/Looper;Ln9/d;Ljava/lang/Object;Lk9/f$a;Lk9/f$b;)Lk9/a$f;
    .locals 7

    check-cast p4, Lk9/a$d$c;

    new-instance v0, Lhb/n;

    const-string v5, "locationServices"

    move-object v1, p1

    move-object v2, p2

    move-object v6, p3

    move-object v3, p5

    move-object v4, p6

    invoke-direct/range {v0 .. v6}, Lhb/n;-><init>(Landroid/content/Context;Landroid/os/Looper;Lk9/f$a;Lk9/f$b;Ljava/lang/String;Ln9/d;)V

    return-object v0
.end method
