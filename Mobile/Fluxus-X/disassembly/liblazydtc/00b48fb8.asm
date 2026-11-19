; FUN_00b48fb8 @ 00b48fb8
00b48fb8	stp x29,x30,[sp, #-0x10]!
00b48fbc	mov x0,x1
00b48fc0	adrp x1,0x2d7000
00b48fc4	add x1,x1,#0xe7d
00b48fc8	mov x29,sp
00b48fcc	bl 0x00c3e8c0
00b48fd0	cbz x0,0x00b48fe0
00b48fd4	mov x1,#-0x1
00b48fd8	ldp x29,x30,[sp], #0x10
00b48fdc	b 0x00c3e950
00b48fe0	orr w0,wzr,#0xfffffffe
00b48fe4	ldp x29,x30,[sp], #0x10
00b48fe8	ret
