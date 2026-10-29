.class public Lei/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lei/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lei/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lei/b;

    invoke-direct {v0}, Lei/b;-><init>()V

    sput-object v0, Lei/b$a;->a:Lei/b;

    return-void
.end method

.method public static bridge synthetic a()Lei/b;
    .locals 1

    sget-object v0, Lei/b$a;->a:Lei/b;

    return-object v0
.end method
