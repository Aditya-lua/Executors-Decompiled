.class public final Lzq/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzq/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lzq/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzq/b;

    invoke-direct {v0}, Lzq/b;-><init>()V

    sput-object v0, Lzq/b$a;->a:Lzq/b;

    return-void
.end method
