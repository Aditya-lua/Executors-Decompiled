; FUN_00a85f38 @ 00a85f38
00a85f38	stp x20,x19,[sp, #-0x20]!
00a85f3c	stp x29,x30,[sp, #0x10]
00a85f40	add x29,sp,#0x10
00a85f44	cbz x1,0x00a85f64
00a85f48	mov x20,x1
00a85f4c	cmp w3,#0x61
00a85f50	b.eq 0x00a85f84
00a85f54	cmp w3,#0x5
00a85f58	b.ne 0x00a85f94
00a85f5c	bl 0x00a86158
00a85f60	b 0x00a85f88
00a85f64	adrp x20,0xd22000
00a85f68	ldrb w8,[x20, #0xbc]
00a85f6c	mov x19,x2
00a85f70	cmp w8,#0x1
00a85f74	b.ne 0x00a85fa0
00a85f78	adrp x8,0xd22000
00a85f7c	ldr w0,[x8, #0xb8]
00a85f80	b 0x00a86014
00a85f84	bl 0x00a86200
00a85f88	str x0,[x20]
00a85f8c	mov w0,#0x1
00a85f90	b 0x00a86020
00a85f94	mov w0,wzr
00a85f98	str xzr,[x20]
00a85f9c	b 0x00a86020
00a85fa0	bl 0x00a86158
00a85fa4	cbz x0,0x00a85fc8
00a85fa8	bl 0x00c3ccf0
00a85fac	adrp x8,0xd22000
00a85fb0	ldrsw x9,[x8, #0xb8]
00a85fb4	adrp x10,0xd22000
00a85fb8	add x10,x10,#0xa8
00a85fbc	add w11,w9,#0x1
00a85fc0	str w11,[x8, #0xb8]
00a85fc4	str w0,[x10, x9, LSL #0x2]
00a85fc8	bl 0x00a86200
00a85fcc	cbz x0,0x00a85ff8
00a85fd0	bl 0x00c3ccf0
00a85fd4	adrp x9,0xd22000
00a85fd8	ldrsw x10,[x9, #0xb8]
00a85fdc	adrp x11,0xd22000
00a85fe0	mov w8,w0
00a85fe4	add x11,x11,#0xa8
00a85fe8	add w0,w10,#0x1
00a85fec	str w0,[x9, #0xb8]
00a85ff0	str w8,[x11, x10, LSL #0x2]
00a85ff4	b 0x00a86000
00a85ff8	adrp x8,0xd22000
00a85ffc	ldr w0,[x8, #0xb8]
00a86000	adrp x8,0xd22000
00a86004	add x8,x8,#0xa8
00a86008	mov w9,#0x1
00a8600c	str wzr,[x8, w0, SXTW #0x2]
00a86010	strb w9,[x20, #0xbc]
00a86014	adrp x8,0xd22000
00a86018	add x8,x8,#0xa8
00a8601c	str x8,[x19]
00a86020	ldp x29,x30,[sp, #0x10]
00a86024	ldp x20,x19,[sp], #0x20
00a86028	ret
