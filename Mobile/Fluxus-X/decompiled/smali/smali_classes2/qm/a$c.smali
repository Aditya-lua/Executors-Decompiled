.class public Lqm/a$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqm/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final a:Lqm/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqm/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqm/a;-><init>(Lqm/b;)V

    sput-object v0, Lqm/a$c;->a:Lqm/a;

    return-void
.end method

.method public static bridge synthetic a()Lqm/a;
    .locals 1

    sget-object v0, Lqm/a$c;->a:Lqm/a;

    return-object v0
.end method
