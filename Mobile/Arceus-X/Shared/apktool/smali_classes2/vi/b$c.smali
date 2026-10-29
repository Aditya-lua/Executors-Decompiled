.class public Lvi/b$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvi/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final a:Lvi/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvi/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvi/b;-><init>(Lvi/c;)V

    sput-object v0, Lvi/b$c;->a:Lvi/b;

    return-void
.end method

.method public static bridge synthetic a()Lvi/b;
    .locals 1

    sget-object v0, Lvi/b$c;->a:Lvi/b;

    return-object v0
.end method
