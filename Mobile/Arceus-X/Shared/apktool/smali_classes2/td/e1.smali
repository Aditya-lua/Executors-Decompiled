.class public final Ltd/e1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ltd/f1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltd/f1;

    invoke-direct {v0}, Ltd/f1;-><init>()V

    sput-object v0, Ltd/e1;->a:Ltd/f1;

    return-void
.end method

.method public static bridge synthetic a()Ltd/f1;
    .locals 1

    sget-object v0, Ltd/e1;->a:Ltd/f1;

    return-object v0
.end method
