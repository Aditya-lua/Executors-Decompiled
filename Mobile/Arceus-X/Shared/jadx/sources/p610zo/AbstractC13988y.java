package p610zo;

import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zo.y */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m31665d2 = {"Lzo/y;", "", "<init>", "()V", "a", "Lzo/y$a;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class AbstractC13988y {

    /* JADX INFO: renamed from: zo.y$a */
    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lzo/y$a;", "Lzo/y;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "", "useBasicSpinner", "Lkotlin/Function0;", "", "onBack", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ZLkotlin/jvm/functions/Function0;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "b", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "Z", "c", "()Z", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC13988y {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final StepStyle styles;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final boolean useBasicSpinner;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final Function0<Unit> onBack;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@Nullable StepStyle stepStyle, boolean z10, @NotNull Function0<Unit> onBack) {
            super(null);
            Intrinsics.checkNotNullParameter(onBack, "onBack");
            this.styles = stepStyle;
            this.useBasicSpinner = z10;
            this.onBack = onBack;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Function0<Unit> m50568a() {
            return this.onBack;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final StepStyle getStyles() {
            return this.styles;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getUseBasicSpinner() {
            return this.useBasicSpinner;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: zo.y.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AbstractC13988y(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC13988y() {
    }
}
