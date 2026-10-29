.class public Lvi/h$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvi/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# static fields
.field public static final a:Lvi/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvi/h;

    invoke-direct {v0}, Lvi/h;-><init>()V

    sput-object v0, Lvi/h$e;->a:Lvi/h;

    return-void
.end method

.method public static bridge synthetic a()Lvi/h;
    .locals 1

    sget-object v0, Lvi/h$e;->a:Lvi/h;

    return-object v0
.end method
