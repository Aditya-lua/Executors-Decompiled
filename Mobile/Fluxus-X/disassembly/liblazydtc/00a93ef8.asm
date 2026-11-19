; FUN_00a93ef8 @ 00a93ef8
00a93ef8	sub sp,sp,#0x90
00a93efc	stp x28,x27,[sp, #0x30]
00a93f00	stp x26,x25,[sp, #0x40]
00a93f04	stp x24,x23,[sp, #0x50]
00a93f08	stp x22,x21,[sp, #0x60]
00a93f0c	stp x20,x19,[sp, #0x70]
00a93f10	stp x29,x30,[sp, #0x80]
00a93f14	add x29,sp,#0x80
00a93f18	mov x19,x3
00a93f1c	mov x23,x2
00a93f20	mov x28,x1
00a93f24	mov x22,x0
00a93f28	bl 0x00c3cea0
00a93f2c	ldr x8,[x0, #0x180]
00a93f30	mov x21,x0
00a93f34	cbz x8,0x00a93f54
00a93f38	add x4,x22,#0x28
00a93f3c	mov x0,x23
00a93f40	mov x1,x28
00a93f44	mov x2,x19
00a93f48	mov x3,x21
00a93f4c	blr x8
00a93f50	b 0x00a9402c
00a93f54	lsr x8,x19,#0x1e
00a93f58	cbz x8,0x00a93fec
00a93f5c	orr x24,xzr,#-0x40000000
00a93f60	add x8,x19,x24
00a93f64	str x8,[sp, #0x18]
00a93f68	and x8,x8,#-0x40000000
00a93f6c	mov w20,#0x40000000
00a93f70	str x8,[sp, #0x10]
00a93f74	add x8,x8,x20
00a93f78	add x25,x21,#0x80
00a93f7c	add x26,x21,#0x100
00a93f80	add x27,x22,#0x28
00a93f84	str x8,[sp, #0x8]
00a93f88	add x8,x23,x8
00a93f8c	stp x8,x28,[sp, #0x20]
00a93f90	mov x0,x22
00a93f94	bl 0x00c3cec0
00a93f98	mov w7,w0
00a93f9c	mov w2,#0x40000000
00a93fa0	mov x0,x23
00a93fa4	mov x1,x28
00a93fa8	mov x3,x21
00a93fac	mov x4,x25
00a93fb0	mov x5,x26
00a93fb4	mov x6,x27
00a93fb8	bl 0x00c399f0
00a93fbc	add x19,x19,x24
00a93fc0	add x23,x23,x20
00a93fc4	lsr x8,x19,#0x1e
00a93fc8	add x28,x28,x20
00a93fcc	cbnz x8,0x00a93f90
00a93fd0	ldp x9,x8,[sp, #0x10]
00a93fd4	ldp x20,x28,[sp, #0x20]
00a93fd8	sub x19,x8,x9
00a93fdc	ldr x8,[sp, #0x8]
00a93fe0	add x28,x28,x8
00a93fe4	cbnz x19,0x00a93ff4
00a93fe8	b 0x00a9402c
00a93fec	mov x20,x23
00a93ff0	cbz x19,0x00a9402c
00a93ff4	mov x0,x22
00a93ff8	add x23,x21,#0x80
00a93ffc	add x25,x21,#0x100
00a94000	add x26,x22,#0x28
00a94004	bl 0x00c3cec0
00a94008	mov w7,w0
00a9400c	mov x0,x20
00a94010	mov x1,x28
00a94014	mov x2,x19
00a94018	mov x3,x21
00a9401c	mov x4,x23
00a94020	mov x5,x25
00a94024	mov x6,x26
00a94028	bl 0x00c399f0
00a9402c	ldp x29,x30,[sp, #0x80]
00a94030	ldp x20,x19,[sp, #0x70]
00a94034	ldp x22,x21,[sp, #0x60]
00a94038	ldp x24,x23,[sp, #0x50]
00a9403c	ldp x26,x25,[sp, #0x40]
00a94040	ldp x28,x27,[sp, #0x30]
00a94044	mov w0,#0x1
00a94048	add sp,sp,#0x90
00a9404c	ret
