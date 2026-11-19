; EC_KEY_check_key @ 00a2ecb8
00a2ecb8	stp x29,x30,[sp, #-0x10]!
00a2ecbc	mov x29,sp
00a2ecc0	cbz x0,0x00a2ece8
00a2ecc4	ldr x8,[x0, #0x18]
00a2ecc8	cbz x8,0x00a2ece8
00a2eccc	ldr x9,[x0, #0x20]
00a2ecd0	cbz x9,0x00a2ece8
00a2ecd4	ldr x8,[x8]
00a2ecd8	ldr x1,[x8, #0x150]
00a2ecdc	cbz x1,0x00a2ed28
00a2ece0	ldp x29,x30,[sp], #0x10
00a2ece4	br x1
00a2ece8	bl 0x00c342a0
00a2ecec	adrp x0,0x2b4000
00a2ecf0	adrp x2,0x2c5000
00a2ecf4	add x0,x0,#0x15e
00a2ecf8	add x2,x2,#0x91e
00a2ecfc	mov w1,#0x17f
00a2ed00	bl 0x00c342b0
00a2ed04	mov w8,#0x101
00a2ed08	movk w8,#0xc, LSL #16
00a2ed0c	add w1,w8,#0x1
00a2ed10	mov w0,#0x10
00a2ed14	mov x2,xzr
00a2ed18	bl 0x00c342c0
00a2ed1c	mov w0,wzr
00a2ed20	ldp x29,x30,[sp], #0x10
00a2ed24	ret
00a2ed28	bl 0x00c342a0
00a2ed2c	adrp x0,0x2b4000
00a2ed30	adrp x2,0x2c5000
00a2ed34	add x0,x0,#0x15e
00a2ed38	add x2,x2,#0x91e
00a2ed3c	mov w1,#0x184
00a2ed40	bl 0x00c342b0
00a2ed44	mov w1,#0x101
00a2ed48	mov w0,#0x10
00a2ed4c	movk w1,#0xc, LSL #16
00a2ed50	b 0x00a2ed14
