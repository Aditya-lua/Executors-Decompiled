; X509_CRL_sign_ctx @ 00b15b44
00b15b44	stp x20,x19,[sp, #-0x20]!
00b15b48	stp x29,x30,[sp, #0x10]
00b15b4c	add x29,sp,#0x10
00b15b50	cbz x0,0x00b15b88
00b15b54	mov w8,#0x1
00b15b58	mov x19,x1
00b15b5c	mov x20,x0
00b15b60	str w8,[x0, #0x50]
00b15b64	bl 0x00c40ed0
00b15b68	ldp x29,x30,[sp, #0x10]
00b15b6c	add x1,x20,#0x8
00b15b70	add x2,x20,#0x58
00b15b74	add x3,x20,#0x68
00b15b78	mov x4,x20
00b15b7c	mov x5,x19
00b15b80	ldp x20,x19,[sp], #0x20
00b15b84	b 0x00c377d0
00b15b88	bl 0x00c342a0
00b15b8c	adrp x0,0x2c4000
00b15b90	adrp x2,0x2ae000
00b15b94	add x0,x0,#0x3b5
00b15b98	add x2,x2,#0x833
00b15b9c	mov w1,#0x97
00b15ba0	bl 0x00c342b0
00b15ba4	mov w1,#0x102
00b15ba8	mov w0,#0xb
00b15bac	movk w1,#0xc, LSL #16
00b15bb0	mov x2,xzr
00b15bb4	bl 0x00c342c0
00b15bb8	ldp x29,x30,[sp, #0x10]
00b15bbc	mov w0,wzr
00b15bc0	ldp x20,x19,[sp], #0x20
00b15bc4	ret
