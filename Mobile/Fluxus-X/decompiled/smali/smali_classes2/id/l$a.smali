.class public Lid/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lid/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lid/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lid/l;

    invoke-direct {v0}, Lid/l;-><init>()V

    sput-object v0, Lid/l$a;->a:Lid/l;

    return-void
.end method
