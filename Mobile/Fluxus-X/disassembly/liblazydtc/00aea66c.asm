; OSSL_STORE_INFO_get1_NAME_description @ 00aea66c
00aea66c	stp x29,x30,[sp, #-0x10]!
00aea670	ldr w8,[x0]
00aea674	mov x29,sp
00aea678	cmp w8,#0x1
00aea67c	b.ne 0x00aea6b0
00aea680	ldr x8,[x0, #0x10]
00aea684	adrp x9,0x2ab000
00aea688	add x9,x9,#0x32c
00aea68c	adrp x1,0x2c2000
00aea690	cmp x8,#0x0
00aea694	csel x0,x9,x8,eq
00aea698	add x1,x1,#0x3bd
00aea69c	mov w2,#0x29f
00aea6a0	bl 0x00c34600
00aea6a4	cbz x0,0x00aea6d8
00aea6a8	ldp x29,x30,[sp], #0x10
00aea6ac	ret
00aea6b0	bl 0x00c342a0
00aea6b4	adrp x0,0x2c2000
00aea6b8	adrp x2,0x2dc000
00aea6bc	add x0,x0,#0x3bd
00aea6c0	add x2,x2,#0x995
00aea6c4	mov w1,#0x2a5
00aea6c8	bl 0x00c342b0
00aea6cc	mov w0,#0x2c
00aea6d0	mov w1,#0x67
00aea6d4	b 0x00aea700
00aea6d8	bl 0x00c342a0
00aea6dc	adrp x0,0x2c2000
00aea6e0	adrp x2,0x2dc000
00aea6e4	add x0,x0,#0x3bd
00aea6e8	add x2,x2,#0x995
00aea6ec	mov w1,#0x2a2
00aea6f0	bl 0x00c342b0
00aea6f4	mov w1,#0x100
00aea6f8	mov w0,#0x2c
00aea6fc	movk w1,#0xc, LSL #16
00aea700	mov x2,xzr
00aea704	bl 0x00c342c0
00aea708	mov x0,xzr
00aea70c	ldp x29,x30,[sp], #0x10
00aea710	ret
