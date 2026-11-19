; ossl_ec_GF2m_simple_point_set_affine_coordinates @ 00a2a144
00a2a144	stp x20,x19,[sp, #-0x20]!
00a2a148	stp x29,x30,[sp, #0x10]
00a2a14c	add x29,sp,#0x10
00a2a150	cbz x2,0x00a2a1c8
00a2a154	mov x20,x3
00a2a158	cbz x3,0x00a2a1c8
00a2a15c	ldr x0,[x1, #0x10]
00a2a160	mov x19,x1
00a2a164	mov x1,x2
00a2a168	bl 0x00c36990
00a2a16c	cbz x0,0x00a2a1fc
00a2a170	ldr x0,[x19, #0x10]
00a2a174	mov w1,wzr
00a2a178	bl 0x00c37f50
00a2a17c	ldr x0,[x19, #0x18]
00a2a180	mov x1,x20
00a2a184	bl 0x00c36990
00a2a188	cbz x0,0x00a2a1fc
00a2a18c	ldr x0,[x19, #0x18]
00a2a190	mov w1,wzr
00a2a194	bl 0x00c37f50
00a2a198	ldr x20,[x19, #0x20]
00a2a19c	bl 0x00c38de0
00a2a1a0	mov x1,x0
00a2a1a4	mov x0,x20
00a2a1a8	bl 0x00c36990
00a2a1ac	cbz x0,0x00a2a1fc
00a2a1b0	ldr x0,[x19, #0x20]
00a2a1b4	mov w1,wzr
00a2a1b8	bl 0x00c37f50
00a2a1bc	mov w0,#0x1
00a2a1c0	str w0,[x19, #0x28]
00a2a1c4	b 0x00a2a1fc
00a2a1c8	bl 0x00c342a0
00a2a1cc	adrp x0,0x29e000
00a2a1d0	adrp x2,0x2cb000
00a2a1d4	add x0,x0,#0x82
00a2a1d8	add x2,x2,#0x81a
00a2a1dc	mov w1,#0x128
00a2a1e0	bl 0x00c342b0
00a2a1e4	mov w1,#0x102
00a2a1e8	mov w0,#0x10
00a2a1ec	movk w1,#0xc, LSL #16
00a2a1f0	mov x2,xzr
00a2a1f4	bl 0x00c342c0
00a2a1f8	mov w0,wzr
00a2a1fc	ldp x29,x30,[sp, #0x10]
00a2a200	ldp x20,x19,[sp], #0x20
00a2a204	ret
