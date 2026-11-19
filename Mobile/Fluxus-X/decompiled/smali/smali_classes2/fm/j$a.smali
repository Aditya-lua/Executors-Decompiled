.class public Lfm/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfm/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lfm/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lfm/j;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lfm/j;-><init>(Lfm/k;)V

    sput-object v0, Lfm/j$a;->a:Lfm/j;

    return-void
.end method

.method public static bridge synthetic a()Lfm/j;
    .locals 1

    sget-object v0, Lfm/j$a;->a:Lfm/j;

    return-object v0
.end method
