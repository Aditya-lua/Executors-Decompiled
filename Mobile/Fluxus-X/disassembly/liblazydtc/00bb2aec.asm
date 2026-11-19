; ZSTD_DCtx_setFormat @ 00bb2aec
00bb2aec	add x8,x0,#0x7, LSL #12
00bb2af0	ldr w9,[x8, #0x61c]
00bb2af4	cbz w9,0x00bb2b00
00bb2af8	mov x0,#-0x3c
00bb2afc	ret
00bb2b00	cmp w1,#0x1
00bb2b04	b.ls 0x00bb2b10
00bb2b08	mov x0,#-0x2a
00bb2b0c	ret
00bb2b10	mov x0,xzr
00bb2b14	str w1,[x8, #0x598]
00bb2b18	ret
