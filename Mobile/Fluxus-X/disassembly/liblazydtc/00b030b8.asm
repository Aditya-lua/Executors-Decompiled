; X509_get0_authority_key_id @ 00b030b8
00b030b8	str x19,[sp, #-0x20]!
00b030bc	stp x29,x30,[sp, #0x10]
00b030c0	add x29,sp,#0x10
00b030c4	mov x19,x0
00b030c8	bl 0x00b01d98
00b030cc	cbz w0,0x00b030e0
00b030d0	ldr x8,[x19, #0x100]
00b030d4	cbz x8,0x00b030e0
00b030d8	ldr x0,[x8]
00b030dc	b 0x00b030e4
00b030e0	mov x0,xzr
00b030e4	ldp x29,x30,[sp, #0x10]
00b030e8	ldr x19,[sp], #0x20
00b030ec	ret
