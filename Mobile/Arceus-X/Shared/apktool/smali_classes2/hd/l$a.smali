.class public Lhd/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhd/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lhd/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhd/l;

    invoke-direct {v0}, Lhd/l;-><init>()V

    sput-object v0, Lhd/l$a;->a:Lhd/l;

    return-void
.end method
