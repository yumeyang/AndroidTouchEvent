# AndroidTouchEvent
安卓 View ViewGroup事件分发分析

父 dispatchTouchEvent
        ↓
父 onInterceptTouchEvent
        ↓
子 dispatchTouchEvent
        ↓
子 onInterceptTouchEvent
        ↓
子 onTouchEvent
        ↓
父 onTouchEvent


