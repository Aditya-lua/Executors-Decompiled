.class public Lsj/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsj/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lsj/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsj/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsj/b;-><init>(Lsj/c;)V

    sput-object v0, Lsj/b$a;->a:Lsj/b;

    return-void
.end method
