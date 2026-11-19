; OTHERNAME_cmp @ 00af50f0
00af50f0	stp x20,x19,[sp, #-0x20]!
00af50f4	mov x20,x0
00af50f8	mov w0,#0xffffffff
00af50fc	stp x29,x30,[sp, #0x10]
00af5100	add x29,sp,#0x10
00af5104	cbz x20,0x00af5120
00af5108	mov x19,x1
00af510c	cbz x1,0x00af5120
00af5110	ldr x0,[x20]
00af5114	ldr x1,[x19]
00af5118	bl 0x00c37ab0
00af511c	cbz w0,0x00af512c
00af5120	ldp x29,x30,[sp, #0x10]
00af5124	ldp x20,x19,[sp], #0x20
00af5128	ret
00af512c	ldr x0,[x20, #0x8]
00af5130	ldr x1,[x19, #0x8]
00af5134	ldp x29,x30,[sp, #0x10]
00af5138	ldp x20,x19,[sp], #0x20
00af513c	b 0x00c37a10
