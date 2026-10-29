.class public final Lv7/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv7/e$a;
    }
.end annotation


# instance fields
.field public a:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lv7/k1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lv7/e$a;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lv7/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lv7/e$a;-><init>(Lv7/k1;)V

    return-object v0
.end method

.method public static bridge synthetic c(Lv7/e;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lv7/e;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lv7/e;->a:Ljava/lang/String;

    return-object v0
.end method
