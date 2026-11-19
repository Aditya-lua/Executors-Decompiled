; SRP_Calc_A @ 00ae6d00
00ae6d00	str x23,[sp, #-0x40]!
00ae6d04	stp x20,x19,[sp, #0x20]
00ae6d08	mov x19,xzr
00ae6d0c	stp x22,x21,[sp, #0x10]
00ae6d10	stp x29,x30,[sp, #0x30]
00ae6d14	add x29,sp,#0x30
00ae6d18	cbz x0,0x00ae6d80
00ae6d1c	mov x21,x1
00ae6d20	cbz x1,0x00ae6d80
00ae6d24	mov x22,x2
00ae6d28	cbz x2,0x00ae6d80
00ae6d2c	mov x23,x0
00ae6d30	bl 0x00c38a50
00ae6d34	cbz x0,0x00ae6d7c
00ae6d38	mov x20,x0
00ae6d3c	bl 0x00c37710
00ae6d40	mov x19,x0
00ae6d44	cbz x0,0x00ae6d70
00ae6d48	mov x0,x19
00ae6d4c	mov x1,x22
00ae6d50	mov x2,x23
00ae6d54	mov x3,x21
00ae6d58	mov x4,x20
00ae6d5c	bl 0x00c38ad0
00ae6d60	cbnz w0,0x00ae6d70
00ae6d64	mov x0,x19
00ae6d68	bl 0x00c36290
00ae6d6c	mov x19,xzr
00ae6d70	mov x0,x20
00ae6d74	bl 0x00c38a30
00ae6d78	b 0x00ae6d80
00ae6d7c	mov x19,xzr
00ae6d80	mov x0,x19
00ae6d84	ldp x29,x30,[sp, #0x30]
00ae6d88	ldp x20,x19,[sp, #0x20]
00ae6d8c	ldp x22,x21,[sp, #0x10]
00ae6d90	ldr x23,[sp], #0x40
00ae6d94	ret
