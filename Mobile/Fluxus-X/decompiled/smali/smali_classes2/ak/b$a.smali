.class public Lak/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lak/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lak/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lak/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lak/b;-><init>(Lak/c;)V

    sput-object v0, Lak/b$a;->a:Lak/b;

    return-void
.end method
