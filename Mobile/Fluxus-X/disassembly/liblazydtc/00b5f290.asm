; FUN_00b5f290 @ 00b5f290
00b5f290	sub sp,sp,#0x70
00b5f294	stp x29,x30,[sp, #0x60]
00b5f298	add x29,sp,#0x60
00b5f29c	str x21,[sp, #0x40]
00b5f2a0	stp x20,x19,[sp, #0x50]
00b5f2a4	mov x19,x2
00b5f2a8	mov x20,x1
00b5f2ac	mov x21,x0
00b5f2b0	stur wzr,[x29, #-0x14]
00b5f2b4	bl 0x00c41000
00b5f2b8	mov w8,w0
00b5f2bc	mov w0,wzr
00b5f2c0	cbz x21,0x00b5f304
00b5f2c4	cbz w8,0x00b5f304
00b5f2c8	ldrb w8,[x21, #0x1c]
00b5f2cc	ldr x0,[x21, #0x28]
00b5f2d0	orr w8,w8,#0x1
00b5f2d4	strb w8,[x21, #0x1c]
00b5f2d8	cbz x0,0x00b5f304
00b5f2dc	mov x1,sp
00b5f2e0	sub x2,x29,#0x14
00b5f2e4	bl 0x00c31f60
00b5f2e8	cbz w0,0x00b5f304
00b5f2ec	ldur w4,[x29, #-0x14]
00b5f2f0	mov x3,sp
00b5f2f4	mov x0,x21
00b5f2f8	mov x1,x20
00b5f2fc	mov x2,x19
00b5f300	bl 0x00b5ead0
00b5f304	ldp x29,x30,[sp, #0x60]
00b5f308	ldp x20,x19,[sp, #0x50]
00b5f30c	ldr x21,[sp, #0x40]
00b5f310	add sp,sp,#0x70
00b5f314	ret
