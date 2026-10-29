.class public Lqm/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqm/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lqm/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqm/a;

    invoke-direct {v0}, Lqm/a;-><init>()V

    sput-object v0, Lqm/a$a;->a:Lqm/a;

    return-void
.end method

.method public static bridge synthetic a()Lqm/a;
    .locals 1

    sget-object v0, Lqm/a$a;->a:Lqm/a;

    return-object v0
.end method
