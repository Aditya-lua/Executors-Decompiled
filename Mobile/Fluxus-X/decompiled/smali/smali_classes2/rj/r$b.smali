.class public final Lrj/r$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrj/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lrj/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrj/r;

    invoke-direct {v0}, Lrj/r;-><init>()V

    sput-object v0, Lrj/r$b;->a:Lrj/r;

    return-void
.end method

.method public static bridge synthetic a()Lrj/r;
    .locals 1

    sget-object v0, Lrj/r$b;->a:Lrj/r;

    return-object v0
.end method
