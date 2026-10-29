.class public Lgg/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgg/b$b;
    }
.end annotation


# static fields
.field public static final a:Lgg/a;

.field public static volatile b:Lgg/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgg/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lgg/b$b;-><init>(Lgg/b$a;)V

    sput-object v0, Lgg/b;->a:Lgg/a;

    sput-object v0, Lgg/b;->b:Lgg/a;

    return-void
.end method

.method public static a()Lgg/a;
    .locals 1

    sget-object v0, Lgg/b;->b:Lgg/a;

    return-object v0
.end method
