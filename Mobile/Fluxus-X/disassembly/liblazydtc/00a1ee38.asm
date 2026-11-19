; DH_set_method @ 00a1ee38
00a1ee38	stp x20,x19,[sp, #-0x20]!
00a1ee3c	stp x29,x30,[sp, #0x10]
00a1ee40	ldr x8,[x0, #0xb8]
00a1ee44	mov x19,x0
00a1ee48	mov x20,x1
00a1ee4c	add x29,sp,#0x10
00a1ee50	ldr x8,[x8, #0x28]
00a1ee54	cbz x8,0x00a1ee60
00a1ee58	mov x0,x19
00a1ee5c	blr x8
00a1ee60	ldr x0,[x19, #0xa8]
00a1ee64	bl 0x00c32360
00a1ee68	str xzr,[x19, #0xa8]
00a1ee6c	str x20,[x19, #0xb8]
00a1ee70	ldr x8,[x20, #0x20]
00a1ee74	cbz x8,0x00a1ee80
00a1ee78	mov x0,x19
00a1ee7c	blr x8
00a1ee80	ldp x29,x30,[sp, #0x10]
00a1ee84	mov w0,#0x1
00a1ee88	ldp x20,x19,[sp], #0x20
00a1ee8c	ret
