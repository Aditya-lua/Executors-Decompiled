.class public final Lun/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lun/j0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lun/i0;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lun/j0;
    .locals 1

    sget-object v0, Lun/j0$a;->a:Lun/j0;

    return-object v0
.end method

.method public static c()Lun/i0;
    .locals 1

    new-instance v0, Lun/i0;

    invoke-direct {v0}, Lun/i0;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lun/i0;
    .locals 1

    invoke-static {}, Lun/j0;->c()Lun/i0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lun/j0;->b()Lun/i0;

    move-result-object v0

    return-object v0
.end method
