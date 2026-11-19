.class public final Lyi/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyi/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lyi/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lyi/b;

    invoke-direct {v0}, Lyi/b;-><init>()V

    sput-object v0, Lyi/b$b;->a:Lyi/b;

    return-void
.end method

.method public static bridge synthetic a()Lyi/b;
    .locals 1

    sget-object v0, Lyi/b$b;->a:Lyi/b;

    return-object v0
.end method
