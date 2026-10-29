package com.roblox.client.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import sg.C11335m0;
import sg.C11338n0;

/* JADX INFO: loaded from: classes2.dex */
public class LoadingBar extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final ArrayList<ImageView> f11734a;

    /* JADX INFO: renamed from: b */
    public boolean f11735b;

    /* JADX INFO: renamed from: com.roblox.client.components.LoadingBar$a */
    public class AnimationAnimationListenerC3167a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public ImageView f11736a;

        /* JADX INFO: renamed from: b */
        public AnimationAnimationListenerC3168b f11737b;

        /* JADX INFO: renamed from: a */
        public void m15062a(ImageView imageView) {
            this.f11736a = imageView;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f11736a.startAnimation(LoadingBar.this.m15059d(this.f11737b));
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public AnimationAnimationListenerC3167a() {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.components.LoadingBar$b */
    public class AnimationAnimationListenerC3168b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public ImageView f11739a;

        /* JADX INFO: renamed from: b */
        public AnimationAnimationListenerC3167a f11740b;

        /* JADX INFO: renamed from: a */
        public void m15063a(ImageView imageView) {
            this.f11739a = imageView;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f11739a.startAnimation(LoadingBar.this.m15058c(this.f11740b));
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public AnimationAnimationListenerC3168b() {
        }
    }

    public LoadingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11734a = new ArrayList<>(3);
        m15060e();
    }

    /* JADX INFO: renamed from: c */
    public final AlphaAnimation m15058c(Animation.AnimationListener animationListener) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(800L);
        alphaAnimation.setAnimationListener(animationListener);
        return alphaAnimation;
    }

    /* JADX INFO: renamed from: d */
    public final AlphaAnimation m15059d(Animation.AnimationListener animationListener) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(800L);
        alphaAnimation.setAnimationListener(animationListener);
        return alphaAnimation;
    }

    /* JADX INFO: renamed from: e */
    public final void m15060e() {
        View.inflate(getContext(), C11338n0.f39870q, this);
        this.f11734a.add((ImageView) findViewById(C11335m0.f39833t));
        this.f11734a.add((ImageView) findViewById(C11335m0.f39835u));
        this.f11734a.add((ImageView) findViewById(C11335m0.f39837v));
    }

    /* JADX INFO: renamed from: f */
    public final void m15061f() {
        int size = this.f11734a.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageView imageView = this.f11734a.get(i10);
            AnimationAnimationListenerC3168b animationAnimationListenerC3168b = new AnimationAnimationListenerC3168b();
            AnimationAnimationListenerC3167a animationAnimationListenerC3167a = new AnimationAnimationListenerC3167a();
            animationAnimationListenerC3167a.m15062a(imageView);
            animationAnimationListenerC3167a.f11737b = animationAnimationListenerC3168b;
            animationAnimationListenerC3168b.f11740b = animationAnimationListenerC3167a;
            animationAnimationListenerC3168b.m15063a(imageView);
            AlphaAnimation alphaAnimationM15059d = m15059d(animationAnimationListenerC3168b);
            alphaAnimationM15059d.setStartOffset(i10 * 400);
            imageView.startAnimation(alphaAnimationM15059d);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 0 || this.f11735b) {
            return;
        }
        this.f11735b = true;
        m15061f();
    }
}
