; X509v3_addr_add_inherit @ 00af5f10
00af5f10	str x19,[sp, #-0x20]!
00af5f14	stp x29,x30,[sp, #0x10]
00af5f18	add x29,sp,#0x10
00af5f1c	bl 0x00af5f98
00af5f20	cbz x0,0x00af5f8c
00af5f24	ldr x8,[x0, #0x8]
00af5f28	mov x19,x0
00af5f2c	cbz x8,0x00af5f54
00af5f30	ldr w9,[x8]
00af5f34	cbz w9,0x00af5f5c
00af5f38	cmp w9,#0x1
00af5f3c	b.ne 0x00af5f68
00af5f40	ldr x9,[x8, #0x8]
00af5f44	mov w0,wzr
00af5f48	cbnz x9,0x00af5f8c
00af5f4c	cbnz x9,0x00af5f84
00af5f50	b 0x00af5f70
00af5f54	mov w0,wzr
00af5f58	b 0x00af5f8c
00af5f5c	ldr x8,[x8, #0x8]
00af5f60	cbnz x8,0x00af5f88
00af5f64	b 0x00af5f70
00af5f68	ldr x9,[x8, #0x8]
00af5f6c	cbnz x9,0x00af5f84
00af5f70	bl 0x00c38160
00af5f74	ldr x8,[x19, #0x8]
00af5f78	str x0,[x8, #0x8]
00af5f7c	cbz x0,0x00af5f8c
00af5f80	ldr x8,[x19, #0x8]
00af5f84	str wzr,[x8]
00af5f88	mov w0,#0x1
00af5f8c	ldp x29,x30,[sp, #0x10]
00af5f90	ldr x19,[sp], #0x20
00af5f94	ret
