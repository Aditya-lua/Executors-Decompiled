; OSSL_PARAM_locate_const @ 00a9df80
00a9df80	stp x20,x19,[sp, #-0x20]!
00a9df84	mov x19,x0
00a9df88	mov x0,xzr
00a9df8c	stp x29,x30,[sp, #0x10]
00a9df90	add x29,sp,#0x10
00a9df94	cbz x19,0x00a9dfc8
00a9df98	mov x20,x1
00a9df9c	cbz x1,0x00a9dfc8
00a9dfa0	ldr x1,[x19]
00a9dfa4	cbz x1,0x00a9dfbc
00a9dfa8	mov x0,x20
00a9dfac	bl 0x00c301f0
00a9dfb0	cbz w0,0x00a9dfc4
00a9dfb4	ldr x1,[x19, #0x28]!
00a9dfb8	cbnz x1,0x00a9dfa8
00a9dfbc	mov x0,xzr
00a9dfc0	b 0x00a9dfc8
00a9dfc4	mov x0,x19
00a9dfc8	ldp x29,x30,[sp, #0x10]
00a9dfcc	ldp x20,x19,[sp], #0x20
00a9dfd0	ret
