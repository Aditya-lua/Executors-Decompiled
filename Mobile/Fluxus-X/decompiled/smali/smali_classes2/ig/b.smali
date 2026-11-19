.class public Lig/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lig/b$b;
    }
.end annotation


# static fields
.field public static final a:Lig/a;

.field public static volatile b:Lig/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lig/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lig/b$b;-><init>(Lig/b$a;)V

    sput-object v0, Lig/b;->a:Lig/a;

    sput-object v0, Lig/b;->b:Lig/a;

    return-void
.end method

.method public static a()Lig/a;
    .locals 1

    sget-object v0, Lig/b;->b:Lig/a;

    return-object v0
.end method
