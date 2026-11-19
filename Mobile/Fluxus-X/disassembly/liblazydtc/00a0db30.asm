; OPENSSL_INIT_set_config_filename @ 00a0db30
00a0db30	stp x20,x19,[sp, #-0x20]!
00a0db34	mov x19,x0
00a0db38	stp x29,x30,[sp, #0x10]
00a0db3c	add x29,sp,#0x10
00a0db40	cbz x1,0x00a0db58
00a0db44	mov x0,x1
00a0db48	bl 0x00c30c60
00a0db4c	mov x20,x0
00a0db50	cbnz x0,0x00a0db5c
00a0db54	b 0x00a0db6c
00a0db58	mov x20,xzr
00a0db5c	ldr x0,[x19]
00a0db60	bl 0x00c30960
00a0db64	mov w0,#0x1
00a0db68	str x20,[x19]
00a0db6c	ldp x29,x30,[sp, #0x10]
00a0db70	ldp x20,x19,[sp], #0x20
00a0db74	ret
