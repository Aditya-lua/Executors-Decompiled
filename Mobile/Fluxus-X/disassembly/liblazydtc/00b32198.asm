; FUN_00b32198 @ 00b32198
00b32198	stp x29,x30,[sp, #-0x10]!
00b3219c	mov x29,sp
00b321a0	bl 0x00c41000
00b321a4	cbz w0,0x00b321c0
00b321a8	adrp x1,0x2c8000
00b321ac	add x1,x1,#0x64d
00b321b0	mov w0,#0xd8
00b321b4	mov w2,#0x4f
00b321b8	ldp x29,x30,[sp], #0x10
00b321bc	b 0x00c34250
00b321c0	mov x0,xzr
00b321c4	ldp x29,x30,[sp], #0x10
00b321c8	ret
