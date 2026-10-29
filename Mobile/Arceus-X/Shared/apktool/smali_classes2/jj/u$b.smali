.class public Ljj/u$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljj/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:Ljj/u;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljj/u;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljj/u;-><init>(Ljj/v;)V

    sput-object v0, Ljj/u$b;->a:Ljj/u;

    return-void
.end method

.method public static bridge synthetic a()Ljj/u;
    .locals 1

    sget-object v0, Ljj/u$b;->a:Ljj/u;

    return-object v0
.end method
