package dv;

import av.g2;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.common.InputImage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001aG\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0005\u001a0\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013\u001aG\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0004\b\u0014\u0010\f\u001a[\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u00028\u00000\u000120\b\u0001\u0010\u0017\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"T", "Ldv/h;", BuildConfig.FLAVOR, "count", "b", "(Ldv/h;I)Ldv/h;", "Lkotlin/Function2;", "Leu/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "predicate", "c", "(Ldv/h;Lkotlin/jvm/functions/Function2;)Ldv/h;", "e", "Ldv/i;", "value", "ownershipMarker", BuildConfig.FLAVOR, "d", "(Ldv/i;Ljava/lang/Object;Ljava/lang/Object;Leu/b;)Ljava/lang/Object;", "f", "R", "Lkotlin/Function3;", "transform", "g", "(Ldv/h;Lpu/n;)Ldv/h;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class w {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"dv/w$a", "Ldv/h;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements dv.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ dv.h f12884a;
        public final /* synthetic */ int b;

        public a(dv.h hVar, int i10) {
            this.f12884a = hVar;
            this.b = i10;
        }

        @Override // dv.h
        public Object collect(dv.i<? super T> iVar, eu.b<? super Unit> bVar) {
            Object objCollect = this.f12884a.collect(new b(new p001kotlin.jvm.internal.a0(), this.b, iVar), bVar);
            return objCollect == fu.c.e() ? objCollect : Unit.f21506a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements dv.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p001kotlin.jvm.internal.a0 f12885a;
        public final /* synthetic */ int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ dv.i<T> f12886c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @gu.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", l = {22}, m = "emit")
        public static final class a extends gu.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f12887t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ b<T> f12888u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f12889v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? super T> bVar, eu.b<? super a> bVar2) {
                super(bVar2);
                this.f12888u = bVar;
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                this.f12887t = obj;
                this.f12889v |= Integer.MIN_VALUE;
                return this.f12888u.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(p001kotlin.jvm.internal.a0 a0Var, int i10, dv.i<? super T> iVar) {
            this.f12885a = a0Var;
            this.b = i10;
            this.f12886c = iVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // dv.i
        public final Object emit(T t8, eu.b<? super Unit> bVar) {
            a aVar;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f12889v;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f12889v = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, bVar);
                }
            } else {
                aVar = new a(this, bVar);
            }
            Object obj = aVar.f12887t;
            Object objE = fu.c.e();
            int i11 = aVar.f12889v;
            if (i11 == 0) {
                zt.o.b(obj);
                p001kotlin.jvm.internal.a0 a0Var = this.f12885a;
                int i12 = a0Var.f21572a;
                if (i12 < this.b) {
                    a0Var.f21572a = i12 + 1;
                    return Unit.f21506a;
                }
                dv.i<T> iVar = this.f12886c;
                aVar.f12889v = 1;
                if (iVar.emit(t8, aVar) == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"dv/w$c", "Ldv/h;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c<T> implements dv.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ dv.h f12890a;
        public final /* synthetic */ Function2 b;

        public c(dv.h hVar, Function2 function2) {
            this.f12890a = hVar;
            this.b = function2;
        }

        @Override // dv.h
        public Object collect(dv.i<? super T> iVar, eu.b<? super Unit> bVar) {
            Object objCollect = this.f12890a.collect(new d(new p001kotlin.jvm.internal.y(), iVar, this.b), bVar);
            return objCollect == fu.c.e() ? objCollect : Unit.f21506a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d<T> implements dv.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p001kotlin.jvm.internal.y f12891a;
        public final /* synthetic */ dv.i<T> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function2<T, eu.b<? super Boolean>, Object> f12892c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @gu.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {34, InputImage.IMAGE_FORMAT_YUV_420_888, 37}, m = "emit")
        public static final class a extends gu.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f12893t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f12894u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public /* synthetic */ Object f12895v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ d<T> f12896w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public int f12897x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(d<? super T> dVar, eu.b<? super a> bVar) {
                super(bVar);
                this.f12896w = dVar;
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                this.f12895v = obj;
                this.f12897x |= Integer.MIN_VALUE;
                return this.f12896w.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(p001kotlin.jvm.internal.y yVar, dv.i<? super T> iVar, Function2<? super T, ? super eu.b<? super Boolean>, ? extends Object> function2) {
            this.f12891a = yVar;
            this.b = iVar;
            this.f12892c = function2;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0074  */
        /* JADX WARN: Code duplicated, block: B:36:0x008b  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // dv.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t8, eu.b<? super Unit> bVar) {
            a aVar;
            d<T> dVar;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f12897x;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f12897x = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, bVar);
                }
            } else {
                aVar = new a(this, bVar);
            }
            Object objInvoke = aVar.f12895v;
            Object objE = fu.c.e();
            int i11 = aVar.f12897x;
            if (i11 != 0) {
                if (i11 == 1) {
                    zt.o.b(objInvoke);
                    return Unit.f21506a;
                }
                if (i11 == 2) {
                    t8 = (T) aVar.f12894u;
                    dVar = (d) aVar.f12893t;
                    zt.o.b(objInvoke);
                    if (!((Boolean) objInvoke).booleanValue()) {
                        return Unit.f21506a;
                    }
                    dVar.f12891a.f21591a = true;
                    dv.i<T> iVar = dVar.b;
                    aVar.f12893t = null;
                    aVar.f12894u = null;
                    aVar.f12897x = 3;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(objInvoke);
                }
                return Unit.f21506a;
            }
            zt.o.b(objInvoke);
            if (this.f12891a.f21591a) {
                dv.i<T> iVar2 = this.b;
                aVar.f12897x = 1;
            } else {
                Function2<T, eu.b<? super Boolean>, Object> function2 = this.f12892c;
                aVar.f12893t = this;
                aVar.f12894u = t8;
                aVar.f12897x = 2;
                objInvoke = function2.invoke(t8, aVar);
                if (objInvoke != objE) {
                    dVar = this;
                    if (!((Boolean) objInvoke).booleanValue()) {
                        return Unit.f21506a;
                    }
                    dVar.f12891a.f21591a = true;
                    dv.i<T> iVar3 = dVar.b;
                    aVar.f12893t = null;
                    aVar.f12894u = null;
                    aVar.f12897x = 3;
                }
            }
            return objE;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @gu.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {71}, m = "emitAbort$FlowKt__LimitKt")
    public static final class e<T> extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12898t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f12899u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f12900v;

        public e(eu.b<? super e> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12899u = obj;
            this.f12900v |= Integer.MIN_VALUE;
            return w.d(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"dv/w$f", "Ldv/h;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f<T> implements dv.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ dv.h f12901a;
        public final /* synthetic */ int b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @gu.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", l = {112}, m = "collect")
        public static final class a extends gu.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f12902t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f12903u;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public Object f12905w;

            public a(eu.b bVar) {
                super(bVar);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                this.f12902t = obj;
                this.f12903u |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(dv.h hVar, int i10) {
            this.f12901a = hVar;
            this.b = i10;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // dv.h
        public Object collect(dv.i<? super T> iVar, eu.b<? super Unit> bVar) {
            a aVar;
            kotlin.a e10;
            Object obj;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f12903u;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f12903u = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(bVar);
                }
            } else {
                aVar = new a(bVar);
            }
            Object obj2 = aVar.f12902t;
            Object objE = fu.c.e();
            int i11 = aVar.f12903u;
            if (i11 == 0) {
                zt.o.b(obj2);
                Object obj3 = new Object();
                p001kotlin.jvm.internal.a0 a0Var = new p001kotlin.jvm.internal.a0();
                try {
                    dv.h hVar = this.f12901a;
                    g gVar = new g(a0Var, this.b, iVar, obj3);
                    aVar.f12905w = obj3;
                    aVar.f12903u = 1;
                    if (hVar.collect(gVar, aVar) == objE) {
                        return objE;
                    }
                } catch (kotlin.a e11) {
                    e10 = e11;
                    obj = obj3;
                    kotlin.p.a(e10, obj);
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = aVar.f12905w;
                try {
                    zt.o.b(obj2);
                } catch (kotlin.a e12) {
                    e10 = e12;
                    kotlin.p.a(e10, obj);
                }
            }
            return Unit.f21506a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class g<T> implements dv.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p001kotlin.jvm.internal.a0 f12906a;
        public final /* synthetic */ int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ dv.i<T> f12907c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f12908d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @gu.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", l = {59, 61}, m = "emit")
        public static final class a extends gu.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f12909t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ g<T> f12910u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f12911v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(g<? super T> gVar, eu.b<? super a> bVar) {
                super(bVar);
                this.f12910u = gVar;
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                this.f12909t = obj;
                this.f12911v |= Integer.MIN_VALUE;
                return this.f12910u.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public g(p001kotlin.jvm.internal.a0 a0Var, int i10, dv.i<? super T> iVar, Object obj) {
            this.f12906a = a0Var;
            this.b = i10;
            this.f12907c = iVar;
            this.f12908d = obj;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        
            if (r7.emit(r6, r0) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        
            if (dv.w.d(r7, r6, r2, r0) == r1) goto L25;
         */
        @Override // dv.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t8, eu.b<? super Unit> bVar) {
            a aVar;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f12911v;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f12911v = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, bVar);
                }
            } else {
                aVar = new a(this, bVar);
            }
            Object obj = aVar.f12909t;
            Object objE = fu.c.e();
            int i11 = aVar.f12911v;
            if (i11 != 0) {
                if (i11 == 1) {
                    zt.o.b(obj);
                    return Unit.f21506a;
                }
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return Unit.f21506a;
            }
            zt.o.b(obj);
            p001kotlin.jvm.internal.a0 a0Var = this.f12906a;
            int i12 = a0Var.f21572a + 1;
            a0Var.f21572a = i12;
            if (i12 < this.b) {
                dv.i<T> iVar = this.f12907c;
                aVar.f12911v = 1;
            } else {
                dv.i<T> iVar2 = this.f12907c;
                Object obj2 = this.f12908d;
                aVar.f12911v = 2;
            }
            return objE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"dv/w$h", "Ldv/h;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h<T> implements dv.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ dv.h f12912a;
        public final /* synthetic */ Function2 b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @gu.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", l = {120}, m = "collect")
        public static final class a extends gu.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f12913t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f12914u;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public Object f12916w;

            public a(eu.b bVar) {
                super(bVar);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                this.f12913t = obj;
                this.f12914u |= Integer.MIN_VALUE;
                return h.this.collect(null, this);
            }
        }

        public h(dv.h hVar, Function2 function2) {
            this.f12912a = hVar;
            this.b = function2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // dv.h
        public Object collect(dv.i<? super T> iVar, eu.b<? super Unit> bVar) {
            a aVar;
            i iVar2;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f12914u;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f12914u = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(bVar);
                }
            } else {
                aVar = new a(bVar);
            }
            Object obj = aVar.f12913t;
            Object objE = fu.c.e();
            int i11 = aVar.f12914u;
            if (i11 == 0) {
                zt.o.b(obj);
                dv.h hVar = this.f12912a;
                i iVar3 = new i(this.b, iVar);
                try {
                    aVar.f12916w = iVar3;
                    aVar.f12914u = 1;
                    if (hVar.collect(iVar3, aVar) == objE) {
                        return objE;
                    }
                } catch (kotlin.a e10) {
                    e = e10;
                    iVar2 = iVar3;
                    kotlin.p.a(e, iVar2);
                    g2.i(aVar.getContext());
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iVar2 = (i) aVar.f12916w;
                try {
                    zt.o.b(obj);
                } catch (kotlin.a e11) {
                    e = e11;
                    kotlin.p.a(e, iVar2);
                    g2.i(aVar.getContext());
                }
            }
            return Unit.f21506a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"dv/w$i", "Ldv/i;", "value", BuildConfig.FLAVOR, "emit", "(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i<T> implements dv.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function2 f12917a;
        public final /* synthetic */ dv.i b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @gu.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", l = {132, 133}, m = "emit")
        public static final class a extends gu.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f12918t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f12919u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f12920v;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public Object f12922x;

            public a(eu.b bVar) {
                super(bVar);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                this.f12919u = obj;
                this.f12920v |= Integer.MIN_VALUE;
                return i.this.emit(null, this);
            }
        }

        public i(Function2 function2, dv.i iVar) {
            this.f12917a = function2;
            this.b = iVar;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x007e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0081  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
        
            if (r2.emit(r9, r0) == r1) goto L24;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // dv.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object emit(T t8, eu.b<? super Unit> bVar) {
            a aVar;
            Object obj;
            Object obj2;
            i<T> iVar;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f12920v;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f12920v = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(bVar);
                }
            } else {
                aVar = new a(bVar);
            }
            Object obj3 = aVar.f12919u;
            Object objE = fu.c.e();
            int i11 = aVar.f12920v;
            boolean z10 = true;
            if (i11 == 0) {
                zt.o.b(obj3);
                Function2 function2 = this.f12917a;
                aVar.f12918t = this;
                aVar.f12922x = t8;
                aVar.f12920v = 1;
                p001kotlin.jvm.internal.l.c(6);
                Object objInvoke = function2.invoke(t8, aVar);
                p001kotlin.jvm.internal.l.c(7);
                if (objInvoke != objE) {
                    obj = objInvoke;
                    obj2 = t8;
                    iVar = this;
                }
                return objE;
            }
            if (i11 == 1) {
                Object obj4 = aVar.f12922x;
                i<T> iVar2 = (i) aVar.f12918t;
                zt.o.b(obj3);
                obj2 = obj4;
                iVar = iVar2;
                obj = obj3;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iVar = (i) aVar.f12918t;
                zt.o.b(obj3);
            }
            if (z10) {
                return Unit.f21506a;
            }
            throw new kotlin.a(iVar);
            if (((Boolean) obj).booleanValue()) {
                dv.i iVar3 = iVar.b;
                aVar.f12918t = iVar;
                aVar.f12922x = null;
                aVar.f12920v = 2;
            } else {
                z10 = false;
            }
            if (z10) {
                return Unit.f21506a;
            }
            throw new kotlin.a(iVar);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Ldv/i;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 1, 0})
    @gu.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", l = {152}, m = "invokeSuspend")
    public static final class j<R> extends gu.m implements Function2<dv.i<? super R>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12923t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f12924u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ dv.h<T> f12925v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ pu.n<dv.i<? super R>, T, eu.b<? super Boolean>, Object> f12926w;

        /* JADX INFO: Add missing generic type declarations: [T] */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"dv/w$j$a", "Ldv/i;", "value", BuildConfig.FLAVOR, "emit", "(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements dv.i<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ pu.n f12927a;
            public final /* synthetic */ dv.i b;

            /* JADX INFO: renamed from: dv.w$j$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @gu.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "Limit.kt", l = {132}, m = "emit")
            public static final class C0248a extends gu.d {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public Object f12928t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public /* synthetic */ Object f12929u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public int f12930v;

                public C0248a(eu.b bVar) {
                    super(bVar);
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    this.f12929u = obj;
                    this.f12930v |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pu.n nVar, dv.i iVar) {
                this.f12927a = nVar;
                this.b = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // dv.i
            public Object emit(T t8, eu.b<? super Unit> bVar) {
                C0248a c0248a;
                a<T> aVar;
                if (bVar instanceof C0248a) {
                    c0248a = (C0248a) bVar;
                    int i10 = c0248a.f12930v;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0248a.f12930v = i10 - Integer.MIN_VALUE;
                    } else {
                        c0248a = new C0248a(bVar);
                    }
                } else {
                    c0248a = new C0248a(bVar);
                }
                Object objInvoke = c0248a.f12929u;
                Object objE = fu.c.e();
                int i11 = c0248a.f12930v;
                if (i11 == 0) {
                    zt.o.b(objInvoke);
                    pu.n nVar = this.f12927a;
                    dv.i iVar = this.b;
                    c0248a.f12928t = this;
                    c0248a.f12930v = 1;
                    p001kotlin.jvm.internal.l.c(6);
                    objInvoke = nVar.invoke(iVar, t8, c0248a);
                    p001kotlin.jvm.internal.l.c(7);
                    if (objInvoke == objE) {
                        return objE;
                    }
                    aVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) c0248a.f12928t;
                    zt.o.b(objInvoke);
                }
                if (((Boolean) objInvoke).booleanValue()) {
                    return Unit.f21506a;
                }
                throw new kotlin.a(aVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(dv.h<? extends T> hVar, pu.n<? super dv.i<? super R>, ? super T, ? super eu.b<? super Boolean>, ? extends Object> nVar, eu.b<? super j> bVar) {
            super(2, bVar);
            this.f12925v = hVar;
            this.f12926w = nVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            j jVar = new j(this.f12925v, this.f12926w, bVar);
            jVar.f12924u = obj;
            return jVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type eu.b to dv.w$j<R> for r5v1 'this'  eu.b
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // gu.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = fu.c.e()
                int r1 = r5.f12923t
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r5.f12924u
                dv.w$j$a r0 = (dv.w.j.a) r0
                zt.o.b(r6)     // Catch: kotlin.a -> L13
                goto L44
            L13:
                r6 = move-exception
                goto L3a
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                zt.o.b(r6)
                java.lang.Object r6 = r5.f12924u
                dv.i r6 = (dv.i) r6
                dv.h<T> r1 = r5.f12925v
                pu.n<dv.i<? super R>, T, eu.b<? super java.lang.Boolean>, java.lang.Object> r3 = r5.f12926w
                dv.w$j$a r4 = new dv.w$j$a
                r4.<init>(r3, r6)
                r5.f12924u = r4     // Catch: kotlin.a -> L38
                r5.f12923t = r2     // Catch: kotlin.a -> L38
                java.lang.Object r6 = r1.collect(r4, r5)     // Catch: kotlin.a -> L38
                if (r6 != r0) goto L44
                return r0
            L38:
                r6 = move-exception
                r0 = r4
            L3a:
                kotlin.p.a(r6, r0)
                kotlin.coroutines.CoroutineContext r6 = r5.getContext()
                av.g2.i(r6)
            L44:
                kotlin.Unit r6 = p001kotlin.Unit.f21506a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: dv.w.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dv.i<? super R> iVar, eu.b<? super Unit> bVar) {
            return ((j) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @NotNull
    public static final <T> dv.h<T> b(@NotNull dv.h<? extends T> hVar, int i10) {
        if (i10 >= 0) {
            return new a(hVar, i10);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i10).toString());
    }

    @NotNull
    public static final <T> dv.h<T> c(@NotNull dv.h<? extends T> hVar, @NotNull Function2<? super T, ? super eu.b<? super Boolean>, ? extends Object> function2) {
        return new c(hVar, function2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object d(dv.i<? super T> iVar, T t8, Object obj, eu.b<? super Unit> bVar) {
        e eVar;
        if (bVar instanceof e) {
            eVar = (e) bVar;
            int i10 = eVar.f12900v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f12900v = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(bVar);
            }
        } else {
            eVar = new e(bVar);
        }
        Object obj2 = eVar.f12899u;
        Object objE = fu.c.e();
        int i11 = eVar.f12900v;
        if (i11 == 0) {
            zt.o.b(obj2);
            eVar.f12898t = obj;
            eVar.f12900v = 1;
            if (iVar.emit(t8, eVar) == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = eVar.f12898t;
            zt.o.b(obj2);
        }
        throw new kotlin.a(obj);
    }

    @NotNull
    public static final <T> dv.h<T> e(@NotNull dv.h<? extends T> hVar, int i10) {
        if (i10 > 0) {
            return new f(hVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " should be positive").toString());
    }

    @NotNull
    public static final <T> dv.h<T> f(@NotNull dv.h<? extends T> hVar, @NotNull Function2<? super T, ? super eu.b<? super Boolean>, ? extends Object> function2) {
        return new h(hVar, function2);
    }

    @NotNull
    public static final <T, R> dv.h<R> g(@NotNull dv.h<? extends T> hVar, @NotNull pu.n<? super dv.i<? super R>, ? super T, ? super eu.b<? super Boolean>, ? extends Object> nVar) {
        return dv.j.w(new j(hVar, nVar, null));
    }
}
