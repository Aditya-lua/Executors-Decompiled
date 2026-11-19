; BN_GF2m_mod_exp_arr @ 00a2d2bc
00a2d2bc	str x25,[sp, #-0x50]!
00a2d2c0	stp x20,x19,[sp, #0x30]
00a2d2c4	mov x20,x0
00a2d2c8	mov x0,x2
00a2d2cc	stp x24,x23,[sp, #0x10]
00a2d2d0	stp x22,x21,[sp, #0x20]
00a2d2d4	stp x29,x30,[sp, #0x40]
00a2d2d8	add x29,sp,#0x40
00a2d2dc	mov x19,x4
00a2d2e0	mov x22,x3
00a2d2e4	mov x23,x2
00a2d2e8	mov x21,x1
00a2d2ec	bl 0x00c369b0
00a2d2f0	mov w1,#0x1
00a2d2f4	cbz w0,0x00a2d314
00a2d2f8	mov x0,x20
00a2d2fc	ldp x29,x30,[sp, #0x40]
00a2d300	ldp x20,x19,[sp, #0x30]
00a2d304	ldp x22,x21,[sp, #0x20]
00a2d308	ldp x24,x23,[sp, #0x10]
00a2d30c	ldr x25,[sp], #0x50
00a2d310	b 0x00c37720
00a2d314	mov x0,x23
00a2d318	bl 0x00c38c60
00a2d31c	cbz w0,0x00a2d338
00a2d320	mov x0,x20
00a2d324	mov x1,x21
00a2d328	bl 0x00c36990
00a2d32c	cmp x0,#0x0
00a2d330	cset w20,ne
00a2d334	b 0x00a2d3e8
00a2d338	mov x0,x19
00a2d33c	bl 0x00c38a90
00a2d340	mov x0,x19
00a2d344	bl 0x00c38a40
00a2d348	cbz x0,0x00a2d3dc
00a2d34c	mov x1,x21
00a2d350	mov x2,x22
00a2d354	mov x24,x0
00a2d358	bl 0x00a2b7b0
00a2d35c	cbz w0,0x00a2d3dc
00a2d360	mov x0,x23
00a2d364	bl 0x00c322f0
00a2d368	cmp w0,#0x2
00a2d36c	b.lt 0x00a2d3c4
00a2d370	sub w25,w0,#0x1
00a2d374	mov x0,x24
00a2d378	mov x1,x24
00a2d37c	mov x2,x22
00a2d380	mov x3,x19
00a2d384	bl 0x00a2bec0
00a2d388	cbz w0,0x00a2d3dc
00a2d38c	sub w25,w25,#0x1
00a2d390	mov x0,x23
00a2d394	mov w1,w25
00a2d398	bl 0x00c38d00
00a2d39c	cbz w0,0x00a2d3bc
00a2d3a0	mov x0,x24
00a2d3a4	mov x1,x24
00a2d3a8	mov x2,x21
00a2d3ac	mov x3,x22
00a2d3b0	mov x4,x19
00a2d3b4	bl 0x00a2bc58
00a2d3b8	cbz w0,0x00a2d3dc
00a2d3bc	cmp w25,#0x0
00a2d3c0	b.gt 0x00a2d374
00a2d3c4	mov x0,x20
00a2d3c8	mov x1,x24
00a2d3cc	bl 0x00c36990
00a2d3d0	cmp x0,#0x0
00a2d3d4	cset w20,ne
00a2d3d8	b 0x00a2d3e0
00a2d3dc	mov w20,wzr
00a2d3e0	mov x0,x19
00a2d3e4	bl 0x00c38a20
00a2d3e8	mov w0,w20
00a2d3ec	ldp x29,x30,[sp, #0x40]
00a2d3f0	ldp x20,x19,[sp, #0x30]
00a2d3f4	ldp x22,x21,[sp, #0x20]
00a2d3f8	ldp x24,x23,[sp, #0x10]
00a2d3fc	ldr x25,[sp], #0x50
00a2d400	ret
