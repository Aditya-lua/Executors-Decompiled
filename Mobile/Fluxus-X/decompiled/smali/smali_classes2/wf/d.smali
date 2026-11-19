.class public interface abstract annotation Lwf/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lwf/d;
        intEncoding = .enum Lwf/d$a;->a:Lwf/d$a;
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwf/d$a;
    }
.end annotation


# virtual methods
.method public abstract intEncoding()Lwf/d$a;
.end method

.method public abstract tag()I
.end method
