.class public Ldj/b$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldj/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final a:Ldj/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldj/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldj/b;-><init>(Ldj/c;)V

    sput-object v0, Ldj/b$c;->a:Ldj/b;

    return-void
.end method

.method public static bridge synthetic a()Ldj/b;
    .locals 1

    sget-object v0, Ldj/b$c;->a:Ldj/b;

    return-object v0
.end method
