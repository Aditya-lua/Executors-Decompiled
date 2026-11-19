; OPENSSL_LH_insert @ 00a7fed4
00a7fed4	stp x24,x23,[sp, #-0x40]!
00a7fed8	stp x22,x21,[sp, #0x10]
00a7fedc	stp x20,x19,[sp, #0x20]
00a7fee0	stp x29,x30,[sp, #0x30]
00a7fee4	ldr x8,[x0, #0x38]
00a7fee8	ldr w9,[x0, #0x18]
00a7feec	ldr x10,[x0, #0x28]
00a7fef0	mov x20,x1
00a7fef4	lsl x8,x8,#0x8
00a7fef8	udiv x8,x8,x9
00a7fefc	mov x19,x0
00a7ff00	cmp x10,x8
00a7ff04	add x29,sp,#0x30
00a7ff08	str wzr,[x0, #0x40]
00a7ff0c	b.hi 0x00a7ffd0
00a7ff10	ldp w21,w23,[x19, #0x20]
00a7ff14	ldr w22,[x19, #0x1c]
00a7ff18	add w8,w21,#0x1
00a7ff1c	cmp w8,w23
00a7ff20	b.cc 0x00a7ff68
00a7ff24	ldr x0,[x19]
00a7ff28	lsl w24,w22,#0x1
00a7ff2c	adrp x2,0x2b0000
00a7ff30	lsl x1,x24,#0x3
00a7ff34	add x2,x2,#0xdf
00a7ff38	orr w3,wzr,#0xe0
00a7ff3c	bl 0x00c356f0
00a7ff40	cbz x0,0x00a80080
00a7ff44	lsl x2,x22,#0x3
00a7ff48	str x0,[x19]
00a7ff4c	add x0,x0,x2
00a7ff50	mov w1,wzr
00a7ff54	bl 0x00c301c0
00a7ff58	ldr w9,[x19, #0x18]
00a7ff5c	mov w8,wzr
00a7ff60	str w22,[x19, #0x24]
00a7ff64	str w24,[x19, #0x1c]
00a7ff68	str w8,[x19, #0x20]
00a7ff6c	ldr x8,[x19]
00a7ff70	add w9,w9,#0x1
00a7ff74	add w11,w23,w21
00a7ff78	str w9,[x19, #0x18]
00a7ff7c	add x9,x8,x21, LSL #0x3
00a7ff80	str xzr,[x8, w11, UXTW #0x3]
00a7ff84	ldr x10,[x9]
00a7ff88	cbz x10,0x00a7ffd0
00a7ff8c	lsl x11,x11,#0x3
00a7ff90	ldr x12,[x10, #0x10]
00a7ff94	udiv x13,x12,x22
00a7ff98	msub x12,x13,x22,x12
00a7ff9c	cmp x12,x21
00a7ffa0	b.ne 0x00a7ffb4
00a7ffa4	add x9,x10,#0x8
00a7ffa8	ldr x10,[x9]
00a7ffac	cbnz x10,0x00a7ff90
00a7ffb0	b 0x00a7ffd0
00a7ffb4	ldr x12,[x10, #0x8]
00a7ffb8	str x12,[x9]
00a7ffbc	ldr x12,[x8, x11#0x0]
00a7ffc0	str x12,[x10, #0x8]
00a7ffc4	str x10,[x8, x11#0x0]
00a7ffc8	ldr x10,[x9]
00a7ffcc	cbnz x10,0x00a7ff90
00a7ffd0	ldr x8,[x19, #0x10]
00a7ffd4	mov x0,x20
00a7ffd8	blr x8
00a7ffdc	ldp w9,w8,[x19, #0x20]
00a7ffe0	mov x21,x0
00a7ffe4	udiv x10,x0,x8
00a7ffe8	msub x8,x10,x8,x0
00a7ffec	cmp x8,x9
00a7fff0	b.cs 0x00a80000
00a7fff4	ldr w8,[x19, #0x1c]
00a7fff8	udiv x9,x21,x8
00a7fffc	msub x8,x9,x8,x21
00a80000	ldr x9,[x19]
00a80004	lsl x8,x8,#0x20
00a80008	add x22,x9,x8, ASR #0x1d
00a8000c	ldr x23,[x22]
00a80010	cbz x23,0x00a80044
00a80014	ldr x24,[x19, #0x8]
00a80018	ldr x8,[x23, #0x10]
00a8001c	cmp x8,x21
00a80020	b.ne 0x00a80034
00a80024	ldr x0,[x23]
00a80028	mov x1,x20
00a8002c	blr x24
00a80030	cbz w0,0x00a80090
00a80034	ldr x8,[x23, #0x8]!
00a80038	mov x22,x23
00a8003c	mov x23,x8
00a80040	cbnz x8,0x00a80018
00a80044	adrp x1,0x2b0000
00a80048	add x1,x1,#0xdf
00a8004c	orr w0,wzr,#0x18
00a80050	orr w2,wzr,#0x78
00a80054	bl 0x00c32320
00a80058	cbz x0,0x00a80080
00a8005c	mov x8,x0
00a80060	stp x20,xzr,[x8]
00a80064	str x21,[x8, #0x10]
00a80068	str x8,[x22]
00a8006c	ldr x8,[x19, #0x38]
00a80070	mov x0,xzr
00a80074	add x8,x8,#0x1
00a80078	str x8,[x19, #0x38]
00a8007c	b 0x00a800a0
00a80080	ldr w8,[x19, #0x40]
00a80084	add w8,w8,#0x1
00a80088	str w8,[x19, #0x40]
00a8008c	b 0x00a800a0
00a80090	ldr x8,[x22]
00a80094	cbz x8,0x00a80044
00a80098	ldr x0,[x8]
00a8009c	str x20,[x8]
00a800a0	ldp x29,x30,[sp, #0x30]
00a800a4	ldp x20,x19,[sp, #0x20]
00a800a8	ldp x22,x21,[sp, #0x10]
00a800ac	ldp x24,x23,[sp], #0x40
00a800b0	ret
