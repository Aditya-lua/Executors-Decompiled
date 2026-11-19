; BN_GF2m_mod @ 00a2ba74
00a2ba74	sub sp,sp,#0x50
00a2ba78	stp x20,x19,[sp, #0x30]
00a2ba7c	mov x20,x0
00a2ba80	mov x0,x2
00a2ba84	str x21,[sp, #0x20]
00a2ba88	stp x29,x30,[sp, #0x40]
00a2ba8c	add x29,sp,#0x40
00a2ba90	mov x21,x2
00a2ba94	mov x19,x1
00a2ba98	bl 0x00c369b0
00a2ba9c	cbz w0,0x00a2bae4
00a2baa0	bl 0x00c342a0
00a2baa4	adrp x0,0x2d9000
00a2baa8	adrp x2,0x2cf000
00a2baac	add x0,x0,#0xb49
00a2bab0	add x2,x2,#0xa57
00a2bab4	mov w1,#0x18e
00a2bab8	bl 0x00c342b0
00a2babc	orr w0,wzr,#0x3
00a2bac0	mov w1,#0x6a
00a2bac4	mov x2,xzr
00a2bac8	bl 0x00c342c0
00a2bacc	mov w0,wzr
00a2bad0	ldp x29,x30,[sp, #0x40]
00a2bad4	ldp x20,x19,[sp, #0x30]
00a2bad8	ldr x21,[sp, #0x20]
00a2badc	add sp,sp,#0x50
00a2bae0	ret
00a2bae4	ldrsw x9,[x21, #0x8]
00a2bae8	cmp w9,#0x1
00a2baec	b.lt 0x00a2bb5c
00a2baf0	ldr x10,[x21]
00a2baf4	mov w8,wzr
00a2baf8	lsl w11,w9,#0x6
00a2bafc	add x12,sp,#0x8
00a2bb00	sub x13,x9,#0x1
00a2bb04	ldr x14,[x10, x13, LSL #0x3]
00a2bb08	cbz x14,0x00a2bb40
00a2bb0c	orr x15,xzr,#-0x8000000000000000
00a2bb10	mov w16,#0xffffffff
00a2bb14	tst x15,x14
00a2bb18	b.eq 0x00a2bb30
00a2bb1c	cmp w8,#0x5
00a2bb20	b.gt 0x00a2bb2c
00a2bb24	add w17,w11,w16
00a2bb28	str w17,[x12, w8, SXTW #0x2]
00a2bb2c	add w8,w8,#0x1
00a2bb30	sub w16,w16,#0x1
00a2bb34	cmn w16,#0x41
00a2bb38	lsr x15,x15,#0x1
00a2bb3c	b.ne 0x00a2bb14
00a2bb40	cmp x9,#0x1
00a2bb44	sub w11,w11,#0x40
00a2bb48	mov x9,x13
00a2bb4c	b.gt 0x00a2bb00
00a2bb50	cmp w8,#0x5
00a2bb54	b.le 0x00a2bb60
00a2bb58	b 0x00a2bb70
00a2bb5c	mov w8,wzr
00a2bb60	add x9,sp,#0x8
00a2bb64	mov w10,#0xffffffff
00a2bb68	str w10,[x9, w8, SXTW #0x2]
00a2bb6c	add w8,w8,#0x1
00a2bb70	cbz w8,0x00a2baa0
00a2bb74	cmp w8,#0x7
00a2bb78	b.ge 0x00a2baa0
00a2bb7c	add x2,sp,#0x8
00a2bb80	mov x0,x20
00a2bb84	mov x1,x19
00a2bb88	bl 0x00a2b7b0
00a2bb8c	b 0x00a2bad0
