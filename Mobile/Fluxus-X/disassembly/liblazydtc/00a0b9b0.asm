; BUF_MEM_free @ 00a0b9b0
00a0b9b0	cbz x0,0x00a0b9ec
00a0b9b4	str x19,[sp, #-0x20]!
00a0b9b8	stp x29,x30,[sp, #0x10]
00a0b9bc	mov x19,x0
00a0b9c0	ldr x0,[x0, #0x8]
00a0b9c4	add x29,sp,#0x10
00a0b9c8	cbz x0,0x00a0b9f8
00a0b9cc	ldrb w8,[x19, #0x18]
00a0b9d0	ldr x1,[x19, #0x10]
00a0b9d4	adrp x2,0x29f000
00a0b9d8	add x2,x2,#0xf43
00a0b9dc	tbnz w8,#0x0,0x00a0b9f0
00a0b9e0	mov w3,#0x33
00a0b9e4	bl 0x00c345e0
00a0b9e8	b 0x00a0b9f8
00a0b9ec	ret
00a0b9f0	mov w3,#0x31
00a0b9f4	bl 0x00c38e10
00a0b9f8	ldp x29,x30,[sp, #0x10]
00a0b9fc	adrp x1,0x29f000
00a0ba00	add x1,x1,#0xf43
00a0ba04	mov w2,#0x35
00a0ba08	mov x0,x19
00a0ba0c	ldr x19,[sp], #0x20
00a0ba10	b 0x00c32310
