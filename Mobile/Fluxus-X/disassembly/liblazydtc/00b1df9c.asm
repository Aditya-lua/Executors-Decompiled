; ossl_i2d_X25519_PUBKEY @ 00b1df9c
00b1df9c	str x21,[sp, #-0x30]!
00b1dfa0	stp x20,x19,[sp, #0x10]
00b1dfa4	stp x29,x30,[sp, #0x20]
00b1dfa8	add x29,sp,#0x20
00b1dfac	cbz x0,0x00b1e028
00b1dfb0	mov x19,x1
00b1dfb4	mov x21,x0
00b1dfb8	bl 0x00c36450
00b1dfbc	cbz x0,0x00b1dff4
00b1dfc0	mov w1,#0x40a
00b1dfc4	mov x2,x21
00b1dfc8	mov x20,x0
00b1dfcc	bl 0x00c39b70
00b1dfd0	mov x0,x20
00b1dfd4	mov x1,x19
00b1dfd8	bl 0x00b1d40c
00b1dfdc	mov w19,w0
00b1dfe0	mov x0,x20
00b1dfe4	str xzr,[x20, #0x20]
00b1dfe8	bl 0x00c32450
00b1dfec	mov w0,w19
00b1dff0	b 0x00b1e028
00b1dff4	bl 0x00c342a0
00b1dff8	adrp x0,0x2bc000
00b1dffc	adrp x2,0x2b0000
00b1e000	add x0,x0,#0x79f
00b1e004	add x2,x2,#0xad0
00b1e008	mov w1,#0x3b6
00b1e00c	bl 0x00c342b0
00b1e010	mov w1,#0x100
00b1e014	mov w0,#0xd
00b1e018	movk w1,#0xc, LSL #16
00b1e01c	mov x2,xzr
00b1e020	bl 0x00c342c0
00b1e024	mov w0,#0xffffffff
00b1e028	ldp x29,x30,[sp, #0x20]
00b1e02c	ldp x20,x19,[sp, #0x10]
00b1e030	ldr x21,[sp], #0x30
00b1e034	ret
