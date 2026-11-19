.class public Lok/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lok/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lok/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lok/c;

    invoke-direct {v0}, Lok/c;-><init>()V

    sput-object v0, Lok/c$a;->a:Lok/c;

    return-void
.end method

.method public static bridge synthetic a()Lok/c;
    .locals 1

    sget-object v0, Lok/c$a;->a:Lok/c;

    return-object v0
.end method
