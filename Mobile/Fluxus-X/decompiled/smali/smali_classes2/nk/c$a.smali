.class public Lnk/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnk/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lnk/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lnk/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lnk/c;-><init>(Lnk/d;)V

    sput-object v0, Lnk/c$a;->a:Lnk/c;

    return-void
.end method

.method public static bridge synthetic a()Lnk/c;
    .locals 1

    sget-object v0, Lnk/c$a;->a:Lnk/c;

    return-object v0
.end method
