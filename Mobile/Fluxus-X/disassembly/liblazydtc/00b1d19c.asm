; X509_PUBKEY_get @ 00b1d19c
00b1d19c	str x19,[sp, #-0x20]!
00b1d1a0	stp x29,x30,[sp, #0x10]
00b1d1a4	add x29,sp,#0x10
00b1d1a8	bl 0x00b1d11c
00b1d1ac	mov x19,x0
00b1d1b0	cbz x0,0x00b1d1f4
00b1d1b4	mov x0,x19
00b1d1b8	bl 0x00c34730
00b1d1bc	cbnz w0,0x00b1d1f4
00b1d1c0	bl 0x00c342a0
00b1d1c4	adrp x0,0x2bc000
00b1d1c8	adrp x2,0x2ce000
00b1d1cc	add x0,x0,#0x79f
00b1d1d0	add x2,x2,#0x5f4
00b1d1d4	mov w1,#0x1d6
00b1d1d8	bl 0x00c342b0
00b1d1dc	mov w1,#0x103
00b1d1e0	mov w0,#0xb
00b1d1e4	movk w1,#0xc, LSL #16
00b1d1e8	mov x2,xzr
00b1d1ec	bl 0x00c342c0
00b1d1f0	mov x19,xzr
00b1d1f4	ldp x29,x30,[sp, #0x10]
00b1d1f8	mov x0,x19
00b1d1fc	ldr x19,[sp], #0x20
00b1d200	ret
