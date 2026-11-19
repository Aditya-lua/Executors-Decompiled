; X509_get0_subject_key_id @ 00b03088
00b03088	str x19,[sp, #-0x20]!
00b0308c	stp x29,x30,[sp, #0x10]
00b03090	add x29,sp,#0x10
00b03094	mov x19,x0
00b03098	bl 0x00b01d98
00b0309c	cbz w0,0x00b030a8
00b030a0	ldr x0,[x19, #0xf8]
00b030a4	b 0x00b030ac
00b030a8	mov x0,xzr
00b030ac	ldp x29,x30,[sp, #0x10]
00b030b0	ldr x19,[sp], #0x20
00b030b4	ret
