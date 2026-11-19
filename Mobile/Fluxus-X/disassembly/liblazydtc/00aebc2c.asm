; OSSL_STORE_LOADER_new @ 00aebc2c
00aebc2c	stp x20,x19,[sp, #-0x20]!
00aebc30	stp x29,x30,[sp, #0x10]
00aebc34	add x29,sp,#0x10
00aebc38	cbz x1,0x00aebc64
00aebc3c	mov x19,x1
00aebc40	adrp x1,0x2bc000
00aebc44	mov x20,x0
00aebc48	add x1,x1,#0x4ea
00aebc4c	mov w0,#0xd0
00aebc50	mov w2,#0x2e
00aebc54	bl 0x00c34250
00aebc58	cbz x0,0x00aebc8c
00aebc5c	stp x19,x20,[x0]
00aebc60	b 0x00aebcc0
00aebc64	bl 0x00c342a0
00aebc68	adrp x0,0x2bc000
00aebc6c	adrp x2,0x2c2000
00aebc70	add x0,x0,#0x4ea
00aebc74	add x2,x2,#0x3e6
00aebc78	mov w1,#0x2a
00aebc7c	bl 0x00c342b0
00aebc80	mov w0,#0x2c
00aebc84	mov w1,#0x6a
00aebc88	b 0x00aebcb4
00aebc8c	bl 0x00c342a0
00aebc90	adrp x0,0x2bc000
00aebc94	adrp x2,0x2c2000
00aebc98	add x0,x0,#0x4ea
00aebc9c	add x2,x2,#0x3e6
00aebca0	mov w1,#0x2f
00aebca4	bl 0x00c342b0
00aebca8	mov w1,#0x100
00aebcac	mov w0,#0x2c
00aebcb0	movk w1,#0xc, LSL #16
00aebcb4	mov x2,xzr
00aebcb8	bl 0x00c342c0
00aebcbc	mov x0,xzr
00aebcc0	ldp x29,x30,[sp, #0x10]
00aebcc4	ldp x20,x19,[sp], #0x20
00aebcc8	ret
