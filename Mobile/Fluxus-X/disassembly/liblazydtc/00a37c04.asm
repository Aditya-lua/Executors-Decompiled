; ossl_ec_GFp_mont_field_encode @ 00a37c04
00a37c04	ldr x8,[x0, #0x78]
00a37c08	cbz x8,0x00a37c1c
00a37c0c	mov x0,x1
00a37c10	mov x1,x2
00a37c14	mov x2,x8
00a37c18	b 0x00c38dd0
00a37c1c	stp x29,x30,[sp, #-0x10]!
00a37c20	mov x29,sp
00a37c24	bl 0x00c342a0
00a37c28	adrp x0,0x2bf000
00a37c2c	adrp x2,0x2b4000
00a37c30	add x0,x0,#0xbb4
00a37c34	add x2,x2,#0x1b1
00a37c38	mov w1,#0x10f
00a37c3c	bl 0x00c342b0
00a37c40	mov w0,#0x10
00a37c44	mov w1,#0x6f
00a37c48	mov x2,xzr
00a37c4c	bl 0x00c342c0
00a37c50	mov w0,wzr
00a37c54	ldp x29,x30,[sp], #0x10
00a37c58	ret
