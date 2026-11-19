; FUN_00a72ef4 @ 00a72ef4
00a72ef4	sub sp,sp,#0xd0
00a72ef8	stp x22,x21,[sp, #0xa0]
00a72efc	stp x20,x19,[sp, #0xb0]
00a72f00	stp x29,x30,[sp, #0xc0]
00a72f04	ldr x8,[x2, #0x20]
00a72f08	mov w21,w0
00a72f0c	add x29,sp,#0xc0
00a72f10	mov x19,x2
00a72f14	mov x0,x8
00a72f18	mov x20,x1
00a72f1c	bl 0x00c37cd0
00a72f20	cmp w0,#0x6
00a72f24	b.eq 0x00a72f3c
00a72f28	ldr x0,[x19, #0x20]
00a72f2c	bl 0x00c37cd0
00a72f30	cmp w0,#0x390
00a72f34	mov w0,wzr
00a72f38	b.ne 0x00a72f9c
00a72f3c	ldr x0,[x19, #0x20]
00a72f40	bl 0x00c3d8d0
00a72f44	mov x22,x0
00a72f48	bl 0x00c3db80
00a72f4c	cbz w0,0x00a72f98
00a72f50	add x1,sp,#0x50
00a72f54	mov x2,sp
00a72f58	mov x0,x22
00a72f5c	bl 0x00c3db30
00a72f60	cbz w0,0x00a72f98
00a72f64	ldr x8,[sp, #0x50]
00a72f68	cbz x8,0x00a72f98
00a72f6c	ldr x9,[x19, #0x30]
00a72f70	mov w0,wzr
00a72f74	ldr w9,[x9, #0x8]
00a72f78	cmp w9,#0x2
00a72f7c	b.ne 0x00a72f9c
00a72f80	mov w0,w21
00a72f84	mov x1,x20
00a72f88	mov x2,x19
00a72f8c	str x8,[x19, #0x20]
00a72f90	bl 0x00a6fd84
00a72f94	b 0x00a72f9c
00a72f98	mov w0,wzr
00a72f9c	ldp x29,x30,[sp, #0xc0]
00a72fa0	ldp x20,x19,[sp, #0xb0]
00a72fa4	ldp x22,x21,[sp, #0xa0]
00a72fa8	add sp,sp,#0xd0
00a72fac	ret
