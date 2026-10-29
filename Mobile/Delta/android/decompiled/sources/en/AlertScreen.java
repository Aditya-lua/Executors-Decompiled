package en;

import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: en.e, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0018\u001bBO\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001e\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b\u001f\u0010#¨\u0006$"}, d2 = {"Len/e;", "", "", "Len/e$a;", "", "buttons", "message", Title.type, "", "cancelable", "Lkotlin/Function1;", "Len/e$b;", "", "onEvent", "<init>", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "b", "Ljava/lang/String;", "c", "e", "d", "Z", "()Z", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "wf1-container-common"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class AlertScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Map<a, String> buttons;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String message;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String title;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean cancelable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Function1<b, Unit> onEvent;

    /* JADX INFO: renamed from: en.e$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Len/e$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "wf1-container-common"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum a {
        POSITIVE,
        NEGATIVE,
        NEUTRAL
    }

    /* JADX INFO: renamed from: en.e$b */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Len/e$b;", "", "<init>", "()V", "a", "b", "Len/e$b$a;", "Len/e$b$b;", "wf1-container-common"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: en.e$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Len/e$b$a;", "Len/e$b;", "Len/e$a;", "button", "<init>", "(Len/e$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Len/e$a;", "getButton", "()Len/e$a;", "wf1-container-common"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final /* data */ class ButtonClicked extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
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
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Len/e$b$b;", "Len/e$b;", "<init>", "()V", "wf1-container-common"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class C0290b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0290b f15670a = new C0290b();

            public C0290b() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

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
    public final Map<a, String> a() {
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
    public final Function1<b, Unit> d() {
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
        if (!Intrinsics.c(AlertScreen.class, other == null ? null : other.getClass())) {
            return false;
        }
        if (other == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.squareup.workflow1.ui.modal.AlertScreen");
        }
        AlertScreen alertScreen = (AlertScreen) other;
        return Intrinsics.c(this.buttons, alertScreen.buttons) && Intrinsics.c(this.message, alertScreen.message) && Intrinsics.c(this.title, alertScreen.title) && this.cancelable == alertScreen.cancelable;
    }

    public int hashCode() {
        return (((((this.buttons.hashCode() * 31) + this.message.hashCode()) * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.cancelable);
    }

    @NotNull
    public String toString() {
        return "AlertScreen(buttons=" + this.buttons + ", message=" + this.message + ", title=" + this.title + ", cancelable=" + this.cancelable + ", onEvent=" + this.onEvent + ')';
    }

    public /* synthetic */ AlertScreen(Map map, String str, String str2, boolean z10, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? k0.j() : map, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? true : z10, function1);
    }
}
