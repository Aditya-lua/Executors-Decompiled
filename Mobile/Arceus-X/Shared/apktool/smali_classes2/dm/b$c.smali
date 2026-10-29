.class public Ldm/b$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldm/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final a:Ldm/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldm/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldm/b;-><init>(Ldm/c;)V

    sput-object v0, Ldm/b$c;->a:Ldm/b;

    return-void
.end method

.method public static bridge synthetic a()Ldm/b;
    .locals 1

    sget-object v0, Ldm/b$c;->a:Ldm/b;

    return-object v0
.end method
