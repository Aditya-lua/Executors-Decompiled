package com.withpersona.sdk2.inquiry.p057ui;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.C1759R;
import com.withpersona.sdk2.inquiry.p057ui.C4155h;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.SelectedFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mp.C8638u;
import mp.C8639v;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p139g.AbstractC5854c;
import p229jt.C7348o;
import p256ku.AbstractC7900n2;
import p256ku.C7864g1;
import p256ku.C7866g3;
import p256ku.C7872i;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p477ut.C11958c;
import p499vr.InterfaceC12257h;
import p581ym.InterfaceC13222o;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.h */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0016(Bo\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b\u0012$\u0010\u0011\u001a \b\u0001\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00152\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u00152\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\u001f\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R0\u0010\u0010\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R2\u0010\u0011\u001a \b\u0001\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&¨\u0006)"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/h;", "Lym/o;", "Lcom/withpersona/sdk2/inquiry/ui/h$b;", "Lvr/h;", "", "key", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "", "launchPicker", "Lkotlin/Function1;", "Lnt/b;", "", "Landroid/net/Uri;", "", "collectResult", "checkPendingResult", "<init>", "(Ljava/lang/String;Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "otherWorker", "", "b", "(Lym/o;)Z", "c", "(Lvr/h;)Z", "Lnu/h;", "run", "()Lnu/h;", "Lnu/i;", "uris", "h", "(Lnu/i;Ljava/util/List;Lnt/b;)Ljava/lang/Object;", "Ljava/lang/String;", "Landroid/content/Context;", "d", "Lkotlin/jvm/functions/Function0;", "e", "Lkotlin/jvm/functions/Function1;", "f", "a", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4155h implements InterfaceC13222o<b>, InterfaceC12257h<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Function0<Unit> launchPicker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Function1<InterfaceC9557b<? super List<? extends Uri>>, Object> collectResult;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Function1<InterfaceC9557b<? super List<? extends Uri>>, Object> checkPendingResult;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.h$a */
    @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/h$a;", "", "Lg/c;", "", "", "openMultipleDocumentsLauncher", "openSingleDocumentLauncher", "Landroid/content/Context;", "context", "<init>", "(Lg/c;Lg/c;Landroid/content/Context;)V", "componentName", "allowedFileTypes", "", "fileUploadLimit", "Lcom/withpersona/sdk2/inquiry/ui/h;", "b", "(Ljava/lang/String;[Ljava/lang/String;I)Lcom/withpersona/sdk2/inquiry/ui/h;", "a", "Lg/c;", "c", "Landroid/content/Context;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final AbstractC5854c<String[]> openMultipleDocumentsLauncher;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final AbstractC5854c<String[]> openSingleDocumentLauncher;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.h$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", "", "Landroid/net/Uri;"}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$Factory$create$2", m39664f = "UiStepFileSelectWorker.kt", m39665l = {116, 119}, m39666m = "invokeSuspend")
        public static final class C14152a extends AbstractC10351m implements Function1<InterfaceC9557b<? super List<? extends Uri>>, Object> {

            /* JADX INFO: renamed from: t */
            public int f17716t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ int f17717u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14152a(int i10, InterfaceC9557b<? super C14152a> interfaceC9557b) {
                super(1, interfaceC9557b);
                this.f17717u = i10;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
                return new C14152a(this.f17717u, interfaceC9557b);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
            
                if (r5 == r0) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
            
                if (r5 == r0) goto L23;
             */
            @Override // pt.AbstractC10339a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f17716t;
                if (i10 != 0) {
                    if (i10 == 1) {
                        C7348o.m30470b(obj);
                        Uri uri = (Uri) obj;
                        return uri != null ? C7697o.m31878d(uri) : C7699p.m31892k();
                    }
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return (List) obj;
                }
                C7348o.m30470b(obj);
                if (this.f17717u == 1) {
                    C8638u c8638u = new C8638u();
                    this.f17716t = 1;
                    obj = C9579j.m37804u(c8638u, this);
                } else {
                    C8639v c8639v = new C8639v();
                    this.f17716t = 2;
                    obj = C9579j.m37804u(c8639v, this);
                }
                return objM38805e;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC9557b<? super List<? extends Uri>> interfaceC9557b) {
                return ((C14152a) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.h$a$b */
        @Metadata(m31664d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n"}, m31665d2 = {"<anonymous>", "", "Landroid/net/Uri;"}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$Factory$create$3", m39664f = "UiStepFileSelectWorker.kt", m39665l = {C1759R.styleable.AppCompatTheme_windowMinWidthMajor, 127}, m39666m = "invokeSuspend")
        public static final class b extends AbstractC10351m implements Function1<InterfaceC9557b<? super List<? extends Uri>>, Object> {

            /* JADX INFO: renamed from: t */
            public int f17718t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ int f17719u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i10, InterfaceC9557b<? super b> interfaceC9557b) {
                super(1, interfaceC9557b);
                this.f17719u = i10;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
                return new b(this.f17719u, interfaceC9557b);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
            
                if (r5 == r0) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
            
                if (r5 == r0) goto L23;
             */
            @Override // pt.AbstractC10339a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f17718t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    if (this.f17719u == 1) {
                        C8638u c8638u = new C8638u();
                        this.f17718t = 1;
                        obj = C9579j.m37805v(c8638u, this);
                    } else {
                        C8639v c8639v = new C8639v();
                        this.f17718t = 2;
                        obj = C9579j.m37805v(c8639v, this);
                    }
                    return objM38805e;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return (List) obj;
                }
                C7348o.m30470b(obj);
                Uri uri = (Uri) obj;
                if (uri != null) {
                    return C7697o.m31878d(uri);
                }
                return null;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC9557b<? super List<? extends Uri>> interfaceC9557b) {
                return ((b) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        public a(@NotNull AbstractC5854c<String[]> openMultipleDocumentsLauncher, @NotNull AbstractC5854c<String[]> openSingleDocumentLauncher, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(openMultipleDocumentsLauncher, "openMultipleDocumentsLauncher");
            Intrinsics.checkNotNullParameter(openSingleDocumentLauncher, "openSingleDocumentLauncher");
            Intrinsics.checkNotNullParameter(context, "context");
            this.openMultipleDocumentsLauncher = openMultipleDocumentsLauncher;
            this.openSingleDocumentLauncher = openSingleDocumentLauncher;
            this.context = context;
        }

        /* JADX INFO: renamed from: c */
        public static final Unit m21502c(int i10, a aVar, String[] strArr) {
            if (i10 == 1) {
                aVar.openSingleDocumentLauncher.m26240b(strArr);
            } else {
                aVar.openMultipleDocumentsLauncher.m26240b(strArr);
            }
            return Unit.f29331a;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C4155h m21503b(@NotNull String componentName, @NotNull final String[] allowedFileTypes, final int fileUploadLimit) {
            Intrinsics.checkNotNullParameter(componentName, "componentName");
            Intrinsics.checkNotNullParameter(allowedFileTypes, "allowedFileTypes");
            return new C4155h("FileUploadPicker-" + componentName, this.context, new Function0() { // from class: or.a4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4155h.a.m21502c(fileUploadLimit, this, allowedFileTypes);
                }
            }, new C14152a(fileUploadLimit, null), new b(fileUploadLimit, null));
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.h$b */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/h$b;", "", "<init>", "()V", "c", "a", "b", "Lcom/withpersona/sdk2/inquiry/ui/h$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/h$b$b;", "Lcom/withpersona/sdk2/inquiry/ui/h$b$c;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.h$b$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/h$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/h$b;", "<init>", "()V", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final a f17720a = new a();

            public a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.h$b$b, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/h$b$b;", "Lcom/withpersona/sdk2/inquiry/ui/h$b;", "<init>", "()V", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C14153b extends b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final C14153b f17721a = new C14153b();

            public C14153b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.h$b$c, reason: from toString */
        @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/h$b$c;", "Lcom/withpersona/sdk2/inquiry/ui/h$b;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SelectedFile;", "files", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Success extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            @NotNull
            public final List<SelectedFile> files;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull List<SelectedFile> files) {
                super(null);
                Intrinsics.checkNotNullParameter(files, "files");
                this.files = files;
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final List<SelectedFile> m21506a() {
                return this.files;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.m31980c(this.files, ((Success) other).files);
            }

            public int hashCode() {
                return this.files.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(files=" + this.files + ")";
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.ui.h.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.h$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/ui/h$b;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$run$1", m39664f = "UiStepFileSelectWorker.kt", m39665l = {42, 46, 50, 54, 55}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC9577i<? super b>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f17723t;

        /* JADX INFO: renamed from: u */
        public Object f17724u;

        /* JADX INFO: renamed from: v */
        public int f17725v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f17726w;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.h$c$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$run$1$1", m39664f = "UiStepFileSelectWorker.kt", m39665l = {}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f17728t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C4155h f17729u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C4155h c4155h, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f17729u = c4155h;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f17729u, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                C10047c.m38805e();
                if (this.f17728t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                this.f17729u.launchPicker.invoke();
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.h$c$b */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "", "Landroid/net/Uri;", "<anonymous>", "(Lku/p0;)Ljava/util/List;"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$run$1$pendingResult$1", m39664f = "UiStepFileSelectWorker.kt", m39665l = {43}, m39666m = "invokeSuspend")
        public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super List<? extends Uri>>, Object> {

            /* JADX INFO: renamed from: t */
            public int f17730t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C4155h f17731u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C4155h c4155h, InterfaceC9557b<? super b> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f17731u = c4155h;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new b(this.f17731u, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f17730t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return obj;
                }
                C7348o.m30470b(obj);
                Function1 function1 = this.f17731u.checkPendingResult;
                this.f17730t = 1;
                Object objInvoke = function1.invoke(this);
                return objInvoke == objM38805e ? objM38805e : objInvoke;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super List<? extends Uri>> interfaceC9557b) {
                return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            c cVar = C4155h.this.new c(interfaceC9557b);
            cVar.f17726w = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00b8 A[PHI: r2 r11
          0x00b8: PHI (r2v7 java.util.List) = (r2v6 java.util.List), (r2v13 java.util.List) binds: [B:31:0x00b5, B:12:0x0031] A[DONT_GENERATE, DONT_INLINE]
          0x00b8: PHI (r11v10 java.lang.Object) = (r11v9 java.lang.Object), (r11v0 java.lang.Object) binds: [B:31:0x00b5, B:12:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
        
            if (r2.m21500h(r0, r11, r10) == r1) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00d4, code lost:
        
            if (r3.m21500h(r0, r11, r10) == r1) goto L35;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List list;
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f17726w;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f17725v;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                b bVar = new b(C4155h.this, null);
                this.f17726w = interfaceC9577i;
                this.f17725v = 1;
                obj = C7866g3.m32662e(100L, bVar, this);
                if (obj != objM38805e) {
                }
                return objM38805e;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    C7348o.m30470b(obj);
                    return Unit.f29331a;
                }
                if (i10 == 3) {
                    list = (List) this.f17723t;
                    C7348o.m30470b(obj);
                    Function1 function1 = C4155h.this.collectResult;
                    this.f17726w = interfaceC9577i;
                    this.f17723t = C10350l.m39676a(list);
                    this.f17725v = 4;
                    obj = function1.invoke(this);
                    if (obj != objM38805e) {
                        List list2 = (List) obj;
                        C4155h c4155h = C4155h.this;
                        this.f17726w = C10350l.m39676a(interfaceC9577i);
                        this.f17723t = C10350l.m39676a(list);
                        this.f17724u = C10350l.m39676a(list2);
                        this.f17725v = 5;
                    }
                    return objM38805e;
                }
                if (i10 == 4) {
                    list = (List) this.f17723t;
                    C7348o.m30470b(obj);
                    List list3 = (List) obj;
                    C4155h c4155h2 = C4155h.this;
                    this.f17726w = C10350l.m39676a(interfaceC9577i);
                    this.f17723t = C10350l.m39676a(list);
                    this.f17724u = C10350l.m39676a(list3);
                    this.f17725v = 5;
                } else {
                    if (i10 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
            }
            C7348o.m30470b(obj);
            List list4 = (List) obj;
            if (list4 != null) {
                C4155h c4155h3 = C4155h.this;
                this.f17726w = C10350l.m39676a(interfaceC9577i);
                this.f17723t = C10350l.m39676a(list4);
                this.f17725v = 2;
            } else {
                AbstractC7900n2 abstractC7900n2M32645c = C7864g1.m32645c();
                a aVar = new a(C4155h.this, null);
                this.f17726w = interfaceC9577i;
                this.f17723t = C10350l.m39676a(list4);
                this.f17725v = 3;
                if (C7872i.m32684g(abstractC7900n2M32645c, aVar, this) != objM38805e) {
                    list = list4;
                    Function1 function2 = C4155h.this.collectResult;
                    this.f17726w = interfaceC9577i;
                    this.f17723t = C10350l.m39676a(list);
                    this.f17725v = 4;
                    obj = function2.invoke(this);
                    if (obj != objM38805e) {
                        List list5 = (List) obj;
                        C4155h c4155h4 = C4155h.this;
                        this.f17726w = C10350l.m39676a(interfaceC9577i);
                        this.f17723t = C10350l.m39676a(list);
                        this.f17724u = C10350l.m39676a(list5);
                        this.f17725v = 5;
                    }
                }
            }
            return objM38805e;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super b> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super nt.b<? super java.util.List<? extends android.net.Uri>>, ? extends java.lang.Object> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super nt.b<? super java.util.List<? extends android.net.Uri>>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public C4155h(@NotNull String key, @NotNull Context context, @NotNull Function0<Unit> launchPicker, @NotNull Function1<? super InterfaceC9557b<? super List<? extends Uri>>, ? extends Object> collectResult, @NotNull Function1<? super InterfaceC9557b<? super List<? extends Uri>>, ? extends Object> checkPendingResult) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(launchPicker, "launchPicker");
        Intrinsics.checkNotNullParameter(collectResult, "collectResult");
        Intrinsics.checkNotNullParameter(checkPendingResult, "checkPendingResult");
        this.key = key;
        this.context = context;
        this.launchPicker = launchPicker;
        this.collectResult = collectResult;
        this.checkPendingResult = checkPendingResult;
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: a */
    public boolean mo7572a(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7572a(interfaceC12257h);
    }

    @Override // p581ym.InterfaceC13222o
    /* JADX INFO: renamed from: b */
    public boolean mo7573b(@NotNull InterfaceC13222o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof C4155h) && Intrinsics.m31980c(this.key, ((C4155h) otherWorker).key);
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof C4155h) && Intrinsics.m31980c(this.key, ((C4155h) otherWorker).key);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:52:0x006b A[SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public final Object m21500h(InterfaceC9577i<? super b> interfaceC9577i, List<? extends Uri> list, InterfaceC9557b<? super Unit> interfaceC9557b) {
        String string;
        int columnIndex;
        if (list.isEmpty()) {
            Object objEmit = interfaceC9577i.emit(b.a.f17720a, interfaceC9557b);
            return objEmit == C10047c.m38805e() ? objEmit : Unit.f29331a;
        }
        ArrayList arrayList = new ArrayList();
        for (Uri uri : list) {
            Cursor cursorQuery = this.context.getContentResolver().query(uri, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    string = (!cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("_display_name")) < 0) ? null : cursorQuery.getString(columnIndex);
                    C11958c.m44629a(cursorQuery, null);
                    if (string == null) {
                        string = uri.getLastPathSegment();
                        if (string == null) {
                            string = "file";
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        C11958c.m44629a(cursorQuery, th2);
                        throw th3;
                    }
                }
            } else {
                string = uri.getLastPathSegment();
                if (string == null) {
                    string = "file";
                }
            }
            arrayList.add(new SelectedFile(uri, string));
        }
        if (arrayList.isEmpty()) {
            Object objEmit2 = interfaceC9577i.emit(b.C14153b.f17721a, interfaceC9557b);
            return objEmit2 == C10047c.m38805e() ? objEmit2 : Unit.f29331a;
        }
        Object objEmit3 = interfaceC9577i.emit(new b.Success(arrayList), interfaceC9557b);
        return objEmit3 == C10047c.m38805e() ? objEmit3 : Unit.f29331a;
    }

    @Override // p581ym.InterfaceC13222o, p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<b> run() {
        return C9579j.m37808y(C9579j.m37806w(new c(null)), C7864g1.m32644b());
    }
}
