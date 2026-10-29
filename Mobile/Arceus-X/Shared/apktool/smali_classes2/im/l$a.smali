.class public Lim/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lim/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lim/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lim/l;

    invoke-direct {v0}, Lim/l;-><init>()V

    sput-object v0, Lim/l$a;->a:Lim/l;

    return-void
.end method

.method public static bridge synthetic a()Lim/l;
    .locals 1

    sget-object v0, Lim/l$a;->a:Lim/l;

    return-object v0
.end method
