.class public Lcm/a$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcm/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final a:Lcm/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcm/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcm/a;-><init>(Lcm/b;)V

    sput-object v0, Lcm/a$c;->a:Lcm/a;

    return-void
.end method

.method public static bridge synthetic a()Lcm/a;
    .locals 1

    sget-object v0, Lcm/a$c;->a:Lcm/a;

    return-object v0
.end method
