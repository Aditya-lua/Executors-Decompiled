; ossl_i2d_DH_PUBKEY @ 00b1d768
00b1d768	str x21,[sp, #-0x30]!
00b1d76c	stp x20,x19,[sp, #0x10]
00b1d770	stp x29,x30,[sp, #0x20]
00b1d774	add x29,sp,#0x20
00b1d778	cbz x0,0x00b1d7f4
00b1d77c	mov x19,x1
00b1d780	mov x21,x0
00b1d784	bl 0x00c36450
00b1d788	cbz x0,0x00b1d7c0
00b1d78c	orr w1,wzr,#0x1c
00b1d790	mov x2,x21
00b1d794	mov x20,x0
00b1d798	bl 0x00c39b70
00b1d79c	mov x0,x20
00b1d7a0	mov x1,x19
00b1d7a4	bl 0x00b1d40c
00b1d7a8	mov w19,w0
00b1d7ac	mov x0,x20
00b1d7b0	str xzr,[x20, #0x20]
00b1d7b4	bl 0x00c32450
00b1d7b8	mov w0,w19
00b1d7bc	b 0x00b1d7f4
00b1d7c0	bl 0x00c342a0
00b1d7c4	adrp x0,0x2bc000
00b1d7c8	adrp x2,0x2d6000
00b1d7cc	add x0,x0,#0x79f
00b1d7d0	add x2,x2,#0x88d
00b1d7d4	mov w1,#0x2a1
00b1d7d8	bl 0x00c342b0
00b1d7dc	mov w1,#0x100
00b1d7e0	mov w0,#0xd
00b1d7e4	movk w1,#0xc, LSL #16
00b1d7e8	mov x2,xzr
00b1d7ec	bl 0x00c342c0
00b1d7f0	mov w0,#0xffffffff
00b1d7f4	ldp x29,x30,[sp, #0x20]
00b1d7f8	ldp x20,x19,[sp, #0x10]
00b1d7fc	ldr x21,[sp], #0x30
00b1d800	ret
