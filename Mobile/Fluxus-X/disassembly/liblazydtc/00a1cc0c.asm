; FUN_00a1cc0c @ 00a1cc0c
00a1cc0c	str x23,[sp, #-0x40]!
00a1cc10	stp x22,x21,[sp, #0x10]
00a1cc14	stp x20,x19,[sp, #0x20]
00a1cc18	stp x29,x30,[sp, #0x30]
00a1cc1c	add x29,sp,#0x30
00a1cc20	mov w23,w4
00a1cc24	mov w22,w3
00a1cc28	mov x20,x2
00a1cc2c	mov w19,w1
00a1cc30	mov x21,x0
00a1cc34	bl 0x00c38e80
00a1cc38	cbz x0,0x00a1cde0
00a1cc3c	mov w8,#0x1
00a1cc40	cmp w23,#0x3
00a1cc44	lsl w10,w8,w23
00a1cc48	b.gt 0x00a1ccb8
00a1cc4c	cmp w19,#0x1
00a1cc50	b.lt 0x00a1cdd8
00a1cc54	mov x8,xzr
00a1cc58	sxtw x9,w10
00a1cc5c	eor w11,w22,#0x80000000
00a1cc60	mov w12,w19
00a1cc64	sbfiz x10,x10,#0x3,#0x20
00a1cc68	mov x14,xzr
00a1cc6c	mov x13,xzr
00a1cc70	eor w16,w14,w22
00a1cc74	ldr x15,[x20, x14, LSL #0x3]
00a1cc78	sub w16,w16,#0x1
00a1cc7c	and w16,w16,w11
00a1cc80	lsr w16,w16,#0x1f
00a1cc84	neg x16,x16
00a1cc88	add x14,x14,#0x1
00a1cc8c	and x15,x15,x16
00a1cc90	cmp x14,x9
00a1cc94	orr x13,x15,x13
00a1cc98	b.lt 0x00a1cc70
00a1cc9c	ldr x14,[x21]
00a1cca0	add x20,x20,x10
00a1cca4	str x13,[x14, x8, LSL #0x3]
00a1cca8	add x8,x8,#0x1
00a1ccac	cmp x8,x12
00a1ccb0	b.ne 0x00a1cc68
00a1ccb4	b 0x00a1cdd8
00a1ccb8	cmp w19,#0x1
00a1ccbc	b.lt 0x00a1cdd8
00a1ccc0	sub w9,w23,#0x2
00a1ccc4	mov w12,#0x1
00a1ccc8	lsl w14,w12,w9
00a1cccc	asr w12,w22,w9
00a1ccd0	eor w18,w12,#0x1
00a1ccd4	eor w0,w12,#0x2
00a1ccd8	eor w1,w12,#0x3
00a1ccdc	eor w16,w12,#0x80000000
00a1cce0	sub w17,w12,#0x1
00a1cce4	sub w18,w18,#0x1
00a1cce8	sub w0,w0,#0x1
00a1ccec	sub w1,w1,#0x1
00a1ccf0	orr w13,wzr,#0x3
00a1ccf4	sub w15,w14,#0x1
00a1ccf8	and w17,w17,w16
00a1ccfc	and w18,w18,w16
00a1cd00	and w0,w0,w16
00a1cd04	and w1,w1,w16
00a1cd08	lsl w13,w13,w9
00a1cd0c	and w12,w15,w22
00a1cd10	lsl w15,w14,#0x1
00a1cd14	lsr w17,w17,#0x1f
00a1cd18	lsr w18,w18,#0x1f
00a1cd1c	lsr w0,w0,#0x1f
00a1cd20	lsr w1,w1,#0x1f
00a1cd24	mov x8,xzr
00a1cd28	mov w11,w19
00a1cd2c	sxtw x13,w13
00a1cd30	sxtw x14,w14
00a1cd34	sxtw x15,w15
00a1cd38	eor w16,w12,#0x80000000
00a1cd3c	neg x17,x17
00a1cd40	neg x18,x18
00a1cd44	neg x0,x0
00a1cd48	neg x1,x1
00a1cd4c	sbfiz x10,x10,#0x3,#0x20
00a1cd50	cmp w9,#0x1f
00a1cd54	mov x2,xzr
00a1cd58	b.eq 0x00a1cdc0
00a1cd5c	mov x3,xzr
00a1cd60	mov x2,xzr
00a1cd64	mov x4,x20
00a1cd68	ldr x5,[x4]
00a1cd6c	ldr x6,[x4, x14, LSL #0x3]
00a1cd70	ldr x7,[x4, x15, LSL #0x3]
00a1cd74	ldr x22,[x4, x13, LSL #0x3]
00a1cd78	and x5,x5,x17
00a1cd7c	and x6,x6,x18
00a1cd80	orr x5,x6,x5
00a1cd84	and x6,x7,x0
00a1cd88	orr x5,x5,x6
00a1cd8c	and x6,x22,x1
00a1cd90	orr x5,x5,x6
00a1cd94	eor w6,w12,w3
00a1cd98	sub w6,w6,#0x1
00a1cd9c	and w6,w6,w16
00a1cda0	lsr w6,w6,#0x1f
00a1cda4	neg x6,x6
00a1cda8	add x3,x3,#0x1
00a1cdac	and x5,x5,x6
00a1cdb0	cmp x3,x14
00a1cdb4	orr x2,x5,x2
00a1cdb8	add x4,x4,#0x8
00a1cdbc	b.lt 0x00a1cd68
00a1cdc0	ldr x3,[x21]
00a1cdc4	add x20,x20,x10
00a1cdc8	str x2,[x3, x8, LSL #0x3]
00a1cdcc	add x8,x8,#0x1
00a1cdd0	cmp x8,x11
00a1cdd4	b.ne 0x00a1cd50
00a1cdd8	mov w0,#0x1
00a1cddc	str w19,[x21, #0x8]
00a1cde0	ldp x29,x30,[sp, #0x30]
00a1cde4	ldp x20,x19,[sp, #0x20]
00a1cde8	ldp x22,x21,[sp, #0x10]
00a1cdec	ldr x23,[sp], #0x40
00a1cdf0	ret
