.class public final Lqi/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqi/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lqi/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqi/b;

    invoke-direct {v0}, Lqi/b;-><init>()V

    sput-object v0, Lqi/b$b;->a:Lqi/b;

    return-void
.end method

.method public static bridge synthetic a()Lqi/b;
    .locals 1

    sget-object v0, Lqi/b$b;->a:Lqi/b;

    return-object v0
.end method
