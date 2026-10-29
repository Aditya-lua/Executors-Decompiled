.class public Lfk/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfk/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lfk/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lfk/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lfk/c;-><init>(Lfk/d;)V

    sput-object v0, Lfk/c$a;->a:Lfk/c;

    return-void
.end method

.method public static bridge synthetic a()Lfk/c;
    .locals 1

    sget-object v0, Lfk/c$a;->a:Lfk/c;

    return-object v0
.end method
