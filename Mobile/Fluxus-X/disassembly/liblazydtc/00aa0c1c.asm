; ossl_pw_clear_passphrase_data @ 00aa0c1c
00aa0c1c	cbz x0,0x00aa0c78
00aa0c20	str x19,[sp, #-0x20]!
00aa0c24	stp x29,x30,[sp, #0x10]
00aa0c28	ldr w8,[x0]
00aa0c2c	mov x19,x0
00aa0c30	add x29,sp,#0x10
00aa0c34	cmp w8,#0x1
00aa0c38	b.ne 0x00aa0c50
00aa0c3c	ldp x0,x1,[x19, #0x8]
00aa0c40	adrp x2,0x2b0000
00aa0c44	add x2,x2,#0x38e
00aa0c48	mov w3,#0x15
00aa0c4c	bl 0x00c345e0
00aa0c50	ldp x0,x1,[x19, #0x20]
00aa0c54	adrp x2,0x2b0000
00aa0c58	add x2,x2,#0x38e
00aa0c5c	mov w3,#0x1d
00aa0c60	bl 0x00c345e0
00aa0c64	movi v0.2D,#0x0
00aa0c68	stp q0,q0,[x19, #0x10]
00aa0c6c	str q0,[x19]
00aa0c70	ldp x29,x30,[sp, #0x10]
00aa0c74	ldr x19,[sp], #0x20
00aa0c78	ret
