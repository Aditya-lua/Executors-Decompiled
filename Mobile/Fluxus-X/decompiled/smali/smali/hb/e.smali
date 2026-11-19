.class public final Lhb/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile a:Lhb/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhb/f;

    invoke-direct {v0}, Lhb/f;-><init>()V

    sput-object v0, Lhb/e;->a:Lhb/f;

    return-void
.end method

.method public static a()Lhb/f;
    .locals 1

    sget-object v0, Lhb/e;->a:Lhb/f;

    return-object v0
.end method
