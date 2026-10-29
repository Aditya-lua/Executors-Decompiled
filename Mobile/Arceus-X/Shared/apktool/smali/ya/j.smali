.class public final Lya/j;
.super Lk9/a$a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lk9/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic b(Landroid/content/Context;Landroid/os/Looper;Ln9/d;Ljava/lang/Object;Ll9/e;Ll9/n;)Lk9/a$f;
    .locals 7

    move-object v3, p4

    check-cast v3, Lz8/l;

    new-instance v0, Lya/p;

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lya/p;-><init>(Landroid/content/Context;Landroid/os/Looper;Lz8/l;Ln9/d;Ll9/e;Ll9/n;)V

    return-object v0
.end method
