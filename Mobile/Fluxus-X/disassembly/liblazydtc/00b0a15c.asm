; X509_REVOKED_add_ext @ 00b0a15c
00b0a15c	stp x29,x30,[sp, #-0x10]!
00b0a160	add x0,x0,#0x20
00b0a164	mov x29,sp
00b0a168	bl 0x00c3efc0
00b0a16c	cmp x0,#0x0
00b0a170	cset w0,ne
00b0a174	ldp x29,x30,[sp], #0x10
00b0a178	ret
