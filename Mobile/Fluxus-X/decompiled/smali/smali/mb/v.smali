.class public final Lmb/v;
.super Ll9/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ll9/a$a<",
        "Lib/n;",
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
.method public final bridge synthetic a(Landroid/content/Context;Landroid/os/Looper;Lo9/f;Ljava/lang/Object;Ll9/h$a;Ll9/h$b;)Ll9/a$f;
    .locals 7

    check-cast p4, Ll9/a$d$c;

    new-instance v0, Lib/n;

    const-string v5, "locationServices"

    move-object v1, p1

    move-object v2, p2

    move-object v6, p3

    move-object v3, p5

    move-object v4, p6

    invoke-direct/range {v0 .. v6}, Lib/n;-><init>(Landroid/content/Context;Landroid/os/Looper;Ll9/h$a;Ll9/h$b;Ljava/lang/String;Lo9/f;)V

    return-object v0
.end method
