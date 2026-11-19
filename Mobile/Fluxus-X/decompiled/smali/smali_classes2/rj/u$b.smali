.class public Lrj/u$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrj/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:Lrj/u;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrj/u;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrj/u;-><init>(Lrj/v;)V

    sput-object v0, Lrj/u$b;->a:Lrj/u;

    return-void
.end method

.method public static bridge synthetic a()Lrj/u;
    .locals 1

    sget-object v0, Lrj/u$b;->a:Lrj/u;

    return-object v0
.end method
