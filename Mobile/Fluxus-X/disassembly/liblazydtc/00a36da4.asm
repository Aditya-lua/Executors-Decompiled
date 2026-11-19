; ECDSA_do_sign_ex @ 00a36da4
00a36da4	ldr x8,[x4]
00a36da8	ldr x5,[x8, #0x60]
00a36dac	cbz x5,0x00a36db4
00a36db0	br x5
00a36db4	stp x29,x30,[sp, #-0x10]!
00a36db8	mov x29,sp
00a36dbc	bl 0x00c342a0
00a36dc0	adrp x0,0x2aa000
00a36dc4	adrp x2,0x2d1000
00a36dc8	add x0,x0,#0xe3
00a36dcc	add x2,x2,#0x89d
00a36dd0	orr w1,wzr,#0x1f
00a36dd4	bl 0x00c342b0
00a36dd8	mov w0,#0x10
00a36ddc	mov w1,#0x98
00a36de0	mov x2,xzr
00a36de4	bl 0x00c342c0
00a36de8	mov x0,xzr
00a36dec	ldp x29,x30,[sp], #0x10
00a36df0	ret
