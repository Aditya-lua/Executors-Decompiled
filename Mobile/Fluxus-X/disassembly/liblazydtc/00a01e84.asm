; BN_bin2bn @ 00a01e84
00a01e84	str x25,[sp, #-0x50]!
00a01e88	stp x22,x21,[sp, #0x20]
00a01e8c	stp x20,x19,[sp, #0x30]
00a01e90	mov w20,w1
00a01e94	mov x21,x0
00a01e98	stp x24,x23,[sp, #0x10]
00a01e9c	stp x29,x30,[sp, #0x40]
00a01ea0	add x29,sp,#0x40
00a01ea4	cbz x2,0x00a01f88
00a01ea8	mov x19,x2
00a01eac	mov x23,xzr
00a01eb0	mov x22,xzr
00a01eb4	cmp w20,#0x1
00a01eb8	b.lt 0x00a01ed0
00a01ebc	ldrb w8,[x21]
00a01ec0	cbnz w8,0x00a01ed4
00a01ec4	subs w20,w20,#0x1
00a01ec8	add x21,x21,#0x1
00a01ecc	b.gt 0x00a01ebc
00a01ed0	cbz w20,0x00a01fc0
00a01ed4	ldr w8,[x19, #0xc]
00a01ed8	sub w25,w20,#0x1
00a01edc	lsr w9,w25,#0x3
00a01ee0	add w24,w9,#0x1
00a01ee4	cmp w8,w9
00a01ee8	b.gt 0x00a01efc
00a01eec	mov x0,x19
00a01ef0	mov w1,w24
00a01ef4	bl 0x00a01a04
00a01ef8	cbz x0,0x00a01ffc
00a01efc	str w24,[x19, #0x8]
00a01f00	str wzr,[x19, #0x10]
00a01f04	cbz w20,0x00a01f50
00a01f08	mov x10,xzr
00a01f0c	and w8,w25,#0x7
00a01f10	mov w9,w24
00a01f14	ldrb w11,[x21], #0x1
00a01f18	sub w20,w20,#0x1
00a01f1c	bfm x11,x10,#0x38,#0x37
00a01f20	cbz w8,0x00a01f34
00a01f24	sub w8,w8,#0x1
00a01f28	mov x10,x11
00a01f2c	cbnz w20,0x00a01f14
00a01f30	b 0x00a01f50
00a01f34	ldr x8,[x19]
00a01f38	sub w9,w9,#0x1
00a01f3c	str x11,[x8, w9, UXTW #0x3]
00a01f40	orr w8,wzr,#0x7
00a01f44	mov x11,xzr
00a01f48	mov x10,x11
00a01f4c	cbnz w20,0x00a01f14
00a01f50	ldr x9,[x19]
00a01f54	mov w8,w24
00a01f58	sub x8,x8,#0x1
00a01f5c	ldr x10,[x9, x8, LSL #0x3]
00a01f60	cbnz x10,0x00a01f74
00a01f64	sub x8,x8,#0x1
00a01f68	add w10,w8,#0x2
00a01f6c	cmp w10,#0x1
00a01f70	b.gt 0x00a01f5c
00a01f74	add w8,w8,#0x1
00a01f78	str w8,[x19, #0x8]
00a01f7c	cbnz w8,0x00a02060
00a01f80	str wzr,[x19, #0x10]
00a01f84	b 0x00a02060
00a01f88	adrp x1,0x2b5000
00a01f8c	add x1,x1,#0xa6d
00a01f90	orr w0,wzr,#0x18
00a01f94	mov w2,#0xf7
00a01f98	bl 0x00c34250
00a01f9c	cbz x0,0x00a01fc8
00a01fa0	mov x23,x0
00a01fa4	mov w8,#0x1
00a01fa8	mov x22,x0
00a01fac	mov x19,x0
00a01fb0	str w8,[x0, #0x14]
00a01fb4	cmp w20,#0x1
00a01fb8	b.ge 0x00a01ebc
00a01fbc	b 0x00a01ed0
00a01fc0	str wzr,[x19, #0x8]
00a01fc4	b 0x00a02060
00a01fc8	bl 0x00c342a0
00a01fcc	adrp x0,0x2b5000
00a01fd0	adrp x2,0x2d1000
00a01fd4	add x0,x0,#0xa6d
00a01fd8	add x2,x2,#0x72f
00a01fdc	orr w1,wzr,#0xf8
00a01fe0	bl 0x00c342b0
00a01fe4	mov w1,#0x100
00a01fe8	orr w0,wzr,#0x3
00a01fec	movk w1,#0xc, LSL #16
00a01ff0	mov x2,xzr
00a01ff4	bl 0x00c342c0
00a01ff8	b 0x00a0205c
00a01ffc	cbz x23,0x00a0205c
00a02000	ldr w8,[x23, #0x14]
00a02004	tbnz w8,#0x1,0x00a0203c
00a02008	ldr x0,[x23]
00a0200c	tbnz w8,#0x3,0x00a02024
00a02010	adrp x1,0x2b5000
00a02014	add x1,x1,#0xa6d
00a02018	mov w2,#0xd1
00a0201c	bl 0x00c32310
00a02020	b 0x00a0203c
00a02024	ldrsw x8,[x23, #0xc]
00a02028	adrp x2,0x2b5000
00a0202c	add x2,x2,#0xa6d
00a02030	mov w3,#0xcd
00a02034	lsl x1,x8,#0x3
00a02038	bl 0x00c38e10
00a0203c	ldrb w8,[x23, #0x14]
00a02040	mov x19,xzr
00a02044	tbz w8,#0x0,0x00a02060
00a02048	adrp x1,0x2b5000
00a0204c	add x1,x1,#0xa6d
00a02050	mov w2,#0xe8
00a02054	mov x0,x22
00a02058	bl 0x00c32310
00a0205c	mov x19,xzr
00a02060	mov x0,x19
00a02064	ldp x29,x30,[sp, #0x40]
00a02068	ldp x20,x19,[sp, #0x30]
00a0206c	ldp x22,x21,[sp, #0x20]
00a02070	ldp x24,x23,[sp, #0x10]
00a02074	ldr x25,[sp], #0x50
00a02078	ret
