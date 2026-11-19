; ssl3_read_n @ 009ca9c0
009ca9c0	stp x28,x27,[sp, #-0x60]!
009ca9c4	stp x26,x25,[sp, #0x10]
009ca9c8	stp x24,x23,[sp, #0x20]
009ca9cc	stp x22,x21,[sp, #0x30]
009ca9d0	stp x20,x19,[sp, #0x40]
009ca9d4	stp x29,x30,[sp, #0x50]
009ca9d8	add x29,sp,#0x50
009ca9dc	cbz x1,0x009caabc
009ca9e0	ldr x8,[x0, #0xc78]
009ca9e4	mov x20,x5
009ca9e8	mov w24,w4
009ca9ec	mov w22,w3
009ca9f0	mov x23,x2
009ca9f4	mov x21,x1
009ca9f8	mov x19,x0
009ca9fc	cbnz x8,0x009caa10
009caa00	mov x0,x19
009caa04	bl 0x00c36cf0
009caa08	cbz w0,0x009cab44
009caa0c	ldr x8,[x19, #0xc78]
009caa10	ldr x25,[x19, #0xc98]
009caa14	add w9,w8,#0x4
009caa18	mvn w9,w9
009caa1c	and x27,x9,#0x7
009caa20	cbz w22,0x009caac4
009caa24	ldr x1,[x19, #0x1ca8]
009caa28	cbz x1,0x009cab10
009caa2c	ldr x26,[x19, #0x1cb0]
009caa30	cmp w24,#0x1
009caa34	add x24,x8,x27
009caa38	b.ne 0x009caa5c
009caa3c	cmp x1,x24
009caa40	b.eq 0x009caa5c
009caa44	add x2,x26,x25
009caa48	mov x0,x24
009caa4c	bl 0x00c2ff60
009caa50	add x8,x26,x27
009caa54	str x24,[x19, #0x1ca8]
009caa58	str x8,[x19, #0xc90]
009caa5c	ldr x8,[x19, #0x8]
009caa60	ldr x8,[x8, #0xc0]
009caa64	ldr w8,[x8, #0x60]
009caa68	tbz w8,#0x3,0x009caa84
009caa6c	cbz w22,0x009caa78
009caa70	mov w22,wzr
009caa74	cbz x25,0x009cab48
009caa78	cmp x25,x21
009caa7c	ccmp x25,#0x0,#0x4,cc
009caa80	csel x21,x25,x21,ne
009caa84	subs x9,x25,x21
009caa88	b.cs 0x009caad0
009caa8c	ldr x9,[x19, #0xc88]
009caa90	ldr x10,[x19, #0xc90]
009caa94	sub x9,x9,x10
009caa98	cmp x21,x9
009caa9c	b.ls 0x009cab68
009caaa0	bl 0x00c342a0
009caaa4	adrp x0,0x2d3000
009caaa8	adrp x2,0x2a3000
009caaac	add x0,x0,#0x7fb
009caab0	add x2,x2,#0xd0e
009caab4	mov w1,#0x114
009caab8	b 0x009cab28
009caabc	mov w22,wzr
009caac0	b 0x009cab48
009caac4	cbz x25,0x009caaf8
009caac8	ldr x9,[x19, #0xc90]
009caacc	b 0x009cab00
009caad0	ldr x8,[x19, #0x1cb0]
009caad4	ldr x10,[x19, #0xc90]
009caad8	str x9,[x19, #0xc98]
009caadc	mov w22,#0x1
009caae0	add x8,x8,x21
009caae4	add x9,x10,x21
009caae8	str x8,[x19, #0x1cb0]
009caaec	str x9,[x19, #0xc90]
009caaf0	str x21,[x20]
009caaf4	b 0x009cab48
009caaf8	mov x9,x27
009caafc	str x27,[x19, #0xc90]
009cab00	add x1,x8,x9
009cab04	str x1,[x19, #0x1ca8]
009cab08	str xzr,[x19, #0x1cb0]
009cab0c	cbnz x1,0x009caa2c
009cab10	bl 0x00c342a0
009cab14	adrp x0,0x2d3000
009cab18	adrp x2,0x2a3000
009cab1c	add x0,x0,#0x7fb
009cab20	add x2,x2,#0xd0e
009cab24	mov w1,#0xeb
009cab28	bl 0x00c342b0
009cab2c	mov w2,#0x103
009cab30	mov w1,#0x50
009cab34	movk w2,#0xc, LSL #16
009cab38	mov x0,x19
009cab3c	mov x3,xzr
009cab40	bl 0x00c34410
009cab44	mov w22,#0xffffffff
009cab48	mov w0,w22
009cab4c	ldp x29,x30,[sp, #0x50]
009cab50	ldp x20,x19,[sp, #0x40]
009cab54	ldp x22,x21,[sp, #0x30]
009cab58	ldp x24,x23,[sp, #0x20]
009cab5c	ldp x26,x25,[sp, #0x10]
009cab60	ldp x28,x27,[sp], #0x60
009cab64	ret
009cab68	ldr w10,[x19, #0xc60]
009cab6c	and w8,w8,#0x8
009cab70	mov x27,x21
009cab74	orr w8,w10,w8
009cab78	cbz w8,0x009cab8c
009cab7c	cmp x21,x23
009cab80	csel x8,x21,x23,hi
009cab84	cmp x8,x9
009cab88	csel x27,x9,x8,hi
009cab8c	bl 0x00c30710
009cab90	mov x23,x0
009cab94	add x24,x24,x26
009cab98	orr w28,wzr,#0x3
009cab9c	str wzr,[x23]
009caba0	ldr x0,[x19, #0x10]
009caba4	cbz x0,0x009cac24
009caba8	add x1,x24,x25
009cabac	sub w2,w27,w25
009cabb0	str w28,[x19, #0x28]
009cabb4	bl 0x00c34220
009cabb8	mov w22,w0
009cabbc	cmp w0,#0x0
009cabc0	b.le 0x009cac5c
009cabc4	ldr x8,[x19, #0x8]
009cabc8	sxtw x9,w22
009cabcc	bic x9,x9,x9, ASR #0x3f
009cabd0	add x25,x9,x25
009cabd4	ldr x8,[x8, #0xc0]
009cabd8	cmp x21,x25
009cabdc	cset w9,hi
009cabe0	ldrb w8,[x8, #0x60]
009cabe4	and w8,w8,#0x8
009cabe8	tst w9,w8, LSR #0x3
009cabec	csel x21,x25,x21,ne
009cabf0	subs x8,x25,x21
009cabf4	b.cc 0x009cab9c
009cabf8	ldr x9,[x19, #0xc90]
009cabfc	str x8,[x19, #0xc98]
009cac00	ldr x8,[x19, #0x1cb0]
009cac04	mov w22,#0x1
009cac08	add x9,x9,x21
009cac0c	str w22,[x19, #0x28]
009cac10	add x8,x8,x21
009cac14	str x9,[x19, #0xc90]
009cac18	str x8,[x19, #0x1cb0]
009cac1c	str x21,[x20]
009cac20	b 0x009cab48
009cac24	bl 0x00c342a0
009cac28	adrp x0,0x2d3000
009cac2c	adrp x2,0x2a3000
009cac30	add x0,x0,#0x7fb
009cac34	add x2,x2,#0xd0e
009cac38	mov w1,#0x147
009cac3c	bl 0x00c342b0
009cac40	mov w1,#0x50
009cac44	mov w2,#0xd3
009cac48	mov x0,x19
009cac4c	mov x3,xzr
009cac50	bl 0x00c34410
009cac54	mov w22,#0xffffffff
009cac58	b 0x009cac6c
009cac5c	ldr x0,[x19, #0x10]
009cac60	mov w1,#0x8
009cac64	bl 0x00c34230
009cac68	cbz w0,0x009cac9c
009cac6c	ldrb w8,[x19, #0x9f0]
009cac70	str x25,[x19, #0xc98]
009cac74	tbz w8,#0x4,0x009cab48
009cac78	cmn x26,x25
009cac7c	b.ne 0x009cab48
009cac80	ldr x8,[x19, #0x8]
009cac84	ldr x8,[x8, #0xc0]
009cac88	ldr w8,[x8, #0x60]
009cac8c	tbnz w8,#0x3,0x009cab48
009cac90	mov x0,x19
009cac94	bl 0x00c36cd0
009cac98	b 0x009cab48
009cac9c	ldr x0,[x19, #0x10]
009caca0	mov w1,#0x2
009caca4	mov x2,xzr
009caca8	mov x3,xzr
009cacac	bl 0x00c321a0
009cacb0	cbz w0,0x009cac6c
009cacb4	ldrb w8,[x19, #0x9e8]
009cacb8	tbnz w8,#0x7,0x009cacf0
009cacbc	bl 0x00c342a0
009cacc0	adrp x0,0x2d3000
009cacc4	adrp x2,0x2a3000
009cacc8	add x0,x0,#0x7fb
009caccc	add x2,x2,#0xd0e
009cacd0	mov w1,#0x143
009cacd4	bl 0x00c342b0
009cacd8	mov w1,#0x32
009cacdc	mov w2,#0x126
009cace0	mov x0,x19
009cace4	mov x3,xzr
009cace8	bl 0x00c34410
009cacec	b 0x009cac6c
009cacf0	mov w1,#0x2
009cacf4	mov x0,x19
009cacf8	bl 0x00c35ad0
009cacfc	str wzr,[x19, #0x19c]
009cad00	b 0x009cac6c
