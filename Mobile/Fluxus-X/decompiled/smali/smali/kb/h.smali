.class public final Lkb/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lkb/e;

.field public static volatile b:Lkb/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkb/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkb/g;-><init>(Lkb/f;)V

    sput-object v0, Lkb/h;->a:Lkb/e;

    sput-object v0, Lkb/h;->b:Lkb/e;

    return-void
.end method

.method public static a()Lkb/e;
    .locals 1

    sget-object v0, Lkb/h;->b:Lkb/e;

    return-object v0
.end method
