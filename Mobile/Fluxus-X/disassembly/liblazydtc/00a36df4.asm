; ECDSA_sign @ 00a36df4
00a36df4	ldr x8,[x5]
00a36df8	ldr x8,[x8, #0x50]
00a36dfc	cbz x8,0x00a36e10
00a36e00	mov x7,x5
00a36e04	mov x5,xzr
00a36e08	mov x6,xzr
00a36e0c	br x8
00a36e10	stp x29,x30,[sp, #-0x10]!
00a36e14	mov x29,sp
00a36e18	bl 0x00c342a0
00a36e1c	adrp x0,0x2aa000
00a36e20	adrp x2,0x2ad000
00a36e24	add x0,x0,#0xe3
00a36e28	add x2,x2,#0xb58
00a36e2c	mov w1,#0x2f
00a36e30	bl 0x00c342b0
00a36e34	mov w0,#0x10
00a36e38	mov w1,#0x98
00a36e3c	mov x2,xzr
00a36e40	bl 0x00c342c0
00a36e44	mov w0,wzr
00a36e48	ldp x29,x30,[sp], #0x10
00a36e4c	ret
