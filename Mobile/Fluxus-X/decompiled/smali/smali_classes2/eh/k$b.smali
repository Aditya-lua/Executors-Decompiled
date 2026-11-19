.class public Leh/k$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leh/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:Leh/k;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Leh/k;

    new-instance v1, Leh/k$d;

    invoke-direct {v1}, Leh/k$d;-><init>()V

    new-instance v2, Lok/d0;

    invoke-direct {v2}, Lok/d0;-><init>()V

    invoke-direct {v0, v1, v2}, Leh/k;-><init>(Leh/k$c;Lok/c0;)V

    sput-object v0, Leh/k$b;->a:Leh/k;

    return-void
.end method

.method public static bridge synthetic a()Leh/k;
    .locals 1

    sget-object v0, Leh/k$b;->a:Leh/k;

    return-object v0
.end method
