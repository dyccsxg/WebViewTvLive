package com.vasthread.webviewtv.adapter

import android.view.KeyEvent
import com.vasthread.webviewtv.widget.WebpageAdapterWebView

class M1905WebpageAdapter : CommonWebpageAdapter() {
    override fun isAdaptedUrl(url: String) = url.contains("www.1905.com")

    override fun userAgent() = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:135.0) Gecko/20100101 Firefox/135.0"

    override suspend fun enterFullscreen(webView: WebpageAdapterWebView) {
         enterFullscreenByPressKey(webView, KeyEvent.KEYCODE_F)
    }
}