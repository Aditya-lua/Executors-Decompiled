; ix::WebSocketPerMessageDeflateOptions::generateHeader @ 00992da8
00992da8	sub sp,sp,#0x1a0
00992dac	stp x28,x27,[sp, #0x140]
00992db0	stp x26,x25,[sp, #0x150]
00992db4	stp x24,x23,[sp, #0x160]
00992db8	stp x22,x21,[sp, #0x170]
00992dbc	stp x20,x19,[sp, #0x180]
00992dc0	stp x29,x30,[sp, #0x190]
00992dc4	add x29,sp,#0x190
00992dc8	str x8,[sp, #0x8]
00992dcc	adrp x26,0xcb4000
00992dd0	adrp x8,0xcb4000
00992dd4	mrs x25,tpidr_el0
00992dd8	ldr x26,[x26, #0xc90]
00992ddc	ldr x8,[x8, #0xc88]
00992de0	ldr x9,[x25, #0x28]
00992de4	add x20,sp,#0x10
00992de8	movi v0.2D,#0x0
00992dec	add x10,x8,#0x18
00992df0	mov x23,x0
00992df4	add x19,x20,#0x80
00992df8	add x21,x26,#0x40
00992dfc	mov v0.D[0x0],x10
00992e00	add x22,x20,#0x18
00992e04	add x8,x8,#0x40
00992e08	stur x9,[x29, #-0x60]
00992e0c	str x21,[sp, #0x20]
00992e10	str x8,[sp, #0x90]
00992e14	str q0,[sp, #0x10]
00992e18	mov x0,x19
00992e1c	mov x1,x22
00992e20	bl 0x00c30100
00992e24	str xzr,[sp, #0x118]
00992e28	adrp x9,0xcb4000
00992e2c	ldr x9,[x9, #0xa08]
00992e30	mov w8,#0xffffffff
00992e34	add x24,x20,#0x10
00992e38	fmov d0,x21
00992e3c	str w8,[sp, #0x120]
00992e40	add x8,x9,#0x10
00992e44	add x20,x20,#0x20
00992e48	add x28,x26,#0x18
00992e4c	add x27,x26,#0x68
00992e50	mov v0.D[0x1],x8
00992e54	mov x0,x20
00992e58	str x28,[sp, #0x10]
00992e5c	str x27,[sp, #0x90]
00992e60	str q0,[sp, #0x20]
00992e64	bl 0x00c30480
00992e68	movi v0.2D,#0x0
00992e6c	stur q0,[sp, #0x58]
00992e70	stur q0,[sp, #0x48]
00992e74	stur q0,[sp, #0x38]
00992e78	adrp x9,0xcb4000
00992e7c	ldr x9,[x9, #0xa00]
00992e80	orr w8,wzr,#0x18
00992e84	stur q0,[sp, #0x78]
00992e88	stur q0,[sp, #0x68]
00992e8c	add x21,x9,#0x10
00992e90	str x21,[sp, #0x28]
00992e94	str w8,[sp, #0x88]
00992e98	adrp x1,0x2af000
00992e9c	add x1,x1,#0x720
00992ea0	mov w2,#0x2c
00992ea4	mov x0,x24
00992ea8	bl 0x00c30e90
00992eac	ldrb w8,[x23, #0x1]
00992eb0	cbz w8,0x00992ec8
00992eb4	adrp x1,0x2a1000
00992eb8	add x1,x1,#0xbf7
00992ebc	orr w2,wzr,#0x1c
00992ec0	mov x0,x24
00992ec4	bl 0x00c30e90
00992ec8	ldrb w8,[x23, #0x2]
00992ecc	cbz w8,0x00992ee4
00992ed0	adrp x1,0x2d3000
00992ed4	add x1,x1,#0x3a3
00992ed8	orr w2,wzr,#0x1c
00992edc	mov x0,x24
00992ee0	bl 0x00c30e90
00992ee4	adrp x1,0x2b5000
00992ee8	add x1,x1,#0x6a2
00992eec	mov w2,#0x19
00992ef0	mov x0,x24
00992ef4	bl 0x00c30e90
00992ef8	ldrb w1,[x23, #0x4]
00992efc	bl 0x00c31aa0
00992f00	adrp x1,0x2b1000
00992f04	add x1,x1,#0x9c1
00992f08	mov w2,#0x19
00992f0c	mov x0,x24
00992f10	bl 0x00c30e90
00992f14	ldrb w1,[x23, #0x3]
00992f18	bl 0x00c31aa0
00992f1c	adrp x1,0x2b9000
00992f20	add x1,x1,#0x17a
00992f24	mov w2,#0x2
00992f28	mov x0,x24
00992f2c	bl 0x00c30e90
00992f30	ldr x8,[sp, #0x8]
00992f34	mov x0,x22
00992f38	bl 0x00c30e20
00992f3c	adrp x11,0xcb4000
00992f40	add x8,x26,#0x18
00992f44	ldr x11,[x11, #0xa00]
00992f48	str x8,[sp, #0x10]
00992f4c	ldrb w8,[sp, #0x68]
00992f50	add x9,x26,#0x68
00992f54	add x10,x26,#0x40
00992f58	add x11,x11,#0x10
00992f5c	str x9,[sp, #0x90]
00992f60	stp x10,x11,[sp, #0x20]
00992f64	tbz w8,#0x0,0x00992f70
00992f68	ldr x0,[sp, #0x78]
00992f6c	bl 0x00c301d0
00992f70	adrp x8,0xcb4000
00992f74	ldr x8,[x8, #0xa08]
00992f78	mov x0,x20
00992f7c	add x8,x8,#0x10
00992f80	str x8,[sp, #0x28]
00992f84	bl 0x00c30090
00992f88	mov x0,x19
00992f8c	bl 0x00c30ee0
00992f90	ldr x8,[x25, #0x28]
00992f94	ldur x9,[x29, #-0x60]
00992f98	cmp x8,x9
00992f9c	b.ne 0x00992fc0
00992fa0	ldp x29,x30,[sp, #0x190]
00992fa4	ldp x20,x19,[sp, #0x180]
00992fa8	ldp x22,x21,[sp, #0x170]
00992fac	ldp x24,x23,[sp, #0x160]
00992fb0	ldp x26,x25,[sp, #0x150]
00992fb4	ldp x28,x27,[sp, #0x140]
00992fb8	add sp,sp,#0x1a0
00992fbc	ret
00992fc0	bl 0x00c2fec0
