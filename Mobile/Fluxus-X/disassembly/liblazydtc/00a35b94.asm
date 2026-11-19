; ossl_ecdsa_sign_setup @ 00a35b94
00a35b94	ldr x8,[x0, #0x18]
00a35b98	ldr x8,[x8]
00a35b9c	ldr x4,[x8, #0x178]
00a35ba0	cbz x4,0x00a35ba8
00a35ba4	br x4
00a35ba8	stp x29,x30,[sp, #-0x10]!
00a35bac	mov x29,sp
00a35bb0	bl 0x00c342a0
00a35bb4	adrp x0,0x2c9000
00a35bb8	adrp x2,0x2b9000
00a35bbc	add x0,x0,#0x7a8
00a35bc0	add x2,x2,#0xc95
00a35bc4	mov w1,#0x24
00a35bc8	bl 0x00c342b0
00a35bcc	mov w0,#0x10
00a35bd0	mov w1,#0xaa
00a35bd4	mov x2,xzr
00a35bd8	bl 0x00c342c0
00a35bdc	mov w0,wzr
00a35be0	ldp x29,x30,[sp], #0x10
00a35be4	ret
