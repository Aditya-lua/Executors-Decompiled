.class public Lom/s$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lom/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:Lom/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lom/s;

    invoke-direct {v0}, Lom/s;-><init>()V

    sput-object v0, Lom/s$b;->a:Lom/s;

    return-void
.end method

.method public static bridge synthetic a()Lom/s;
    .locals 1

    sget-object v0, Lom/s$b;->a:Lom/s;

    return-object v0
.end method
