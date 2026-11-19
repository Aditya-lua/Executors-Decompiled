; ASN1_PCTX_new @ 00abe318
00abe318	stp x29,x30,[sp, #-0x10]!
00abe31c	adrp x1,0x2aa000
00abe320	add x1,x1,#0x858
00abe324	mov w0,#0x28
00abe328	mov w2,#0x27
00abe32c	mov x29,sp
00abe330	bl 0x00c34250
00abe334	cbz x0,0x00abe340
00abe338	ldp x29,x30,[sp], #0x10
00abe33c	ret
00abe340	bl 0x00c342a0
00abe344	adrp x0,0x2aa000
00abe348	adrp x2,0x2a0000
00abe34c	add x0,x0,#0x858
00abe350	add x2,x2,#0xb34
00abe354	mov w1,#0x29
00abe358	bl 0x00c342b0
00abe35c	mov w1,#0x100
00abe360	mov w0,#0xd
00abe364	movk w1,#0xc, LSL #16
00abe368	mov x2,xzr
00abe36c	bl 0x00c342c0
00abe370	mov x0,xzr
00abe374	ldp x29,x30,[sp], #0x10
00abe378	ret
