; FUN_00a5dfc8 @ 00a5dfc8
00a5dfc8	cbnz x0,0x00a5dff0
00a5dfcc	stp x29,x30,[sp, #-0x10]!
00a5dfd0	ldr x0,[x1]
00a5dfd4	adrp x2,0xc5d000
00a5dfd8	add x2,x2,#0x6b8
00a5dfdc	mov w1,wzr
00a5dfe0	mov x29,sp
00a5dfe4	bl 0x00c3b520
00a5dfe8	ldp x29,x30,[sp], #0x10
00a5dfec	cbz x0,0x00a5dff4
00a5dff0	b 0x00c3b5f0
00a5dff4	ret
