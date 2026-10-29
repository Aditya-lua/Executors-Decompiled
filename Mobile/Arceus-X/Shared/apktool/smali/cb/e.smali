.class public final Lcb/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcb/b;

.field public static volatile b:Lcb/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcb/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcb/d;-><init>(Lcb/c;)V

    sput-object v0, Lcb/e;->a:Lcb/b;

    sput-object v0, Lcb/e;->b:Lcb/b;

    return-void
.end method

.method public static a()Lcb/b;
    .locals 1

    sget-object v0, Lcb/e;->b:Lcb/b;

    return-object v0
.end method
