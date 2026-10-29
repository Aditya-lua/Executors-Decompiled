.class public Lvg/e$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvg/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final a:Lvg/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvg/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvg/e;-><init>(Lvg/f;)V

    sput-object v0, Lvg/e$c;->a:Lvg/e;

    return-void
.end method

.method public static bridge synthetic a()Lvg/e;
    .locals 1

    sget-object v0, Lvg/e$c;->a:Lvg/e;

    return-object v0
.end method
