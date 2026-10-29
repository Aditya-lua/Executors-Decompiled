.class public Lkm/f$j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkm/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "j"
.end annotation


# static fields
.field public static final a:Lkm/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkm/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkm/f;-><init>(Lkm/g;)V

    sput-object v0, Lkm/f$j;->a:Lkm/f;

    return-void
.end method

.method public static bridge synthetic a()Lkm/f;
    .locals 1

    sget-object v0, Lkm/f$j;->a:Lkm/f;

    return-object v0
.end method
