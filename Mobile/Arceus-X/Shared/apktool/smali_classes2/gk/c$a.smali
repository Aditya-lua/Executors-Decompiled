.class public Lgk/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgk/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lgk/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgk/c;

    invoke-direct {v0}, Lgk/c;-><init>()V

    sput-object v0, Lgk/c$a;->a:Lgk/c;

    return-void
.end method

.method public static bridge synthetic a()Lgk/c;
    .locals 1

    sget-object v0, Lgk/c$a;->a:Lgk/c;

    return-object v0
.end method
