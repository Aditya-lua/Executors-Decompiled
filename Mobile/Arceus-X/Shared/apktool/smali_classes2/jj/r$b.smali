.class public final Ljj/r$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljj/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Ljj/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljj/r;

    invoke-direct {v0}, Ljj/r;-><init>()V

    sput-object v0, Ljj/r$b;->a:Ljj/r;

    return-void
.end method

.method public static bridge synthetic a()Ljj/r;
    .locals 1

    sget-object v0, Ljj/r$b;->a:Ljj/r;

    return-object v0
.end method
