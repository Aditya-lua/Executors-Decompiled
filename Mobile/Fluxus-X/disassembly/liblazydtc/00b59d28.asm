; FUN_00b59d28 @ 00b59d28
00b59d28	stp x20,x19,[sp, #-0x20]!
00b59d2c	mov x19,x0
00b59d30	stp x29,x30,[sp, #0x10]
00b59d34	add x29,sp,#0x10
00b59d38	cbz x0,0x00b59d6c
00b59d3c	ldr x20,[x19, #0xf8]
00b59d40	cbz x20,0x00b59d6c
00b59d44	ldr x0,[x20, #0x18]
00b59d48	bl 0x00c31f90
00b59d4c	mov x0,x20
00b59d50	bl 0x00c41170
00b59d54	adrp x2,0x2a8000
00b59d58	add x2,x2,#0xd32
00b59d5c	mov w1,#0x178
00b59d60	mov w3,#0x1ab
00b59d64	mov x0,x20
00b59d68	bl 0x00c38e10
00b59d6c	ldp x29,x30,[sp, #0x10]
00b59d70	mov x0,x19
00b59d74	ldp x20,x19,[sp], #0x20
00b59d78	b 0x00c41800
