; X509_NAME_entry_count @ 00b14d48
00b14d48	cbz x0,0x00b14d64
00b14d4c	stp x29,x30,[sp, #-0x10]!
00b14d50	ldr x0,[x0]
00b14d54	mov x29,sp
00b14d58	bl 0x00c325e0
00b14d5c	bic w0,w0,w0, ASR #0x1f
00b14d60	ldp x29,x30,[sp], #0x10
00b14d64	ret
