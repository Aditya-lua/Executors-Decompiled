.class public Lgl/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgl/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:Lgl/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgl/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lgl/a;-><init>(Lgl/b;)V

    sput-object v0, Lgl/a$b;->a:Lgl/a;

    return-void
.end method

.method public static bridge synthetic a()Lgl/a;
    .locals 1

    sget-object v0, Lgl/a$b;->a:Lgl/a;

    return-object v0
.end method
