package com.wpy.customwidget;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0011H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/wpy/customwidget/FixScrollingFooterBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "calculateBottomPadding", "", "dependency", "onDependentViewChanged", "", "parent", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "child", "Landroid/view/View;", "customwidget_debug"})
public final class FixScrollingFooterBehavior extends com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior {
    @org.jetbrains.annotations.Nullable
    private com.google.android.material.appbar.AppBarLayout appBarLayout;
    
    @kotlin.jvm.JvmOverloads
    public FixScrollingFooterBehavior(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super();
    }
    
    @java.lang.Override
    public boolean onDependentViewChanged(@org.jetbrains.annotations.NotNull
    androidx.coordinatorlayout.widget.CoordinatorLayout parent, @org.jetbrains.annotations.NotNull
    android.view.View child, @org.jetbrains.annotations.NotNull
    android.view.View dependency) {
        return false;
    }
    
    private final int calculateBottomPadding(com.google.android.material.appbar.AppBarLayout dependency) {
        return 0;
    }
    
    @kotlin.jvm.JvmOverloads
    public FixScrollingFooterBehavior(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
}