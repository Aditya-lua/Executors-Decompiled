; SCT_validation_status_string @ 00afd514
00afd514	stp x29,x30,[sp, #-0x10]!
00afd518	mov x29,sp
00afd51c	bl 0x00c35940
00afd520	cmp w0,#0x5
00afd524	b.hi 0x00afd53c
00afd528	adrp x8,0xc7f000
00afd52c	add x8,x8,#0xd40
00afd530	ldr x0,[x8, w0, SXTW #0x3]
00afd534	ldp x29,x30,[sp], #0x10
00afd538	ret
00afd53c	adrp x0,0x2be000
00afd540	add x0,x0,#0x42f
00afd544	ldp x29,x30,[sp], #0x10
00afd548	ret
