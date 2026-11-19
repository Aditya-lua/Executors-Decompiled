; X509_PUBKEY_get0 @ 00b1d11c
00b1d11c	stp x29,x30,[sp, #-0x10]!
00b1d120	mov x29,sp
00b1d124	cbz x0,0x00b1d138
00b1d128	ldr x0,[x0, #0x10]
00b1d12c	cbz x0,0x00b1d164
00b1d130	ldp x29,x30,[sp], #0x10
00b1d134	ret
00b1d138	bl 0x00c342a0
00b1d13c	adrp x0,0x2bc000
00b1d140	adrp x2,0x2d4000
00b1d144	add x0,x0,#0x79f
00b1d148	add x2,x2,#0x680
00b1d14c	mov w1,#0x1c4
00b1d150	bl 0x00c342b0
00b1d154	mov w1,#0x102
00b1d158	mov w0,#0xb
00b1d15c	movk w1,#0xc, LSL #16
00b1d160	b 0x00b1d188
00b1d164	bl 0x00c342a0
00b1d168	adrp x0,0x2bc000
00b1d16c	adrp x2,0x2d4000
00b1d170	add x0,x0,#0x79f
00b1d174	add x2,x2,#0x680
00b1d178	mov w1,#0x1ca
00b1d17c	bl 0x00c342b0
00b1d180	orr w0,wzr,#0x6
00b1d184	mov w1,#0x72
00b1d188	mov x2,xzr
00b1d18c	bl 0x00c342c0
00b1d190	mov x0,xzr
00b1d194	ldp x29,x30,[sp], #0x10
00b1d198	ret
