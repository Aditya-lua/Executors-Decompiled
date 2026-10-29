.class public Lrl/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrl/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lrl/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrl/j;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrl/j;-><init>(Lrl/k;)V

    sput-object v0, Lrl/j$a;->a:Lrl/j;

    return-void
.end method

.method public static bridge synthetic a()Lrl/j;
    .locals 1

    sget-object v0, Lrl/j$a;->a:Lrl/j;

    return-object v0
.end method
