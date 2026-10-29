.class public final Lsg/y$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsg/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lsg/y;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsg/y;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsg/y;-><init>(Lsg/z;)V

    sput-object v0, Lsg/y$b;->a:Lsg/y;

    return-void
.end method

.method public static bridge synthetic a()Lsg/y;
    .locals 1

    sget-object v0, Lsg/y$b;->a:Lsg/y;

    return-object v0
.end method
