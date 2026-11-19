; BIO_new_fp @ 00a002d4
00a002d4	str x21,[sp, #-0x30]!
00a002d8	stp x20,x19,[sp, #0x10]
00a002dc	mov x20,x0
00a002e0	adrp x0,0xc59000
00a002e4	add x0,x0,#0x4e8
00a002e8	stp x29,x30,[sp, #0x20]
00a002ec	add x29,sp,#0x20
00a002f0	mov w21,w1
00a002f4	bl 0x00c32240
00a002f8	mov x19,x0
00a002fc	cbz x0,0x00a00320
00a00300	mov x0,x19
00a00304	mov w1,wzr
00a00308	bl 0x00c322a0
00a0030c	sxtw x2,w21
00a00310	mov w1,#0x6a
00a00314	mov x0,x19
00a00318	mov x3,x20
00a0031c	bl 0x00c321a0
00a00320	mov x0,x19
00a00324	ldp x29,x30,[sp, #0x20]
00a00328	ldp x20,x19,[sp, #0x10]
00a0032c	ldr x21,[sp], #0x30
00a00330	ret
