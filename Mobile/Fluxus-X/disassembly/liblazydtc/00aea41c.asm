; OSSL_STORE_INFO_new_PKEY @ 00aea41c
00aea41c	str x19,[sp, #-0x20]!
00aea420	adrp x1,0x2c2000
00aea424	mov x19,x0
00aea428	add x1,x1,#0x3bd
00aea42c	orr w0,wzr,#0x18
00aea430	mov w2,#0x220
00aea434	stp x29,x30,[sp, #0x10]
00aea438	add x29,sp,#0x10
00aea43c	bl 0x00c34250
00aea440	cbz x0,0x00aea454
00aea444	mov w8,#0x4
00aea448	str w8,[x0]
00aea44c	str x19,[x0, #0x8]
00aea450	b 0x00aea488
00aea454	bl 0x00c342a0
00aea458	adrp x0,0x2c2000
00aea45c	adrp x2,0x2ba000
00aea460	add x0,x0,#0x3bd
00aea464	add x2,x2,#0x728
00aea468	mov w1,#0x25b
00aea46c	bl 0x00c342b0
00aea470	mov w1,#0x100
00aea474	mov w0,#0x2c
00aea478	movk w1,#0xc, LSL #16
00aea47c	mov x2,xzr
00aea480	bl 0x00c342c0
00aea484	mov x0,xzr
00aea488	ldp x29,x30,[sp, #0x10]
00aea48c	ldr x19,[sp], #0x20
00aea490	ret
