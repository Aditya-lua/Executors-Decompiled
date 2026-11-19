; ERR_set_mark @ 00a5538c
00a5538c	stp x29,x30,[sp, #-0x10]!
00a55390	mov x29,sp
00a55394	bl 0x00a54260
00a55398	cbz x0,0x00a553c8
00a5539c	ldr w8,[x0, #0x384]
00a553a0	ldrsw x9,[x0, #0x380]
00a553a4	cmp w8,w9
00a553a8	mov w8,wzr
00a553ac	b.eq 0x00a553cc
00a553b0	add x8,x0,x9, LSL #0x2
00a553b4	ldr w9,[x8, #0x40]
00a553b8	add w9,w9,#0x1
00a553bc	str w9,[x8, #0x40]
00a553c0	mov w8,#0x1
00a553c4	b 0x00a553cc
00a553c8	mov w8,wzr
00a553cc	mov w0,w8
00a553d0	ldp x29,x30,[sp], #0x10
00a553d4	ret
