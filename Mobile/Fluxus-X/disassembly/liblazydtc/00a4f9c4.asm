; FUN_00a4f9c4 @ 00a4f9c4
00a4f9c4	stp x20,x19,[sp, #-0x20]!
00a4f9c8	stp x29,x30,[sp, #0x10]
00a4f9cc	add x29,sp,#0x10
00a4f9d0	mov x20,x1
00a4f9d4	mov x19,x0
00a4f9d8	bl 0x00c3b6f0
00a4f9dc	cbz w0,0x00a4f9f4
00a4f9e0	mov x0,x20
00a4f9e4	mov x1,x19
00a4f9e8	bl 0x00c347a0
00a4f9ec	cmp w0,#0x0
00a4f9f0	b.le 0x00a4fa00
00a4f9f4	ldp x29,x30,[sp, #0x10]
00a4f9f8	ldp x20,x19,[sp], #0x20
00a4f9fc	ret
00a4fa00	ldp x29,x30,[sp, #0x10]
00a4fa04	mov x0,x19
00a4fa08	ldp x20,x19,[sp], #0x20
00a4fa0c	b 0x00c36350
