; evp_keymgmt_has_load @ 00a66a84
00a66a84	cbz x0,0x00a66a94
00a66a88	ldr x8,[x0, #0x90]
00a66a8c	cmp x8,#0x0
00a66a90	cset w0,ne
00a66a94	ret
