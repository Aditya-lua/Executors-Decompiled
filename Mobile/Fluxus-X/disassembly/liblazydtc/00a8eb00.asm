; FUN_00a8eb00 @ 00a8eb00
00a8eb00	sub sp,sp,#0x50
00a8eb04	stp x24,x23,[sp, #0x10]
00a8eb08	stp x22,x21,[sp, #0x20]
00a8eb0c	stp x20,x19,[sp, #0x30]
00a8eb10	stp x29,x30,[sp, #0x40]
00a8eb14	add x29,sp,#0x40
00a8eb18	mov x19,x3
00a8eb1c	mov x20,x2
00a8eb20	mov x21,x1
00a8eb24	mov x22,x0
00a8eb28	bl 0x00c3cea0
00a8eb2c	mov x23,x0
00a8eb30	mov x0,x22
00a8eb34	bl 0x00c3ceb0
00a8eb38	str w0,[sp, #0xc]
00a8eb3c	mov x0,x22
00a8eb40	add x24,x22,#0x28
00a8eb44	bl 0x00c3cec0
00a8eb48	ldr x7,[x23, #0x118]
00a8eb4c	mov w6,w0
00a8eb50	add x5,sp,#0xc
00a8eb54	mov x0,x20
00a8eb58	mov x1,x21
00a8eb5c	mov x2,x19
00a8eb60	mov x3,x23
00a8eb64	mov x4,x24
00a8eb68	bl 0x00c3e2f0
00a8eb6c	ldr w1,[sp, #0xc]
00a8eb70	mov x0,x22
00a8eb74	bl 0x00c3ced0
00a8eb78	ldp x29,x30,[sp, #0x40]
00a8eb7c	ldp x20,x19,[sp, #0x30]
00a8eb80	ldp x22,x21,[sp, #0x20]
00a8eb84	ldp x24,x23,[sp, #0x10]
00a8eb88	mov w0,#0x1
00a8eb8c	add sp,sp,#0x50
00a8eb90	ret
