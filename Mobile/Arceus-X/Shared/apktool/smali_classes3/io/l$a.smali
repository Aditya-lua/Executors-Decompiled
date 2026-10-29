.class public final Lio/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lio/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/l;

    invoke-direct {v0}, Lio/l;-><init>()V

    sput-object v0, Lio/l$a;->a:Lio/l;

    return-void
.end method
