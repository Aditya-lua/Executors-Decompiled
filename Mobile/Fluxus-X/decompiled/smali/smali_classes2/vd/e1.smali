.class public final Lvd/e1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lvd/f1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvd/f1;

    invoke-direct {v0}, Lvd/f1;-><init>()V

    sput-object v0, Lvd/e1;->a:Lvd/f1;

    return-void
.end method

.method public static bridge synthetic a()Lvd/f1;
    .locals 1

    sget-object v0, Lvd/e1;->a:Lvd/f1;

    return-object v0
.end method
