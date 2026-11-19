.class public Lye/o$a;
.super Lye/o;
.source "SourceFile"

# interfaces
.implements Lre/y;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lye/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:",
        "Ljava/lang/Object;",
        ">",
        "Lye/o<",
        "TP;>;",
        "Lre/y<",
        "TP;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/a1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TP;>;",
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "+",
            "Lcom/google/crypto/tink/shaded/protobuf/s0;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcf/f0$c;->d:Lcf/f0$c;

    invoke-direct {p0, p1, p2, v0, p3}, Lye/o;-><init>(Ljava/lang/String;Ljava/lang/Class;Lcf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)V

    return-void
.end method
