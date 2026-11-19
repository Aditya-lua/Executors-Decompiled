; FUN_00c2bcb0 @ 00c2bcb0
00c2bcb0	bti c
00c2bcb4	adrp x16,0xd28000
00c2bcb8	ldrb w16,[x16, #0xe0]
00c2bcbc	cbz w16,0x00c2bcc8
00c2bcc0	ldaddal w0,w0,[x1]
00c2bcc4	ret
00c2bcc8	mov w16,w0
00c2bccc	ldaxr w0,[x1]
00c2bcd0	add w17,w0,w16
00c2bcd4	stlxr w15,w17,[x1]
00c2bcd8	cbnz w15,0x00c2bccc
00c2bcdc	ret
