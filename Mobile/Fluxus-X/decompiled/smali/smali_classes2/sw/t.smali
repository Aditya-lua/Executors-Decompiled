.class public final Lsw/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/Executor;

.field public static final b:Lsw/u;

.field public static final c:Lsw/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "java.vm.name"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "RoboVM"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    const-string v1, "Dalvik"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sput-object v2, Lsw/t;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Lsw/u$b;

    invoke-direct {v0}, Lsw/u$b;-><init>()V

    sput-object v0, Lsw/t;->b:Lsw/u;

    new-instance v0, Lsw/c$a;

    invoke-direct {v0}, Lsw/c$a;-><init>()V

    sput-object v0, Lsw/t;->c:Lsw/c;

    return-void

    :cond_0
    new-instance v0, Lsw/a;

    invoke-direct {v0}, Lsw/a;-><init>()V

    sput-object v0, Lsw/t;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Lsw/u$a;

    invoke-direct {v0}, Lsw/u$a;-><init>()V

    sput-object v0, Lsw/t;->b:Lsw/u;

    new-instance v0, Lsw/c$a;

    invoke-direct {v0}, Lsw/c$a;-><init>()V

    sput-object v0, Lsw/t;->c:Lsw/c;

    return-void

    :cond_1
    sput-object v2, Lsw/t;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Lsw/u;

    invoke-direct {v0}, Lsw/u;-><init>()V

    sput-object v0, Lsw/t;->b:Lsw/u;

    new-instance v0, Lsw/c;

    invoke-direct {v0}, Lsw/c;-><init>()V

    sput-object v0, Lsw/t;->c:Lsw/c;

    return-void
.end method
