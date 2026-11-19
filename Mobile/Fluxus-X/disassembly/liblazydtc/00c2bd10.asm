; FUN_00c2bd10 @ 00c2bd10
00c2bd10	bti c
00c2bd14	adrp x16,0xd28000
00c2bd18	ldrb w16,[x16, #0xe0]
00c2bd1c	cbz w16,0x00c2bd28
00c2bd20	ldaddal x0,x0,[x1]
00c2bd24	ret
00c2bd28	mov x16,x0
00c2bd2c	ldaxr x0,[x1]
00c2bd30	add x17,x0,x16
00c2bd34	stlxr w15,x17,[x1]
00c2bd38	cbnz w15,0x00c2bd2c
00c2bd3c	ret
