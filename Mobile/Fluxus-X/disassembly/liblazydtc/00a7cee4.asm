; ossl_ffc_validate_private_key @ 00a7cee4
00a7cee4	str x21,[sp, #-0x30]!
00a7cee8	stp x20,x19,[sp, #0x10]
00a7ceec	mov x19,x2
00a7cef0	mov w8,#0x40
00a7cef4	stp x29,x30,[sp, #0x20]
00a7cef8	add x29,sp,#0x20
00a7cefc	str wzr,[x2]
00a7cf00	cbz x0,0x00a7cf48
00a7cf04	mov x21,x1
00a7cf08	cbz x1,0x00a7cf48
00a7cf0c	mov x20,x0
00a7cf10	bl 0x00c38de0
00a7cf14	mov x1,x0
00a7cf18	mov x0,x21
00a7cf1c	bl 0x00c38cc0
00a7cf20	tbnz w0,#0x1f,0x00a7cf3c
00a7cf24	mov x0,x21
00a7cf28	mov x1,x20
00a7cf2c	bl 0x00c38cc0
00a7cf30	tbnz w0,#0x1f,0x00a7cf60
00a7cf34	mov w8,#0x20
00a7cf38	b 0x00a7cf40
00a7cf3c	mov w8,#0x10
00a7cf40	ldr w9,[x19]
00a7cf44	orr w8,w9,w8
00a7cf48	mov w0,wzr
00a7cf4c	str w8,[x19]
00a7cf50	ldp x29,x30,[sp, #0x20]
00a7cf54	ldp x20,x19,[sp, #0x10]
00a7cf58	ldr x21,[sp], #0x30
00a7cf5c	ret
00a7cf60	mov w0,#0x1
00a7cf64	b 0x00a7cf50
