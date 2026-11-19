.class public Lym/g$j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lym/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "j"
.end annotation


# static fields
.field public static final a:Lym/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lym/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lym/g;-><init>(Lym/h;)V

    sput-object v0, Lym/g$j;->a:Lym/g;

    return-void
.end method

.method public static bridge synthetic a()Lym/g;
    .locals 1

    sget-object v0, Lym/g$j;->a:Lym/g;

    return-object v0
.end method
