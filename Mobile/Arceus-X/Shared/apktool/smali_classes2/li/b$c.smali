.class public Lli/b$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lli/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final a:Lli/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lli/b;

    invoke-direct {v0}, Lli/b;-><init>()V

    sput-object v0, Lli/b$c;->a:Lli/b;

    return-void
.end method

.method public static bridge synthetic a()Lli/b;
    .locals 1

    sget-object v0, Lli/b$c;->a:Lli/b;

    return-object v0
.end method
