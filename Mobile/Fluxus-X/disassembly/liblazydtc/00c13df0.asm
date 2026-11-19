; FUN_00c13df0 @ 00c13df0
00c13df0	paciasp
00c13df4	stp x29,x30,[sp, #-0x60]!
00c13df8	stp x28,x27,[sp, #0x10]
00c13dfc	stp x26,x25,[sp, #0x20]
00c13e00	stp x24,x23,[sp, #0x30]
00c13e04	stp x22,x21,[sp, #0x40]
00c13e08	stp x20,x19,[sp, #0x50]
00c13e0c	mov x29,sp
00c13e10	ldp x8,x9,[x0]
00c13e14	cmp x8,x9
00c13e18	b.eq 0x00c13f78
00c13e1c	mov x19,x0
00c13e20	mov x20,x1
00c13e24	adrp x24,0xcb1000
00c13e28	add x24,x24,#0x538
00c13e2c	add x25,x0,#0x140
00c13e30	mov w26,#0x1b
00c13e34	mov w27,#0x540
00c13e38	b 0x00c13e90
00c13e3c	add x9,x8,#0x30
00c13e40	add x28,x23,x8
00c13e44	str x9,[x23, #0x8]
00c13e48	ldr x9,[x20]
00c13e4c	str x24,[x28, #0x10]!
00c13e50	ldurh w8,[x28, #0x9]
00c13e54	strb w26,[x28, #0x8]
00c13e58	and w8,w8,#0xf000
00c13e5c	stp x9,x21,[x28, #0x10]
00c13e60	orr w8,w8,w27
00c13e64	strb w22,[x28, #0x20]
00c13e68	sturh w8,[x28, #0x9]
00c13e6c	ldp x23,x8,[x19, #0x130]
00c13e70	str x28,[x20]
00c13e74	cmp x23,x8
00c13e78	b.eq 0x00c13f10
00c13e7c	ldp x8,x9,[x19]
00c13e80	str x28,[x23], #0x8
00c13e84	str x23,[x19, #0x130]
00c13e88	cmp x8,x9
00c13e8c	b.eq 0x00c13f78
00c13e90	ldrb w10,[x8]
00c13e94	cmp w10,#0x57
00c13e98	b.ne 0x00c13f78
00c13e9c	add x10,x8,#0x1
00c13ea0	cmp x10,x9
00c13ea4	str x10,[x19]
00c13ea8	b.eq 0x00c13ec8
00c13eac	ldrb w9,[x10]
00c13eb0	cmp w9,#0x50
00c13eb4	b.ne 0x00c13ec8
00c13eb8	add x8,x8,#0x2
00c13ebc	mov w22,#0x1
00c13ec0	str x8,[x19]
00c13ec4	b 0x00c13ecc
00c13ec8	mov w22,wzr
00c13ecc	mov x0,x19
00c13ed0	bl 0x00c14270
00c13ed4	cbz x0,0x00c13f80
00c13ed8	ldr x23,[x19, #0x1330]
00c13edc	mov x21,x0
00c13ee0	ldr x8,[x23, #0x8]
00c13ee4	sub x9,x8,#0xfc0
00c13ee8	cmn x9,#0xff1
00c13eec	b.hi 0x00c13e3c
00c13ef0	mov w0,#0x1000
00c13ef4	bl 0x00c308d0
00c13ef8	cbz x0,0x00c13fa4
00c13efc	mov x8,xzr
00c13f00	stp x23,xzr,[x0]
00c13f04	mov x23,x0
00c13f08	str x0,[x19, #0x1330]
00c13f0c	b 0x00c13e3c
00c13f10	ldr x22,[x19, #0x128]
00c13f14	sub x21,x23,x22
00c13f18	cmp x22,x25
00c13f1c	lsl x1,x21,#0x1
00c13f20	b.eq 0x00c13f38
00c13f24	mov x0,x22
00c13f28	bl 0x00c30950
00c13f2c	str x0,[x19, #0x128]
00c13f30	cbnz x0,0x00c13f64
00c13f34	b 0x00c13fa8
00c13f38	mov x0,x1
00c13f3c	bl 0x00c308d0
00c13f40	cbz x0,0x00c13fac
00c13f44	cmp x23,x25
00c13f48	b.eq 0x00c13f60
00c13f4c	mov x1,x22
00c13f50	mov x2,x21
00c13f54	mov x23,x0
00c13f58	bl 0x00c2ff60
00c13f5c	mov x0,x23
00c13f60	str x0,[x19, #0x128]
00c13f64	asr x8,x21,#0x2
00c13f68	add x23,x0,x21
00c13f6c	add x8,x0,x8, LSL #0x3
00c13f70	str x8,[x19, #0x138]
00c13f74	b 0x00c13e7c
00c13f78	mov w0,wzr
00c13f7c	b 0x00c13f84
00c13f80	mov w0,#0x1
00c13f84	ldp x20,x19,[sp, #0x50]
00c13f88	ldp x22,x21,[sp, #0x40]
00c13f8c	ldp x24,x23,[sp, #0x30]
00c13f90	ldp x26,x25,[sp, #0x20]
00c13f94	ldp x28,x27,[sp, #0x10]
00c13f98	ldp x29,x30,[sp], #0x60
00c13f9c	autiasp
00c13fa0	ret
00c13fa4	bl 0x00c2fff0
00c13fa8	bl 0x00c30b40
00c13fac	bl 0x00c30b40
