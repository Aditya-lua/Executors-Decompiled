; FUN_00c2b8f0 @ 00c2b8f0
00c2b8f0	bti c
00c2b8f4	adrp x16,0xd28000
00c2b8f8	ldrb w16,[x16, #0xe0]
00c2b8fc	cbz w16,0x00c2b908
00c2b900	casalb w0,w1,[x2]
00c2b904	ret
00c2b908	uxtb w16,w0
00c2b90c	ldaxrb w0,[x2]
00c2b910	cmp w0,w16
00c2b914	b.ne 0x00c2b920
00c2b918	stlxrb w17,w1,[x2]
00c2b91c	cbnz w17,0x00c2b90c
00c2b920	ret
