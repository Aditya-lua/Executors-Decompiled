.class public final Ljb/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljb/e;

.field public static volatile b:Ljb/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljb/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljb/g;-><init>(Ljb/f;)V

    sput-object v0, Ljb/h;->a:Ljb/e;

    sput-object v0, Ljb/h;->b:Ljb/e;

    return-void
.end method

.method public static a()Ljb/e;
    .locals 1

    sget-object v0, Ljb/h;->b:Ljb/e;

    return-object v0
.end method
