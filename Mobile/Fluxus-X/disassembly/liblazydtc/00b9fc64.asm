; mbedtls_psa_pake_setup @ 00b9fc64
00b9fc64	sub sp,sp,#0xb0
00b9fc68	str x27,[sp, #0x50]
00b9fc6c	stp x26,x25,[sp, #0x60]
00b9fc70	stp x24,x23,[sp, #0x70]
00b9fc74	stp x22,x21,[sp, #0x80]
00b9fc78	stp x20,x19,[sp, #0x90]
00b9fc7c	stp x29,x30,[sp, #0xa0]
00b9fc80	add x29,sp,#0xa0
00b9fc84	mrs x25,tpidr_el0
00b9fc88	ldr x8,[x25, #0x28]
00b9fc8c	mov x23,x1
00b9fc90	mov x19,x0
00b9fc94	add x1,sp,#0x30
00b9fc98	mov x0,x23
00b9fc9c	str x8,[sp, #0x48]
00b9fca0	stp xzr,xzr,[sp, #0x38]
00b9fca4	stp xzr,xzr,[sp, #0x28]
00b9fca8	stp xzr,xzr,[sp, #0x18]
00b9fcac	str xzr,[sp, #0x8]
00b9fcb0	str wzr,[sp, #0x10]
00b9fcb4	bl 0x00c42c30
00b9fcb8	mov w22,w0
00b9fcbc	cbnz w0,0x00b9fed0
00b9fcc0	add x1,sp,#0x40
00b9fcc4	mov x0,x23
00b9fcc8	bl 0x00c42c70
00b9fccc	mov w22,w0
00b9fcd0	cbnz w0,0x00b9fed0
00b9fcd4	add x1,sp,#0x38
00b9fcd8	mov x0,x23
00b9fcdc	bl 0x00c42c50
00b9fce0	mov w22,w0
00b9fce4	cbnz w0,0x00b9fed0
00b9fce8	add x1,sp,#0x8
00b9fcec	mov x0,x23
00b9fcf0	bl 0x00c42c10
00b9fcf4	mov w22,w0
00b9fcf8	cbnz w0,0x00b9fed0
00b9fcfc	ldr x22,[sp, #0x30]
00b9fd00	mov w26,#0x100
00b9fd04	mov w0,#0x1
00b9fd08	movk w26,#0xa00, LSL #16
00b9fd0c	mov x1,x22
00b9fd10	bl 0x00c30a30
00b9fd14	mov x27,x19
00b9fd18	str x0,[x27, #0x8]!
00b9fd1c	cbz x0,0x00b9fe78
00b9fd20	ldr x1,[sp, #0x40]
00b9fd24	mov x24,x0
00b9fd28	mov w0,#0x1
00b9fd2c	bl 0x00c30a30
00b9fd30	mov x20,x0
00b9fd34	cbz x0,0x00b9fe7c
00b9fd38	ldr x1,[sp, #0x38]
00b9fd3c	mov w0,#0x1
00b9fd40	bl 0x00c30a30
00b9fd44	mov x21,x0
00b9fd48	cbz x0,0x00b9fe80
00b9fd4c	add x3,sp,#0x18
00b9fd50	mov x0,x23
00b9fd54	mov x1,x24
00b9fd58	mov x2,x22
00b9fd5c	bl 0x00c42c20
00b9fd60	mov w22,w0
00b9fd64	cbnz w0,0x00b9fe84
00b9fd68	ldr x2,[sp, #0x40]
00b9fd6c	add x3,sp,#0x28
00b9fd70	mov x0,x23
00b9fd74	mov x1,x20
00b9fd78	bl 0x00c42c60
00b9fd7c	mov w22,w0
00b9fd80	cbnz w0,0x00b9fe84
00b9fd84	ldr x2,[sp, #0x38]
00b9fd88	add x3,sp,#0x20
00b9fd8c	mov x0,x23
00b9fd90	mov x1,x21
00b9fd94	bl 0x00c42c40
00b9fd98	mov w22,w0
00b9fd9c	cbnz w0,0x00b9fe84
00b9fda0	ldr x8,[sp, #0x18]
00b9fda4	str x8,[x19, #0x10]
00b9fda8	ldr w8,[sp, #0x8]
00b9fdac	cmp w8,w26
00b9fdb0	str w8,[x19]
00b9fdb4	b.ne 0x00b9fe70
00b9fdb8	ldrb w8,[sp, #0xc]
00b9fdbc	cmp w8,#0x1
00b9fdc0	b.ne 0x00b9fe70
00b9fdc4	ldrb w8,[sp, #0xd]
00b9fdc8	cmp w8,#0x12
00b9fdcc	b.ne 0x00b9fe70
00b9fdd0	ldrh w8,[sp, #0xe]
00b9fdd4	mov w22,#0xffffff7a
00b9fdd8	cmp w8,#0x100
00b9fddc	b.ne 0x00b9fe84
00b9fde0	ldr w8,[sp, #0x10]
00b9fde4	mov w9,#0x9
00b9fde8	movk w9,#0x200, LSL #16
00b9fdec	cmp w8,w9
00b9fdf0	b.ne 0x00b9fe84
00b9fdf4	ldr x8,[sp, #0x28]
00b9fdf8	mov w22,#0xffffff7a
00b9fdfc	cmp x8,#0x6
00b9fe00	b.ne 0x00b9fe84
00b9fe04	ldr x8,[sp, #0x20]
00b9fe08	cmp x8,#0x6
00b9fe0c	b.ne 0x00b9fe84
00b9fe10	adrp x1,0x787000
00b9fe14	add x1,x1,#0xabe
00b9fe18	orr w2,wzr,#0x6
00b9fe1c	mov x0,x20
00b9fe20	bl 0x00c300b0
00b9fe24	cbnz w0,0x00b9fe40
00b9fe28	adrp x1,0x787000
00b9fe2c	add x1,x1,#0xac4
00b9fe30	orr w2,wzr,#0x6
00b9fe34	mov x0,x21
00b9fe38	bl 0x00c300b0
00b9fe3c	cbz w0,0x00b9ff04
00b9fe40	adrp x1,0x787000
00b9fe44	add x1,x1,#0xac4
00b9fe48	orr w2,wzr,#0x6
00b9fe4c	mov x0,x20
00b9fe50	bl 0x00c300b0
00b9fe54	cbnz w0,0x00b9fe70
00b9fe58	adrp x1,0x787000
00b9fe5c	add x1,x1,#0xabe
00b9fe60	orr w2,wzr,#0x6
00b9fe64	mov x0,x21
00b9fe68	bl 0x00c300b0
00b9fe6c	cbz w0,0x00b9ff0c
00b9fe70	mov w22,#0xffffff7a
00b9fe74	b 0x00b9fe84
00b9fe78	mov x20,xzr
00b9fe7c	mov x21,xzr
00b9fe80	mov w22,#0xffffff73
00b9fe84	mov x0,x20
00b9fe88	bl 0x00c30960
00b9fe8c	mov x0,x21
00b9fe90	bl 0x00c30960
00b9fe94	ldp x0,x1,[x19, #0x8]
00b9fe98	bl 0x00c42230
00b9fe9c	stp xzr,xzr,[x27]
00b9fea0	ldr w8,[x19]
00b9fea4	cmp w8,w26
00b9fea8	b.ne 0x00b9fecc
00b9feac	mov w8,#0x2
00b9feb0	add x0,x19,#0x1c
00b9feb4	mov w1,#0x150
00b9feb8	str w8,[x19, #0x18]
00b9febc	bl 0x00c42220
00b9fec0	add x0,x19,#0x180
00b9fec4	stp xzr,xzr,[x19, #0x170]
00b9fec8	bl 0x00c42590
00b9fecc	str wzr,[x19]
00b9fed0	ldr x8,[x25, #0x28]
00b9fed4	ldr x9,[sp, #0x48]
00b9fed8	cmp x8,x9
00b9fedc	b.ne 0x00b9fffc
00b9fee0	mov w0,w22
00b9fee4	ldp x29,x30,[sp, #0xa0]
00b9fee8	ldp x20,x19,[sp, #0x90]
00b9feec	ldp x22,x21,[sp, #0x80]
00b9fef0	ldp x24,x23,[sp, #0x70]
00b9fef4	ldp x26,x25,[sp, #0x60]
00b9fef8	ldr x27,[sp, #0x50]
00b9fefc	add sp,sp,#0xb0
00b9ff00	ret
00b9ff04	str wzr,[x19, #0x18]
00b9ff08	b 0x00b9ff14
00b9ff0c	mov w8,#0x1
00b9ff10	str w8,[x19, #0x18]
00b9ff14	add x22,x19,#0x180
00b9ff18	mov x0,x22
00b9ff1c	stp xzr,xzr,[x19, #0x170]
00b9ff20	bl 0x00c425a0
00b9ff24	ldr w1,[x19, #0x18]
00b9ff28	ldp x4,x5,[x19, #0x8]
00b9ff2c	mov w2,#0x9
00b9ff30	orr w3,wzr,#0x3
00b9ff34	mov x0,x22
00b9ff38	bl 0x00c425d0
00b9ff3c	ldp x8,x1,[x19, #0x8]
00b9ff40	mov w23,w0
00b9ff44	mov x0,x8
00b9ff48	bl 0x00c42220
00b9ff4c	mov w8,#0xffffb37f
00b9ff50	cmp w23,w8
00b9ff54	mov w22,#0xffffff76
00b9ff58	b.le 0x00b9ff90
00b9ff5c	cmn w23,#0x9
00b9ff60	b.le 0x00b9ffb8
00b9ff64	cmn w23,#0x8
00b9ff68	b.eq 0x00b9fe84
00b9ff6c	cmn w23,#0x4
00b9ff70	b.eq 0x00b9ffec
00b9ff74	cbnz w23,0x00b9fff4
00b9ff78	mov x0,x20
00b9ff7c	bl 0x00c30960
00b9ff80	mov x0,x21
00b9ff84	bl 0x00c30960
00b9ff88	mov w22,wzr
00b9ff8c	b 0x00b9fed0
00b9ff90	mov w8,#0xffffb0ff
00b9ff94	cmp w23,w8
00b9ff98	b.gt 0x00b9ffd4
00b9ff9c	mov w8,#0xffffaf80
00b9ffa0	cmp w23,w8
00b9ffa4	b.eq 0x00b9fe70
00b9ffa8	mov w8,#0xffffb080
00b9ffac	cmp w23,w8
00b9ffb0	b.eq 0x00b9ffec
00b9ffb4	b 0x00b9fff4
00b9ffb8	mov w8,#0xffffb380
00b9ffbc	cmp w23,w8
00b9ffc0	b.eq 0x00b9ffec
00b9ffc4	cmn w23,#0x6e
00b9ffc8	b.ne 0x00b9fff4
00b9ffcc	mov w22,#0xffffff69
00b9ffd0	b 0x00b9fe84
00b9ffd4	mov w8,#0xffffb100
00b9ffd8	cmp w23,w8
00b9ffdc	b.eq 0x00b9fe84
00b9ffe0	mov w8,#0xffffb200
00b9ffe4	cmp w23,w8
00b9ffe8	b.ne 0x00b9fff4
00b9ffec	mov w22,#0xffffff67
00b9fff0	b 0x00b9fe84
00b9fff4	mov w22,#0xffffff7c
00b9fff8	b 0x00b9fe84
00b9fffc	bl 0x00c2fec0
