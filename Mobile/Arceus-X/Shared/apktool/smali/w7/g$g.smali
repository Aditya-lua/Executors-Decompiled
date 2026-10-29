.class public Lw7/g$g;
.super Lw7/g$o0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# static fields
.field public static a:Lw7/g$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw7/g$g;

    invoke-direct {v0}, Lw7/g$g;-><init>()V

    sput-object v0, Lw7/g$g;->a:Lw7/g$g;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lw7/g$o0;-><init>()V

    return-void
.end method

.method public static a()Lw7/g$g;
    .locals 1

    sget-object v0, Lw7/g$g;->a:Lw7/g$g;

    return-object v0
.end method
