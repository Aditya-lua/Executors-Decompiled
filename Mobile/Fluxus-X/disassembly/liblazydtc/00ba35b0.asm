; psa_validate_key_persistence @ 00ba35b0
00ba35b0	orr w8,wzr,#0xff
00ba35b4	bics wzr,w8,w0
00ba35b8	mov w8,#0xffffff79
00ba35bc	csel w0,w8,wzr,eq
00ba35c0	ret
