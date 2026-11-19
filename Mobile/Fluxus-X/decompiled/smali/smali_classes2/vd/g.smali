.class public final Lvd/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lvd/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvd/h;

    invoke-direct {v0}, Lvd/h;-><init>()V

    sput-object v0, Lvd/g;->a:Lvd/h;

    return-void
.end method

.method public static bridge synthetic a()Lvd/h;
    .locals 1

    sget-object v0, Lvd/g;->a:Lvd/h;

    return-object v0
.end method
