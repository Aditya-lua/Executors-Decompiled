.class public Lrm/b$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrm/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final a:Lrm/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrm/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrm/b;-><init>(Lrm/c;)V

    sput-object v0, Lrm/b$c;->a:Lrm/b;

    return-void
.end method

.method public static bridge synthetic a()Lrm/b;
    .locals 1

    sget-object v0, Lrm/b$c;->a:Lrm/b;

    return-object v0
.end method
