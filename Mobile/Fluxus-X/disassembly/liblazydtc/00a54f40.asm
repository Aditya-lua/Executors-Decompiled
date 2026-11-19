; ERR_get_next_error_library @ 00a54f40
00a54f40	stp x20,x19,[sp, #-0x20]!
00a54f44	adrp x0,0xd21000
00a54f48	adrp x1,0xa53000
00a54f4c	add x0,x0,#0xa30
00a54f50	add x1,x1,#0xf8c
00a54f54	stp x29,x30,[sp, #0x10]
00a54f58	add x29,sp,#0x10
00a54f5c	bl 0x00c34d60
00a54f60	mov w19,wzr
00a54f64	cbz w0,0x00a54fa4
00a54f68	adrp x8,0xd21000
00a54f6c	ldr w8,[x8, #0xa34]
00a54f70	cbz w8,0x00a54fa4
00a54f74	adrp x20,0xd21000
00a54f78	ldr x0,[x20, #0xa20]
00a54f7c	bl 0x00c356a0
00a54f80	cbz w0,0x00a54fa0
00a54f84	adrp x8,0xcc8000
00a54f88	ldr w19,[x8, #0xed0]
00a54f8c	ldr x0,[x20, #0xa20]
00a54f90	add w9,w19,#0x1
00a54f94	str w9,[x8, #0xed0]
00a54f98	bl 0x00c35690
00a54f9c	b 0x00a54fa4
00a54fa0	mov w19,wzr
00a54fa4	ldp x29,x30,[sp, #0x10]
00a54fa8	mov w0,w19
00a54fac	ldp x20,x19,[sp], #0x20
00a54fb0	ret
