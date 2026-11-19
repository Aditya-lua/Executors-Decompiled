; FUN_00b4d188 @ 00b4d188
00b4d188	stp x20,x19,[sp, #-0x20]!
00b4d18c	stp x29,x30,[sp, #0x10]
00b4d190	add x29,sp,#0x10
00b4d194	mov x20,x1
00b4d198	mov x19,x0
00b4d19c	bl 0x00c41000
00b4d1a0	mov w8,w0
00b4d1a4	mov w0,wzr
00b4d1a8	cbz x20,0x00b4d1c4
00b4d1ac	cbz x19,0x00b4d1c4
00b4d1b0	cbz w8,0x00b4d1c4
00b4d1b4	mov x0,x20
00b4d1b8	bl 0x00c3a330
00b4d1bc	str x0,[x19, #0x8]
00b4d1c0	mov w0,#0x1
00b4d1c4	ldp x29,x30,[sp, #0x10]
00b4d1c8	ldp x20,x19,[sp], #0x20
00b4d1cc	ret
