; SSL_set_session_secret_cb @ 009beadc
009beadc	cbz x0,0x009beaec
009beae0	str x1,[x0, #0xaf8]
009beae4	str x2,[x0, #0xb00]
009beae8	mov w0,#0x1
009beaec	ret
