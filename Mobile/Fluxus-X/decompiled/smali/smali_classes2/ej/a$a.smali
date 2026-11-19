.class public final Lej/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lej/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lej/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lej/a;

    invoke-direct {v0}, Lej/a;-><init>()V

    sput-object v0, Lej/a$a;->a:Lej/a;

    return-void
.end method

.method public static bridge synthetic a()Lej/a;
    .locals 1

    sget-object v0, Lej/a$a;->a:Lej/a;

    return-object v0
.end method
