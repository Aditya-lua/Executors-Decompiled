.class public final Lbh/y$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbh/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lbh/y;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbh/y;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbh/y;-><init>(Lbh/z;)V

    sput-object v0, Lbh/y$b;->a:Lbh/y;

    return-void
.end method

.method public static bridge synthetic a()Lbh/y;
    .locals 1

    sget-object v0, Lbh/y$b;->a:Lbh/y;

    return-object v0
.end method
