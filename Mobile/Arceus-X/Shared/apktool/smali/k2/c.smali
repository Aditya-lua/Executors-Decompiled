.class public Lk2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk2/c$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lk2/c;
    .locals 2

    new-instance v0, Lk2/c$a;

    invoke-static {}, Landroid/app/ActivityOptions;->makeBasic()Landroid/app/ActivityOptions;

    move-result-object v1

    invoke-direct {v0, v1}, Lk2/c$a;-><init>(Landroid/app/ActivityOptions;)V

    return-object v0
.end method


# virtual methods
.method public b(I)Lk2/c;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public c()Landroid/os/Bundle;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method
