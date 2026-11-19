.class public final Lno/m$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lno/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lno/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lno/m;

    invoke-direct {v0}, Lno/m;-><init>()V

    sput-object v0, Lno/m$a;->a:Lno/m;

    return-void
.end method
