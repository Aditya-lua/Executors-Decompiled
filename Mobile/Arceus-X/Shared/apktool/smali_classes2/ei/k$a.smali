.class public final Lei/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lei/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lei/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lei/k;

    invoke-direct {v0}, Lei/k;-><init>()V

    sput-object v0, Lei/k$a;->a:Lei/k;

    return-void
.end method

.method public static bridge synthetic a()Lei/k;
    .locals 1

    sget-object v0, Lei/k$a;->a:Lei/k;

    return-object v0
.end method
