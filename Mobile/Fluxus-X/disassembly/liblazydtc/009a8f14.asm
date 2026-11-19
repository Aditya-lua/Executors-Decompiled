; ssl3_ctx_callback_ctrl @ 009a8f14
009a8f14	sub w9,w1,#0x6
009a8f18	cmp w9,#0x49
009a8f1c	mov x8,xzr
009a8f20	b.hi 0x009a8fa4
009a8f24	adrp x10,0x74b000
009a8f28	add x10,x10,#0x28
009a8f2c	ldrsw x9,[x10, x9, LSL #0x2]
009a8f30	add x9,x9,x10
009a8f34	br x9
009a8f38	ldr x8,[x0, #0x158]
009a8f3c	add x8,x8,#0x10
009a8f40	b 0x009a8f9c
009a8f44	add x8,x0,#0x218
009a8f48	b 0x009a8f9c
009a8f4c	add x8,x0,#0x250
009a8f50	b 0x009a8f9c
009a8f54	add x8,x0,#0x240
009a8f58	b 0x009a8f9c
009a8f5c	ldr x8,[x0, #0x390]
009a8f60	orr x8,x8,#0x20
009a8f64	str x8,[x0, #0x390]
009a8f68	add x8,x0,#0x320
009a8f6c	b 0x009a8f9c
009a8f70	ldr x8,[x0, #0x390]
009a8f74	orr x8,x8,#0x20
009a8f78	str x8,[x0, #0x390]
009a8f7c	add x8,x0,#0x328
009a8f80	b 0x009a8f9c
009a8f84	ldr x8,[x0, #0x390]
009a8f88	orr x8,x8,#0x20
009a8f8c	str x8,[x0, #0x390]
009a8f90	add x8,x0,#0x330
009a8f94	b 0x009a8f9c
009a8f98	add x8,x0,#0x3c0
009a8f9c	str x2,[x8]
009a8fa0	mov w8,#0x1
009a8fa4	mov x0,x8
009a8fa8	ret
