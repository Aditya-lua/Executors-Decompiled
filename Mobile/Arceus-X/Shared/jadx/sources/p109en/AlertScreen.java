package p109en;

import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7690k0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: en.e, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0018\u001bBO\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001e\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b\u001f\u0010#¨\u0006$"}, m31665d2 = {"Len/e;", "", "", "Len/e$a;", "", "buttons", "message", Title.type, "", "cancelable", "Lkotlin/Function1;", "Len/e$b;", "", "onEvent", "<init>", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "b", "Ljava/lang/String;", "c", "e", "d", "Z", "()Z", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "wf1-container-common"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final /* data */ class AlertScreen {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final Map<a, String> buttons;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String message;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final boolean cancelable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    public final Function1<b, Unit> onEvent;

    /* JADX INFO: renamed from: en.e$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m31665d2 = {"Len/e$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "wf1-container-common"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public enum a {
        POSITIVE,
        NEGATIVE,
        NEUTRAL
    }

    /* JADX INFO: renamed from: en.e$b */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m31665d2 = {"Len/e$b;", "", "<init>", "()V", "a", "b", "Len/e$b$a;", "Len/e$b$b;", "wf1-container-common"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: en.e$b$a, reason: from toString */
        @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m31665d2 = {"Len/e$b$a;", "Len/e$b;", "Len/e$a;", "button", "<init>", "(Len/e$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Len/e$a;", "getButton", "()Len/e$a;", "wf1-container-common"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
        public static final /* data */ class ButtonClicked extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            @NotNull
            public final a button;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ButtonClicked(@NotNull a button) {
                super(null);
                Intrinsics.checkNotNullParameter(button, "button");
                this.button = button;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ButtonClicked) && this.button == ((ButtonClicked) other).button;
            }

            public int hashCode() {
                return this.button.hashCode();
            }

            @NotNull
            public String toString() {
                return "ButtonClicked(button=" + this.button + ')';
            }
        }

        /* JADX INFO: renamed from: en.e$b$b, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Len/e$b$b;", "Len/e$b;", "<init>", "()V", "wf1-container-common"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
        public static final class C14162b extends b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final C14162b f20123a = new C14162b();

            public C14162b() {
                super(null);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: en.e.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super en.e$b, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public AlertScreen(@NotNull Map<a, String> buttons, @NotNull String message, @NotNull String title, boolean z10, @NotNull Function1<? super b, Unit> onEvent) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        this.buttons = buttons;
        this.message = message;
        this.title = title;
        this.cancelable = z10;
        this.onEvent = onEvent;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Map<a, String> m24035a() {
        return this.buttons;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getCancelable() {
        return this.cancelable;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Function1<b, Unit> m24038d() {
        return this.onEvent;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m31980c(AlertScreen.class, other == null ? null : other.getClass())) {
            return false;
        }
        if (other == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.squareup.workflow1.ui.modal.AlertScreen");
        }
        AlertScreen alertScreen = (AlertScreen) other;
        return Intrinsics.m31980c(this.buttons, alertScreen.buttons) && Intrinsics.m31980c(this.message, alertScreen.message) && Intrinsics.m31980c(this.title, alertScreen.title) && this.cancelable == alertScreen.cancelable;
    }

    public int hashCode() {
        return (((((this.buttons.hashCode() * 31) + this.message.hashCode()) * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.cancelable);
    }

    @NotNull
    public String toString() {
        return "AlertScreen(buttons=" + this.buttons + ", message=" + this.message + ", title=" + this.title + ", cancelable=" + this.cancelable + ", onEvent=" + this.onEvent + ')';
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
      (wrap java.util.Map:?: TERNARY null = ((wrap int:0x0000: ARITH (r7v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap java.util.Map:0x0004: INVOKE  STATIC call: kotlin.collections.k0.j():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:7)) : (r2v0 java.util.Map))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0008: ARITH (r7v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x000f: ARITH (r7v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
      (wrap boolean:?: TERNARY null = ((wrap int:0x0014: ARITH (r7v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r5v0 boolean))
      (r6v0 kotlin.jvm.functions.Function1)
     A[MD:(java.util.Map<en.e$a, java.lang.String>, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function1<? super en.e$b, kotlin.Unit>):void (m)] (LINE:8) call: en.e.<init>(java.util.Map, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ AlertScreen(Map map, String str, String str2, boolean z10, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C7690k0.m31795j() : map, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? true : z10, function1);
    }
}
