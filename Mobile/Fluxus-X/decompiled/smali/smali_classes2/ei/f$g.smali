.class public Lei/f$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lei/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# static fields
.field public static final a:Lei/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lei/f;

    invoke-direct {v0}, Lei/f;-><init>()V

    sput-object v0, Lei/f$g;->a:Lei/f;

    return-void
.end method

.method public static bridge synthetic a()Lei/f;
    .locals 1

    sget-object v0, Lei/f$g;->a:Lei/f;

    return-object v0
.end method
