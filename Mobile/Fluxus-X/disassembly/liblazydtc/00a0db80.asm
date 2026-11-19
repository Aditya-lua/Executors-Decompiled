; OPENSSL_INIT_set_config_appname @ 00a0db80
00a0db80	stp x20,x19,[sp, #-0x20]!
00a0db84	mov x19,x0
00a0db88	stp x29,x30,[sp, #0x10]
00a0db8c	add x29,sp,#0x10
00a0db90	cbz x1,0x00a0dba8
00a0db94	mov x0,x1
00a0db98	bl 0x00c30c60
00a0db9c	mov x20,x0
00a0dba0	cbnz x0,0x00a0dbac
00a0dba4	b 0x00a0dbbc
00a0dba8	mov x20,xzr
00a0dbac	ldr x0,[x19, #0x8]
00a0dbb0	bl 0x00c30960
00a0dbb4	mov w0,#0x1
00a0dbb8	str x20,[x19, #0x8]
00a0dbbc	ldp x29,x30,[sp, #0x10]
00a0dbc0	ldp x20,x19,[sp], #0x20
00a0dbc4	ret
