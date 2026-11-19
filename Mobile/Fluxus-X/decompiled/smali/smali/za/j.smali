.class public final Lza/j;
.super Ll9/a$a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ll9/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic b(Landroid/content/Context;Landroid/os/Looper;Lo9/f;Ljava/lang/Object;Lm9/e;Lm9/n;)Ll9/a$f;
    .locals 7

    move-object v3, p4

    check-cast v3, La9/y;

    new-instance v0, Lza/p;

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lza/p;-><init>(Landroid/content/Context;Landroid/os/Looper;La9/y;Lo9/f;Lm9/e;Lm9/n;)V

    return-object v0
.end method
