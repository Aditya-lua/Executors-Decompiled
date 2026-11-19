; ossl_ecdsa_sign_sig @ 00a35be8
00a35be8	ldr x8,[x4, #0x18]
00a35bec	ldr x8,[x8]
00a35bf0	ldr x5,[x8, #0x180]
00a35bf4	cbz x5,0x00a35bfc
00a35bf8	br x5
00a35bfc	stp x29,x30,[sp, #-0x10]!
00a35c00	mov x29,sp
00a35c04	bl 0x00c342a0
00a35c08	adrp x0,0x2c9000
00a35c0c	adrp x2,0x2a0000
00a35c10	add x0,x0,#0x7a8
00a35c14	add x2,x2,#0x106
00a35c18	orr w1,wzr,#0x30
00a35c1c	bl 0x00c342b0
00a35c20	mov w0,#0x10
00a35c24	mov w1,#0xaa
00a35c28	mov x2,xzr
00a35c2c	bl 0x00c342c0
00a35c30	mov x0,xzr
00a35c34	ldp x29,x30,[sp], #0x10
00a35c38	ret
