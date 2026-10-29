.class public Lvg/j$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvg/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:Lvg/j;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lvg/j;

    new-instance v1, Lvg/j$d;

    invoke-direct {v1}, Lvg/j$d;-><init>()V

    new-instance v2, Lgk/d0;

    invoke-direct {v2}, Lgk/d0;-><init>()V

    invoke-direct {v0, v1, v2}, Lvg/j;-><init>(Lvg/j$c;Lgk/c0;)V

    sput-object v0, Lvg/j$b;->a:Lvg/j;

    return-void
.end method

.method public static bridge synthetic a()Lvg/j;
    .locals 1

    sget-object v0, Lvg/j$b;->a:Lvg/j;

    return-object v0
.end method
