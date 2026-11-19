; OSSL_HTTP_REQ_CTX_set_max_response_length @ 00b172e8
00b172e8	cbz x0,0x00b17304
00b172ec	mov w8,#0x9000
00b172f0	cmp x1,#0x0
00b172f4	movk w8,#0x1, LSL #16
00b172f8	csel x8,x8,x1,eq
00b172fc	str x8,[x0, #0x98]
00b17300	ret
00b17304	stp x29,x30,[sp, #-0x10]!
00b17308	mov x29,sp
00b1730c	bl 0x00c342a0
00b17310	adrp x0,0x2d6000
00b17314	adrp x2,0x2ce000
00b17318	add x0,x0,#0x829
00b1731c	add x2,x2,#0x5bf
00b17320	mov w1,#0x9f
00b17324	bl 0x00c342b0
00b17328	mov w1,#0x102
00b1732c	mov w0,#0x3d
00b17330	movk w1,#0xc, LSL #16
00b17334	mov x2,xzr
00b17338	ldp x29,x30,[sp], #0x10
00b1733c	b 0x00c342c0
