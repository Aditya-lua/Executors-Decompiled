.class public Lhm/b$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhm/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# static fields
.field public static a:Lhm/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhm/b;

    invoke-direct {v0}, Lhm/b;-><init>()V

    sput-object v0, Lhm/b$f;->a:Lhm/b;

    return-void
.end method

.method public static bridge synthetic a()Lhm/b;
    .locals 1

    sget-object v0, Lhm/b$f;->a:Lhm/b;

    return-object v0
.end method
