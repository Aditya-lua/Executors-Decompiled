.class public final synthetic Lvo/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu7/e;


# instance fields
.field public final synthetic a:Lvo/o0;

.field public final synthetic b:Lap/m;


# direct methods
.method public synthetic constructor <init>(Lvo/o0;Lap/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/n0;->a:Lvo/o0;

    iput-object p2, p0, Lvo/n0;->b:Lap/m;

    return-void
.end method


# virtual methods
.method public final a(Lu7/b;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lvo/n0;->a:Lvo/o0;

    iget-object v1, p0, Lvo/n0;->b:Lap/m;

    invoke-static {v0, v1, p1}, Lvo/o0;->c(Lvo/o0;Lap/m;Lu7/b;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
