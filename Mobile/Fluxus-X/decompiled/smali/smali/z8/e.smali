.class public final Lz8/e;
.super Ll9/a$a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ll9/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Landroid/content/Context;Landroid/os/Looper;Lo9/f;Ljava/lang/Object;Ll9/h$a;Ll9/h$b;)Ll9/a$f;
    .locals 7

    move-object v4, p4

    check-cast v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    new-instance v0, Le9/i;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Le9/i;-><init>(Landroid/content/Context;Landroid/os/Looper;Lo9/f;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;Ll9/h$a;Ll9/h$b;)V

    return-object v0
.end method
