; OSSL_PARAM_modified @ 00a9dfd4
00a9dfd4	cbz x0,0x00a9dfe4
00a9dfd8	ldr x8,[x0, #0x20]
00a9dfdc	cmn x8,#0x1
00a9dfe0	cset w0,ne
00a9dfe4	ret
