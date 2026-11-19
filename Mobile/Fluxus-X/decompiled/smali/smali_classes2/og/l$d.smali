.class public abstract Log/l$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Log/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/reflect/Field;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Field;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Log/l$d;->a:Ljava/lang/String;

    iput-object p2, p0, Log/l$d;->b:Ljava/lang/reflect/Field;

    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Log/l$d;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public abstract a(Ltg/a;I[Ljava/lang/Object;)V
.end method

.method public abstract b(Ltg/a;Ljava/lang/Object;)V
.end method

.method public abstract c(Ltg/c;Ljava/lang/Object;)V
.end method
