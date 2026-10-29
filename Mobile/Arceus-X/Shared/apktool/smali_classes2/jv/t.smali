.class public final Ljv/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/Executor;

.field public static final b:Ljv/u;

.field public static final c:Ljv/c;


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

    sput-object v2, Ljv/t;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Ljv/u$b;

    invoke-direct {v0}, Ljv/u$b;-><init>()V

    sput-object v0, Ljv/t;->b:Ljv/u;

    new-instance v0, Ljv/c$a;

    invoke-direct {v0}, Ljv/c$a;-><init>()V

    sput-object v0, Ljv/t;->c:Ljv/c;

    return-void

    :cond_0
    new-instance v0, Ljv/a;

    invoke-direct {v0}, Ljv/a;-><init>()V

    sput-object v0, Ljv/t;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Ljv/u$a;

    invoke-direct {v0}, Ljv/u$a;-><init>()V

    sput-object v0, Ljv/t;->b:Ljv/u;

    new-instance v0, Ljv/c$a;

    invoke-direct {v0}, Ljv/c$a;-><init>()V

    sput-object v0, Ljv/t;->c:Ljv/c;

    return-void

    :cond_1
    sput-object v2, Ljv/t;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Ljv/u;

    invoke-direct {v0}, Ljv/u;-><init>()V

    sput-object v0, Ljv/t;->b:Ljv/u;

    new-instance v0, Ljv/c;

    invoke-direct {v0}, Ljv/c;-><init>()V

    sput-object v0, Ljv/t;->c:Ljv/c;

    return-void
.end method
