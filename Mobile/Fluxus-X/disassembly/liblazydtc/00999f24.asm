; ix::WebSocketTransport::closeSocketAndSwitchToClosedState @ 00999f24
00999f24	stp x24,x23,[sp, #-0x40]!
00999f28	stp x22,x21,[sp, #0x10]
00999f2c	stp x20,x19,[sp, #0x20]
00999f30	stp x29,x30,[sp, #0x30]
00999f34	add x29,sp,#0x30
00999f38	add x24,x0,#0xb8
00999f3c	mov x19,x0
00999f40	mov x0,x24
00999f44	mov w21,w4
00999f48	mov x20,x3
00999f4c	mov x23,x2
00999f50	mov w22,w1
00999f54	bl 0x00c2ff10
00999f58	ldr x0,[x19, #0xb0]
00999f5c	ldr x8,[x0]
00999f60	ldr x8,[x8, #0x20]
00999f64	blr x8
00999f68	mov x0,x24
00999f6c	bl 0x00c2ff20
00999f70	add x24,x19,#0x138
00999f74	mov x0,x24
00999f78	bl 0x00c2ff10
00999f7c	add x0,x19,#0x120
00999f80	cmp x0,x23
00999f84	b.eq 0x00999fa4
00999f88	ldrb w8,[x23]
00999f8c	ldp x10,x9,[x23, #0x8]
00999f90	tst w8,#0x1
00999f94	lsr w11,w8,#0x1
00999f98	csinc x1,x9,x23,ne
00999f9c	csel x2,x11,x10,eq
00999fa0	bl 0x00c31090
00999fa4	mov x0,x24
00999fa8	bl 0x00c2ff20
00999fac	add x8,x19,#0x160
00999fb0	add x9,x19,#0x168
00999fb4	and w10,w21,#0x1
00999fb8	add x11,x19,#0x170
00999fbc	mov w1,#0x1
00999fc0	mov x0,x19
00999fc4	stlrh w22,[x8]
00999fc8	stlr x20,[x9]
00999fcc	stlrb w10,[x11]
00999fd0	bl 0x00c33ea0
00999fd4	add x8,x19,#0x240
00999fd8	stlrb wzr,[x8]
00999fdc	ldp x29,x30,[sp, #0x30]
00999fe0	ldp x20,x19,[sp, #0x20]
00999fe4	ldp x22,x21,[sp, #0x10]
00999fe8	ldp x24,x23,[sp], #0x40
00999fec	ret
