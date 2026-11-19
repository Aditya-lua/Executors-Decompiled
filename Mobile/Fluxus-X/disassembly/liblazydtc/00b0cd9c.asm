; X509_TRUST_get0 @ 00b0cd9c
00b0cd9c	tbnz w0,#0x1f,0x00b0cdbc
00b0cda0	cmp w0,#0x7
00b0cda4	b.gt 0x00b0cdc4
00b0cda8	adrp x8,0xcc9000
00b0cdac	add x8,x8,#0xbf8
00b0cdb0	mov w9,#0x28
00b0cdb4	smaddl x0,w0,w9,x8
00b0cdb8	ret
00b0cdbc	mov x0,xzr
00b0cdc0	ret
00b0cdc4	stp x29,x30,[sp, #-0x10]!
00b0cdc8	adrp x8,0xd22000
00b0cdcc	ldr x8,[x8, #0x7e8]
00b0cdd0	sub w1,w0,#0x8
00b0cdd4	mov x29,sp
00b0cdd8	mov x0,x8
00b0cddc	bl 0x00c32610
00b0cde0	ldp x29,x30,[sp], #0x10
00b0cde4	ret
