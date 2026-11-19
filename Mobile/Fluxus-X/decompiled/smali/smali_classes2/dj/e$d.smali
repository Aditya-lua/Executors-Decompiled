.class public Ldj/e$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldj/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# static fields
.field public static final a:Ldj/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldj/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldj/e;-><init>(Ldj/f;)V

    sput-object v0, Ldj/e$d;->a:Ldj/e;

    return-void
.end method

.method public static bridge synthetic a()Ldj/e;
    .locals 1

    sget-object v0, Ldj/e$d;->a:Ldj/e;

    return-object v0
.end method
