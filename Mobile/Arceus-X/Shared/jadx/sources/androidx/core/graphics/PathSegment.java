package androidx.core.graphics;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: classes4.dex */
public final class PathSegment {
    private final PointF mEnd;
    private final float mEndFraction;
    private final PointF mStart;
    private final float mStartFraction;

    public PathSegment(@NonNull PointF start, float startFraction, @NonNull PointF end, float endFraction) {
        this.mStart = (PointF) Preconditions.checkNotNull(start, "start == null");
        this.mStartFraction = startFraction;
        this.mEnd = (PointF) Preconditions.checkNotNull(end, "end == null");
        this.mEndFraction = endFraction;
    }

    @NonNull
    public PointF getStart() {
        return this.mStart;
    }

    public float getStartFraction() {
        return this.mStartFraction;
    }

    @NonNull
    public PointF getEnd() {
        return this.mEnd;
    }

    public float getEndFraction() {
        return this.mEndFraction;
    }

    public boolean equals(Object o8) {
        if (this == o8) {
            return true;
        }
        if (!(o8 instanceof PathSegment)) {
            return false;
        }
        PathSegment that = (PathSegment) o8;
        return Float.compare(this.mStartFraction, that.mStartFraction) == 0 && Float.compare(this.mEndFraction, that.mEndFraction) == 0 && this.mStart.equals(that.mStart) && this.mEnd.equals(that.mEnd);
    }

    public int hashCode() {
        int result = this.mStart.hashCode();
        int i10 = result * 31;
        float f10 = this.mStartFraction;
        int result2 = i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0);
        int result3 = ((result2 * 31) + this.mEnd.hashCode()) * 31;
        float f11 = this.mEndFraction;
        return result3 + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }

    public String toString() {
        return "PathSegment{start=" + this.mStart + ", startFraction=" + this.mStartFraction + ", end=" + this.mEnd + ", endFraction=" + this.mEndFraction + '}';
    }
}
