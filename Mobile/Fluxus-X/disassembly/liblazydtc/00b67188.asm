; ossl_ccm_generic_gettag @ 00b67188
00b67188	stp x29,x30,[sp, #-0x10]!
00b6718c	add x0,x0,#0x50
00b67190	mov x29,sp
00b67194	bl 0x00c3e2d0
00b67198	cmp x0,#0x0
00b6719c	cset w0,ne
00b671a0	ldp x29,x30,[sp], #0x10
00b671a4	ret
