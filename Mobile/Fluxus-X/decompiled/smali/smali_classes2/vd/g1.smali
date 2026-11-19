.class public final Lvd/g1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lvd/h1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvd/h1;

    invoke-direct {v0}, Lvd/h1;-><init>()V

    sput-object v0, Lvd/g1;->a:Lvd/h1;

    return-void
.end method

.method public static bridge synthetic a()Lvd/h1;
    .locals 1

    sget-object v0, Lvd/g1;->a:Lvd/h1;

    return-object v0
.end method
