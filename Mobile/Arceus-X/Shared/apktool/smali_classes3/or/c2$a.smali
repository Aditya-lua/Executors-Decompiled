.class public final Lor/c2$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lor/c2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lor/c2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lor/c2;

    invoke-direct {v0}, Lor/c2;-><init>()V

    sput-object v0, Lor/c2$a;->a:Lor/c2;

    return-void
.end method
