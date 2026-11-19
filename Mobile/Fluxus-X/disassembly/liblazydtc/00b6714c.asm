; ossl_ccm_generic_setiv @ 00b6714c
00b6714c	stp x29,x30,[sp, #-0x10]!
00b67150	add x0,x0,#0x50
00b67154	mov x29,sp
00b67158	bl 0x00c3e2c0
00b6715c	cmp w0,#0x0
00b67160	cset w0,eq
00b67164	ldp x29,x30,[sp], #0x10
00b67168	ret
