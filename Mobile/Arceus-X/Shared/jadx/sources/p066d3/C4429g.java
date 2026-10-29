package p066d3;

import android.widget.ListView;

/* JADX INFO: renamed from: d3.g */
/* JADX INFO: loaded from: classes.dex */
public class C4429g extends AbstractViewOnTouchListenerC4423a {

    /* JADX INFO: renamed from: s */
    public final ListView f18424s;

    public C4429g(ListView listView) {
        super(listView);
        this.f18424s = listView;
    }

    @Override // p066d3.AbstractViewOnTouchListenerC4423a
    /* JADX INFO: renamed from: a */
    public boolean mo22225a(int i10) {
        return false;
    }

    @Override // p066d3.AbstractViewOnTouchListenerC4423a
    /* JADX INFO: renamed from: b */
    public boolean mo22226b(int i10) {
        ListView listView = this.f18424s;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i11 = firstVisiblePosition + childCount;
        if (i10 > 0) {
            if (i11 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i10 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // p066d3.AbstractViewOnTouchListenerC4423a
    /* JADX INFO: renamed from: j */
    public void mo22232j(int i10, int i11) {
        this.f18424s.scrollListBy(i11);
    }
}
