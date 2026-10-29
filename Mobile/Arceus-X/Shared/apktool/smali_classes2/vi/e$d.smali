.class public Lvi/e$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvi/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# static fields
.field public static final a:Lvi/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvi/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvi/e;-><init>(Lvi/f;)V

    sput-object v0, Lvi/e$d;->a:Lvi/e;

    return-void
.end method

.method public static bridge synthetic a()Lvi/e;
    .locals 1

    sget-object v0, Lvi/e$d;->a:Lvi/e;

    return-object v0
.end method
