; FUN_0092ea6c @ 0092ea6c
0092ea6c	sub sp,sp,#0xf0
0092ea70	stp x28,x27,[sp, #0x90]
0092ea74	stp x26,x25,[sp, #0xa0]
0092ea78	stp x24,x23,[sp, #0xb0]
0092ea7c	stp x22,x21,[sp, #0xc0]
0092ea80	stp x20,x19,[sp, #0xd0]
0092ea84	stp x29,x30,[sp, #0xe0]
0092ea88	add x29,sp,#0xe0
0092ea8c	mrs x8,tpidr_el0
0092ea90	str x8,[sp, #0x10]
0092ea94	ldr x8,[x8, #0x28]
0092ea98	mov x20,x4
0092ea9c	mov w21,w3
0092eaa0	mov w22,w2
0092eaa4	mov w23,w1
0092eaa8	mov x19,x0
0092eaac	stur x8,[x29, #-0x58]
0092eab0	bl 0x00941cb8
0092eab4	stp x0,x1,[sp, #0x20]
0092eab8	tbz w23,#0x0,0x0092eb2c
0092eabc	mov x0,x19
0092eac0	mov x1,x20
0092eac4	bl 0x00c31ae0
0092eac8	mov w21,w0
0092eacc	cmp w0,#0x1
0092ead0	b.eq 0x0092ee64
0092ead4	cbnz w21,0x0092ee64
0092ead8	ldr x20,[x19, #0x8]
0092eadc	cbz x20,0x0092ee64
0092eae0	add x1,sp,#0x38
0092eae4	mov x0,x20
0092eae8	bl 0x0092bcf8
0092eaec	add x22,x20,#0x90
0092eaf0	add x2,sp,#0x38
0092eaf4	mov x0,x19
0092eaf8	mov x1,x20
0092eafc	mov x3,x22
0092eb00	bl 0x0092dfc0
0092eb04	mov w21,w0
0092eb08	cbnz w0,0x0092ee64
0092eb0c	ldur q0,[sp, #0x48]
0092eb10	str q0,[x22, #0x10]
0092eb14	ldur q0,[sp, #0x38]
0092eb18	str q0,[x22]
0092eb1c	cbnz w21,0x0092ee9c
0092eb20	ldr x20,[x20, #0x10]
0092eb24	cbnz x20,0x0092eae0
0092eb28	b 0x0092ee64
0092eb2c	cmn w22,#0x1
0092eb30	str x20,[sp, #0x8]
0092eb34	b.eq 0x0092ebc8
0092eb38	add x0,x19,#0xf8
0092eb3c	add x1,sp,#0x38
0092eb40	mov w2,#0x4
0092eb44	str w22,[sp, #0x38]
0092eb48	bl 0x009167a8
0092eb4c	cbz x0,0x0092ebd8
0092eb50	add x1,sp,#0x38
0092eb54	bl 0x00916a74
0092eb58	add x0,sp,#0x38
0092eb5c	bl 0x00916a80
0092eb60	mov w22,wzr
0092eb64	cbz x0,0x0092ebbc
0092eb68	mov w23,#0x131b
0092eb6c	ldr x0,[x0, #0x18]
0092eb70	ldr x8,[x19, #0x1d8]
0092eb74	cmp x0,x8
0092eb78	b.eq 0x0092ebac
0092eb7c	ldr x8,[x0, #0x20]
0092eb80	cbz x8,0x0092eb9c
0092eb84	ldr x8,[x8, #0x3a8]
0092eb88	ldrb w8,[x8, #0x94]
0092eb8c	tbnz w8,#0x3,0x0092eb9c
0092eb90	ldrb w8,[x0, x23]
0092eb94	orr w8,w8,w21
0092eb98	strb w8,[x0, x23]
0092eb9c	mov w2,#0x8
0092eba0	mov x1,xzr
0092eba4	bl 0x0092aff8
0092eba8	b 0x0092ebb0
0092ebac	mov w22,#0x1
0092ebb0	add x0,sp,#0x38
0092ebb4	bl 0x00916a80
0092ebb8	cbnz x0,0x0092eb6c
0092ebbc	bl 0x00941cb8
0092ebc0	stp x0,x1,[sp, #0x20]
0092ebc4	b 0x0092ebec
0092ebc8	movi v0.2D,#0x0
0092ebcc	str wzr,[sp, #0x1c]
0092ebd0	str q0,[x19, #0x210]
0092ebd4	b 0x0092ebf4
0092ebd8	mov x0,x19
0092ebdc	mov w1,w22
0092ebe0	mov w2,w21
0092ebe4	bl 0x0091107c
0092ebe8	mov w22,wzr
0092ebec	and w8,w22,#0x1
0092ebf0	str w8,[sp, #0x1c]
0092ebf4	mov x22,xzr
0092ebf8	mov w21,wzr
0092ebfc	movi v0.2D,#0x0
0092ec00	str xzr,[sp, #0x58]
0092ec04	stur q0,[sp, #0x48]
0092ec08	stur q0,[sp, #0x38]
0092ec0c	ldr x8,[x19, #0x1d8]
0092ec10	cmp x22,x8
0092ec14	b.eq 0x0092ece8
0092ec18	cbz x22,0x0092ecf0
0092ec1c	add x20,x22,#0xa82
0092ec20	ldr x8,[x20]
0092ec24	ldrb w9,[sp, #0x58]
0092ec28	ubfx x10,x8,#0x1f,#0x1
0092ec2c	cmp w10,w9
0092ec30	b.eq 0x0092ec8c
0092ec34	cbnz w9,0x0092ec4c
0092ec38	mov w0,#0xd
0092ec3c	add x1,sp,#0x38
0092ec40	mov x2,xzr
0092ec44	bl 0x00c31b20
0092ec48	ldr x8,[x20]
0092ec4c	ubfx x9,x8,#0x1f,#0x1
0092ec50	strb w9,[sp, #0x58]
0092ec54	tbnz w8,#0x1f,0x0092ec8c
0092ec58	mov w0,#0xd
0092ec5c	add x2,sp,#0x38
0092ec60	mov x1,xzr
0092ec64	bl 0x00c31b20
0092ec68	ldur q0,[sp, #0x38]
0092ec6c	ldur q1,[sp, #0x48]
0092ec70	mov w8,#0x1
0092ec74	mov w0,#0xd
0092ec78	add x1,sp,#0x60
0092ec7c	mov x2,xzr
0092ec80	stp q0,q1,[sp, #0x60]
0092ec84	str x8,[sp, #0x68]
0092ec88	bl 0x00c31b20
0092ec8c	add x1,sp,#0x20
0092ec90	mov x0,x19
0092ec94	mov x2,x22
0092ec98	bl 0x0092c7cc
0092ec9c	mov w21,w0
0092eca0	cmp w0,#0x0
0092eca4	b.gt 0x0092ecf0
0092eca8	add x1,sp,#0x60
0092ecac	mov x0,x22
0092ecb0	bl 0x0092bcf8
0092ecb4	add x23,x22,#0x90
0092ecb8	add x2,sp,#0x60
0092ecbc	mov x0,x19
0092ecc0	mov x1,x22
0092ecc4	mov x3,x23
0092ecc8	bl 0x0092dfc0
0092eccc	mov w21,w0
0092ecd0	cbnz w0,0x0092eda0
0092ecd4	ldr q0,[sp, #0x70]
0092ecd8	str q0,[x23, #0x10]
0092ecdc	ldr q0,[sp, #0x60]
0092ece0	str q0,[x23]
0092ece4	b 0x0092ecf0
0092ece8	mov w8,#0x1
0092ecec	str w8,[sp, #0x1c]
0092ecf0	ldr x2,[x19, #0xd0]
0092ecf4	ldp x0,x1,[sp, #0x20]
0092ecf8	add x3,sp,#0x30
0092ecfc	bl 0x0094152c
0092ed00	str x0,[x19, #0xd0]
0092ed04	ldr x8,[sp, #0x30]
0092ed08	cbz x8,0x0092eda0
0092ed0c	ldr x22,[x8, #0x30]
0092ed10	ldr x28,[x22, #0xe10]
0092ed14	cbz x28,0x0092ed90
0092ed18	ldp x23,x25,[sp, #0x20]
0092ed1c	add x20,x22,#0xdc8
0092ed20	add x26,x22,#0xe10
0092ed24	ldr x27,[x28]
0092ed28	ldr x24,[x28, #0x10]
0092ed2c	mov x2,x23
0092ed30	mov x3,x25
0092ed34	ldp x0,x1,[x27, #0x18]
0092ed38	bl 0x00941e38
0092ed3c	cmp x0,#0x0
0092ed40	b.gt 0x0092ed5c
0092ed44	mov x0,x26
0092ed48	mov x1,x28
0092ed4c	mov x2,xzr
0092ed50	bl 0x00925d80
0092ed54	mov x28,x24
0092ed58	cbnz x24,0x0092ed24
0092ed5c	ldr x8,[x26]
0092ed60	cbz x8,0x0092ed90
0092ed64	ldur q0,[x27, #0x18]
0092ed68	add x3,x22,#0xdd8
0092ed6c	str q0,[x20]
0092ed70	ldr x2,[x19, #0xd0]
0092ed74	ldr x0,[x22, #0xdc8]
0092ed78	ldr x1,[x22, #0xdd0]
0092ed7c	bl 0x00941454
0092ed80	str x0,[x19, #0xd0]
0092ed84	ldr x8,[sp, #0x30]
0092ed88	cbnz x8,0x0092ec0c
0092ed8c	b 0x0092eda0
0092ed90	str xzr,[x22, #0xdc8]
0092ed94	str wzr,[x22, #0xdd0]
0092ed98	ldr x8,[sp, #0x30]
0092ed9c	cbnz x8,0x0092ec0c
0092eda0	ldr w8,[sp, #0x1c]
0092eda4	tbnz w8,#0x0,0x0092edbc
0092eda8	ldrb w8,[sp, #0x58]
0092edac	cbz w8,0x0092ee40
0092edb0	ldr x8,[sp, #0x8]
0092edb4	cbnz x8,0x0092ee58
0092edb8	b 0x0092ee64
0092edbc	ldr x8,[x19, #0x1d8]
0092edc0	ldrb w9,[sp, #0x58]
0092edc4	add x20,x8,#0xa82
0092edc8	ldr x8,[x20]
0092edcc	ubfx x10,x8,#0x1f,#0x1
0092edd0	cmp w10,w9
0092edd4	b.eq 0x0092ee30
0092edd8	cbnz w9,0x0092edf0
0092eddc	mov w0,#0xd
0092ede0	add x1,sp,#0x38
0092ede4	mov x2,xzr
0092ede8	bl 0x00c31b20
0092edec	ldr x8,[x20]
0092edf0	ubfx x9,x8,#0x1f,#0x1
0092edf4	strb w9,[sp, #0x58]
0092edf8	tbnz w8,#0x1f,0x0092ee30
0092edfc	mov w0,#0xd
0092ee00	add x2,sp,#0x38
0092ee04	mov x1,xzr
0092ee08	bl 0x00c31b20
0092ee0c	ldur q0,[sp, #0x38]
0092ee10	ldur q1,[sp, #0x48]
0092ee14	mov w8,#0x1
0092ee18	mov w0,#0xd
0092ee1c	add x1,sp,#0x60
0092ee20	mov x2,xzr
0092ee24	stp q0,q1,[sp, #0x60]
0092ee28	str x8,[sp, #0x68]
0092ee2c	bl 0x00c31b20
0092ee30	mov x0,x19
0092ee34	bl 0x00910f38
0092ee38	ldrb w8,[sp, #0x58]
0092ee3c	cbnz w8,0x0092edb0
0092ee40	mov w0,#0xd
0092ee44	add x1,sp,#0x38
0092ee48	mov x2,xzr
0092ee4c	bl 0x00c31b20
0092ee50	ldr x8,[sp, #0x8]
0092ee54	cbz x8,0x0092ee64
0092ee58	mov x9,x8
0092ee5c	ldr w8,[x19, #0x1c]
0092ee60	str w8,[x9]
0092ee64	ldr x8,[sp, #0x10]
0092ee68	ldr x8,[x8, #0x28]
0092ee6c	ldur x9,[x29, #-0x58]
0092ee70	cmp x8,x9
0092ee74	b.ne 0x0092eea4
0092ee78	mov w0,w21
0092ee7c	ldp x29,x30,[sp, #0xe0]
0092ee80	ldp x20,x19,[sp, #0xd0]
0092ee84	ldp x22,x21,[sp, #0xc0]
0092ee88	ldp x24,x23,[sp, #0xb0]
0092ee8c	ldp x26,x25,[sp, #0xa0]
0092ee90	ldp x28,x27,[sp, #0x90]
0092ee94	add sp,sp,#0xf0
0092ee98	ret
0092ee9c	mov w21,wzr
0092eea0	b 0x0092ee64
0092eea4	bl 0x00c2fec0
