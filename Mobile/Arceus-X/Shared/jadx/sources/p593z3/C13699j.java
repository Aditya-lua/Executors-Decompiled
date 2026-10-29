package p593z3;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.annotation.NonNull;
import androidx.emoji2.text.C0900c;

/* JADX INFO: renamed from: z3.j */
/* JADX INFO: loaded from: classes.dex */
public final class C13699j extends AbstractC13694e {

    /* JADX INFO: renamed from: g */
    public static Paint f48086g;

    /* JADX INFO: renamed from: f */
    public TextPaint f48087f;

    public C13699j(@NonNull C13698i c13698i) {
        super(c13698i);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static Paint m50053e() {
        if (f48086g == null) {
            TextPaint textPaint = new TextPaint();
            f48086g = textPaint;
            textPaint.setColor(C0900c.m4270c().m4275d());
            f48086g.setStyle(Paint.Style.FILL);
        }
        return f48086g;
    }

    /* JADX INFO: renamed from: c */
    public final TextPaint m50054c(CharSequence charSequence, int i10, int i11, Paint paint) {
        if (!(charSequence instanceof Spanned)) {
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i10, i11, CharacterStyle.class);
        if (characterStyleArr.length != 0) {
            if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                TextPaint textPaint = this.f48087f;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                    this.f48087f = textPaint;
                }
                textPaint.set(paint);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    characterStyle.updateDrawState(textPaint);
                }
                return textPaint;
            }
        }
        if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m50055d(Canvas canvas, TextPaint textPaint, float f10, float f11, float f12, float f13) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f10, f12, f11, f13, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, @NonNull Paint paint) {
        TextPaint textPaintM50054c = m50054c(charSequence, i10, i11, paint);
        if (textPaintM50054c != null && textPaintM50054c.bgColor != 0) {
            m50055d(canvas, textPaintM50054c, f10, f10 + m50019b(), i12, i14);
        }
        Paint paint2 = textPaintM50054c;
        if (C0900c.m4270c().m4277j()) {
            canvas.drawRect(f10, i12, f10 + m50019b(), i14, m50053e());
        }
        C13698i c13698iM50018a = m50018a();
        float f11 = i13;
        if (paint2 == null) {
            paint2 = paint;
        }
        c13698iM50018a.m50040a(canvas, f10, f11, paint2);
    }
}
