; ECDSA_sign_setup @ 00a36ea0
00a36ea0	ldr x8,[x0]
00a36ea4	ldr x4,[x8, #0x58]
00a36ea8	cbz x4,0x00a36eb0
00a36eac	br x4
00a36eb0	stp x29,x30,[sp, #-0x10]!
00a36eb4	mov x29,sp
00a36eb8	bl 0x00c342a0
00a36ebc	adrp x0,0x2aa000
00a36ec0	adrp x2,0x29e000
00a36ec4	add x0,x0,#0xe3
00a36ec8	add x2,x2,#0xe3
00a36ecc	orr w1,wzr,#0x38
00a36ed0	bl 0x00c342b0
00a36ed4	mov w0,#0x10
00a36ed8	mov w1,#0x98
00a36edc	mov x2,xzr
00a36ee0	bl 0x00c342c0
00a36ee4	mov w0,wzr
00a36ee8	ldp x29,x30,[sp], #0x10
00a36eec	ret
