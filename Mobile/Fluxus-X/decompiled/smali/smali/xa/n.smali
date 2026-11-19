.class public final Lxa/n;
.super Ll9/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ll9/a$a<",
        "Lxa/d;",
        "Ll9/a$d$c;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ll9/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic b(Landroid/content/Context;Landroid/os/Looper;Lo9/f;Ljava/lang/Object;Lm9/e;Lm9/n;)Ll9/a$f;
    .locals 6

    check-cast p4, Ll9/a$d$c;

    new-instance v0, Lxa/d;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lxa/d;-><init>(Landroid/content/Context;Landroid/os/Looper;Lo9/f;Lm9/e;Lm9/n;)V

    return-object v0
.end method
