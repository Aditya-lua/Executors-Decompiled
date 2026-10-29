.class public final Lwi/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwi/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lwi/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwi/a;

    invoke-direct {v0}, Lwi/a;-><init>()V

    sput-object v0, Lwi/a$a;->a:Lwi/a;

    return-void
.end method

.method public static bridge synthetic a()Lwi/a;
    .locals 1

    sget-object v0, Lwi/a$a;->a:Lwi/a;

    return-object v0
.end method
