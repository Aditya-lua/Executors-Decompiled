; FUN_00ac9e68 @ 00ac9e68
00ac9e68	sub sp,sp,#0xe0
00ac9e6c	stp x24,x23,[sp, #0xa0]
00ac9e70	stp x22,x21,[sp, #0xb0]
00ac9e74	stp x29,x30,[sp, #0xd0]
00ac9e78	add x29,sp,#0xd0
00ac9e7c	mov x22,x2
00ac9e80	mov x23,x1
00ac9e84	mov x24,x0
00ac9e88	add x0,sp,#0x30
00ac9e8c	mov w2,#0x50
00ac9e90	mov w1,wzr
00ac9e94	stp x26,x25,[sp, #0x90]
00ac9e98	stp x20,x19,[sp, #0xc0]
00ac9e9c	mov x19,x6
00ac9ea0	mov x20,x5
00ac9ea4	mov w25,w4
00ac9ea8	mov w21,w3
00ac9eac	stur xzr,[x29, #-0x48]
00ac9eb0	bl 0x00c301c0
00ac9eb4	adrp x0,0x2bc000
00ac9eb8	add x0,x0,#0x3b2
00ac9ebc	add x8,sp,#0x8
00ac9ec0	sub x1,x29,#0x48
00ac9ec4	bl 0x00c36270
00ac9ec8	ldr x8,[sp, #0x28]
00ac9ecc	ldur q0,[sp, #0x18]
00ac9ed0	ldur q1,[sp, #0x8]
00ac9ed4	add x1,sp,#0x30
00ac9ed8	str x8,[sp, #0x50]
00ac9edc	stp q1,q0,[sp, #0x30]
00ac9ee0	ldp x8,x0,[x24]
00ac9ee4	ldr x8,[x8, #0xa8]
00ac9ee8	blr x8
00ac9eec	cbz w0,0x00ac9f94
00ac9ef0	ldur x8,[x29, #-0x48]
00ac9ef4	cbz x8,0x00ac9f94
00ac9ef8	cbz x22,0x00ac9fc8
00ac9efc	ldp x9,x0,[x24]
00ac9f00	cmp x8,x22
00ac9f04	csel x26,x8,x22,cc
00ac9f08	mov x1,x23
00ac9f0c	ldr x9,[x9, #0x58]
00ac9f10	mov x2,x26
00ac9f14	mov w3,w21
00ac9f18	mov w4,w25
00ac9f1c	mov x5,x20
00ac9f20	mov x6,x19
00ac9f24	blr x9
00ac9f28	cbz w0,0x00ac9f6c
00ac9f2c	subs x22,x22,x26
00ac9f30	b.eq 0x00ac9fc8
00ac9f34	ldp x8,x0,[x24]
00ac9f38	ldur x9,[x29, #-0x48]
00ac9f3c	add x23,x23,x26
00ac9f40	mov x1,x23
00ac9f44	ldr x8,[x8, #0x58]
00ac9f48	cmp x22,x9
00ac9f4c	csel x26,x9,x22,hi
00ac9f50	mov x2,x26
00ac9f54	mov w3,w21
00ac9f58	mov w4,wzr
00ac9f5c	mov x5,x20
00ac9f60	mov x6,x19
00ac9f64	blr x8
00ac9f68	cbnz w0,0x00ac9f2c
00ac9f6c	bl 0x00c342a0
00ac9f70	adrp x0,0x2ce000
00ac9f74	adrp x2,0x2a6000
00ac9f78	add x0,x0,#0x291
00ac9f7c	add x2,x2,#0x73b
00ac9f80	mov w1,#0x230
00ac9f84	bl 0x00c342b0
00ac9f88	orr w0,wzr,#0x6
00ac9f8c	mov w1,#0xd6
00ac9f90	b 0x00ac9fb8
00ac9f94	bl 0x00c342a0
00ac9f98	adrp x0,0x2ce000
00ac9f9c	adrp x2,0x2a6000
00ac9fa0	add x0,x0,#0x291
00ac9fa4	add x2,x2,#0x73b
00ac9fa8	mov w1,#0x229
00ac9fac	bl 0x00c342b0
00ac9fb0	orr w0,wzr,#0x6
00ac9fb4	mov w1,#0xd7
00ac9fb8	mov x2,xzr
00ac9fbc	bl 0x00c342c0
00ac9fc0	mov w0,wzr
00ac9fc4	b 0x00ac9fcc
00ac9fc8	mov w0,#0x1
00ac9fcc	ldp x29,x30,[sp, #0xd0]
00ac9fd0	ldp x20,x19,[sp, #0xc0]
00ac9fd4	ldp x22,x21,[sp, #0xb0]
00ac9fd8	ldp x24,x23,[sp, #0xa0]
00ac9fdc	ldp x26,x25,[sp, #0x90]
00ac9fe0	add sp,sp,#0xe0
00ac9fe4	ret
