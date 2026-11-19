; FUN_00c25f38 @ 00c25f38
00c25f38	paciasp
00c25f3c	stp x29,x30,[sp, #-0x30]!
00c25f40	str x21,[sp, #0x10]
00c25f44	stp x20,x19,[sp, #0x20]
00c25f48	mov x29,sp
00c25f4c	ldr x21,[x0, #0x1330]
00c25f50	mov x19,x1
00c25f54	ldr x8,[x21, #0x8]
00c25f58	sub x9,x8,#0xfd0
00c25f5c	cmn x9,#0xff1
00c25f60	b.hi 0x00c25f84
00c25f64	mov x20,x0
00c25f68	mov w0,#0x1000
00c25f6c	bl 0x00c308d0
00c25f70	cbz x0,0x00c25fe0
00c25f74	mov x8,xzr
00c25f78	stp x21,xzr,[x0]
00c25f7c	mov x21,x0
00c25f80	str x0,[x20, #0x1330]
00c25f84	add x9,x8,#0x20
00c25f88	ldr x10,[x19]
00c25f8c	add x0,x21,x8
00c25f90	str x9,[x21, #0x8]
00c25f94	adrp x8,0xcb4000
00c25f98	add x8,x8,#0x10
00c25f9c	ldurh w9,[x10, #0x9]
00c25fa0	str x8,[x0, #0x10]!
00c25fa4	ldurh w8,[x0, #0x9]
00c25fa8	mov w11,#0x500
00c25fac	and w9,w9,#0xc0
00c25fb0	orr w9,w9,w11
00c25fb4	and w8,w8,#0xf000
00c25fb8	mov w11,#0xc
00c25fbc	orr w8,w9,w8
00c25fc0	strb w11,[x0, #0x8]
00c25fc4	sturh w8,[x0, #0x9]
00c25fc8	str x10,[x0, #0x10]
00c25fcc	ldp x20,x19,[sp, #0x20]
00c25fd0	ldr x21,[sp, #0x10]
00c25fd4	ldp x29,x30,[sp], #0x30
00c25fd8	autiasp
00c25fdc	ret
00c25fe0	bl 0x00c2fff0
