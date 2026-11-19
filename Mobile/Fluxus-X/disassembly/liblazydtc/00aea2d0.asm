; OSSL_STORE_INFO_set0_NAME_description @ 00aea2d0
00aea2d0	ldr w8,[x0]
00aea2d4	cmp w8,#0x1
00aea2d8	b.ne 0x00aea2e8
00aea2dc	str x1,[x0, #0x10]
00aea2e0	mov w0,#0x1
00aea2e4	ret
00aea2e8	stp x29,x30,[sp, #-0x10]!
00aea2ec	mov x29,sp
00aea2f0	bl 0x00c342a0
00aea2f4	adrp x0,0x2c2000
00aea2f8	adrp x2,0x2b8000
00aea2fc	add x0,x0,#0x3bd
00aea300	add x2,x2,#0x65f
00aea304	mov w1,#0x23c
00aea308	bl 0x00c342b0
00aea30c	mov w1,#0x106
00aea310	mov w0,#0x2c
00aea314	movk w1,#0x8, LSL #16
00aea318	mov x2,xzr
00aea31c	bl 0x00c342c0
00aea320	mov w0,wzr
00aea324	ldp x29,x30,[sp], #0x10
00aea328	ret
