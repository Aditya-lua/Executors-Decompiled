.class public final synthetic Lng/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lng/d0;


# instance fields
.field public final synthetic a:Llg/h;

.field public final synthetic b:Ljava/lang/reflect/Type;


# direct methods
.method public synthetic constructor <init>(Llg/h;Ljava/lang/reflect/Type;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lng/l;->a:Llg/h;

    iput-object p2, p0, Lng/l;->b:Ljava/lang/reflect/Type;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lng/l;->a:Llg/h;

    iget-object v1, p0, Lng/l;->b:Ljava/lang/reflect/Type;

    invoke-static {v0, v1}, Lng/v;->i(Llg/h;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
