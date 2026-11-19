; FUN_00c01f1c @ 00c01f1c
00c01f1c	paciasp
00c01f20	stp x29,x30,[sp, #-0x30]!
00c01f24	stp x22,x21,[sp, #0x10]
00c01f28	stp x20,x19,[sp, #0x20]
00c01f2c	mov x29,sp
00c01f30	mov x19,x0
00c01f34	mov x0,x1
00c01f38	mov x21,x1
00c01f3c	bl 0x00c437b0
00c01f40	orr x8,xzr,#0x3ffffffffffffff8
00c01f44	cmp x0,x8
00c01f48	b.cs 0x00c01fb8
00c01f4c	mov x20,x0
00c01f50	cmp x0,#0x5
00c01f54	b.cs 0x00c01f68
00c01f58	lsl w8,w20,#0x1
00c01f5c	strb w8,[x19], #0x4
00c01f60	cbnz x20,0x00c01f90
00c01f64	b 0x00c01fa0
00c01f68	orr x8,x20,#0x1
00c01f6c	mov w9,#0x8
00c01f70	cmp x8,#0x5
00c01f74	csinc x22,x9,x8,eq
00c01f78	lsl x0,x22,#0x2
00c01f7c	bl 0x00c2fed0
00c01f80	orr x8,x22,#0x1
00c01f84	stp x20,x0,[x19, #0x8]
00c01f88	str x8,[x19]
00c01f8c	mov x19,x0
00c01f90	lsl x2,x20,#0x2
00c01f94	mov x0,x19
00c01f98	mov x1,x21
00c01f9c	bl 0x00c2ff60
00c01fa0	str wzr,[x19, x20, LSL #0x2]
00c01fa4	ldp x20,x19,[sp, #0x20]
00c01fa8	ldp x22,x21,[sp, #0x10]
00c01fac	ldp x29,x30,[sp], #0x30
00c01fb0	autiasp
00c01fb4	ret
00c01fb8	bl 0x00bc5610
