; X509_PURPOSE_get0 @ 00b026e8
00b026e8	tbnz w0,#0x1f,0x00b02708
00b026ec	cmp w0,#0x8
00b026f0	b.gt 0x00b02710
00b026f4	adrp x8,0xcc9000
00b026f8	add x8,x8,#0xa28
00b026fc	orr w9,wzr,#0x30
00b02700	smaddl x0,w0,w9,x8
00b02704	ret
00b02708	mov x0,xzr
00b0270c	ret
00b02710	stp x29,x30,[sp, #-0x10]!
00b02714	adrp x8,0xd22000
00b02718	ldr x8,[x8, #0x7e0]
00b0271c	sub w1,w0,#0x9
00b02720	mov x29,sp
00b02724	mov x0,x8
00b02728	bl 0x00c32610
00b0272c	ldp x29,x30,[sp], #0x10
00b02730	ret
