.class public final Lwa/n;
.super Lk9/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk9/a$a<",
        "Lwa/d;",
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
.method public final synthetic b(Landroid/content/Context;Landroid/os/Looper;Ln9/d;Ljava/lang/Object;Ll9/e;Ll9/n;)Lk9/a$f;
    .locals 6

    check-cast p4, Lk9/a$d$c;

    new-instance v0, Lwa/d;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lwa/d;-><init>(Landroid/content/Context;Landroid/os/Looper;Ln9/d;Ll9/e;Ll9/n;)V

    return-object v0
.end method
