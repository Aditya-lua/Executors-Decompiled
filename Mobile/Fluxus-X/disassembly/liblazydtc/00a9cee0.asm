; WPACKET_memcpy @ 00a9cee0
00a9cee0	str x21,[sp, #-0x30]!
00a9cee4	stp x20,x19,[sp, #0x10]
00a9cee8	stp x29,x30,[sp, #0x20]
00a9ceec	add x29,sp,#0x20
00a9cef0	cbz x2,0x00a9cf34
00a9cef4	mov x19,x2
00a9cef8	mov x20,x1
00a9cefc	add x2,sp,#0x8
00a9cf00	mov x1,x19
00a9cf04	mov x21,x0
00a9cf08	bl 0x00a9c32c
00a9cf0c	cbz w0,0x00a9cf38
00a9cf10	ldr q0,[x21, #0x10]
00a9cf14	dup v1.2D,x19
00a9cf18	add v0.2D,v1.2D,v0.2D
00a9cf1c	str q0,[x21, #0x10]
00a9cf20	ldr x0,[sp, #0x8]
00a9cf24	cbz x0,0x00a9cf34
00a9cf28	mov x1,x20
00a9cf2c	mov x2,x19
00a9cf30	bl 0x00c2ffd0
00a9cf34	mov w0,#0x1
00a9cf38	ldp x29,x30,[sp, #0x20]
00a9cf3c	ldp x20,x19,[sp, #0x10]
00a9cf40	ldr x21,[sp], #0x30
00a9cf44	ret
