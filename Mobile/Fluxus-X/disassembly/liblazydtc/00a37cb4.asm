; ossl_ec_GFp_mont_field_set_to_one @ 00a37cb4
00a37cb4	stp x29,x30,[sp, #-0x10]!
00a37cb8	ldr x8,[x0, #0x80]
00a37cbc	mov x29,sp
00a37cc0	cbz x8,0x00a37ce0
00a37cc4	mov x0,x1
00a37cc8	mov x1,x8
00a37ccc	bl 0x00c36990
00a37cd0	cmp x0,#0x0
00a37cd4	cset w0,ne
00a37cd8	ldp x29,x30,[sp], #0x10
00a37cdc	ret
00a37ce0	bl 0x00c342a0
00a37ce4	adrp x0,0x2bf000
00a37ce8	adrp x2,0x2b7000
00a37cec	add x0,x0,#0xbb4
00a37cf0	add x2,x2,#0xad6
00a37cf4	mov w1,#0x125
00a37cf8	bl 0x00c342b0
00a37cfc	mov w0,#0x10
00a37d00	mov w1,#0x6f
00a37d04	mov x2,xzr
00a37d08	bl 0x00c342c0
00a37d0c	mov w0,wzr
00a37d10	ldp x29,x30,[sp], #0x10
00a37d14	ret
