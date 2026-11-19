; X509_PUBKEY_set0_param @ 00b1e17c
00b1e17c	str x21,[sp, #-0x30]!
00b1e180	stp x20,x19,[sp, #0x10]
00b1e184	stp x29,x30,[sp, #0x20]
00b1e188	mov x21,x0
00b1e18c	ldr x0,[x0]
00b1e190	add x29,sp,#0x20
00b1e194	mov w19,w5
00b1e198	mov x20,x4
00b1e19c	bl 0x00c37ee0
00b1e1a0	cbz w0,0x00b1e1dc
00b1e1a4	cbz x20,0x00b1e1d8
00b1e1a8	ldr x8,[x21, #0x8]
00b1e1ac	adrp x1,0x2bc000
00b1e1b0	add x1,x1,#0x79f
00b1e1b4	mov w2,#0x3f3
00b1e1b8	ldr x0,[x8, #0x8]
00b1e1bc	bl 0x00c32310
00b1e1c0	ldr x8,[x21, #0x8]
00b1e1c4	ldr x9,[x8, #0x10]
00b1e1c8	str w19,[x8]
00b1e1cc	and x9,x9,#-0x10
00b1e1d0	orr x9,x9,#0x8
00b1e1d4	stp x20,x9,[x8, #0x8]
00b1e1d8	mov w0,#0x1
00b1e1dc	ldp x29,x30,[sp, #0x20]
00b1e1e0	ldp x20,x19,[sp, #0x10]
00b1e1e4	ldr x21,[sp], #0x30
00b1e1e8	ret
