.class public final Ltd/g1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ltd/h1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltd/h1;

    invoke-direct {v0}, Ltd/h1;-><init>()V

    sput-object v0, Ltd/g1;->a:Ltd/h1;

    return-void
.end method

.method public static bridge synthetic a()Ltd/h1;
    .locals 1

    sget-object v0, Ltd/g1;->a:Ltd/h1;

    return-object v0
.end method
