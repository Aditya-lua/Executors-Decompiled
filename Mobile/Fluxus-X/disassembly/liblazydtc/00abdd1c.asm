; ASN1_item_d2i_fp_ex @ 00abdd1c
00abdd1c	sub sp,sp,#0x50
00abdd20	stp x24,x23,[sp, #0x10]
00abdd24	stp x22,x21,[sp, #0x20]
00abdd28	stp x20,x19,[sp, #0x30]
00abdd2c	stp x29,x30,[sp, #0x40]
00abdd30	add x29,sp,#0x40
00abdd34	mov x20,x4
00abdd38	mov x21,x3
00abdd3c	mov x22,x2
00abdd40	mov x24,x1
00abdd44	mov x23,x0
00abdd48	bl 0x00c32270
00abdd4c	bl 0x00c32240
00abdd50	cbz x0,0x00abddac
00abdd54	mov w1,#0x6a
00abdd58	mov x2,xzr
00abdd5c	mov x3,x24
00abdd60	mov x19,x0
00abdd64	bl 0x00c321a0
00abdd68	add x1,sp,#0x8
00abdd6c	mov x0,x19
00abdd70	str xzr,[sp, #0x8]
00abdd74	bl 0x00abd860
00abdd78	ldr x24,[sp, #0x8]
00abdd7c	tbnz w0,#0x1f,0x00abdde4
00abdd80	ldr x8,[x24, #0x8]
00abdd84	sxtw x2,w0
00abdd88	mov x1,sp
00abdd8c	mov x0,x22
00abdd90	mov x3,x23
00abdd94	mov x4,x21
00abdd98	mov x5,x20
00abdd9c	str x8,[sp]
00abdda0	bl 0x00c37a00
00abdda4	mov x20,x0
00abdda8	b 0x00abdde8
00abddac	bl 0x00c342a0
00abddb0	adrp x0,0x2d8000
00abddb4	adrp x2,0x2c2000
00abddb8	add x0,x0,#0x61b
00abddbc	add x2,x2,#0x2a4
00abddc0	mov w1,#0x5c
00abddc4	bl 0x00c342b0
00abddc8	mov w1,#0x7
00abddcc	mov w0,#0xd
00abddd0	movk w1,#0x8, LSL #16
00abddd4	mov x2,xzr
00abddd8	bl 0x00c342c0
00abdddc	mov x20,xzr
00abdde0	b 0x00abddf8
00abdde4	mov x20,xzr
00abdde8	mov x0,x24
00abddec	bl 0x00c35660
00abddf0	mov x0,x19
00abddf4	bl 0x00c31a40
00abddf8	mov x0,x20
00abddfc	ldp x29,x30,[sp, #0x40]
00abde00	ldp x20,x19,[sp, #0x30]
00abde04	ldp x22,x21,[sp, #0x20]
00abde08	ldp x24,x23,[sp, #0x10]
00abde0c	add sp,sp,#0x50
00abde10	ret
