.class public final Lvd/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lvd/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvd/d0;

    invoke-direct {v0}, Lvd/d0;-><init>()V

    sput-object v0, Lvd/c0;->a:Lvd/d0;

    return-void
.end method

.method public static bridge synthetic a()Lvd/d0;
    .locals 1

    sget-object v0, Lvd/c0;->a:Lvd/d0;

    return-object v0
.end method
