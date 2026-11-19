.class public Lbo/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgo/g;


# instance fields
.field public final a:Leo/s;

.field public final b:Lgo/h;


# direct methods
.method public constructor <init>(Leo/s;Lgo/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbo/l;->a:Leo/s;

    iput-object p2, p0, Lbo/l;->b:Lgo/h;

    return-void
.end method


# virtual methods
.method public c()Leo/s;
    .locals 1

    iget-object v0, p0, Lbo/l;->a:Leo/s;

    return-object v0
.end method

.method public d()Lgo/h;
    .locals 1

    iget-object v0, p0, Lbo/l;->b:Lgo/h;

    return-object v0
.end method
