.class public Lwh/f$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwh/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# static fields
.field public static final a:Lwh/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwh/f;

    invoke-direct {v0}, Lwh/f;-><init>()V

    sput-object v0, Lwh/f$g;->a:Lwh/f;

    return-void
.end method

.method public static bridge synthetic a()Lwh/f;
    .locals 1

    sget-object v0, Lwh/f$g;->a:Lwh/f;

    return-object v0
.end method
