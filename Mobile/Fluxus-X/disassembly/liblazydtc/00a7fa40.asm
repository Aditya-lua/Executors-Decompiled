; HMAC_CTX_free @ 00a7fa40
00a7fa40	cbz x0,0x00a7faa4
00a7fa44	str x19,[sp, #-0x20]!
00a7fa48	stp x29,x30,[sp, #0x10]
00a7fa4c	mov x19,x0
00a7fa50	ldr x0,[x0, #0x10]
00a7fa54	add x29,sp,#0x10
00a7fa58	bl 0x00c3c1a0
00a7fa5c	ldr x0,[x19, #0x18]
00a7fa60	bl 0x00c3c1a0
00a7fa64	ldr x0,[x19, #0x8]
00a7fa68	bl 0x00c3c1a0
00a7fa6c	ldr x0,[x19, #0x10]
00a7fa70	str xzr,[x19]
00a7fa74	bl 0x00c31f90
00a7fa78	ldr x0,[x19, #0x18]
00a7fa7c	bl 0x00c31f90
00a7fa80	ldr x0,[x19, #0x8]
00a7fa84	bl 0x00c31f90
00a7fa88	ldp x29,x30,[sp, #0x10]
00a7fa8c	adrp x1,0x2a2000
00a7fa90	add x1,x1,#0x4c1
00a7fa94	mov w2,#0xad
00a7fa98	mov x0,x19
00a7fa9c	ldr x19,[sp], #0x20
00a7faa0	b 0x00c32310
00a7faa4	ret
