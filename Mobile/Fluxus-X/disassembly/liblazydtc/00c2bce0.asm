; FUN_00c2bce0 @ 00c2bce0
00c2bce0	bti c
00c2bce4	adrp x16,0xd28000
00c2bce8	ldrb w16,[x16, #0xe0]
00c2bcec	cbz w16,0x00c2bcf8
00c2bcf0	ldadd x0,x0,[x1]
00c2bcf4	ret
00c2bcf8	mov x16,x0
00c2bcfc	ldxr x0,[x1]
00c2bd00	add x17,x0,x16
00c2bd04	stxr w15,x17,[x1]
00c2bd08	cbnz w15,0x00c2bcfc
00c2bd0c	ret
