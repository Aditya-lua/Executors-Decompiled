; FUN_00a81dc8 @ 00a81dc8
00a81dc8	stp x20,x19,[sp, #-0x20]!
00a81dcc	stp x29,x30,[sp, #0x10]
00a81dd0	mov x19,x0
00a81dd4	ldr x0,[x0]
00a81dd8	adrp x2,0xc61000
00a81ddc	add x2,x2,#0x408
00a81de0	mov w1,#0x11
00a81de4	add x29,sp,#0x10
00a81de8	bl 0x00c3b520
00a81dec	cbz x0,0x00a81e14
00a81df0	mov x20,x0
00a81df4	mov x0,x19
00a81df8	mov w1,wzr
00a81dfc	bl 0x00c322b0
00a81e00	ldr x20,[x20, #0x30]
00a81e04	mov x0,x19
00a81e08	bl 0x00c321b0
00a81e0c	blr x20
00a81e10	mov w0,#0x1
00a81e14	ldp x29,x30,[sp, #0x10]
00a81e18	ldp x20,x19,[sp], #0x20
00a81e1c	ret
