.class public Ldn/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldn/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Ldn/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ldn/a;

    invoke-direct {v0}, Ldn/a;-><init>()V

    sput-object v0, Ldn/a$a;->a:Ldn/a;

    return-void
.end method

.method public static bridge synthetic a()Ldn/a;
    .locals 1

    sget-object v0, Ldn/a$a;->a:Ldn/a;

    return-object v0
.end method
