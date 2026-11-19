.class public Lvm/b$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvm/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# static fields
.field public static a:Lvm/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvm/b;

    invoke-direct {v0}, Lvm/b;-><init>()V

    sput-object v0, Lvm/b$f;->a:Lvm/b;

    return-void
.end method

.method public static bridge synthetic a()Lvm/b;
    .locals 1

    sget-object v0, Lvm/b$f;->a:Lvm/b;

    return-object v0
.end method
