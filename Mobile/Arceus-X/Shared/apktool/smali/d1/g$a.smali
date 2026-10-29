.class public final Ld1/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/g0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld1/g;->p(Lg0/g0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lg0/g0;


# direct methods
.method public constructor <init>(Lg0/g0;)V
    .locals 0

    iput-object p1, p0, Ld1/g$a;->a:Lg0/g0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCameraXConfig()Lg0/g0;
    .locals 1

    iget-object v0, p0, Ld1/g$a;->a:Lg0/g0;

    return-object v0
.end method
